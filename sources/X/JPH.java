package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JPH extends AbstractC49114JPi implements JJK {
    public static final /* synthetic */ int LJLLL = 0;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    @Override // X.JJK
    public final void LIZIZ(int i, View view, Aweme aweme, List<? extends Aweme> awemeList) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(awemeList, "awemeList");
    }

    public final JK5 LJIILLIIL() {
        return (JK5) this.LJLLJ.getValue();
    }

    public JPH(JTI jti, JIB jib, JGU jgu) {
        super(jti, jib, jgu);
        this.LJLLILLLL = C221108m2.LIZIZ(C49041JMn.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(new AqS155S0200000_8(jti, this, 35));
    }

    @Override // X.JJK
    public final void LIZJ(int i, View view, Aweme aweme, List<? extends Aweme> awemeList) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(awemeList, "awemeList");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        LJIIZILJ(context, view, aweme, awemeList);
    }

    public final void LJIIZILJ(Context context, View view, Aweme aweme, List<? extends Aweme> awemeList) {
        C020506f c020506f;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(awemeList, "awemeList");
        JQA jqa = LJIILLIIL().LJLL;
        String str = "general_search";
        if (!TextUtils.equals(jqa.LJFF, "general_search")) {
            str = "search_result";
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        bundle.putString("video_from", "from_search_ad_no_request");
        bundle.putString("enter_from", str);
        bundle.putString("search_keyword", jqa.LJ);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 555);
        bundle.putString("search_id", jqa.LJII);
        bundle.putString("key_search_type", jqa.LIZLLL);
        bundle.putString("list_item_id", aweme.getAid());
        bundle.putString("search_result_id", aweme.getAuthorUid());
        Bundle bundle2 = null;
        if (view != null) {
            c020506f = C020506f.LIZ(view, view.getWidth(), view.getHeight());
        } else {
            c020506f = null;
        }
        C78966Uyw.LJLJJL = awemeList;
        C49823Jgx c49823Jgx = new C49823Jgx();
        c49823Jgx.LJIJJ(awemeList);
        C55457Lpd.LJLJJLL = c49823Jgx;
        SmartRoute smartRoute = new SmartRoute(context);
        smartRoute.withParam(bundle);
        if (c020506f != null) {
            bundle2 = c020506f.LIZLLL();
        }
        smartRoute.withBundleAnimation(bundle2);
        smartRoute.withParam("activity_has_activity_options", true);
        smartRoute.withUrl("//aweme/detail");
        smartRoute.open();
    }
}
