package Y;

import X.C0BI;
import com.ss.android.ugc.aweme.nows.cache.NowSelfAwemeDatabase;

/* loaded from: classes17.dex */
public class IDd0S19S0000000_16 extends C0BI {
    public final int $t;

    public static final String LIZIZ$0(IDd0S19S0000000_16 iDd0S19S0000000_16) {
        return "\n        DELETE FROM now_self_aweme_cache\n        WHERE uid = ?\n        AND expired_time_at_sec < ?\n        ";
    }

    public static final String LIZIZ$1(IDd0S19S0000000_16 iDd0S19S0000000_16) {
        return "DELETE FROM now_self_aweme_cache where uid = ?";
    }

    @Override // X.C0BI
    public final String LIZIZ() {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this);
            case 1:
                return LIZIZ$1(this);
            default:
                return super.LIZIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDd0S19S0000000_16(NowSelfAwemeDatabase nowSelfAwemeDatabase, int i) {
        super(nowSelfAwemeDatabase);
        this.$t = i;
    }
}
