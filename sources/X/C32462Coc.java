package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.MatchInfo;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import org.json.JSONObject;

/* renamed from: X.Coc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32462Coc implements InterfaceC32073CiL {
    public IMessageManager LIZ;
    public long LIZIZ;

    public static void LIZIZ(GiftMessage giftMessage) {
        long j;
        long j2;
        String str;
        String str2;
        long LIZ;
        Long l = null;
        if (giftMessage != null && giftMessage.fromUser != null && giftMessage.repeatEnd == 0) {
            long LIZ2 = C30725C4b.LIZ();
            CommonMessageData commonMessageData = giftMessage.baseMessage;
            if (commonMessageData != null) {
                j = commonMessageData.createTime;
            } else {
                j = 0;
            }
            long j3 = LIZ2 - j;
            long LIZ3 = C30725C4b.LIZ();
            GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
            if (giftMonitorInfo != null) {
                j2 = giftMonitorInfo.send_gift_req_start_ms;
            } else {
                j2 = 0;
            }
            long j4 = LIZ3 - j2;
            boolean LJIILLIIL = C32455CoV.LJIILLIIL();
            boolean LJIIZILJ = C32455CoV.LJIIZILJ(giftMessage);
            if (!GiftEventTrackSamplingSetting.shouldBlock(giftMessage) && (!GiftEventTrackSamplingSetting.enable() || (!LJIILLIIL && !LJIIZILJ))) {
                BZI LIZ4 = C28787BRn.LIZ("gift_msg_receive");
                LIZ4.LJIIZILJ();
                LIZ4.LJJIFFI(C32455CoV.LJFF(giftMessage));
                LIZ4.LJIJJ(Long.valueOf(j3), "create_receive_im_dur");
                LIZ4.LJIJJ(Long.valueOf(j4), "send_receive_im_dur");
                LIZ4.LJIJJ(Long.valueOf(C32455CoV.LJIIIIZZ(giftMessage, System.currentTimeMillis(), C30725C4b.LIZ())), "send_receive_dur");
                C32463Cod.LIZ(LIZ4, giftMessage);
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ4.LJIILL())) {
                    LIZ4.LJJIIJZLJL();
                } else {
                    LIZ4.LJJIJ();
                    LIZ4.LJJIIZI();
                }
                if (C32777Cth.LIZ(0.01f, "ttlive_gift_msg_receive") && LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_msg_receive", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject2.put("create_receive_im_dur", j3);
                    jSONObject2.put("send_receive_im_dur", j4);
                    C32455CoV.LJI(giftMessage, jSONObject, jSONObject2);
                    C0K2.LJI("ttlive_gift_msg_receive", jSONObject, jSONObject3, jSONObject2);
                }
            }
            boolean LJIILLIIL2 = C32455CoV.LJIILLIIL();
            boolean LJIIZILJ2 = C32455CoV.LJIIZILJ(giftMessage);
            if (LJIILLIIL2 || LJIIZILJ2) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("onReceivedGiftMessage id(");
                LIZ5.append(giftMessage.giftId);
                LIZ5.append(") isLocal(");
                LIZ5.append(giftMessage.LJLILLLLZI);
                LIZ5.append(") from(");
                LIZ5.append(giftMessage.fromUser.getId());
                LIZ5.append(") to(");
                User user = giftMessage.toUser;
                if (user != null) {
                    l = Long.valueOf(user.getId());
                }
                LIZ5.append(l);
                LIZ5.append(')');
                C0NB.LIZIZ("LiveGiftReceiveQueueMonitor", X1D.LIZIZ(LIZ5));
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                C32455CoV.LJII(jSONObject4, jSONObject5);
                Gift gift = giftMessage.mGift;
                if (gift == null) {
                    return;
                }
                C32455CoV.LIZJ(gift, giftMessage.giftsInBox, giftMessage.colorId, jSONObject4, jSONObject5);
                C32455CoV.LIZIZ(giftMessage, jSONObject4, jSONObject5);
                C32433Co9.LIZIZ(jSONObject5);
                MatchInfo matchInfo = giftMessage.matchInfo;
                if (matchInfo != null && matchInfo.critical > 1) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject5.put("has_critical", str);
                jSONObject5.put("send_receive_dur", C32455CoV.LJIIIIZZ(giftMessage, System.currentTimeMillis(), C30725C4b.LIZ()));
                CommonMessageData commonMessageData2 = giftMessage.baseMessage;
                if (commonMessageData2 != null) {
                    long j5 = commonMessageData2.createTime;
                    if (giftMessage.LJLILLLLZI) {
                        LIZ = System.currentTimeMillis();
                    } else {
                        LIZ = C30725C4b.LIZ();
                    }
                    jSONObject5.put("msg_create_receive_dur", LIZ - j5);
                }
                if (LJIIZILJ2) {
                    if (giftMessage.LJLILLLLZI) {
                        str2 = "gift_msg_receive_self_fake";
                    } else {
                        str2 = "gift_msg_receive_self_real";
                    }
                } else {
                    str2 = "gift_msg_receive_anchor";
                }
                BZI LIZ6 = C28787BRn.LIZ(str2);
                LIZ6.LJJ(jSONObject4);
                LIZ6.LJJ(jSONObject5);
                LIZ6.LJJIIJZLJL();
                C0K2.LJI(str2, jSONObject4, new JSONObject(), jSONObject5);
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("reported(");
                LIZ7.append(str2);
                LIZ7.append(')');
                C0NB.LIZIZ("LiveGiftReceiveQueueMonitor", X1D.LIZIZ(LIZ7));
            }
        }
    }

    @Override // X.InterfaceC32073CiL
    public final void LIZ(IMessageManager iMessageManager) {
        this.LIZ = iMessageManager;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        User user;
        if (!(iMessage instanceof GiftMessage)) {
            return false;
        }
        if (this.LIZIZ <= 0) {
            this.LIZIZ = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        }
        try {
            LIZIZ((GiftMessage) iMessage);
        } catch (Exception unused) {
        }
        GiftMessage giftMessage = (GiftMessage) iMessage;
        long j = this.LIZIZ;
        if ((j <= 0 || giftMessage.LJLILLLLZI || (user = giftMessage.fromUser) == null || j != user.getId() || giftMessage.repeatEnd == 1) && giftMessage.fromUser != null) {
            return false;
        }
        return true;
    }
}
