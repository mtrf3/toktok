package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.UpgradeMessage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bn3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29817Bn3 extends CQO<UpgradeMessage> {
    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return R.drawable.d3p;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((UpgradeMessage) this.LJIJJLI).LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29817Bn3(UpgradeMessage message) {
        super(message);
        o.LJIIIZ(message, "message");
    }

    @Override // X.CQL, X.CXK
    public final CharSequence LJJJLZIJ(User user) {
        o.LJIIIZ(user, "user");
        String it = C05170If.LIZ(user);
        if (this.LJI && this.LJIIIIZZ > 0) {
            o.LJIIIIZZ(it, "it");
            return C78840Uwu.LJJIJLIJ(this.LJIIIIZZ, it);
        }
        o.LJIIIIZZ(it, "it");
        return it;
    }

    @Override // X.CQL
    public final void LJLZ(User user) {
        C29775BmN.LIZIZ(user);
    }

    @Override // X.CQL
    public final void LJLLLLLL(int i, User user) {
        C29775BmN.LIZ(i, user);
    }
}
