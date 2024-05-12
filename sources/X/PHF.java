package X;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class PHF {
    public PHH LIZ;
    public String LIZIZ;

    public final long LIZ() {
        return this.LIZ.LJJI();
    }

    public final void LIZIZ() {
        String str;
        if (!C09970aH.LJIIJJI) {
            str = "dummy";
        } else if (Build.VERSION.SDK_INT >= 28) {
            str = "new";
        } else {
            str = "old";
        }
        if (!TextUtils.equals(str, this.LIZIZ)) {
            this.LIZIZ = str;
            switch (str.hashCode()) {
                case -897048717:
                    if (str.equals("socket")) {
                        this.LIZ = new C64174PGo();
                        break;
                    }
                    break;
                case 108960:
                    if (str.equals("new")) {
                        this.LIZ = new C64234PIw();
                        break;
                    }
                    break;
                case 110119:
                    if (str.equals("old")) {
                        this.LIZ = new FQQ();
                        break;
                    }
                    break;
                case 95945896:
                    if (str.equals("dummy")) {
                        this.LIZ = new C72083SQt();
                        break;
                    }
                    break;
            }
            this.LIZ.init();
            if (C09970aH.LJII()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("TrafficStatsImpl: ");
                LIZ.append(this.LIZ.getClass().getName());
                X1D.LIZIZ(LIZ);
            }
        }
    }

    public PHF() {
        LIZIZ();
    }
}
