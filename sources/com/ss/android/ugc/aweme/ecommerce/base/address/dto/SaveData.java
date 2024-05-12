package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import java.util.List;

/* loaded from: classes5.dex */
public final class SaveData {

    @InterfaceC65349Pkn("da_info")
    public final String dataInfo;

    @InterfaceC65349Pkn("errors")
    public final List<Error> errors;

    @InterfaceC65349Pkn("exception_ux")
    public final ExceptionUX exceptionUX;

    @InterfaceC65349Pkn("id")
    public final String id;

    public SaveData(String str, List<Error> list, ExceptionUX exceptionUX, String str2) {
        this.id = str;
        this.errors = list;
        this.exceptionUX = exceptionUX;
        this.dataInfo = str2;
    }
}
