package org.chromium.wschannel;

import J.N;
import X.C05040Hs;
import X.C09900aA;
import X.C16880lQ;
import X.C36922EeM;
import X.C64735Pat;
import X.QF8;
import X.QFB;
import X.QFC;
import X.QFD;
import X.QFE;
import X.QFF;
import X.QFG;
import X.QFI;
import X.QFK;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ttnet.org.chromium.net.impl.CronetFrontierClient;
import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;
import defpackage.i0;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public class MySelfChannelImpl implements IWsChannelClient, WeakHandler.IHandler {
    public static String WSCHANNEL_ACTION_BACK;
    public static String WSCHANNEL_ACTION_FORE;
    public static String sPackageName;
    public Context mContext;
    public QFB mFrontierConnection;
    public IWsChannelClient mWsChannelClient;

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onNetworkStateChanged(int i) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void openConnection(Map map, List list) {
        org_chromium_wschannel_MySelfChannelImpl_com_ss_android_ugc_aweme_notice_api_ws_WsLancet_openConnection(this, map, list);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void destroy() {
        QFB qfb = this.mFrontierConnection;
        if (qfb != null) {
            qfb.LIZ();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean isConnected() {
        QFK qfk;
        CronetFrontierClient cronetFrontierClient;
        QFB qfb = this.mFrontierConnection;
        if (qfb == null) {
            return false;
        }
        if (qfb.LIZIZ.get() && (cronetFrontierClient = qfb.LJI) != null) {
            if (cronetFrontierClient.LJIILLIIL.get() != 2) {
                return false;
            }
        } else if (qfb.LIZIZ.get() || (qfk = qfb.LJIIIZ) == null || ((CronetWebsocketConnection) qfk).LJIJ.get() != 4) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean privateProtocolEnabled() {
        QFB qfb = this.mFrontierConnection;
        if (qfb != null) {
            return qfb.LIZIZ.get();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void stopConnection() {
        QFB qfb = this.mFrontierConnection;
        if (qfb != null) {
            qfb.LIZ();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Logger.debug();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onAppStateChanged(int i) {
        Intent intent = new Intent();
        if (i == 1) {
            intent.setAction(WSCHANNEL_ACTION_FORE);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            this.mContext.sendBroadcast(intent);
            return;
        }
        if (i != 2) {
            return;
        }
        intent.setAction(WSCHANNEL_ACTION_BACK);
        if (!TextUtils.isEmpty(sPackageName)) {
            intent.setPackage(sPackageName);
        }
        this.mContext.sendBroadcast(intent);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onConnection(JSONObject jSONObject) {
        if (this.mWsChannelClient != null) {
            try {
                jSONObject.put("channel_type", 1);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            this.mWsChannelClient.onConnection(jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(WsChannelMsg wsChannelMsg) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(wsChannelMsg);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void registerService(int i) {
        QFB qfb = this.mFrontierConnection;
        if (qfb == null || qfb.LJI == null || !qfb.LIZIZ.get()) {
            return;
        }
        if (((ConcurrentHashMap) qfb.LJI.LJIIJJI).containsKey(Integer.valueOf(i))) {
            qfb.LJI.LIZ((QFI) ((ConcurrentHashMap) qfb.LJI.LJIIJJI).get(Integer.valueOf(i)));
            return;
        }
        qfb.LIZIZ(i);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(WsChannelMsg wsChannelMsg) {
        String[] strArr;
        Logger.debug();
        QFB qfb = this.mFrontierConnection;
        boolean z = false;
        if (qfb == null) {
            return false;
        }
        Logger.debug();
        CronetFrontierClient cronetFrontierClient = qfb.LJI;
        if (cronetFrontierClient == null || wsChannelMsg == null) {
            return false;
        }
        int i = wsChannelMsg.service;
        if (i == 9000 && wsChannelMsg.method == 4) {
            Iterator<WsChannelMsg.MsgHeader> it = wsChannelMsg.msgHeaders.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WsChannelMsg.MsgHeader next = it.next();
                if (next != null && "IsBackground".equals(next.key)) {
                    String str = next.value;
                    if (str.equals("1")) {
                        qfb.LJII = 1;
                    } else if (str.equals(CardStruct.IStatusCode.DEFAULT)) {
                        qfb.LJII = 0;
                    }
                    if (qfb.LJIIIIZZ && qfb.LJII != -1) {
                        CronetFrontierClient cronetFrontierClient2 = qfb.LJI;
                        if (qfb.LJII == 1) {
                            z = true;
                        }
                        cronetFrontierClient2.LIZIZ(z);
                    }
                }
            }
        } else {
            if (!((ConcurrentHashMap) cronetFrontierClient.LJIIJJI).containsKey(Integer.valueOf(i))) {
                qfb.LIZIZ(i);
            }
            ArrayList LIZIZ = C05040Hs.LIZIZ("method_id");
            LIZIZ.add(String.valueOf(wsChannelMsg.method));
            if (!TextUtils.isEmpty(wsChannelMsg.payloadType)) {
                LIZIZ.add("payload_type");
                LIZIZ.add(wsChannelMsg.payloadType);
            }
            if (!TextUtils.isEmpty(wsChannelMsg.payloadEncoding)) {
                LIZIZ.add("payload_encoding");
                LIZIZ.add(wsChannelMsg.payloadEncoding);
            }
            List<WsChannelMsg.MsgHeader> list = wsChannelMsg.msgHeaders;
            if (list == null) {
                strArr = (String[]) LIZIZ.toArray(new String[0]);
            } else {
                for (WsChannelMsg.MsgHeader msgHeader : list) {
                    if (!TextUtils.isEmpty(msgHeader.key) && !TextUtils.isEmpty(msgHeader.value)) {
                        LIZIZ.add(msgHeader.key);
                        LIZIZ.add(msgHeader.value);
                    }
                }
                strArr = (String[]) LIZIZ.toArray(new String[0]);
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(wsChannelMsg.LIZ().length);
            allocateDirect.put(wsChannelMsg.LIZ());
            CronetFrontierClient cronetFrontierClient3 = qfb.LJI;
            synchronized (cronetFrontierClient3.LJIILL) {
                if (cronetFrontierClient3.LJIILJJIL != 0) {
                    N.MKYiSehZ(cronetFrontierClient3.LJIILJJIL, cronetFrontierClient3, i, strArr, allocateDirect);
                }
            }
            Logger.debug();
        }
        return true;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void unregisterService(int i) {
        QFB qfb = this.mFrontierConnection;
        if (qfb == null || qfb.LJI == null || !qfb.LIZIZ.get()) {
            return;
        }
        if (!((ConcurrentHashMap) qfb.LJI.LJIIJJI).containsKey(Integer.valueOf(i))) {
            return;
        }
        CronetFrontierClient cronetFrontierClient = qfb.LJI;
        synchronized (cronetFrontierClient.LJIILL) {
            if (cronetFrontierClient.LJIILJJIL != 0) {
                ((ConcurrentHashMap) cronetFrontierClient.LJIIJJI).remove(Integer.valueOf(i));
                N.M4rPfgYd(cronetFrontierClient.LJIILJJIL, cronetFrontierClient, i);
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(bArr);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(byte[] bArr) {
        Logger.debug();
        QFB qfb = this.mFrontierConnection;
        if (qfb == null) {
            return false;
        }
        qfb.getClass();
        Logger.debug();
        if (qfb.LJIIIZ == null) {
            return false;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        qfb.LJIIIZ.LIZ(allocateDirect);
        return true;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void init(Context context, IWsChannelClient iWsChannelClient) {
        Logger.debug();
        this.mContext = context;
        sPackageName = context.getPackageName();
        this.mWsChannelClient = iWsChannelClient;
        this.mFrontierConnection = new QFB(this);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mContext.getPackageName());
        LIZ.append(".wschannel.APP_BACKGROUND");
        WSCHANNEL_ACTION_BACK = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.mContext.getPackageName());
        LIZ2.append(".wschannel.APP_FOREGROUND");
        WSCHANNEL_ACTION_FORE = X1D.LIZIZ(LIZ2);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onParameterChange(Map<String, Object> map, List<String> list) {
        QFB qfb = this.mFrontierConnection;
        if (qfb != null) {
            qfb.LIZ();
        }
        openConnection(map, list);
    }

    public void org_chromium_wschannel_MySelfChannelImpl__openConnection$___twin___(Map<String, Object> map, List<String> list) {
        boolean z;
        QFF qff;
        boolean z2;
        QFB qfb = this.mFrontierConnection;
        if (qfb != null) {
            if (list != null && list.size() > 0) {
                Logger.debug();
                if (map != null && !map.isEmpty()) {
                    Object obj = map.get("private_protocol_enable");
                    if (obj != null) {
                        z = ((Boolean) obj).booleanValue();
                    } else {
                        z = false;
                    }
                    Logger.debug();
                    QF8 qf8 = new QF8(qfb, QFB.LJIIL, map, list);
                    if (C64735Pat.LJIIZILJ && z && qfb.LIZJ.get() < 3) {
                        qfb.LIZ();
                        String str = (String) ListProtector.get(list, 0);
                        String str2 = (String) map.get("private_protocol_url");
                        if (!TextUtils.isEmpty(str2)) {
                            str = str2;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            if (str.startsWith("wss:")) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("https:");
                                LIZ.append(str.substring(4));
                                str = X1D.LIZIZ(LIZ);
                            } else if (str.startsWith("ws:")) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("http:");
                                LIZ2.append(str.substring(3));
                                str = X1D.LIZIZ(LIZ2);
                            }
                            URI uri = new URI(str);
                            String host = uri.getHost();
                            int port = uri.getPort();
                            if (!TextUtils.isEmpty(host)) {
                                if (port <= 0) {
                                    port = 443;
                                }
                                Logger.debug();
                                ArrayList arrayList = (ArrayList) map.get("service_id_list");
                                if (arrayList != null) {
                                    ArrayList arrayList2 = (ArrayList) map.get("monitor_service_id_list");
                                    if (arrayList2 != null) {
                                        HashMap hashMap = new HashMap();
                                        String str3 = (String) map.get("extra");
                                        int i = 2;
                                        if (!TextUtils.isEmpty(str3)) {
                                            String[] split = str3.split("&");
                                            int length = split.length;
                                            int i2 = 0;
                                            while (i2 < length) {
                                                String str4 = split[i2];
                                                if (!TextUtils.isEmpty(str4)) {
                                                    String[] split2 = str4.split("=");
                                                    if (split2.length == i && !TextUtils.isEmpty(split2[0]) && !TextUtils.isEmpty(split2[1])) {
                                                        try {
                                                            if (split2[0].equals("ttnet_heartbeat_interval")) {
                                                                qfb.LIZLLL = CastIntegerProtector.valueOf(split2[1]).intValue() * 1000;
                                                            } else if (split2[0].equals("ttnet_timeout_millis")) {
                                                                qfb.LJ = CastIntegerProtector.valueOf(split2[1]).intValue();
                                                            } else {
                                                                hashMap.put(split2[0], split2[1]);
                                                            }
                                                        } catch (NumberFormatException unused) {
                                                        }
                                                    }
                                                }
                                                i2++;
                                                i = 2;
                                            }
                                        }
                                        Map map2 = null;
                                        try {
                                            map2 = (Map) Class.forName("com.bytedance.ttnet.clientkey.ClientKeyManager").getMethod("getClientKeyHeaders", new Class[0]).invoke(null, new Object[0]);
                                        } catch (Throwable unused2) {
                                        }
                                        try {
                                            Logger.debug();
                                            if (map2 != null && !map2.isEmpty()) {
                                                hashMap.putAll(map2);
                                            }
                                            Map map3 = (Map) map.get("custom_headers");
                                            if (map3 != null && !map3.isEmpty()) {
                                                hashMap.putAll(map3);
                                            }
                                        } catch (Throwable unused3) {
                                        }
                                        ((ConcurrentHashMap) qfb.LJFF).clear();
                                        int intValue = ((Integer) map.get("transport_mode")).intValue();
                                        if (intValue != 1) {
                                            if (intValue != 2) {
                                                qff = QFF.QUIC;
                                            } else {
                                                qff = QFF.HTTP2;
                                            }
                                        } else {
                                            qff = QFF.TLS;
                                        }
                                        QFC qfc = new QFC(((Integer) map.get("aid")).intValue(), host, Integer.toString(((Integer) map.get("app_version")).intValue()), (String) map.get("device_id"), ((Integer) map.get("fpid")).intValue(), port, (String) map.get("app_key"));
                                        qfc.LJII = qfb.LIZLLL;
                                        qfc.LJIIIIZZ = qfb.LJ;
                                        qfc.LJIIJ = qff;
                                        qfc.LJIIIZ = hashMap;
                                        qfc.LJIIL = arrayList2;
                                        qfc.LJIIJJI = new QFE(qfb.LIZ, qfb);
                                        qfb.LJI = new CronetFrontierClient(qfc);
                                        Logger.debug();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            Integer num = (Integer) it.next();
                                            qfb.LIZIZ(num.intValue());
                                            ((ConcurrentHashMap) qfb.LJFF).put(num, Boolean.FALSE);
                                        }
                                        Object obj2 = map.get("disable_fallback_websocket");
                                        if (obj2 != null) {
                                            z2 = ((Boolean) obj2).booleanValue();
                                        } else {
                                            z2 = false;
                                        }
                                        Logger.debug();
                                        if (!z2) {
                                            QFG LIZ3 = QFG.LIZ();
                                            LIZ3.getClass();
                                            try {
                                                QFD qfd = new QFD(LIZ3, qf8);
                                                ScheduledFuture<?> schedule = LIZ3.LIZ.schedule(qfd, qf8.LJLIL, TimeUnit.MILLISECONDS);
                                                LIZ3.LIZJ.put(qf8, qfd);
                                                LIZ3.LIZIZ.put(qf8, schedule);
                                            } catch (Throwable unused4) {
                                            }
                                        }
                                        qfb.LIZIZ.set(true);
                                        return;
                                    }
                                    throw new IllegalArgumentException("monitorServiceIdList can not be null.");
                                }
                                throw new IllegalArgumentException("serviceIdList can not be null.");
                            }
                            throw new IllegalArgumentException(i0.LJFF("Host is not valid: ", str));
                        }
                        throw new IllegalArgumentException("Url is not nullable.");
                    }
                    qfb.LIZIZ.set(false);
                    qfb.LIZJ(list, map);
                    return;
                }
                throw new IllegalArgumentException("configMap is empty !!!");
            }
            throw new IllegalArgumentException("urls size <= 0 !!!");
        }
    }

    public static void org_chromium_wschannel_MySelfChannelImpl_com_ss_android_ugc_aweme_notice_api_ws_WsLancet_openConnection(MySelfChannelImpl mySelfChannelImpl, Map map, List list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("6->openConnection configMap: ");
        LIZ.append(map);
        LIZ.append(",urls:");
        LIZ.append(list);
        String msg = X1D.LIZIZ(LIZ);
        C36922EeM.LIZLLL(4, "WsLancet", msg);
        o.LJIIIZ(msg, "msg");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message", msg);
            try {
                jSONObject2.put("enter_from", (String) ListProtector.get(s.LJLJJL((CharSequence) ListProtector.get(s.LJLJJL(msg, new String[]{"em="}, 0, 6), 1), new String[]{"&"}, 0, 6), 0));
            } catch (Exception e) {
                C36922EeM.LJFF(e);
            }
            C09900aA.LJI("aweme_long_connection_status", jSONObject, null, jSONObject2);
        } catch (Exception e2) {
            C36922EeM.LIZ(e2);
        }
        mySelfChannelImpl.org_chromium_wschannel_MySelfChannelImpl__openConnection$___twin___(map, list);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onServiceConnectEvent(int i, boolean z, String str) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onServiceConnectEvent(i, z, str);
        }
    }
}
