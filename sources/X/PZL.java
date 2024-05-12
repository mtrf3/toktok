package X;

import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class PZL {
    public boolean LIZ;
    public String LIZIZ;

    public /* synthetic */ PZL() {
    }

    public /* synthetic */ PZL(int i) {
        this.LIZ = true;
        this.LIZIZ = null;
    }

    public final void LIZ(String str) {
        if (this.LIZ && TextUtils.equals(this.LIZIZ, str)) {
            PZM pzm = PZN.LIZ;
            if (pzm.LIZIZ.decrementAndGet() == 0) {
                pzm.LIZJ.sendEmptyMessage(2);
            }
            this.LIZ = false;
        }
    }
}
