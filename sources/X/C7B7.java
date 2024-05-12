package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.7B7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7B7 extends C7B9 {
    public final User LJLIL;
    public final C173966sC LJLILLLLZI;
    public final java.util.Set<String> LJLJI;

    @Override // X.C7B9, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C7B7) {
            return o.LJ(((C7B7) interfaceC57784Mm4).LJLIL.getUid(), this.LJLIL.getUid());
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return interfaceC57784Mm4 instanceof C7B7;
    }

    public C7B7(User user, C173966sC commentDescMobParams, java.util.Set<String> hasReportedUser) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(commentDescMobParams, "commentDescMobParams");
        o.LJIIIZ(hasReportedUser, "hasReportedUser");
        this.LJLIL = user;
        this.LJLILLLLZI = commentDescMobParams;
        this.LJLJI = hasReportedUser;
    }
}
