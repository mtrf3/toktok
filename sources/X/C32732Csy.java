package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;

/* renamed from: X.Csy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32732Csy extends AbstractC32698CsQ<Gift> {
    @Override // X.AbstractC32698CsQ
    public final String LIZ() {
        String str = ((Gift) this.LIZIZ).describe;
        if (str == null) {
            return "red envelope";
        }
        return str;
    }

    @Override // X.AbstractC32698CsQ
    public final long LIZJ() {
        return ((Gift) this.LIZIZ).id;
    }

    @Override // X.AbstractC32698CsQ
    public final ImageModel LIZLLL() {
        ImageModel imageModel = ((Gift) this.LIZIZ).image;
        if (imageModel != null) {
            return imageModel;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC32698CsQ
    public final ImageModel LJ() {
        return ((Gift) this.LIZIZ).leftLogo;
    }

    @Override // X.AbstractC32698CsQ
    public final String LJFF() {
        String str = ((Gift) this.LIZIZ).name;
        if (str == null) {
            return "";
        }
        return str;
    }

    public C32732Csy(Gift gift) {
        super(10, gift);
    }
}
