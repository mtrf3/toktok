package X;

import android.app.Activity;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.regex.Matcher;

/* renamed from: X.8Cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207658Cz extends PMI {
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.PMI
    public final SpannableString LIZLLL(SpannableString spannableString) {
        String spannableString2 = spannableString.toString();
        Matcher matcher = UEY.LIZ.matcher(spannableString2);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            final String charSequence = spannableString2.subSequence(start, end).toString();
            spannableString.setSpan(new StyleSpan(0), start, end, 17);
            final int intValue = C79045V0n.LJI(R.attr.go, EF7.LIZIZ()).intValue();
            final int LIZIZ = C86V.LIZIZ(R.color.bl);
            spannableString.setSpan(new AnonymousClass896(intValue, LIZIZ) { // from class: X.8Cy
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C207658Cz c207658Cz = C207658Cz.this;
                    String str = charSequence;
                    c207658Cz.getClass();
                    if (!C40680Fxs.LIZIZ(str)) {
                        str = i0.LJFF("http://", str);
                    }
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("tag_id", c207658Cz.LIZIZ);
                    FMX.LJIIL("click_tag_link", c188727au.LIZ);
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ != null) {
                        SmartRoute buildRoute = SmartRouter.buildRoute(LJIIIIZZ, "aweme://ame/webview/");
                        buildRoute.withParam(UriProtector.parse(str));
                        buildRoute.withParam("show_load_dialog", false);
                        buildRoute.withParam("hide_nav_bar", false);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("#");
                        LIZ.append(c207658Cz.LIZJ);
                        buildRoute.withParam("title", X1D.LIZIZ(LIZ));
                        buildRoute.open();
                    }
                }
            }, start, end, 17);
        }
        PMI pmi = (PMI) this.LIZ;
        if (pmi != null) {
            return pmi.LIZLLL(spannableString);
        }
        return spannableString;
    }

    public C207658Cz(String str, String str2) {
        super(5);
        this.LIZJ = str2;
        this.LIZIZ = str;
    }
}
