package com.bytedance.android.live.liveinteract.cohost.log;

import X.B5G;
import X.C05630Jz;
import X.C09650Zl;
import X.C0K2;
import X.C58420MwK;
import X.C75192TfA;
import X.C75194TfC;
import X.C75513TkL;
import X.C75551Tkx;
import X.InterfaceC75560Tl6;
import X.TVU;
import X.TYQ;
import X.X1D;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC75560Tl6(name = "LINK_LOGGER")
/* loaded from: classes14.dex */
public final class CoHostLogger extends C75551Tkx {
    public static JSONObject LIZLLL() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        if (LIZIZ.LJIIL) {
            str = "inviter";
        } else {
            str = "invitee";
        }
        jSONObject.put("role_type", str);
        if (LIZIZ.LJIIIZ) {
            str2 = "random";
        } else {
            str2 = "normal";
        }
        jSONObject.put("from", str2);
        return jSONObject;
    }

    @Override // X.C75551Tkx, X.InterfaceC64402fs
    public final void LIZ(Map<String, Object> map) {
        HashMap hashMap = (HashMap) map;
        Integer num = (Integer) hashMap.get("reply_status");
        if (num != null) {
            num.intValue();
            if (num.intValue() == 1) {
                C75194TfC.LJIIZILJ(num.intValue(), null);
            } else {
                C75194TfC.LJIIZILJ(num.intValue(), map);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("channelId:");
            LIZ.append(hashMap.get("channel_id"));
            LIZ.append("; roomId:");
            LIZ.append(hashMap.get("room_id"));
            LIZ.append("; replyStatus:");
            LIZ.append(num);
            LIZ.append("; guestUserId:");
            LIZ.append(hashMap.get("guest_user_id"));
            TYQ.LIZLLL("LinkCross_Reply", X1D.LIZIZ(LIZ));
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LIZ(num.intValue(), "reply_status", jSONObject);
            C58420MwK.LIZLLL.LJIIIZ("reply", jSONObject);
        }
    }

    @Override // X.C75551Tkx, X.InterfaceC64402fs
    public final void LIZJ(Map<String, Object> map) {
        o.LJIIIZ(map, "map");
        C75513TkL c75513TkL = (C75513TkL) map.get("response");
        if (c75513TkL != null) {
            Object obj = c75513TkL.LIZ;
            if (obj instanceof LinkReplyResult) {
                if (obj != null) {
                    String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, obj);
                    o.LJIIIIZZ(json, "get().toJson(it)");
                    TYQ.LIZLLL("LinkCross_Reply_Success", json);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult");
                }
            }
            BaseResponse baseResponse = (BaseResponse) c75513TkL.LIZ;
            if (baseResponse != null) {
                Object obj2 = map.get("reply_status");
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj2).intValue();
                JSONObject jSONObject = new JSONObject();
                C05630Jz.LJI(jSONObject, "answer", String.valueOf(intValue));
                C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - C75194TfC.LIZIZ);
                C05630Jz.LJI(jSONObject, "request_type", String.valueOf(baseResponse.LIZLLL));
                C05630Jz.LJI(jSONObject, "response", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, baseResponse));
                C75194TfC c75194TfC = C75194TfC.LIZ;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    C75192TfA.LJIIIIZZ(jSONObject, entry.getKey(), entry.getValue());
                }
                c75194TfC.LJIJ(0, "reply_succeed", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                Object obj3 = map.get("reply_status");
                o.LJII(obj3, "null cannot be cast to non-null type kotlin.Int");
                C05630Jz.LIZ(((Integer) obj3).intValue(), "reply_status", jSONObject2);
                C05630Jz.LIZ(0, "err_code", jSONObject2);
                C58420MwK c58420MwK = C58420MwK.LIZLLL;
                c58420MwK.LIZ("reply", jSONObject2);
                Object obj4 = map.get("reply_status");
                o.LJII(obj4, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) obj4).intValue() != 1) {
                    JSONObject LIZLLL = LIZLLL();
                    C05630Jz.LJI(LIZLLL, "end_reason", "not_agree");
                    c58420MwK.LIZIZ(2, LIZLLL);
                }
            }
        }
    }

    @Override // X.C75551Tkx, X.InterfaceC64402fs
    public final void LIZIZ(Throwable th, Map<String, Object> map) {
        Integer num;
        JSONObject jSONObject;
        if (map != null && (num = (Integer) map.get("reply_status")) != null) {
            num.intValue();
            int intValue = num.intValue();
            JSONObject jSONObject2 = new JSONObject();
            C05630Jz.LJFF(jSONObject2, "error_code", 101L);
            C75194TfC c75194TfC = C75194TfC.LIZ;
            c75194TfC.LJIIL(th, jSONObject2);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                C75192TfA.LJIIIIZZ(jSONObject2, entry.getKey(), entry.getValue());
            }
            C05630Jz.LJI(jSONObject2, "answer", String.valueOf(intValue));
            C05630Jz.LJFF(jSONObject2, "cost", System.currentTimeMillis() - C75194TfC.LIZIZ);
            c75194TfC.LJIJ(1, "reply_failed", jSONObject2);
            if (intValue == 1) {
                try {
                    jSONObject = new JSONObject(jSONObject2.toString());
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                C0K2.LJIIJJI(1, TVU.LIZ, jSONObject);
                C0K2.LJIIIIZZ(TVU.LIZIZ, 1, jSONObject);
            }
            JSONObject jSONObject3 = new JSONObject();
            C05630Jz.LIZ(num.intValue(), "reply_status", jSONObject3);
            C05630Jz.LIZ(-1, "err_code", jSONObject3);
            C05630Jz.LJI(jSONObject3, "err_msg", String.valueOf(th));
            C58420MwK c58420MwK = C58420MwK.LIZLLL;
            c58420MwK.LIZ("reply", jSONObject3);
            JSONObject LIZLLL = LIZLLL();
            C05630Jz.LJI(LIZLLL, "end_reason", "reply_failed");
            c58420MwK.LIZIZ(2, LIZLLL);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("throwable:");
        LIZ.append(th);
        TYQ.LIZLLL("LinkCross_Reply_Failed", X1D.LIZIZ(LIZ));
    }
}
