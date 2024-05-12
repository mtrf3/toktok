package X;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.QaW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerC67260QaW extends HandlerC67272Qai {
    public final Context LIZ;
    public final /* synthetic */ GoogleApiAvailability LIZIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int LLLLLZIL = C16880lQ.LLLLLZIL(this.LIZIZ, this.LIZ);
        if (this.LIZIZ.isUserResolvableError(LLLLLZIL)) {
            this.LIZIZ.showErrorNotification(this.LIZ, LLLLLZIL);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HandlerC67260QaW(com.google.android.gms.common.GoogleApiAvailability r2, android.content.Context r3) {
        /*
            r1 = this;
            r1.LIZIZ = r2
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L16
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
        Lc:
            r1.<init>(r0)
            android.content.Context r0 = X.C16880lQ.LLLLL(r3)
            r1.LIZ = r0
            return
        L16:
            android.os.Looper r0 = android.os.Looper.myLooper()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC67260QaW.<init>(com.google.android.gms.common.GoogleApiAvailability, android.content.Context):void");
    }
}
