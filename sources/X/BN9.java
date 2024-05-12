package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* loaded from: classes6.dex */
public final class BN9 extends OrientationEventListener {
    public BN9(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
    
        if (r4 < 190) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
    
        if (r4 < 100) goto L19;
     */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOrientationChanged(int r4) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L4
            return
        L4:
            r0 = 350(0x15e, float:4.9E-43)
            r2 = 1
            if (r4 > r0) goto L16
            r0 = 10
            if (r4 < r0) goto L16
            r0 = 171(0xab, float:2.4E-43)
            r1 = 0
            if (r0 > r4) goto L1c
            r0 = 190(0xbe, float:2.66E-43)
            if (r4 >= r0) goto L2a
        L16:
            com.bytedance.android.livesdk.chatroom.helper.AudienceOrientationManager r0 = com.bytedance.android.livesdk.chatroom.helper.AudienceOrientationManager.LIZ
            r0.LIZ(r2)
        L1b:
            return
        L1c:
            r0 = 81
            if (r0 > r4) goto L1b
            r0 = 100
            if (r4 >= r0) goto L2a
        L24:
            com.bytedance.android.livesdk.chatroom.helper.AudienceOrientationManager r0 = com.bytedance.android.livesdk.chatroom.helper.AudienceOrientationManager.LIZ
            r0.LIZ(r1)
            goto L1b
        L2a:
            r0 = 261(0x105, float:3.66E-43)
            if (r0 > r4) goto L1b
            r0 = 280(0x118, float:3.92E-43)
            if (r4 >= r0) goto L1b
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BN9.onOrientationChanged(int):void");
    }
}
