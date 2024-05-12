package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class P1K implements InterfaceC57784Mm4 {
    public final User LJLIL;
    public final int LJLILLLLZI;
    public final P1J LJLJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public int LIZ() {
        return this.LJLILLLLZI;
    }

    public User LIZIZ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return areItemTheSame(interfaceC57784Mm4);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        P1K p1k;
        User LIZIZ;
        String uid = LIZIZ().getUid();
        String str = null;
        if ((interfaceC57784Mm4 instanceof P1K) && (p1k = (P1K) interfaceC57784Mm4) != null && (LIZIZ = p1k.LIZIZ()) != null) {
            str = LIZIZ.getUid();
        }
        return o.LJ(uid, str);
    }

    public P1K(User user, int i, P1J trackInfo) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLIL = user;
        this.LJLILLLLZI = i;
        this.LJLJI = trackInfo;
    }
}
