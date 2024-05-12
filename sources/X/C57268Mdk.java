package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Mdk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57268Mdk extends AbstractC65781Prl implements InterfaceC88473Ynt<String, Integer, User, User> {
    public static final C57268Mdk LJLIL = new C57268Mdk();

    public C57268Mdk() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final User invoke(String str, Integer num, User user) {
        User m150clone;
        Integer num2 = num;
        User user2 = user;
        o.LJIIIZ(str, "<anonymous parameter 0>");
        if (user2 == null || num2 == null || num2.intValue() != 0 || (m150clone = user2.m150clone()) == null) {
            return null;
        }
        m150clone.setFollowerStatus(0);
        if (m150clone.getFollowStatus() == 2) {
            m150clone.setFollowStatus(1);
        }
        return m150clone;
    }
}
