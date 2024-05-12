package Y;

import X.B83;
import X.C03090Af;
import X.C05630Jz;
import X.C09650Zl;
import X.C276516r;
import X.C278417k;
import X.C29306Beo;
import X.C29374Bfu;
import X.C30725C4b;
import X.C30792C6q;
import X.C31012CFc;
import X.C31556Ca0;
import X.C34K;
import X.C38393F4z;
import X.C51029K0z;
import X.C63756P0m;
import X.C74776TWi;
import X.C74824TYe;
import X.C74987Tbr;
import X.C75283Tgd;
import X.C75286Tgg;
import X.C75622Tm6;
import X.C75832TpU;
import X.C76231Tvv;
import X.C76244Tw8;
import X.C76265TwT;
import X.C76268TwW;
import X.C76271TwZ;
import X.C76280Twi;
import X.C77623UdH;
import X.C77626UdK;
import X.C77731Uf1;
import X.C77739Uf9;
import X.C77744UfE;
import X.C77747UfH;
import X.C77874UhK;
import X.C78253UnR;
import X.C78609UtB;
import X.C78886Uxe;
import X.C86793Y4n;
import X.C8E;
import X.EnumC74991Tbv;
import X.EnumC77742UfC;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC74695TTf;
import X.InterfaceC75441TjB;
import X.InterfaceC76767UAx;
import X.InterfaceC76768UAy;
import X.InterfaceC77595Ucp;
import X.InterfaceC77685UeH;
import X.InterfaceC77737Uf7;
import X.InterfaceC77748UfI;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.TRK;
import X.U4R;
import X.U6Y;
import X.U71;
import X.U7F;
import X.U7V;
import X.UIL;
import X.UIM;
import X.UIO;
import X.X1D;
import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.cohost.model.RtcMessage;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract$AbsView;
import com.bytedance.android.live.liveinteract.multimatch.rtc.MatchRtcOpenMessage;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.model.CreateSubOrderResult;
import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.Gson;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS55S0110000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import webcast.api.battle.BattleAcceptResponse;

