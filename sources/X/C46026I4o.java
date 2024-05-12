package X;

import Y.AObjectS42S0101000_5;
import Y.AObjectS42S0110000_7;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import o53.IDdS474S0100000_7;

/* renamed from: X.I4o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46026I4o extends FrameLayout implements InterfaceC44146HUg {
    public static final /* synthetic */ int LJLLLL = 0;
    public TuxTextView LJLIL;
    public W5X LJLILLLLZI;
    public ImageView LJLJI;
    public RelativeLayout LJLJJI;
    public ViewStub LJLJJL;
    public FrameLayout LJLJJLL;
    public ViewStub LJLJL;
    public W5X LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public ObjectAnimator LJLLI;
    public AnimatorSet LJLLILLLL;
    public AnimatorSet LJLLJ;
    public boolean LJLLL;

    public final void LIZIZ() {
        if (this.LJLLL) {
            return;
        }
        this.LJLLL = true;
        if (C48331Ixz.LJ() || C48331Ixz.LIZIZ()) {
            G8G.LIZ.end("tool_performance_show_album_icon", "image loaded");
        }
    }

    private float getRoundRadius() {
        int i;
        if (C58B.LIZ()) {
            i = 6;
        } else {
            i = 4;
        }
        return C32151Nz.LJIIZILJ(Integer.valueOf(i));
    }

    public final void LJ() {
        FrameLayout frameLayout;
        int i;
        if (C46029I4r.LIZIZ()) {
            W5X w5x = this.LJLJLJ;
            if (w5x != null && w5x.getVisibility() != 8) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJJI, "alpha", 1.0f, 0.0f, 1.0f);
                this.LJLLI = ofFloat;
                ofFloat.setStartDelay(500L);
                this.LJLLI.setDuration(200L);
                this.LJLLI.start();
                if (C90193gN.LIZIZ(getContext())) {
                    i = this.LJLJLLL;
                } else {
                    i = -this.LJLJLLL;
                }
                float f = i;
                this.LJLLILLLL = new AnimatorSet();
                this.LJLLILLLL.playTogether(ObjectAnimator.ofPropertyValuesHolder(this.LJLILLLLZI, PropertyValuesHolder.ofFloat("translationX", f), PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.75f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.75f, 1.0f)), ObjectAnimator.ofPropertyValuesHolder(this.LJLJLJ, PropertyValuesHolder.ofFloat("translationX", f), PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.75f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.75f, 1.0f)));
                this.LJLLILLLL.setStartDelay(500L);
                this.LJLLILLLL.setDuration(450L);
                this.LJLLILLLL.start();
                return;
            }
            return;
        }
        if (!C46029I4r.LIZJ() || (frameLayout = this.LJLJJLL) == null || frameLayout.getVisibility() == 8) {
            return;
        }
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f, 1.0f);
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("scaleX", 0.79f);
        PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("rotation", 0.0f, 10.0f);
        PropertyValuesHolder ofFloat5 = PropertyValuesHolder.ofFloat("translationX", C74275TDb.LIZIZ(getContext(), 6.0f));
        PropertyValuesHolder ofFloat6 = PropertyValuesHolder.ofFloat("translationY", C74275TDb.LIZIZ(getContext(), -2.0f));
        PropertyValuesHolder ofFloat7 = PropertyValuesHolder.ofFloat("rotation", 0.0f, -10.0f);
        PropertyValuesHolder ofFloat8 = PropertyValuesHolder.ofFloat("translationX", C74275TDb.LIZIZ(getContext(), -5.5f));
        PropertyValuesHolder ofFloat9 = PropertyValuesHolder.ofFloat("translationY", C74275TDb.LIZIZ(getContext(), -2.5f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.LJLLJ = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofPropertyValuesHolder(this.LJLJJI, ofFloat2, ofFloat3).setDuration(200L), ObjectAnimator.ofFloat(this.LJLJJLL, "alpha", 0.0f, 1.0f).setDuration(100L), ObjectAnimator.ofPropertyValuesHolder(this.LJLJJI, ofFloat4, ofFloat5, ofFloat6).setDuration(680L), ObjectAnimator.ofPropertyValuesHolder(this.LJLJJLL, ofFloat7, ofFloat8, ofFloat9).setDuration(680L));
        this.LJLLJ.setInterpolator(new C58U(0.621f));
        this.LJLLJ.setStartDelay(500L);
        this.LJLLJ.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.LJLLILLLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator = this.LJLLI;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        AnimatorSet animatorSet2 = this.LJLLJ;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    public void setDefaultIconWidth(int i) {
        this.LJLJLLL = i;
    }

    public void setText(int i) {
        this.LJLIL.setText(i);
    }

    public C46026I4o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        this.LJLJLLL = SFS.LJI(32.0d);
        this.LJLL = false;
        this.LJLLILLLL = null;
        this.LJLLJ = null;
        if (L1D.LIZIZ() || L1D.LIZ()) {
            i = R.layout.dtn;
        } else {
            i = R.layout.dtm;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i, this, true);
        this.LJLILLLLZI = (W5X) LLLLIILL.findViewById(R.id.fc4);
        this.LJLIL = (TuxTextView) LLLLIILL.findViewById(R.id.mpt);
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableFrontFlash()) {
            this.LJLIL.setShadowLayer(C74275TDb.LIZ(6.0f), 0.0f, 0.0f, C79045V0n.LJI(R.attr.d6, getContext()).intValue());
        }
        this.LJLJI = (ImageView) LLLLIILL.findViewById(R.id.n_d);
        this.LJLJJI = (RelativeLayout) LLLLIILL.findViewById(R.id.dec);
        this.LJLJJL = (ViewStub) LLLLIILL.findViewById(R.id.ng3);
        this.LJLJL = (ViewStub) LLLLIILL.findViewById(R.id.ng2);
        if (C58B.LIZ()) {
            this.LJLILLLLZI.getHierarchy().LJIL(V8L.LIZIZ(getRoundRadius()));
        }
        this.LJLILLLLZI.setOutlineProvider(new C46028I4q(0.0f, Float.valueOf(getRoundRadius())));
        this.LJLILLLLZI.setClipToOutline(true);
    }

    public final void LIZJ(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i2;
        this.LJLJJI.setLayoutParams(layoutParams);
    }

    public final void LIZLLL(int i, int i2, int i3) {
        LIZJ(i, i2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
        marginLayoutParams.setMargins(i3, i3, i3, i3);
        this.LJLILLLLZI.setLayoutParams(marginLayoutParams);
        if (!C58B.LIZ()) {
            this.LJLJI.setImageResource(R.drawable.a7x);
        } else {
            this.LJLJI.setImageResource(R.drawable.a7y);
        }
    }

    @Override // X.InterfaceC44146HUg
    public final void LIZ(boolean z, int i, List<MediaModel> list, AbstractC45692HwW abstractC45692HwW) {
        MediaModel mediaModel;
        if (z) {
            if (i == 1 || i == 3 || (e1.LIZ(31744, "creative_tools_upload_icon_cover_support_video", true, false) && i == 4)) {
                if (C46029I4r.LIZIZ()) {
                    if (list != null) {
                        if (list.size() > 1) {
                            MediaModel mediaModel2 = (MediaModel) ListProtector.get(list, 1);
                            MediaModel mediaModel3 = (MediaModel) ListProtector.get(list, 0);
                            W5X w5x = (W5X) this.LJLJL.inflate();
                            this.LJLJLJ = w5x;
                            w5x.setOutlineProvider(new C46028I4q(0.0f, Float.valueOf(getRoundRadius())));
                            this.LJLJLJ.setClipToOutline(true);
                            if (C58B.LIZ()) {
                                this.LJLJLJ.getHierarchy().LJIL(V8L.LIZIZ(getRoundRadius()));
                            }
                            LJFF(mediaModel2, this.LJLILLLLZI, mediaModel3, this.LJLJLJ, false);
                            return;
                        }
                        if (list.size() <= 0) {
                            return;
                        }
                        LJFF((MediaModel) ListProtector.get(list, 0), this.LJLILLLLZI, null, null, false);
                        return;
                    }
                    return;
                }
                if (C46029I4r.LIZJ()) {
                    if (list == null) {
                        return;
                    }
                    if (list.size() > 1) {
                        MediaModel mediaModel4 = (MediaModel) ListProtector.get(list, 0);
                        MediaModel mediaModel5 = (MediaModel) ListProtector.get(list, 1);
                        FrameLayout frameLayout = (FrameLayout) this.LJLJJL.inflate();
                        this.LJLJJLL = frameLayout;
                        LJFF(mediaModel4, this.LJLILLLLZI, mediaModel5, (W5X) frameLayout.findViewById(R.id.fc6), false);
                        return;
                    }
                    if (list.size() <= 0) {
                        return;
                    }
                    this.LJLJJLL = (FrameLayout) this.LJLJJL.inflate();
                    LJFF((MediaModel) ListProtector.get(list, 0), this.LJLILLLLZI, null, null, true);
                    return;
                }
                int measuredWidth = this.LJLILLLLZI.getMeasuredWidth();
                if (measuredWidth <= 0) {
                    measuredWidth = this.LJLJLLL;
                }
                if (list == null || list.size() <= 0 || (mediaModel = (MediaModel) ListProtector.get(list, 0)) == null) {
                    return;
                }
                if (C45871HzP.LIZ()) {
                    this.LJLILLLLZI.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    C42606Gnq.LIZ(this.LJLILLLLZI, mediaModel, new Size(measuredWidth, measuredWidth), new AObjectS42S0101000_5(2, this, 15));
                } else {
                    C78764Uvg.LIZLLL(this.LJLILLLLZI, C44694HgQ.LJIIIIZZ(mediaModel.fileLocalUriPath), measuredWidth, measuredWidth, null, null, new IDdS474S0100000_7(this, 1));
                }
            }
        }
    }

    public final void LJFF(MediaModel mediaModel, W5X w5x, MediaModel mediaModel2, W5X w5x2, boolean z) {
        int measuredWidth = w5x.getMeasuredWidth();
        if (measuredWidth <= 0) {
            measuredWidth = this.LJLJLLL;
        }
        if (mediaModel != null) {
            if (C45871HzP.LIZ()) {
                AObjectS42S0110000_7 aObjectS42S0110000_7 = new AObjectS42S0110000_7(this, z, 1);
                w5x.setScaleType(ImageView.ScaleType.CENTER_CROP);
                C42606Gnq.LIZ(w5x, mediaModel, new Size(measuredWidth, measuredWidth), aObjectS42S0110000_7);
                if (mediaModel2 != null) {
                    w5x2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    C42606Gnq.LIZ(w5x2, mediaModel2, new Size(measuredWidth, measuredWidth), aObjectS42S0110000_7);
                    return;
                }
                return;
            }
            C46027I4p c46027I4p = new C46027I4p(this, z);
            C78764Uvg.LIZLLL(w5x, C44694HgQ.LJIIIIZZ(mediaModel.fileLocalUriPath), measuredWidth, measuredWidth, null, null, c46027I4p);
            if (mediaModel2 == null) {
                return;
            }
            C78764Uvg.LIZLLL(w5x2, C44694HgQ.LJIIIIZZ(mediaModel2.fileLocalUriPath), measuredWidth, measuredWidth, null, null, c46027I4p);
        }
    }
}
