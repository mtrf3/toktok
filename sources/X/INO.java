package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.session.Session;

/* loaded from: classes9.dex */
public final class INO {
    public static final INO LIZJ = new INO();
    public OHZ LIZ;
    public final INP LIZIZ = new INP();

    public final INN LIZ(String str) {
        Session LIZIZ;
        INN inn = null;
        if (TextUtils.isEmpty(str) || (LIZIZ = C46664ITc.LJIJ.LIZIZ(str)) == null) {
            return null;
        }
        INN inn2 = LIZIZ.state;
        if (inn2 == null) {
            synchronized (this) {
                if (LIZIZ.state == null) {
                    inn = new INN();
                    LIZIZ.state = inn;
                }
            }
            return inn;
        }
        return inn2;
    }
}
