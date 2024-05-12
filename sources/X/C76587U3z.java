package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* renamed from: X.U3z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76587U3z<T> implements InterfaceC73592SuS {
    public final /* synthetic */ U41 LJLIL;

    public C76587U3z(C76585U3x c76585U3x) {
        this.LJLIL = c76585U3x;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        CJ5 event = (CJ5) obj;
        o.LJIIIZ(event, "event");
        User user = this.LJLIL.LIZJ().user;
        if (user != null && event.LIZ.LIZ == user.getId()) {
            return true;
        }
        return false;
    }
}
