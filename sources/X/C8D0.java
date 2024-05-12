package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.zhiliaoapp.musically.R;
import java.util.regex.Matcher;

/* renamed from: X.8D0, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8D0 implements InterfaceC88472Yns {
    public final /* synthetic */ C74065T4z LJLIL;
    public final /* synthetic */ Challenge LJLILLLLZI;

    public /* synthetic */ C8D0(C74065T4z c74065T4z, Challenge challenge) {
        this.LJLIL = c74065T4z;
        this.LJLILLLLZI = challenge;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        C74065T4z c74065T4z = this.LJLIL;
        Challenge challenge = this.LJLILLLLZI;
        SpannableString spannableString = (SpannableString) obj;
        final Context context = c74065T4z.LIZ.getContext();
        final String cid = challenge.getCid();
        final String challengeName = challenge.getChallengeName();
        String spannableString2 = spannableString.toString();
        Matcher matcher = UEY.LIZ.matcher(spannableString2);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            final String charSequence = spannableString2.subSequence(start, end).toString();
            if (C40680Fxs.LIZIZ(charSequence)) {
                spannableString.setSpan(new ClickableSpan(context, charSequence, cid, challengeName) { // from class: X.7Fj
                    public static final /* synthetic */ int LJLJJL = 0;
                    public final String LJLIL;
                    public final String LJLILLLLZI;
                    public final String LJLJI;
                    public final Context LJLJJI;

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("tag_id", this.LJLILLLLZI);
                        FMX.LJIIL("click_tag_link", c188727au.LIZ);
                        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                        if (LJIIIIZZ != null) {
                            SmartRoute buildRoute = SmartRouter.buildRoute(LJIIIIZZ, "aweme://ame/webview/");
                            buildRoute.withParam(UriProtector.parse(this.LJLIL));
                            buildRoute.withParam("show_load_dialog", false);
                            buildRoute.withParam("hide_nav_bar", false);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("#");
                            LIZ.append(this.LJLJI);
                            buildRoute.withParam("title", X1D.LIZIZ(LIZ));
                            buildRoute.open();
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setColor(C04330Ez.LIZIZ(this.LJLJJI, R.color.ma));
                    }

                    {
                        this.LJLJJI = context;
                        this.LJLIL = charSequence;
                        this.LJLILLLLZI = cid;
                        this.LJLJI = challengeName;
                    }
                }, start, end, 17);
            }
        }
        C207658Cz c207658Cz = new C207658Cz(challenge.getCid(), challenge.getChallengeName());
        if (UEY.LIZ.matcher(spannableString.toString()).find()) {
            return c207658Cz.LIZLLL(spannableString);
        }
        return spannableString;
    }
}
