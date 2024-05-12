package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Cj9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32123Cj9 implements InterfaceC58334Muw {
    @Override // X.InterfaceC58334Muw
    public final void LIZ(String businessId) {
        o.LJIIIZ(businessId, "businessId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRemoved, businessId: ");
        LIZ.append(businessId);
        C32444CoK.LIZ("StickerGiftTracker", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC58334Muw
    public final void LIZIZ(String businessId, java.util.Map<String, String> map) {
        o.LJIIIZ(businessId, "businessId");
        if (o.LJ(businessId, "live_sticker_gift_sei")) {
            C32217Ckf c32217Ckf = C32217Ckf.LIZ;
            c32217Ckf.getClass();
            if (map.isEmpty()) {
                return;
            }
            try {
                C3C5.m7constructorimpl(XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C32122Cj8(map, c32217Ckf, null), 2));
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }
}
