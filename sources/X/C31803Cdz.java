package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Cdz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31803Cdz extends F9E {
    public final User LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C31803Cdz(User user, String str) {
        o.LJIIIZ(user, "user");
        this.LJLIL = user;
        this.LJLILLLLZI = str;
    }
}
