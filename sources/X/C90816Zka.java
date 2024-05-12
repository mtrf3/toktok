package X;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Zka, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90816Zka implements InterfaceC90123ZYp, ZYU<C90613ZhJ> {
    public static final C90469Zez LJFF = new C90469Zez("UIMediaController");
    public final Activity LIZ;
    public final ZYS LIZIZ;
    public final java.util.Map<View, List<AbstractC90446Zec>> LIZJ = new HashMap();
    public final C90447Zed LIZLLL;
    public C90639Zhj LJ;

    @Override // X.InterfaceC90123ZYp
    public final void LJIIJJI() {
        Iterator it = ((HashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((AbstractC90446Zec) it2.next()).LIZJ();
            }
        }
    }

    public final C90639Zhj LJIILL() {
        QH7.LJ("Must be called from the main thread.");
        return this.LJ;
    }

    public final void LJIILLIIL() {
        QH7.LJ("Must be called from the main thread.");
        if (this.LJ != null) {
            this.LIZLLL.LIZ = null;
            Iterator it = ((HashMap) this.LIZJ).values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    ((AbstractC90446Zec) it2.next()).LJ();
                }
            }
            QH7.LJIIIIZZ(this.LJ);
            C90639Zhj c90639Zhj = this.LJ;
            c90639Zhj.getClass();
            QH7.LJ("Must be called from the main thread.");
            ((CopyOnWriteArrayList) c90639Zhj.LJI).remove(this);
            this.LJ = null;
        }
    }

    public final void LJIJI() {
        Iterator<List<AbstractC90446Zec>> it = this.LIZJ.values().iterator();
        while (it.hasNext()) {
            Iterator<AbstractC90446Zec> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ();
            }
        }
    }

    @Override // X.InterfaceC90123ZYp
    public final void LIZIZ() {
        LJIJI();
    }

    @Override // X.InterfaceC90123ZYp
    public final void LIZLLL() {
        LJIJI();
    }

    @Override // X.InterfaceC90123ZYp
    public final void LJ() {
        LJIJI();
    }

    @Override // X.InterfaceC90123ZYp
    public final void LJI() {
        LJIJI();
    }

    @Override // X.InterfaceC90123ZYp
    public final void LJIIJ() {
        LJIJI();
    }

    public C90816Zka(ActivityC45651qj activityC45651qj) {
        ZYJ zyj;
        new HashSet();
        this.LIZLLL = new C90447Zed();
        this.LIZ = activityC45651qj;
        QH7.LJ("Must be called from the main thread.");
        try {
            zyj = ZYJ.LIZIZ(activityC45651qj);
        } catch (RuntimeException unused) {
            ZYJ.LJII.getClass();
            zyj = null;
        }
        C90272Zbo.LIZ(EnumC90770Zjq.UI_MEDIA_CONTROLLER);
        ZYS LIZ = zyj != null ? zyj.LIZ() : null;
        this.LIZIZ = LIZ;
        if (LIZ != null) {
            LIZ.LIZ(this, C90613ZhJ.class);
            LJIIZILJ(LIZ.LIZJ());
        }
    }

    public final void LJIIZILJ(ZYQ zyq) {
        QH7.LJ("Must be called from the main thread.");
        if (this.LJ != null || zyq == null || !zyq.LIZJ()) {
            return;
        }
        C90613ZhJ c90613ZhJ = (C90613ZhJ) zyq;
        C90639Zhj LJIIIIZZ = c90613ZhJ.LJIIIIZZ();
        this.LJ = LJIIIIZZ;
        if (LJIIIIZZ == null) {
            return;
        }
        QH7.LJ("Must be called from the main thread.");
        ((CopyOnWriteArrayList) LJIIIIZZ.LJI).add(this);
        QH7.LJIIIIZZ(this.LIZLLL);
        this.LIZLLL.LIZ = c90613ZhJ.LJIIIIZZ();
        Iterator it = ((HashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((AbstractC90446Zec) it2.next()).LIZLLL(c90613ZhJ);
            }
        }
        LJIJI();
    }

    @Override // X.ZYU
    public final /* bridge */ /* synthetic */ void LIZJ(C90613ZhJ c90613ZhJ) {
    }

    @Override // X.ZYU
    public final /* bridge */ /* synthetic */ void LJFF(C90613ZhJ c90613ZhJ) {
    }

    @Override // X.ZYU
    public final void LIZ(C90613ZhJ c90613ZhJ, int i) {
        LJIILLIIL();
    }

    @Override // X.ZYU
    public final void LJII(C90613ZhJ c90613ZhJ, int i) {
        LJIILLIIL();
    }

    @Override // X.ZYU
    public final void LJIIIIZZ(C90613ZhJ c90613ZhJ, int i) {
        LJIILLIIL();
    }

    @Override // X.ZYU
    public final void LJIIL(C90613ZhJ c90613ZhJ, boolean z) {
        LJIIZILJ(c90613ZhJ);
    }

    @Override // X.ZYU
    public final void LJIILIIL(C90613ZhJ c90613ZhJ, String str) {
        LJIIZILJ(c90613ZhJ);
    }

    public final void LJIJ(View view, AbstractC90446Zec abstractC90446Zec) {
        if (this.LIZIZ == null) {
            return;
        }
        List list = (List) ((HashMap) this.LIZJ).get(view);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.LIZJ).put(view, list);
        }
        list.add(abstractC90446Zec);
        QH7.LJ("Must be called from the main thread.");
        if (this.LJ != null) {
            C90613ZhJ LIZJ = this.LIZIZ.LIZJ();
            QH7.LJIIIIZZ(LIZJ);
            abstractC90446Zec.LIZLLL(LIZJ);
            LJIJI();
        }
    }

    @Override // X.ZYU
    public final /* bridge */ /* synthetic */ void LJIIIZ(C90613ZhJ c90613ZhJ, String str) {
    }

    @Override // X.ZYU
    public final /* bridge */ /* synthetic */ void LJIILJJIL(C90613ZhJ c90613ZhJ, int i) {
    }
}
