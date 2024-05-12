package X;

import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BS7 implements InterfaceC72822Si2 {
    public final /* synthetic */ BS8 LJLIL;

    public BS7(BS8 bs8) {
        this.LJLIL = bs8;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Integer valueOf;
        InterfaceC78280Uns interfaceC78280Uns;
        String str;
        String str2;
        int i;
        String str3;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        String str4;
        Integer num;
        java.util.Map<String, Object> LIZIZ2;
        String str5;
        BS8 bs8 = this.LJLIL;
        bs8.getClass();
        String str6 = c199097rd.LJLIL;
        int hashCode = str6.hashCode();
        boolean z = true;
        if (hashCode != -1091071735) {
            if (hashCode != -126454431) {
                if (hashCode == 353918035 && str6.equals("EVENT_ENVELOPE_UPDATE")) {
                    C0NB.LJ("RedEnvelopePresenter", "handleEvent: EVENT_ENVELOPE_UPDATE");
                    XKX.LIZLLL(C780334l.LJLIL, null, null, new C28767BQt(null), 3);
                    return;
                }
            } else if (str6.equals("liveGoldenEnvelopeCreate")) {
                C0NB.LIZIZ("RedEnvelopePresenter", "handleEvent: liveGoldenEnvelopeCreate");
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null) {
                    interfaceC78280Uns = u.LJJIJIIJIL(interfaceC78280Uns2, "envelope_info");
                } else {
                    interfaceC78280Uns = null;
                }
                if (interfaceC78280Uns == null || !interfaceC78280Uns.hasKey("send_time")) {
                    z = false;
                }
                String str7 = CardStruct.IStatusCode.DEFAULT;
                if (z) {
                    str = interfaceC78280Uns.getString("send_time");
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                o.LJIIIZ(str, "<set-?>");
                C28792BRs.LIZ = str;
                RedEnvelopMessage dataModel = new RedEnvelopMessage();
                InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns3 != null && (LIZIZ2 = interfaceC78280Uns3.LIZIZ()) != null) {
                    Gson gson = C09650Zl.LIZIZ;
                    dataModel = (RedEnvelopMessage) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, LIZIZ2), RedEnvelopMessage.class);
                    o.LJIIIIZZ(dataModel, "dataModel");
                    MessageRedEnvelopInfo messageRedEnvelopInfo = dataModel.envelopeInfo;
                    if (messageRedEnvelopInfo != null) {
                        str5 = messageRedEnvelopInfo.envelopeId;
                    } else {
                        str5 = null;
                    }
                    C28792BRs.LIZIZ = String.valueOf(str5);
                    MessageRedEnvelopInfo messageRedEnvelopInfo2 = dataModel.envelopeInfo;
                    if (messageRedEnvelopInfo2 != null) {
                        messageRedEnvelopInfo2.createTime = String.valueOf(System.currentTimeMillis());
                    }
                    String LJIIIZ = bs8.LJIIIZ(dataModel, "fe");
                    if (LJIIIZ != null) {
                        bs8.LJIIL(LJIIIZ, "fe");
                    }
                    bs8.LJIILIIL(bs8.LJIIJJI());
                    DataChannel dataChannel = bs8.LIZIZ;
                    if (dataChannel != null) {
                        dataChannel.qv0(GiftDialogDismissEvent.class, Boolean.TRUE);
                    }
                }
                Boolean bool = bs8.LIZLLL;
                HashMap hashMap = new HashMap(7);
                MessageRedEnvelopInfo messageRedEnvelopInfo3 = dataModel.envelopeInfo;
                String str8 = "";
                if (messageRedEnvelopInfo3 == null || (str2 = messageRedEnvelopInfo3.envelopeId) == null) {
                    str2 = "";
                }
                hashMap.put("envelope_id", str2);
                MessageRedEnvelopInfo messageRedEnvelopInfo4 = dataModel.envelopeInfo;
                if (messageRedEnvelopInfo4 != null && (num = messageRedEnvelopInfo4.businessType) != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                hashMap.put("business_type", String.valueOf(i));
                MessageRedEnvelopInfo messageRedEnvelopInfo5 = dataModel.envelopeInfo;
                if (messageRedEnvelopInfo5 == null || (str3 = messageRedEnvelopInfo5.sendUserId) == null) {
                    str3 = "";
                }
                hashMap.put("send_user_id", str3);
                MessageRedEnvelopInfo messageRedEnvelopInfo6 = dataModel.envelopeInfo;
                if (messageRedEnvelopInfo6 != null && (str4 = messageRedEnvelopInfo6.createTime) != null) {
                    str8 = str4;
                }
                hashMap.put("create_at", str8);
                B83 LIZ = B83.LIZ();
                if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
                    UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
                }
                if (o.LJ(bool, Boolean.TRUE)) {
                    str7 = "1";
                }
                hashMap.put("is_anchor", str7);
                BZI LIZ2 = C28787BRn.LIZ("livesdk_treasure_box_create_event_receive");
                LIZ2.LJJIFFI(hashMap);
                LIZ2.LJIIZILJ();
                LIZ2.LJIIJJI("live_detail");
                LIZ2.LJIIL("click");
                LIZ2.LJIIIZ("live");
                LIZ2.LJJIIJZLJL();
                C0K2.LJII(0, "ttlive_treasure_box_create_event_receive", hashMap);
                XKX.LIZLLL(C780334l.LJLIL, null, null, new C28766BQs(null), 3);
                return;
            }
        } else if (str6.equals("liveGoldenEnvelopCloseAll")) {
            C0NB.LIZIZ("RedEnvelopePresenter", "handleEvent: liveGoldenEnvelopCloseAll");
            InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns4 == null || (valueOf = Integer.valueOf(u.LJJIJIIJI(interfaceC78280Uns4, "business_type", 0))) == null) {
                return;
            }
            if (valueOf.intValue() != 1 && valueOf.intValue() != 2) {
                return;
            }
            bs8.LJII = null;
            bs8.LJIILIIL(false);
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("handleEvent: unknown event->");
        C1EW.LIZLLL(LIZ3, c199097rd.LJLIL, LIZ3, "RedEnvelopePresenter");
    }
}
