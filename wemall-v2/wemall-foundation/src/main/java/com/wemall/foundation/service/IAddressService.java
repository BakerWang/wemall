package com.wemall.foundation.service;

import com.wemall.core.query.support.IPageList;
import com.wemall.core.query.support.IQueryObject;
import com.wemall.foundation.domain.Address;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IAddressService {
    public abstract boolean save(Address paramAddress);

    public abstract Address getObjById(Long paramLong);

    public abstract boolean delete(Long paramLong);

    public abstract boolean batchDelete(List<Serializable> paramList);

    public abstract IPageList list(IQueryObject paramIQueryObject);

    public abstract boolean update(Address paramAddress);

    public abstract List<Address> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



