package Y;

import X.C55406Loo;
import X.FMX;
import X.LX1;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public class ACallableS12S0000100_9 implements Callable {
    public final int $t;
    public long j0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS12S0000100_9 aCallableS12S0000100_9) {
        C55406Loo c55406Loo = new C55406Loo();
        c55406Loo.LIZLLL = "discovery";
        c55406Loo.LJJL = String.valueOf(aCallableS12S0000100_9.j0);
        c55406Loo.LJIILIIL();
        return null;
    }

    public static final Object call$1(ACallableS12S0000100_9 aCallableS12S0000100_9) {
        String str;
        HashMap<String, String> hashMap = LX1.LIZ;
        hashMap.put("to_page", "FriendsEmpty");
        hashMap.put("first_aweme_type", "-1");
        hashMap.put("group", "5");
        hashMap.put("duration", String.valueOf(aCallableS12S0000100_9.j0 - LX1.LIZIZ));
        String str2 = CardStruct.IStatusCode.DEFAULT;
        hashMap.put("hit_preload", CardStruct.IStatusCode.DEFAULT);
        hashMap.put("fetch_retry_count", String.valueOf(LX1.LJIIIZ));
        hashMap.put("duration_container_frag_on_create_view", String.valueOf(LX1.LJ));
        hashMap.put("duration_container_frag_init_tab_layout", String.valueOf(LX1.LJFF));
        hashMap.put("duration_friends_feed_frag_on_create_view", String.valueOf(LX1.LJI));
        hashMap.put("duration_home_top_tab_build_view", String.valueOf(LX1.LJII));
        hashMap.put("duration_fetch_friends_feed", String.valueOf(LX1.LIZLLL - LX1.LIZJ));
        hashMap.put("duration_response_to_first_frame", String.valueOf(aCallableS12S0000100_9.j0 - LX1.LIZLLL));
        hashMap.put("exit_before_first_frame", String.valueOf(LX1.LJIILJJIL));
        hashMap.put("duration_on_refresh_result", String.valueOf(LX1.LJIIIIZZ));
        if (LX1.LJIIJJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("with_insert_ids", str);
        if (LX1.LJIIL) {
            str2 = "1";
        }
        hashMap.put("hit_cached", str2);
        FMX.LJIIL("friends_tab_landing", hashMap);
        return null;
    }

    public ACallableS12S0000100_9(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }
}
