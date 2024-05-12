package Y;

import X.ActivityC45651qj;
import X.B5G;
import X.C0EP;
import X.C0NB;
import X.C0NE;
import X.C1EW;
import X.C26045AKb;
import X.C28733BPl;
import X.C29306Beo;
import X.C31811Ce7;
import X.C32014ChO;
import X.C38131Exr;
import X.C57126MbS;
import X.C65814PsI;
import X.C73411SrX;
import X.C73454SsE;
import X.C73969T1h;
import X.C74842TYw;
import X.C74843TYx;
import X.C74846TZa;
import X.C75505TkD;
import X.C75525TkX;
import X.C75536Tki;
import X.C76265TwT;
import X.C76272Twa;
import X.C76280Twi;
import X.C76819UCx;
import X.C77134UPa;
import X.C77150UPq;
import X.C77157UPx;
import X.C77163UQd;
import X.C77164UQe;
import X.C77276UUm;
import X.C78842Uww;
import X.C79250V8k;
import X.EnumC75004Tc8;
import X.EnumC77154UPu;
import X.InterfaceC64592gB;
import X.InterfaceC75014TcI;
import X.InterfaceC88471Ynr;
import X.T16;
import X.U16;
import X.U17;
import X.U2O;
import X.U7F;
import X.UIW;
import X.UQI;
import X.UQZ;
import X.V0Q;
import X.X1D;
import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.viewmodel.MatchSpeedChallengeVM;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.browser.dialog.DownloadProgressDialog;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadInvoiceMethod;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.EnableBattleEggSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS80S1100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS26S1100000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS26S1100000_13 afS26S1100000_13, Object it) {
        U17 u17 = U17.LIZ;
        String id = afS26S1100000_13.s0;
        o.LJIIIIZZ(it, "it");
        synchronized (u17) {
            o.LJIIIZ(id, "id");
            if (!u17.LIZIZ(id)) {
                U17.LIZIZ.put(U17.LIZJ(id), it);
            }
        }
        ((InterfaceC88471Ynr) afS26S1100000_13.l1).invoke(Boolean.TRUE, null);
    }

    public static final void accept$1(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        long j;
        User owner;
        if (((Number) obj).longValue() >= C78842Uww.LJIJI(V0Q.Default, new UIW(3L, 8L))) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Critical point request ");
            C31811Ce7.LJ(LIZ, afS26S1100000_13.s0, LIZ, "BattleTask");
            MatchSpeedChallengeVM matchSpeedChallengeVM = (MatchSpeedChallengeVM) afS26S1100000_13.l1;
            String str = afS26S1100000_13.s0;
            if (matchSpeedChallengeVM.LJLJL != null) {
                C76280Twi c76280Twi = C76265TwT.LIZ;
                long LIZJ = c76280Twi.LIZJ();
                long LIZIZ = c76280Twi.LIZIZ();
                C76272Twa.LJJIIZ(str);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("network_eggtask_battle_info, scene = ");
                LIZ2.append(str);
                C0NB.LJIIIZ("BattleTaskContainer", X1D.LIZIZ(LIZ2));
                C65814PsI.LIZ().getClass();
                LinkBattleApi linkBattleApi = (LinkBattleApi) C65814PsI.LIZJ(LinkBattleApi.class);
                Room room = matchSpeedChallengeVM.LJLJL;
                long j2 = 0;
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                Room room2 = matchSpeedChallengeVM.LJLJL;
                if (room2 != null && (owner = room2.getOwner()) != null) {
                    j2 = owner.getId();
                } else {
                    Room room3 = matchSpeedChallengeVM.LJLJL;
                    if (room3 != null) {
                        j2 = room3.getOwnerUserId();
                    }
                }
                C1EW.LIZ(linkBattleApi.getInfo(j, LIZJ, LIZIZ, j2, 1)).LJJJLIIL(new AfS26S1100000_13(matchSpeedChallengeVM, str, 11), new AfS22S1000000_13(str, 3));
            }
            ((MatchSpeedChallengeVM) afS26S1100000_13.l1).LJZI = false;
            C73411SrX c73411SrX = ((MatchSpeedChallengeVM) afS26S1100000_13.l1).LJLJJLL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
        }
    }

    public static final void accept$10(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (((C76819UCx) afS26S1100000_13.l1).LJLJJI == null) {
            return;
        }
        C76272Twa.LJJIIJ(afS26S1100000_13.s0, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$11(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        BattleInfoResponse info = (BattleInfoResponse) ((BaseResponse) obj).data;
        String str = afS26S1100000_13.s0;
        o.LJIIIIZZ(info, "info");
        C76272Twa.LJJIJ(str, info, false, false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("critical point result ; current State = ");
        LIZ.append(((MatchSpeedChallengeVM) afS26S1100000_13.l1).getState().LJLIL);
        C0NB.LIZIZ("SpeedChallengeVM", X1D.LIZIZ(LIZ));
        BattleTask battleTask = info.battleTask;
        if (o.LJ("egg_reward_complete", afS26S1100000_13.s0) && (((MatchSpeedChallengeVM) afS26S1100000_13.l1).getState().LJLIL == U2O.BONUS_FINISHED || ((MatchSpeedChallengeVM) afS26S1100000_13.l1).getState().LJLIL == U2O.DISABLED)) {
            C0NB.LJIIL("SpeedChallengeVM", "critical point reward complete useless caused by message");
            return;
        }
        if (battleTask == null) {
            return;
        }
        BattleBonusConfig battleBonusConfig = battleTask.battleBonusConfig;
        if (battleBonusConfig != null) {
            ((MatchSpeedChallengeVM) afS26S1100000_13.l1).iv0(battleBonusConfig, "battle_info");
        }
        BattleBonusStatus battleBonusStatus = battleTask.battleBonusStatus;
        if (battleBonusStatus == null) {
            return;
        }
        MatchSpeedChallengeVM matchSpeedChallengeVM = (MatchSpeedChallengeVM) afS26S1100000_13.l1;
        matchSpeedChallengeVM.getClass();
        if (!EnableBattleEggSetting.INSTANCE.getValue()) {
            return;
        }
        matchSpeedChallengeVM.withState(new AqS144S0200000_13(matchSpeedChallengeVM, battleBonusStatus, 55));
    }

    public static final void accept$12(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        String LJJIJIIJIL = U7F.LJJIJIIJIL(2511);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start noFirstFrameRenderTimeoutCountdown linkMicId:");
        LIZ.append(afS26S1100000_13.s0);
        LIZ.append(", throwable:");
        LIZ.append(obj);
        C32014ChO.LIZJ(LJJIJIIJIL, X1D.LIZIZ(LIZ), null);
        ((U7F) afS26S1100000_13.l1).LJJJ(afS26S1100000_13.s0);
    }

    public static final void accept$13(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        StackTraceElement[] stackTraceElementArr;
        Throwable th = (Throwable) obj;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        if (th != null) {
            stackTraceElementArr = th.getStackTrace();
        } else {
            stackTraceElementArr = null;
        }
        LJIILIIL.getClass();
        C0NE.LJIIL(0, stackTraceElementArr);
        InterfaceC75014TcI interfaceC75014TcI = (InterfaceC75014TcI) afS26S1100000_13.l1;
        if (interfaceC75014TcI != null) {
            String str = afS26S1100000_13.s0;
            int ordinal = EnumC75004Tc8.E_C_HTTP_ERROR.ordinal();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            interfaceC75014TcI.LIZ(ordinal, str, message, th);
        }
    }

    public static final void accept$14(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        C75536Tki c75536Tki;
        DataChannel dataChannel = ((C75525TkX) afS26S1100000_13.l1).LLD;
        if (dataChannel != null && (c75536Tki = (C75536Tki) dataChannel.kv0(C75505TkD.class)) != null) {
            c75536Tki.LJLIL = 0L;
        }
        B5G.LIZIZ().LJJLIIIIJ = "";
        CoHostFriendNoticeService coHostFriendNoticeService = ((C75525TkX) afS26S1100000_13.l1).LLIFFJFJJ;
        String logId = afS26S1100000_13.s0;
        coHostFriendNoticeService.getClass();
        o.LJIIIZ(logId, "logId");
        CoHostFriendNoticeService.LIZ(coHostFriendNoticeService, new AqS80S1100000_13(coHostFriendNoticeService, logId, 3), null, 5);
        coHostFriendNoticeService.LJLJLLL = 0;
    }

    public static final void accept$15(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        if (5 - ((Number) obj).longValue() == 1) {
            ((C74843TYx) afS26S1100000_13.l1).LJLJJLL.remove(afS26S1100000_13.s0);
            C73411SrX c73411SrX = ((C74843TYx) afS26S1100000_13.l1).LJLJLLL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
        }
    }

    public static final void accept$16(AfS26S1100000_13 afS26S1100000_13, Object it) {
        U16 u16 = U16.LIZ;
        String id = afS26S1100000_13.s0;
        o.LJIIIIZZ(it, "it");
        synchronized (u16) {
            o.LJIIIZ(id, "id");
            if (!u16.LIZIZ(id)) {
                U16.LIZIZ.put(U16.LIZJ(id), it);
            }
        }
        ((InterfaceC88471Ynr) afS26S1100000_13.l1).invoke(Boolean.TRUE, null);
    }

    public static final void accept$2(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        Context context;
        FragmentManager supportFragmentManager;
        DownloadProgressDialog downloadProgressDialog;
        Context context2 = null;
        if (Build.VERSION.SDK_INT >= 33) {
            C0EP LJFF = C0EP.LJFF();
            DownloadInvoiceMethod downloadInvoiceMethod = (DownloadInvoiceMethod) afS26S1100000_13.l1;
            LJFF.LIZIZ(0, downloadInvoiceMethod.LJLJJL, downloadInvoiceMethod.LJLJJI, afS26S1100000_13.s0);
        } else {
            C38131Exr c38131Exr = ((DownloadInvoiceMethod) afS26S1100000_13.l1).LJLILLLLZI;
            if (c38131Exr != null) {
                context = c38131Exr.LIZ;
            } else {
                context = null;
            }
            new C77276UUm(C29306Beo.LIZIZ(context), TokenCert.Companion.with("bpea-live_recharge_invoice_delete")).LIZ(new C79250V8k((DownloadInvoiceMethod) afS26S1100000_13.l1, afS26S1100000_13.s0), "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        C38131Exr c38131Exr2 = ((DownloadInvoiceMethod) afS26S1100000_13.l1).LJLILLLLZI;
        if (c38131Exr2 != null) {
            context2 = c38131Exr2.LIZ;
        }
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context2);
        if (LIZIZ != null && (supportFragmentManager = LIZIZ.getSupportFragmentManager()) != null && (downloadProgressDialog = ((DownloadInvoiceMethod) afS26S1100000_13.l1).LJLIL) != null) {
            downloadProgressDialog.show(supportFragmentManager, "progress dialog");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$3(Y.AfS26S1100000_13 r6, java.lang.Object r7) {
        /*
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            boolean r1 = r7 instanceof X.C38333F2r
            r0 = 0
            if (r1 == 0) goto L41
            X.F1q r7 = (X.C38306F1q) r7
        L9:
            r5 = 0
            java.lang.String r4 = "facebook"
            if (r7 == 0) goto L2d
            int r1 = r7.getErrorCode()
            r0 = 3002047(0x2dcebf, float:4.206764E-39)
            r3 = 1
            if (r1 != r0) goto L2d
            java.lang.String r2 = r6.s0
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel r1 = (com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel) r1
            X.UPa r0 = X.C77134UPa.LIZ
            r0.LIZ(r2)
            r1.getClass()
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.Iv0(r4, r5, r3)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L37
        L2d:
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel r0 = (com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel) r0
            r0.getClass()
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.Iv0(r4, r5, r5)
        L37:
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel r1 = (com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel) r1
            X.UQc r0 = X.C77162UQc.LJLIL
            r1.setState(r0)
            return
        L41:
            r7 = r0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS26S1100000_13.accept$3(Y.AfS26S1100000_13, java.lang.Object):void");
    }

    public static final void accept$4(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        String str;
        Long l;
        C77157UPx c77157UPx = (C77157UPx) obj;
        boolean z = c77157UPx.LJLILLLLZI.LJLIL;
        if (z && c77157UPx.LJLIL == EnumC77154UPu.SYNC_STATUS) {
            ((SocialRecRequestViewModel) afS26S1100000_13.l1).setState(UQZ.LJLIL);
            ((SocialRecRequestViewModel) afS26S1100000_13.l1).LJLJL = true;
            C77134UPa c77134UPa = C77134UPa.LIZ;
            if (c77134UPa.LJIIJJI()) {
                str = c77134UPa.LJI(afS26S1100000_13.s0);
                l = Long.valueOf(c77134UPa.LJIIJ(afS26S1100000_13.s0));
            } else {
                str = null;
                l = null;
            }
            SocialRecRequestViewModel socialRecRequestViewModel = (SocialRecRequestViewModel) afS26S1100000_13.l1;
            FriendApi.LIZ.getClass();
            C73454SsE LJJJ = C57126MbS.LIZ().getSocialFriendsWithScene("facebook", str, null, l, 4, true).LJJLIIIJJI(5L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
            SocialRecRequestViewModel socialRecRequestViewModel2 = (SocialRecRequestViewModel) afS26S1100000_13.l1;
            socialRecRequestViewModel.disposeOnClear(LJJJ.LJJJLIIL(new AfS65S0100000_13(socialRecRequestViewModel2, 113), new AfS26S1100000_13(socialRecRequestViewModel2, afS26S1100000_13.s0, 3)));
            C73411SrX c73411SrX = ((SocialRecRequestViewModel) afS26S1100000_13.l1).LJLJJLL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            ((SocialRecRequestViewModel) afS26S1100000_13.l1).LJLJJLL = null;
            return;
        }
        EnumC77154UPu enumC77154UPu = c77157UPx.LJLIL;
        if (enumC77154UPu == EnumC77154UPu.REQUEST_ACTUAL_PERMISSION) {
            if (z) {
                return;
            }
            C73411SrX c73411SrX2 = ((SocialRecRequestViewModel) afS26S1100000_13.l1).LJLJJLL;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            SocialRecRequestViewModel socialRecRequestViewModel3 = (SocialRecRequestViewModel) afS26S1100000_13.l1;
            socialRecRequestViewModel3.LJLJJLL = null;
            socialRecRequestViewModel3.setState(C77163UQd.LJLIL);
            return;
        }
        if (enumC77154UPu != EnumC77154UPu.REQUEST_UID_PERMISSION || z) {
            return;
        }
        C73411SrX c73411SrX3 = ((SocialRecRequestViewModel) afS26S1100000_13.l1).LJLJJLL;
        if (c73411SrX3 != null) {
            c73411SrX3.dispose();
        }
        SocialRecRequestViewModel socialRecRequestViewModel4 = (SocialRecRequestViewModel) afS26S1100000_13.l1;
        socialRecRequestViewModel4.LJLJJLL = null;
        socialRecRequestViewModel4.setState(C77164UQe.LJLIL);
    }

    public static final void accept$5(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        ((C74846TZa) afS26S1100000_13.l1).LJLJJI.remove(afS26S1100000_13.s0);
    }

    public static final void accept$6(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        if (5 - ((Number) obj).longValue() == 1) {
            ((C74842TYw) afS26S1100000_13.l1).LJZI.remove(afS26S1100000_13.s0);
            C73411SrX c73411SrX = ((C74842TYw) afS26S1100000_13.l1).LJZL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
        }
    }

    public static final void accept$7(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        C77157UPx c77157UPx = (C77157UPx) obj;
        EnumC77154UPu enumC77154UPu = c77157UPx.LJLIL;
        EnumC77154UPu enumC77154UPu2 = EnumC77154UPu.REQUEST_ACTUAL_PERMISSION;
        if (enumC77154UPu == enumC77154UPu2 || enumC77154UPu == EnumC77154UPu.REQUEST_UID_PERMISSION) {
            C77150UPq c77150UPq = c77157UPx.LJLILLLLZI;
            if (!c77150UPq.LJLIL) {
                if (c77150UPq.LJLJI != 1) {
                    ((SocialConsentFragment) afS26S1100000_13.l1).wl(true);
                }
                C73411SrX c73411SrX = ((SocialConsentFragment) afS26S1100000_13.l1).LJLIL;
                if (c73411SrX != null) {
                    c73411SrX.dispose();
                }
                ((SocialConsentFragment) afS26S1100000_13.l1).LJLIL = null;
            }
        }
        if (c77157UPx.LJLIL == EnumC77154UPu.SYNC_STATUS && c77157UPx.LJLILLLLZI.LJLIL) {
            SocialConsentFragment socialConsentFragment = (SocialConsentFragment) afS26S1100000_13.l1;
            UQI uqi = socialConsentFragment.LJLJI;
            if (uqi != null) {
                int socialRecType = uqi.getSocialRecType();
                UQI uqi2 = ((SocialConsentFragment) afS26S1100000_13.l1).LJLJI;
                if (uqi2 != null) {
                    socialConsentFragment.Gl(socialRecType, uqi2.getStep());
                    C26045AKb c26045AKb = new C26045AKb((SocialConsentFragment) afS26S1100000_13.l1);
                    c26045AKb.LJIIIZ(afS26S1100000_13.s0);
                    c26045AKb.LJIIJ();
                    ((SocialConsentFragment) afS26S1100000_13.l1).xl().LJLJL = true;
                    C73411SrX c73411SrX2 = ((SocialConsentFragment) afS26S1100000_13.l1).LJLIL;
                    if (c73411SrX2 != null) {
                        c73411SrX2.dispose();
                    }
                    ((SocialConsentFragment) afS26S1100000_13.l1).LJLIL = null;
                } else {
                    o.LJIJI("consentConfig");
                    throw null;
                }
            } else {
                o.LJIJI("consentConfig");
                throw null;
            }
        }
        if (c77157UPx.LJLIL == enumC77154UPu2 && !c77157UPx.LJLILLLLZI.LJLIL) {
            ((SocialConsentFragment) afS26S1100000_13.l1).wl(true);
            C73411SrX c73411SrX3 = ((SocialConsentFragment) afS26S1100000_13.l1).LJLIL;
            if (c73411SrX3 != null) {
                c73411SrX3.dispose();
            }
            ((SocialConsentFragment) afS26S1100000_13.l1).LJLIL = null;
        }
    }

    public static final void accept$8(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        long j;
        User owner;
        long longValue = ((Number) obj).longValue();
        if (((C76819UCx) afS26S1100000_13.l1).LJLJJI == null) {
            return;
        }
        if (longValue < C78842Uww.LJIJI(V0Q.Default, new UIW(3L, 8L))) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Critical point request ");
        C31811Ce7.LJ(LIZ, afS26S1100000_13.s0, LIZ, "BattleTask");
        C76819UCx c76819UCx = (C76819UCx) afS26S1100000_13.l1;
        String str = afS26S1100000_13.s0;
        if (c76819UCx.LJLJJI != null && c76819UCx.LJLJL != null) {
            C76280Twi c76280Twi = C76265TwT.LIZ;
            long LIZJ = c76280Twi.LIZJ();
            long LIZIZ = c76280Twi.LIZIZ();
            C76272Twa.LJJIIZ(str);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("network_eggtask_battle_info, scene = ");
            LIZ2.append(str);
            C0NB.LJIIIZ("BattleTaskContainer", X1D.LIZIZ(LIZ2));
            C65814PsI.LIZ().getClass();
            LinkBattleApi linkBattleApi = (LinkBattleApi) C65814PsI.LIZJ(LinkBattleApi.class);
            Room room = c76819UCx.LJLJL;
            long j2 = 0;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            Room room2 = c76819UCx.LJLJL;
            if (room2 != null && (owner = room2.getOwner()) != null) {
                j2 = owner.getId();
            } else {
                Room room3 = c76819UCx.LJLJL;
                if (room3 != null) {
                    j2 = room3.getOwnerUserId();
                }
            }
            C1EW.LIZ(linkBattleApi.getInfo(j, LIZJ, LIZIZ, j2, 1)).LJJJLIIL(new AfS26S1100000_13(c76819UCx, str, 9), new AfS26S1100000_13(c76819UCx, str, 10));
        }
        ((C76819UCx) afS26S1100000_13.l1).LLIL = false;
        C73411SrX c73411SrX = ((C76819UCx) afS26S1100000_13.l1).LJLJJLL;
        if (c73411SrX == null) {
            return;
        }
        c73411SrX.dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$9(AfS26S1100000_13 afS26S1100000_13, Object obj) {
        U2O u2o;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (((C76819UCx) afS26S1100000_13.l1).LJLJJI == null) {
            return;
        }
        BattleInfoResponse info = (BattleInfoResponse) baseResponse.data;
        String str = afS26S1100000_13.s0;
        o.LJIIIIZZ(info, "info");
        C76272Twa.LJJIJ(str, info, false, false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("critical point result ; current State = ");
        LIZ.append(((C76819UCx) afS26S1100000_13.l1).LJLL);
        C0NB.LIZIZ("BattleTaskPresenterTag", X1D.LIZIZ(LIZ));
        BattleTask battleTask = info.battleTask;
        if (o.LJ("egg_reward_complete", afS26S1100000_13.s0) && ((u2o = ((C76819UCx) afS26S1100000_13.l1).LJLL) == U2O.BONUS_FINISHED || u2o == U2O.DISABLED)) {
            C0NB.LJIIL("BattleTaskPresenterTag", "critical point reward complete useless caused by message");
            return;
        }
        if (battleTask == null) {
            return;
        }
        BattleBonusConfig battleBonusConfig = battleTask.battleBonusConfig;
        if (battleBonusConfig != null) {
            ((C76819UCx) afS26S1100000_13.l1).LJ(battleBonusConfig, "battle_info");
        }
        BattleBonusStatus battleBonusStatus = battleTask.battleBonusStatus;
        if (battleBonusStatus == null) {
            return;
        }
        ((C76819UCx) afS26S1100000_13.l1).LJIIIZ(battleBonusStatus);
    }

    public AfS26S1100000_13(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
