package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes15.dex */
public class VAR extends Handler {
    public final /* synthetic */ VAJ LIZ;

    public final void LIZ() {
        C79311VAt c79311VAt;
        VAJ vaj = this.LIZ;
        if (vaj.LJJIJ) {
            return;
        }
        synchronized (vaj.LJJJI) {
            if (this.LIZ.LJJJIL.size() > 0) {
                c79311VAt = this.LIZ.LJJJIL.get(0);
                if (c79311VAt.LJLIL.longValue() > SystemClock.uptimeMillis()) {
                    C46496IMq.LJ();
                } else {
                    this.LIZ.LJJJIL.remove(0);
                }
            }
            c79311VAt = null;
        }
        if (c79311VAt != null) {
            Bundle bundle = c79311VAt.LJLILLLLZI;
            if (bundle == null) {
                C46496IMq.LJ();
                return;
            }
            int i = bundle.getInt("mpd_update_count", 0) + 1;
            String string = bundle.getString("url");
            String string2 = bundle.getString("sdkParams");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updating mpd failed, url: ");
                LIZ.append(string);
                LIZ.append(" sdkParams: ");
                LIZ.append(string2);
                X1D.LIZIZ(LIZ);
                C46496IMq.LJ();
                return;
            }
            bundle.putInt("mpd_updating", 1);
            bundle.putInt("mpd_update_count", i);
            VAJ vaj2 = this.LIZ;
            vaj2.LJJIJ = true;
            int LIZIZ = vaj2.LIZJ.LIZIZ(vaj2.LIZLLL, string, string2, bundle);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("invoke mpd updating preload : ");
            LIZ2.append(LIZIZ);
            LIZ2.append(" count: ");
            LIZ2.append(i);
            X1D.LIZIZ(LIZ2);
            C46496IMq.LIZ();
            if (LIZIZ == 0) {
                return;
            }
            this.LIZ.LJJIJ = false;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("mpd updating preload failed, error: ");
            LIZ3.append(LIZIZ);
            X1D.LIZIZ(LIZ3);
            C46496IMq.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r10) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAR.handleMessage(android.os.Message):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VAR(VAJ vaj, Looper looper) {
        super(looper);
        this.LIZ = vaj;
    }
}
