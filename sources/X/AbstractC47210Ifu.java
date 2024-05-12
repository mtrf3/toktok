package X;

import java.util.List;
import java.util.Stack;

/* renamed from: X.Ifu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC47210Ifu implements IZ0, InterfaceC47232IgG {
    public C47209Ift LIZ;
    public C67942QlW LIZIZ;
    public IWH LIZJ;
    public Stack<String> LIZLLL = new Stack<>();

    @Override // X.IZ0
    public /* synthetic */ void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
    }

    @Override // X.IZ0
    public /* synthetic */ void LIZIZ(IZ2 iz2) {
    }

    public void LIZJ(IU3 iu3) {
    }

    public /* synthetic */ void LIZLLL(C46539IOh c46539IOh) {
    }

    @Override // X.IZ0
    public /* synthetic */ void LJ(InterfaceC197787pW interfaceC197787pW) {
    }

    @Override // X.IZ0
    public /* synthetic */ void LJFF(String str) {
    }

    @Override // X.IZ0
    public /* synthetic */ void LJI(String str, List list) {
    }

    @Override // X.IZ0
    public /* synthetic */ InterfaceC46540IOi LJII() {
        return null;
    }

    public /* synthetic */ InterfaceC47233IgH LJIIIZ() {
        return null;
    }

    public InterfaceC47234IgI LJIIJ() {
        return null;
    }

    public abstract boolean LJIIJJI();

    @Override // X.IZ0
    public /* synthetic */ void pause() {
    }

    @Override // X.IZ0
    public /* synthetic */ void resume() {
    }

    @Override // X.IZ0
    public /* synthetic */ void stop() {
    }

    @Override // X.IZ0
    public void release() {
        C67942QlW c67942QlW = this.LIZIZ;
        if (!((List) c67942QlW.LJLIL).contains(this)) {
            return;
        }
        ((List) c67942QlW.LJLIL).remove(this);
    }

    public void LJIIIIZZ(IWH iwh) {
        this.LIZJ = iwh;
    }
}
