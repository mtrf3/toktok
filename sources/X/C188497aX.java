package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS55S1100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.7aX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188497aX {
    public static void LIZ(final ActivityC45651qj context, long j, final GiftViewModel giftViewModel, FragmentManager fm, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(giftViewModel, "giftViewModel");
        o.LJIIIZ(fm, "fm");
        C62046OWs LJJJJIZL = LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL();
        o.LJIIIIZZ(LJJJJIZL, "get().getService(ILiveOu…e.liveOuterSettingService");
        Boolean bool = (Boolean) LJJJJIZL.LIZJ(Boolean.TRUE, "can_recharge");
        Integer ageLimit = (Integer) LJJJJIZL.LIZJ(18, "low_age_user_limit");
        String str = (String) LJJJJIZL.LIZJ("", "live_sdk_appeal_webview");
        if (V0N.LJJII(str)) {
            if (C85990Xow.LJIIIZ()) {
                str = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                str = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        if (!bool.booleanValue()) {
            o.LJIIIIZZ(ageLimit, "ageLimit");
            int intValue = ageLimit.intValue();
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LIZIZ(context.getResources().getString(R.string.tq7, String.valueOf(intValue)));
            UC0.LIZJ(c26227ARb, new AqS55S1100000_1(context, str, 3));
            c26227ARb.LJI().LIZLLL();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_bundle_charge_source", 4);
        bundle.putString("key_charge_reason", "short_video");
        bundle.putLong("key_bundle_total_coins", j);
        bundle.putBoolean("key_bundle_is_central_mode", z);
        DialogFragment createRechargeDialogFragment = LiveOuterService.LJJJLL().LJJIJIL().createRechargeDialogFragment(context, new InterfaceC77682UeE() { // from class: X.72p
            @Override // X.InterfaceC77682UeE
            public final void LIZIZ(int i, int i2, String str2) {
            }

            @Override // X.InterfaceC77682UeE
            public final void LIZ(Exception exc) {
                GiftViewModel.this.ov0(0, 0L, context, "from_recharge");
            }

            @Override // X.InterfaceC77682UeE
            public final void onSuccess(long j2) {
                GiftViewModel.this.ov0(1, j2, context, "from_recharge");
            }
        }, bundle, new C77610Ud4().LIZ());
        o.LJIIIIZZ(createRechargeDialogFragment, "context: FragmentActivit…rgeDialogBuilder.build())");
        createRechargeDialogFragment.show(fm, "KeyboardToRechargePanel");
    }
}
