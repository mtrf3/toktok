package Y;

import X.C188727au;
import X.C76800UCe;
import X.C78685UuP;
import X.C7H1;
import X.C7KB;
import X.FMX;
import X.M89;
import X.MB3;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class ACallableS13S0310000_3 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS13S0310000_3 aCallableS13S0310000_3) {
        String str;
        String str2;
        String str3;
        if (aCallableS13S0310000_3.z3) {
            str = "trending_slide_down";
        } else {
            str = "trending_slide_up";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("search_id", ((M89) aCallableS13S0310000_3.l0).getSearchId());
        c188727au.LJIIIZ("enter_from", MB3.LIZ);
        Aweme aweme = (Aweme) aCallableS13S0310000_3.l1;
        String str4 = null;
        if (aweme != null) {
            str2 = aweme.getAuthorUid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        Aweme aweme2 = (Aweme) aCallableS13S0310000_3.l1;
        if (aweme2 != null) {
            str3 = aweme2.getAid();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("from_group_id", str3);
        Aweme aweme3 = (Aweme) aCallableS13S0310000_3.l2;
        if (aweme3 != null) {
            str4 = aweme3.getAid();
        }
        c188727au.LJIIIZ("to_group_id", str4);
        if (C78685UuP.LJJJZ(((M89) aCallableS13S0310000_3.l0).isFromTrendingCard())) {
            c188727au.LJI("is_from_trending_card", ((M89) aCallableS13S0310000_3.l0).isFromTrendingCard());
        }
        FMX.LJIIL(str, c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS13S0310000_3 aCallableS13S0310000_3) {
        C7H1.LJIIIZ((List) aCallableS13S0310000_3.l0, aCallableS13S0310000_3.z3, (Map) aCallableS13S0310000_3.l1, false, (C7KB) aCallableS13S0310000_3.l2);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS13S0310000_3 aCallableS13S0310000_3) {
        C7H1.LJIIIZ((List) aCallableS13S0310000_3.l0, aCallableS13S0310000_3.z3, (Map) aCallableS13S0310000_3.l1, true, (C7KB) aCallableS13S0310000_3.l2);
        return C76800UCe.LIZ;
    }

    public ACallableS13S0310000_3(List list, C7KB c7kb, int i) {
        this.$t = i;
        this.l0 = list;
        this.z3 = false;
        this.l1 = null;
        this.l2 = c7kb;
    }

    public ACallableS13S0310000_3(List list, Map map, C7KB c7kb, int i) {
        this.$t = i;
        this.l0 = list;
        this.z3 = true;
        this.l1 = map;
        this.l2 = c7kb;
    }

    public ACallableS13S0310000_3(Aweme aweme, Aweme aweme2, M89 m89, boolean z, int i) {
        this.$t = i;
        this.z3 = z;
        this.l0 = m89;
        this.l1 = aweme;
        this.l2 = aweme2;
    }
}
