package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.services.LanguageService;
import kotlin.jvm.internal.o;

/* renamed from: X.UUp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77279UUp extends ClickableSpan {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://support.tiktok.com/");
        String appLanguage = LanguageService.LIZ().getAppLanguage();
        if (o.LJ(appLanguage, "he")) {
            appLanguage = "he_IL";
        } else if (o.LJ(appLanguage, "zh-Hant")) {
            appLanguage = "zh-Hant-TW";
        }
        String LJFF = JBR.LJFF(LIZ, appLanguage, "/account-and-privacy/account-privacy-settings/suggested-accounts", LIZ);
        Context context = this.LJLIL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("aweme://webview?url=");
        LIZ2.append(LJFF);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ2));
        buildRoute.withParam("show_separate_line", true);
        buildRoute.open();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(this.LJLILLLLZI);
        T5S t5s = new T5S();
        t5s.LIZ(82);
        ds.setTypeface(t5s.getTypeface());
        ds.setUnderlineText(false);
    }

    public C77279UUp(Context context, int i) {
        this.LJLIL = context;
        this.LJLILLLLZI = i;
    }
}
