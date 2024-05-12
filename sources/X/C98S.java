package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.98S, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C98S extends AbstractC65781Prl implements InterfaceC88471Ynr<C213178Yf<User>, C213178Yf<User>, Boolean> {
    public static final C98S LJLIL = new C98S();

    public C98S() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(C213178Yf<User> c213178Yf, C213178Yf<User> c213178Yf2) {
        String str;
        C213178Yf<User> old = c213178Yf;
        C213178Yf<User> c213178Yf3 = c213178Yf2;
        o.LJIIIZ(old, "old");
        o.LJIIIZ(c213178Yf3, "new");
        User user = old.LIZ;
        String str2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        User user2 = c213178Yf3.LIZ;
        if (user2 != null) {
            str2 = user2.getUid();
        }
        return Boolean.valueOf(o.LJ(str, str2));
    }
}
