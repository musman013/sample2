package com.nfinity.ll.testapp1.application.authorization.permission;

import com.nfinity.ll.testapp1.application.authorization.permission.dto.*;
import com.nfinity.ll.testapp1.domain.model.PermissionEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {

     PermissionEntity createPermissionInputToPermissionEntity(CreatePermissionInput permissionDto);
   
     CreatePermissionOutput permissionEntityToCreatePermissionOutput(PermissionEntity entity);

     PermissionEntity updatePermissionInputToPermissionEntity(UpdatePermissionInput permissionDto);

     UpdatePermissionOutput permissionEntityToUpdatePermissionOutput(PermissionEntity entity);

     FindPermissionByIdOutput permissionEntityToFindPermissionByIdOutput(PermissionEntity entity);

     FindPermissionByNameOutput permissionEntityToFindPermissionByNameOutput(PermissionEntity entity);
   
}