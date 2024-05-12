package Y;

import X.InterfaceC29937Boz;
import com.bytedance.android.livesdk.like.LikeHelper;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class IDaS7S1100000_5 implements InterfaceC29937Boz {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS7S1100000_5 iDaS7S1100000_5) {
        LikeHelper likeHelper = (LikeHelper) iDaS7S1100000_5.l1;
        ((HashMap) likeHelper.LLIIII).remove(iDaS7S1100000_5.s0);
    }

    public static final void run$1(IDaS7S1100000_5 iDaS7S1100000_5) {
        LikeHelper likeHelper = (LikeHelper) iDaS7S1100000_5.l1;
        ((HashMap) likeHelper.LLIIII).remove(iDaS7S1100000_5.s0);
    }

    public IDaS7S1100000_5(LikeHelper likeHelper, String str, int i) {
        this.$t = i;
        this.l1 = likeHelper;
        this.s0 = str;
    }
}
