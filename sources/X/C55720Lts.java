package X;

/* renamed from: X.Lts, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55720Lts implements InterfaceC64672gJ<URP> {
    @Override // X.InterfaceC64672gJ
    public final Object emit(URP urp, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        URP urp2 = urp;
        int i = C55721Ltt.LIZ[urp2.LJLJL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Z8A.LIZIZ.updateProfilePermission(false);
            }
        } else if (urp2.LJLIL) {
            Z8A.LIZIZ.updateProfilePermission(true);
        }
        return C76800UCe.LIZ;
    }
}
