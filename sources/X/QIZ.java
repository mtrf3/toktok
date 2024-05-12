package X;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class QIZ {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final Context LJFF;
    public final C64490PSs LJI = new C64490PSs(this);

    public QIZ(QIE qie) {
        String str;
        this.LJFF = qie.LJIIIIZZ;
        this.LIZ = qie.LJIIJJI;
        if (TextUtils.isEmpty(qie.LJIIL)) {
            str = "";
        } else {
            str = qie.LJIIL;
        }
        this.LIZIZ = str;
        this.LIZJ = qie.LJIILIIL;
        this.LIZLLL = qie.LJIILJJIL;
        this.LJ = qie.LJIILL;
    }
}
