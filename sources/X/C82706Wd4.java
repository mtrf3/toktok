package X;

import Y.ALAdapterS11S0100000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.VideoProgressBarWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Wd4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82706Wd4 extends AbstractC54946LhO implements Observer<C207668Da> {
    public C81147Vt1 LJLJJI;
    public C5S5 LJLJJL;
    public AnonymousClass961 LJLJJLL;
    public AnimatorSet LJLJL;
    public AnimatorSet LJLJLJ;
    public AnimatorSet LJLJLLL;
    public boolean LJLL;
    public long LJLLI;

    @Override // X.AbstractC54946LhO
    public final String LIZIZ() {
        return "progress_bar";
    }

    public final void LJI() {
        if (this.LJLJJL == null || this.LJLJJI == null) {
            return;
        }
        AnimatorSet animatorSet = this.LJLJLLL;
        if (animatorSet != null) {
            o.LJI(animatorSet);
            animatorSet.cancel();
        }
        C5S5 c5s5 = this.LJLJJL;
        o.LJI(c5s5);
        c5s5.setAlpha(0.0f);
        C81147Vt1 c81147Vt1 = this.LJLJJI;
        o.LJI(c81147Vt1);
        c81147Vt1.setAlpha(1.0f);
    }

    public final void LJII() {
        if (this.LJLJJL == null || this.LJLJJI == null) {
            return;
        }
        if (this.LJLJLJ == null && this.LJLJL == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.LJLJLLL = animatorSet;
        C5S5 c5s5 = this.LJLJJL;
        o.LJI(c5s5);
        AnimatorSet.Builder play = animatorSet.play(c5s5.getShowAnim());
        C81147Vt1 c81147Vt1 = this.LJLJJI;
        o.LJI(c81147Vt1);
        play.after(c81147Vt1.getHideVolumeAnim());
        AnimatorSet animatorSet2 = this.LJLJLLL;
        o.LJI(animatorSet2);
        animatorSet2.start();
    }

    @Override // X.AbstractC54946LhO
    public final void LJFF() {
        LJI();
        AnimatorSet animatorSet = this.LJLJL;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
            AnimatorSet animatorSet2 = this.LJLJL;
            o.LJI(animatorSet2);
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.LJLJLJ;
        if (animatorSet3 != null) {
            C16880lQ.LJLJJL(animatorSet3);
            AnimatorSet animatorSet4 = this.LJLJLJ;
            o.LJI(animatorSet4);
            animatorSet4.cancel();
        }
        C81147Vt1 c81147Vt1 = this.LJLJJI;
        if (c81147Vt1 != null) {
            c81147Vt1.LJLJJI = null;
        }
        AnonymousClass961 anonymousClass961 = this.LJLJJLL;
        if (anonymousClass961 != null) {
            anonymousClass961.LIZIZ();
            AnonymousClass961 anonymousClass9612 = this.LJLJJLL;
            o.LJI(anonymousClass9612);
            anonymousClass9612.clearAnimation();
        }
        C5S5 c5s5 = this.LJLJJL;
        if (c5s5 != null) {
            c5s5.clearAnimation();
        }
        C42625Go9.LIZJ(this);
    }

    public final void LJIIIIZZ() {
        Aweme aweme;
        VideoControl videoControl;
        C5S5 c5s5;
        Video video;
        this.LJLLI = SystemClock.elapsedRealtime();
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 == null) {
            return;
        }
        Integer num = null;
        if (aweme2.getVideoControl() != null && (aweme = this.LJLILLLLZI) != null && (videoControl = aweme.getVideoControl()) != null && videoControl.showProgressBar == 1) {
            C5S5 c5s52 = this.LJLJJL;
            if (c5s52 != null) {
                c5s52.setProgress(0);
            }
            Aweme aweme3 = this.LJLILLLLZI;
            if (aweme3 != null && aweme3.getVideo() != null && (c5s5 = this.LJLJJL) != null) {
                Aweme aweme4 = this.LJLILLLLZI;
                if (aweme4 != null && (video = aweme4.getVideo()) != null) {
                    num = Integer.valueOf(video.getDuration());
                }
                o.LJI(num);
                c5s5.setMax(num.intValue());
            }
            C27740Aue.LJIIIZ(0, this.LJLJJL);
            return;
        }
        C27740Aue.LJIIIZ(8, this.LJLJJL);
    }

    @Override // X.AbstractC54946LhO
    public final void LIZ(LV8 lv8) {
        super.LIZ(lv8);
        C81147Vt1 c81147Vt1 = this.LJLJJI;
        if (c81147Vt1 != null) {
            c81147Vt1.setOnAudioControlViewHideListener(new C82707Wd5(this));
        }
    }

    @Override // X.AbstractC54946LhO
    public final void LIZJ(View view) {
        if (view instanceof FrameLayout) {
            ViewGroup viewGroup = (ViewGroup) view;
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bfp, C16880lQ.LLZIL(viewGroup.getContext()), null);
            this.LJLJJI = (C81147Vt1) LLLZIIL.findViewById(R.id.a_g);
            this.LJLJJL = (C5S5) LLLZIIL.findViewById(R.id.n72);
            this.LJLJJLL = (AnonymousClass961) LLLZIIL.findViewById(R.id.fs7);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C17N.LJIILL(1.0d));
            layoutParams.gravity = 80;
            if (C61451O9v.LIZ().LJ) {
                int LJIILL = C17N.LJIILL(8.0d);
                layoutParams.leftMargin = LJIILL;
                layoutParams.rightMargin = LJIILL;
            }
            viewGroup.addView(LLLZIIL, layoutParams);
        }
    }

    @Override // X.AbstractC54946LhO
    public final void LJ(DataCenter dataCenter) {
        dataCenter.iv0("load_progress_bar", this, false);
        dataCenter.iv0("on_page_unselected", this, false);
        dataCenter.iv0("on_page_selected", this, false);
        dataCenter.iv0("stop_animation", this, false);
        dataCenter.iv0("on_play_progress_change", this, false);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        Integer num;
        Video video;
        Video video2;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null) {
            return;
        }
        String str = c207668Da2.LIZ;
        Object obj = null;
        switch (str.hashCode()) {
            case -1121670825:
                if (!str.equals("on_play_progress_change")) {
                    return;
                }
                Object obj2 = c207668Da2.LIZIZ;
                if (obj2 == null) {
                    obj2 = null;
                }
                Float progress = (Float) obj2;
                o.LJIIIIZZ(progress, "progress");
                float floatValue = progress.floatValue();
                if (this.LJLILLLLZI == null) {
                    return;
                }
                C5S5 c5s5 = this.LJLJJL;
                if (c5s5 != null && c5s5.getProgress() == 0 && SystemClock.elapsedRealtime() < this.LJLLI + 600) {
                    return;
                }
                C5S5 c5s52 = this.LJLJJL;
                if (c5s52 != null) {
                    Aweme aweme = this.LJLILLLLZI;
                    if (aweme != null && (video = aweme.getVideo()) != null) {
                        num = Integer.valueOf(video.getDuration());
                    } else {
                        num = null;
                    }
                    o.LJI(num);
                    c5s52.setMax(num.intValue());
                }
                C5S5 c5s53 = this.LJLJJL;
                if (c5s53 == null) {
                    return;
                }
                Aweme aweme2 = this.LJLILLLLZI;
                if (aweme2 != null && (video2 = aweme2.getVideo()) != null) {
                    obj = Double.valueOf((floatValue / 100.0d) * video2.getDuration());
                }
                o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
                c5s53.setProgress(((Integer) obj).intValue());
                return;
            case -904341062:
                if (!str.equals("load_progress_bar")) {
                    return;
                }
                Object obj3 = c207668Da2.LIZIZ;
                if (obj3 != null) {
                    obj = obj3;
                }
                Boolean loadingProgressState = (Boolean) obj;
                o.LJIIIIZZ(loadingProgressState, "loadingProgressState");
                if (loadingProgressState.booleanValue()) {
                    AnonymousClass961 anonymousClass961 = this.LJLJJLL;
                    if (anonymousClass961 == null) {
                        return;
                    }
                    anonymousClass961.LIZJ();
                    return;
                }
                AnonymousClass961 anonymousClass9612 = this.LJLJJLL;
                if (anonymousClass9612 == null) {
                    return;
                }
                anonymousClass9612.LIZLLL();
                return;
            case -301890681:
                if (!str.equals("stop_animation") || this.LJLL) {
                    return;
                }
                C5S5 c5s54 = this.LJLJJL;
                if (c5s54 != null) {
                    c5s54.setProgress(0);
                    c5s54.clearAnimation();
                    c5s54.setVisibility(4);
                }
                AnonymousClass961 anonymousClass9613 = this.LJLJJLL;
                if (anonymousClass9613 == null) {
                    return;
                }
                anonymousClass9613.clearAnimation();
                anonymousClass9613.LIZIZ();
                return;
            case 350216171:
                if (!str.equals("on_page_selected")) {
                    return;
                }
                this.LJLL = true;
                LJII();
                LJIIIIZZ();
                return;
            case 1628582276:
                if (!str.equals("on_page_unselected")) {
                    return;
                }
                this.LJLL = false;
                LJIIIIZZ();
                AnonymousClass961 anonymousClass9614 = this.LJLJJLL;
                if (anonymousClass9614 == null) {
                    return;
                }
                anonymousClass9614.LIZLLL();
                return;
            default:
                return;
        }
    }

    @QD3
    public final void onVolumeChangeEvent(O6A event) {
        HandlerC81148Vt2 handlerC81148Vt2;
        o.LJIIIZ(event, "event");
        C81147Vt1 c81147Vt1 = this.LJLJJI;
        if (c81147Vt1 != null && (handlerC81148Vt2 = c81147Vt1.LJLJLJ) != null && handlerC81148Vt2.LJFF) {
            return;
        }
        C5S5 c5s5 = this.LJLJJL;
        if (c5s5 != null) {
            c5s5.setAlpha(0.0f);
        }
        ObjectAnimator objectAnimator = null;
        if (event.LJLIL) {
            if (this.LJLJJI == null || this.LJLJJL == null) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.LJLJLJ = animatorSet;
            C81147Vt1 c81147Vt12 = this.LJLJJI;
            o.LJI(c81147Vt12);
            AnimatorSet.Builder play = animatorSet.play(c81147Vt12.getShowVolumeAnim());
            C5S5 c5s52 = this.LJLJJL;
            if (c5s52 != null) {
                objectAnimator = c5s52.getHideAnim();
            }
            play.after(objectAnimator);
            AnimatorSet animatorSet2 = this.LJLJLJ;
            o.LJI(animatorSet2);
            animatorSet2.addListener(new ALAdapterS11S0100000_14(this, 9));
            AnimatorSet animatorSet3 = this.LJLJLJ;
            o.LJI(animatorSet3);
            animatorSet3.start();
            return;
        }
        if (this.LJLJJI == null || this.LJLJJL == null) {
            return;
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.LJLJL = animatorSet4;
        C81147Vt1 c81147Vt13 = this.LJLJJI;
        o.LJI(c81147Vt13);
        AnimatorSet.Builder play2 = animatorSet4.play(c81147Vt13.getShowVolumeAnim());
        C5S5 c5s53 = this.LJLJJL;
        if (c5s53 != null) {
            objectAnimator = c5s53.getHideAnim();
        }
        play2.after(objectAnimator);
        AnimatorSet animatorSet5 = this.LJLJL;
        o.LJI(animatorSet5);
        animatorSet5.addListener(new ALAdapterS11S0100000_14(this, 10));
        AnimatorSet animatorSet6 = this.LJLJL;
        o.LJI(animatorSet6);
        animatorSet6.start();
    }

    public C82706Wd4(VideoProgressBarWidget videoProgressBarWidget, View view) {
        super(view);
        this.LJLL = true;
        C42625Go9.LIZIZ(this);
        videoProgressBarWidget.LJIIIZ();
    }
}
