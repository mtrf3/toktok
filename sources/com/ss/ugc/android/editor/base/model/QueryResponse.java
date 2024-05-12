package com.ss.ugc.android.editor.base.model;

import X.InterfaceC65349Pkn;
import com.ss.ugc.android.editor.base.network.BaseHttpResponseBean;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes7.dex */
public final class QueryResponse extends BaseHttpResponseBean<List<Object>> implements Serializable {

    @InterfaceC65349Pkn("utterances")
    public final List<Object> data;
    public final Double duration;
    public final String id;

    @Override // com.ss.ugc.android.editor.base.network.BaseHttpResponseBean
    public String getHttpCode() {
        String code = getCode();
        if (code == null) {
            return "";
        }
        return code;
    }

    @Override // com.ss.ugc.android.editor.base.network.BaseHttpResponseBean
    public String getHttpMessage() {
        String message = getMessage();
        if (message == null) {
            return "";
        }
        return message;
    }

    public final Double getDuration() {
        return this.duration;
    }

    @Override // com.ss.ugc.android.editor.base.network.BaseHttpResponseBean
    public List<Object> getData() {
        return this.data;
    }
}
