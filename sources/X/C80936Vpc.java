package X;

import android.graphics.Bitmap;

/* renamed from: X.Vpc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80936Vpc extends AbstractC78749UvR {
    public final InterfaceC80940Vpg LIZ;
    public C80939Vpf LIZIZ;

    @Override // X.AbstractC78749UvR, X.VA3
    public final String getName() {
        return this.LIZ.getKey();
    }

    @Override // X.AbstractC78749UvR, X.VA3
    public final W6U getPostprocessorCacheKey() {
        return new C245519kJ(this.LIZ.getKey());
    }

    public C80936Vpc(InterfaceC80940Vpg interfaceC80940Vpg) {
        this.LIZ = interfaceC80940Vpg;
    }

    @Override // X.AbstractC78749UvR
    public final C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7, java.util.Map<String, String> map) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C80939Vpf(abstractC78853Ux7);
        }
        C80935Vpb c80935Vpb = null;
        try {
            c80935Vpb = this.LIZ.LIZ(bitmap, this.LIZIZ);
            C81392Vwy<Bitmap> LIZJ = C81392Vwy.LIZJ(c80935Vpb.LIZ);
            C81392Vwy.LJ(c80935Vpb.LIZ);
            return LIZJ;
        } catch (Throwable th) {
            if (c80935Vpb != null) {
                C81392Vwy.LJ(c80935Vpb.LIZ);
            }
            throw th;
        }
    }
}
