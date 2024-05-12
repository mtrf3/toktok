package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.AbstractDialogInterfaceC26236ARk;
import X.C3C5;
import X.C68322mC;
import X.C72242sW;
import X.C74987Tbr;
import X.C75236Tfs;
import X.C75286Tgg;
import X.C76265TwT;
import X.C76800UCe;
import X.C76820UCy;
import X.C77334UWs;
import X.CN1;
import X.InterfaceC88472Yns;
import X.JBR;
import X.U27;
import X.U2O;
import X.UD0;
import X.UD4;
import X.URU;
import X.X1D;
import X.XJL;
import X.XKS;
import Y.ARunnableS32S0200000_13;
import android.app.Activity;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.viewmodel.MatchSpeedChallengeVM;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.model.message.battle.BattleRewardSettle;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import com.bytedance.android.livesdkapi.depend.model.live.match.PreviewPeriod;
import com.bytedance.android.livesdkapi.depend.model.live.match.RewardPeriodConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.TaskPeriodConfig;
import com.bytedance.router.SmartRouter;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class AqS54S1200000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide] */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static final Object invoke$0(AqS54S1200000_13 aqS54S1200000_13, Object obj) {
        long j;
        long j2;
        User owner;
        Long valueOf;
        T t;
        C76820UCy it = (C76820UCy) obj;
        o.LJIIIZ(it, "it");
        C72242sW c72242sW = new C72242sW();
        TaskPeriodConfig taskPeriodConfig = ((BattleBonusConfig) aqS54S1200000_13.l1).taskPeriodConfig;
        if (taskPeriodConfig != null) {
            j = taskPeriodConfig.taskStartTime;
        } else {
            j = -1;
        }
        c72242sW.element = j;
        C72242sW c72242sW2 = new C72242sW();
        UD4 ud4 = it.LJLJLLL;
        c72242sW2.element = ud4.LJLJI;
        if (c72242sW.element <= 0) {
            c72242sW2.element = 0L;
            Iterator<PreviewPeriod> it2 = ud4.LJLIL.iterator();
            while (it2.hasNext()) {
                c72242sW2.element += it2.next().duration;
            }
            c72242sW.element = it.LJLJLLL.LJLILLLLZI - c72242sW2.element;
        }
        MatchSpeedChallengeVM matchSpeedChallengeVM = (MatchSpeedChallengeVM) aqS54S1200000_13.l2;
        matchSpeedChallengeVM.setState(new AqS58S0400000_13(it, (BattleBonusConfig) aqS54S1200000_13.l1, c72242sW2, matchSpeedChallengeVM, 3));
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = it.LJLL.LIZLLL;
        C72242sW c72242sW3 = new C72242sW();
        c72242sW3.element = it.LJLL.LIZJ;
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = it.LJLL.LJIIIIZZ;
        ?? r11 = 0;
        if (it.LJLJI == 0) {
            TaskPeriodConfig taskPeriodConfig2 = ((BattleBonusConfig) aqS54S1200000_13.l1).taskPeriodConfig;
            if (taskPeriodConfig2 != null) {
                t = taskPeriodConfig2.taskStaticPrompt;
            } else {
                t = 0;
            }
            c68322mC.element = t;
        } else {
            TaskPeriodConfig taskPeriodConfig3 = ((BattleBonusConfig) aqS54S1200000_13.l1).taskPeriodConfig;
            if (taskPeriodConfig3 != null) {
                j2 = taskPeriodConfig3.progressTarget;
            } else {
                j2 = 10;
            }
            c72242sW3.element = j2;
            if (!o.LJ(aqS54S1200000_13.s0, "battle_info")) {
                MatchSpeedChallengeVM matchSpeedChallengeVM2 = (MatchSpeedChallengeVM) aqS54S1200000_13.l2;
                U27.LJIILIIL(matchSpeedChallengeVM2.LJLJLLL, c72242sW3.element, aqS54S1200000_13.s0, matchSpeedChallengeVM2.LJLJI);
            }
            long j3 = c72242sW3.element;
            if (j3 <= 0) {
                MatchSpeedChallengeVM matchSpeedChallengeVM3 = (MatchSpeedChallengeVM) aqS54S1200000_13.l2;
                U27.LJIILJJIL(matchSpeedChallengeVM3.LJLJLLL, String.valueOf(j3), matchSpeedChallengeVM3.LJLJI);
            }
        }
        Room room = ((MatchSpeedChallengeVM) aqS54S1200000_13.l2).LJLJL;
        if (room != null && (owner = room.getOwner()) != null && (valueOf = Long.valueOf(owner.getId())) != null) {
            Map<Long, BattleTaskGiftAmountGuide> map = ((BattleBonusConfig) aqS54S1200000_13.l1).taskGiftGuide;
            int i = 0;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Long, BattleTaskGiftAmountGuide> entry : map.entrySet()) {
                    if (entry.getKey().longValue() == valueOf.longValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                r11 = (BattleTaskGiftAmountGuide) linkedHashMap.get(valueOf);
            }
            c68322mC2.element = r11;
            if (r11 != 0) {
                long j4 = r11.recommendGiftId;
                if (j4 != 0) {
                    MatchSpeedChallengeVM matchSpeedChallengeVM4 = (MatchSpeedChallengeVM) aqS54S1200000_13.l2;
                    matchSpeedChallengeVM4.LJLLL = j4;
                    IGiftService iGiftService = (IGiftService) CN1.LIZ(IGiftService.class);
                    if (iGiftService != null) {
                        i = iGiftService.getTargetGiftDiamondCount(((MatchSpeedChallengeVM) aqS54S1200000_13.l2).LJLLL);
                    }
                    matchSpeedChallengeVM4.LJLLLL = i;
                    C76265TwT.LIZ.LJJJZ = ((MatchSpeedChallengeVM) aqS54S1200000_13.l2).LJLLL;
                }
            }
        }
        ((MatchSpeedChallengeVM) aqS54S1200000_13.l2).setState(new AqS5S0600000_13(it, (C76820UCy) c72242sW, (C72242sW) aqS54S1200000_13.l1, (BattleBonusConfig) c68322mC, (C68322mC<BattlePrompt>) c72242sW3, (C72242sW) c68322mC2, (C68322mC<BattleTaskGiftAmountGuide>) 0));
        RewardPeriodConfig rewardPeriodConfig = ((BattleBonusConfig) aqS54S1200000_13.l1).rewardPeriodConfig;
        if (rewardPeriodConfig != null) {
            ((MatchSpeedChallengeVM) aqS54S1200000_13.l2).setState(new AqS179S0100000_13(rewardPeriodConfig, 221));
            C76265TwT.LIZ.LJJJIL = rewardPeriodConfig.rewardMultiple;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r7 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS54S1200000_13 r19, java.lang.Object r20) {
        /*
            r1 = r20
            X.TpC r1 = (X.C75814TpC) r1
            java.lang.String r0 = "$this$setStateImmediate"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.List<com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState> r0 = r1.LJLJI
            r3 = r19
            java.lang.Object r6 = r3.l2
            com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel r6 = (com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel) r6
            java.util.Iterator r5 = r0.iterator()
        L15:
            boolean r0 = r5.hasNext()
            r4 = 0
            if (r0 == 0) goto L3b
            java.lang.Object r7 = r5.next()
            r0 = r7
            com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState r0 = (com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState) r0
            java.lang.String r2 = r0.linkMicId
            com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility r0 = r6.LJLJJL
            if (r0 == 0) goto L33
            com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo r0 = r0.LLLLLJIL()
            if (r0 == 0) goto L33
            java.lang.String r4 = r0.getLinkMicId()
        L33:
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r4)
            if (r0 == 0) goto L15
            if (r7 != 0) goto L53
        L3b:
            com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState r7 = new com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState
            r8 = 0
            java.lang.String r9 = r3.s0
            r11 = 0
            r13 = 0
            r19 = 1021(0x3fd, float:1.431E-42)
            r10 = r8
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r20 = r8
            r7.<init>(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
        L53:
            java.lang.Object r0 = r3.l1
            X.Yns r0 = (X.InterfaceC88472Yns) r0
            java.lang.Object r6 = r0.invoke(r7)
            java.util.List<com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState> r0 = r1.LJLJI
            java.lang.String r5 = r3.s0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L68:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState r0 = (com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState) r0
            java.lang.String r0 = r0.linkMicId
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L68
            r4.add(r2)
            goto L68
        L83:
            java.util.List r5 = X.ORZ.LLIIJI(r6, r4)
            r4 = 0
            r2 = 0
            r8 = 27
            r6 = r4
            r7 = r4
            r1 = r1
            X.TpC r0 = X.C75814TpC.LIZ(r1, r2, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS54S1200000_13.invoke$1(kotlin.jvm.internal.AqS54S1200000_13, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AqS54S1200000_13 aqS54S1200000_13, Object obj) {
        AbstractDialogInterfaceC26236ARk it = (AbstractDialogInterfaceC26236ARk) obj;
        o.LJIIIZ(it, "it");
        Object obj2 = it.LJLJL;
        if (o.LJ(obj2, 0)) {
            new URU(((RelationAuthDialogControl) aqS54S1200000_13.l1).LIZ(), aqS54S1200000_13.s0, true, (Integer) ((RelationAuthDialogControl) aqS54S1200000_13.l1).LJLJLLL.getValue(), null, 16).LIZLLL(null);
            if (((XJL) aqS54S1200000_13.l2).isActive()) {
                XJL xjl = (XJL) aqS54S1200000_13.l2;
                Boolean bool = Boolean.TRUE;
                C3C5.m7constructorimpl(bool);
                xjl.resumeWith(bool);
            }
        } else if (o.LJ(obj2, 1)) {
            new URU(((RelationAuthDialogControl) aqS54S1200000_13.l1).LIZ(), aqS54S1200000_13.s0, false, (Integer) ((RelationAuthDialogControl) aqS54S1200000_13.l1).LJLJLLL.getValue(), null, 16).LIZLLL(null);
            ((RelationAuthDialogControl) aqS54S1200000_13.l1).LJ();
            if (((XJL) aqS54S1200000_13.l2).isActive()) {
                XJL xjl2 = (XJL) aqS54S1200000_13.l2;
                Boolean bool2 = Boolean.FALSE;
                C3C5.m7constructorimpl(bool2);
                xjl2.resumeWith(bool2);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS54S1200000_13 aqS54S1200000_13, Object obj) {
        C75236Tfs setState = (C75236Tfs) obj;
        o.LJIIIZ(setState, "$this$setState");
        boolean gv0 = ((MultiGuestSharedBgAnchorViewModel) aqS54S1200000_13.l1).gv0(true);
        String str = aqS54S1200000_13.s0;
        LiveEffect liveEffect = (LiveEffect) aqS54S1200000_13.l2;
        return C75236Tfs.LIZ(setState, false, gv0, str, liveEffect.shareImageUrl, liveEffect.shareImagePath, 3);
    }

    public static final Object invoke$4(AqS54S1200000_13 aqS54S1200000_13, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("anchor resumeSharedBg, sharedBgUrl = ");
        LIZ.append(((LiveEffect) aqS54S1200000_13.l1).shareImageUrl);
        LIZ.append(", download image success");
        C74987Tbr.LIZJ("guest_shared_bg", X1D.LIZIZ(LIZ));
        C75286Tgg c75286Tgg = ((MultiGuestSharedBgAnchorViewModel) aqS54S1200000_13.l2).LJLJI;
        if (c75286Tgg != null) {
            c75286Tgg.LIZJ();
        }
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) aqS54S1200000_13.l2;
        LiveEffect liveEffect = (LiveEffect) aqS54S1200000_13.l1;
        multiGuestSharedBgAnchorViewModel.LJLJI = new C75286Tgg(liveEffect, true);
        multiGuestSharedBgAnchorViewModel.LJLILLLLZI = liveEffect;
        multiGuestSharedBgAnchorViewModel.setState(new AqS35S1300000_13(multiGuestSharedBgAnchorViewModel, aqS54S1200000_13.s0, liveEffect, downloadInfo, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS54S1200000_13 aqS54S1200000_13, Object it) {
        o.LJIIIZ(it, "it");
        SmartRouter.buildRoute((Activity) aqS54S1200000_13.l1, "//setting/diskmanager").open();
        C77334UWs.LIZ((C77334UWs) aqS54S1200000_13.l2, "clean_app", aqS54S1200000_13.s0, null, 4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS54S1200000_13 aqS54S1200000_13, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.hzy, new AqS54S1200000_13((Activity) aqS54S1200000_13.l1, (C77334UWs) aqS54S1200000_13.l2, aqS54S1200000_13.s0, 5));
        actionGroup.LJIIIIZZ(R.string.ivd, new AqS66S1100000_13((C77334UWs) aqS54S1200000_13.l2, aqS54S1200000_13.s0, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS54S1200000_13 aqS54S1200000_13, Object obj) {
        U2O u2o;
        C76820UCy state = (C76820UCy) obj;
        o.LJIIIZ(state, "state");
        ((MatchSpeedChallengeVM) aqS54S1200000_13.l1).setState(new AqS144S0200000_13(state, (BattleRewardSettle) aqS54S1200000_13.l2, 52));
        MatchSpeedChallengeVM matchSpeedChallengeVM = (MatchSpeedChallengeVM) aqS54S1200000_13.l1;
        long j = matchSpeedChallengeVM.LJLJLLL;
        UD0 ud0 = state.LJLLI;
        long j2 = ud0.LIZ - ud0.LIZIZ;
        if (j <= j2) {
            if (ud0.LIZJ == 0) {
                matchSpeedChallengeVM.setState(new AqS144S0200000_13(matchSpeedChallengeVM, state, 53));
            }
            U2O u2o2 = state.LJLIL;
            if (u2o2 != U2O.DISABLED && u2o2 != (u2o = U2O.BONUS_FINISHED)) {
                MatchSpeedChallengeVM matchSpeedChallengeVM2 = (MatchSpeedChallengeVM) aqS54S1200000_13.l1;
                matchSpeedChallengeVM2.gv0(matchSpeedChallengeVM2.LJLJLLL, u2o);
            }
        } else {
            matchSpeedChallengeVM.LJLLJ.postDelayed(new ARunnableS32S0200000_13(matchSpeedChallengeVM, state, 99), j - j2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("im_message_eggtask_reward_settle, left_time = ");
        LIZ.append(((MatchSpeedChallengeVM) aqS54S1200000_13.l1).LJLJLLL);
        LIZ.append(" , message = ");
        JBR.LJIIJ(LIZ, aqS54S1200000_13.s0, LIZ, "SpeedChallengeVM");
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS54S1200000_13(com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel r3, com.bytedance.android.livesdkapi.depend.model.LiveEffect r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 3: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r5
            r1.l2 = r4
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS54S1200000_13.<init>(com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S1200000_13(Activity activity, C77334UWs c77334UWs, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = activity;
        this.l2 = c77334UWs;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S1200000_13(MatchSpeedChallengeVM matchSpeedChallengeVM, String str, BattleRewardSettle battleRewardSettle, int i) {
        super(1);
        this.$t = i;
        this.l1 = matchSpeedChallengeVM;
        this.s0 = str;
        this.l2 = battleRewardSettle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S1200000_13(BattleBonusConfig battleBonusConfig, MatchSpeedChallengeVM matchSpeedChallengeVM, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = battleBonusConfig;
        this.l2 = matchSpeedChallengeVM;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S1200000_13(RelationAuthDialogControl relationAuthDialogControl, String str, XKS xks, int i) {
        super(1);
        this.$t = i;
        this.l1 = relationAuthDialogControl;
        this.s0 = str;
        this.l2 = xks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS54S1200000_13(String str, String str2, InterfaceC88472Yns<? super UserState, UserState> interfaceC88472Yns, LinkStatusViewModel linkStatusViewModel) {
        super(1);
        this.$t = linkStatusViewModel;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = interfaceC88472Yns;
    }
}
