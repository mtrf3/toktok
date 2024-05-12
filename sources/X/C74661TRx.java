package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TRx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74661TRx extends TRY {
    public final /* synthetic */ C74845TYz LJLIL;

    public C74661TRx(C74845TYz c74845TYz) {
        this.LJLIL = c74845TYz;
    }

    @Override // X.TUI
    public final void LJJIJL(Throwable t) {
        o.LJIIIZ(t, "t");
        TZC tzc = (TZC) this.LJLIL.mView;
        if (tzc != null) {
            tzc.AP();
        }
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        HashMap<String, String> hashMap;
        TZC tzc;
        o.LJIIIZ(provider, "provider");
        if (i != 3 && (tzc = (TZC) this.LJLIL.mView) != null) {
            tzc.onPlayerListChange(provider.LIZIZ());
        }
        MultiLiveGuestInfoList source = provider.getSource();
        if (source != null && (hashMap = source.userTagMap) != null) {
            C74896TaO.LJIIIIZZ(hashMap);
        }
    }
}
