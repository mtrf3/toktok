package X;

import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MJU {
    public final MJO LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public abstract void LIZIZ(C50764Jw8<TypeWords> c50764Jw8);

    public void LIZJ() {
        this.LIZIZ = false;
    }

    public void LIZLLL() {
        this.LIZIZ = true;
    }

    public void LJ() {
        this.LIZIZ = true;
    }

    public void LJFF() {
        this.LIZIZ = false;
    }

    public void LJI() {
        this.LIZIZ = false;
    }

    public MJU(MJO param) {
        o.LJIIIZ(param, "param");
        this.LIZ = param;
    }

    public void LJII(boolean z) {
        this.LIZIZ = z;
    }
}
