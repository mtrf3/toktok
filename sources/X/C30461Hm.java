package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30461Hm implements InterfaceC82947Wgx, InterfaceC48038ItG {
    public static final C30461Hm LJLIL = new C30461Hm();

    @Override // X.InterfaceC82947Wgx
    public void LIZ(float f, int i, int i2) {
    }

    @Override // X.InterfaceC82947Wgx
    public void LIZLLL() {
    }

    @Override // X.InterfaceC82947Wgx
    public void LJ() {
    }

    @Override // X.InterfaceC82947Wgx
    public void LJFF() {
    }

    @Override // X.InterfaceC82947Wgx
    public void LJII() {
    }

    @Override // X.InterfaceC82947Wgx
    public void LJIIIIZZ(float f, int i, int i2) {
    }

    public /* synthetic */ C30461Hm() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        TJU state = (TJU) obj;
        o.LJIIIZ(state, "state");
        if (state instanceof TJW) {
            return C74413TIj.LIZIZ();
        }
        if (state instanceof TJS) {
            T t = state.LIZ;
            if (t != 0) {
                return C74413TIj.LIZJ(t);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel");
        }
        if (state instanceof TJQ) {
            return C74413TIj.LIZ((Throwable) state.LIZ);
        }
        throw new C162476Zf();
    }
}
