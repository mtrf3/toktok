package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;

/* renamed from: X.Ct8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32742Ct8 extends AbstractC32756CtM<Gift> {
    public final boolean LJIILIIL;

    @Override // X.AbstractC32698CsQ
    public final String LIZ() {
        String str = ((Gift) this.LIZIZ).describe;
        if (str == null) {
            return "";
        }
        return str;
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
    public final String LJFF() {
        String str = ((Gift) this.LIZIZ).name;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.AbstractC32698CsQ
    public final boolean LJIIL() {
        return !this.LJIILIIL;
    }

    @Override // X.AbstractC32756CtM
    public final int LJIILIIL() {
        return ((Gift) this.LIZIZ).diamondCount;
    }

    public C32742Ct8(Gift gift, boolean z) {
        super(13, gift);
        this.LJIILIIL = z;
    }
}
