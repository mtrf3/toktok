package Y;

import X.BPP;
import X.BZI;
import X.C06490Nh;
import X.C0NB;
import X.C15380j0;
import X.C28787BRn;
import X.C29306Beo;
import X.C32364Cn2;
import X.C68322mC;
import X.C79045V0n;
import X.C7N;
import X.CN1;
import X.InterfaceC30442Bx8;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.livesetting.roomfunction.GpppaGiftBanHelpCenterUrlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.PayPalBindInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDCSpanS3S0200000_5 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                return;
            case 1:
                o.LJIIIZ(textPaint, "ds");
                return;
            case 2:
                updateDrawState$2(this, textPaint);
                return;
            case 3:
                updateDrawState$3(this, textPaint);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public static final void onClick$0(IDCSpanS3S0200000_5 iDCSpanS3S0200000_5, View widget) {
        Boolean bool;
        boolean z;
        String str;
        String str2;
        o.LJIIIZ(widget, "widget");
        PayPalBindInfo payPalBindInfo = ((GetSubInfoResponse) iDCSpanS3S0200000_5.l0).payPalBindInfo;
        Boolean bool2 = null;
        if (payPalBindInfo != null) {
            bool = Boolean.valueOf(payPalBindInfo.payPayBounded);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            ((SubscriptionSettingFragmentNew) iDCSpanS3S0200000_5.l1)._$_findCachedViewById(R.id.g7b).setVisibility(8);
        } else {
            String str3 = ((SubscriptionSettingFragmentNew) iDCSpanS3S0200000_5.l1).LJLJJLL;
            if (str3 == null || str3.length() == 0) {
                return;
            }
            C32364Cn2 c32364Cn2 = new C32364Cn2(((SubscriptionSettingFragmentNew) iDCSpanS3S0200000_5.l1).LJLJJLL);
            c32364Cn2.LIZ(1, "hide_nav_bar");
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((SubscriptionSettingFragmentNew) iDCSpanS3S0200000_5.l1).getContext(), c32364Cn2.LIZLLL());
            if (((SubscriptionSettingFragmentNew) iDCSpanS3S0200000_5.l1).getParentFragment() instanceof LiveDialogFragment) {
                Fragment parentFragment = ((SubscriptionSettingFragmentNew) iDCSpanS3S0200000_5.l1).getParentFragment();
                o.LJII(parentFragment, "null cannot be cast to non-null type com.bytedance.android.livesdk.LiveDialogFragment");
                if (((LiveDialogFragment) parentFragment).isShowing()) {
                    Fragment parentFragment2 = ((SubscriptionSettingFragmentNew) iDCSpanS3S0200000_5.l1).getParentFragment();
                    o.LJII(parentFragment2, "null cannot be cast to non-null type com.bytedance.android.livesdk.LiveDialogFragment");
                    ((DialogFragment) parentFragment2).dismiss();
                }
            }
            ((SubscriptionSettingFragmentNew) iDCSpanS3S0200000_5.l1).LJLLL = true;
        }
        InterfaceC30442Bx8.B.LIZ(Boolean.FALSE);
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = (SubscriptionSettingFragmentNew) iDCSpanS3S0200000_5.l1;
        PayPalBindInfo payPalBindInfo2 = ((GetSubInfoResponse) iDCSpanS3S0200000_5.l0).payPalBindInfo;
        if (payPalBindInfo2 != null) {
            z = payPalBindInfo2.payPayBounded;
        } else {
            z = false;
        }
        subscriptionSettingFragmentNew.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_bind_paypal_page_click");
        subscriptionSettingFragmentNew.Tl(LIZ);
        LIZ.LJIJJ(subscriptionSettingFragmentNew.LJLIL, "click_position");
        LIZ.LJIJJ(0, "is_opt_in_end");
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "has_paypal_account");
        LIZ.LJIJJ(subscriptionSettingFragmentNew.LJLIL, "popup_entrance");
        if (z) {
            str = "update";
        } else {
            str = "go_bind";
        }
        LIZ.LJIJJ(str, "click_type");
        GetSubInfoResponse getSubInfoResponse = subscriptionSettingFragmentNew.LJLJJL;
        if (getSubInfoResponse != null) {
            bool2 = Boolean.valueOf(getSubInfoResponse.qualification);
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            str2 = "pass";
        } else {
            str2 = "under_review";
        }
        LIZ.LJIJJ(str2, "review_status");
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$1(IDCSpanS3S0200000_5 iDCSpanS3S0200000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        BZI LIZ = C28787BRn.LIZ("livesdk_appeal_click");
        LIZ.LJIILLIIL((DataChannel) iDCSpanS3S0200000_5.l0);
        LIZ.LJIJJ("age", "appeal_type");
        C06490Nh.LIZLLL(LIZ, "inapp", "source", "live", "enter_from");
        Context context = (Context) iDCSpanS3S0200000_5.l1;
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = "sslocal://webcast_webview?url=https://webcast.tiktokv.com/falcon/webcast_mt/page/proactive_appeal_redirect/index.html?web_bg_color=#ffffffff&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
                buildUpon.appendQueryParameter("enter_from", "toast");
                String uri = buildUpon.build().toString();
                o.LJIIIIZZ(uri, "builder.build().toString()");
                value = uri;
            } catch (Exception e) {
                C0NB.LJ("linkmic_appeal", e.toString());
            }
        }
        IActionHandlerService iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class);
        if (iActionHandlerService != null) {
            iActionHandlerService.handle(context, value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$2(IDCSpanS3S0200000_5 iDCSpanS3S0200000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        Dialog dialog = (Dialog) ((C68322mC) iDCSpanS3S0200000_5.l0).element;
        if (dialog != null) {
            dialog.dismiss();
        }
        String value = GpppaGiftBanHelpCenterUrlSetting.INSTANCE.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
                buildUpon.appendQueryParameter("enter_from", "gift_appeal");
                String uri = buildUpon.build().toString();
                o.LJIIIIZZ(uri, "builder.build().toString()");
                value = uri;
            } catch (Exception e) {
                BPP.LIZJ(((BasePreviewSettingMainFragment) iDCSpanS3S0200000_5.l1).getContext(), e);
            }
            C7N.LIZ().handle(((BasePreviewSettingMainFragment) iDCSpanS3S0200000_5.l1).getContext(), value);
        }
        ((BasePreviewSettingMainFragment) iDCSpanS3S0200000_5.l1).Dl("view_policy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$3(IDCSpanS3S0200000_5 iDCSpanS3S0200000_5, View widget) {
        o.LJIIIZ(widget, "widget");
        Dialog dialog = (Dialog) ((C68322mC) iDCSpanS3S0200000_5.l0).element;
        if (dialog != null) {
            dialog.dismiss();
        }
        String value = GpppaGiftBanHelpCenterUrlSetting.INSTANCE.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
                buildUpon.appendQueryParameter("enter_from", "gift_appeal");
                String uri = buildUpon.build().toString();
                o.LJIIIIZZ(uri, "builder.build().toString()");
                value = uri;
            } catch (Exception e) {
                BPP.LIZJ(((BasePreviewSettingMainFragmentSheet) iDCSpanS3S0200000_5.l1).getContext(), e);
            }
            C7N.LIZ().handle(((BasePreviewSettingMainFragmentSheet) iDCSpanS3S0200000_5.l1).getContext(), value);
        }
        ((BasePreviewSettingMainFragmentSheet) iDCSpanS3S0200000_5.l1).Tl("view_policy");
    }

    public static final void updateDrawState$0(IDCSpanS3S0200000_5 iDCSpanS3S0200000_5, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS3S0200000_5 iDCSpanS3S0200000_5, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
        ds.setColor(C15380j0.LIZIZ(R.color.ck));
    }

    public static final void updateDrawState$3(IDCSpanS3S0200000_5 iDCSpanS3S0200000_5, TextPaint ds) {
        Integer LJI;
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL != null && (LJI = C79045V0n.LJI(R.attr.go, LIZLLL)) != null) {
            ds.setColor(LJI.intValue());
        }
    }

    public IDCSpanS3S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
