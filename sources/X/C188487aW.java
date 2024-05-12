package X;

import Y.IDCSpanS29S0100000_3;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* renamed from: X.7aW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188487aW {
    public static final /* synthetic */ int LJ = 0;
    public final Fragment LIZ;
    public final ActivityC45651qj LIZIZ;
    public final GiftViewModel LIZJ;
    public SY4 LIZLLL;

    public final C177336xd LIZLLL() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55230Lly.LIZJ(this.LIZ, null), C177336xd.class, "source_default_key");
        if (LIZLLL == null) {
            return null;
        }
        return (C177336xd) LIZLLL.getSource();
    }

    public final void LJI() {
        SY4 sy4 = this.LIZLLL;
        if (sy4 == null) {
            return;
        }
        sy4.setText(C16880lQ.LLLLLILLIL(this.LIZIZ).getString(R.string.qic));
    }

    public final String LIZ() {
        Aweme aweme;
        String authorUid;
        C177336xd LIZLLL = LIZLLL();
        if (LIZLLL == null || (aweme = LIZLLL.LJLLI) == null || (authorUid = aweme.getAuthorUid()) == null) {
            return "";
        }
        return authorUid;
    }

    public final String LIZIZ() {
        String str;
        C177336xd LIZLLL = LIZLLL();
        if (LIZLLL == null || (str = LIZLLL.LJLJJLL) == null) {
            return "";
        }
        return str;
    }

    public final String LIZJ() {
        Aweme aweme;
        String aid;
        C177336xd LIZLLL = LIZLLL();
        if (LIZLLL == null || (aweme = LIZLLL.LJLLI) == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    public final void LJ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LIZIZ());
        c188727au.LJIIIZ("group_id", LIZJ());
        c188727au.LJIIIZ("author_id", LIZ());
        c188727au.LJIIIZ("enter_method", str);
        c188727au.LJFF(this.LIZJ.iv0().getValue(), "current_balance");
        FMX.LJIIL("dismiss_underage_recharge_prompt", c188727au.LIZ);
    }

    public C188487aW(Fragment fragment, ActivityC45651qj context, GiftViewModel giftViewModel) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(giftViewModel, "giftViewModel");
        this.LIZ = fragment;
        this.LIZIZ = context;
        this.LIZJ = giftViewModel;
    }

    public final void LJFF(long j, String str, boolean z) {
        ForegroundColorSpan foregroundColorSpan;
        ICompliancePolicyService LJII;
        C62046OWs LJJJJIZL = LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL();
        o.LJIIIIZZ(LJJJJIZL, "get().getService(ILiveOu…e.liveOuterSettingService");
        Boolean bool = (Boolean) LJJJJIZL.LIZJ(Boolean.TRUE, "can_recharge");
        Integer ageLimit = (Integer) LJJJJIZL.LIZJ(18, "low_age_user_limit");
        String str2 = "";
        String str3 = (String) LJJJJIZL.LIZJ("", "live_sdk_appeal_webview");
        if (V0N.LJJII(str3)) {
            if (C85990Xow.LJIIIZ()) {
                str3 = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                str3 = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        if (!bool.booleanValue()) {
            o.LJIIIIZZ(ageLimit, "ageLimit");
            int intValue = ageLimit.intValue();
            C26227ARb c26227ARb = new C26227ARb(this.LIZIZ);
            c26227ARb.LIZIZ(this.LIZIZ.getResources().getString(R.string.tq7, String.valueOf(intValue)));
            UC0.LIZJ(c26227ARb, new AqS57S1100000_3(this, str3, 44));
            c26227ARb.LJI().LIZLLL();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", LIZIZ());
            c188727au.LJIIIZ("group_id", LIZJ());
            c188727au.LJIIIZ("author_id", LIZ());
            c188727au.LJFF(this.LIZJ.iv0().getValue(), "current_balance");
            FMX.LJIIL("show_underage_recharge_prompt", c188727au.LIZ);
            return;
        }
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("video_enter_from", LIZIZ());
        oszArr[1] = new OSZ("video_enter_method", LIZIZ());
        oszArr[2] = new OSZ("video_group_id", LIZJ());
        oszArr[3] = new OSZ("video_author_id", LIZ());
        String str4 = this.LIZJ.LJLJLLL;
        if (str4 != null) {
            str2 = str4;
        }
        oszArr[4] = new OSZ("video_request_id", str2);
        oszArr[5] = new OSZ("charge_reason", str);
        java.util.Map LJJL = C113554cx.LJJL(oszArr);
        Bundle bundle = new Bundle();
        bundle.putInt("key_bundle_charge_source", 4);
        bundle.putString("key_charge_reason", "short_video");
        bundle.putBoolean("key_bundle_is_central_mode", z);
        C77610Ud4 c77610Ud4 = new C77610Ud4();
        if (!VideoGiftService.LJI().LIZIZ()) {
            String LIZ = C03660Ck.LIZ(this.LIZIZ, R.string.tq6, "context.resources.getStr…ideogifts_recharge_title)");
            String LIZ2 = C03660Ck.LIZ(this.LIZIZ, R.string.tq3, "context.resources.getStr…videogifts_recharge_desc)");
            String LIZ3 = C03660Ck.LIZ(this.LIZIZ, R.string.tq5, "context.resources.getStr…ideogifts_recharge_learn)");
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZIZ), R.layout.r0, null, false);
            View findViewById = LLLLIILL.findViewById(R.id.ipx);
            o.LJII(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(LIZ);
            View findViewById2 = LLLLIILL.findViewById(R.id.ipt);
            o.LJII(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById2;
            String LIZJ = C0ON.LIZJ(LIZ2, "  ", LIZ3, "  ");
            SpannableString spannableString = new SpannableString(LIZJ);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_chevron_right_offset_fill_ltr;
            c2068389v.LJ = Integer.valueOf(R.attr.eb);
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
            C8FR c8fr = new C8FR(c2068389v.LIZ(this.LIZIZ), 2);
            StyleSpan styleSpan = new StyleSpan(1);
            Integer LJI = C79045V0n.LJI(R.attr.e3, this.LIZIZ);
            if (LJI != null) {
                foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
            } else {
                foregroundColorSpan = null;
            }
            int LJJLIIIJL = s.LJJLIIIJL(LIZJ, LIZ3, 0, false, 6);
            int length = LIZ3.length() + LJJLIIIJL;
            spannableString.setSpan(styleSpan, LJJLIIIJL, length, 33);
            spannableString.setSpan(foregroundColorSpan, LJJLIIIJL, length, 33);
            spannableString.setSpan(c8fr, LIZJ.length() - 1, LIZJ.length(), 33);
            IDCSpanS29S0100000_3 iDCSpanS29S0100000_3 = new IDCSpanS29S0100000_3(this, 8);
            if (C188517aZ.LIZ() && (LJII = a.LJII()) != null) {
                LJII.LIZ(new O0X(AGJ.GIFT_RECHARGE_PAGE.getValue(), "virtual-items", false, false, 28));
            }
            spannableString.setSpan(iDCSpanS29S0100000_3, LJJLIIIJL, LIZJ.length(), 33);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            c77610Ud4.LIZ = LLLLIILL;
        } else {
            bundle.putLong("key_bundle_total_coins", j);
        }
        ((HashMap) c77610Ud4.LIZIZ).putAll(LJJL);
        DialogFragment createRechargeDialogFragment = LiveOuterService.LJJJLL().LJJIJIL().createRechargeDialogFragment(this.LIZIZ, new InterfaceC77682UeE() { // from class: X.72q
            @Override // X.InterfaceC77682UeE
            public final void LIZIZ(int i, int i2, String str5) {
            }

            @Override // X.InterfaceC77682UeE
            public final void LIZ(Exception exc) {
                C188487aW c188487aW = C188487aW.this;
                c188487aW.LIZJ.ov0(0, 0L, c188487aW.LIZIZ, "from_recharge");
            }

            @Override // X.InterfaceC77682UeE
            public final void onSuccess(long j2) {
                C188487aW c188487aW = C188487aW.this;
                c188487aW.LIZJ.ov0(1, j2, c188487aW.LIZIZ, "from_recharge");
                C188487aW.this.LJI();
            }
        }, bundle, c77610Ud4.LIZ());
        o.LJIIIIZZ(createRechargeDialogFragment, "fun showRechargeDialog(c…ntGiftChoosePanel\")\n    }");
        createRechargeDialogFragment.showNow(this.LIZ.getChildFragmentManager(), "CommentGiftChoosePanel");
    }
}
