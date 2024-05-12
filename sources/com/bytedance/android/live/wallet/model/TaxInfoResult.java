package com.bytedance.android.live.wallet.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public final class TaxInfoResult {

    @InterfaceC65349Pkn("error")
    public Status status;

    @InterfaceC65349Pkn("w9")
    public W9 w9;

    /* loaded from: classes7.dex */
    public static final class Status {

        @InterfaceC65349Pkn("code")
        public int code;

        @InterfaceC65349Pkn("message")
        public String message = "";
    }

    /* loaded from: classes7.dex */
    public static final class W9 {

        @InterfaceC65349Pkn("status")
        public int status;
    }
}
