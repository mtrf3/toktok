package X;

import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.U3s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76580U3s<T> implements InterfaceC73592SuS {
    public final /* synthetic */ GetShowRankResponse.ShowRankUser LJLIL;

    public C76580U3s(GetShowRankResponse.ShowRankUser showRankUser) {
        this.LJLIL = showRankUser;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        CJ5 event = (CJ5) obj;
        o.LJIIIZ(event, "event");
        if (event.LIZ.LIZ == this.LJLIL.userId) {
            return true;
        }
        return false;
    }
}
