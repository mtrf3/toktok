package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.3Eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80663Eo extends F9E implements InterfaceC57784Mm4 {
    public final User LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C80663Eo(User user) {
        o.LJIIIZ(user, "user");
        this.LJLIL = user;
        this.LJLILLLLZI = true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C80663Eo c80663Eo;
        User user;
        String uid = this.LJLIL.getUid();
        String str = null;
        if ((interfaceC57784Mm4 instanceof C80663Eo) && (c80663Eo = (C80663Eo) interfaceC57784Mm4) != null && (user = c80663Eo.LJLIL) != null) {
            str = user.getUid();
        }
        return o.LJ(uid, str);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C80663Eo c80663Eo;
        User user;
        String uid = this.LJLIL.getUid();
        String str = null;
        if ((interfaceC57784Mm4 instanceof C80663Eo) && (c80663Eo = (C80663Eo) interfaceC57784Mm4) != null && (user = c80663Eo.LJLIL) != null) {
            str = user.getUid();
        }
        return o.LJ(uid, str);
    }
}
