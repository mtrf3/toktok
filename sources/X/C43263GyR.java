package X;

import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.GyR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43263GyR extends ClickableSpan {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ TuxSheet LJLILLLLZI;
    public final /* synthetic */ AwemeRawAd LJLJI;
    public final /* synthetic */ Long LJLJJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        long currentTimeMillis;
        o.LJIIIZ(widget, "widget");
        String str = this.LJLIL;
        TuxSheet tuxSheet = this.LJLILLLLZI;
        AwemeRawAd awemeRawAd = this.LJLJI;
        Long l = this.LJLJJI;
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "//webview");
        buildRoute.withParam("url", str);
        buildRoute.open();
        if (TextUtils.equals("https://www.tiktok.com/safety/en/ads-and-data/", str)) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("about_this_ad", "exit", awemeRawAd);
            LIZLLL.LIZIZ("how_tiktok_ads_work", "close_method");
            long currentTimeMillis2 = System.currentTimeMillis();
            if (l != null) {
                currentTimeMillis = l.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            LIZLLL.LIZIZ(Long.valueOf(currentTimeMillis2 - currentTimeMillis), "page_stay_time");
            LIZLLL.LJI();
            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("about_this_ad", "otherclick", awemeRawAd);
            LIZLLL2.LIZIZ("how_tiktok_ads_work", "click_source");
            LIZLLL2.LJI();
        }
        if (tuxSheet == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_not_other_exit", true);
        tuxSheet.setArguments(bundle);
        tuxSheet.dismiss();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public C43263GyR(TuxSheet tuxSheet, AwemeRawAd awemeRawAd, Long l, String str) {
        this.LJLIL = str;
        this.LJLILLLLZI = tuxSheet;
        this.LJLJI = awemeRawAd;
        this.LJLJJI = l;
    }
}
