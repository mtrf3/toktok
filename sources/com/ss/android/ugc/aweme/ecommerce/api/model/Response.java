package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C28038AzS;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public class Response<T> {
    public static final C28038AzS Companion = new C28038AzS();

    @InterfaceC65349Pkn("chunk_index")
    public final Integer chunkIndex;

    @InterfaceC65349Pkn("code")
    public final int code;

    @InterfaceC65349Pkn("data")
    public final T data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public Response() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean isAlreadyPaid() {
        if (this.code == 10007302) {
            return true;
        }
        return false;
    }

    public final boolean isClaimOverdue() {
        if (this.code == 23005101) {
            return true;
        }
        return false;
    }

    public final boolean isCodeOK() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

    public Response(int i, String str, T t, Integer num) {
        this.code = i;
        this.message = str;
        this.data = t;
        this.chunkIndex = num;
    }

    public /* synthetic */ Response(int i, String str, Object obj, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : obj, (i2 & 8) != 0 ? null : num);
    }
}
