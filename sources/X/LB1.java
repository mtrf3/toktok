package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LB1 extends F9E {
    public final int LJLIL;
    public final User LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    public static LB1 L(LB1 lb1, int i) {
        int i2 = lb1.LJLIL;
        User user = lb1.LJLILLLLZI;
        String requestId = lb1.LJLJJI;
        lb1.getClass();
        o.LJIIIZ(user, "user");
        o.LJIIIZ(requestId, "requestId");
        return new LB1(i2, i, user, requestId);
    }

    public LB1(int i, int i2, User user, String requestId) {
        o.LJIIIZ(requestId, "requestId");
        this.LJLIL = i;
        this.LJLILLLLZI = user;
        this.LJLJI = i2;
        this.LJLJJI = requestId;
    }
}
