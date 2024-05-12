package com.ss.android.ugc.aweme.cct;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdCCTLogModel implements Serializable {

    @InterfaceC65349Pkn("is_from_jsb")
    public boolean isFromJSB;

    @InterfaceC65349Pkn("refer")
    public String refer;

    @InterfaceC65349Pkn("session_id")
    public String sessionId;

    /* JADX WARN: Multi-variable type inference failed */
    public AdCCTLogModel() {
        this(null, 0 == true ? 1 : 0, false, 7, 0 == true ? 1 : 0);
    }

    public final String getRefer() {
        return this.refer;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean isFromJSB() {
        return this.isFromJSB;
    }

    public final void setFromJSB(boolean z) {
        this.isFromJSB = z;
    }

    public final void setRefer(String str) {
        this.refer = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public AdCCTLogModel(String str, String str2, boolean z) {
        this.refer = str;
        this.sessionId = str2;
        this.isFromJSB = z;
    }

    public /* synthetic */ AdCCTLogModel(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
