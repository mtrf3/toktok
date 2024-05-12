package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;

/* renamed from: X.Ct6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32740Ct6 extends AbstractC32756CtM<Gift> {
    @Override // X.AbstractC32698CsQ
    public final boolean LJIIL() {
        return true;
    }

    @Override // X.AbstractC32698CsQ
    public final String LIZ() {
        return ((Gift) this.LIZIZ).describe;
    }

    @Override // X.AbstractC32698CsQ
    public final long LIZJ() {
        return ((Gift) this.LIZIZ).id;
    }

    @Override // X.AbstractC32698CsQ
    public final ImageModel LIZLLL() {
        return ((Gift) this.LIZIZ).image;
    }

    @Override // X.AbstractC32698CsQ
    public final ImageModel LJ() {
        return ((Gift) this.LIZIZ).leftLogo;
    }

    @Override // X.AbstractC32698CsQ
    public final String LJFF() {
        return ((Gift) this.LIZIZ).name;
    }

    @Override // X.AbstractC32756CtM
    public final int LJIILIIL() {
        return ((Gift) this.LIZIZ).diamondCount;
    }

    public C32740Ct6(Gift gift) {
        super(9, gift);
    }
}
