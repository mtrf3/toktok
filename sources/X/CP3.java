package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.AdPersonalizationActivity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CP3 extends ClickableSpan {
    public final /* synthetic */ AdPersonalizationActivity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        Context applicationContext = this.LJLIL.getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(applicationContext, "//webview");
        buildRoute.withParam("url", this.LJLILLLLZI);
        buildRoute.open();
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(this.LJLJI, "hyperlink_value");
        FMX.LJIIL("click_hyperlink_ad_data_consent_prompt", c188727au.LIZ);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public CP3(AdPersonalizationActivity adPersonalizationActivity, String str, int i) {
        this.LJLIL = adPersonalizationActivity;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }
}
