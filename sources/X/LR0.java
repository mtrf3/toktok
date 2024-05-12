package X;

import Y.AObserverS77S0100000_9;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.experiment.MovingTabCornerTip;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost;
import defpackage.b0;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class LR0 implements InterfaceC86533Xxh {
    public static final long LJJJJI;
    public static final /* synthetic */ int LJJJJIZL = 0;
    public final AbsFragment LIZ;
    public final ScrollSwitchStateManager LIZIZ;
    public final INoticeCountTabBadgePresentHost LIZJ;
    public final boolean LIZLLL;
    public LRE LJ;
    public ARunnableS45S0100000_9 LJFF;
    public LRV LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;
    public ARunnableS28S0200000_9 LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public IUS LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public final boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public int LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public final String LJJIL;
    public final C62822Ol8 LJJIZ;
    public final C62822Ol8 LJJJ;
    public final C62822Ol8 LJJJI;
    public final C62822Ol8 LJJJIL;
    public final C62822Ol8 LJJJJ;

    @Override // X.InterfaceC86533Xxh
    public final void LIZJ(InnerPushMessage innerPushMessage) {
    }

    @Override // X.InterfaceC86533Xxh
    public final void LJI(InnerPushMessage innerPushMessage) {
    }

    @Override // X.InterfaceC86533Xxh
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC86533Xxh
    public final void LJIIJ(EnumC86518XxS trigger, boolean z) {
        o.LJIIIZ(trigger, "trigger");
    }

    public final void LJIJJ() {
        if (C54362LVe.LJIILJJIL(275) > 0) {
            if (((FollowLiveBubbleConfig) this.LJJIZ.getValue()).expGroup == 2 || ((FollowLiveBubbleConfig) this.LJJIZ.getValue()).expGroup == 3) {
                C54246LQs c54246LQs = new C54246LQs();
                c54246LQs.LJLIL = 2;
                C2U8.LIZ(c54246LQs);
            }
        }
    }

    public final void LIZIZ() {
        if (this.LJJIII) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("into inbox, is bubble showing: ");
        HH1.LIZIZ(LIZ, this.LJIIZILJ, LIZ, "NCTBPManager");
        this.LJJIII = true;
        this.LJIILLIIL = true;
        this.LJIILL = false;
        if (this.LJIIZILJ) {
            this.LJJIIJ = true;
        }
    }

    public final IImInboxDmService LIZLLL() {
        return (IImInboxDmService) this.LJIIIZ.getValue();
    }

    public final Handler LJ() {
        return (Handler) this.LJII.getValue();
    }

    public final LLQ LJIIIIZZ() {
        return (LLQ) this.LJIIJJI.getValue();
    }

    public final IMFToolBarAbility LJIIJJI() {
        return (IMFToolBarAbility) this.LJIIL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if ((((com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment.MetaData) com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment.LIZJ.getValue()).strategy & 1) == 1) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL() {
        /*
            r3 = this;
            boolean r0 = r3.LIZLLL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L1b
            com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment r0 = com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment.LIZ
            r0.getClass()
            X.Ol8 r0 = com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment$MetaData r0 = (com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment.MetaData) r0
            int r0 = r0.strategy
            r0 = r0 & 1
            if (r0 != r1) goto L1b
        L19:
            r2 = 1
        L1a:
            return r2
        L1b:
            X.Ol8 r0 = X.LRA.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.experiment.InboxBubbleInTabCorner r0 = (com.ss.android.ugc.aweme.experiment.InboxBubbleInTabCorner) r0
            if (r0 == 0) goto L19
            int r0 = r0.isEnable
            if (r0 != r1) goto L19
            int r0 = X.C52432Khw.LIZ()
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L1a
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LR0.LJIILIIL():boolean");
    }

    public final boolean LJIILL() {
        AbsFragment absFragment = this.LIZ;
        if (absFragment == null || !absFragment.isViewValid()) {
            return false;
        }
        return true;
    }

    public final void LJIILLIIL() {
        LRV lrv;
        if (this.LJJIJL) {
            return;
        }
        LJIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onClear ");
        LIZ.append(hashCode());
        C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ));
        EventBus.LIZJ().LJIJ(this);
        ARunnableS28S0200000_9 aRunnableS28S0200000_9 = this.LJIILJJIL;
        if (aRunnableS28S0200000_9 != null) {
            LJ().removeCallbacks(aRunnableS28S0200000_9);
        }
        LRE lre = this.LJ;
        if (lre != null) {
            HG3.LJIIL();
            HG3.LJLJL.LJIILLIIL(lre);
        }
        ARunnableS45S0100000_9 aRunnableS45S0100000_9 = this.LJFF;
        if (aRunnableS45S0100000_9 != null) {
            LJ().removeCallbacks(aRunnableS45S0100000_9);
        }
        if (C53765L8f.LJIILIIL(this.LJJIL)) {
            C86550Xxy.LIZIZ.LJII(this);
        }
        LJ().removeCallbacks((Runnable) this.LJJJJ.getValue());
        if (this.LJIIZILJ && (lrv = this.LJI) != null) {
            lrv.LIZ();
        }
        this.LJJIJL = true;
    }

    public final void LJIJ() {
        if (this.LJJIJIIJI) {
            return;
        }
        this.LJJIJIIJI = true;
        C221018lt.LJFF("NCTBPManager", "setTimer");
        LJIIL();
        this.LJIILL = true;
        ARunnableS45S0100000_9 aRunnableS45S0100000_9 = new ARunnableS45S0100000_9(this, 127);
        this.LJFF = aRunnableS45S0100000_9;
        LJ().postDelayed(aRunnableS45S0100000_9, LJJJJI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0167, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "HOME") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI() {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LR0.LJIJI():void");
    }

    static {
        long j;
        if ((C52432Khw.LIZ() & 32) == 32) {
            j = 10000;
        } else {
            j = 5000;
        }
        LJJJJI = j;
    }

    public static boolean LJIILJJIL() {
        if (C40471FuV.LIZ() && C53297Kvt.LIZ()) {
            return true;
        }
        return false;
    }

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dismissBubble ");
        HH1.LIZIZ(LIZ, this.LJIIZILJ, LIZ, "NCTBPManager");
        if (this.LJIIZILJ) {
            this.LJIIZILJ = false;
            LRV lrv = this.LJI;
            if (lrv != null) {
                lrv.LIZ();
            }
        }
    }

    public final void LJIIL() {
        if (!LJIILL()) {
            return;
        }
        LJ().post(new ARunnableS45S0100000_9(this, 126));
    }

    public final void LJIJJLI(C54262LRi c54262LRi) {
        boolean z;
        C54288LSi LIZ;
        MovingTabCornerTip movingTabCornerTip;
        IMFToolBarAbility LJIIJJI;
        ActivityC45651qj mo49getActivity;
        Long l;
        boolean z2 = false;
        OSZ<Integer, Integer> LJFF = LJFF(c54262LRi, false);
        int intValue = LJFF.getFirst().intValue();
        int intValue2 = LJFF.getSecond().intValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("hasIntoInbox: ");
        LIZ2.append(this.LJJIII);
        LIZ2.append(", bubble showing: ");
        LIZ2.append(this.LJJIIJ);
        LIZ2.append(",hasCacheShow: ");
        LIZ2.append(this.LJIL);
        LIZ2.append(' ');
        C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ2));
        if ((C52432Khw.LIZ() & 8) != 8 && (!this.LJIL || (C52432Khw.LIZ() & 16) != 16) ? this.LJJIFFI || this.LJJII : this.LJJIFFI && this.LJJII) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("showTabBadge ");
        LIZ3.append(this.LJIILLIIL);
        LIZ3.append(", ");
        C76965UIn.LIZJ(LIZ3, this.LJIILL, ", canBadgeUpdate: ", z, ", num: ");
        LIZ3.append(intValue);
        LIZ3.append(", dot: ");
        LIZ3.append(intValue2);
        C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ3));
        if (this.LJIILL || !z || !LJIILL() || !((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        if (LJIILJJIL() && C54287LSh.LIZ) {
            return;
        }
        LVL.LJLIL.getClass();
        int LJJII = LVL.LJJII(260, true);
        if (intValue <= 0 && intValue2 > 0 && LJJII > 0) {
            if (LJ().hasCallbacks((Runnable) this.LJJJJ.getValue())) {
                C221018lt.LIZ("NCTBPManager", "delayClearLiveUnread blocked, already has task");
            } else {
                NoticeGroupAttrs LJIIIIZZ = C54362LVe.LJIIIIZZ(260);
                if (LJIIIIZZ != null) {
                    l = LJIIIIZZ.aliveDuration;
                } else {
                    l = null;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("delayClearLiveUnread, liveAlive=");
                LIZ4.append(l);
                C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ4));
                if (l != null && l.longValue() > 0) {
                    LJ().postDelayed((Runnable) this.LJJJJ.getValue(), l.longValue() * 1000);
                }
            }
        }
        LJIIZILJ(intValue, intValue2, LJJII);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("showTabBadge:isFetchDataReady:");
        LIZ5.append(this.LJJIFFI);
        LIZ5.append(", isIMCountReady:");
        HH1.LIZIZ(LIZ5, this.LJJII, LIZ5, "NCTBPManager");
        if (this.LJJIFFI && this.LJJII && intValue == 0 && intValue2 == 0 && (LJIILJJIL() || C53765L8f.LJIIL("NOTIFICATION"))) {
            AbsFragment absFragment = this.LIZ;
            if (absFragment != null && (mo49getActivity = absFragment.mo49getActivity()) != null && !com.bytedance.hox.Hox.LJLLI.LIZ(mo49getActivity).wv0("HOME")) {
                C221018lt.LJFF("NCTBPManager", "fragment is not main");
            } else {
                if (!C54287LSh.LIZIZ) {
                    C54287LSh.LIZIZ = true;
                    C54288LSi LIZ6 = C54287LSh.LIZ();
                    if ((LIZ6 == null || !LIZ6.LIZ.getBoolean("is_reminder_canceled", false)) && (LIZ = C54287LSh.LIZ()) != null && (movingTabCornerTip = (MovingTabCornerTip) LL1.LIZIZ.getValue()) != null && LIZ.LIZ.getInt("inbox_moving_reminder_count", 0) < movingTabCornerTip.maxPopTimes) {
                        if ((movingTabCornerTip.popIntervalHour * 3600000) + LIZ.LIZ.getLong("inbox_last_reminder_show_time", 0L) < System.currentTimeMillis()) {
                            z2 = true;
                        }
                    }
                }
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("shouldShowInboxReminder：");
                LIZ7.append(z2);
                C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ7));
                if (z2 && (LJIIJJI = LJIIJJI()) != null && LJIIJJI.DN(this.LJJIL)) {
                    C54287LSh.LIZ = true;
                    if (LJ().hasCallbacks((Runnable) this.LJJJ.getValue())) {
                        C221018lt.LIZ("NCTBPManager", "delayShowTabBadge blocked, already has task");
                    } else {
                        LJ().postDelayed((Runnable) this.LJJJ.getValue(), 5000L);
                    }
                }
            }
        }
        LJ().post(new RunnableC54252LQy(intValue, intValue2, LJJII, this));
    }

    public final void LJIL(int i) {
        StringBuilder LJ = C7MY.LJ("trigger countdown stage = ", i, ", applyNewStrategy = ");
        LJ.append(DXT.LIZ());
        LJ.append(", strategy = ");
        InboxNoticeCountStrategyExperiment.LIZ.getClass();
        C62822Ol8 c62822Ol8 = InboxNoticeCountStrategyExperiment.LIZJ;
        LJ.append(c62822Ol8.getValue());
        LJ.append(", isColdStart = ");
        LJ.append(this.LIZLLL);
        C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LJ));
        if (DXT.LIZ()) {
            return;
        }
        if (this.LIZLLL && (((InboxNoticeCountStrategyExperiment.MetaData) c62822Ol8.getValue()).strategy & 2) == 2 && i != 2) {
            return;
        }
        C221018lt.LJFF("NCTBPManager", "trigger countdown perform");
        if (((RBX) HG3.LJIILL()).isLogin()) {
            LJIJ();
            return;
        }
        LRE lre = new LRE(this);
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(lre);
        this.LJ = lre;
    }

    @QD3
    public final void onCommentDialogEvent(C174036sJ event) {
        o.LJIIIZ(event, "event");
        boolean z = true;
        if (event.LJLIL != 1) {
            z = false;
        }
        this.LJIJJ = z;
        if (z && this.LJIIZILJ) {
            LIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c3, code lost:
    
        if (r8.LJJII != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c9, code lost:
    
        if (r8.LJJII != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0163  */
    @X.QD3(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNoticeCountChangedEvent(X.C54262LRi r9) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LR0.onNoticeCountChangedEvent(X.LRi):void");
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onShopTabTooltipPopupEvent(LRJ event) {
        o.LJIIIZ(event, "event");
        if (!((Boolean) this.LJJJIL.getValue()).booleanValue()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onShopTabTooltipPopupEvent ");
        LIZ.append(event.LJLIL);
        C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ));
        if (event.LJLIL == 0) {
            this.LJJIJIL = true;
            return;
        }
        this.LJJIJIL = false;
        if (!this.LJIJ) {
            return;
        }
        this.LJIJ = false;
        LJIJI();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onTabChangeEvent(C209108Io event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTabChangeEvent fromTab = ");
        LIZ.append(event.LJLIL);
        LIZ.append(", toTab = ");
        b0.LJFF(LIZ, event.LJLILLLLZI, LIZ, "NCTBPManager");
        if (!o.LJ(event.LJLIL, event.LJLILLLLZI) && o.LJ(event.LJLIL, "HOME") && C53765L8f.LJIILIIL(this.LJJIL) && this.LJIIZILJ) {
            LIZ();
        }
    }

    public final OSZ<Integer, Integer> LJFF(C54262LRi c54262LRi, boolean z) {
        int i;
        int i2;
        IUS ius = this.LJJ;
        int i3 = 0;
        if (ius != null) {
            i = ius.LIZIZ;
            i2 = ius.LIZ;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i + i2;
        if (z) {
            return new OSZ<>(Integer.valueOf(i4), 0);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getNumDotCount, start, isFetchDataReady: ");
        LIZ.append(this.LJJIFFI);
        LIZ.append(", isIMCountReady: ");
        LIZ.append(this.LJJII);
        LIZ.append(", cachedData: ");
        LIZ.append(this.LJJ);
        LIZ.append(", event: ");
        LIZ.append(c54262LRi);
        C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ));
        if (this.LJJ != null && i4 != 0) {
            if (this.LJJIFFI) {
                if (!this.LJJII) {
                    LVL.LJLIL.getClass();
                    Integer num = (Integer) LVL.LJJIIJ().get(30000);
                    if (num != null) {
                        i3 = num.intValue();
                    }
                    i4 = i3 + i;
                }
            } else if (this.LJJII) {
                if (c54262LRi != null) {
                    i = c54262LRi.LIZIZ(99);
                }
                i4 = i + i2;
            }
            int LIZLLL = LVL.LJLIL.LIZLLL();
            StringBuilder LIZJ = C06460Ne.LIZJ("getNumDotCount, end, numCount: ", i4, ", dotCount: ", LIZLLL, ", cachedData: ");
            LIZJ.append(this.LJJ);
            C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZJ));
            return new OSZ<>(Integer.valueOf(i4), Integer.valueOf(LIZLLL));
        }
        i4 = LVL.LJLIL.LJFF();
        this.LJJ = null;
        int LIZLLL2 = LVL.LJLIL.LIZLLL();
        StringBuilder LIZJ2 = C06460Ne.LIZJ("getNumDotCount, end, numCount: ", i4, ", dotCount: ", LIZLLL2, ", cachedData: ");
        LIZJ2.append(this.LJJ);
        C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZJ2));
        return new OSZ<>(Integer.valueOf(i4), Integer.valueOf(LIZLLL2));
    }

    @Override // X.InterfaceC86533Xxh
    public final void LJII(InnerPushMessage innerPushMessage, boolean z, String str) {
        if (!((Boolean) this.LJJJI.getValue()).booleanValue()) {
            return;
        }
        C221018lt.LJFF("NCTBPManager", "onInnerPushDismiss");
        if (this.LJIJ) {
            this.LJIJ = false;
            LJIJI();
        }
    }

    public final void LJIIZILJ(int i, int i2, int i3) {
        String str;
        String str2;
        if (i == 0 && i2 == 0) {
            return;
        }
        if (this.LJJIIZ && i <= this.LJJIJ && this.LJJIIZI) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (i > 0) {
            if (!this.LJJIIZ || i > this.LJJIJ) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(i));
                hashMap.put("previous_show_cnt", String.valueOf(this.LJJIJ));
                this.LJJIJ = i;
                this.LJJIIZ = true;
            }
        } else if (i2 > 0 && !this.LJJIIZI) {
            hashMap.put("notice_type", "yellow_dot");
            this.LJJIIZI = true;
        }
        if (!hashMap.isEmpty()) {
            if (i3 > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_live", str);
            if (this.LJJIFFI || this.LJJII) {
                str2 = "real";
            } else {
                str2 = "cache";
            }
            hashMap.put("notice_source", str2);
            FMX.LJIIL("message_notice_show", hashMap);
        }
    }

    public LR0(AbsFragment fragment, ScrollSwitchStateManager scrollSwitchStateManager, C54229LQb c54229LQb, boolean z) {
        int i;
        int i2;
        IUS ius;
        MutableLiveData sR;
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = fragment;
        this.LIZIZ = scrollSwitchStateManager;
        this.LIZJ = c54229LQb;
        this.LIZLLL = z;
        this.LJII = C221108m2.LIZIZ(C35888E6q.INSTANCE);
        this.LJIIIIZZ = C221108m2.LIZIZ(LRH.LJLIL);
        this.LJIIIZ = C221108m2.LIZIZ(LRF.LJLIL);
        this.LJIIJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 778));
        this.LJIIJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 777));
        this.LJIIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 779));
        this.LJIILIIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 775));
        this.LJIILL = true;
        this.LJJII = C54362LVe.LJI().LIZIZ();
        this.LJJIL = "NOTIFICATION";
        AObserverS77S0100000_9 aObserverS77S0100000_9 = new AObserverS77S0100000_9(this, 58);
        AObserverS77S0100000_9 aObserverS77S0100000_92 = new AObserverS77S0100000_9(this, 57);
        this.LJJIZ = C221108m2.LIZIZ(C54190LOo.LJLIL);
        this.LJJJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 774));
        this.LJJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 776));
        this.LJJJIL = C221108m2.LIZIZ(C53768L8i.LJLIL);
        this.LJJIIJZLJL = false;
        this.LJIJ = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init ");
        LIZ.append(hashCode());
        C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ));
        EventBus.LIZJ().LJIILJJIL(this);
        scrollSwitchStateManager.rv0(fragment, aObserverS77S0100000_9);
        Context context = fragment.getContext();
        if (context != null) {
            InterfaceC54249LQv.LJJJJLI.getClass();
            InterfaceC54249LQv LIZ2 = LRC.LIZ(context);
            if (LIZ2 != null && (sR = LIZ2.sR()) != null) {
                sR.observe(fragment, aObserverS77S0100000_92);
            }
        }
        LJIL(1);
        if (LJIILIIL()) {
            C221018lt.LJFF("NCTBPManager", "skip unread count pop window");
            this.LJIILLIIL = true;
            this.LJIIZILJ = false;
            this.LJIILL = false;
        }
        if (C53765L8f.LJIILIIL("NOTIFICATION")) {
            C86550Xxy.LIZIZ.LJIIIIZZ(this, null);
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            if (mo49getActivity != null) {
                C84193Sd.LIZ(mo49getActivity).qv0(mo49getActivity, new AObserverS77S0100000_9(this, 59));
            }
        }
        if ((C52432Khw.LIZ() & 2) == 2 && LJIILL() && ((RBX) HG3.LJIILL()).isLogin() && ((!this.LJJIFFI || !this.LJJII) && !this.LJJI)) {
            C3KX cachedDMUnreadInfo = LIZLLL().getCachedDMUnreadInfo();
            if (cachedDMUnreadInfo != null) {
                i = cachedDMUnreadInfo.LJLIL;
            } else {
                i = -1;
            }
            try {
                Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
                o.LJIIIIZZ(repo, "getRepo(REPO_NAME_FORMAT)");
                String LLLZ = C16880lQ.LLLZ("%s_notice_num_count", Arrays.copyOf(new Object[]{C60982aM.LIZ()}, 1));
                o.LJIIIIZZ(LLLZ, "format(this, *args)");
                i2 = repo.getInt(LLLZ, 0);
                C60982aM.LIZ = i2;
            } catch (Throwable th) {
                Throwable LJFF = AnonymousClass028.LJFF(th);
                if (LJFF != null) {
                    C221018lt.LIZJ("RedDotCacheHelper", "getCache", LJFF);
                }
                i2 = 0;
            }
            if (i >= 0) {
                ius = new IUS(i2, i);
            } else {
                ius = new IUS(i2, 0);
            }
            this.LJJ = ius;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("updateTabBadgeByCache, cachedRedDotData: ");
            LIZ3.append(this.LJJ);
            C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ3));
            OSZ<Integer, Integer> LJFF2 = LJFF(null, true);
            LJ().post(new RunnableC54253LQz(LJFF2.getFirst().intValue(), LJFF2.getSecond().intValue(), this, i, i2));
        }
        LIZLLL().onNoticeManagerInit();
        this.LJJIIJZLJL = true;
        this.LJJJJ = C221108m2.LIZIZ(C54244LQq.LJLIL);
    }
}
