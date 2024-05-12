package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.ILiveShowApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowMatchTotalScoreUpdateEvent;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelayMaxTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelaySetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.im.LiveShowMessage;

/* loaded from: classes14.dex */
public abstract class U39 implements U3C {
    public final DataChannel LIZ;
    public volatile ShowContent LIZIZ;
    public volatile boolean LIZLLL;
    public final CopyOnWriteArrayList<U3Y> LIZJ = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<Long, Long> LJ = new ConcurrentHashMap<>();

    @Override // X.U3C
    public void LIZ() {
    }

    @Override // X.U3C
    public void LIZIZ(SeiAppData seiAppData) {
    }

    @Override // X.U3C
    public void LIZJ(ShowContent showContent) {
    }

    @Override // X.U3C
    public void LIZLLL(LiveShowMessage message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.U3C
    public void LJ(ShowContent showContent) {
    }

    @Override // X.U3C
    public void LJFF(ShowContent showContent) {
    }

    @Override // X.U3C
    public void LJII(ShowContent showContent) {
    }

    @Override // X.U3C
    public void LJIIIIZZ(LiveShowMessage message) {
        o.LJIIIZ(message, "message");
    }

    public abstract String LJIJ();

    public final int LJIILIIL() {
        ShowContent showContent = this.LIZIZ;
        if (showContent != null) {
            return showContent.showStatus;
        }
        return 0;
    }

    public final Long LJIILLIIL() {
        ShowContent showContent = this.LIZIZ;
        if (showContent != null) {
            return Long.valueOf(showContent.showId);
        }
        return null;
    }

    public final void LJIIL() {
        C0NB.LJIIIZ(LJIJ(), "clearMatchScoreForCurrentShow");
        this.LJ.clear();
    }

    @Override // X.U3C
    public void destroy() {
        C0NB.LJIIIZ(LJIJ(), "destroy");
        this.LIZJ.clear();
        LJIIJJI("destroy");
    }

    @Override // X.U3C
    public final ShowContent getContent() {
        return this.LIZIZ;
    }

    public U39(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public static final AbstractC73638SvC<C28467BFf<GetShowSettingsResponse.ResponseData>> LJIIZILJ(GetShowSettingsParams getShowSettingsParams) {
        return T28.LIZLLL(((ILiveShowApi) Q7L.LIZIZ(ILiveShowApi.class)).getShowSetting(getShowSettingsParams));
    }

    @Override // X.U3C
    public AbstractC73638SvC<C28467BFf<FinishShowingGuestResponse.ResponseData>> LJI(FinishShowingGuestParams finishShowingGuestParams) {
        return AbstractC73638SvC.LJIJ(new C28467BFf());
    }

    public final void LJIIIZ(U3H listener) {
        o.LJIIIZ(listener, "listener");
        if (!this.LIZJ.contains(listener)) {
            this.LIZJ.add(listener);
        }
    }

    public final void LJIIJJI(String str) {
        String LJIJ = LJIJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clearCache source=");
        LIZ.append(str);
        C0NB.LJIIIZ(LJIJ, X1D.LIZIZ(LIZ));
        LJIL(null, str);
        LJIIL();
    }

    public final long LJIILJJIL(String str) {
        ShowConfig showConfig;
        Object obj;
        long value;
        ShowContent showContent;
        List<ShowListUser> list;
        List<ShowListUser> list2;
        ShowContent showContent2 = this.LIZIZ;
        long j = 0;
        if (showContent2 == null || (showConfig = showContent2.showConfig) == null) {
            return 0L;
        }
        long j2 = 1000;
        long j3 = showConfig.durationPerGuest * j2;
        ArrayList arrayList = new ArrayList();
        ShowContent showContent3 = this.LIZIZ;
        if (showContent3 != null && (list2 = showContent3.showingAndReadyList) != null) {
            arrayList.addAll(list2);
        }
        ShowContent showContent4 = this.LIZIZ;
        if (showContent4 != null && (list = showContent4.finishedList) != null) {
            arrayList.addAll(list);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ShowListUser showListUser = (ShowListUser) next;
            if (showListUser != null) {
                obj = showListUser.linkmicIdStr;
            }
            if (o.LJ(str, obj)) {
                obj = next;
                break;
            }
        }
        ShowListUser showListUser2 = (ShowListUser) obj;
        if (showListUser2 != null) {
            long j4 = showListUser2.showStartTime;
            if (this.LIZIZ == null || ((showContent = this.LIZIZ) != null && showContent.version == 0)) {
                InterfaceC28738BPq interfaceC28738BPq = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ;
                if (interfaceC28738BPq != null) {
                    value = interfaceC28738BPq.LJJJJLL();
                    if (value > 0) {
                        LiveQuizSEIDelayMaxTimeSetting liveQuizSEIDelayMaxTimeSetting = LiveQuizSEIDelayMaxTimeSetting.INSTANCE;
                        long value2 = liveQuizSEIDelayMaxTimeSetting.getValue();
                        if (1 <= value2 && value2 < value) {
                            value = liveQuizSEIDelayMaxTimeSetting.getValue();
                        }
                        C0NB.LJIIIZ("LiveShowUtil", " seiDelay: " + value);
                    }
                }
                value = LiveQuizSEIDelaySetting.INSTANCE.getValue();
                C0NB.LJIIIZ("LiveShowUtil", " seiDelay: " + value);
            } else {
                value = 0;
            }
            if (C30725C4b.LIZ() + value > j4) {
                j = (C30725C4b.LIZ() + (-value)) - j4;
            }
        }
        return (j3 - j) / j2;
    }

    public final long LJIILL(long j) {
        Long l = this.LJ.get(Long.valueOf(j));
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final void LJIJI(U3H listener) {
        o.LJIIIZ(listener, "listener");
        if (this.LIZJ.contains(listener)) {
            this.LIZJ.remove(listener);
        }
    }

    public final void LJIJJ(ShowContent showContent) {
        o.LJIIIZ(showContent, "showContent");
        LJIL(showContent, "set-content");
    }

    @Override // X.U3C
    public AbstractC73638SvC<C28467BFf<CreateShowResponse.ResponseData>> createShow(CreateShowParams createShowParams) {
        return AbstractC73638SvC.LJIJ(new C28467BFf());
    }

    @Override // X.U3C
    public AbstractC73638SvC<C28467BFf<EndShowResponse.ResponseData>> endShow(EndShowParams endShowParams) {
        return AbstractC73638SvC.LJIJ(new C28467BFf());
    }

    @Override // X.U3C
    public AbstractC73638SvC<C28467BFf<ShowAgainGuestResponse.ResponseData>> showAgainGuest(ShowAgainGuestParams showAgainGuestParams) {
        return AbstractC73638SvC.LJIJ(new C28467BFf());
    }

    @Override // X.U3C
    public AbstractC73638SvC<C28467BFf<UpdateShowContentResponse.ResponseData>> updateShowContent(UpdateShowContentParams updateShowContentParams) {
        return AbstractC73638SvC.LJIJ(new C28467BFf());
    }

    public final boolean LJIIJ(ShowContent showContent, String str) {
        long j;
        if (Long.valueOf(showContent.version) != null) {
            ShowContent showContent2 = this.LIZIZ;
            if (showContent2 != null) {
                j = showContent2.version;
            } else {
                j = 0;
            }
            if (showContent.version > j) {
                LJIL(showContent, str);
                return true;
            }
        }
        FP1.LJFF("ignore update source=", str, LJIJ());
        return false;
    }

    public void LJIL(ShowContent showContent, String str) {
        String str2;
        List<ShowListUser> list;
        List<ShowListUser> list2;
        String LJIJ = LJIJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateModel showContent=");
        if (showContent != null) {
            str2 = C46104I7o.LJJJJZ(showContent);
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(" source=");
        LIZ.append(str);
        C0NB.LJIIIZ(LJIJ, X1D.LIZIZ(LIZ));
        int LJIILIIL = LJIILIIL();
        this.LIZIZ = showContent;
        int LJIILIIL2 = LJIILIIL();
        if (LJIILIIL != LJIILIIL2) {
            if (LJIILIIL2 != 0) {
                if (LJIILIIL2 != 1) {
                    if (LJIILIIL2 != 2) {
                        if (LJIILIIL2 == 3) {
                            String LJIJ2 = LJIJ();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("toStateEnd listeners=");
                            LIZ2.append(this.LIZJ);
                            C0NB.LJIIIZ(LJIJ2, X1D.LIZIZ(LIZ2));
                            Iterator<U3Y> it = this.LIZJ.iterator();
                            while (it.hasNext()) {
                                it.next().LIZIZ(this);
                            }
                        }
                    } else {
                        this.LIZLLL = true;
                        String LJIJ3 = LJIJ();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("toStateShowing listeners=");
                        LIZ3.append(this.LIZJ);
                        C0NB.LJIIIZ(LJIJ3, X1D.LIZIZ(LIZ3));
                        Iterator<U3Y> it2 = this.LIZJ.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZJ(this);
                        }
                    }
                } else {
                    String LJIJ4 = LJIJ();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("toStateReady listeners=");
                    LIZ4.append(this.LIZJ);
                    C0NB.LJIIIZ(LJIJ4, X1D.LIZIZ(LIZ4));
                    Iterator<U3Y> it3 = this.LIZJ.iterator();
                    while (it3.hasNext()) {
                        it3.next().LIZLLL(this);
                    }
                }
            } else {
                this.LIZLLL = false;
                String LJIJ5 = LJIJ();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("toStateIdle listeners=");
                LIZ5.append(this.LIZJ);
                C0NB.LJIIIZ(LJIJ5, X1D.LIZIZ(LIZ5));
                Iterator<U3Y> it4 = this.LIZJ.iterator();
                while (it4.hasNext()) {
                    it4.next().LIZ(this);
                }
            }
        }
        ShowContent showContent2 = this.LIZIZ;
        if (showContent2 != null && (list2 = showContent2.showingAndReadyList) != null) {
            for (ShowListUser showListUser : list2) {
                LJIJJLI(showListUser.userId, showListUser.score, str);
            }
        }
        ShowContent showContent3 = this.LIZIZ;
        if (showContent3 != null && (list = showContent3.finishedList) != null) {
            for (ShowListUser showListUser2 : list) {
                LJIJJLI(showListUser2.userId, showListUser2.score, str);
            }
        }
    }

    public final void LJIJJLI(long j, long j2, String str) {
        Long l = this.LJ.get(Long.valueOf(j));
        if (l == null) {
            l = 0L;
        }
        long longValue = l.longValue();
        String LJIJ = LJIJ();
        StringBuilder LIZJ = V10.LIZJ("updateMatchTotalScore userId=", j, " matchTotalScore=");
        LIZJ.append(j2);
        C0MT.LIZLLL(LIZJ, " previousMatchTotalScore=", longValue, " source=");
        JBR.LJIIJ(LIZJ, str, LIZJ, LJIJ);
        if (j2 > longValue) {
            this.LJ.put(Long.valueOf(j), Long.valueOf(j2));
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.qv0(LiveShowMatchTotalScoreUpdateEvent.class, new TUQ(j, j2));
            }
        }
    }
}
