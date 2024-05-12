package X;

import X.C0M9;
import Y.ARunnableS4S0310000_5;
import Y.ARunnableS8S0201000_5;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider;
import com.bytedance.android.livesdk.list.MultiRoomIdListProvider;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchScrollFpsOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchThreadPriorityOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveHotDegradeSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveJitBlockSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FixEnterRoomParamsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.JatoGcBlockerExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveSurfaceNewVersionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class BKP implements C0C3 {
    public BKJ LJLILLLLZI;
    public String LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final String LJLJLLL;
    public int LJLL;
    public final /* synthetic */ LiveRoomFragment LJLLJ;
    public int LJLIL = -1;
    public long LJLJI = -1;
    public final SparseBooleanArray LJLLI = new SparseBooleanArray();
    public final SparseLongArray LJLLILLLL = new SparseLongArray();

    public final B35 LIZJ(int i) {
        BKJ LJJIII;
        String playerTag;
        if (i < 0 || i >= this.LJLLJ.LLFII.getCount() || (LJJIII = this.LJLLJ.LLFII.LJJIII(i)) == null) {
            return null;
        }
        B35 LIZLLL = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Wp().LIZLLL(LJJIII.m2());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getPlayerClientByPosition -> ");
        if (LIZLLL == null) {
            playerTag = "null";
        } else {
            playerTag = LIZLLL.getPlayerTag();
        }
        LIZ.append(playerTag);
        B4I.LIZ("MultiPlayerPrePullStream", X1D.LIZIZ(LIZ));
        return LIZLLL;
    }

    public final void LJ(int i) {
        if (i < 0 || i >= this.LJLLJ.LLFII.getCount()) {
            return;
        }
        BKJ LJJIII = this.LJLLJ.LLFII.LJJIII(i);
        Collection values = this.LJLLJ.LLFII.LJLJL.values();
        if (values != null) {
            Iterator it = ((C0M9.e) values).iterator();
            while (true) {
                C0M7 c0m7 = (C0M7) it;
                if (!c0m7.hasNext()) {
                    break;
                }
                BKJ bkj = (BKJ) c0m7.next();
                if (bkj != null && bkj != LJJIII) {
                    bkj.Uj();
                    bkj.el();
                    bkj.Db();
                }
            }
        }
        if (LJJIII != null) {
            LJJIII.LLZLI();
        }
        LIZLLL(i, true);
        B35 LIZJ = LIZJ(i);
        if (LIZJ != null) {
            LIZJ.lambda$setMuteNew$0(false, "multi-player release all useless player");
        }
        BMZ Wp = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Wp();
        this.LJLLJ.getContext();
        Iterator it2 = ((HashMap) Wp.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            B35 b35 = (B35) ((Map.Entry) it2.next()).getValue();
            if (b35 == null || LIZJ == null || !TextUtils.equals(b35.getPlayerTag(), LIZJ.getPlayerTag())) {
                b35.stop(true);
                b35.release();
                it2.remove();
            }
        }
        this.LJLLI.clear();
        this.LJLLI.put(i, true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("releaseAllUselessPlayer index ");
        LIZ.append(i);
        B4I.LIZ("MultiPlayerPrePullStream", X1D.LIZIZ(LIZ));
    }

    public final void LJI(BKJ bkj) {
        this.LJLILLLLZI = bkj;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_live_bottom_end", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
            return;
        }
        LiveRoomFragment liveRoomFragment = this.LJLLJ;
        if (liveRoomFragment.LLFII != null && liveRoomFragment.LLFFF != null && C28329B9x.LIZIZ(liveRoomFragment.getContext())) {
            int LJIIL = this.LJLLJ.LLFII.LJIIL(bkj);
            if (LJIIL == 0) {
                if (this.LJLLJ.LLFII.getCount() == 1 && !this.LJLLJ.LLFFF.LJIILL()) {
                    this.LJLLJ.getClass();
                    LiveRoomFragment.Ll("only_one");
                    return;
                } else {
                    this.LJLLJ.getClass();
                    LiveRoomFragment.Ll("top");
                    return;
                }
            }
            if (LJIIL != this.LJLLJ.LLFII.getCount() - 1) {
                return;
            }
            this.LJLLJ.getClass();
            LiveRoomFragment.Ll("bottom");
        }
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        CHK chk;
        CHK chk2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageScrollStateChanged invoked, state is ");
        LIZ.append(i);
        B4I.LIZ("LiveRoomFragment", X1D.LIZIZ(LIZ));
        C80797VnN c80797VnN = this.LJLLJ.LLF;
        if (c80797VnN != null && i == 2) {
            B5S.LIZIZ = c80797VnN.LLFFF;
        }
        if (i == 0) {
            C30326BvG.LIZIZ = false;
            if (LiveWatchScrollFpsOptSetting.INSTANCE.enable("inflate")) {
                C81245Vub c81245Vub = C81245Vub.LJLJJL;
                c81245Vub.LJLJI = false;
                LockSupport.unpark(c81245Vub);
            }
            LiveRoomFragment liveRoomFragment = this.LJLLJ;
            if (liveRoomFragment.LLILLJJLI && this.LJLJJL != 1) {
                LJ(liveRoomFragment.LLF.getCurrentItem());
            }
            this.LJLLILLLL.clear();
            C40625Fwz.LIZ();
            C40625Fwz.LIZJ();
            C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("watch_slide");
            if (c5h3 != null && (chk2 = (CHK) c5h3.getValue()) != null) {
                chk2.stop();
            }
            LiveRoomFragment liveRoomFragment2 = this.LJLLJ;
            liveRoomFragment2.getClass();
            if (RecommendEndAtFollowingSetting.INSTANCE.getValue().enableShowRecommend == 3) {
                liveRoomFragment2.LLF.LJJII(1.0f, true);
            }
        } else if (i == 1) {
            if (LiveJitBlockSetting.INSTANCE.isEnable()) {
                ((IHostPerformanceOpt) CN1.LIZ(IHostPerformanceOpt.class)).k4(3000L);
            }
            C30326BvG.LIZIZ = true;
            if (LiveWatchScrollFpsOptSetting.INSTANCE.enable("inflate")) {
                C81245Vub.LJLJJL.LJLJI = true;
            }
            if (LiveWatchThreadPriorityOptSetting.INSTANCE.enableSlideBoost()) {
                ((IHostPerformanceOpt) CN1.LIZ(IHostPerformanceOpt.class)).zk0();
            }
            C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", "startSwitchRoom");
            C22800uy.LIZ = 2;
            C40625Fwz.LIZIZ();
            C5H3 c5h32 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("watch_slide");
            if (c5h32 != null && (chk = (CHK) c5h32.getValue()) != null) {
                chk.start();
            }
            C88207Yjb.LJIILLIIL();
            C88207Yjb.LJI = "";
            if ((JatoGcBlockerExperiment.INSTANCE.isEnable() || LiveHotDegradeSetting.INSTANCE.disableGc()) && this.LJLLJ.getContext() != null) {
                JatoXL.requestBlockGc(1000L);
            }
        } else if (i == 2) {
            C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", "switchRoomSuccess");
            C22800uy.LIZ = 0;
        }
        this.LJLJJL = i;
        if (i == 1) {
            this.LJLL = this.LJLLJ.LLF.getCurrentItem();
            LiveRoomFragment liveRoomFragment3 = this.LJLLJ;
            liveRoomFragment3.LLILII = false;
            liveRoomFragment3.LLIL = true;
        }
        if (this.LJLJJL == 0) {
            this.LJLLJ.LLIIZ = false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:23|(8:24|25|26|(1:28)|29|(2:30|(2:36|(2:39|40)(1:38))(3:106|108|107))|41|42)|(24:47|48|49|(1:51)(1:102)|52|53|(3:55|56|(4:58|59|60|61)(2:64|(4:66|67|68|69)))|72|(1:74)(1:101)|75|(2:77|78)|79|(1:100)|81|(2:83|84)|85|(1:87)|88|(1:99)|90|91|92|93|94)|105|49|(0)(0)|52|53|(0)|72|(0)(0)|75|(0)|79|(0)|81|(0)|85|(0)|88|(1:99)|90|91|92|93|94) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0447 A[Catch: all -> 0x0488, TryCatch #3 {all -> 0x0488, blocks: (B:25:0x030b, B:28:0x032c, B:29:0x0332, B:30:0x0336, B:32:0x033c, B:34:0x0340, B:36:0x0346, B:40:0x034f, B:38:0x0365, B:41:0x035b, B:44:0x036e, B:48:0x0375, B:49:0x0397, B:51:0x039d, B:52:0x03ad, B:55:0x03b5, B:58:0x03bf, B:60:0x03d4, B:61:0x0400, B:64:0x03d8, B:66:0x03e0, B:68:0x03f5, B:69:0x03f8, B:72:0x0407, B:74:0x040b, B:75:0x0416, B:77:0x041c, B:79:0x042d, B:81:0x0433, B:83:0x0439, B:85:0x044d, B:87:0x0459, B:88:0x0465, B:90:0x046b, B:99:0x0480, B:100:0x0447), top: B:24:0x030b }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x039d A[Catch: all -> 0x0488, TryCatch #3 {all -> 0x0488, blocks: (B:25:0x030b, B:28:0x032c, B:29:0x0332, B:30:0x0336, B:32:0x033c, B:34:0x0340, B:36:0x0346, B:40:0x034f, B:38:0x0365, B:41:0x035b, B:44:0x036e, B:48:0x0375, B:49:0x0397, B:51:0x039d, B:52:0x03ad, B:55:0x03b5, B:58:0x03bf, B:60:0x03d4, B:61:0x0400, B:64:0x03d8, B:66:0x03e0, B:68:0x03f5, B:69:0x03f8, B:72:0x0407, B:74:0x040b, B:75:0x0416, B:77:0x041c, B:79:0x042d, B:81:0x0433, B:83:0x0439, B:85:0x044d, B:87:0x0459, B:88:0x0465, B:90:0x046b, B:99:0x0480, B:100:0x0447), top: B:24:0x030b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03b5 A[Catch: all -> 0x0488, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0488, blocks: (B:25:0x030b, B:28:0x032c, B:29:0x0332, B:30:0x0336, B:32:0x033c, B:34:0x0340, B:36:0x0346, B:40:0x034f, B:38:0x0365, B:41:0x035b, B:44:0x036e, B:48:0x0375, B:49:0x0397, B:51:0x039d, B:52:0x03ad, B:55:0x03b5, B:58:0x03bf, B:60:0x03d4, B:61:0x0400, B:64:0x03d8, B:66:0x03e0, B:68:0x03f5, B:69:0x03f8, B:72:0x0407, B:74:0x040b, B:75:0x0416, B:77:0x041c, B:79:0x042d, B:81:0x0433, B:83:0x0439, B:85:0x044d, B:87:0x0459, B:88:0x0465, B:90:0x046b, B:99:0x0480, B:100:0x0447), top: B:24:0x030b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x040b A[Catch: all -> 0x0488, TryCatch #3 {all -> 0x0488, blocks: (B:25:0x030b, B:28:0x032c, B:29:0x0332, B:30:0x0336, B:32:0x033c, B:34:0x0340, B:36:0x0346, B:40:0x034f, B:38:0x0365, B:41:0x035b, B:44:0x036e, B:48:0x0375, B:49:0x0397, B:51:0x039d, B:52:0x03ad, B:55:0x03b5, B:58:0x03bf, B:60:0x03d4, B:61:0x0400, B:64:0x03d8, B:66:0x03e0, B:68:0x03f5, B:69:0x03f8, B:72:0x0407, B:74:0x040b, B:75:0x0416, B:77:0x041c, B:79:0x042d, B:81:0x0433, B:83:0x0439, B:85:0x044d, B:87:0x0459, B:88:0x0465, B:90:0x046b, B:99:0x0480, B:100:0x0447), top: B:24:0x030b }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x041c A[Catch: all -> 0x0488, TryCatch #3 {all -> 0x0488, blocks: (B:25:0x030b, B:28:0x032c, B:29:0x0332, B:30:0x0336, B:32:0x033c, B:34:0x0340, B:36:0x0346, B:40:0x034f, B:38:0x0365, B:41:0x035b, B:44:0x036e, B:48:0x0375, B:49:0x0397, B:51:0x039d, B:52:0x03ad, B:55:0x03b5, B:58:0x03bf, B:60:0x03d4, B:61:0x0400, B:64:0x03d8, B:66:0x03e0, B:68:0x03f5, B:69:0x03f8, B:72:0x0407, B:74:0x040b, B:75:0x0416, B:77:0x041c, B:79:0x042d, B:81:0x0433, B:83:0x0439, B:85:0x044d, B:87:0x0459, B:88:0x0465, B:90:0x046b, B:99:0x0480, B:100:0x0447), top: B:24:0x030b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0439 A[Catch: all -> 0x0488, TryCatch #3 {all -> 0x0488, blocks: (B:25:0x030b, B:28:0x032c, B:29:0x0332, B:30:0x0336, B:32:0x033c, B:34:0x0340, B:36:0x0346, B:40:0x034f, B:38:0x0365, B:41:0x035b, B:44:0x036e, B:48:0x0375, B:49:0x0397, B:51:0x039d, B:52:0x03ad, B:55:0x03b5, B:58:0x03bf, B:60:0x03d4, B:61:0x0400, B:64:0x03d8, B:66:0x03e0, B:68:0x03f5, B:69:0x03f8, B:72:0x0407, B:74:0x040b, B:75:0x0416, B:77:0x041c, B:79:0x042d, B:81:0x0433, B:83:0x0439, B:85:0x044d, B:87:0x0459, B:88:0x0465, B:90:0x046b, B:99:0x0480, B:100:0x0447), top: B:24:0x030b }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0459 A[Catch: all -> 0x0488, TryCatch #3 {all -> 0x0488, blocks: (B:25:0x030b, B:28:0x032c, B:29:0x0332, B:30:0x0336, B:32:0x033c, B:34:0x0340, B:36:0x0346, B:40:0x034f, B:38:0x0365, B:41:0x035b, B:44:0x036e, B:48:0x0375, B:49:0x0397, B:51:0x039d, B:52:0x03ad, B:55:0x03b5, B:58:0x03bf, B:60:0x03d4, B:61:0x0400, B:64:0x03d8, B:66:0x03e0, B:68:0x03f5, B:69:0x03f8, B:72:0x0407, B:74:0x040b, B:75:0x0416, B:77:0x041c, B:79:0x042d, B:81:0x0433, B:83:0x0439, B:85:0x044d, B:87:0x0459, B:88:0x0465, B:90:0x046b, B:99:0x0480, B:100:0x0447), top: B:24:0x030b }] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Integer, O] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Integer, O] */
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r15) {
        /*
            Method dump skipped, instructions count: 1563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BKP.onPageSelected(int):void");
    }

    public BKP(LiveRoomFragment liveRoomFragment, String str) {
        this.LJLLJ = liveRoomFragment;
        this.LJLJLLL = str;
    }

    public final void LIZIZ(int i, final BKJ bkj) {
        EnterRoomConfig Jj;
        BJL bjl;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doChangePage -> position=");
        LIZ.append(i);
        B4I.LIZ("LiveRoomFragment", X1D.LIZIZ(LIZ));
        C12800eq.LJFF(EnumC12790ep.ScrollWatchLivePlay);
        LiveRoomFragment liveRoomFragment = this.LJLLJ;
        liveRoomFragment.LLILIL = true;
        if (liveRoomFragment.LLILLL && i >= 0 && i < liveRoomFragment.LLFII.getCount()) {
            List<Room> LJIILJJIL = this.LJLLJ.LLFFF.LJIILJJIL();
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            if (LJIILJJIL != null && !C79004UzY.LJJIFFI(LJIILJJIL)) {
                for (int i2 = i + 1; i2 <= LJIILJJIL.size() - 1; i2++) {
                    Room room = (Room) ListProtector.get(LJIILJJIL, i2);
                    if (room != null && room.getStreamUrl() != null && room.getStreamUrl().liveCoreSDKData != null && room.getStreamUrl().liveCoreSDKData.getPullData() != null) {
                        arrayList.add(C38393F4z.LJFF(room.getStreamUrl().liveCoreSDKData.getPullData()));
                        arrayList2.add(room.getStreamUrl().rtmpPullUrl);
                    }
                }
            }
            StringBuilder LJ = C7MY.LJ("position = ", i, ", size=");
            LJ.append(arrayList.size());
            LJ.append(" \n");
            LJ.append(arrayList2);
            C0NB.LIZIZ("preDownloadStreamData", X1D.LIZIZ(LJ));
            InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag);
            if (LIZIZ != null) {
                LIZIZ.LJ(arrayList);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLLILLLL.clear();
        BKJ bkj2 = this.LJLILLLLZI;
        if (bkj2 != null) {
            LiveRoomFragment liveRoomFragment2 = this.LJLLJ;
            if (liveRoomFragment2.LLILLJJLI) {
                LJ(i);
            } else {
                if (liveRoomFragment2.LLIIL) {
                    bkj2.u3();
                } else {
                    C31811Ce7.LIZLLL("invite_issue_check", "LinkIn_Guest_doChangePage");
                    this.LJLILLLLZI.T4();
                }
                this.LJLILLLLZI.Db();
            }
            if (this.LJLILLLLZI.getFragment() != null) {
                this.LJLILLLLZI.Jj().mRoomsData.enterType = null;
                this.LJLILLLLZI.Jj().mRoomsData.enterRoomScene = "inner_draw";
            }
            if (LiveRoomFragment.LLIZ) {
                LiveRoomFragment.LLIZ = false;
            }
            if ((this.LJLILLLLZI instanceof LivePlayFragment) && FixEnterRoomParamsSetting.INSTANCE.getCurrentValue()) {
                ((LivePlayFragment) this.LJLILLLLZI).xm();
            }
        }
        synchronized (C20910rv.LIZ) {
            Iterator<Map.Entry<Integer, C20810rl>> it = C20910rv.LJ.entrySet().iterator();
            while (it.hasNext()) {
                C20890rt c20890rt = it.next().getValue().LIZLLL;
                if (c20890rt != null) {
                    c20890rt.LJIIIIZZ++;
                }
            }
            Iterator<Map.Entry<Integer, List<C20810rl>>> it2 = C20910rv.LJFF.entrySet().iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = it2.next().getValue().iterator();
                while (it3.hasNext()) {
                    C20890rt c20890rt2 = ((C20810rl) it3.next()).LIZLLL;
                    if (c20890rt2 != null) {
                        c20890rt2.LJIIIIZZ++;
                    }
                }
            }
            C20910rv.LIZIZ = -1L;
        }
        if (bkj != null && bkj.getFragment() != null) {
            if (this.LJLILLLLZI != null) {
                bkj.Jj().mRoomsData.enterType = "draw";
                bkj.Jj().mRoomsData.timeStamps.enterRoomStarTime = currentTimeMillis;
                bkj.Jj().mRoomsData.enterRoomScene = "inner_draw";
                if (this.LJLILLLLZI.Jj() != null) {
                    bkj.Jj().mRoomsData.preIsMicRoom = this.LJLILLLLZI.Jj().mRoomsData.curIsMicRoom;
                    bkj.Jj().mLogData.cardRoomId = this.LJLILLLLZI.Jj().mLogData.cardRoomId;
                    bkj.Jj().mLogData.fromRoomId = this.LJLILLLLZI.Jj().mRoomsData.roomId;
                }
                if (bkj.Jj() != null) {
                    if (this.LJLLJ.LJLJJLL) {
                        bkj.Jj().mLogData.drawAction = "down";
                    } else {
                        bkj.Jj().mLogData.drawAction = "up";
                    }
                }
                LiveRoomFragment liveRoomFragment3 = this.LJLLJ;
                final BLH blh = liveRoomFragment3.LJLIL;
                if (blh != null) {
                    final BKJ bkj3 = this.LJLILLLLZI;
                    final boolean z = liveRoomFragment3.LJLJJLL;
                    if (bkj3 != null && bkj3.Jj() != null) {
                        final Room B2 = bkj3.B2();
                        final EnterRoomConfig Jj2 = bkj3.Jj();
                        EnterRoomConfig Jj3 = bkj.Jj();
                        C38995FSd.LIZIZ().execute(new Runnable() { // from class: X.B6j
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                int i3;
                                BLH blh2 = BLH.this;
                                BKJ bkj4 = bkj3;
                                BKJ bkj5 = bkj;
                                boolean z2 = z;
                                Room room2 = B2;
                                EnterRoomConfig enterRoomConfig = Jj2;
                                blh2.getClass();
                                String str2 = enterRoomConfig.mRoomsData.followStatus;
                                String str3 = enterRoomConfig.mLogData.anchorId;
                                if (room2 != null) {
                                    if (room2.getOwner() != null) {
                                        if (room2.getOwner().getFollowInfo() != null) {
                                            str2 = String.valueOf(room2.getOwner().getFollowInfo().getFollowStatus());
                                        }
                                        str3 = String.valueOf(room2.getOwner().getId());
                                    }
                                    str = C1DJ.LJIILIIL(room2);
                                } else {
                                    str = "normal";
                                }
                                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_draw");
                                LIZ2.LJIJJ(str3, "anchor_id");
                                LIZ2.LJIJJ(Long.valueOf(bkj4.getRoomId()), "room_id");
                                if (z2) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                LIZ2.LJIJJ(Integer.valueOf(i3), "draw_action");
                                LIZ2.LJIJJ(Long.valueOf(bkj5.getRoomId()), "to_group_id");
                                LIZ2.LJIJJ(1, "is_inner");
                                LIZ2.LJIJJ(str2, "follow_status");
                                LIZ2.LJIJJ(str, "connection_type");
                                LIZ2.LJIJJ(enterRoomConfig.mRoomsData.actionType, "action_type");
                                if (bkj4.LJIIL() != null && bkj4.LJIIL().kv0(BJO.class) != null) {
                                    if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                                        LIZ2.LJIILLIIL(bkj4.LJIIL());
                                        LIZ2.LJJIIJZLJL();
                                        return;
                                    }
                                    LIZ2.LJJIJ();
                                    LIZ2.LJIJJ(BJM.LJLIL.LIZJ(), "live_type");
                                    LIZ2.LJIJJ(BJM.LJIJ(), "video_id");
                                    LIZ2.LJIJJ(BJM.LJIILIIL(), "request_id");
                                    LIZ2.LJI();
                                    LIZ2.LJJIIZI();
                                }
                            }
                        });
                        C38995FSd.LIZIZ().execute(new ARunnableS4S0310000_5(blh, Jj2, z, Jj3, 2));
                    }
                }
                Room LJIIIIZZ = this.LJLLJ.LLFFF.LJIIIIZZ(i);
                if (LJIIIIZZ != null && LJIIIIZZ.isFromRecommendCard) {
                    bkj.Jj().mRoomsData.enterFromMergeRecommend = "pop_card";
                }
            }
            B57.LIZ.LIZ().LIZIZ(new Event("liveroom_slide_start_liveplay", 256, EnumC28203B5b.BussinessApiCall));
            if (this.LJLLJ.LLILLJJLI) {
                LJ(i);
                ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LJIIIZ(bkj.m2());
            }
            C17N.LJJJJZI(bkj.Jj(), i);
            bkj.LLZLI();
            bkj.C5();
            ((IQAService) CN1.LIZ(IQAService.class)).Hk0();
            C15610jN.LIZ().removeCallbacksAndMessages(B70.LIZ);
            BKJ bkj4 = this.LJLILLLLZI;
            if (bkj4 != null) {
                bkj4.U5();
                C28246B6s LIZIZ2 = BJN.LIZIZ();
                if (LIZIZ2 != null && (bjl = LIZIZ2.LJFF) != null) {
                    bjl.LJ = "draw";
                }
                B4U.LIZ().LJLLILLLL = null;
                BJN.LIZ();
                AbstractC28221B5t abstractC28221B5t = this.LJLLJ.LLFFF;
                if ((abstractC28221B5t instanceof MultiRoomIdListProvider) || (abstractC28221B5t instanceof MultiPlusFeedRoomListProvider)) {
                    String str = abstractC28221B5t.LIZLLL(i).mLogData.anchorId;
                    if (!C38354F3m.LJ(this.LJLLJ.LLFFF.LIZLLL(i).mLogData.anchorId)) {
                        bkj.Jj().mLogData.anchorId = str;
                    }
                    if (!TextUtils.isEmpty(this.LJLLJ.LLFFF.LIZLLL(i).mLogData.requestId)) {
                        bkj.Jj().mLogData.requestId = this.LJLLJ.LLFFF.LIZLLL(i).mLogData.requestId;
                    }
                }
                BJL bjl2 = (BJL) DataChannelGlobal.LJLJJI.mv0(C29054Bak.class);
                if (bjl2 != null) {
                    bjl2.LJIL = "";
                    bjl2.LJIJI = "";
                }
                if (this.LJLLJ.LJLIL != null) {
                    BLH.LIZJ(bkj.Jj(), "draw");
                }
                bkj.Jj().mRoomsData.enterLiveSource = this.LJLJLLL;
                BLH blh2 = this.LJLLJ.LJLIL;
                if (blh2 != null && (Jj = bkj.Jj()) != null && Jj.mLogData != null && Jj.mRoomsData != null) {
                    C38995FSd.LIZIZ().execute(new ARunnableS8S0201000_5(1, blh2, Jj, 3));
                }
                AbstractC28221B5t abstractC28221B5t2 = this.LJLLJ.LLFFF;
                if (abstractC28221B5t2 instanceof BLL) {
                    long j = bkj.Jj().mRoomsData.roomId;
                    ((BLL) abstractC28221B5t2).LJLJJLL.add(Long.valueOf(j));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Room ");
                    LIZ2.append(j);
                    LIZ2.append(" is showing.");
                    C0NB.LIZIZ("DrawRoomListProvider", X1D.LIZIZ(LIZ2));
                }
            }
        } else {
            Event event = new Event("liveroom_selected_fragment_is_null", 33029, EnumC28203B5b.BussinessApiCall);
            event.LIZIZ("newFragment is empty!");
            B57.LIZ.LIZ().LIZIZ(event);
        }
        this.LJLILLLLZI = bkj;
        if (!B54.LIZJ) {
            B54.LIZIZ.clear();
        }
        B54.LIZJ = false;
        this.LJLIL = -1;
        LiveRoomFragment liveRoomFragment4 = this.LJLLJ;
        if (liveRoomFragment4.LLIIL) {
            this.LJLJI = -1L;
            this.LJLJJI = null;
        }
        liveRoomFragment4.z4();
        RoomStatusController roomStatusController = this.LJLLJ.LJLILLLLZI;
        if (roomStatusController != null) {
            roomStatusController.refreshTimer();
        }
        ((ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class)).clearId();
    }

    public final void LIZLLL(int i, boolean z) {
        BKJ LJJIII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("multiPlayerPrePullTargetFragment START (");
        LIZ.append(i);
        LIZ.append(")");
        B4I.LIZ("MultiPlayerPrePullStream", X1D.LIZIZ(LIZ));
        BKK bkk = this.LJLLJ.LLFII;
        if (bkk == null) {
            return;
        }
        int count = bkk.getCount();
        if (i < 0 || i >= count || (LJJIII = this.LJLLJ.LLFII.LJJIII(i)) == null) {
            return;
        }
        if (this.LJLLI.get(i)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mMultiPlayerPrePullStreamState --->  has pre pull, target position: (");
            LIZ2.append(i);
            LIZ2.append(")");
            B4I.LIZ("MultiPlayerPrePullStream", X1D.LIZIZ(LIZ2));
            return;
        }
        this.LJLLI.put(i, true);
        B35 LIZJ = LIZJ(i);
        if (LIZJ != null && LIZJ.isPlaying()) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("multiPlayerPrePullTargetFragment start pull stream ~~~~~~~ (");
        LIZ3.append(i);
        LIZ3.append(")");
        B4I.LIZ("MultiPlayerPrePullStream", X1D.LIZIZ(LIZ3));
        LJJIII.Jj().mRoomsData.enterRoomScene = "inner_draw";
        LJJIII.Ah(z);
        if (LiveSurfaceNewVersionSetting.INSTANCE.getEnable()) {
            return;
        }
        LJJIII.LLZLI();
    }

    public final boolean LIZ(float f, int i, boolean z) {
        int count = this.LJLLJ.LLFII.getCount();
        if (i < 0 || i >= count) {
            return false;
        }
        if (this.LJLLJ.LLFII.LJJIII(i) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("canPrePullStream -> targetFragment == null, ");
            LIZ.append(i);
            B4I.LIZ("MultiPlayerPrePullStream", X1D.LIZIZ(LIZ));
            return false;
        }
        if (this.LJLLI.get(i)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("canPrePullStream -> already prePullStream position == ");
            LIZ2.append(i);
            B4I.LIZ("MultiPlayerPrePullStream", X1D.LIZIZ(LIZ2));
            return false;
        }
        if (z) {
            if (f <= 0.05f) {
                return false;
            }
            return true;
        }
        if (f >= 0.95f) {
            return false;
        }
        return true;
    }

    public final void LJFF(BKJ bkj, EnterRoomConfig enterRoomConfig, B35 b35) {
        if (b35 != null) {
            this.LJLJJI = b35.getPlayerTag();
            this.LJLLJ.LLILL = b35.getPlayerTag();
            if (enterRoomConfig != null) {
                this.LJLJI = enterRoomConfig.mRoomsData.roomId;
            }
            bkj.Jj().mRoomsData.warmUpPlayerTag = this.LJLJJI;
        }
        enterRoomConfig.mRoomsData.enterRoomScene = "inner_draw";
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        int i3;
        EnterRoomConfig Jj;
        BKJ LJJIII;
        long j;
        EnumC30414Bwg eventPage = EnumC30414Bwg.EVENT_PAGE_WATCH_LIVE;
        o.LJIIIZ(eventPage, "eventPage");
        if (eventPage == C30770C5u.LIZLLL) {
            C30775C5z c30775C5z = C30770C5u.LJI;
            if (c30775C5z != null) {
                j = c30775C5z.LJI;
            } else {
                j = 0;
            }
            C19980qQ.LIZ(j);
        }
        int currentItem = this.LJLLJ.LLF.getCurrentItem();
        if (i == currentItem) {
            i3 = i + 1;
        } else if (i == currentItem - 1) {
            i3 = i;
        } else {
            i3 = -1;
        }
        int count = this.LJLLJ.LLFII.getCount();
        if (i3 >= 0 && i3 < count && (LJJIII = this.LJLLJ.LLFII.LJJIII(i3)) != null && this.LJLLILLLL.get(i3) == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (i == currentItem) {
                if (f > 0.02f) {
                    this.LJLLILLLL.put(i3, currentTimeMillis);
                    long j2 = this.LJLLILLLL.get(i3);
                    SimpleDateFormat simpleDateFormat = C31012CFc.LIZ;
                    simpleDateFormat.format(new Date(j2));
                    simpleDateFormat.format(new Date(currentTimeMillis));
                }
                LJJIII.Jj().mRoomsData.timeStamps.enterRoomStarTimeReal = currentTimeMillis;
            } else if (i == currentItem - 1) {
                if (f < 0.98f) {
                    this.LJLLILLLL.put(i3, currentTimeMillis);
                    long j3 = this.LJLLILLLL.get(i3);
                    SimpleDateFormat simpleDateFormat2 = C31012CFc.LIZ;
                    simpleDateFormat2.format(new Date(j3));
                    simpleDateFormat2.format(new Date(currentTimeMillis));
                }
                LJJIII.Jj().mRoomsData.timeStamps.enterRoomStarTimeReal = currentTimeMillis;
            }
        }
        if (this.LJLLJ.LLILLJJLI) {
            this.LJLLI.put(currentItem, true);
            if (i == currentItem) {
                int i4 = i + 1;
                if (LIZ(f, i4, true)) {
                    LIZLLL(i4, false);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onPageScrolled -> n+1 preload -->");
                    LIZ.append(i4);
                    B4I.LIZ("MultiPlayerPrePullStream", X1D.LIZIZ(LIZ));
                }
            } else if (i == currentItem - 1 && LIZ(f, i, false)) {
                LIZLLL(i, false);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onPageScrolled -> n-1 preload -->");
                LIZ2.append(i);
                B4I.LIZ("MultiPlayerPrePullStream", X1D.LIZIZ(LIZ2));
            }
        }
        int i5 = this.LJLIL;
        if (i == i5 && f < 1.0E-10f) {
            BKJ LJJIII2 = this.LJLLJ.LLFII.LJJIII(i);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onPageScrolled -> newFragment != activeFragment, pos=");
            LIZ3.append(i);
            LIZ3.append(", positionOffset < MAX_OFFSET");
            B4I.LIZ("MultiPlayerPrePullStream", X1D.LIZIZ(LIZ3));
            if (LJJIII2 != this.LJLILLLLZI) {
                LIZIZ(i, LJJIII2);
                LiveRoomFragment liveRoomFragment = this.LJLLJ;
                if (liveRoomFragment.mo49getActivity() != null) {
                    liveRoomFragment.mo49getActivity().getIntent().putExtra("has_page_slide", true);
                }
            }
        } else if (this.LJLLJ.LLIIL && i5 != -1 && i != i5 && f < 1.0E-10f) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("multi-player=");
            LIZ4.append(this.LJLLJ.LLILLJJLI);
            LIZ4.append("!!!  The case of sliding back after triggering onPageSelected, re-stream the current live broadcast room");
            B4I.LIZ("MultiPlayerPrePullStream", X1D.LIZIZ(LIZ4));
            Room LJIIIIZZ = this.LJLLJ.LLFFF.LJIIIIZZ(i);
            if (LJIIIIZZ != null && this.LJLJI != -1 && LJIIIIZZ.getId() != this.LJLJI) {
                if (this.LJLJJI != null) {
                    ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Jn0(this.LJLJJI);
                    ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).PX(this.LJLJJI);
                    this.LJLJJI = null;
                }
                this.LJLJI = -1L;
            }
            LiveRoomFragment liveRoomFragment2 = this.LJLLJ;
            if (!liveRoomFragment2.LLILLJJLI) {
                LIZIZ(i, liveRoomFragment2.LLFII.LJJIII(i));
            }
        }
        if (i == this.LJLIL && f < 1.0E-10f) {
            int i6 = this.LJLJL;
            if (i6 < 0 || i == i6) {
                return;
            }
            if (i < i6) {
                this.LJLJJLL = 0;
            } else {
                this.LJLJJLL++;
            }
            this.LJLJL = i;
            if (this.LJLJJLL > 15) {
                this.LJLJL = -1;
            }
        }
        if (i == this.LJLLJ.LLFII.getCount() - 1 && this.LJLJJL == 1 && f == 0.0f && !this.LJLLJ.LLFFF.LJIILL()) {
            LiveRoomFragment liveRoomFragment3 = this.LJLLJ;
            if (!liveRoomFragment3.LLIIZ) {
                BLH blh = liveRoomFragment3.LJLIL;
                BKJ bkj = this.LJLILLLLZI;
                blh.getClass();
                if (bkj != null && (Jj = bkj.Jj()) != null && Jj.drawParams.openLiveFromDrawer && !TextUtils.isEmpty(Jj.mRoomsData.openLiveFromDrawerTab)) {
                    BZI LIZ5 = C28787BRn.LIZ("livesdk_explore_infeed_empty_show");
                    LIZ5.LJIJJ(Jj.mRoomsData.openLiveFromDrawerTab, "from_drawer_tab");
                    LIZ5.LJIJJ(Jj.mRoomsData.enterFromMerge, "enter_from_merge");
                    LIZ5.LJIJJ(Jj.mRoomsData.enterMethod, "enter_method");
                    LIZ5.LJIJJ(Jj.mRoomsData.actionType, "action_type");
                    LIZ5.LJJIIJZLJL();
                }
                this.LJLLJ.LLIIZ = true;
            }
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() && i == this.LJLLJ.LLFII.getCount() - 1 && this.LJLJJL == 1 && f == 0.0f) {
            String LJIIL = this.LJLLJ.LLFFF.LJIIL(2, 0L);
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("no feed Data! ");
            LIZ6.append(LJIIL);
            C30868C9o.LJI(X1D.LIZIZ(LIZ6));
        }
    }
}
