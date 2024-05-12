package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HSH extends HSI {
    public final String LIZIZ;

    @Override // X.HSI, X.InterfaceC44104HSq
    public final String LJI() {
        boolean LJ;
        try {
            String LJII = HSI.LJII(this.LIZIZ, "anchor_type");
            if (!o.LJ(LJII, EnumC133695Mn.EDIT_EFFECT_SERVER.getType())) {
                LJ = o.LJ(LJII, EnumC133695Mn.EDIT_EFFECT_CLIENT.getType());
            } else {
                LJ = true;
            }
            if (LJ) {
                return EnumC133695Mn.EDIT_EFFECT.getType();
            }
            return super.LJI();
        } catch (IllegalArgumentException unused) {
            return super.LJI();
        }
    }

    public HSH(String str) {
        super(str);
        this.LIZIZ = str;
    }
}
