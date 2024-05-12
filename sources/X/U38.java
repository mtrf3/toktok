package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.ILiveShowApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowContentChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowFinishGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowNextGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowShowAgainGuestEvent;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.im.LiveShowMessage;

/* loaded from: classes14.dex */
public final class U38 extends U39 {
    public final U3Q LJFF;

    @Override // X.U39
    public final String LJIJ() {
        return "LiveShowGuestModel";
    }

    @Override // X.U39, X.U3C
    public final void destroy() {
        IMessageManager iMessageManager;
        U3Q u3q = this.LJFF;
        u3q.getClass();
        try {
            DataChannel dataChannel = u3q.LIZ;
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) u3q.LIZJ);
            }
        } catch (Exception e) {
            C0NB.LJII(e);
        }
        super.destroy();
    }

    public U38(DataChannel dataChannel) {
        super(dataChannel);
        this.LJFF = new U3Q(dataChannel, this);
        C0NB.LJIIIZ("LiveShowGuestModel", "init");
    }

    @Override // X.U39, X.U3C
    public final void LIZJ(ShowContent showContent) {
        DataChannel dataChannel;
        if (LJIIJ(showContent, "onShowAgainGuestMessageReceived") && (dataChannel = this.LIZ) != null) {
            dataChannel.qv0(LiveShowShowAgainGuestEvent.class, this.LIZIZ);
        }
    }

    @Override // X.U39, X.U3C
    public final void LIZLLL(LiveShowMessage message) {
        ShowListUser showListUser;
        Long l;
        List<ShowListUser> list;
        ShowConfig showConfig;
        List<ShowListUser> list2;
        ShowListUser showListUser2;
        o.LJIIIZ(message, "message");
        ShowContent showContent = message.showContent;
        if (showContent != null) {
            LJIIJ(showContent, "onCreateShowMessageReceived");
            ShowContent showContent2 = this.LIZIZ;
            List<ShowListUser> list3 = null;
            if (showContent2 != null && (list2 = showContent2.showingAndReadyList) != null) {
                Iterator<ShowListUser> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        showListUser2 = it.next();
                        if (showListUser2.status == 2) {
                            break;
                        }
                    } else {
                        showListUser2 = null;
                        break;
                    }
                }
                showListUser = showListUser2;
            } else {
                showListUser = null;
            }
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                ShowContent showContent3 = this.LIZIZ;
                if (showContent3 != null && (showConfig = showContent3.showConfig) != null) {
                    l = Long.valueOf(showConfig.durationPerGuest);
                } else {
                    l = null;
                }
                ShowContent showContent4 = this.LIZIZ;
                if (showContent4 != null) {
                    list = showContent4.showingAndReadyList;
                } else {
                    list = null;
                }
                ShowContent showContent5 = this.LIZIZ;
                if (showContent5 != null) {
                    list3 = showContent5.finishedList;
                }
                dataChannel.qv0(LiveShowNextGuestEvent.class, new U33(l, showListUser, list, list3));
            }
            if (showListUser != null && showListUser.userId == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                C76548U2m.LJIIZILJ("livesdk_guest_liveshow_onstage_start", C76548U2m.LIZLLL());
                C76548U2m.LIZJ = System.currentTimeMillis();
                C76548U2m.LIZLLL = true;
            } else if (C76548U2m.LIZLLL) {
                C76548U2m.LJIIL();
            }
            C76548U2m.LJII();
        }
    }

    @Override // X.U39, X.U3C
    public final void LJ(ShowContent showContent) {
        LJIIJ(showContent, "onCreateShowMessageReceived");
    }

    @Override // X.U39, X.U3C
    public final void LJFF(ShowContent showContent) {
        LJIIJ(showContent, "onEndShow");
    }

    @Override // X.U39, X.U3C
    public final AbstractC73638SvC<C28467BFf<FinishShowingGuestResponse.ResponseData>> LJI(FinishShowingGuestParams finishShowingGuestParams) {
        return C78966Uyw.LJJIZ(((ILiveShowApi) Q7L.LIZIZ(ILiveShowApi.class)).finishGuest(finishShowingGuestParams), "LiveShowGuestModel", "finishGuest").LJIILIIL(new AfS65S0100000_13(this, 5)).LJFF(new C62705OjF());
    }

    @Override // X.U39, X.U3C
    public final void LJII(ShowContent showContent) {
        DataChannel dataChannel;
        if (LJIIJ(showContent, "onFinishGuest") && (dataChannel = this.LIZ) != null) {
            dataChannel.qv0(LiveShowFinishGuestEvent.class, this.LIZIZ);
        }
    }

    @Override // X.U39, X.U3C
    public final void LJIIIIZZ(LiveShowMessage message) {
        o.LJIIIZ(message, "message");
        ShowContent showContent = message.showContent;
        if (showContent != null) {
            LJIIJ(showContent, "onContentChangedMessageReceived");
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.qv0(LiveShowContentChangedEvent.class, this.LIZIZ);
            }
        }
    }

    @Override // X.U3C
    public final AbstractC73638SvC<C28467BFf<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams) {
        return C78966Uyw.LJJIZ(((ILiveShowApi) Q7L.LIZIZ(ILiveShowApi.class)).getShowContent(getShowContentParams), "LiveShowGuestModel", "getShowContent").LJIILIIL(new AfS65S0100000_13(this, 6)).LJFF(new C62705OjF());
    }
}