/* loaded from: classes14.dex */
public class AfS2S0300100_13 implements InterfaceC64592gB {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v4, types: [R extends com.bytedance.android.livesdk.model.Extra, com.bytedance.android.livesdk.model.Extra] */
    /* JADX WARN: Type inference failed for: r2v40, types: [V extends com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView, androidx.fragment.app.Fragment] */
    public static final void accept$0(AfS2S0300100_13 afS2S0300100_13, Object obj) {
        long LIZIZ;
        boolean z;
        C76280Twi c76280Twi;
        int i;
        InterfaceC74695TTf LLIIJLIL;
        BaseResponse it = (BaseResponse) obj;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        boolean z2 = ((C34K) afS2S0300100_13.l0).element;
        long j = afS2S0300100_13.j3;
        o.LJIIIIZZ(it, "it");
        JSONObject jSONObject = new JSONObject();
        boolean z3 = ((BattleAcceptResponse.ResponseData) it.data).isLastAccept;
        C278417k<Long, Integer> c278417k = C76271TwZ.LJJIIJZLJL;
        Integer num = c278417k.get(Long.valueOf(j));
        ?? r10 = z3;
        if (num != null) {
            r10 = z3;
            if (num.intValue() == 1) {
                r10 = 1;
            }
        }
        C05630Jz.LJFF(jSONObject, "battle_id", j);
        C05630Jz.LJI(jSONObject, "logid", it.LIZIZ);
        C76271TwZ.LJJ(jSONObject, z2);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "role_type", "invitee");
        C05630Jz.LIZ(r10, "is_last_accept", jSONObject2);
        c278417k.put(Long.valueOf(j), Integer.valueOf((int) r10));
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "accept_message_create_cost", it.extra.now - C76271TwZ.LJI);
        C05630Jz.LJFF(jSONObject3, "cost", C30725C4b.LIZ() - C76271TwZ.LJI);
        c76271TwZ.LJL("reply_succeed", jSONObject, jSONObject2, jSONObject3, false);
        ((InterfaceC88472Yns) afS2S0300100_13.l1).invoke(Boolean.TRUE);
        C76244Tw8 LJFF = ((C76231Tvv) afS2S0300100_13.l2).LJFF();
        C75832TpU c75832TpU = C75832TpU.LIZ;
        Long valueOf = Long.valueOf(LJFF.LJIIIIZZ);
        List<TeamUsersInfo> list = LJFF.LJIIIZ;
        MultiMatchBeInvitedContract$AbsView multiMatchBeInvitedContract$AbsView = (MultiMatchBeInvitedContract$AbsView) ((C76231Tvv) afS2S0300100_13.l2).LJLILLLLZI;
        if (multiMatchBeInvitedContract$AbsView != null && multiMatchBeInvitedContract$AbsView.wl() == 1) {
            LIZIZ = C76265TwT.LIZIZ.LIZIZ();
        } else {
            LIZIZ = C76265TwT.LIZ.LIZIZ();
        }
        MultiMatchBeInvitedContract$AbsView multiMatchBeInvitedContract$AbsView2 = (MultiMatchBeInvitedContract$AbsView) ((C76231Tvv) afS2S0300100_13.l2).LJLILLLLZI;
        if (multiMatchBeInvitedContract$AbsView2 != null && multiMatchBeInvitedContract$AbsView2.wl() == 1) {
            z = true;
        } else {
            z = false;
        }
        c75832TpU.LJJ(true, true, valueOf, list, LIZIZ, z);
        MultiMatchBeInvitedContract$AbsView multiMatchBeInvitedContract$AbsView3 = (MultiMatchBeInvitedContract$AbsView) ((C76231Tvv) afS2S0300100_13.l2).LJLILLLLZI;
        if (multiMatchBeInvitedContract$AbsView3 != null && multiMatchBeInvitedContract$AbsView3.wl() == 1) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        if (((BattleAcceptResponse.ResponseData) it.data).isLastAccept && c76280Twi.LJIILL == 0) {
            C76231Tvv c76231Tvv = (C76231Tvv) afS2S0300100_13.l2;
            long j2 = afS2S0300100_13.j3;
            MultiMatchBeInvitedContract$AbsView multiMatchBeInvitedContract$AbsView4 = (MultiMatchBeInvitedContract$AbsView) c76231Tvv.LJLILLLLZI;
            if (multiMatchBeInvitedContract$AbsView4 != null) {
                i = multiMatchBeInvitedContract$AbsView4.wl();
            } else {
                i = 0;
            }
            MatchRtcOpenMessage matchRtcOpenMessage = new MatchRtcOpenMessage(i, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), j2, 301, C30725C4b.LIZ(), C76268TwW.LIZLLL);
            Long value = c76231Tvv.LJFF().LIZ.getValue();
            if (value == null) {
                value = 0L;
            }
            long longValue = value.longValue();
            Gson gson = C09650Zl.LIZJ;
            RtcMessage rtcMessage = new RtcMessage("team_match_open_msg", longValue, GsonProtectorUtils.toJson(gson, matchRtcOpenMessage));
            JSONObject jSONObject4 = new JSONObject();
            c76271TwZ.LJL("send_open_rtc_msg", jSONObject4, jSONObject4, jSONObject4, false);
            C76268TwW.LIZ(C51029K0z.LJIILIIL(c76231Tvv.LJLILLLLZI), rtcMessage, 2557);
            InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
            if (LJJIJL != null && (LLIIJLIL = LJJIJL.LLIIJLIL()) != null) {
                String json = GsonProtectorUtils.toJson(gson, rtcMessage);
                o.LJIIIIZZ(json, "getDefault().toJson(rtcMessage)");
                LLIIJLIL.sendRoomMessage(json);
            }
        }
        if (((BattleAcceptResponse.ResponseData) it.data).isLastAccept) {
            boolean z4 = ((C34K) afS2S0300100_13.l0).element;
            JSONObject jSONObject5 = new JSONObject();
            if (C8E.LIZLLL().LLIFFJFJJ()) {
                C75622Tm6.LJIILLIIL("component_identify_will_start", jSONObject5, true, z4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS2S0300100_13 afS2S0300100_13, Object obj) {
        boolean z;
        InterfaceC77748UfI LIZJ;
        CreateSubOrderResult createSubOrderResult = (CreateSubOrderResult) ((BaseResponse) obj).data;
        if (createSubOrderResult.tplType == 2) {
            z = true;
        } else {
            z = false;
        }
        C77747UfH c77747UfH = new C77747UfH();
        String str = createSubOrderResult.clientMPUrl;
        String str2 = createSubOrderResult.clientPipoUrl;
        int i = createSubOrderResult.orderPlatform;
        if (i == 1) {
            if (C29306Beo.LJIJJLI(str)) {
                c77747UfH.LIZ = str;
                c77747UfH.LIZIZ = i;
            }
            c77747UfH.LIZ = C30792C6q.LIZIZ();
            c77747UfH.LIZIZ = 0;
        } else {
            if (i == 0 && C29306Beo.LJIJJLI(str2)) {
                c77747UfH.LIZ = str2;
                c77747UfH.LIZIZ = i;
            }
            c77747UfH.LIZ = C30792C6q.LIZIZ();
            c77747UfH.LIZIZ = 0;
        }
        C77874UhK c77874UhK = new C77874UhK(afS2S0300100_13.j3);
        c77874UhK.LIZ = createSubOrderResult.sign;
        InterfaceC77737Uf7 interfaceC77737Uf7 = (InterfaceC77737Uf7) afS2S0300100_13.l0;
        if (interfaceC77737Uf7 != null) {
            interfaceC77737Uf7.LJIJJLI();
        }
        c77874UhK.LJIIJ = "";
        c77874UhK.LIZIZ = createSubOrderResult.merchantId;
        String str3 = createSubOrderResult.timeStamp;
        o.LJIIIIZZ(str3, "result.timeStamp");
        c77874UhK.LIZJ = CastLongProtector.parseLong(str3);
        c77874UhK.LJ = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        c77874UhK.LIZLLL = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        c77874UhK.LJFF = createSubOrderResult.bizContent;
        c77874UhK.LJII = z;
        c77874UhK.LJI = (HashMap) afS2S0300100_13.l1;
        c77874UhK.LJIIJJI = true;
        c77874UhK.LJIIIIZZ = c77747UfH.LIZ;
        int i2 = c77747UfH.LIZIZ;
        c77874UhK.LJIILJJIL = i2;
        if (i2 == 1) {
            C78253UnR.LJFF().updateHostAndOrderPlatform(createSubOrderResult.clientPipoUrl, createSubOrderResult.clientMPUrl, c77747UfH.LIZIZ);
        } else {
            C78253UnR.LJFF().updateHost(c77874UhK.LJIIIIZZ);
        }
        HashMap hashMap = (HashMap) afS2S0300100_13.l1;
        String str4 = createSubOrderResult.bizContent;
        o.LJIIIIZZ(str4, "result.bizContent");
        hashMap.put("bizContent", str4);
        ((HashMap) afS2S0300100_13.l1).put("duration", Long.valueOf(SystemClock.uptimeMillis() - afS2S0300100_13.j3));
        HashMap hashMap2 = (HashMap) afS2S0300100_13.l1;
        String LJFF = C38393F4z.LJFF(createSubOrderResult);
        o.LJIIIIZZ(LJFF, "toJSONString(result)");
        hashMap2.put("product", LJFF);
        HashMap hashMap3 = (HashMap) afS2S0300100_13.l1;
        String str5 = createSubOrderResult.contractId;
        o.LJIIIIZZ(str5, "result.contractId");
        hashMap3.put("contractId", str5);
        C78609UtB.LJJJJZI("ttlive_create_subscription", (HashMap) afS2S0300100_13.l1);
        HashMap logMap = (HashMap) afS2S0300100_13.l1;
        o.LJIIIZ(logMap, "logMap");
        C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_iap_create_order_success", C38393F4z.LIZLLL(logMap), 56);
        C77731Uf1.LJIIL((InterfaceC77737Uf7) afS2S0300100_13.l0, 7, new C31556Ca0(7, null, null, null, null, null, null, createSubOrderResult, 126));
        InterfaceC77737Uf7 interfaceC77737Uf72 = (InterfaceC77737Uf7) afS2S0300100_13.l0;
        if (interfaceC77737Uf72 != null && (LIZJ = interfaceC77737Uf72.LIZJ()) != null) {
            LIZJ.LIZ("livesdk_recharge_pay", null);
        }
        C77731Uf1.LJIIIZ((Activity) afS2S0300100_13.l2, c77874UhK, (InterfaceC77737Uf7) afS2S0300100_13.l0);
    }

    public static final void accept$2(AfS2S0300100_13 afS2S0300100_13, Object obj) {
        Integer num;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        EnumC74991Tbv LJJ;
        BaseResponse baseResponse = (BaseResponse) obj;
        C74987Tbr.LIZJ("anchor_shared_bg", "onSelectSharedBg, update settings success");
        MultiLiveAnchorPanelSettings LJI = C74776TWi.LJI();
        String str = null;
        if (LJI != null) {
            num = Integer.valueOf(LJI.fixMicNumAction);
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 0) {
            int LJJJJZI = C78886Uxe.LJJJJZI(C8E.LJ());
            if (((LiveEffect) afS2S0300100_13.l0) != null && LJJJJZI < 1) {
                ((MultiGuestSharedBgAnchorViewModel) afS2S0300100_13.l1).lv0(R.string.n89, "pm_mt_multiWallpaper_liveScreen_finishedState_toast");
            }
        }
        if (!C75283Tgd.LJ()) {
            C74987Tbr.LIZJ("anchor_shared_bg", "onSelectSharedBg, auto switch to grid layout");
            MultiGuestDataHolder LIZ = TRK.LIZ();
            if (LIZ != null && (multiLiveAnchorPanelSettings = LIZ.LJIIJ) != null && (LJJ = C86793Y4n.LJJ(multiLiveAnchorPanelSettings)) != null) {
                ((MultiGuestSharedBgAnchorViewModel) afS2S0300100_13.l1).getClass();
                MultiGuestSharedBgAnchorViewModel.mv0(LJJ);
            }
        }
        C75286Tgg c75286Tgg = ((MultiGuestSharedBgAnchorViewModel) afS2S0300100_13.l1).LJLJI;
        if (c75286Tgg != null) {
            c75286Tgg.LIZJ();
        }
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) afS2S0300100_13.l1;
        LiveEffect liveEffect = (LiveEffect) afS2S0300100_13.l0;
        multiGuestSharedBgAnchorViewModel.LJLJI = new C75286Tgg(liveEffect, false);
        if (liveEffect != null) {
            str = liveEffect.getResourceId();
        }
        ((MultiGuestSharedBgAnchorViewModel) afS2S0300100_13.l1).setState(new AqS55S0110000_13((LiveEffect) afS2S0300100_13.l0, multiGuestSharedBgAnchorViewModel.gv0(!TextUtils.isEmpty(str)), 0));
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS2S0300100_13.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        long LIZIZ = C31012CFc.LIZIZ() - afS2S0300100_13.j3;
        String str2 = baseResponse.LIZIZ;
        o.LJIIIIZZ(str2, "it.logId");
        C74824TYe.LJJLIIIJJIZ(LIZIZ, "change_sahred_bg", str2, "change_sahred_bg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r1 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$3(Y.AfS2S0300100_13 r5, java.lang.Object r6) {
        /*
            X.UBW r6 = (X.UBW) r6
            java.lang.Object r0 = r5.l0
            X.U7F r0 = (X.U7F) r0
            X.U7H r1 = r0.LJJIIJZLJL()
            java.lang.Object r0 = r5.l1
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            r1.LJJLIIIJL(r0)
            java.lang.Object r4 = r5.l2
            X.UAy r4 = (X.InterfaceC76768UAy) r4
            if (r4 == 0) goto L53
            java.lang.Object r0 = r5.l0
            X.U7F r0 = (X.U7F) r0
            long r2 = r5.j3
            r0.LJJIIJ(r2)
            java.util.concurrent.CopyOnWriteArrayList<X.U6Y> r0 = r0.LJIIZILJ
            java.util.Iterator r1 = r0.iterator()
        L26:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r1.next()
            X.U6Y r0 = (X.U6Y) r0
            r0.LJJJLIIL(r2)
            goto L26
        L36:
            r2 = 0
            if (r6 == 0) goto L49
            java.lang.Object r1 = r6.LIZ
            boolean r0 = r1 instanceof X.C28467BFf
            if (r0 == 0) goto L49
            if (r1 == 0) goto L54
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            if (r1 == 0) goto L49
            java.lang.String r1 = r1.LIZIZ
            if (r1 != 0) goto L4b
        L49:
            java.lang.String r1 = ""
        L4b:
            com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult r0 = new com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult
            r0.<init>(r2, r1)
            r4.LIZIZ(r0)
        L53:
            return
        L54:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.model.interact.CancelResponse>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S0300100_13.accept$3(Y.AfS2S0300100_13, java.lang.Object):void");
    }

    public static final void accept$4(AfS2S0300100_13 afS2S0300100_13, Object obj) {
        Throwable throwable = (Throwable) obj;
        if (!(throwable instanceof C276516r) || ((C276516r) throwable).getErrorCode() != 4004255) {
            ((U7F) afS2S0300100_13.l0).LJJIIJZLJL().LJJLIIIJL((LinkUser) afS2S0300100_13.l1);
            if (((InterfaceC76768UAy) afS2S0300100_13.l2) != null) {
                U7F u7f = (U7F) afS2S0300100_13.l0;
                long j = afS2S0300100_13.j3;
                u7f.LJJIIJ(j);
                Iterator<U6Y> it = u7f.LJIIZILJ.iterator();
                while (it.hasNext()) {
                    it.next().LJJJLIIL(j);
                }
            }
        }
        o.LJIIIIZZ(throwable, "throwable");
        U7V.LJIIJJI(throwable, (InterfaceC76768UAy) afS2S0300100_13.l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(AfS2S0300100_13 afS2S0300100_13, Object obj) {
        InviteResponse inviteResponse;
        BaseResponse baseResponse = (BaseResponse) obj;
        U4R.LIZ("InviteManager", "doInvite success");
        if (((CopyOnWriteArraySet) ((U71) afS2S0300100_13.l0).LJI).contains(Long.valueOf(afS2S0300100_13.j3)) && LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            U4R.LIZIZ("InviteManager", "moderator has process invite");
            return;
        }
        if (baseResponse != null && (inviteResponse = (InviteResponse) baseResponse.data) != null) {
            InviteData inviteData = (InviteData) afS2S0300100_13.l2;
            U71 u71 = (U71) afS2S0300100_13.l0;
            long j = afS2S0300100_13.j3;
            InterfaceC76767UAx interfaceC76767UAx = (InterfaceC76767UAx) afS2S0300100_13.l1;
            if (inviteData.getExpireTimeInSeconds() > 0) {
                u71.LJJLIIIIJ(inviteData.getExpireTimeInSeconds(), inviteData.getInvitee().getUserId());
            }
            ((CopyOnWriteArraySet) u71.LJI).add(Long.valueOf(j));
            if (interfaceC76767UAx == null) {
                return;
            }
            interfaceC76767UAx.LIZIZ(inviteResponse, baseResponse.LIZIZ);
            return;
        }
        ((U71) afS2S0300100_13.l0).LJJLI(afS2S0300100_13.j3, false);
        InterfaceC76767UAx interfaceC76767UAx2 = (InterfaceC76767UAx) afS2S0300100_13.l1;
        if (interfaceC76767UAx2 == null) {
            return;
        }
        interfaceC76767UAx2.LIZ(LinkCoreError.Companion.getCOMMON_RESPONSE_INVALID(), null, null);
    }

    public static final void accept$6(AfS2S0300100_13 afS2S0300100_13, Object obj) {
        C77626UdK it = (C77626UdK) obj;
        InterfaceC77595Ucp interfaceC77595Ucp = ((BaseRechargeViewModel) afS2S0300100_13.l0).LJLIL;
        if (interfaceC77595Ucp != null) {
            interfaceC77595Ucp.LJIJ();
        }
        BaseRechargeViewModel baseRechargeViewModel = (BaseRechargeViewModel) afS2S0300100_13.l0;
        o.LJIIIIZZ(it, "it");
        baseRechargeViewModel.getClass();
        DiamondPackageExtra diamondPackageExtra = it.LJLILLLLZI;
        baseRechargeViewModel.LJLJL = diamondPackageExtra;
        List<Diamond> list = it.LJLIL;
        baseRechargeViewModel.LJLJLJ = list;
        ((BaseRechargeViewModel) afS2S0300100_13.l0).nv0(diamondPackageExtra, list);
        InterfaceC77595Ucp interfaceC77595Ucp2 = ((BaseRechargeViewModel) afS2S0300100_13.l0).LJLIL;
        if (interfaceC77595Ucp2 != null) {
            interfaceC77595Ucp2.me(it.LJLILLLLZI, it.LJLIL);
        }
        ((HashMap) afS2S0300100_13.l1).put("cost", Long.valueOf(System.currentTimeMillis() - afS2S0300100_13.j3));
        ((HashMap) afS2S0300100_13.l1).put("cache_policy", ((InterfaceC77685UeH) afS2S0300100_13.l2).toString());
        ((HashMap) afS2S0300100_13.l1).put("hit_cache", Integer.valueOf(it.LJLJJI ? 1 : 0));
        UIO.LIZ("ttlive_wallet_recharge_panel_show", (HashMap) afS2S0300100_13.l1);
        HashMap logMap = (HashMap) afS2S0300100_13.l1;
        o.LJIIIZ(logMap, "logMap");
        C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_wallet_recharge_panel_load_package_success", C38393F4z.LIZLLL(logMap), 56);
    }

    public static final void accept$7(AfS2S0300100_13 afS2S0300100_13, Object obj) {
        Throwable it = (Throwable) obj;
        InterfaceC77595Ucp interfaceC77595Ucp = ((BaseRechargeViewModel) afS2S0300100_13.l0).LJLIL;
        if (interfaceC77595Ucp != null) {
            interfaceC77595Ucp.LJIJ();
        }
        BaseRechargeViewModel baseRechargeViewModel = (BaseRechargeViewModel) afS2S0300100_13.l0;
        o.LJIIIIZZ(it, "it");
        baseRechargeViewModel.getClass();
        if (it instanceof C77623UdH) {
            InterfaceC77595Ucp interfaceC77595Ucp2 = baseRechargeViewModel.LJLIL;
            if (interfaceC77595Ucp2 != null) {
                C77623UdH c77623UdH = (C77623UdH) it;
                interfaceC77595Ucp2.df(c77623UdH.getErrorCode(), c77623UdH.getDetailCode(), c77623UdH.getException());
            }
        } else if (it instanceof Exception) {
            InterfaceC77595Ucp interfaceC77595Ucp3 = baseRechargeViewModel.LJLIL;
            if (interfaceC77595Ucp3 != null) {
                interfaceC77595Ucp3.df(0, 0, (Exception) it);
            }
        } else {
            InterfaceC77595Ucp interfaceC77595Ucp4 = baseRechargeViewModel.LJLIL;
            if (interfaceC77595Ucp4 != null) {
                StringBuilder LIZ = X1D.LIZ();
                interfaceC77595Ucp4.df(0, 0, new UIM(C03090Af.LIZJ(LIZ, "unknow ", it, LIZ)));
            }
        }
        ((HashMap) afS2S0300100_13.l1).put("cost", Long.valueOf(System.currentTimeMillis() - afS2S0300100_13.j3));
        ((HashMap) afS2S0300100_13.l1).put("error_msg", it.toString());
        ((HashMap) afS2S0300100_13.l1).put("cache_policy", ((InterfaceC77685UeH) afS2S0300100_13.l2).toString());
        if (it instanceof C63756P0m) {
            List<Throwable> exceptions = ((C63756P0m) it).getExceptions();
            o.LJIIIIZZ(exceptions, "it.exceptions");
            Throwable th = (Throwable) ORZ.LJLLLL(exceptions);
            if (th != null) {
                it = th;
            }
        }
        HashMap hashMap = (HashMap) afS2S0300100_13.l1;
        UIM.Companion.getClass();
        UIM LIZ2 = UIL.LIZ(it);
        UIO.LIZJ("ttlive_wallet_recharge_panel_show", LIZ2.getErrorCode(), LIZ2.getDetailCode(), it.getMessage(), hashMap);
        HashMap logMap = (HashMap) afS2S0300100_13.l1;
        o.LJIIIZ(logMap, "logMap");
        C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_wallet_recharge_panel_load_package_fail", C38393F4z.LIZLLL(logMap), 56);
    }

    public AfS2S0300100_13(long j, Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.j3 = j;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
