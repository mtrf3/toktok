package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.33Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33Z extends F9E implements C33Q {
    public final AbstractC72932td<List<User>> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C33Z(int i) {
        C33X selectedUserData = C33X.LIZ;
        o.LJIIIZ(selectedUserData, "selectedUserData");
        this.LJLIL = selectedUserData;
    }
}
