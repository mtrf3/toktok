package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MbT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C57127MbT extends C72434Sbm {
    public static boolean LJLLLLLL;

    @Override // X.C72434Sbm, com.bytedance.lighten.loader.SmartImageView
    public final void LIZIZ() {
        super.LIZIZ();
        getHierarchy().LJIJI(R.drawable.b0p, InterfaceC78716Uuu.LJJJLZIJ);
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LIZLLL(KL2.LIZJ(getContext(), 1.0f));
            getHierarchy().LIZJ.LJFF = AnonymousClass636.LJIIIIZZ(R.attr.cl, getContext());
            getHierarchy().LIZJ.LJII(KL2.LIZJ(getContext(), 1.0f));
        }
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public C57127MbT(Context context) {
        super(context);
    }

    public static void setOpt(boolean z) {
        LJLLLLLL = z;
    }

    public void setBorderAttrRes(int i) {
        if (getHierarchy().LIZJ != null) {
            Integer LJI = C79045V0n.LJI(i, getContext());
            if (LJI == null) {
                LJI = 0;
            }
            getHierarchy().LIZJ.LJFF = LJI.intValue();
        }
    }

    public void setBorderColor(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJFF = C04330Ez.LIZIZ(getContext(), i);
        }
    }

    public void setBorderWidth(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LIZLLL(KL2.LIZJ(getContext(), i));
        }
    }

    public void setBorderWidthPx(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LIZLLL(i);
        }
    }

    public void setRoundingParamsPadding(float f) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJII(f);
        }
    }

    public C57127MbT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void LJIIIIZZ(UrlModel urlModel, int[] iArr, int i, int i2, String str, boolean z, L5W l5w) {
        if (LJLLLLLL) {
            C37179EiV.LJFF.post(new LDA(this, urlModel, iArr, i, i2, str, z, l5w));
        } else {
            LJIIIZ(urlModel, iArr, i, i2, str, z, l5w);
        }
    }

    public final void LJIIIZ(UrlModel urlModel, int[] iArr, int i, int i2, String str, boolean z, SIR sir) {
        W5F LJII;
        ImageUrlModel LJ = C78939UyV.LJ(urlModel);
        if (C2049682q.LIZ(null) && LJ.LIZ()) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_default_avatar;
            LJII = W5U.LJIIIIZZ("");
            LJII.LJIILLIIL = c2068389v.LIZ(getContext());
        } else {
            LJII = W5U.LJII(LJ);
        }
        if (iArr != null) {
            LJII.LJIILIIL(iArr);
        }
        LJII.LJII = i;
        LJII.LJIIIIZZ = i2;
        LJII.LIZIZ(str);
        LJII.LJJIJIIJIL = z;
        LJII.LJJIIJ = this;
        if (sir != null) {
            LJII.LJJIZ = sir;
        }
        C16880lQ.LLJJJ(LJII);
    }
}
