package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.L8t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53779L8t extends AbstractC65781Prl implements InterfaceC88471Ynr<User, List<? extends User>, Boolean> {
    public static final C53779L8t INSTANCE = new C53779L8t();

    public C53779L8t() {
        super(2);
    }

    public final boolean invoke(User user, List<? extends User> curV) {
        o.LJIIJ(curV, "curV");
        if (user != null && (!curV.isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ Boolean invoke(User user, List<? extends User> list) {
        return Boolean.valueOf(invoke(user, list));
    }
}
