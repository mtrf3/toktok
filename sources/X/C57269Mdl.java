package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Mdl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57269Mdl extends AbstractC65781Prl implements InterfaceC88473Ynt<String, Integer, User, User> {
    public static final C57269Mdl LJLIL = new C57269Mdl();

    public C57269Mdl() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final User invoke(String str, Integer num, User user) {
        Integer num2 = num;
        User user2 = user;
        o.LJIIIZ(str, "<anonymous parameter 0>");
        if (user2 != null) {
            User m150clone = user2.m150clone();
            if (num2 == null) {
                return m150clone;
            }
            if (num2.intValue() == 0) {
                m150clone.setLivePushNotificationStatus(2);
            }
            m150clone.setFollowStatus(num2.intValue());
            return m150clone;
        }
        return null;
    }
}
