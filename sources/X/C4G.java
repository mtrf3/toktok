package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C4G extends CQO<C4H> {
    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return ((C4H) this.LJIJJLI).LJLJI;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        return ((C4H) this.LJIJJLI).LJLILLLLZI;
    }

    @Override // X.CQL, X.InterfaceC29967BpT
    public final ImageModel LJJLJ() {
        User user = LJLIIL().LJII;
        if (user != null) {
            return user.getAvatarThumb();
        }
        return null;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return LJLIIL().LJII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4G(C4H message) {
        super(message);
        o.LJIIIZ(message, "message");
    }
}
