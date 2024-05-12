package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C2U8;
import X.C51757KSz;
import X.C57862Ow;
import X.C76800UCe;
import X.InterfaceC88473Ynt;
import X.JQA;
import X.JYG;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment;
import java.util.List;

/* loaded from: classes9.dex */
public class IDqS37S0300000_8 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS37S0300000_8(Context context, SearchFeedbackOptionalFragment searchFeedbackOptionalFragment, JYG jyg, int i) {
        super(3);
        this.$t = i;
        this.l0 = context;
        this.l1 = searchFeedbackOptionalFragment;
        this.l2 = jyg;
    }

    public static final Object invoke$0(IDqS37S0300000_8 iDqS37S0300000_8, Object view, Object obj, Object obj2) {
        Aweme aweme = (Aweme) obj;
        ((Number) obj2).intValue();
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        C2U8.LIZ(new C57862Ow((List) iDqS37S0300000_8.l0, aweme.getAid()));
        Bundle bundle = new Bundle();
        JQA jqa = (JQA) iDqS37S0300000_8.l2;
        SearchBotHolder searchBotHolder = (SearchBotHolder) iDqS37S0300000_8.l1;
        bundle.putString("id", aweme.getAid());
        bundle.putString("enter_from", "general_search");
        bundle.putString("search_keyword", jqa.LJ);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 35);
        bundle.putString("search_id", jqa.LJII);
        bundle.putString("list_item_id", aweme.getAid());
        bundle.putString("search_result_id", searchBotHolder.LJZL);
        bundle.putString("key_search_type", jqa.LIZJ);
        SmartRoute smartRoute = new SmartRoute(((SearchBotHolder) iDqS37S0300000_8.l1).getContext());
        smartRoute.withUrl("//aweme/detail");
        smartRoute.withParam(bundle);
        smartRoute.withParam("outer_aweme_id", aweme.getAid());
        smartRoute.withParam("video_from", "from_search_mix");
        smartRoute.open();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS37S0300000_8 iDqS37S0300000_8, Object obj, Object obj2, Object obj3) {
        FeedbackMultipleChoice choice = (FeedbackMultipleChoice) obj2;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(choice, "choice");
        Context context = (Context) iDqS37S0300000_8.l0;
        o.LJIIIIZZ(context, "context");
        C51757KSz.LIZ(context, (SearchFeedbackOptionalFragment) iDqS37S0300000_8.l1, (JYG) iDqS37S0300000_8.l2, choice, intValue, false);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS37S0300000_8(List list, List<? extends Aweme> list2, SearchBotHolder searchBotHolder, JQA jqa) {
        super(3);
        this.$t = jqa;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = searchBotHolder;
    }
}
