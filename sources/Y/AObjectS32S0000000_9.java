package Y;

import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes10.dex */
public class AObjectS32S0000000_9 implements InterfaceC88472Yns {
    public final int $t;

    public static final Object invoke$1(AObjectS32S0000000_9 aObjectS32S0000000_9, Object obj) {
        return null;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public AObjectS32S0000000_9(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS32S0000000_9 aObjectS32S0000000_9, Object obj) {
        return ((Aweme) obj).getAuthor();
    }
}
