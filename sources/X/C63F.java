package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.BaseStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.63F, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63F extends FrameLayout implements C64U {
    public View LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public C164036cB LJLJJI;
    public OPX LJLJJL;
    public OPX LJLJJLL;
    public TextView LJLJL;
    public TextView LJLJLJ;
    public TuxIconView LJLJLLL;
    public TuxTextView LJLL;
    public TuxIconView LJLLI;
    public TuxTextView LJLLILLLL;
    public TuxIconView LJLLJ;
    public View LJLLL;
    public TuxTextView LJLLLL;
    public RectF LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public float LJZI;
    public boolean LJZL;

    @Override // X.C64U
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.C64U
    public final void LJFF() {
    }

    @Override // X.C64U
    public final void LJI(C64N c64n) {
    }

    public final void LJIIIIZZ() {
        this.LJLLLLLL = new RectF(getLeftViewXMargin(), -C60996Nwm.LJ(getContext()), getRightViewXMargin(), getMeasuredHeight() - this.LJZ);
    }

    public final void LJIIIZ() {
        C164036cB c164036cB = this.LJLJJI;
        if (c164036cB != null) {
            c164036cB.setAlpha(this.LJZI);
        }
        OPX opx = this.LJLJJL;
        if (opx != null) {
            opx.setAlpha(this.LJZI);
        }
        OPX opx2 = this.LJLJJLL;
        if (opx2 != null) {
            opx2.setAlpha(this.LJZI);
        }
        TextView textView = this.LJLJL;
        if (textView != null) {
            textView.setAlpha(this.LJZI);
        }
        TextView textView2 = this.LJLJLJ;
        if (textView2 != null) {
            textView2.setAlpha(this.LJZI);
        }
        TuxIconView tuxIconView = this.LJLJLLL;
        if (tuxIconView != null) {
            tuxIconView.setAlpha(this.LJZI);
        }
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView != null) {
            tuxTextView.setAlpha(this.LJZI);
        }
        TuxIconView tuxIconView2 = this.LJLLI;
        if (tuxIconView2 != null) {
            tuxIconView2.setAlpha(this.LJZI);
        }
        TuxTextView tuxTextView2 = this.LJLLILLLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setAlpha(this.LJZI);
        }
        TuxIconView tuxIconView3 = this.LJLLJ;
        if (tuxIconView3 != null) {
            tuxIconView3.setAlpha(this.LJZI);
        }
        View view = this.LJLLL;
        if (view != null) {
            view.setAlpha(this.LJZI);
        }
        TuxTextView tuxTextView3 = this.LJLLLL;
        if (tuxTextView3 == null) {
            return;
        }
        tuxTextView3.setAlpha(this.LJZI);
    }

    private final float getLeftViewXMargin() {
        if (C90193gN.LIZIZ(getContext())) {
            return this.LJLZ;
        }
        return KL2.LIZJ(getContext(), 8.0f);
    }

    private final float getRightViewXMargin() {
        float LJIIIIZZ;
        float f;
        if (C90193gN.LIZIZ(getContext())) {
            LJIIIIZZ = C60996Nwm.LJIIIIZZ(getContext());
            f = KL2.LIZJ(getContext(), 8.0f);
        } else {
            LJIIIIZZ = C60996Nwm.LJIIIIZZ(getContext());
            f = this.LJLZ;
        }
        return LJIIIIZZ - f;
    }

    public final boolean getAlwaysDisplayFakeFeed() {
        return this.LJZL;
    }

    public final float getFakeFeedAlpha() {
        return this.LJZI;
    }

    public final OPX getIvOriginMusicCover() {
        return this.LJLJJLL;
    }

    public final C164036cB getMAvatarView() {
        return this.LJLJJI;
    }

    public final OPX getMMusicCoverView() {
        return this.LJLJJL;
    }

    public final TextView getTvMusic() {
        return this.LJLJLJ;
    }

    public final TextView getTvName() {
        return this.LJLJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63F(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLLLLLL = new RectF();
        this.LJZI = 0.5f;
        this.LJLZ = (int) C74275TDb.LIZIZ(context, 56.0f);
        this.LJZ = (int) KL2.LIZJ(context, 201.0f);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cnv, this, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…r_fake_feed, this, false)");
        this.LJLIL = LLLLIILL.findViewById(R.id.dz4);
        this.LJLILLLLZI = LLLLIILL.findViewById(R.id.dyn);
        this.LJLJI = LLLLIILL.findViewById(R.id.gradual_bottom);
        this.LJLJJI = (C164036cB) LLLLIILL.findViewById(R.id.my0);
        this.LJLJJL = (OPX) LLLLIILL.findViewById(R.id.grh);
        this.LJLJJLL = (OPX) LLLLIILL.findViewById(R.id.hdk);
        this.LJLJL = (TextView) LLLLIILL.findViewById(R.id.mby);
        this.LJLJLJ = (TextView) LLLLIILL.findViewById(R.id.mbi);
        this.LJLJLLL = (TuxIconView) LLLLIILL.findViewById(R.id.d39);
        this.LJLL = (TuxTextView) LLLLIILL.findViewById(R.id.d3_);
        this.LJLLI = (TuxIconView) LLLLIILL.findViewById(R.id.d35);
        this.LJLLILLLL = (TuxTextView) LLLLIILL.findViewById(R.id.d36);
        this.LJLLJ = (TuxIconView) LLLLIILL.findViewById(R.id.d3a);
        this.LJLLL = LLLLIILL.findViewById(R.id.d34);
        this.LJLLLL = (TuxTextView) LLLLIILL.findViewById(R.id.bke);
        C164036cB c164036cB = this.LJLJJI;
        if (c164036cB != null) {
            c164036cB.setBorderColor(R.color.ar);
        }
        View view = this.LJLIL;
        if (view != null) {
            view.setVisibility(4);
        }
        addView(LLLLIILL);
        LJIIIZ();
        LJIIIIZZ();
    }

    public final void setAlwaysDisplayFakeFeed(boolean z) {
        this.LJZL = z;
    }

    public final void setFakeFeedAlpha(float f) {
        this.LJZI = f;
    }

    public final void setIvOriginMusicCover(OPX opx) {
        this.LJLJJLL = opx;
    }

    public final void setMAvatarView(C164036cB c164036cB) {
        this.LJLJJI = c164036cB;
    }

    public final void setMMusicCoverView(OPX opx) {
        this.LJLJJL = opx;
    }

    public final void setTvMusic(TextView textView) {
        this.LJLJLJ = textView;
    }

    public final void setTvName(TextView textView) {
        this.LJLJL = textView;
    }

    @Override // X.C64U
    public final boolean LIZIZ(C64N c64n, float f) {
        RectF LIZ = c64n.LIZIZ().getViewRectF().LIZ();
        float radians = (float) Math.toRadians(f);
        float radians2 = (float) Math.toRadians(c64n.LIZ().getRotation());
        PointF[] fourPointsWithRotationAndScale$default = BaseStickerModel.getFourPointsWithRotationAndScale$default(c64n.LIZIZ(), 0.0f, 1, null);
        for (PointF pointF : fourPointsWithRotationAndScale$default) {
            C77119UOl.LJJIII(pointF, LIZ.centerX(), LIZ.centerY(), radians2 - radians);
        }
        RectF LIZ2 = C1542763r.LIZ(fourPointsWithRotationAndScale$default);
        LJIIJ(LIZ2, true);
        LJIIJJI(LIZ2, true);
        return false;
    }

    @Override // X.C64U
    public final boolean LJ(C64N c64n, float f) {
        RectF LIZ = C1542763r.LIZ(BaseStickerModel.getFourPointsWithRotationAndScale$default(c64n.LIZIZ(), 0.0f, 1, null));
        C77119UOl.LJJIIZ(LIZ, f);
        LJIIJJI(LIZ, true);
        LJIIJ(LIZ, true);
        return false;
    }

    public final void LJIIJ(RectF rectF, boolean z) {
        if ((this.LJZL || rectF.bottom + 2 >= this.LJLLLLLL.bottom) && z) {
            View view = this.LJLILLLLZI;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                view2.setVisibility(4);
            }
        }
        View view3 = this.LJLJI;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(0);
    }

    public final void LJIIJJI(RectF rectF, boolean z) {
        if ((this.LJZL || rectF.right + 2 >= this.LJLLLLLL.right) && z) {
            View view = this.LJLIL;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
            return;
        }
        View view2 = this.LJLIL;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(4);
    }

    @Override // X.C64U
    public final void LIZ(C64N c64n, float f, float f2) {
        LJIIJ(c64n.LIZIZ().getViewRectF().LIZ(), false);
        LJIIJJI(c64n.LIZIZ().getViewRectF().LIZ(), false);
    }

    @Override // X.C64U
    public final boolean LIZJ(C64N c64n, float f, float f2) {
        RectF LIZ = C1542763r.LIZ(BaseStickerModel.getFourPointsWithRotationAndScale$default(c64n.LIZIZ(), 0.0f, 1, null));
        LIZ.left += f;
        LIZ.right += f;
        LIZ.top += f2;
        LIZ.bottom += f2;
        LJIIJJI(LIZ, true);
        LJIIJ(LIZ, true);
        return false;
    }

    @Override // X.C64U
    public final void LJII(C64N c64n, float f, float f2) {
        LJIIIIZZ();
    }
}
