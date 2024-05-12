package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Te0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75120Te0 implements N4W {
    public final /* synthetic */ C75105Tdl LIZ;

    @Override // X.N4W
    public final void LIZ(TZM keeper, String interactId) {
        o.LJIIIZ(keeper, "keeper");
        o.LJIIIZ(interactId, "interactId");
    }

    @Override // X.N4W
    public final void LIZJ(TZM keeper) {
        o.LJIIIZ(keeper, "keeper");
    }

    public C75120Te0(C75105Tdl c75105Tdl) {
        this.LIZ = c75105Tdl;
    }

    @Override // X.N4W
    public final void LIZIZ(TZM keeper, String interactId) {
        o.LJIIIZ(keeper, "keeper");
        o.LJIIIZ(interactId, "interactId");
        this.LIZ.LJJJ(new C75121Te1(0, interactId));
    }
}
