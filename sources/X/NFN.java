package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NFN {
    public static final /* synthetic */ int LIZJ = 0;
    public AbstractC59064NGa LIZ;
    public C59421NTt LIZIZ;

    public final AbstractC59064NGa LIZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        C59066NGc c59066NGc = new C59066NGc("feed_follow_up_ace_survey", EnumC59241NMv.SPARK, context, new NGY((String) null, (String) null, (String) null, (Integer) null, (Integer) null, 63));
        C59421NTt c59421NTt = new C59421NTt(EnumC59053NFp.ONLY_RENDER, str, 1, false, new NIA("feed_follow_up_ace_survey", str, new Bundle(), C59055NFr.LIZ("feed_follow_up_ace_survey"), new C1PH(), false, null, false, 992), null, false, 200);
        this.LIZIZ = c59421NTt;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" realurl = ");
        LIZ.append(c59421NTt.LIZIZ);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ), "PromoteAdHybridDelegate");
        return AdHybridContainerManager.LIZLLL().LIZJ(c59066NGc, c59421NTt);
    }

    public final void LIZIZ(String str, Context context, NFL nfl, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (context == null || nfl == null) {
            return;
        }
        String encode = URLEncoder.encode(C1EU.LIZIZ(str, "disable_outside_click_close", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("user_convert", nfl.LIZLLL).appendQueryParameter("brand_name", nfl.LJ).appendQueryParameter("rate_from", nfl.LJI).appendQueryParameter("score", nfl.LJFF).appendQueryParameter("send_notice_time", nfl.LJIIIIZZ).appendQueryParameter("enter_from", nfl.LJII).build().toString(), "UTF-8");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://webview_popup/?url=");
        LIZ.append(encode);
        String uri = UriProtector.parse(X1D.LIZIZ(LIZ)).buildUpon().appendQueryParameter("height", "593").appendQueryParameter("disable_outside_click_close", "1").build().toString();
        o.LJIIIIZZ(uri, "\"aweme://webview_popup/?…ld().toString()\n        }");
        AbstractC59064NGa LIZ2 = LIZ(context, uri);
        C59421NTt c59421NTt = this.LIZIZ;
        if (c59421NTt != null && LIZ2 != null) {
            LIZ2.LJIL(c59421NTt, new NFJ(interfaceC65784Pro));
        }
    }
}
