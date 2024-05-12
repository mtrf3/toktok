package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;

/* renamed from: X.Ct7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32741Ct7 extends AbstractC32756CtM<Gift> {
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
    public final String LJFF() {
        String str = ((Gift) this.LIZIZ).name;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.AbstractC32756CtM
    public final int LJIILIIL() {
        return ((Gift) this.LIZIZ).diamondCount;
    }

    public C32741Ct7(Gift gift) {
        super(11, gift);
    }
}
