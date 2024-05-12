package Y;

import X.InterfaceC64592gB;
import com.ss.android.ugc.aweme.live.Live;

/* loaded from: classes11.dex */
public class AfS39S0000000_10 implements InterfaceC64592gB {
    public final int $t;

    public static final void accept$1(AfS39S0000000_10 afS39S0000000_10, Object obj) {
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS39S0000000_10(int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS39S0000000_10 afS39S0000000_10, Object obj) {
        Live.lambda$refreshLoginState$2((Throwable) obj);
    }
}
