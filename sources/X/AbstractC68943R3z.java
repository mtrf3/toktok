package X;

import X.R40;
import X.R74;
import android.text.TextUtils;

/* renamed from: X.R3z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68943R3z<T extends R40<K>, K extends R74> extends AbstractC67055QTj<T> {
    @Override // X.AbstractC67055QTj
    public final String getCaptchaInfo(QQI qqi) {
        T t;
        R40 r40 = (R40) qqi;
        if (r40 == null || (t = r40.LJIIIZ) == 0) {
            return null;
        }
        return t.LIZLLL;
    }

    @Override // X.AbstractC67055QTj
    public final boolean needShowCaptcha(QQI qqi) {
        T t;
        int i;
        R40 r40 = (R40) qqi;
        if (r40 == null || (t = r40.LJIIIZ) == 0 || (i = t.LIZ) <= 1100 || i >= 1199) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC67055QTj
    public final boolean needShowPicCaptcha(QQI qqi) {
        T t;
        int i;
        R40 r40 = (R40) qqi;
        if (r40 == null || (t = r40.LJIIIZ) == 0 || (((i = t.LIZ) != 1101 && i != 1102 && i != 1103) || TextUtils.isEmpty(t.LIZLLL))) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC67055QTj
    public final boolean needShowSecureCaptcha(QQI qqi) {
        T t;
        int i;
        R40 r40 = (R40) qqi;
        if (r40 == null || (t = r40.LJIIIZ) == 0 || ((i = t.LIZ) != 1104 && i != 1105)) {
            return false;
        }
        return true;
    }
}
