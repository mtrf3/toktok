package X;

import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LZB extends F9E implements InterfaceC57784Mm4 {
    public final FollowingInterestUser LJLIL;
    public final List<FollowingInterestUser> LJLILLLLZI;
    public final int LJLJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public LZB(FollowingInterestUser followingInterestUser, List<FollowingInterestUser> list, int i) {
        this.LJLIL = followingInterestUser;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
    }
}
