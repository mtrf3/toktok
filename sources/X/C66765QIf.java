package X;

import android.content.Context;
import com.bytedance.bdinstall.BDInstallProvider;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.QIf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66765QIf implements InterfaceC66835QKx {
    public static final java.util.Map<String, C66765QIf> LJIIIIZZ = new ConcurrentHashMap();
    public volatile QIF LIZ;
    public volatile QJW LIZIZ;
    public final C66800QJo LIZJ = new C66800QJo();
    public final C66804QJs LIZLLL = new C66804QJs(this);
    public final C66766QIg LJII = new C66766QIg();
    public final QJX LJ = new QJX(this);
    public final C66774QIo LJFF = new C66774QIo();
    public final C66811QJz LJI = new C66811QJz();

    public final boolean LIZIZ() {
        if (this == C66795QJj.LIZIZ || this.LIZ != null) {
            return true;
        }
        return false;
    }

    public final Integer LIZJ() {
        if (this.LIZ != null) {
            return Integer.valueOf(this.LIZ.LIZ);
        }
        if (this.LIZIZ != null) {
            return Integer.valueOf(((C66784QIy) this.LIZIZ).LIZ.getAid());
        }
        return null;
    }

    public final Context LIZLLL() {
        if (this.LIZ != null && this.LIZ.LIZJ != null) {
            return this.LIZ.LIZJ;
        }
        if (this.LIZIZ != null && ((C66784QIy) this.LIZIZ).LIZ.getContext() != null) {
            return ((C66784QIy) this.LIZIZ).LIZ.getContext();
        }
        return BDInstallProvider.LJLJJI;
    }

    public final C66799QJn LJ() {
        if (this.LIZ == null || this.LIZ.LIZJ == null) {
            Context LIZLLL = LIZLLL();
            if (LIZLLL == null) {
                return null;
            }
            return this.LJII.LIZIZ(LIZLLL);
        }
        return this.LIZLLL.LIZIZ(this.LIZ.LIZJ).LJ();
    }

    public static C66765QIf LJFF(String str) {
        return (C66765QIf) ((ConcurrentHashMap) LJIIIIZZ).get(str);
    }

    public final void LIZ(boolean z, QJU qju) {
        this.LJI.LIZIZ(z, new QJS(qju));
    }

    public final C66765QIf LJI(QIF qif, C48852JFg c48852JFg) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LJIIIIZZ;
        if (!concurrentHashMap.containsKey(String.valueOf(qif.LIZ))) {
            concurrentHashMap.put(String.valueOf(qif.LIZ), this);
            if (this == C66795QJj.LIZIZ) {
                z = true;
            } else {
                z = false;
            }
            qif.LJJIIZI = z;
            this.LIZ = qif;
            this.LIZLLL.LIZIZ(qif.LIZJ).LIZJ(qif, c48852JFg);
        }
        return this;
    }

    public final void LJII(Context context, C48852JFg c48852JFg, long j, InterfaceC66818QKg interfaceC66818QKg) {
        Context LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        this.LIZLLL.LIZIZ(LIZLLL).LJI(c48852JFg, j, interfaceC66818QKg);
    }
}
