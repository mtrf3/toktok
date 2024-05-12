package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class StartDrawGuessResponse extends F9E {

    @InterfaceC65349Pkn("pictionary_id")
    public final long pictionaryId;

    @InterfaceC65349Pkn("session_id")
    public final long sessionId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StartDrawGuessResponse() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.drawguess.network.StartDrawGuessResponse.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.pictionaryId), Long.valueOf(this.sessionId)};
    }

    public StartDrawGuessResponse(long j, long j2) {
        this.pictionaryId = j;
        this.sessionId = j2;
    }

    public /* synthetic */ StartDrawGuessResponse(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }
}
