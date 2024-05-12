package X;

import Y.IDrS47S0100000_8;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.JQv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49153JQv {
    public final RecyclerView LIZ;
    public final java.util.Set<AbstractC49155JQx> LIZIZ;
    public AbstractC49155JQx LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final InterfaceC49157JQz LJI;
    public final JR0 LJII;
    public InterfaceC49154JQw LJIIIIZZ;
    public Class LJIIIZ;
    public boolean LJIIJ;

    public final void LIZ() {
        if (C79004UzY.LJJIFFI(this.LIZIZ)) {
            return;
        }
        Iterator<AbstractC49155JQx> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ = 0;
        }
    }

    public final void LIZIZ() {
        if (C79004UzY.LJJIFFI(this.LIZIZ)) {
            return;
        }
        for (AbstractC49155JQx abstractC49155JQx : this.LIZIZ) {
            if (this.LJIIIIZZ.LIZLLL(abstractC49155JQx.LIZIZ()) && !abstractC49155JQx.LIZIZ) {
                abstractC49155JQx.LIZIZ = true;
                abstractC49155JQx.LIZLLL();
            }
        }
    }

    public final boolean LIZLLL() {
        if (!C46446IKs.LJLJLJ) {
            return false;
        }
        Taco LIZ = C49218JTi.LIZ(this.LIZ, true);
        Class<?> cls = this.LJIIIZ;
        if (cls != null && LIZ != null && !LIZ.LJII(cls)) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        AbstractC49155JQx LJ;
        if (LIZLLL() || C3Y8.LIZ(this.LIZ) || this.LJIIJ || this.LIZLLL == 2 || C79004UzY.LJJIFFI(this.LIZIZ)) {
            return;
        }
        JR0 jr0 = this.LJII;
        if ((jr0 == null || jr0.LJLILLLLZI()) && (LJ = this.LJIIIIZZ.LJ(this.LIZIZ)) != null) {
            LJ.LJ(this.LIZLLL);
            this.LIZJ = LJ;
        }
    }

    public final void LJ() {
        AbstractC49155JQx LJ;
        InterfaceC49157JQz interfaceC49157JQz;
        LIZ();
        LIZIZ();
        if (LIZLLL() || C3Y8.LIZ(this.LIZ) || this.LJIIJ || this.LIZLLL == 2 || C79004UzY.LJJIFFI(this.LIZIZ)) {
            return;
        }
        JR0 jr0 = this.LJII;
        if (jr0 != null && !jr0.LJLILLLLZI()) {
            return;
        }
        if ((this.LIZLLL == 1 && (interfaceC49157JQz = this.LJI) != null && !interfaceC49157JQz.LIZLLL()) || (LJ = this.LJIIIIZZ.LJ(this.LIZIZ)) == null) {
            return;
        }
        LJ.LJFF(this.LIZLLL);
    }

    public final void LJI() {
        LIZ();
        LIZIZ();
        LIZJ();
    }

    public final void LJFF(int i) {
        if (C79004UzY.LJJIFFI(this.LIZIZ)) {
            return;
        }
        for (AbstractC49155JQx abstractC49155JQx : this.LIZIZ) {
            if (abstractC49155JQx.LIZ() == i) {
                abstractC49155JQx.LIZ = 16;
                abstractC49155JQx.LJ(this.LIZLLL);
                this.LIZJ = abstractC49155JQx;
            } else {
                abstractC49155JQx.LIZ = 32;
                abstractC49155JQx.LIZJ();
            }
        }
    }

    public final void LJII(AbstractC49155JQx abstractC49155JQx) {
        if (abstractC49155JQx != null) {
            abstractC49155JQx.LIZ = 0;
            abstractC49155JQx.LIZIZ = false;
            abstractC49155JQx.LIZ();
            this.LIZIZ.add(abstractC49155JQx);
        }
    }

    public final void LJIIIIZZ(AbstractC49155JQx abstractC49155JQx) {
        if (abstractC49155JQx != null) {
            abstractC49155JQx.LIZ = 0;
            abstractC49155JQx.LIZIZ = false;
            abstractC49155JQx.LIZ();
            this.LIZIZ.remove(abstractC49155JQx);
        }
    }

    public C49153JQv(RecyclerView recyclerView, InterfaceC49157JQz interfaceC49157JQz, JR0 jr0) {
        this.LJI = interfaceC49157JQz;
        this.LJII = jr0;
        this.LIZ = recyclerView;
        recyclerView.LJIIJJI(new IDrS47S0100000_8(this, 0));
        this.LIZIZ = new LinkedHashSet();
    }
}
