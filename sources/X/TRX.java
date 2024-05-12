package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TRX extends TRY {
    public final /* synthetic */ C74846TZa LJLIL;

    public TRX(C74846TZa c74846TZa) {
        this.LJLIL = c74846TZa;
    }

    @Override // X.TUI
    public final void LJJIJL(Throwable t) {
        o.LJIIIZ(t, "t");
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("MultiGuestAsGuestModeratorPresenter", "onFetchFailed");
        TRW trw = (TRW) this.LJLIL.mView;
        if (trw != null) {
            trw.ZZ();
        }
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        TRW trw;
        HashMap<String, String> hashMap;
        o.LJIIIZ(provider, "provider");
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("MultiGuestAsGuestModeratorPresenter", "onListChangeByFetch");
        MultiLiveGuestInfoList source = provider.getSource();
        if (source != null && (hashMap = source.userTagMap) != null) {
            C74896TaO.LJIIIIZZ(hashMap);
        }
        if (i != 3 && (trw = (TRW) this.LJLIL.mView) != null) {
            trw.oo0();
        }
    }
}
