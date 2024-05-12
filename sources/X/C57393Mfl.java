package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mfl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57393Mfl implements InterfaceC58007Mpf {
    public static final C57393Mfl LIZ = new C57393Mfl();
    public static final C73893SzJ<C57391Mfj> LIZIZ = new C73893SzJ<>();
    public static C57391Mfj LIZJ = LIZLLL();

    public static final C57391Mfj LIZLLL() {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        return new C57391Mfj(curUserId, C77266UUc.LIZIZ.LJIIJ().LIZJ());
    }

    @Override // X.InterfaceC58007Mpf
    public final C57391Mfj LIZ() {
        C57391Mfj LIZ2;
        if (!o.LJ(((RBX) HG3.LJIILL()).getCurUserId(), LIZJ.LIZ)) {
            LIZ2 = LIZLLL();
        } else {
            LIZ2 = C57391Mfj.LIZ(LIZJ, null, C77266UUc.LIZIZ.LJIIJ().LIZJ(), null, null, null, 119);
        }
        LIZJ = LIZ2;
        return LIZ2;
    }

    @Override // X.InterfaceC58007Mpf
    public final C73893SzJ LIZIZ() {
        return LIZIZ;
    }

    @Override // X.InterfaceC58007Mpf
    public final void LIZJ(InterfaceC88472Yns<? super C57391Mfj, C57391Mfj> interfaceC88472Yns) {
        C57391Mfj invoke = interfaceC88472Yns.invoke(LIZ());
        LIZJ = invoke;
        LIZIZ.onNext(invoke);
    }
}
