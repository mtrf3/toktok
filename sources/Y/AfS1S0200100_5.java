package Y;

import X.AnonymousClass172;
import X.B83;
import X.BPP;
import X.BYG;
import X.BZI;
import X.C04;
import X.C09650Zl;
import X.C0EM;
import X.C0K2;
import X.C0NB;
import X.C15380j0;
import X.C276516r;
import X.C28467BFf;
import X.C28557BIr;
import X.C28787BRn;
import X.C28817BSr;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29401Dk;
import X.C29739Bln;
import X.C29778BmQ;
import X.C30868C9o;
import X.C31264COu;
import X.C32354Cms;
import X.C32537Cpp;
import X.C32661Crp;
import X.C32697CsP;
import X.C32726Css;
import X.C39681h6;
import X.C77630UdO;
import X.CQQ;
import X.CR6;
import X.CS5;
import X.CS6;
import X.CS7;
import X.CS8;
import X.CSM;
import X.CVJ;
import X.CVK;
import X.CZR;
import X.EnumC32353Cmr;
import X.InterfaceC05190Ih;
import X.InterfaceC28558BIs;
import X.InterfaceC29405BgP;
import X.InterfaceC30442Bx8;
import X.InterfaceC31355CSh;
import X.InterfaceC32356Cmu;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.O5Y;
import X.OSZ;
import X.UFE;
import X.X1D;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.data.model.wallet.WalletInfoExtra;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.model.AudienceRoomTasksResponse;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortal4FEModelSender;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.TreasureBoxService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.pack.model.SendItemErrorExtra;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.api.privilege.StarCommentDeleteResponse;
import tikcast.api.privilege.StarCommentQueue;
import webcast.api.envelope.PortalListResponse;
import webcast.api.interaction.PinResponse;
import webcast.api.partnership.AnchorRoomInfoResponse;
import webcast.data.InteractionConflict;

