package X;

import Y.AUListenerS93S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AS0 extends ASB {
    public static final int LJLJLLL = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
    public static final InterpolatorC216808f6 LJLL = new InterpolatorC216808f6(0.25f, 0.1f, 0.25f, 1.0f);
    public final InterfaceC26269ASr LJLJJI;
    public final AS3 LJLJJL;
    public final ViewGroup LJLJJLL;
    public final ViewGroup LJLJL;
    public AnimatorSet LJLJLJ;

    @Override // X.ASB
    public final String LIZLLL() {
        return "secondary_dislike";
    }

    public final void LJ() {
        String str;
        if (this.LJLJJI instanceof C62435Oet) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", ((C62435Oet) this.LJLJJI).LJLILLLLZI);
            Aweme aweme = ((C62435Oet) this.LJLJJI).LJLIL;
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            Aweme aweme2 = ((C62435Oet) this.LJLJJI).LJLIL;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            c188727au.LJIIIZ("author_id", str2);
            c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(((C62435Oet) this.LJLJJI).LJLIL)));
            c188727au.LJIIIZ("enter_method", "long_press");
            FMX.LJIIL("click_block_videos", c188727au.LIZ);
        }
    }

    @Override // X.ASG
    public final void LIZ(View v) {
        boolean z;
        C18Z c18z;
        Context context;
        Context context2;
        o.LJIIIZ(v, "v");
        ViewGroup viewGroup = this.LJLJL;
        if (viewGroup != null && viewGroup.getChildCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            AS3 as3 = this.LJLJJL;
            if (as3 == null || (context = as3.getContext()) == null) {
                return;
            }
            AS6 as6 = new AS6(context);
            as6.LJJLJLI(new C26276ASy(new AS9(0, R.string.iqu, ""), this.LJLJJI.LIZ(this.LJLJJL)));
            ViewGroup viewGroup2 = this.LJLJL;
            if (viewGroup2 != null) {
                viewGroup2.addView(as6);
            }
            int i = 0;
            for (AS4 as4 : this.LJLJJI.LIZLLL(this.LJLJJL)) {
                int i2 = i + 1;
                AS3 as32 = this.LJLJJL;
                if (as32 != null) {
                    context2 = as32.getContext();
                } else {
                    context2 = null;
                }
                AS1 as1 = new AS1(context2);
                if (i == 0) {
                    as1.LIZIZ(as4.LIZ, as4.LIZIZ, true);
                } else {
                    as1.LIZIZ(as4.LIZ, as4.LIZIZ, false);
                }
                ViewGroup viewGroup3 = this.LJLJL;
                if (viewGroup3 != null) {
                    viewGroup3.addView(as1);
                }
                i = i2;
            }
        }
        ViewGroup viewGroup4 = this.LJLJL;
        if (viewGroup4 != null) {
            viewGroup4.measure(View.MeasureSpec.makeMeasureSpec(viewGroup4.getWidth(), LiveLayoutPreloadThreadPriority.DEFAULT), 0);
        }
        AnimatorSet animatorSet = this.LJLJLJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(1f, 0f)");
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 38));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(0f, 1f)");
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new AUListenerS93S0100000_4(this, 39));
        int i3 = LJLJLLL;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i3);
        o.LJIIIIZZ(ofInt, "ofInt(0, XOFFSET)");
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 40));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(-i3, 0);
        o.LJIIIIZZ(ofInt2, "ofInt(-XOFFSET, 0)");
        ofInt2.setDuration(300L);
        ofInt2.addUpdateListener(new AUListenerS93S0100000_4(this, 41));
        ViewGroup viewGroup5 = this.LJLJJLL;
        o.LJI(viewGroup5);
        ViewGroup viewGroup6 = this.LJLJL;
        o.LJI(viewGroup6);
        ValueAnimator ofInt3 = ValueAnimator.ofInt(viewGroup5.getMeasuredHeight(), viewGroup6.getMeasuredHeight());
        o.LJIIIIZZ(ofInt3, "ofInt(mOptionsView!!.mea…yLayout!!.measuredHeight)");
        ofInt3.setDuration(300L);
        ofInt3.addUpdateListener(new AUListenerS93S0100000_4(this, 42));
        int LJ = C60996Nwm.LJ(EF7.LIZIZ());
        ViewGroup viewGroup7 = this.LJLJL;
        if (viewGroup7 != null) {
            layoutParams = viewGroup7.getLayoutParams();
        }
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i4 = marginLayoutParams.topMargin;
        ViewGroup viewGroup8 = this.LJLJL;
        o.LJI(viewGroup8);
        new C26250ARy(marginLayoutParams, (LJ - viewGroup8.getMeasuredHeight()) / 2, i4, this).setDuration(200L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LJLJLJ = animatorSet2;
        animatorSet2.setInterpolator(LJLL);
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2, ofInt3);
        animatorSet2.start();
        LJ();
        InterfaceC26269ASr interfaceC26269ASr = this.LJLJJI;
        if (interfaceC26269ASr instanceof C26270ASs) {
            C26270ASs c26270ASs = (C26270ASs) interfaceC26269ASr;
            String valueOf = String.valueOf(c26270ASs.LJLIL.extras.getLong("group_id", 0L));
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("room_id", valueOf);
            c188727au.LJIIIZ("anchor_id", c26270ASs.LJLIL.extras.getString("live_id", ""));
            c188727au.LJIIIZ("enter_from_merge", c26270ASs.LJLIL.extras.getString("enter_from", ""));
            c188727au.LJIIIZ("enter_method", c26270ASs.LJLIL.extras.getString("enter_method_live", ""));
            FMX.LJIIL("livesdk_dislike_sec_show", c188727au.LIZ);
        }
        Object obj = this.LJLJJL;
        if ((obj instanceof ATB) && (c18z = (C18Z) obj) != null) {
            c18z.findViewById(R.id.hht).setPadding(0, 0, 0, 0);
        }
    }

    @Override // X.ASG
    public final void LIZIZ(View v) {
        o.LJIIIZ(v, "v");
        LIZ(v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AS0(InterfaceC26269ASr actionsManager, AS3 as3) {
        super(actionsManager, as3);
        ViewGroup viewGroup;
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = actionsManager;
        this.LJLJJL = as3;
        if (as3 != null) {
            viewGroup = as3.LJIIIZ();
        } else {
            viewGroup = null;
        }
        this.LJLJJLL = viewGroup;
        this.LJLJL = as3 != null ? as3.LJII() : null;
    }
}
