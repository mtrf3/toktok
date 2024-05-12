package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkMicViewMaskWidget;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TSO implements InterfaceC74708TTs {
    public final /* synthetic */ GameLinkMicViewMaskWidget LIZ;

    @Override // X.InterfaceC74708TTs
    public final void LJJIJL(Throwable t) {
        o.LJIIIZ(t, "t");
    }

    public TSO(GameLinkMicViewMaskWidget gameLinkMicViewMaskWidget) {
        this.LIZ = gameLinkMicViewMaskWidget;
    }

    @Override // X.InterfaceC74708TTs
    public final void LJJIJLIJ(TU4 provider) {
        o.LJIIIZ(provider, "provider");
        ArrayList arrayList = new ArrayList();
        Iterator it = provider.LJ().iterator();
        while (it.hasNext()) {
            arrayList.add(TV2.LIZ((LinkListUser) it.next()));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onListChangeByIM() size = ");
        LIZ.append(arrayList.size());
        TYP.LIZJ("GameLinkMicViewMaskWidget", X1D.LIZIZ(LIZ));
        this.LIZ.LLFF(arrayList);
    }

    @Override // X.InterfaceC74708TTs
    public final void LJJIL(TU4 provider, boolean z) {
        o.LJIIIZ(provider, "provider");
        List<LinkPlayerInfo> LJ = provider.LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onListChangeByFetch() size = ");
        LIZ.append(LJ.size());
        TYP.LIZJ("GameLinkMicViewMaskWidget", X1D.LIZIZ(LIZ));
        this.LIZ.LLFF(LJ);
    }
}