/* loaded from: classes6.dex */
public class AfS1S0200100_5 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        T t = baseResponse.data;
        if (t != 0) {
            WalletStruct walletStruct = (WalletStruct) t;
            ((WalletCenter) afS1S0200100_5.l1).LJLIL = walletStruct;
            BalanceStructExtra balanceStructExtra = walletStruct.LIZ;
            WalletExchange walletExchange = WalletExchange.LJLIL;
            boolean LIZJ = walletStruct.LIZJ();
            walletExchange.getClass();
            WalletExchange.LJJIIJ(LIZJ);
            WalletExchange.LJJIII(((WalletStruct) baseResponse.data).LIZIZ());
            InterfaceC30442Bx8.LLLIL.LIZ(-1);
            RevenueExchange revenueExchange = ((WalletCenter) afS1S0200100_5.l1).LJLIL.revenue;
            if (revenueExchange != null && revenueExchange.getEnableExchange()) {
                WalletStruct walletStruct2 = ((WalletCenter) afS1S0200100_5.l1).LJLIL;
                walletStruct2.LIZ = balanceStructExtra;
                WalletExchange.LJJIJ(((WalletCenter) afS1S0200100_5.l1).LJLIL.revenue.getBalance(), walletStruct2.revenue.getCurrency(), ((WalletCenter) afS1S0200100_5.l1).LJLIL.revenue.getRegion());
            }
            ((InterfaceC32356Cmu) afS1S0200100_5.l0).LIZ(((WalletStruct) baseResponse.data).diamond);
            WalletCenter walletCenter = (WalletCenter) afS1S0200100_5.l1;
            walletCenter.LJLJJLL.onNext(Long.valueOf(walletCenter.LIZ()));
        } else {
            ((InterfaceC32356Cmu) afS1S0200100_5.l0).LIZIZ(new C39681h6());
        }
        R r = baseResponse.extra;
        if (r != 0) {
            ((WalletCenter) afS1S0200100_5.l1).LJLILLLLZI = (WalletInfoExtra) r;
        }
        C0K2.LJIIL(SystemClock.uptimeMillis() - afS1S0200100_5.j2, 0, O5Y.LJJL("ttlive_charge_current_diamond_status"), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        ((C04) ((GamePartnershipService) afS1S0200100_5.l0).LJLILLLLZI.getValue()).LIZ = afS1S0200100_5.j2;
        C04 c04 = (C04) ((GamePartnershipService) afS1S0200100_5.l0).LJLILLLLZI.getValue();
        T t = ((BaseResponse) obj).data;
        c04.LIZIZ = (AnchorRoomInfoResponse.ResponseData) t;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS1S0200100_5.l1;
        o.LJIIIIZZ(t, "it.data");
        interfaceC88472Yns.invoke(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$10(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        StarCommentDeleteResponse.Data data;
        StarCommentQueue starCommentQueue;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (data = (StarCommentDeleteResponse.Data) baseResponse.data) != null && (starCommentQueue = data.queue) != null) {
            CZR czr = (CZR) afS1S0200100_5.l0;
            CVK cvk = (CVK) afS1S0200100_5.l1;
            long j = afS1S0200100_5.j2;
            czr.LIZLLL(starCommentQueue, false);
            C30868C9o.LIZJ(R.string.o62);
            DataChannel dataChannel = czr.LJLILLLLZI;
            if (dataChannel != null) {
                CVJ.LIZIZ(dataChannel, cvk, SystemClock.elapsedRealtime() - j, baseResponse.LIZIZ);
            }
        }
    }

    public static final void accept$11(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        Throwable throwable = (Throwable) obj;
        if (throwable instanceof C29401Dk) {
            C30868C9o.LJI(((C29401Dk) throwable).getPrompt());
        }
        DataChannel dataChannel = ((CZR) afS1S0200100_5.l0).LJLILLLLZI;
        if (dataChannel != null) {
            CVK cvk = (CVK) afS1S0200100_5.l1;
            long j = afS1S0200100_5.j2;
            o.LJIIIIZZ(throwable, "throwable");
            CVJ.LIZ(dataChannel, cvk, throwable, SystemClock.elapsedRealtime() - j);
        }
    }

    public static final void accept$12(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        if (afS1S0200100_5.j2 == 0) {
            C29739Bln c29739Bln = (C29739Bln) afS1S0200100_5.l0;
            c29739Bln.LIZIZ(c29739Bln.LJIILIIL);
        } else {
            C29739Bln c29739Bln2 = (C29739Bln) afS1S0200100_5.l0;
            View view = (View) afS1S0200100_5.l1;
            c29739Bln2.getClass();
            C29739Bln.LIZLLL(view);
        }
    }

    public static final void accept$13(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        int i;
        long j = afS1S0200100_5.j2;
        EnumC32353Cmr enumC32353Cmr = (EnumC32353Cmr) afS1S0200100_5.l0;
        HashMap logMap = (HashMap) afS1S0200100_5.l1;
        Throwable th = (Throwable) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", th.getMessage());
        if (th instanceof C276516r) {
            i = ((C276516r) th).getErrorCode();
        } else {
            i = -16;
        }
        hashMap.put("error_code", Integer.valueOf(i));
        C0K2.LJIIL(SystemClock.uptimeMillis() - j, 1, O5Y.LJJLI("ttlive_charge_current_diamond_status"), hashMap);
        C0K2.LJIIL(SystemClock.uptimeMillis() - j, 1, O5Y.LJJL("ttlive_charge_current_diamond_status"), hashMap);
        int i2 = C32354Cms.LIZ[enumC32353Cmr.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                if (logMap != null) {
                    logMap.put("is_update", CardStruct.IStatusCode.DEFAULT);
                }
                o.LJIIIZ(logMap, "logMap");
                AnonymousClass172.LIZ("livesdk_recharge_coins_balance_response", logMap);
            }
        } else {
            C77630UdO.LJ(SystemClock.uptimeMillis() - j, false);
        }
        C77630UdO.LJI(SystemClock.uptimeMillis() - j, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$14(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        BroadcastSettingResponse broadcastSettingResponse;
        T t;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (t = baseResponse.data) != 0) {
            C31264COu.LIZJ = new OSZ<>(Long.valueOf(afS1S0200100_5.j2), t);
        }
        Context context = (Context) afS1S0200100_5.l0;
        DataChannel dataChannel = (DataChannel) afS1S0200100_5.l1;
        if (baseResponse == null || (broadcastSettingResponse = (BroadcastSettingResponse) baseResponse.data) == null) {
            return;
        }
        if (dataChannel != null) {
            dataChannel.rv0(BroadcastSettingResponseChannel.class, broadcastSettingResponse);
        }
        ((IGiftService) C31264COu.LIZIZ.getValue()).toggleGiftBehavior(context, dataChannel, broadcastSettingResponse.LIZ());
    }

    public static final void accept$15(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        long j;
        Throwable th = (Throwable) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ((BagListViewModel) afS1S0200100_5.l0).lv0((C32726Css) afS1S0200100_5.l1, false);
        if (th != null) {
            if (th instanceof C29401Dk) {
                C29401Dk c29401Dk = (C29401Dk) th;
                if (!TextUtils.isEmpty(c29401Dk.getPrompt()) && c29401Dk.getErrorCode() != 10002) {
                    C30868C9o.LJI(c29401Dk.getPrompt());
                    if (!TextUtils.isEmpty(c29401Dk.getExtra())) {
                        try {
                            if (!o.LJ(((SendItemErrorExtra) C09650Zl.LIZIZ.LJI(((C29401Dk) th).getExtra(), SendItemErrorExtra.class)).needReload, Boolean.TRUE)) {
                                BagListViewModel bagListViewModel = (BagListViewModel) afS1S0200100_5.l0;
                                long LJJIZ = C29306Beo.LJJIZ(bagListViewModel.LJLIL);
                                Room LJJIJLIJ = C29306Beo.LJJIJLIJ(((BagListViewModel) afS1S0200100_5.l0).LJLIL);
                                if (LJJIJLIJ != null) {
                                    j = LJJIJLIJ.getOwnerUserId();
                                } else {
                                    j = 0;
                                }
                                BagListViewModel.iv0(bagListViewModel, 5, LJJIZ, j);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("match_item_type", ((C32697CsP) ((C32726Css) afS1S0200100_5.l1).LIZIZ).LIZIZ());
                    jSONObject.put("match_item_expiretime", ((C32697CsP) ((C32726Css) afS1S0200100_5.l1).LIZIZ).LIZJ);
                    jSONObject.put("cost", elapsedRealtime - afS1S0200100_5.j2);
                    C32661Crp.LIZ(th, jSONObject);
                    C32661Crp.LJI("match_item_send_failed", jSONObject);
                    return;
                }
            }
            C30868C9o.LIZJ(R.string.kes);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("match_item_type", ((C32697CsP) ((C32726Css) afS1S0200100_5.l1).LIZIZ).LIZIZ());
            jSONObject2.put("match_item_expiretime", ((C32697CsP) ((C32726Css) afS1S0200100_5.l1).LIZIZ).LIZJ);
            jSONObject2.put("cost", elapsedRealtime - afS1S0200100_5.j2);
            C32661Crp.LIZ(th, jSONObject2);
            C32661Crp.LJI("match_item_send_failed", jSONObject2);
            return;
        }
        C30868C9o.LIZJ(R.string.kes);
    }

    public static final void accept$16(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        Throwable th = (Throwable) obj;
        TreasureBoxService treasureBoxService = (TreasureBoxService) afS1S0200100_5.l0;
        String message = th.getMessage();
        long j = afS1S0200100_5.j2;
        Boolean bool = (Boolean) afS1S0200100_5.l1;
        treasureBoxService.getClass();
        TreasureBoxService.LIZ(-1, message, j, null, bool);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("err stack: ");
        LIZ.append(th);
        C0NB.LJ("TreasureBoxService", X1D.LIZIZ(LIZ));
    }

    public static final void accept$17(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        Throwable th = (Throwable) obj;
        TreasureBoxService treasureBoxService = (TreasureBoxService) afS1S0200100_5.l0;
        String message = th.getMessage();
        long j = afS1S0200100_5.j2;
        Boolean bool = (Boolean) afS1S0200100_5.l1;
        treasureBoxService.getClass();
        TreasureBoxService.LIZ(-1, message, j, null, bool);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("err stack: ");
        LIZ.append(th);
        C0NB.LJ("TreasureBoxService", X1D.LIZIZ(LIZ));
    }

    public static final void accept$18(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        C29778BmQ c29778BmQ = (C29778BmQ) afS1S0200100_5.l0;
        long j = c29778BmQ.LJFF;
        long j2 = afS1S0200100_5.j2;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS1S0200100_5.l1;
        long j3 = j % c29778BmQ.LJIIJJI;
        if (j3 != 0) {
            c29778BmQ.LIZ((int) j3, j2);
            c29778BmQ.LJFF = 0L;
        }
        interfaceC65784Pro.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$19(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        int i;
        O o;
        BaseResponse baseResponse = (BaseResponse) obj;
        DataChannel dataChannel = ((FansClubViewModel) afS1S0200100_5.l0).getDataChannel();
        if (dataChannel != null) {
            if (baseResponse != null) {
                o = baseResponse.data;
            } else {
                o = 0;
            }
            ((C32537Cpp) dataChannel.gv0(BYG.class)).LIZ = o;
        }
        if (baseResponse != null) {
            i = baseResponse.statusCode;
        } else {
            i = 1;
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() - afS1S0200100_5.j2);
        String roomId = String.valueOf(((Room) afS1S0200100_5.l1).getId());
        o.LJIIIZ(roomId, "roomId");
        BZI LIZ = C28787BRn.LIZ("livesdk_fetch_fans_task_complete");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(1, "success");
        LIZ.LJIJJ(Integer.valueOf(i), "errorCode");
        LIZ.LJIJJ(Integer.valueOf(currentTimeMillis), "duration");
        LIZ.LJIJJ(roomId, "room_id");
        LIZ.LJJIIJZLJL();
    }

    public static final void accept$2(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        User user = (User) afS1S0200100_5.l0;
        UserAttr userAttr = user.getUserAttr();
        if (userAttr == null) {
            userAttr = new UserAttr();
            user.setUserAttr(userAttr);
        }
        userAttr.isMuted = true;
        InterfaceC28558BIs interfaceC28558BIs = (InterfaceC28558BIs) ((WeakReference) afS1S0200100_5.l1).get();
        if (interfaceC28558BIs != null) {
            interfaceC28558BIs.ck(true);
        }
        long j = afS1S0200100_5.j2;
        long id = ((User) afS1S0200100_5.l0).getId();
        String secUid = ((User) afS1S0200100_5.l0).getSecUid();
        o.LJIIIIZZ(secUid, "user.secUid");
        C28557BIr.LIZJ(j, id, secUid, true);
    }

    public static final void accept$20(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        PinResponse.ResponseData responseData;
        InteractionConflict interactionConflict;
        InterfaceC31355CSh LIZ;
        PinResponse.ResponseData responseData2;
        CommonMessageData commonMessageData;
        PinResponse pinResponse = (PinResponse) obj;
        if (pinResponse != null && (responseData2 = pinResponse.data) != null && responseData2.status == 1) {
            Long l = null;
            if (1 != 0) {
                CS6 cs6 = (CS6) afS1S0200100_5.l0;
                long j = afS1S0200100_5.j2;
                CR6 cr6 = cs6.LJFF;
                if (cr6 != null && (commonMessageData = cr6.baseMessage) != null) {
                    CR6 LIZ2 = CS8.LIZ(responseData2.pinMsg);
                    if (LIZ2 != null) {
                        l = Long.valueOf(LIZ2.getMessageId());
                    }
                    commonMessageData.messageId = l.longValue();
                }
                cs6.LJI = responseData2.pinMsg;
                CS5.LJ(CS5.LIZ, j, cs6);
                return;
            }
        }
        CS5.LJFF.remove(afS1S0200100_5.j2);
        CS5 cs5 = CS5.LIZ;
        CS6 cs62 = (CS6) afS1S0200100_5.l0;
        cs62.LIZLLL = true;
        cs5.getClass();
        CS5.LJIIJJI(cs62);
        if (pinResponse == null || (responseData = pinResponse.data) == null || (interactionConflict = responseData.interactionConflict) == null || !interactionConflict.isconflict || (LIZ = CS7.LIZ(new CSM(pinResponse))) == null) {
            return;
        }
        LIZ.LIZIZ((CQQ) afS1S0200100_5.l1);
    }

    public static final void accept$3(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        Exception exc;
        Throwable th = (Throwable) obj;
        BPP.LIZLLL(C15380j0.LIZLLL(), th, R.string.svg);
        InterfaceC28558BIs interfaceC28558BIs = (InterfaceC28558BIs) ((WeakReference) afS1S0200100_5.l0).get();
        if (interfaceC28558BIs != null) {
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            interfaceC28558BIs.U3(exc);
        }
        long j = afS1S0200100_5.j2;
        long id = ((User) afS1S0200100_5.l1).getId();
        String secUid = ((User) afS1S0200100_5.l1).getSecUid();
        o.LJIIIIZZ(secUid, "user.secUid");
        C28557BIr.LIZIZ(j, id, secUid, th, true);
    }

    public static final void accept$4(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        User user = (User) afS1S0200100_5.l0;
        UserAttr userAttr = user.getUserAttr();
        if (userAttr == null) {
            userAttr = new UserAttr();
            user.setUserAttr(userAttr);
        }
        userAttr.isMuted = false;
        InterfaceC28558BIs interfaceC28558BIs = (InterfaceC28558BIs) ((WeakReference) afS1S0200100_5.l1).get();
        if (interfaceC28558BIs != null) {
            interfaceC28558BIs.ck(false);
        }
        long j = afS1S0200100_5.j2;
        long id = ((User) afS1S0200100_5.l0).getId();
        String secUid = ((User) afS1S0200100_5.l0).getSecUid();
        o.LJIIIIZZ(secUid, "user.secUid");
        C28557BIr.LIZJ(j, id, secUid, false);
    }

    public static final void accept$5(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        Exception exc;
        Throwable th = (Throwable) obj;
        BPP.LIZLLL(C15380j0.LIZLLL(), th, R.string.svg);
        InterfaceC28558BIs interfaceC28558BIs = (InterfaceC28558BIs) ((WeakReference) afS1S0200100_5.l0).get();
        if (interfaceC28558BIs != null) {
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            interfaceC28558BIs.U3(exc);
        }
        long j = afS1S0200100_5.j2;
        long id = ((User) afS1S0200100_5.l1).getId();
        String secUid = ((User) afS1S0200100_5.l1).getSecUid();
        o.LJIIIIZZ(secUid, "user.secUid");
        C28557BIr.LIZIZ(j, id, secUid, th, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$6(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        String str;
        ImageModel imageModel;
        Room room;
        List<PortalListResponse.PortalInfo> list;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        BaseResponse baseResponse = (BaseResponse) obj;
        Integer valueOf = Integer.valueOf(baseResponse.statusCode);
        boolean LJJI = ((C28817BSr) afS1S0200100_5.l0).LJJI();
        long j = afS1S0200100_5.j2;
        PortalListResponse.ResponseData responseData = (PortalListResponse.ResponseData) baseResponse.data;
        HashMap hashMap = new HashMap();
        Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room2 != null) {
            String idStr = room2.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room2.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
        }
        if (valueOf != null) {
            C0EM.LIZJ(valueOf, hashMap, "error_code");
        }
        if (LJJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str);
        B83 LIZ = B83.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (responseData != null) {
            for (PortalListResponse.PortalInfo portalInfo : responseData.portal) {
                arrayList.add(portalInfo.id);
                arrayList2.add(portalInfo.senderId);
            }
        }
        String abstractCollection = arrayList.toString();
        o.LJIIIIZZ(abstractCollection, "portalIdList.toString()");
        hashMap.put("portal_id_list", abstractCollection);
        String abstractCollection2 = arrayList2.toString();
        o.LJIIIIZZ(abstractCollection2, "senderIdList.toString()");
        hashMap.put("sender_id_list", abstractCollection2);
        hashMap.put("duration_from_request", String.valueOf(System.currentTimeMillis() - j));
        BZI LIZ2 = C28787BRn.LIZ("livesdk_portal_list_response");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIJJI("live_detail");
        LIZ2.LJIIL("click");
        LIZ2.LJIIIZ("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZI();
        }
        C0K2.LJFF("ttlive_portal_list_response", hashMap, new HashMap(), new HashMap());
        PortalListResponse.ResponseData responseData2 = (PortalListResponse.ResponseData) baseResponse.data;
        if (responseData2 != null && (list = responseData2.portal) != null) {
            List list2 = (List) afS1S0200100_5.l1;
            for (PortalListResponse.PortalInfo portalInfo2 : list) {
                if (o.LJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), portalInfo2.senderId)) {
                    EnvelopePortalMessage.PortalInfo portalInfo3 = new EnvelopePortalMessage.PortalInfo();
                    portalInfo3.id = portalInfo2.id;
                    portalInfo3.senderId = portalInfo2.senderId;
                    portalInfo3.portalDiamonds = portalInfo2.portalDiamonds;
                    portalInfo3.transCount = portalInfo2.transCount;
                    portalInfo3.ddlSecond = portalInfo2.ddlSecond;
                    portalInfo3.envelopeDiamonds = portalInfo2.envelopeDiamonds;
                    portalInfo3.sendAtSecond = portalInfo2.sendAtSecond;
                    portalInfo3.senderAvatar = portalInfo2.senderAvatar;
                    portalInfo3.senderDisplayId = portalInfo2.senderDisplayId;
                    portalInfo3.touchCount = portalInfo2.touchCount;
                    list2.add(portalInfo3);
                }
            }
        }
        if (!((List) afS1S0200100_5.l1).isEmpty()) {
            DataChannel dataChannel = ((C28817BSr) afS1S0200100_5.l0).LJLJL;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                imageModel = room.getCover();
            } else {
                imageModel = null;
            }
            EnvelopPortal4FEModelSender envelopPortal4FEModelSender = new EnvelopPortal4FEModelSender();
            envelopPortal4FEModelSender.portalInfos.addAll((List) afS1S0200100_5.l1);
            C28817BSr.LJJIFFI((C28817BSr) afS1S0200100_5.l0, envelopPortal4FEModelSender, imageModel, 2, 1, null, 48);
        }
    }

    public static final void accept$7(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        OSZ osz = (OSZ) obj;
        GamePartnershipService gamePartnershipService = (GamePartnershipService) afS1S0200100_5.l0;
        long j = afS1S0200100_5.j2;
        Object second = osz.getSecond();
        o.LJIIIIZZ(second, "it.second");
        GamePartnershipService.LJFF(gamePartnershipService, j, (C28467BFf) second, (AudienceRoomTasksResponse) osz.getFirst(), null, 8);
        ((InterfaceC88472Yns) afS1S0200100_5.l1).invoke(((GamePartnershipService) afS1S0200100_5.l0).LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$8(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        StarCommentDeleteResponse.Data data;
        StarCommentQueue starCommentQueue;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (data = (StarCommentDeleteResponse.Data) baseResponse.data) != null && (starCommentQueue = data.queue) != null) {
            CZR czr = (CZR) afS1S0200100_5.l0;
            CVK cvk = (CVK) afS1S0200100_5.l1;
            long j = afS1S0200100_5.j2;
            czr.LIZLLL(starCommentQueue, false);
            DataChannel dataChannel = czr.LJLILLLLZI;
            if (dataChannel != null) {
                CVJ.LIZIZ(dataChannel, cvk, SystemClock.elapsedRealtime() - j, baseResponse.LIZIZ);
            }
        }
    }

    public static final void accept$9(AfS1S0200100_5 afS1S0200100_5, Object obj) {
        Throwable throwable = (Throwable) obj;
        DataChannel dataChannel = ((CZR) afS1S0200100_5.l0).LJLILLLLZI;
        if (dataChannel != null) {
            CVK cvk = (CVK) afS1S0200100_5.l1;
            long j = afS1S0200100_5.j2;
            o.LJIIIIZZ(throwable, "throwable");
            CVJ.LIZ(dataChannel, cvk, throwable, SystemClock.elapsedRealtime() - j);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS1S0200100_5(long r2, com.bytedance.android.live.base.model.user.User r4, java.lang.ref.WeakReference r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 2: goto L10;
                case 3: goto L5;
                case 4: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r5
            r0.j2 = r2
            r0.l1 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r5
            r0.j2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS1S0200100_5.<init>(long, com.bytedance.android.live.base.model.user.User, java.lang.ref.WeakReference, int):void");
    }

    public AfS1S0200100_5(long j, Object obj, Object obj2, int i) {
        this.$t = i;
        this.j2 = j;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
