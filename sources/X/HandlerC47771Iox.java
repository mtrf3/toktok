package X;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: X.Iox, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC47771Iox extends Handler {
    public final WeakReference<C47780Ip6> LIZ;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r2.equals("dash") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r2.equals("mpd") == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC47771Iox.handleMessage(android.os.Message):void");
    }

    public HandlerC47771Iox(C47780Ip6 c47780Ip6, Looper looper) {
        super(looper);
        this.LIZ = new WeakReference<>(c47780Ip6);
    }
}
