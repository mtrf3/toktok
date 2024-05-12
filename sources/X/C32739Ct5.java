package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;

/* renamed from: X.Ct5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32739Ct5 extends AbstractC32756CtM<Gift> {
    public final Gift LJIILIIL;

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

    @Override // X.AbstractC32698CsQ
    public final boolean LJIIL() {
        T t = this.LIZIZ;
        if (((Gift) t).type != 1 && ((Gift) t).type != 5 && ((Gift) t).type != 10) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC32756CtM
    public final int LJIILIIL() {
        return ((Gift) this.LIZIZ).diamondCount;
    }

    public C32739Ct5(Gift gift) {
        super(1, gift);
        this.LJIILIIL = gift;
    }
}
