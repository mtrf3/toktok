package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestApplicantNumChangedForModeratorChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZY extends TZT {
    public final DataChannel LJLIL;
    public final InterfaceC74853TZh LJLILLLLZI;
    public final List<LinkPlayerInfo> LJLJI;
    public final List<LinkPlayerInfo> LJLJJI;

    public TZY(DataChannel dataChannel, InterfaceC74853TZh interfaceC74853TZh) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = interfaceC74853TZh;
        this.LJLJI = new ArrayList();
        this.LJLJJI = new ArrayList();
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        o.LJIIIZ(provider, "provider");
        List<LinkPlayerInfo> LJIIJ = provider.LJIIJ();
        ArrayList arrayList = new ArrayList();
        for (LinkPlayerInfo linkPlayerInfo : LJIIJ) {
            if (!((ArrayList) this.LJLJI).contains(linkPlayerInfo)) {
                arrayList.add(linkPlayerInfo);
            }
        }
        ((ArrayList) this.LJLJJI).addAll(arrayList);
        List<LinkPlayerInfo> list = this.LJLJI;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!provider.LJIIJ().contains(next)) {
                arrayList2.add(next);
            }
        }
        ((ArrayList) this.LJLJJI).removeAll(arrayList2);
        ((ArrayList) this.LJLJI).clear();
        ((ArrayList) this.LJLJI).addAll(provider.LJIIJ());
        this.LJLIL.rv0(MultiGuestApplicantNumChangedForModeratorChannel.class, Integer.valueOf(((ArrayList) this.LJLJJI).size()));
    }
}
