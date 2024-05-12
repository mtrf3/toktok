package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.ILiveShowApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowContentChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowFinishGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowNextGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowShowAgainGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.livesdk.sei.SeiLiveShowExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.im.LiveShowMessage;

/* loaded from: classes14.dex */
public final class U36 extends U39 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJII;
    public final U3T LJFF;
    public final C31657Cbd LJI;

    static {
        TBT tbt = new TBT(U36.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/ZoomService;", 0);
        C65352Pkq.LIZ.getClass();
        LJII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.U39
    public final String LJIJ() {
        return "LiveShowAnchorModel";
    }

    @Override // X.U39, X.U3C
    public final void LIZ() {
        List<ShowListUser> list;
        List<ShowListUser> list2;
        ShowListUser showListUser;
        Long l;
        List<ShowListUser> list3;
        ShowConfig showConfig;
        ShowContent showContent = this.LIZIZ;
        if (showContent != null && (list = showContent.showingAndReadyList) != null) {
            Iterator<ShowListUser> it = list.iterator();
            while (true) {
                list2 = null;
                if (it.hasNext()) {
                    showListUser = it.next();
                    if (showListUser.status == 2) {
                        break;
                    }
                } else {
                    showListUser = null;
                    break;
                }
            }
            ShowListUser showListUser2 = showListUser;
            if (showListUser2 == null) {
                return;
            }
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                ShowContent showContent2 = this.LIZIZ;
                if (showContent2 != null && (showConfig = showContent2.showConfig) != null) {
                    l = Long.valueOf(showConfig.durationPerGuest);
                } else {
                    l = null;
                }
                ShowContent showContent3 = this.LIZIZ;
                if (showContent3 != null) {
                    list3 = showContent3.showingAndReadyList;
                } else {
                    list3 = null;
                }
                ShowContent showContent4 = this.LIZIZ;
                if (showContent4 != null) {
                    list2 = showContent4.finishedList;
                }
                dataChannel.qv0(LiveShowNextGuestEvent.class, new U33(l, showListUser2, list3, list2));
            }
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.qv0(LiveShowContentChangedEvent.class, this.LIZIZ);
            }
            ZoomService zoomService = (ZoomService) this.LJI.LIZ(this, LJII[0]);
            if (zoomService == null) {
                return;
            }
            String linkMicId = showListUser2.linkmicIdStr;
            o.LJIIIZ(linkMicId, "linkMicId");
            AbstractC75001Tc5 LJIIJJI = zoomService.LJIIJJI();
            LJIIJJI.getClass();
            LJIIJJI.LIZ.LJIIJJI(linkMicId);
        }
    }

    @Override // X.U39, X.U3C
    public final void destroy() {
        IMessageManager iMessageManager;
        U3T u3t = this.LJFF;
        u3t.getClass();
        try {
            DataChannel dataChannel = u3t.LIZ;
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) u3t.LIZJ);
            }
        } catch (Exception e) {
            C0NB.LJII(e);
        }
        super.destroy();
    }

    public U36(DataChannel dataChannel) {
        super(dataChannel);
        this.LJFF = new U3T(dataChannel, this);
        this.LJI = new C31657Cbd("ZOOM_SERVICE");
        C0NB.LJIIIZ("LiveShowAnchorModel", "init");
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
        List<ShowListUser> list;
        ShowListUser showListUser;
        Long l;
        ShowListUser showListUser2;
        List<ShowListUser> list2;
        List<ShowListUser> list3;
        ShowListUser showListUser3;
        ShowConfig showConfig;
        String str;
        int i;
        ShowContent content;
        String l2;
        ShowContent content2;
        ShowConfig showConfig2;
        ShowContent content3;
        ShowConfig showConfig3;
        o.LJIIIZ(message, "message");
        ShowContent showContent = message.showContent;
        if (showContent != null) {
            Iterator<ShowListUser> it = showContent.showingAndReadyList.iterator();
            while (true) {
                list = null;
                if (it.hasNext()) {
                    showListUser = it.next();
                    if (showListUser.status == 2) {
                        break;
                    }
                } else {
                    showListUser = null;
                    break;
                }
            }
            ShowListUser showListUser4 = showListUser;
            if (showListUser4 != null) {
                long j = showListUser4.userId;
                if (C76548U2m.LJIIL != 0) {
                    C76548U2m.LJIIIIZZ(C76548U2m.LJIIL);
                }
                C76548U2m.LJIIL = j;
                C76548U2m.LJIILIIL = System.currentTimeMillis();
                java.util.Map LIZJ = C76548U2m.LIZJ();
                LIZJ.put("guest_cnt", String.valueOf(C76548U2m.LJ()));
                U35 LIZ = TQA.LIZ();
                String str2 = "";
                if (LIZ == null || (content3 = LIZ.getContent()) == null || (showConfig3 = content3.showConfig) == null || (str = Long.valueOf(showConfig3.durationPerGuest).toString()) == null) {
                    str = "";
                }
                LIZJ.put("show_duration_per_guest", str);
                U35 LIZ2 = TQA.LIZ();
                if (LIZ2 != null && (content2 = LIZ2.getContent()) != null && (showConfig2 = content2.showConfig) != null && showConfig2.allowOpenMicFreely) {
                    i = 1;
                } else {
                    i = 0;
                }
                LIZJ.put("is_guest_mic_open", String.valueOf(i));
                U35 LIZ3 = TQA.LIZ();
                if (LIZ3 != null && (content = LIZ3.getContent()) != null && (l2 = Long.valueOf(content.showId).toString()) != null) {
                    str2 = l2;
                }
                LIZJ.put("multiguest_liveshow_id", str2);
                LIZJ.put("onstage_guest_id", String.valueOf(j));
                C76548U2m.LJIIZILJ("livesdk_anchor_multiguest_liveshow_guest_onstage_start", LIZJ);
            }
            LJIIJ(showContent, "onNextGuestMessageReceived");
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                ShowContent showContent2 = this.LIZIZ;
                if (showContent2 != null && (showConfig = showContent2.showConfig) != null) {
                    l = Long.valueOf(showConfig.durationPerGuest);
                } else {
                    l = null;
                }
                ShowContent showContent3 = this.LIZIZ;
                if (showContent3 != null && (list3 = showContent3.showingAndReadyList) != null) {
                    Iterator<ShowListUser> it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            showListUser3 = it2.next();
                            if (showListUser3.status == 2) {
                                break;
                            }
                        } else {
                            showListUser3 = null;
                            break;
                        }
                    }
                    showListUser2 = showListUser3;
                } else {
                    showListUser2 = null;
                }
                ShowContent showContent4 = this.LIZIZ;
                if (showContent4 != null) {
                    list2 = showContent4.showingAndReadyList;
                } else {
                    list2 = null;
                }
                ShowContent showContent5 = this.LIZIZ;
                if (showContent5 != null) {
                    list = showContent5.finishedList;
                }
                dataChannel.qv0(LiveShowNextGuestEvent.class, new U33(l, showListUser2, list2, list));
            }
        }
    }

    @Override // X.U39, X.U3C
    public final void LJ(ShowContent showContent) {
        LJIIJ(showContent, "onCreateShowMessageReceived");
    }

    @Override // X.U39, X.U3C
    public final void LJFF(ShowContent showContent) {
        LJIIJ(showContent, "onEndShowMessageReceived");
    }

    @Override // X.U39, X.U3C
    public final AbstractC73638SvC<C28467BFf<FinishShowingGuestResponse.ResponseData>> LJI(FinishShowingGuestParams finishShowingGuestParams) {
        return C78966Uyw.LJJIZ(((ILiveShowApi) Q7L.LIZIZ(ILiveShowApi.class)).finishGuest(finishShowingGuestParams), "LiveShowAnchorModel", "finishGuest").LJIILIIL(new AfS65S0100000_13(this, 214)).LJFF(new C62705OjF());
    }

    @Override // X.U39, X.U3C
    public final void LJII(ShowContent showContent) {
        DataChannel dataChannel;
        if (LJIIJ(showContent, "onFinishGuestMessageReceived") && (dataChannel = this.LIZ) != null) {
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

    @Override // X.U39, X.U3C
    public final AbstractC73638SvC<C28467BFf<CreateShowResponse.ResponseData>> createShow(CreateShowParams createShowParams) {
        return C78966Uyw.LJJIZ(((ILiveShowApi) Q7L.LIZIZ(ILiveShowApi.class)).createShow(createShowParams), "LiveShowAnchorModel", "createShow").LJIILIIL(new AfS65S0100000_13(this, 212)).LJFF(new C62705OjF());
    }

    @Override // X.U39, X.U3C
    public final AbstractC73638SvC<C28467BFf<EndShowResponse.ResponseData>> endShow(EndShowParams endShowParams) {
        return C78966Uyw.LJJIZ(((ILiveShowApi) Q7L.LIZIZ(ILiveShowApi.class)).endShow(endShowParams), "LiveShowAnchorModel", "endShow").LJIILIIL(new AfS65S0100000_13(this, 213)).LJFF(new C62705OjF());
    }

    @Override // X.U3C
    public final AbstractC73638SvC<C28467BFf<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams) {
        return C78966Uyw.LJJIZ(((ILiveShowApi) Q7L.LIZIZ(ILiveShowApi.class)).getShowContent(getShowContentParams), "LiveShowAnchorModel", "getShowContent").LJIILIIL(new AfS65S0100000_13(this, 215)).LJFF(new C62705OjF());
    }

    @Override // X.U39, X.U3C
    public final AbstractC73638SvC<C28467BFf<ShowAgainGuestResponse.ResponseData>> showAgainGuest(ShowAgainGuestParams showAgainGuestParams) {
        return C78966Uyw.LJJIZ(((ILiveShowApi) Q7L.LIZIZ(ILiveShowApi.class)).showAgainGuest(showAgainGuestParams), "LiveShowAnchorModel", "showAgainGuest").LJIILIIL(new AfS65S0100000_13(this, 216)).LJFF(new C62705OjF());
    }

    @Override // X.U39, X.U3C
    public final AbstractC73638SvC<C28467BFf<UpdateShowContentResponse.ResponseData>> updateShowContent(UpdateShowContentParams updateShowContentParams) {
        return C78966Uyw.LJJIZ(((ILiveShowApi) Q7L.LIZIZ(ILiveShowApi.class)).updateShowContent(updateShowContentParams), "LiveShowAnchorModel", "updateShowContent").LJIILIIL(new AfS65S0100000_13(this, 217)).LJFF(new C62705OjF());
    }

    @Override // X.U39
    public final void LJIL(ShowContent showContent, String str) {
        int i;
        long j;
        U8H LJJZZI;
        ShowConfig showConfig;
        U8H LJJZZI2;
        super.LJIL(showContent, str);
        if (LJIILIIL() == 0) {
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LJJZZI2 = R6.LJJZZI()) != null) {
                LJJZZI2.LJJJJZ();
                return;
            }
            return;
        }
        SeiLiveShowExtra seiLiveShowExtra = new SeiLiveShowExtra(0, 0L, 0, 7, null);
        ShowContent showContent2 = this.LIZIZ;
        if (showContent2 != null && (showConfig = showContent2.showConfig) != null) {
            i = (int) showConfig.durationPerGuest;
        } else {
            i = 0;
        }
        seiLiveShowExtra.eachShowDuration = i;
        ShowContent showContent3 = this.LIZIZ;
        if (showContent3 != null) {
            j = showContent3.showId;
        } else {
            j = 0;
        }
        seiLiveShowExtra.showId = j;
        seiLiveShowExtra.showStatus = LJIILIIL();
        HashMap hashMap = new HashMap();
        ShowContent showContent4 = this.LIZIZ;
        if (showContent4 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(showContent4.showingAndReadyList);
            arrayList.addAll(showContent4.finishedList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ShowListUser showListUser = (ShowListUser) it.next();
                String str2 = showListUser.linkmicIdStr;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("order", showListUser.order);
                jSONObject.put("time", showListUser.showStartTime);
                jSONObject.put("status", showListUser.status);
                hashMap.put(str2, jSONObject);
            }
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 == null || (LJJZZI = R62.LJJZZI()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("show_status", String.valueOf(seiLiveShowExtra.showStatus));
        linkedHashMap.put("each_show_duration", String.valueOf(seiLiveShowExtra.eachShowDuration));
        linkedHashMap.put("show_id", String.valueOf(seiLiveShowExtra.showId));
        LJJZZI.LJJJJL(linkedHashMap, hashMap);
    }
}
