package com.nfinity.ll.testapp1.application.authorization.role;

import com.nfinity.ll.testapp1.application.authorization.role.dto.*;
import com.nfinity.ll.testapp1.domain.model.PermissionEntity;
import com.nfinity.ll.testapp1.domain.model.RoleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleEntity createRoleInputToRoleEntity(CreateRoleInput roleDto);

    CreateRoleOutput roleEntityToCreateRoleOutput(RoleEntity entity);

    RoleEntity updateRoleInputToRoleEntity(UpdateRoleInput roleDto);

    UpdateRoleOutput roleEntityToUpdateRoleOutput(RoleEntity entity);

    FindRoleByIdOutput roleEntityToFindRoleByIdOutput(RoleEntity entity);
    
    FindRoleByNameOutput roleEntityToFindRoleByNameOutput(RoleEntity entity);

}
