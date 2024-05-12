package X;

import Y.ACallableS78S0101000_6;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCountMessage;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.count.OldRedPointService;
import com.ss.android.ugc.aweme.notice.api.count.RedPointService;
import defpackage.e1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class LVM implements InterfaceC54360LVc, WeakHandler.IHandler, RedPointService, OldRedPointService, InterfaceC67148QWy {
    public static long LJLLILLLL = System.currentTimeMillis();
    public static volatile LVM LJLLJ;
    public boolean LJLIL;
    public final boolean LJLILLLLZI;
    public HashMap<Integer, Integer> LJLJJL;
    public HashMap<Integer, Integer> LJLJJLL;
    public SharedPreferences LJLJL;
    public HandlerThread LJLJLJ;
    public WeakHandler LJLJLLL;
    public final SparseArray<LVR> LJLJI = new SparseArray<>();
    public final SparseArray<Integer> LJLJJI = new SparseArray<>();
    public boolean LJLL = false;
    public volatile FollowLiveBubbleConfig LJLLI = null;

    public static LVM LJIJ() {
        if (LJLLJ == null) {
            synchronized (LVM.class) {
                if (LJLLJ == null) {
                    LJLLJ = new LVM();
                }
            }
        }
        return LJLLJ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LJIIIZ() {
        SharedPreferences sharedPreferences;
        this.LJLJJI.clear();
        if (!this.LJLIL && (sharedPreferences = this.LJLJL) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            WX6.LIZ(edit);
        }
        C36922EeM.LIZLLL(4, "RedPointManager", "clearNoticeCountMessage with all type");
    }

    public final FollowLiveBubbleConfig LJIILIIL() {
        if (this.LJLLI == null) {
            synchronized (this) {
                if (this.LJLLI == null) {
                    this.LJLLI = (FollowLiveBubbleConfig) LiveOuterService.LJJJLL().LJJIZ().LJJIJIL().LJIIIZ(FollowLiveBubbleConfig.LIZ, "follow_live_bubble");
                }
            }
        }
        return this.LJLLI;
    }

    public LVM() {
        this.LJLJLJ = null;
        this.LJLJLLL = null;
        if (C36842Ed4.LIZLLL(EF7.LIZIZ())) {
            this.LJLIL = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("clear_red_point_cost", false);
            this.LJLILLLLZI = e1.LIZ(31744, "redpointmanager_optimize_settings", true, false);
        }
        Context LIZIZ = EF7.LIZIZ();
        if (this.LJLILLLLZI) {
            if (this.LJLJLJ == null) {
                HandlerThread handlerThread = new HandlerThread("RedPointManager");
                this.LJLJLJ = handlerThread;
                handlerThread.start();
                this.LJLJLLL = new WeakHandler(this.LJLJLJ.getLooper(), this);
                this.LJLIL = false;
            }
        } else {
            this.LJLJLLL = new WeakHandler(C16880lQ.LLJJJJ(), this);
        }
        LVT lvt = LVT.LIZIZ;
        ((HashSet) lvt.LIZ).add(new LVO());
        if (C35154Dqw.LIZ()) {
            C67128QWe.LIZIZ.LIZJ(1, 1, this);
        } else {
            C67125QWb.LJLL.LIZLLL(EnumC54358LVa.NOTICE, this);
        }
        if (!this.LJLIL) {
            SharedPreferences LIZIZ2 = F9J.LIZIZ(LIZIZ, 0, "red-point-cache");
            this.LJLJL = LIZIZ2;
            java.util.Map<String, ?> all = LIZIZ2.getAll();
            if (all != null) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    try {
                        String key = entry.getKey();
                        int intValue = ((Integer) entry.getValue()).intValue();
                        if (key.startsWith("unread_")) {
                            this.LJLJJI.append(CastIntegerProtector.valueOf(key.substring(7)).intValue(), Integer.valueOf(intValue));
                        }
                    } catch (RuntimeException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
    }

    public static String LJIILJJIL(int i) {
        return KMP.LJ("unread_", i);
    }

    public static final void LJIILL(NoticeCount noticeCount) {
        String str;
        if (noticeCount.getExtra() != null && noticeCount.getExtra().followTabInfo != null && noticeCount.getExtra().followTabInfo.level != null) {
            C2U8.LIZ(new C36307EMt(noticeCount.getGroup(), noticeCount.getExtra().followTabInfo.level.intValue(), noticeCount.getExtra().followTabInfo.followeeInfo));
            if (noticeCount.getGroup() == 39 && (str = noticeCount.getExtra().followTabInfo.prioritizedItemId) != null) {
                C2U8.LIZ(new LMP(str));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final AbstractC73672Svk LIZ(final NoticeList noticeList) {
        final int i = 2;
        return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.ENO
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                LVM lvm = LVM.this;
                NoticeList noticeList2 = noticeList;
                int i2 = i;
                lvm.getClass();
                try {
                    C221018lt.LJFF("RedPointManager", "RedPointManger#rxInitNoticeCount");
                    Message obtain = Message.obtain();
                    obtain.obj = noticeList2;
                    obtain.what = i2;
                    lvm.handleMsg(obtain);
                    C38891fp.LJJIJ(interfaceC73573Su9, Boolean.TRUE);
                } catch (Throwable th) {
                    C221018lt.LIZJ("RedPointManager", "rxInitNoticeCount error", th);
                    C38891fp.LJJIJ(interfaceC73573Su9, Boolean.FALSE);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LIZJ(boolean z) {
        this.LJLL = z;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final int LJ(int i) {
        List LIZIZ = LVB.LIZIZ(i);
        if (LIZIZ.isEmpty()) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < LIZIZ.size(); i3++) {
            i2 += LJIIJJI(((Integer) ListProtector.get(LIZIZ, i3)).intValue());
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final int LJI(int i) {
        List LIZ = LVB.LIZ(i);
        if (LIZ.isEmpty()) {
            return LJIIJJI(i);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < LIZ.size(); i3++) {
            i2 += LJIIJJI(((Integer) ListProtector.get(LIZ, i3)).intValue());
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LJII(Message message) {
        if (L0W.LIZ()) {
            LT7.LIZ.LIZ((NoticeList) message.obj);
            return;
        }
        if (this.LJLILLLLZI) {
            this.LJLJLLL.sendMessage(message);
        } else {
            handleMsg(message);
        }
        C36922EeM.LIZLLL(4, "RedPointManager", "initNoticeCountFromCombine sync");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final int LJIIJJI(int i) {
        Integer num = 0;
        try {
            num = this.LJLJJI.get(i);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.InterfaceC54360LVc
    public final void LJIIL(LVZ lvz) {
        boolean z;
        SharedPreferences sharedPreferences;
        if (L2B.LIZ() == 1 || L2B.LIZ() == 3 || L2B.LIZ() == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C221018lt.LIZIZ("RedPointManager", "onMessage ignored by reversing ws");
            return;
        }
        if (lvz instanceof NoticeCountMessage) {
            NoticeCountMessage noticeCountMessage = (NoticeCountMessage) lvz;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("notice type ");
            LIZ.append(noticeCountMessage.noticeGroup);
            LIZ.append(" count ");
            LIZ.append(noticeCountMessage.noticeCount);
            C36922EeM.LIZLLL(4, "RedPointManager", X1D.LIZIZ(LIZ));
            int i = noticeCountMessage.noticeGroup;
            if (i != 40) {
            }
            LJIILLIIL(i, noticeCountMessage.noticeCount);
            this.LJLJJI.put(noticeCountMessage.noticeGroup, Integer.valueOf(noticeCountMessage.noticeCount));
            if (!this.LJLIL && (sharedPreferences = this.LJLJL) != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(LJIILJJIL(noticeCountMessage.noticeGroup), noticeCountMessage.noticeCount);
                WX6.LIZ(edit);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setNoticeCountMessage with message group: ");
            LIZ2.append(noticeCountMessage.noticeGroup);
            LIZ2.append("count:");
            LIZ2.append(noticeCountMessage.noticeCount);
            C36922EeM.LIZLLL(4, "RedPointManager", X1D.LIZIZ(LIZ2));
            LIZIZ(2, false);
            if (noticeCountMessage.noticeGroup == 100) {
                ((LVS) ServiceManager.get().getService(LVS.class)).LIZIZ();
            }
            int i2 = noticeCountMessage.noticeGroup;
            LVR lvr = this.LJLJI.get(2);
            if (lvr != null) {
                lvr.LJIIJ(noticeCountMessage);
            }
            if (!C54311LTf.LJI(i2) && LJIIZILJ(i2)) {
                C2U8.LIZ(new C54251LQx(i2, LJI(i2)));
            }
            if (HG3.LJIIIIZZ().isEnableMultiAccountLogin() && ((RBX) HG3.LJIILL()).allUidList().size() > 1) {
                C54301LSv.LIZJ().LIZLLL("ws_message_triggered", ((RBX) HG3.LJIILL()).allUidList());
            }
        }
    }

    public final boolean LJIIZILJ(int i) {
        if (i == 11) {
            if (LJI(i) > 0 && LJI(998) > 0) {
                return true;
            }
            return false;
        }
        if (LJI(i) > 0) {
            return true;
        }
        return false;
    }

    public final void LJIJI(int i) {
        if (L0W.LIZ()) {
            C36922EeM.LIZLLL(4, "ColdStartUnreadOptHelp", KMP.LJ("queryUnreadNotifyCount  ", i));
            InterfaceC92693kP LJJJLIIL = AbstractC73672Svk.LJIIJ(new C36310EMw(i)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C54303LSx.LJLIL, new InterfaceC64592gB() { // from class: X.9G4
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    StringBuilder LIZ = X1D.LIZ();
                    C36922EeM.LIZLLL(4, "ColdStartUnreadOptHelp", C03090Af.LIZJ(LIZ, "queryUnreadNotifyCount ", (Throwable) obj, LIZ));
                }
            });
            C62822Ol8 c62822Ol8 = LT7.LIZIZ;
            ((C73318Sq2) c62822Ol8.getValue()).LIZLLL();
            ((C73318Sq2) c62822Ol8.getValue()).LIZ(LJJJLIIL);
            return;
        }
        FGR.LIZIZ().LIZ(this.LJLJLLL, new ACallableS78S0101000_6(i, this, 4), 1);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("queryUnreadNotifyCount, source: ");
        LIZ.append(i);
        C36922EeM.LIZLLL(4, "RedPointManager", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC67148QWy
    public final void LJIJJLI(WsChannelMsg wsChannelMsg) {
        Object LIZ = LVT.LIZIZ.LIZ(wsChannelMsg);
        if (LIZ instanceof LVZ) {
            LJIIL((LVZ) LIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x019f, code lost:
    
        if (r7 != null) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013f A[SYNTHETIC] */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMsg(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LVM.handleMsg(android.os.Message):void");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LIZIZ(final int i, boolean z) {
        if (!((RBX) HG3.LJIILL()).isLogin() || TextUtils.isEmpty(((RBX) HG3.LJIILL()).getCurUserId()) || AV1.LJIIJJI()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z && currentTimeMillis < LJLLILLLL + LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            return;
        }
        if (i == 2 || ((LVS) C54366LVi.LIZ(LVS.class)).LIZ() > 0) {
            C10K.LJII(((LVS) C54366LVi.LIZ(LVS.class)).LIZ()).LIZLLL(new C10I() { // from class: X.ENL
                @Override // X.C10I
                public final Object then(C10K c10k) {
                    LVM.this.LJIJI(i);
                    return null;
                }
            });
        } else {
            LJIJI(i);
        }
        LJLLILLLL = currentTimeMillis;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LIZLLL(int i, LVG lvg) {
        List LIZ = LVB.LIZ(i);
        if (!LIZ.isEmpty()) {
            for (int i2 = 0; i2 < LIZ.size(); i2++) {
                LJIIJ(((Integer) ListProtector.get(LIZ, i2)).intValue(), lvg);
            }
        }
        LJIIJ(i, lvg);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LJFF(int i, LVG lvg) {
        List LIZIZ = LVB.LIZIZ(i);
        if (!LIZIZ.isEmpty()) {
            for (int i2 = 0; i2 < LIZIZ.size(); i2++) {
                LJIIJ(((Integer) ListProtector.get(LIZIZ, i2)).intValue(), lvg);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LJIIIIZZ(int i, int i2) {
        SharedPreferences sharedPreferences;
        LJIILLIIL(i, i2);
        this.LJLJJI.put(i, Integer.valueOf(i2));
        if (!this.LJLIL && (sharedPreferences = this.LJLJL) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(LJIILJJIL(i), i2);
            WX6.LIZ(edit);
        }
    }

    public final void LJIIJ(int i, LVG lvg) {
        SharedPreferences sharedPreferences;
        NoticeGroupAttrs noticeGroupAttrs;
        if (lvg != null && (noticeGroupAttrs = LVB.LIZIZ.get(Integer.valueOf(i))) != null && lvg != noticeGroupAttrs.clearOccasion) {
            return;
        }
        this.LJLJJI.remove(i);
        MLS.LIZ(i);
        if (!this.LJLIL && (sharedPreferences = this.LJLJL) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(LJIILJJIL(i), 0);
            WX6.LIZ(edit);
        }
    }

    public final void LJIILLIIL(int i, int i2) {
        SharedPreferences sharedPreferences;
        if (i == 11) {
            int LJI = i2 - LJI(11);
            if (!this.LJLL && LJI > 0) {
                this.LJLJJI.put(998, Integer.valueOf(LJI));
                this.LJLJJI.put(997, Integer.valueOf(LJI));
                if (!this.LJLIL && (sharedPreferences = this.LJLJL) != null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putInt(LJIILJJIL(998), LJI);
                    edit.putInt(LJIILJJIL(997), LJI);
                    WX6.LIZ(edit);
                }
            }
        }
    }
}
