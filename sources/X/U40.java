package X;

import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U40<T> implements InterfaceC73592SuS {
    public final /* synthetic */ C76581U3t LJLIL;
    public final /* synthetic */ GetShowRankResponse.ShowRankUser LJLILLLLZI;

    public U40(C76581U3t c76581U3t, GetShowRankResponse.ShowRankUser showRankUser) {
        this.LJLIL = c76581U3t;
        this.LJLILLLLZI = showRankUser;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        boolean z;
        CJ5 event = (CJ5) obj;
        o.LJIIIZ(event, "event");
        boolean LIZIZ = event.LIZ.LIZIZ();
        C76581U3t c76581U3t = this.LJLIL;
        GetShowRankResponse.ShowRankUser showRankUser = this.LJLILLLLZI;
        c76581U3t.getClass();
        long j = showRankUser.followStatus;
        if (j == 2 || j == 1) {
            z = true;
        } else {
            z = false;
        }
        if (LIZIZ == z) {
            return false;
        }
        return true;
    }
}
