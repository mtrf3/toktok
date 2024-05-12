package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.KzF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53505KzF implements InterfaceC53586L1i<EnumC53520KzU, C53486Kyw> {
    @Override // X.InterfaceC53586L1i
    public final EnumC53520KzU LIZ(Object data) {
        o.LJIIIZ(data, "data");
        if (data instanceof User) {
            User user = (User) data;
            if (!AV1.LJIJ(user) && user.getFollowStatus() == 0) {
                return EnumC53520KzU.UNFOLLOW;
            }
        }
        return null;
    }
}
