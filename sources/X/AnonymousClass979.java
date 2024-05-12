package X;

import Y.ARunnableS23S0200000_4;
import Y.ARunnableS38S0100000_2;
import Y.ARunnableS40S0100000_4;
import android.app.Activity;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.landscape.trafficincentives.OneMinuteTrafficIncentivesSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("profile_long_video_traffic_incentive_promo")
/* renamed from: X.979, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass979 extends AbstractC56327M8t<View> {
    public static final /* synthetic */ int LJLJL = 0;
    public final ViewStub LJLIL;
    public final int LJLILLLLZI;
    public final Activity LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Keva LJLJJL;
    public final Handler LJLJJLL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    @Override // X.M74
    public final boolean canShow() {
        return C97A.LIZIZ();
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        final String str;
        int LIZIZ;
        int i;
        Integer num;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(context, "context");
        ViewStub viewStub = this.LJLIL;
        C96V c96v = null;
        ViewGroup.LayoutParams layoutParams = null;
        if (viewStub != null) {
            OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig oneMinuteTrafficProfileConfig = (OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig) this.LJLJJI.getValue();
            if (oneMinuteTrafficProfileConfig == null || (str = oneMinuteTrafficProfileConfig.h5Url) == null) {
                str = "";
            }
            View inflate = viewStub.inflate();
            if (C53765L8f.LJIIJJI()) {
                LIZIZ = 0;
            } else {
                LIZIZ = C7MY.LIZIZ(52);
            }
            if (inflate != null) {
                layoutParams = inflate.getLayoutParams();
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = LIZIZ;
            }
            View findViewById = this.LJLJI.findViewById(this.LJLILLLLZI);
            o.LJII(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
            final C96V c96v2 = new C96V(this.LJLJI);
            c96v2.setVisibility(8);
            ((ViewGroup) findViewById).addView(c96v2);
            c96v2.setOnInternalClickListener(new C96N() { // from class: X.96M
                @Override // X.C96N
                public final void LIZ() {
                    AnonymousClass979 anonymousClass979 = AnonymousClass979.this;
                    C96V c96v3 = c96v2;
                    anonymousClass979.getClass();
                    if (c96v3 != null) {
                        c96v3.post(new ARunnableS40S0100000_4(c96v3, 150));
                    }
                    AnonymousClass979.this.LJLJJLL.removeCallbacksAndMessages(null);
                    Keva keva = AnonymousClass979.this.LJLJJL;
                    keva.storeInt("traffic_incentives_close_click", keva.getInt("traffic_incentives_close_click", 0) + 1);
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("current_page", "profile_page");
                    FMX.LJIIL("traffic_incentive_activity_notice_close", c188727au.LIZ);
                }

                @Override // X.C96N
                public final void LIZIZ() {
                    AnonymousClass979 anonymousClass979 = AnonymousClass979.this;
                    C96V c96v3 = c96v2;
                    anonymousClass979.getClass();
                    if (c96v3 != null) {
                        c96v3.post(new ARunnableS40S0100000_4(c96v3, 150));
                    }
                    AnonymousClass979.this.LJLJJLL.removeCallbacksAndMessages(null);
                    SmartRouter.buildRoute(AnonymousClass979.this.LJLJI, str).open();
                    Keva keva = AnonymousClass979.this.LJLJJL;
                    keva.storeInt("traffic_incentives_learn_more", keva.getInt("traffic_incentives_learn_more", 0) + 1);
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("current_page", "profile_page");
                    FMX.LJIIL("traffic_incentive_activity_notice_click", c188727au.LIZ);
                }
            });
            Activity activity = this.LJLJI;
            SpannableString spannableString = new SpannableString(activity.getString(R.string.sio));
            spannableString.setSpan(new ForegroundColorSpan((int) 4294847573L), 0, spannableString.length(), 33);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            c96v2.setTitleText(activity.getString(R.string.sin));
            c96v2.setContextText(spannableString);
            TuxTextView tuxTextView = (TuxTextView) c96v2.findViewById(R.id.cr1);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(51);
            }
            c96v2.post(new ARunnableS38S0100000_2(c96v2, 176));
            Handler handler = this.LJLJJLL;
            ARunnableS23S0200000_4 aRunnableS23S0200000_4 = new ARunnableS23S0200000_4(this, c96v2, 39);
            OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig oneMinuteTrafficProfileConfig2 = (OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig) this.LJLJJI.getValue();
            if (oneMinuteTrafficProfileConfig2 != null && (num = oneMinuteTrafficProfileConfig2.timeIntervalForAutoDismiss) != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            handler.postDelayed(aRunnableS23S0200000_4, i * 1000);
            Keva keva = this.LJLJJL;
            keva.storeInt("traffic_incentives_popup_show", keva.getInt("traffic_incentives_popup_show", 0) + 1);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("current_page", "profile_page");
            FMX.LJIIL("traffic_incentive_activity_notice_show", c188727au.LIZ);
            c96v = c96v2;
        }
        return c96v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass979(C235769Nc c235769Nc, ViewStub viewStub, ActivityC45651qj activity) {
        super(c235769Nc);
        o.LJIIIZ(activity, "activity");
        this.LJLIL = viewStub;
        this.LJLILLLLZI = R.id.i9i;
        this.LJLJI = activity;
        this.LJLJJI = C221108m2.LIZIZ(C97B.LJLIL);
        this.LJLJJL = Keva.getRepo(C97A.LIZ());
        this.LJLJJLL = new Handler(C16880lQ.LLJJJJ());
    }
}
