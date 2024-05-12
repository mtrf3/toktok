package com.bytedance.apm.agent.instrumentation.okhttp3;

import X.AbstractC64590PWo;
import X.C09970aH;
import X.C16880lQ;
import X.C48168IvM;
import X.C64598PWw;
import X.C64606PXe;
import X.EnumC64572PVw;
import X.InterfaceC48133Iun;
import X.InterfaceC64569PVt;
import X.PNS;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class OkHttpEventListener extends AbstractC64590PWo {
    public static String sIgnoreMonitorLabel;
    public long connectStartTime;
    public long dnsStartTime;
    public boolean needToDeal = true;
    public OkHttpRecord okHttpRecord = new OkHttpRecord();
    public AbstractC64590PWo originListener;
    public long requestBodyEndTime;
    public JSONObject requestHeader;
    public long requestHeadersEndTime;
    public long requestHeadersStartTime;
    public long responseBodyStartTime;
    public JSONObject responseHeader;
    public long responseHeadersStartTime;
    public long secureConnectStartTime;
    public String url;

    private void record() {
        OkHttpRecord okHttpRecord;
        String jSONObject;
        if (!this.needToDeal || (okHttpRecord = this.okHttpRecord) == null) {
            return;
        }
        okHttpRecord.timeRequest.duration = System.currentTimeMillis() - this.okHttpRecord.timeRequest.start_time;
        try {
            JSONObject jSONObject2 = new JSONObject(this.okHttpRecord.toString());
            jSONObject2.put("timing_totalSendBytes", this.okHttpRecord.recordResponse.sent_bytes);
            jSONObject2.put("timing_totalReceivedBytes", this.okHttpRecord.recordResponse.received_bytes);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("request_log", jSONObject2);
            jSONObject3.put("net_consume_type", "okhttp");
            JSONObject jSONObject4 = this.requestHeader;
            String str = "";
            if (jSONObject4 == null) {
                jSONObject = "";
            } else {
                jSONObject = jSONObject4.toString();
            }
            jSONObject3.put("requestHeader", jSONObject);
            JSONObject jSONObject5 = this.responseHeader;
            if (jSONObject5 != null) {
                str = jSONObject5.toString();
            }
            jSONObject3.put("responseHeader", str);
            OkHttpRecord okHttpRecord2 = this.okHttpRecord;
            OkHttpRecord.TimeRequest timeRequest = okHttpRecord2.timeRequest;
            MonitorTool.monitorSLA(timeRequest.duration, timeRequest.start_time, this.url, okHttpRecord2.socketInfo.remote, "", okHttpRecord2.recordResponse.code, jSONObject3);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public OkHttpEventListener(AbstractC64590PWo abstractC64590PWo) {
        this.originListener = abstractC64590PWo;
    }

    private void dealSpecialHeader(C64598PWw c64598PWw) {
        char c;
        int i;
        int i2;
        int i3;
        for (String str : c64598PWw.LJLJJLL.LJIIJJI("server-timing")) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.okHttpRecord.headerRequest.serverTimings.add(str);
            for (String str2 : str.split(",")) {
                if (!TextUtils.isEmpty(str2) && str2.contains(";")) {
                    String[] split = str2.split(";");
                    if (split.length >= 2) {
                        String replace = split[0].replace(" ", "");
                        boolean z = true;
                        String replace2 = split[1].replace(" ", "");
                        if (!TextUtils.isEmpty(replace)) {
                            replace.getClass();
                            switch (replace.hashCode()) {
                                case -1008619738:
                                    if (replace.equals("origin")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case -138105374:
                                    if (replace.equals("cdn-cache")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 3108285:
                                    if (replace.equals("edge")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case 100355670:
                                    if (replace.equals("inner")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                            }
                            c = 65535;
                            if (c != 0) {
                                if (c != 1) {
                                    if (c != 2) {
                                        if (c == 3 && !TextUtils.isEmpty(replace2)) {
                                            String[] split2 = replace2.split("=");
                                            if (split2.length >= 2) {
                                                OkHttpRecord.DetailedDuration detailedDuration = this.okHttpRecord.timeDetailedDuration;
                                                if (!TextUtils.isEmpty(split2[1])) {
                                                    i3 = CastIntegerProtector.parseInt(split2[1]);
                                                } else {
                                                    i3 = 0;
                                                }
                                                detailedDuration.inner = i3;
                                            }
                                        }
                                    } else if (!TextUtils.isEmpty(replace2)) {
                                        String[] split3 = replace2.split("=");
                                        if (split3.length >= 2) {
                                            OkHttpRecord.DetailedDuration detailedDuration2 = this.okHttpRecord.timeDetailedDuration;
                                            if (!TextUtils.isEmpty(split3[1])) {
                                                i2 = CastIntegerProtector.parseInt(split3[1]);
                                            } else {
                                                i2 = 0;
                                            }
                                            detailedDuration2.edge = i2;
                                        }
                                    }
                                } else if (!TextUtils.isEmpty(replace2)) {
                                    String[] split4 = replace2.split("=");
                                    if (split4.length >= 2) {
                                        OkHttpRecord.DetailedDuration detailedDuration3 = this.okHttpRecord.timeDetailedDuration;
                                        if (TextUtils.isEmpty(split4[1]) || !split4[1].equalsIgnoreCase("hit")) {
                                            z = false;
                                        }
                                        detailedDuration3.cdn_hit_cache = z;
                                    }
                                }
                            } else if (!TextUtils.isEmpty(replace2)) {
                                String[] split5 = replace2.split("=");
                                if (split5.length >= 2) {
                                    OkHttpRecord.DetailedDuration detailedDuration4 = this.okHttpRecord.timeDetailedDuration;
                                    if (!TextUtils.isEmpty(split5[1])) {
                                        i = CastIntegerProtector.parseInt(split5[1]);
                                    } else {
                                        i = 0;
                                    }
                                    detailedDuration4.origin = i;
                                }
                            }
                        }
                    }
                }
            }
        }
        OkHttpRecord.DetailedDuration detailedDuration5 = this.okHttpRecord.timeDetailedDuration;
        int i4 = detailedDuration5.ttfb - detailedDuration5.edge;
        int i5 = detailedDuration5.origin;
        int i6 = i4 - i5;
        if (i6 > 0) {
            detailedDuration5.rtt = i6;
        }
        int i7 = i5 - detailedDuration5.inner;
        if (i7 > 0) {
            detailedDuration5.origin = i7;
        }
    }

    private JSONObject getHeaders(C64606PXe c64606PXe) {
        JSONObject jSONObject = new JSONObject();
        if (c64606PXe != null) {
            try {
                for (String str : c64606PXe.LJFF()) {
                    try {
                        jSONObject.put(str, c64606PXe.LIZLLL(str));
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        return jSONObject;
    }

    public static void setIgnoreMonitorLabel(String str) {
        sIgnoreMonitorLabel = str;
    }

    @Override // X.AbstractC64590PWo
    public void callEnd(InterfaceC48133Iun interfaceC48133Iun) {
        super.callEnd(interfaceC48133Iun);
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.callEnd(interfaceC48133Iun);
        }
        record();
    }

    @Override // X.AbstractC64590PWo
    public void callStart(InterfaceC48133Iun interfaceC48133Iun) {
        super.callStart(interfaceC48133Iun);
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.callStart(interfaceC48133Iun);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeRequest.start_time = System.currentTimeMillis();
        }
    }

    @Override // X.AbstractC64590PWo
    public void requestBodyStart(InterfaceC48133Iun interfaceC48133Iun) {
        super.requestBodyStart(interfaceC48133Iun);
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.requestBodyStart(interfaceC48133Iun);
        }
    }

    @Override // X.AbstractC64590PWo
    public void requestHeadersStart(InterfaceC48133Iun interfaceC48133Iun) {
        super.requestHeadersStart(interfaceC48133Iun);
        if (this.needToDeal) {
            long currentTimeMillis = System.currentTimeMillis();
            this.requestHeadersStartTime = currentTimeMillis;
            this.okHttpRecord.timeRequest.request_sent_time = currentTimeMillis;
        }
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.requestHeadersStart(interfaceC48133Iun);
        }
    }

    @Override // X.AbstractC64590PWo
    public void responseBodyStart(InterfaceC48133Iun interfaceC48133Iun) {
        super.responseBodyStart(interfaceC48133Iun);
        if (this.needToDeal) {
            this.responseBodyStartTime = System.currentTimeMillis();
        }
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.responseBodyStart(interfaceC48133Iun);
        }
    }

    @Override // X.AbstractC64590PWo
    public void responseHeadersStart(InterfaceC48133Iun interfaceC48133Iun) {
        long currentTimeMillis;
        long j;
        super.responseHeadersStart(interfaceC48133Iun);
        if (this.needToDeal) {
            this.responseHeadersStartTime = System.currentTimeMillis();
            if (this.requestBodyEndTime != 0) {
                currentTimeMillis = System.currentTimeMillis();
                j = this.requestBodyEndTime;
            } else {
                currentTimeMillis = System.currentTimeMillis();
                j = this.requestHeadersEndTime;
            }
            OkHttpRecord okHttpRecord = this.okHttpRecord;
            okHttpRecord.timeDetailedDuration.ttfb = (int) (currentTimeMillis - j);
            okHttpRecord.timeRequest.response_recv_time = System.currentTimeMillis();
        }
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.responseHeadersStart(interfaceC48133Iun);
        }
    }

    @Override // X.AbstractC64590PWo
    public void secureConnectStart(InterfaceC48133Iun interfaceC48133Iun) {
        super.secureConnectStart(interfaceC48133Iun);
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.tcp = (int) (System.currentTimeMillis() - this.connectStartTime);
            this.secureConnectStartTime = System.currentTimeMillis();
        }
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.secureConnectStart(interfaceC48133Iun);
        }
    }

    @Override // X.AbstractC64590PWo
    public void callFailed(InterfaceC48133Iun interfaceC48133Iun, IOException iOException) {
        super.callFailed(interfaceC48133Iun, iOException);
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.callFailed(interfaceC48133Iun, iOException);
        }
        record();
    }

    @Override // X.AbstractC64590PWo
    public void connectionAcquired(InterfaceC48133Iun interfaceC48133Iun, InterfaceC64569PVt interfaceC64569PVt) {
        super.connectionAcquired(interfaceC48133Iun, interfaceC64569PVt);
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.connectionAcquired(interfaceC48133Iun, interfaceC64569PVt);
        }
        if (this.needToDeal) {
            if (this.dnsStartTime == 0) {
                this.okHttpRecord.socketInfo.socketReused = true;
            } else {
                this.okHttpRecord.socketInfo.socketReused = false;
            }
        }
    }

    @Override // X.AbstractC64590PWo
    public void connectionReleased(InterfaceC48133Iun interfaceC48133Iun, InterfaceC64569PVt interfaceC64569PVt) {
        super.connectionReleased(interfaceC48133Iun, interfaceC64569PVt);
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.connectionReleased(interfaceC48133Iun, interfaceC64569PVt);
        }
    }

    @Override // X.AbstractC64590PWo
    public void dnsStart(InterfaceC48133Iun interfaceC48133Iun, String str) {
        super.dnsStart(interfaceC48133Iun, str);
        if (this.needToDeal) {
            this.dnsStartTime = System.currentTimeMillis();
        }
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.dnsStart(interfaceC48133Iun, str);
        }
    }

    @Override // X.AbstractC64590PWo
    public void requestBodyEnd(InterfaceC48133Iun interfaceC48133Iun, long j) {
        super.requestBodyEnd(interfaceC48133Iun, j);
        if (this.needToDeal) {
            this.requestBodyEndTime = System.currentTimeMillis();
            this.okHttpRecord.timeDetailedDuration.send = (int) (System.currentTimeMillis() - this.requestHeadersStartTime);
        }
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.requestBodyEnd(interfaceC48133Iun, j);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.sent_bytes += j;
        }
    }

    @Override // X.AbstractC64590PWo
    public void requestHeadersEnd(InterfaceC48133Iun interfaceC48133Iun, Request request) {
        super.requestHeadersEnd(interfaceC48133Iun, request);
        if (this.needToDeal) {
            this.requestHeadersEndTime = System.currentTimeMillis();
            this.okHttpRecord.timeDetailedDuration.send = (int) (System.currentTimeMillis() - this.requestHeadersStartTime);
        }
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.requestHeadersEnd(interfaceC48133Iun, request);
        }
        String header = request.header("User-Agent");
        String str = sIgnoreMonitorLabel;
        if (str != null && header != null && header.contains(str)) {
            this.needToDeal = false;
        }
        if (this.needToDeal) {
            OkHttpRecord.RecordResponse recordResponse = this.okHttpRecord.recordResponse;
            recordResponse.sent_bytes = request.headers().LIZ() + recordResponse.sent_bytes;
            this.url = request.url().LJIIIIZZ;
            this.requestHeader = getHeaders(request.headers());
        }
    }

    @Override // X.AbstractC64590PWo
    public void responseBodyEnd(InterfaceC48133Iun interfaceC48133Iun, long j) {
        super.responseBodyEnd(interfaceC48133Iun, j);
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.responseBodyEnd(interfaceC48133Iun, j);
        }
        if (this.needToDeal) {
            OkHttpRecord okHttpRecord = this.okHttpRecord;
            okHttpRecord.recordResponse.received_bytes += j;
            okHttpRecord.timeDetailedDuration.body_recv = (int) (System.currentTimeMillis() - this.responseBodyStartTime);
        }
    }

    @Override // X.AbstractC64590PWo
    public void responseHeadersEnd(InterfaceC48133Iun interfaceC48133Iun, C64598PWw c64598PWw) {
        super.responseHeadersEnd(interfaceC48133Iun, c64598PWw);
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.responseHeadersEnd(interfaceC48133Iun, c64598PWw);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.header_recv = (int) (System.currentTimeMillis() - this.responseHeadersStartTime);
            OkHttpRecord.RecordResponse recordResponse = this.okHttpRecord.recordResponse;
            recordResponse.code = c64598PWw.LJLJI;
            recordResponse.received_bytes = c64598PWw.LJLJJLL.LIZ() + recordResponse.received_bytes;
            this.okHttpRecord.recordResponse.network_accessed = C48168IvM.LIZ(C09970aH.LIZ);
            this.okHttpRecord.headerRequest.x_tt_trace_id = c64598PWw.LIZ("x-tt-trace-id", "");
            this.okHttpRecord.headerRequest.x_tt_trace_host = c64598PWw.LIZ("x-tt-trace-host", "");
            this.okHttpRecord.headerRequest.x_tt_trace_tag = c64598PWw.LIZ("x-tt-trace-tag", "");
            this.okHttpRecord.headerRequest.x_tt_content_encoding = c64598PWw.LIZ("x-tt-content-encoding", "");
            try {
                dealSpecialHeader(c64598PWw);
            } catch (Exception unused) {
            }
            this.responseHeader = getHeaders(c64598PWw.LJLJJLL);
        }
    }

    @Override // X.AbstractC64590PWo
    public void secureConnectEnd(InterfaceC48133Iun interfaceC48133Iun, PNS pns) {
        super.secureConnectEnd(interfaceC48133Iun, pns);
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.ssl = (int) (System.currentTimeMillis() - this.secureConnectStartTime);
        }
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.secureConnectEnd(interfaceC48133Iun, pns);
        }
    }

    @Override // X.AbstractC64590PWo
    public void connectStart(InterfaceC48133Iun interfaceC48133Iun, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(interfaceC48133Iun, inetSocketAddress, proxy);
        if (this.needToDeal) {
            this.connectStartTime = System.currentTimeMillis();
        }
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.connectStart(interfaceC48133Iun, inetSocketAddress, proxy);
        }
    }

    @Override // X.AbstractC64590PWo
    public void dnsEnd(InterfaceC48133Iun interfaceC48133Iun, String str, List<InetAddress> list) {
        super.dnsEnd(interfaceC48133Iun, str, list);
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.dnsEnd(interfaceC48133Iun, str, list);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.dns = (int) (System.currentTimeMillis() - this.dnsStartTime);
            if (list != null && list.size() > 0) {
                for (InetAddress inetAddress : list) {
                    OkHttpRecord.DnsInfo dnsInfo = new OkHttpRecord.DnsInfo();
                    dnsInfo.address = inetAddress.getHostAddress();
                    this.okHttpRecord.addressList.add(dnsInfo);
                }
            }
        }
    }

    @Override // X.AbstractC64590PWo
    public void connectEnd(InterfaceC48133Iun interfaceC48133Iun, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC64572PVw enumC64572PVw) {
        boolean z;
        super.connectEnd(interfaceC48133Iun, inetSocketAddress, proxy, enumC64572PVw);
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.connectEnd(interfaceC48133Iun, inetSocketAddress, proxy, enumC64572PVw);
        }
        if (this.needToDeal) {
            OkHttpRecord.RecordResponse recordResponse = this.okHttpRecord.recordResponse;
            if (proxy.address() != null) {
                z = true;
            } else {
                z = false;
            }
            recordResponse.via_Proxy = z;
            if (inetSocketAddress != null && inetSocketAddress.getAddress() != null) {
                OkHttpRecord.SocketInfo socketInfo = this.okHttpRecord.socketInfo;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(inetSocketAddress.getAddress().getHostAddress());
                LIZ.append(":");
                LIZ.append(inetSocketAddress.getPort());
                socketInfo.remote = X1D.LIZIZ(LIZ);
                this.okHttpRecord.socketInfo.host = inetSocketAddress.getAddress().getHostAddress();
                OkHttpRecord.SocketInfo socketInfo2 = this.okHttpRecord.socketInfo;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(inetSocketAddress.getPort());
                LIZ2.append("");
                socketInfo2.port = X1D.LIZIZ(LIZ2);
            }
        }
    }

    @Override // X.AbstractC64590PWo
    public void connectFailed(InterfaceC48133Iun interfaceC48133Iun, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC64572PVw enumC64572PVw, IOException iOException) {
        super.connectFailed(interfaceC48133Iun, inetSocketAddress, proxy, enumC64572PVw, iOException);
        AbstractC64590PWo abstractC64590PWo = this.originListener;
        if (abstractC64590PWo != null) {
            abstractC64590PWo.connectFailed(interfaceC48133Iun, inetSocketAddress, proxy, enumC64572PVw, iOException);
        }
    }
}
