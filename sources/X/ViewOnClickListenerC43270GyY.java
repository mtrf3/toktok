package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import ujb.o;

/* renamed from: X.GyY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC43270GyY implements View.OnClickListener {
    public final /* synthetic */ C43272Gya LJLIL;

    public ViewOnClickListenerC43270GyY(C43272Gya c43272Gya) {
        this.LJLIL = c43272Gya;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long currentTimeMillis;
        String str;
        C43272Gya c43272Gya = this.LJLIL;
        AwemeRawAd awemeRawAd = c43272Gya.LJLJJLL;
        String str2 = c43272Gya.LJLIL;
        Long l = c43272Gya.LJLILLLLZI;
        TuxSheet tuxSheet = c43272Gya.LJLJI;
        C58655N0h LIZLLL = C58704N2e.LIZLLL("about_this_ad", "exit", awemeRawAd);
        LIZLLL.LIZIZ("pa_setting", "close_method");
        long currentTimeMillis2 = System.currentTimeMillis();
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        LIZLLL.LIZIZ(Long.valueOf(currentTimeMillis2 - currentTimeMillis), "page_stay_time");
        LIZLLL.LJI();
        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("about_this_ad", "otherclick", awemeRawAd);
        LIZLLL2.LIZIZ("pa_setting", "click_source");
        LIZLLL2.LJI();
        if (o.LJJJJIZL(str2, "long_press", false)) {
            str = "ads_long_press";
        } else {
            str = "ads_share_panel";
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "//privacy/setting/ad_personalization");
        buildRoute.withParam("enter_from", str);
        buildRoute.open();
        if (tuxSheet == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_not_other_exit", true);
        tuxSheet.setArguments(bundle);
        tuxSheet.dismiss();
    }
}
