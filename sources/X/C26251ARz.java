package X;

import Y.ACListenerS24S0100000_4;
import Y.AUListenerS93S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.ARz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26251ARz extends ASB {
    public static final int LJLJLLL = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
    public static final InterpolatorC216808f6 LJLL = new InterpolatorC216808f6(0.25f, 0.1f, 0.25f, 1.0f);
    public final C62435Oet LJLJJI;
    public final AS3 LJLJJL;
    public final ViewGroup LJLJJLL;
    public final ViewGroup LJLJL;
    public AnimatorSet LJLJLJ;

    @Override // X.ASB
    public final String LIZLLL() {
        return "secondary_hashtag";
    }

    @Override // X.ASG
    public final void LIZ(View v) {
        String str;
        String str2;
        Integer num;
        boolean z;
        C18Z c18z;
        User author;
        o.LJIIIZ(v, "v");
        C188727au c188727au = new C188727au();
        Aweme aweme = this.LJLILLLLZI;
        ViewGroup.LayoutParams layoutParams = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        Aweme aweme3 = this.LJLILLLLZI;
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            num = Integer.valueOf(author.getFollowStatus());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "follow_status");
        FMX.LJIIL("filter_hashtag_click_more", c188727au.LIZ);
        ViewGroup viewGroup = this.LJLJL;
        if (viewGroup != null && viewGroup.getChildCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AS6 as6 = new AS6(this.LJLJJI.LJLJJL);
            C62435Oet c62435Oet = this.LJLJJI;
            AS3 as3 = this.LJLJJL;
            c62435Oet.getClass();
            C26245ARt c26245ARt = new C26245ARt(c62435Oet, as3);
            c26245ARt.LJLJLLL = new AqS154S0100000_4(c26245ARt, 1124);
            as6.LJJLJLI(new C26276ASy(new AS9(0, R.string.hmd), c26245ARt));
            AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 1123);
            as6.LJLJI.setVisibility(0);
            C16880lQ.LJIILLIIL(as6.LJLJI, new ACListenerS24S0100000_4(aqS154S0100000_4, 252));
            ViewGroup viewGroup2 = this.LJLJL;
            if (viewGroup2 != null) {
                viewGroup2.addView(as6);
            }
            Aweme aweme4 = this.LJLJJI.LJLIL;
            if (aweme4 != null && !C78886Uxe.LJJIJ(aweme4.getTextExtra())) {
                IComplianceBusinessService LJFF = a.LJFF();
                C62435Oet c62435Oet2 = this.LJLJJI;
                ViewGroup LJJ = LJFF.LJJ(c62435Oet2.LJLJJL, c62435Oet2.LJLIL, new AqS170S0100000_4(this, 973));
                if (LJJ != null) {
                    ViewGroup viewGroup3 = this.LJLJL;
                    o.LJI(viewGroup3);
                    LJJ.measure(View.MeasureSpec.makeMeasureSpec(viewGroup3.getWidth(), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(O6R.LJJIIZ(KL2.LJIIIZ(this.LJLJJI.LJLJJL) * 0.5f) - as6.getHeight(), LiveLayoutPreloadThreadPriority.DEFAULT));
                }
                ViewGroup viewGroup4 = this.LJLJL;
                if (viewGroup4 != null) {
                    viewGroup4.addView(LJJ);
                }
            }
        }
        ViewGroup viewGroup5 = this.LJLJL;
        if (viewGroup5 != null) {
            viewGroup5.measure(View.MeasureSpec.makeMeasureSpec(viewGroup5.getWidth(), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(O6R.LJJIIZ(KL2.LJIIIZ(this.LJLJJI.LJLJJL) * 0.5f), LiveLayoutPreloadThreadPriority.DEFAULT));
        }
        AnimatorSet animatorSet = this.LJLJLJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(1f, 0f)");
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 28));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(0f, 1f)");
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new AUListenerS93S0100000_4(this, 30));
        int i = LJLJLLL;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        o.LJIIIIZZ(ofInt, "ofInt(0, XOFFSET)");
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 32));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(-i, 0);
        o.LJIIIIZZ(ofInt2, "ofInt(-XOFFSET, 0)");
        ofInt2.setDuration(300L);
        ofInt2.addUpdateListener(new AUListenerS93S0100000_4(this, 34));
        ViewGroup viewGroup6 = this.LJLJJLL;
        o.LJI(viewGroup6);
        ViewGroup viewGroup7 = this.LJLJL;
        o.LJI(viewGroup7);
        ValueAnimator ofInt3 = ValueAnimator.ofInt(viewGroup6.getMeasuredHeight(), viewGroup7.getMeasuredHeight());
        o.LJIIIIZZ(ofInt3, "ofInt(mOptionsView!!.mea…yLayout!!.measuredHeight)");
        ofInt3.setDuration(300L);
        ofInt3.addUpdateListener(new AUListenerS93S0100000_4(this, 36));
        int LJ = C60996Nwm.LJ(EF7.LIZIZ());
        ViewGroup viewGroup8 = this.LJLJL;
        if (viewGroup8 != null) {
            layoutParams = viewGroup8.getLayoutParams();
        }
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = marginLayoutParams.topMargin;
        ViewGroup viewGroup9 = this.LJLJL;
        o.LJI(viewGroup9);
        new AS2(marginLayoutParams, (LJ - viewGroup9.getMeasuredHeight()) / 2, i2, this).setDuration(200L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LJLJLJ = animatorSet2;
        animatorSet2.setInterpolator(LJLL);
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2, ofInt3);
        animatorSet2.start();
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
    public C26251ARz(C62435Oet actionsManager, AS3 as3) {
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
