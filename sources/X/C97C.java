package X;

import Y.ARunnableS40S0100000_4;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC55642Lsc("one_minute_notice_popup_task")
/* renamed from: X.97C, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C97C extends AbstractC56327M8t<View> {
    public final ViewStub LJLIL;
    public final int LJLILLLLZI;
    public final Activity LJLJI;
    public View LJLJJI;
    public AnimatorSet LJLJJL;

    @Override // X.M74
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, android.view.View, X.96V] */
    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        int LIZIZ;
        ViewGroup.LayoutParams layoutParams;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(context, "context");
        ViewStub viewStub = this.LJLIL;
        if (viewStub == null) {
            return viewStub;
        }
        View inflate = viewStub.inflate();
        if (C53765L8f.LJIIJJI()) {
            LIZIZ = 0;
        } else {
            LIZIZ = C7MY.LIZIZ(44);
        }
        if (inflate != null) {
            layoutParams = inflate.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = LIZIZ;
        }
        View findViewById = this.LJLJI.findViewById(this.LJLILLLLZI);
        o.LJII(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
        final C68322mC c68322mC = new C68322mC();
        ?? c96v = new C96V(this.LJLJI);
        c68322mC.element = c96v;
        c96v.setVisibility(8);
        ((ViewGroup) findViewById).addView((View) c68322mC.element);
        T t = c68322mC.element;
        if (t == 0) {
            return null;
        }
        ((C96V) t).setOnInternalClickListener(new C96N() { // from class: X.97J
            @Override // X.C96N
            public final void LIZ() {
                c68322mC.element.setVisibility(8);
                Keva repo = Keva.getRepo("keva_repo_landscape_component");
                repo.storeInt("x_clicked_count", repo.getInt("x_clicked_count", 0) + 1);
                repo.storeLong("last_time_x_clicked", System.currentTimeMillis());
            }

            @Override // X.C96N
            public final void LIZIZ() {
                c68322mC.element.setVisibility(8);
                C38281F0r c38281F0r = new C38281F0r(C774732h.LIZ());
                c38281F0r.LIZLLL("enter_from", "personal_homepage");
                SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLJI, "//webview");
                buildRoute.withParam("url", c38281F0r.LJ());
                buildRoute.withParam("hide_nav_bar", true);
                buildRoute.withParam("enter_from", "personal_homepage");
                buildRoute.open();
                Keva.getRepo("keva_repo_landscape_component").storeBoolean("learn_more_entered", true);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("current_page", "personal_homepage");
                c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
                c188727au.LJIIIZ("enter_from", "personal_homepage");
                FMX.LJIIL("click_long_video_intro", c188727au.LIZ);
            }
        });
        if (Keva.getRepo("keva_repo_landscape_component").getInt("x_clicked_count", 0) == 0) {
            i = R.string.jb2;
        } else {
            i = R.string.jb3;
        }
        C96V c96v2 = (C96V) c68322mC.element;
        Activity activity = this.LJLJI;
        String string = activity.getString(R.string.dzt);
        o.LJIIIIZZ(string, "activity.getString(tipStr2ID)");
        String string2 = activity.getString(i, QZZ.LIZIZ(' ', string));
        o.LJIIIIZZ(string2, "activity.getString(tipStr1ID, \" \" + tipStr2)");
        SpannableString spannableString = new SpannableString(string2);
        int LJJLIIIJL = s.LJJLIIIJL(spannableString, string, 0, false, 6);
        spannableString.setSpan(new ForegroundColorSpan((int) 4294847573L), LJJLIIIJL, string.length() + LJJLIIIJL, 33);
        spannableString.setSpan(new StyleSpan(1), LJJLIIIJL, string.length() + LJJLIIIJL, 33);
        c96v2.setTitleText(activity.getString(R.string.jb4));
        c96v2.setContextText(spannableString);
        View view = (View) c68322mC.element;
        this.LJLJJI = view;
        if (view != null) {
            view.post(new ARunnableS40S0100000_4(this, 15));
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("current_page", "personal_homepage");
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        FMX.LJIIL("long_video_intro_show", c188727au.LIZ);
        return c68322mC.element;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C97C(C235769Nc c235769Nc, ViewStub viewStub, ActivityC45651qj activity) {
        super(c235769Nc);
        o.LJIIIZ(activity, "activity");
        this.LJLIL = viewStub;
        this.LJLILLLLZI = R.id.i9i;
        this.LJLJI = activity;
    }
}
