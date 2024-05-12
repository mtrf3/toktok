package Y;

import X.InterfaceC64592gB;
import com.ss.android.ugc.aweme.feed.adapter.PaidContentVideoViewHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AfS35S0000000_3 implements InterfaceC64592gB {
    public final int $t;

    @Override // X.InterfaceC64592gB
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
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

    public AfS35S0000000_3(int i) {
        this.$t = i;
    }

    public AfS35S0000000_3(PaidContentVideoViewHolder paidContentVideoViewHolder, int i) {
        this.$t = i;
    }

    public static final void accept$1(AfS35S0000000_3 afS35S0000000_3, Object obj) {
        Throwable error = (Throwable) obj;
        o.LJIIIZ(error, "error");
        error.getMessage();
    }

    public static final /* bridge */ /* synthetic */ void accept$0(AfS35S0000000_3 afS35S0000000_3, Object obj) {
    }
}
