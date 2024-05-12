package kotlin.jvm.internal;

import X.AYY;
import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.C223208pQ;
import X.C33X;
import X.C57191McV;
import X.C57778Mly;
import X.C57935MoV;
import X.C61878OQg;
import X.C72912tb;
import X.C76800UCe;
import X.C8HZ;
import X.InterfaceC88474Ynu;
import X.X1D;
import com.ss.android.ugc.aweme.question.QuestionDetailFragment;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.trending.ui.detailpage.ContentAssem;

/* loaded from: classes10.dex */
public class IDqS454S0100000_9 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS454S0100000_9(C57935MoV c57935MoV, int i) {
        super(4);
        this.$t = i;
        this.l0 = c57935MoV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS454S0100000_9(QuestionDetailFragment questionDetailFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = questionDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS454S0100000_9(ContentAssem contentAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = contentAssem;
    }

    public static final Object invoke$0(IDqS454S0100000_9 iDqS454S0100000_9, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        ((Number) obj4).intValue();
        ((QuestionDetailFragment) iDqS454S0100000_9.l0).getClass();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS454S0100000_9 iDqS454S0100000_9, Object selectSubscribe, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        TrendingEventModel currentTrending = (TrendingEventModel) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(currentTrending, "currentTrending");
        C57191McV c57191McV = ((ContentAssem) iDqS454S0100000_9.l0).LJLJI;
        if (c57191McV != null) {
            String eventId = currentTrending.getEventId();
            if (eventId == null) {
                eventId = "";
            }
            c57191McV.LJL(intValue, intValue2, eventId);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS454S0100000_9 iDqS454S0100000_9, Object selectSubscribe, Object obj, Object obj2, Object obj3) {
        AbstractC72932td abstractC72932td;
        C8HZ state = (C8HZ) obj;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        AbstractC72932td<C223208pQ> abstractC72932td2 = state.LJLIL;
        AbstractC72932td<C223208pQ> abstractC72932td3 = state.LJLILLLLZI;
        if (booleanValue) {
            if (obj2 == null) {
                obj2 = C61878OQg.INSTANCE;
            }
            abstractC72932td = new C72912tb(obj2);
        } else {
            abstractC72932td = C33X.LIZ;
        }
        C57778Mly c57778Mly = new C57778Mly(abstractC72932td2, abstractC72932td3, abstractC72932td);
        ((C57935MoV) iDqS454S0100000_9.l0).LIZ().iv0().S70(c57778Mly);
        AYY ayy = AYY.LIZ;
        String str = ((C57935MoV) iDqS454S0100000_9.l0).LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new state: ");
        LIZ.append(c57778Mly);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ayy.getClass();
        AYY.LIZIZ(str, LIZIZ);
        ((C57935MoV) iDqS454S0100000_9.l0).LIZ().iv0().Ju0(new AqS175S0100000_9(c57778Mly, 522));
        return C76800UCe.LIZ;
    }
}
