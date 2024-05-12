package X;

import Y.ARunnableS34S0200000_15;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class YMI implements VLE {
    public static final int LJIIJJI = 12346;
    public static final int LJIIL = 12347;
    public static final int LJIILIIL = 12348;
    public static final int LJIILJJIL = 12349;
    public static final int LJIILL = 12350;
    public final YMB LIZ;
    public final IMessageWsClient LIZIZ;
    public final YMT LIZJ;
    public final YMS LIZLLL;
    public YML LJ;
    public YMR LJFF;
    public VLD LJI;
    public VLD LJII;
    public VLD LJIIIIZZ;
    public final C60 LJIIIZ;
    public final C84628XJg LJIIJ;

    public final void LIZLLL() {
        VLD vld;
        C30591Hz.LJJIIZI(this.LIZ, "uplink: ws disconnect");
        YMR ymr = this.LJFF;
        if (ymr != null && ymr.getLooper() != null && (vld = this.LJIIIIZZ) != null) {
            vld.sendEmptyMessage(LJIILL);
        }
    }

    public final void LJFF() {
        VLD vld;
        C30591Hz.LJJIIZI(this.LIZ, "uplink release");
        VLD vld2 = this.LJI;
        if (vld2 != null) {
            vld2.removeCallbacksAndMessages(null);
        }
        VLD vld3 = this.LJII;
        if (vld3 != null) {
            vld3.removeCallbacksAndMessages(null);
        }
        VLD vld4 = this.LJIIIIZZ;
        if (vld4 != null) {
            vld4.removeCallbacksAndMessages(null);
        }
        YMR ymr = this.LJFF;
        if (ymr != null && ymr.getLooper() != null && (vld = this.LJIIIIZZ) != null) {
            vld.sendEmptyMessage(LJIILJJIL);
        }
    }

    public static byte[] LIZ(PayloadItem payloadItem) {
        C87247YLz c87247YLz;
        byte[] payload = payloadItem.getPayload();
        List<C87247YLz> headers = payloadItem.getHeaders();
        String str = null;
        if (headers != null) {
            Iterator<C87247YLz> it = headers.iterator();
            while (true) {
                if (it.hasNext()) {
                    c87247YLz = it.next();
                    if (o.LJ(c87247YLz.LIZ, "compress_type")) {
                        break;
                    }
                } else {
                    c87247YLz = null;
                    break;
                }
            }
            C87247YLz c87247YLz2 = c87247YLz;
            if (c87247YLz2 != null) {
                str = c87247YLz2.LIZIZ;
            }
        }
        if (o.LJ(str, "gzip")) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(payload);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = gZIPInputStream.read(bArr, 0, 4096);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    gZIPInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    byteArrayInputStream.close();
                    o.LJIIIIZZ(byteArray, "{\n            GzipUtils.…(originPayload)\n        }");
                    return byteArray;
                }
            }
        } else {
            o.LJIIIIZZ(payload, "{\n            originPayload\n        }");
            return payload;
        }
    }

    public final void LIZJ(YMJ ymj) {
        XM9<YME, Exception> xm8;
        YMP ymp;
        VLD vld;
        YMB ymb = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uplink request finished, serviceId: ");
        LIZ.append(ymj.LIZIZ);
        LIZ.append(", uniqueId: ");
        LIZ.append(ymj.LIZ);
        C30591Hz.LJJIIZI(ymb, X1D.LIZIZ(LIZ));
        C60 c60 = this.LJIIIZ;
        c60.getClass();
        ((HashMap) c60.LIZ).remove(Long.valueOf(ymj.LIZ));
        YMK ymk = ymj.LJIILIIL;
        if (ymk != null && (vld = this.LJI) != null) {
            vld.removeCallbacks(ymk);
        }
        YMP ymp2 = ymj.LJIIL;
        YMJ ymj2 = ymj.LJFF;
        YMB messageContext = this.LIZ;
        ymp2.getClass();
        o.LJIIIZ(messageContext, "messageContext");
        if (ymp2.LJII > ymp2.LJI) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("service_id", ymp2.LIZIZ);
            jSONObject.put("status_code", ymp2.LJIIIZ);
            jSONObject.put("expect_strategy", ymp2.LIZJ);
            jSONObject.put("actual_strategy", ymp2.LIZLLL);
            jSONObject.put("ws_connected_on_send", ymp2.LJ);
            jSONObject.put("ws_connected_on_finish", ymp2.LJFF);
            jSONObject.put("success", ymp2.LJIIIIZZ);
            long j = ymp2.LJII - ymp2.LJI;
            JSONObject LIZLLL = Q7K.LIZLLL("use_time", j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("unique_id", ymp2.LIZ);
            jSONObject2.put("status_message", ymp2.LJIIJ);
            jSONObject2.put("send_time", ymp2.LJI);
            jSONObject2.put("finish_time", ymp2.LJII);
            if (ymj2 != null && (ymp = ymj2.LJIIL) != null) {
                jSONObject.put("fail_request_status_code", ymp.LJIIIZ);
                jSONObject.put("fail_request_expect_strategy", ymp.LIZJ);
                jSONObject.put("fail_request_actual_strategy", ymp.LIZLLL);
                jSONObject.put("fail_request_ws_connected_on_send", ymp.LJ);
                jSONObject.put("fail_request_ws_connected_on_finish", ymp.LJFF);
                jSONObject.put("fail_request_success", ymp.LJIIIIZZ);
                LIZLLL.put("fail_request_use_time", ymp.LJII - ymp.LJI);
                LIZLLL.put("all_use_time", ymp2.LJII - ymp.LJI);
                jSONObject2.put("fail_request_unique_id", ymp.LIZ);
                jSONObject2.put("fail_request_status_message", ymp.LJIIJ);
                jSONObject2.put("fail_request_send_time", ymp.LJI);
                jSONObject2.put("fail_request_finish_time", ymp.LJII);
            }
            messageContext.monitorLatency("uplink_status_all", j, jSONObject, LIZLLL, jSONObject2);
            if (!ymp2.LJIIIIZZ) {
                messageContext.monitor("uplink_status_error", jSONObject, LIZLLL, jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("category", jSONObject);
            jSONObject3.put("metric", LIZLLL);
            jSONObject3.put("extra", jSONObject2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("uplink stat: ");
            LIZ2.append(jSONObject3);
            C30591Hz.LJJIIZI(messageContext, X1D.LIZIZ(LIZ2));
        }
        try {
            xm8 = ymj.LIZ();
        } catch (Exception e) {
            xm8 = new XM8<>(e);
        }
        ARunnableS34S0200000_15 aRunnableS34S0200000_15 = new ARunnableS34S0200000_15(ymj, xm8, 1);
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            aRunnableS34S0200000_15.run();
        } else {
            ((Handler) C80974VqE.LIZ.getValue()).post(aRunnableS34S0200000_15);
        }
    }

    public final void LJ(YMJ ymj) {
        VLD vld;
        if (this.LIZLLL.LJFF()) {
            YMB ymb = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("uplink request fail, fall back to http, serviceId: ");
            LIZ.append(ymj.LIZIZ);
            LIZ.append(", uniqueId: ");
            LIZ.append(ymj.LIZ);
            C30591Hz.LJJIIZI(ymb, X1D.LIZIZ(LIZ));
            C60 c60 = this.LJIIIZ;
            c60.getClass();
            ((HashMap) c60.LIZ).remove(Long.valueOf(ymj.LIZ));
            YMK ymk = ymj.LJIILIIL;
            if (ymk != null && (vld = this.LJI) != null) {
                vld.removeCallbacks(ymk);
            }
            LJI(ymj.LIZIZ, ymj.LIZLLL, ymj.LJ, ymj);
            return;
        }
        LIZJ(ymj);
    }

    public final void LJII(YMJ ymj) {
        YMB ymb = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("send uplink packet by origin http, serviceId: ");
        LIZ.append(ymj.LIZIZ);
        LIZ.append(", uniqueId: ");
        LIZ.append(ymj.LIZ);
        C30591Hz.LJJIIZI(ymb, X1D.LIZIZ(LIZ));
        EnumC64973Pej enumC64973Pej = ymj.LIZLLL.LIZ;
        if (enumC64973Pej == null) {
            enumC64973Pej = EnumC64973Pej.POST;
        }
        int i = C64975Pel.LIZ[enumC64973Pej.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LIZJ.get(ymj.LIZLLL, new YMN(ymj, this));
            return;
        }
        this.LIZJ.post(ymj.LIZLLL, new YMM(ymj, this));
    }

    public final void LJIIIIZZ(YMJ ymj) {
        YMB ymb = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("send uplink packet by uplink http, serviceId: ");
        LIZ.append(ymj.LIZIZ);
        LIZ.append(", uniqueId: ");
        LIZ.append(ymj.LIZ);
        C30591Hz.LJJIIZI(ymb, X1D.LIZIZ(LIZ));
        String uplinkHttpUrl = this.LIZLLL.LJIL();
        o.LJIIIZ(uplinkHttpUrl, "uplinkHttpUrl");
        SdkUplinkPacket LIZIZ = ymj.LIZIZ();
        C64984Peu c64984Peu = new C64984Peu();
        C64972Pei c64972Pei = c64984Peu.LIZ;
        c64972Pei.LJI = "application/protobuf";
        c64972Pei.LIZIZ = uplinkHttpUrl;
        byte[] encode = LIZIZ.encode();
        C64972Pei c64972Pei2 = c64984Peu.LIZ;
        c64972Pei2.LJ = encode;
        if (c64972Pei2.LJII == null) {
            c64972Pei2.LJII = Collections.emptyMap();
        }
        C64972Pei c64972Pei3 = c64984Peu.LIZ;
        o.LJIIIIZZ(c64972Pei3, "Builder()\n            .m…e())\n            .build()");
        this.LIZJ.post(c64972Pei3, new YMO(ymj, this));
    }

    public final void LJIIIZ(YMJ ymj) {
        YMB ymb = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("send uplink packet by ws, serviceId: ");
        LIZ.append(ymj.LIZIZ);
        LIZ.append(", uniqueId: ");
        LIZ.append(ymj.LIZ);
        C30591Hz.LJJIIZI(ymb, X1D.LIZIZ(LIZ));
        SdkUplinkPacket LIZIZ = ymj.LIZIZ();
        YMK ymk = new YMK(this, ymj.LIZ);
        ymj.LJIILIIL = ymk;
        ymj.LJIILJJIL = true;
        byte[] encode = LIZIZ.encode();
        o.LJIIIIZZ(encode, "uplinkPacket.encode()");
        Long l = LIZIZ.uniqueID;
        o.LJIIIIZZ(l, "uplinkPacket.uniqueID");
        long longValue = l.longValue();
        Long l2 = LIZIZ.uniqueID;
        o.LJIIIIZZ(l2, "uplinkPacket.uniqueID");
        long longValue2 = l2.longValue();
        if (this.LIZIZ.isWsConnected()) {
            this.LIZIZ.sendUplinkPacket(new PayloadItem("uplink_im_gateway", "pb", encode, new ArrayList(), longValue, longValue2));
        }
        YMB ymb2 = this.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("post ws timeout task, timeout: ");
        LIZ2.append(ymj.LIZJ);
        String msg = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(ymb2, "<this>");
        o.LJIIIZ(msg, "msg");
        if (ymb2.supportDebugInfo()) {
            ymb2.log("MessageManagerV2", msg);
        }
        VLD vld = this.LJI;
        if (vld != null) {
            vld.postDelayed(ymk, ymj.LIZJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.VLE
    public final void handleMsg(Message message) {
        YML yml;
        java.util.Map<String, String> map;
        String str;
        YML yml2;
        java.util.Map<String, String> map2;
        String str2;
        YML yml3;
        if (message == null) {
            return;
        }
        int i = message.what;
        if (i == 12345) {
            Object obj = message.obj;
            o.LJII(obj, "null cannot be cast to non-null type com.ss.ugc.live.sdk.msg.uplink.UplinkRequestItem");
            YMJ ymj = (YMJ) obj;
            C60 c60 = this.LJIIIZ;
            c60.getClass();
            ((HashMap) c60.LIZ).put(Long.valueOf(ymj.LIZ), ymj);
            YML expectUplinkStrategy = this.LJ;
            boolean isWsConnected = this.LIZIZ.isWsConnected();
            o.LJIIIZ(expectUplinkStrategy, "expectUplinkStrategy");
            YMP ymp = ymj.LJIIL;
            ymp.getClass();
            ymp.LJI = System.currentTimeMillis();
            ymp.LIZJ = expectUplinkStrategy.getStrategy(isWsConnected);
            ymp.LJ = isWsConnected;
            if (ymj.LJFF == null && (((yml3 = this.LJ) == YML.WS_MSG_ORIGIN || yml3 == YML.WS_ORIGIN) && this.LIZIZ.isWsConnected())) {
                try {
                    YMP ymp2 = ymj.LJIIL;
                    ymp2.getClass();
                    ymp2.LIZLLL = "ws";
                    LJIIIZ(ymj);
                    return;
                } catch (Exception e) {
                    LJIIJ(ymj, ymj.LIZIZ, this.LJ, this.LIZIZ.isWsConnected(), e);
                    return;
                }
            }
            if (this.LJ == YML.WS_MSG_ORIGIN) {
                try {
                    YMP ymp3 = ymj.LJIIL;
                    ymp3.getClass();
                    ymp3.LIZLLL = "room_http";
                    LJIIIIZZ(ymj);
                    return;
                } catch (Exception e2) {
                    LJIIJ(ymj, ymj.LIZIZ, this.LJ, this.LIZIZ.isWsConnected(), e2);
                    return;
                }
            }
            try {
                YMP ymp4 = ymj.LJIIL;
                ymp4.getClass();
                ymp4.LIZLLL = "origin_http";
                LJII(ymj);
                return;
            } catch (Exception e3) {
                LJIIJ(ymj, ymj.LIZIZ, this.LJ, this.LIZIZ.isWsConnected(), e3);
                return;
            }
        }
        String str3 = "";
        String str4 = "server error";
        if (i == LJIIJJI) {
            Object obj2 = message.obj;
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.ugc.live.sdk.message.data.PayloadItem");
            PayloadItem payloadItem = (PayloadItem) obj2;
            try {
                SdkUplinkPacket decode = SdkUplinkPacket.ADAPTER.decode(LIZ(payloadItem));
                YMB ymb = this.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("receive uplink packet by ws, logId: ");
                if (decode != null && (map2 = decode.headers) != null && (str2 = map2.get("X-Tt-Logid")) != null) {
                    str3 = str2;
                }
                LIZ.append(str3);
                C30591Hz.LJJIIZI(ymb, X1D.LIZIZ(LIZ));
                C60 c602 = this.LJIIIZ;
                Long l = decode.uniqueID;
                o.LJIIIIZZ(l, "uplinkPacket.uniqueID");
                YMJ LIZ2 = c602.LIZ(l.longValue());
                if (LIZ2 == null) {
                    Long l2 = decode.serviceID;
                    o.LJIIIIZZ(l2, "uplinkPacket.serviceID");
                    long longValue = l2.longValue();
                    Long l3 = decode.uniqueID;
                    o.LJIIIIZZ(l3, "uplinkPacket.uniqueID");
                    LIZIZ(longValue, l3.longValue(), payloadItem.getLogId(), "receiveWSPayload");
                    return;
                }
                YMU ymu = YML.Companion;
                Integer num = decode.uplinkStrategy;
                o.LJIIIIZZ(num, "uplinkPacket.uplinkStrategy");
                int intValue = num.intValue();
                ymu.getClass();
                if (intValue != 0) {
                    if (intValue == 1) {
                        yml2 = YML.WS_ORIGIN;
                    } else {
                        yml2 = YML.ORIGIN;
                    }
                } else {
                    yml2 = YML.WS_MSG_ORIGIN;
                }
                this.LJ = yml2;
                Integer num2 = decode.statusCode;
                if (num2 == null || num2.intValue() != 0) {
                    Integer num3 = decode.statusCode;
                    o.LJIIIIZZ(num3, "uplinkPacket.statusCode");
                    int intValue2 = num3.intValue();
                    String str5 = decode.statusMessage;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    LIZ2.LIZJ(new C79533VJh(intValue2, str4, null, 4, null), this.LIZIZ.isWsConnected());
                    LJ(LIZ2);
                    return;
                }
                LIZ2.LJ(decode, this.LIZIZ.isWsConnected(), true);
                LIZJ(LIZ2);
                return;
            } catch (Exception e4) {
                C30591Hz.LJJIIZI(this.LIZ, "receive uplink packet by ws error");
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                String message2 = e4.getMessage();
                if (message2 == null) {
                    message2 = "Unknown exception";
                }
                JSONObject LIZJ = C65232Piu.LIZJ("error", message2);
                LIZJ.put("log_id", payloadItem.getLogId());
                this.LIZ.monitor("uplink_receive_ws_packet_error", jSONObject, jSONObject2, LIZJ);
                YMB ymb2 = this.LIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("receive ws uplink packet error: ");
                LIZ3.append(message2);
                C30591Hz.LJJIIZI(ymb2, X1D.LIZIZ(LIZ3));
                return;
            }
        }
        if (i == LJIIL) {
            Object obj3 = message.obj;
            o.LJII(obj3, "null cannot be cast to non-null type com.ss.ugc.live.sdk.msg.uplink.UplinkRequestItem");
            YMJ ymj2 = (YMJ) obj3;
            YMJ LIZ4 = this.LJIIIZ.LIZ(ymj2.LIZ);
            if (LIZ4 == null) {
                LIZIZ(ymj2.LIZIZ, ymj2.LIZ, 0L, "receiveMsgHttpResult");
                return;
            }
            try {
                XM9<YME, ? extends Exception> xm9 = LIZ4.LJI;
                if (xm9 != null) {
                    if (xm9 instanceof XMB) {
                        SdkUplinkPacket decode2 = SdkUplinkPacket.ADAPTER.decode(((YME) ((XMB) xm9).LIZIZ).LIZLLL);
                        YMB ymb3 = this.LIZ;
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("receive uplink packet by msg http, logId: ");
                        if (decode2 != null && (map = decode2.headers) != null && (str = map.get("X-Tt-Logid")) != null) {
                            str3 = str;
                        }
                        LIZ5.append(str3);
                        C30591Hz.LJJIIZI(ymb3, X1D.LIZIZ(LIZ5));
                        YMU ymu2 = YML.Companion;
                        Integer num4 = decode2.uplinkStrategy;
                        o.LJIIIIZZ(num4, "uplinkPacket.uplinkStrategy");
                        int intValue3 = num4.intValue();
                        ymu2.getClass();
                        if (intValue3 != 0) {
                            if (intValue3 == 1) {
                                yml = YML.WS_ORIGIN;
                            } else {
                                yml = YML.ORIGIN;
                            }
                        } else {
                            yml = YML.WS_MSG_ORIGIN;
                        }
                        this.LJ = yml;
                        Integer num5 = decode2.statusCode;
                        if (num5 == null || num5.intValue() != 0) {
                            Integer num6 = decode2.statusCode;
                            o.LJIIIIZZ(num6, "uplinkPacket.statusCode");
                            int intValue4 = num6.intValue();
                            String str6 = decode2.statusMessage;
                            if (str6 != null) {
                                str4 = str6;
                            }
                            LIZ4.LIZJ(new C79533VJh(intValue4, str4, null, 4, null), this.LIZIZ.isWsConnected());
                        } else {
                            LIZ4.LJ(decode2, this.LIZIZ.isWsConnected(), false);
                        }
                    } else if (xm9 instanceof XM8) {
                        Exception exc = ((XM8) xm9).LIZIZ;
                        C30591Hz.LJJIIZI(this.LIZ, "receive uplink packet by msg error");
                        LIZ4.LIZJ(exc, this.LIZIZ.isWsConnected());
                    } else {
                        throw new C162476Zf();
                    }
                }
            } catch (Exception e5) {
                LIZ4.LIZJ(e5, this.LIZIZ.isWsConnected());
            }
            LIZJ(LIZ4);
            return;
        }
        if (i == LJIILIIL) {
            Object obj4 = message.obj;
            o.LJII(obj4, "null cannot be cast to non-null type com.ss.ugc.live.sdk.msg.uplink.UplinkRequestItem");
            YMJ ymj3 = (YMJ) obj4;
            C30591Hz.LJJIIZI(this.LIZ, "receive uplink packet by origin http");
            YMJ LIZ6 = this.LJIIIZ.LIZ(ymj3.LIZ);
            if (LIZ6 == null) {
                LIZIZ(ymj3.LIZIZ, ymj3.LIZ, 0L, "receiveOriginHttpResult");
                return;
            }
            try {
                XM9<YME, ? extends Exception> xm92 = LIZ6.LJII;
                if (xm92 != null) {
                    if (xm92 instanceof XMB) {
                        LIZ6.LIZLLL((YME) ((XMB) xm92).LIZIZ, this.LIZIZ.isWsConnected());
                    } else if (xm92 instanceof XM8) {
                        LIZ6.LIZJ(((XM8) xm92).LIZIZ, this.LIZIZ.isWsConnected());
                    } else {
                        throw new C162476Zf();
                    }
                }
            } catch (Exception e6) {
                LIZ6.LIZJ(e6, this.LIZIZ.isWsConnected());
            }
            LIZJ(LIZ6);
            return;
        }
        if (i == LJIILJJIL) {
            try {
                for (Map.Entry entry : ((LinkedHashMap) this.LJIIIZ.LIZ).entrySet()) {
                    ((YMJ) entry.getValue()).LIZJ(new C79533VJh(-4, "released", null, 4, null), this.LIZIZ.isWsConnected());
                    LIZJ((YMJ) entry.getValue());
                }
                ((LinkedHashMap) this.LJIIIZ.LIZ).clear();
                YMR ymr = this.LJFF;
                if (ymr != null) {
                    ymr.quit();
                    return;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (i == LJIILL) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJIIIZ.LIZ;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((YMJ) entry2.getValue()).LJIILJJIL) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                ((YMJ) entry3.getValue()).LIZJ(new C79533VJh(-5, "ws disconnect", null, 4, null), this.LIZIZ.isWsConnected());
                LJ((YMJ) entry3.getValue());
            }
        }
    }

    public YMI(YMB ymb, IMessageWsClient iMessageWsClient, IMessageWsClient iMessageWsClient2, YMS yms) {
        YML yml;
        this.LIZ = ymb;
        this.LIZIZ = iMessageWsClient;
        this.LIZJ = iMessageWsClient2;
        this.LIZLLL = yms;
        if (yms.LJ() && yms.LJIJI()) {
            yml = YML.WS_MSG_ORIGIN;
        } else if (yms.LJ()) {
            yml = YML.WS_ORIGIN;
        } else {
            yml = YML.ORIGIN;
        }
        this.LJ = yml;
        this.LJIIIZ = new C60(1);
        this.LJIIJ = new C84628XJg();
    }

    public final void LIZIZ(long j, long j2, long j3, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("receive_type", str);
        jSONObject.put("service_id", j);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject LIZLLL = Q7K.LIZLLL("log_id", j3);
        LIZLLL.put("unique_id", j2);
        this.LIZ.monitor("uplink_receive_request_no_item_found_error", jSONObject, jSONObject2, LIZLLL);
        C30591Hz.LJJIIZI(this.LIZ, "no request item found");
    }

    public final void LJI(long j, C64972Pei request, YMF callback, YMJ ymj) {
        Message obtainMessage;
        o.LJIIIZ(request, "request");
        o.LJIIIZ(callback, "callback");
        YMJ ymj2 = new YMJ(this.LJIIJ.LIZ.incrementAndGet(), j, this.LIZLLL.LIZJ(), request, callback, ymj);
        VLD vld = this.LJI;
        if (vld != null && (obtainMessage = vld.obtainMessage(12345, ymj2)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    public final void LJIIJ(YMJ ymj, long j, YML yml, boolean z, Exception exc) {
        ymj.LIZJ(new C79533VJh(-5, "sendRequestError", null, 4, null), this.LIZIZ.isWsConnected());
        LIZJ(ymj);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("service_id", j);
        jSONObject.put("send_uplink_strategy", yml.getStrategy(z));
        jSONObject.put("ws_connected", z);
        JSONObject jSONObject2 = new JSONObject();
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown exception";
        }
        this.LIZ.monitor("uplink_send_error", jSONObject, jSONObject2, C65232Piu.LIZJ("error", message));
        YMB ymb = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uplink send error, use strategy: ");
        LIZ.append(yml.getStrategy(z));
        LIZ.append(", ws connect: ");
        LIZ.append(z);
        LIZ.append(", error: ");
        LIZ.append(message);
        C30591Hz.LJJIIZI(ymb, X1D.LIZIZ(LIZ));
    }
}
