package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MergedTemplateListResponseWrapper extends F9E {

    @InterfaceC65349Pkn("data")
    public final MergedTemplateListResponse data;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("code")
    public final int status;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.status), this.message, this.data};
    }

    public MergedTemplateListResponseWrapper(int i, String message, MergedTemplateListResponse data) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(data, "data");
        this.status = i;
        this.message = message;
        this.data = data;
    }

    public /* synthetic */ MergedTemplateListResponseWrapper(int i, String str, MergedTemplateListResponse mergedTemplateListResponse, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, mergedTemplateListResponse);
    }
}
