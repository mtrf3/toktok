package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.3GU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GU extends F9E implements InterfaceC57784Mm4 {
    public final User LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        String str;
        C3GU c3gu;
        User user;
        String uid = this.LJLIL.getUid();
        if (!(interfaceC57784Mm4 instanceof C3GU) || (c3gu = (C3GU) interfaceC57784Mm4) == null || (user = c3gu.LJLIL) == null || (str = user.getUid()) == null) {
            str = "";
        }
        return o.LJ(uid, str);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        String str;
        C3GU c3gu;
        User user;
        String uid = this.LJLIL.getUid();
        if (!(interfaceC57784Mm4 instanceof C3GU) || (c3gu = (C3GU) interfaceC57784Mm4) == null || (user = c3gu.LJLIL) == null || (str = user.getUid()) == null) {
            str = "";
        }
        return o.LJ(uid, str);
    }

    public C3GU(User user, int i) {
        o.LJIIIZ(user, "user");
        this.LJLIL = user;
        this.LJLILLLLZI = i;
    }
}
