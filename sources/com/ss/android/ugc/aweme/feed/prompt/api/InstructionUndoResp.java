package com.ss.android.ugc.aweme.feed.prompt.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InstructionUndoResp extends F9E {

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    /* JADX WARN: Multi-variable type inference failed */
    public InstructionUndoResp() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.statusMsg};
    }

    public InstructionUndoResp(int i, String statusMsg) {
        o.LJIIIZ(statusMsg, "statusMsg");
        this.statusCode = i;
        this.statusMsg = statusMsg;
    }

    public /* synthetic */ InstructionUndoResp(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str);
    }
}
