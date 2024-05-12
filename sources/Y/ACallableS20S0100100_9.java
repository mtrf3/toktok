package Y;

import X.C55406Loo;
import X.FMX;
import X.InterfaceC55407Lop;
import X.LX1;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ContinuousTimeCalculator;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public class ACallableS20S0100100_9 implements Callable {
    public final int $t;
    public long j1;
    public Object l0;

    public static final Object call$1(ACallableS20S0100100_9 aCallableS20S0100100_9) {
        Object lambda$notifyTime$0;
        lambda$notifyTime$0 = ((ContinuousTimeCalculator) aCallableS20S0100100_9.l0).lambda$notifyTime$0(aCallableS20S0100100_9.j1);
        return lambda$notifyTime$0;
    }

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

    public static final Object call$0(ACallableS20S0100100_9 aCallableS20S0100100_9) {
        C55406Loo c55406Loo = new C55406Loo();
        c55406Loo.LJJL = String.valueOf(aCallableS20S0100100_9.j1);
        c55406Loo.LIZLLL = ((AnalysisStayTimeFragmentComponent) aCallableS20S0100100_9.l0).LIZ().getLabelName();
        InterfaceC55407Lop interfaceC55407Lop = ((AnalysisStayTimeFragmentComponent) aCallableS20S0100100_9.l0).LJLJJI;
        if (interfaceC55407Lop != null) {
            interfaceC55407Lop.LIZ(c55406Loo);
        }
        c55406Loo.LJIILIIL();
        return null;
    }

    public static final Object call$2(ACallableS20S0100100_9 aCallableS20S0100100_9) {
        int i;
        String str;
        Aweme aweme = (Aweme) aCallableS20S0100100_9.l0;
        if (aweme != null) {
            i = aweme.getAwemeType();
        } else {
            i = -1;
        }
        String valueOf = String.valueOf(LX1.LJIIJ);
        HashMap<String, String> hashMap = LX1.LIZ;
        hashMap.put("to_page", "Friends");
        hashMap.put("first_aweme_type", String.valueOf(i));
        hashMap.put("group", "5");
        hashMap.put("duration", String.valueOf(aCallableS20S0100100_9.j1 - LX1.LIZIZ));
        hashMap.put("hit_preload", valueOf);
        hashMap.put("fetch_retry_count", String.valueOf(LX1.LJIIIZ));
        hashMap.put("duration_container_frag_on_create_view", String.valueOf(LX1.LJ));
        hashMap.put("duration_container_frag_init_tab_layout", String.valueOf(LX1.LJFF));
        hashMap.put("duration_friends_feed_frag_on_create_view", String.valueOf(LX1.LJI));
        hashMap.put("duration_home_top_tab_build_view", String.valueOf(LX1.LJII));
        hashMap.put("duration_fetch_friends_feed", String.valueOf(LX1.LIZLLL - LX1.LIZJ));
        hashMap.put("duration_response_to_first_frame", String.valueOf(aCallableS20S0100100_9.j1 - LX1.LIZLLL));
        hashMap.put("exit_before_first_frame", String.valueOf(LX1.LJIILJJIL));
        hashMap.put("duration_on_refresh_result", String.valueOf(LX1.LJIIIIZZ));
        String str2 = "1";
        if (LX1.LJIIJJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("with_insert_ids", str);
        if (!LX1.LJIIL) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("hit_cached", str2);
        FMX.LJIIL("friends_tab_landing", hashMap);
        return null;
    }

    public ACallableS20S0100100_9(long j, Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
