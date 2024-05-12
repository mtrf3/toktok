package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3lt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93613lt extends C91773iv {
    public final IMUser LJLILLLLZI;
    public final String LJLJI;

    @Override // X.C91773iv, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C93613lt)) {
            return false;
        }
        C93613lt c93613lt = (C93613lt) interfaceC57784Mm4;
        if (!o.LJ(this.LJLILLLLZI.getUniqueId(), c93613lt.LJLILLLLZI.getUniqueId()) || !o.LJ(this.LJLJI, c93613lt.LJLJI)) {
            return false;
        }
        return true;
    }

    @Override // X.C91773iv, X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C93613lt)) {
            return false;
        }
        return o.LJ(this.LJLILLLLZI.getUniqueId(), ((C93613lt) interfaceC57784Mm4).LJLILLLLZI.getUniqueId());
    }

    @Override // X.C91773iv, X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C93613lt)) {
            return null;
        }
        return new C93623lu(!o.LJ(this.LJLJI, ((C93613lt) interfaceC57784Mm4).LJLJI));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93613lt(IMUser user, String str) {
        super(user);
        o.LJIIIZ(user, "user");
        this.LJLILLLLZI = user;
        this.LJLJI = str;
    }
}
