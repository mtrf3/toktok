package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C122034qd {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 714));
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 712));
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 717));
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 711));
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 710));
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 716));
    public final C62822Ol8 LJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 715));
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C122074qh.LJLIL);
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 713));
    public final C122044qe LJIIIZ;
    public final NLEEditor LJIIJ;
    public final InterfaceC126684y8 LJIIJJI;

    public final synchronized void LIZ() {
        this.LJIIIZ.LIZ();
    }

    public final synchronized void LIZIZ() {
        this.LJIIIZ.LIZIZ();
    }

    public final InterfaceC122994sB LIZJ() {
        return (InterfaceC122994sB) this.LJ.getValue();
    }

    public final C5LU LIZLLL() {
        return (C5LU) this.LIZLLL.getValue();
    }

    public final InterfaceC122134qn LJ() {
        return (InterfaceC122134qn) this.LIZIZ.getValue();
    }

    public final InterfaceC123794tT LJFF() {
        return (InterfaceC123794tT) this.LIZ.getValue();
    }

    public final InterfaceC122184qs LJI() {
        return (InterfaceC122184qs) this.LJI.getValue();
    }

    public final InterfaceC121874qN LJII() {
        return (InterfaceC121874qN) this.LJFF.getValue();
    }

    public final C5WG LJIIIIZZ() {
        return (C5WG) this.LIZJ.getValue();
    }

    public void LJIIJJI() {
        LJFF().LJIILLIIL(this.LJIIJ);
        LJ().LJIILLIIL(this.LJIIJ);
        LJIIIIZZ().LJIILLIIL(this.LJIIJ);
        LIZLLL().LJIILLIIL(this.LJIIJ);
        LIZJ().LJIILLIIL(this.LJIIJ);
    }

    public final NLETrack LJIIIZ(InterfaceC88472Yns<? super NLETrack, Boolean> block) {
        Object it;
        o.LJIIIZ(block, "block");
        Iterator LIZ = C0FS.LIZ(this.LJIIJ, "editor.model", "editor.model.tracks");
        while (true) {
            if (LIZ.hasNext()) {
                it = LIZ.next();
                o.LJIIIIZZ(it, "it");
                if (block.invoke(it).booleanValue()) {
                    break;
                }
            } else {
                it = null;
                break;
            }
        }
        return (NLETrack) it;
    }

    public final void LJIIJ(AbstractC121974qX operation) {
        o.LJIIIZ(operation, "operation");
        C122044qe c122044qe = this.LJIIIZ;
        InterfaceC121824qI managerProxy = (InterfaceC121824qI) this.LJIIIIZZ.getValue();
        synchronized (c122044qe) {
            o.LJIIIZ(managerProxy, "managerProxy");
            if (!c122044qe.LIZIZ) {
                operation.LJ((InterfaceC121824qI) this.LJIIIIZZ.getValue());
                System.currentTimeMillis();
                operation.LIZIZ(this.LJIIJJI);
                System.currentTimeMillis();
                operation.LIZJ(this.LJIIJ);
                System.currentTimeMillis();
                this.LJIIJ.LIZIZ();
                System.currentTimeMillis();
                operation.LIZ(this.LJIIJJI);
                return;
            }
            operation.LJ(managerProxy);
            System.currentTimeMillis();
            operation.LIZIZ(c122044qe.LIZLLL);
            System.currentTimeMillis();
            operation.LIZJ(c122044qe.LIZJ);
            System.currentTimeMillis();
            c122044qe.LIZ.add(operation);
        }
    }

    public C122034qd(NLEEditor nLEEditor, InterfaceC126684y8 interfaceC126684y8) {
        this.LJIIJ = nLEEditor;
        this.LJIIJJI = interfaceC126684y8;
        this.LJIIIZ = new C122044qe(nLEEditor, interfaceC126684y8);
    }
}
