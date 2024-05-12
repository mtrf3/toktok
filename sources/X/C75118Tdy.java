package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75118Tdy<T> implements InterfaceC73592SuS {
    public final /* synthetic */ InterfaceC75124Te4 LJLIL;

    public C75118Tdy(C75106Tdm c75106Tdm) {
        this.LJLIL = c75106Tdm;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        CJ5 event = (CJ5) obj;
        o.LJIIIZ(event, "event");
        User LIZJ = this.LJLIL.LIZJ();
        if (LIZJ != null && event.LIZ.LIZ == LIZJ.getId()) {
            return true;
        }
        return false;
    }
}
