package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestApplyNumChangedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAudienceNumChangedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.RequestFrequencyEndEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZ1 extends TZT implements TZU {
    public final LifecycleOwner LJLIL;
    public final DataChannel LJLILLLLZI;
    public final InterfaceC31805Ce1 LJLJI;
    public final List<LinkPlayerInfo> LJLJJI;
    public final List<LinkPlayerInfo> LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public final void LIZ() {
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.LJLJI;
        if (interfaceC31805Ce1 != null) {
            interfaceC31805Ce1.LIZLLL(this);
        }
        ((ArrayList) this.LJLJJL).clear();
        this.LJLILLLLZI.rv0(MultiGuestAudienceNumChangedEvent.class, Integer.valueOf(((ArrayList) this.LJLJJL).size()));
    }

    @Override // X.TZU
    public final void LJJJ(User user) {
        this.LJLILLLLZI.rv0(RequestFrequencyEndEvent.class, user);
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        MultiGuestDataHolder LIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        o.LJIIIZ(provider, "provider");
        List<LinkPlayerInfo> LJIIIIZZ = provider.LJIIIIZZ();
        ArrayList arrayList = new ArrayList();
        for (LinkPlayerInfo linkPlayerInfo : LJIIIIZZ) {
            if (!((ArrayList) this.LJLJJI).contains(linkPlayerInfo)) {
                arrayList.add(linkPlayerInfo);
            }
        }
        ((ArrayList) this.LJLJJL).addAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) it.next();
            TZR tzr = (TZR) this.LJLJJLL.getValue();
            User user = linkPlayerInfo2.mUser;
            o.LJIIIIZZ(user, "info.user");
            tzr.LIZ(user);
        }
        List<LinkPlayerInfo> list = this.LJLJJI;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!provider.LJIIIIZZ().contains(next)) {
                arrayList2.add(next);
            }
        }
        ((ArrayList) this.LJLJJL).removeAll(arrayList2);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            LinkPlayerInfo linkPlayerInfo3 = (LinkPlayerInfo) it3.next();
            TZR tzr2 = (TZR) this.LJLJJLL.getValue();
            User user2 = linkPlayerInfo3.mUser;
            o.LJIIIIZZ(user2, "info.user");
            tzr2.LIZJ(user2);
        }
        ((ArrayList) this.LJLJJI).clear();
        ((ArrayList) this.LJLJJI).addAll(provider.LJIIIIZZ());
        int size = ((ArrayList) this.LJLJJL).size();
        if (TUZ.LIZ() && (LIZ = TRK.LIZ()) != null && (multiLiveAnchorPanelSettings = LIZ.LJIIJ) != null && multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold > 0) {
            List<LinkPlayerInfo> LJIIIIZZ2 = provider.LJIIIIZZ();
            size = 0;
            if (((Number) C29306Beo.LJ(TZN.LJLIL, LJIIIIZZ2).getSecond()).intValue() == -1) {
                size = 0;
            } else {
                for (LinkPlayerInfo linkPlayerInfo4 : LJIIIIZZ2) {
                    if (((ArrayList) this.LJLJJL).contains(linkPlayerInfo4)) {
                        size++;
                    }
                    if (linkPlayerInfo4.isLastMeetGiftScoreThresholdApplier) {
                        break;
                    }
                }
            }
        }
        if (C74726TUk.LIZ()) {
            this.LJLILLLLZI.rv0(MultiGuestApplyNumChangedEvent.class, new C32185Ck9(size, ((ArrayList) this.LJLJJL).size()));
        } else {
            this.LJLILLLLZI.rv0(MultiGuestAudienceNumChangedEvent.class, Integer.valueOf(((ArrayList) this.LJLJJL).size()));
        }
    }

    public TZ1(LifecycleOwner lifecycleOwner, DataChannel mDataChannel, InterfaceC31805Ce1 interfaceC31805Ce1) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(mDataChannel, "mDataChannel");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = mDataChannel;
        this.LJLJI = interfaceC31805Ce1;
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new ArrayList();
        new ArrayList();
        new ArrayList();
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 433));
    }
}
