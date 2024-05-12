package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Css, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32726Css extends AbstractC32698CsQ<C32697CsP> {
    @Override // X.AbstractC32698CsQ
    public final String LIZ() {
        return "Match Item";
    }

    @Override // X.AbstractC32698CsQ
    public final long LIZJ() {
        return -1L;
    }

    @Override // X.AbstractC32698CsQ
    public final ImageModel LIZLLL() {
        return ((C32697CsP) this.LIZIZ).LJII;
    }

    @Override // X.AbstractC32698CsQ
    public final String LJFF() {
        return ((C32697CsP) this.LIZIZ).LJFF;
    }

    @Override // X.AbstractC32698CsQ
    public final boolean LJI() {
        T t = this.LIZIZ;
        if (t != 0) {
            o.LJII(t, "null cannot be cast to non-null type com.bytedance.android.livesdk.pack.model.MatchItem");
            ImageModel imageModel = ((C32697CsP) t).LJI;
            if (imageModel != null && imageModel.mUrls != null && imageModel.mUrls.size() > 0) {
                return true;
            }
            return false;
        }
        return super.LJI();
    }

    public C32726Css(C32697CsP c32697CsP) {
        super(12, c32697CsP);
    }

    public final boolean LJIILIIL(C32726Css c32726Css) {
        C32697CsP c32697CsP;
        C32697CsP c32697CsP2 = (C32697CsP) this.LIZIZ;
        if (c32726Css != null && (c32697CsP = (C32697CsP) c32726Css.LIZIZ) != null) {
            if (c32697CsP2.LJIIIZ == c32697CsP.LJIIIZ && c32697CsP2.LJIIJ == c32697CsP.LJIIJ && c32697CsP2.LJIIJJI == c32697CsP.LJIIJJI) {
                return true;
            }
        } else {
            c32697CsP2.getClass();
        }
        return false;
    }
}
