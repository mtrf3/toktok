package X;

import Y.IDo0S413S0100000_13;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.voicechat.main.common.FanTicketIconUrlChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkAbnormalConnectionOptSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TRL extends TRM {
    public boolean LJLIL = true;
    public final /* synthetic */ TQV LJLILLLLZI;

    public TRL(TQV tqv) {
        this.LJLILLLLZI = tqv;
    }

    @Override // X.TUI
    public final void V(TZX provider) {
        o.LJIIIZ(provider, "provider");
        ArrayList arrayList = new ArrayList();
        Iterator it = provider.LIZIZ().iterator();
        while (it.hasNext()) {
            arrayList.add(TV3.LIZ((LinkListUser) it.next()));
        }
        InterfaceC74617TQf interfaceC74617TQf = (InterfaceC74617TQf) this.LJLILLLLZI.mView;
        if (interfaceC74617TQf != null) {
            interfaceC74617TQf.onPlayerListChange(arrayList);
        }
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        MultiLiveGuestInfoList source;
        String str;
        DataChannel dataChannel;
        o.LJIIIZ(provider, "provider");
        MultiLiveGuestInfoList source2 = provider.getSource();
        if (source2 != null && (str = source2.fanTicketIconUrl) != null && (dataChannel = this.LJLILLLLZI.dataChannel) != null) {
            dataChannel.rv0(FanTicketIconUrlChannel.class, str);
        }
        if (this.LJLIL) {
            if ((this.LJLILLLLZI.LJLLLLLL || !LinkmicSdkAbnormalConnectionOptSetting.INSTANCE.isOpt()) && (source = provider.getSource()) != null) {
                Integer valueOf = Integer.valueOf(source.requestUserStatus);
                if (C47261Igj.LJJIJIIJI(2, 3, 4).contains(Integer.valueOf(valueOf.intValue()))) {
                    TQV tqv = this.LJLILLLLZI;
                    valueOf.intValue();
                    BizLeaveParams bizLeaveParams = new BizLeaveParams(tqv.LJLIL.getOwner().getId());
                    InterfaceC75441TjB R6 = C8E.LJ().R6();
                    if (R6 != null) {
                        R6.LJJLIIIJ(new C76012TsO("leave_source_when_enter_room", 0L, bizLeaveParams, 10011, 2), new IDo0S413S0100000_13(provider, 14));
                    }
                }
            }
            this.LJLIL = false;
        }
        InterfaceC74617TQf interfaceC74617TQf = (InterfaceC74617TQf) this.LJLILLLLZI.mView;
        if (interfaceC74617TQf != null) {
            interfaceC74617TQf.onPlayerListChange(provider.LIZIZ());
        }
    }
}
