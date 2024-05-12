package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.607, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass607 extends FrameLayout {
    public View LJLIL;
    public View LJLILLLLZI;
    public C8HF LJLJI;
    public TuxIconView LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public ImageView LJLJL;

    public final View getCancelMusicClickContainer() {
        return this.LJLJJL;
    }

    public final View getChooseMusicClickContainer() {
        return this.LJLILLLLZI;
    }

    public final View getChooseMusicDockerContentView() {
        return this.LJLIL;
    }

    public final TuxIconView getChooseMusicIconView() {
        return this.LJLJJI;
    }

    public final ImageView getChooseMusicLoadingView() {
        return this.LJLJL;
    }

    public final C8HF getChooseMusicTextView() {
        return this.LJLJI;
    }

    public final View getCutMusicClickContainer() {
        return this.LJLJJLL;
    }

    public static void LIZ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", shortVideoContext.LJI());
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
            c145995oB.LJI("enter_method", "entrance_icon");
            c145995oB.LJI("is_editor_pro", CardStruct.IStatusCode.DEFAULT);
            c145995oB.LJI("music_id", shortVideoContext.getMusicId());
            c145995oB.LJI("music_selected_method", "manual");
            if (!TextUtils.isEmpty(shortVideoContext.LJIIL())) {
                c145995oB.LIZLLL("music_selected_from", shortVideoContext.LJIIL());
            }
            FMX.LJIIL("unselect_music", c145995oB.LIZ);
        }
    }

    public static void LIZIZ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("music_selected_from", shortVideoContext.LJIIL());
            c145995oB.LJI("music_id", shortVideoContext.getMusicId());
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("type", "unselect");
            long currentTimeMillis = System.currentTimeMillis();
            Long l = shortVideoContext.lastMusicTitleTimeMills;
            o.LJIIIIZZ(l, "shortVideoContext.lastMusicTitleTimeMills");
            c145995oB.LIZIZ(currentTimeMillis - l.longValue(), "duration");
            FMX.LJIIL("show_music_title_duration", c145995oB.LIZ);
            shortVideoContext.lastMusicTitleTimeMills = -1L;
        }
    }

    public final void LIZJ(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        View view = this.LJLJJL;
        if (view == null) {
            return;
        }
        view.setVisibility(i);
    }

    public final void LIZLLL(AnonymousClass609 style) {
        o.LJIIIZ(style, "style");
        int i = AnonymousClass608.LIZ[style.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LJ(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            LIZJ(true);
            setUpCutVisibilityAB(false);
            return;
        }
        LJ(6.0d);
        LIZJ(false);
        setUpCutVisibilityAB(false);
    }

    public final void LJ(double d) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C8HF c8hf;
        C8HF c8hf2 = this.LJLJI;
        ViewGroup.LayoutParams layoutParams = null;
        if (c8hf2 != null) {
            layoutParams = c8hf2.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && (c8hf = this.LJLJI) != null) {
            C26338AVi.LJI(c8hf, Integer.valueOf(marginLayoutParams.getMarginStart()), Integer.valueOf(marginLayoutParams.topMargin), Integer.valueOf(SFS.LJI(d)), Integer.valueOf(marginLayoutParams.bottomMargin), false, 16);
        }
    }

    public final void setCancelMusicClickContainer(View view) {
        this.LJLJJL = view;
    }

    public final void setCancelMusicLayerListener(View.OnClickListener onClickListener) {
        View view = this.LJLJJL;
        if (view != null) {
            C16880lQ.LJIIJ(onClickListener, view);
        }
    }

    public final void setChooseMusicClickContainer(View view) {
        this.LJLILLLLZI = view;
    }

    public final void setChooseMusicDockerContentView(View view) {
        this.LJLIL = view;
    }

    public final void setChooseMusicIconView(TuxIconView tuxIconView) {
        this.LJLJJI = tuxIconView;
    }

    public final void setChooseMusicLayerListener(View.OnClickListener onClickListener) {
        View view = this.LJLILLLLZI;
        if (view != null) {
            C16880lQ.LJIIJ(onClickListener, view);
        }
    }

    public final void setChooseMusicLoadingView(ImageView imageView) {
        this.LJLJL = imageView;
    }

    public final void setChooseMusicTextView(C8HF c8hf) {
        this.LJLJI = c8hf;
    }

    public final void setContentViewListener(View.OnClickListener onClickListener) {
        View view = this.LJLIL;
        if (view != null) {
            C16880lQ.LJIIJ(onClickListener, view);
        }
    }

    public final void setCutMusicClickContainer(View view) {
        this.LJLJJLL = view;
    }

    public final void setCutMusicLayerListener(View.OnClickListener onClickListener) {
        View view = this.LJLJJLL;
        if (view != null) {
            C16880lQ.LJIIJ(onClickListener, view);
        }
    }

    public final void setUpCutVisibilityAB(boolean z) {
        if (!z) {
            TuxIconView tuxIconView = this.LJLJJI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
            }
            View view = this.LJLJJLL;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        TuxIconView tuxIconView2 = this.LJLJJI;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(8);
        }
        View view2 = this.LJLJJLL;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass607(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
