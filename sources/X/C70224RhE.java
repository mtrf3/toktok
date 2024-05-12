package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SeaSpecListLayoutStyle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.RhE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70224RhE implements InterfaceC70386Rjq {
    public final SeaSpecListLayoutStyle LIZ = new SeaSpecListLayoutStyle();

    @Override // X.InterfaceC70386Rjq
    public final int LIZLLL() {
        return (int) C45804HyK.LJJ(5);
    }

    @Override // X.InterfaceC70386Rjq
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC70386Rjq
    public final int LJFF() {
        return R.attr.gv;
    }

    @Override // X.InterfaceC70386Rjq
    public final float LJI() {
        return C45804HyK.LJJ(2);
    }

    @Override // X.InterfaceC70386Rjq
    public final void LJII() {
    }

    @Override // X.InterfaceC70386Rjq
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC70386Rjq
    public final int LJIIJ() {
        return 22;
    }

    @Override // X.InterfaceC70386Rjq
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC70386Rjq
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.InterfaceC70386Rjq
    public final boolean LJIILJJIL() {
        return false;
    }

    @Override // X.InterfaceC70386Rjq
    public final int LJIILL() {
        return R.id.k3i;
    }

    @Override // X.InterfaceC70386Rjq
    public final float LJIJI() {
        return C45804HyK.LJJ(2);
    }

    @Override // X.InterfaceC70386Rjq
    public final boolean LJIJJLI() {
        return true;
    }

    @Override // X.InterfaceC70386Rjq
    public final float LJIL() {
        return 0.73f;
    }

    @Override // X.InterfaceC70386Rjq
    public final int LJJ() {
        return 61;
    }

    @Override // X.InterfaceC70386Rjq
    public final boolean LJJI() {
        return false;
    }

    @Override // X.InterfaceC70386Rjq
    public final int getNormalSpecMinHeight() {
        return 0;
    }

    @Override // X.InterfaceC70386Rjq
    public final int getNormalSpecMinWidth() {
        return 0;
    }

    @Override // X.InterfaceC70386Rjq
    public final int getSpecHorizontalImageMargin() {
        return (int) C45804HyK.LJJ(2);
    }

    @Override // X.InterfaceC70386Rjq
    public final int LIZ() {
        return (int) C45804HyK.LJJ(8);
    }

    @Override // X.InterfaceC70386Rjq
    public final int LIZIZ() {
        return (int) C45804HyK.LJJ(96);
    }

    @Override // X.InterfaceC70386Rjq
    public final int LJIIIZ() {
        return (int) C45804HyK.LJJ(32);
    }

    @Override // X.InterfaceC70386Rjq
    public final int LJIILLIIL() {
        return (int) C45804HyK.LJJ(16);
    }

    @Override // X.InterfaceC70386Rjq
    public final int LJIIZILJ() {
        return (int) C45804HyK.LJJ(11);
    }

    @Override // X.InterfaceC70386Rjq
    public final int getSpecImageSize() {
        return (int) C45804HyK.LJJ(100);
    }

    @Override // X.InterfaceC70386Rjq
    public final int LJIJJ() {
        return getSpecImageSize();
    }

    @Override // X.InterfaceC70386Rjq
    public final ISpecListLayoutStyle LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC70386Rjq
    public final EnumC70226RhG LJIJ() {
        return EnumC70226RhG.END;
    }

    @Override // X.InterfaceC70386Rjq
    public final S3L LJIIL(Context context) {
        S3I s3i = new S3I();
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.dz, context);
        float LIZ = AnonymousClass391.LIZ(0.5d);
        s3i.LIZJ = LJIIIIZZ;
        s3i.LIZIZ = LIZ;
        return new S3L(s3i);
    }
}
