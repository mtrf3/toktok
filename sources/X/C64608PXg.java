package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3DnsParserInterceptor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import ee1.l;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PXg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64608PXg {
    public EnumC64000P9w LJIJJ;
    public PVG LJIJJLI;
    public C64606PXe LJJ;
    public Socket LJJIIZ;
    public C64606PXe LJJIIZI;
    public C64697PaH LJJJJJL;
    public long LIZ = -1;
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public long LJIIJJI = -1;
    public long LJIIL = -1;
    public long LJIILIIL = -1;
    public final AtomicLong LJIILJJIL = new AtomicLong(-1);
    public long LJIILL = -1;
    public long LJIILLIIL = -1;
    public final List<Pair<InetSocketAddress, Integer>> LJIIZILJ = new ArrayList();
    public Proxy.Type LJIJ = Proxy.Type.DIRECT;
    public EnumC35618DyQ LJIJI = EnumC35618DyQ.HANDSHAKE_UNKNOWN;
    public long LJIL = 0;
    public int LJJI = -1;
    public long LJJIFFI = 0;
    public EnumC64572PVw LJJII = null;
    public boolean LJJIII = false;
    public boolean LJJIIJ = false;
    public String LJJIIJZLJL = "";
    public String LJJIJ = "";
    public int LJJIJIIJI = 0;
    public final List<PXA> LJJIJIIJIL = new ArrayList();
    public PX3 LJJIJIL = PX3.IDLE;
    public String LJJIJL = "";
    public int LJJIJLIJ = -1;
    public PX4 LJJIL = PX4.UNKNOWN;
    public String LJJIZ = "";
    public boolean LJJJ = false;
    public boolean LJJJI = false;
    public final List<C64614PXm> LJJJIL = new ArrayList();
    public int LJJJJ = 0;
    public EnumC64610PXi LJJJJI = EnumC64610PXi.UNKNOWN;
    public final CopyOnWriteArrayList<String> LJJJJIZL = new CopyOnWriteArrayList<>();
    public String LJJJJJ = "";

    public static long LJIIIZ(long j, long j2) {
        if (j2 == -1 || j == -1) {
            return -1L;
        }
        return j - j2;
    }

    public static boolean LIZ() {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int LJ(IOException iOException) {
        if (iOException instanceof SSLHandshakeException) {
            return -148;
        }
        if (iOException instanceof SSLKeyException) {
            return -149;
        }
        if (iOException instanceof SSLProtocolException) {
            return -107;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -153;
        }
        if (iOException instanceof UnknownHostException) {
            return -105;
        }
        if (iOException instanceof ConnectException) {
            return LIZJ(iOException, -104);
        }
        if (iOException instanceof PortUnreachableException) {
            return -108;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -109;
        }
        if (iOException instanceof BindException) {
            return -147;
        }
        if (iOException instanceof SocketException) {
            return LIZJ(iOException, -15);
        }
        if (iOException instanceof MalformedURLException) {
            return -300;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -118;
        }
        if (iOException instanceof ProtocolException) {
            return -901;
        }
        if (iOException instanceof HttpRetryException) {
            String message = iOException.getMessage();
            if (!TextUtils.isEmpty(message) && message.contains("Too many follow-up requests")) {
                return -310;
            }
            return -196;
        }
        if (iOException instanceof UnknownServiceException) {
            return -902;
        }
        return -1;
    }

    public static EnumC64611PXj LJII(EnumC64572PVw enumC64572PVw) {
        if (enumC64572PVw == null) {
            return EnumC64611PXj.CONNECTION_INFO_UNKNOWN;
        }
        int i = C64609PXh.LIZIZ[enumC64572PVw.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return EnumC64611PXj.CONNECTION_INFO_UNKNOWN;
                        }
                        return EnumC64611PXj.CONNECTION_INFO_QUIC_UNKNOWN_VERSION;
                    }
                    return EnumC64611PXj.CONNECTION_INFO_DEPRECATED_SPDY3;
                }
                return EnumC64611PXj.CONNECTION_INFO_HTTP2;
            }
            return EnumC64611PXj.CONNECTION_INFO_HTTP1_1;
        }
        return EnumC64611PXj.CONNECTION_INFO_HTTP1_0;
    }

    public static long LJIIIIZZ(String str) {
        String[] split = str.split("=");
        if (split.length != 2) {
            return -1L;
        }
        try {
            long parseLong = CastLongProtector.parseLong(split[1]);
            if (parseLong < 0) {
                return -1L;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final String LIZIZ(Context context) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        String str;
        boolean z3;
        Object LIZJ;
        InetAddress inetAddress;
        boolean z4;
        android.net.Uri parse;
        android.net.Uri parse2;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String str2 = l.LJ().LJIIJJI;
            if (!TextUtils.isEmpty(str2)) {
                String[] split = str2.split(",");
                JSONArray jSONArray = new JSONArray();
                for (String str3 : split) {
                    if (!TextUtils.isEmpty(str3)) {
                        jSONArray.put(str3);
                    }
                }
                jSONObject2.put("hit", jSONArray);
            }
            jSONObject.put("ab_test", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("load_state", this.LJJIJIL.ordinal());
            jSONObject3.put("method", this.LJJIJL);
            if (this.LJJIL == PX4.IO_PENDING) {
                z = true;
            } else {
                z = false;
            }
            jSONObject3.put("is_pending", z);
            jSONObject3.put("status", this.LJJIL);
            if (this.LJJIL != PX4.SUCCESS) {
                jSONObject3.put("net_error", this.LJJIJLIJ);
            }
            if (!TextUtils.isEmpty(this.LJJIZ) && (parse2 = UriProtector.parse(this.LJJIZ)) != null && !TextUtils.isEmpty(parse2.getScheme()) && !TextUtils.isEmpty(parse2.getHost()) && parse2.getPath() != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(parse2.getScheme());
                LIZ.append("://");
                LIZ.append(parse2.getHost());
                LIZ.append(parse2.getPath());
                jSONObject3.put("origin_url", X1D.LIZIZ(LIZ));
            }
            jSONObject3.put("redirect_times", this.LJJIJIIJI);
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            Iterator it = ((ArrayList) this.LJJIJIIJIL).iterator();
            while (it.hasNext()) {
                PXA pxa = (PXA) it.next();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("code", pxa.LIZ);
                jSONObject4.put("method", pxa.LIZIZ);
                jSONObject4.put("internal", pxa.LIZLLL);
                String str4 = pxa.LIZJ;
                if (str4 != null && (parse = UriProtector.parse(str4)) != null && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getHost())) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(parse.getScheme());
                    LIZ2.append("://");
                    LIZ2.append(parse.getHost());
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    jSONArray3.put(LIZIZ);
                    if (parse.getPath() != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(LIZIZ);
                        LIZ3.append(parse.getPath());
                        LIZIZ = X1D.LIZIZ(LIZ3);
                    }
                    jSONObject4.put("url", LIZIZ);
                }
                jSONArray2.put(jSONObject4);
            }
            jSONObject3.put("redirect_info", jSONArray2);
            jSONObject3.put("redirecting_list", jSONArray3);
            jSONObject3.put("dispatched", this.LJJJ);
            jSONObject.put("base", jSONObject3);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("code", this.LJJI);
            jSONObject5.put("connection_info", LJII(this.LJJII).LJLIL);
            C64606PXe c64606PXe = this.LJJ;
            if (c64606PXe != null) {
                j = c64606PXe.LIZ();
            } else {
                j = 0;
            }
            jSONObject5.put("sent_bytes", this.LJIL + j);
            C64606PXe c64606PXe2 = this.LJJIIZI;
            if (c64606PXe2 != null) {
                j2 = c64606PXe2.LIZ();
            } else {
                j2 = 0;
            }
            jSONObject5.put("received_bytes", this.LJJIFFI + j2);
            jSONObject5.put("cached", this.LJJIII);
            jSONObject5.put("network_accessed", this.LJJIIJ);
            if (this.LJIJ != Proxy.Type.DIRECT) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject5.put("via_proxy", z2);
            jSONObject.put("response", jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            if (this.LJJIIZI == null) {
                str = "";
            } else {
                for (int i = 0; i < this.LJJIIZI.LJIIIIZZ(); i++) {
                    String LJ = this.LJJIIZI.LJ(i);
                    String LJIIJ = this.LJJIIZI.LJIIJ(i);
                    if (!TextUtils.isEmpty(LJ)) {
                        String lowerCase = LJ.toLowerCase();
                        if (!TextUtils.isEmpty(lowerCase) && lowerCase.startsWith("x-tt-") && !TextUtils.isEmpty(LJIIJ)) {
                            jSONObject6.put(LJ, LJIIJ);
                        }
                    }
                }
                String LIZLLL = this.LJJIIZI.LIZLLL("tt-idc-switch");
                if (!TextUtils.isEmpty(LIZLLL)) {
                    jSONObject6.put("tt-idc-switch", LIZLLL);
                }
                str = this.LJJIIZI.LIZLLL("server-timing");
                if (!TextUtils.isEmpty(str)) {
                    jSONObject6.put("server-timing", str);
                }
                jSONObject.put("header", jSONObject6);
            }
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("libcore", "okhttp");
            jSONObject7.put("core_ver", C64667PZn.LJFF());
            jSONObject7.put("is_main_process", C36841Ed3.LIZJ(context));
            jSONObject7.put("ttnet_version", "4.2.152.11-tiktok");
            jSONObject7.put("retry_attempts", -1);
            jSONObject.put("other", jSONObject7);
            JSONObject jSONObject8 = new JSONObject();
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("dns", LJIIIZ(this.LIZJ, this.LIZIZ));
            jSONObject9.put("tcp", LJIIIZ(this.LJ, this.LIZLLL));
            jSONObject9.put("ssl", LJIIIZ(this.LJFF, this.LJ));
            jSONObject9.put("send", LJIIIZ(this.LJII, this.LJI) + LJIIIZ(this.LJIIIZ, this.LJIIIIZZ));
            long LJIIIZ = LJIIIZ(this.LJIIJJI, this.LJII);
            jSONObject9.put("ttfb", LJIIIZ);
            jSONObject9.put("header_recv", LJIIIZ(this.LJIIJJI, this.LJIIJ));
            jSONObject9.put("body_recv", LJIIIZ(this.LJIILIIL, this.LJIIL));
            jSONObject9.put("dispatch", this.LJIILLIIL);
            LJFF(str, LJIIIZ, jSONObject9);
            jSONObject8.put("detailed_duration", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("start_time", this.LIZ);
            jSONObject10.put("duration", LJIIIZ(this.LJIILJJIL.get(), this.LIZ));
            jSONObject10.put("request_sent_time", this.LJI);
            jSONObject10.put("response_recv_time", this.LJIIJ);
            jSONObject8.put("request", jSONObject10);
            jSONObject.put("timing", jSONObject8);
            JSONObject jSONObject11 = new JSONObject();
            Socket socket = this.LJJIIZ;
            if (socket != null && (inetAddress = socket.getInetAddress()) != null) {
                EnumC35452Dvk enumC35452Dvk = EnumC35452Dvk.ADDRESS_FAMILY_UNSPECIFIED;
                if (inetAddress instanceof Inet4Address) {
                    enumC35452Dvk = EnumC35452Dvk.ADDRESS_FAMILY_IPV4;
                } else if (inetAddress instanceof Inet6Address) {
                    enumC35452Dvk = EnumC35452Dvk.ADDRESS_FAMILY_IPV6;
                }
                jSONObject11.put("address_family", enumC35452Dvk.ordinal());
                if (this.LIZLLL == -1 && this.LJIILL != -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                jSONObject11.put("socket_reused", z4);
                if (inetAddress.getHostAddress() != null) {
                    jSONObject11.put("remote", inetAddress.getHostAddress());
                }
            }
            JSONArray jSONArray4 = new JSONArray();
            Iterator it2 = ((ArrayList) this.LJIIZILJ).iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put("address", ((InetSocketAddress) pair.first).toString().substring(1));
                jSONObject12.put("result", pair.second);
                jSONArray4.put(jSONObject12);
            }
            jSONObject11.put("connection_attempts", jSONArray4);
            jSONObject.put("socket", jSONObject11);
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("handshake_type", this.LJIJI.ordinal());
            jSONObject13.put("cipher_suite", this.LJIJJLI);
            jSONObject13.put("ssl_version", this.LJIJJ);
            jSONObject.put("ssl", jSONObject13);
            JSONObject jSONObject14 = new JSONObject();
            JSONArray jSONArray5 = new JSONArray();
            if (!this.LJJJI) {
                List<C64614PXm> list = this.LJJJIL;
                if (list != null) {
                    Iterator it3 = ((ArrayList) list).iterator();
                    while (it3.hasNext()) {
                        C64614PXm c64614PXm = (C64614PXm) it3.next();
                        JSONObject jSONObject15 = new JSONObject();
                        if (c64614PXm.LIZLLL) {
                            jSONObject15.put("priority", c64614PXm.LIZJ);
                            jSONObject15.put("type", c64614PXm.LJ);
                            jSONObject15.put("action_hit", c64614PXm.LIZLLL);
                            if (!TextUtils.isEmpty(c64614PXm.LJI)) {
                                android.net.Uri parse3 = UriProtector.parse(c64614PXm.LJI);
                                if (parse3.getHost() != null) {
                                    jSONObject15.put("replace_host", parse3.getHost());
                                }
                            } else {
                                jSONObject15.put("replace_host", "");
                            }
                            jSONObject15.put("feedback", c64614PXm.LJFF);
                            long j3 = c64614PXm.LIZIZ;
                            if (j3 > 0) {
                                jSONObject15.put("rule_id", j3);
                            }
                            if (!TextUtils.isEmpty(c64614PXm.LIZ)) {
                                jSONObject15.put("service_name", c64614PXm.LIZ);
                            }
                            jSONArray5.put(jSONObject15);
                        }
                    }
                }
                jSONObject14.put("action_info", jSONArray5);
                jSONObject14.put("empty_action", ((ArrayList) l.LJ().LIZLLL).isEmpty());
                jSONObject14.put("host_replace_map", 0);
            } else {
                jSONObject14.put("host_replace_map", 1);
                jSONObject14.put("host_replace_map_size", this.LJJJJ);
            }
            jSONObject14.put("source", l.LJ().LIZIZ());
            jSONObject14.put("update_time", l.LJ().LIZJ());
            jSONObject14.put("epoch", l.LJ().LIZJ.get());
            jSONObject.put("url_dispatch", jSONObject14);
            if (!TextUtils.isEmpty(l.LJ().LJIIJ)) {
                jSONObject.put("tt_tnc_etag", l.LJ().LJIIJ);
            }
            JSONObject jSONObject16 = new JSONObject();
            JSONArray jSONArray6 = new JSONArray();
            Iterator<String> it4 = this.LJJJJIZL.iterator();
            while (it4.hasNext()) {
                jSONArray6.put(it4.next());
            }
            jSONObject16.put("address_list", jSONArray6);
            jSONObject16.put("httpdns_prefer", C64811Pc7.LJ().LJLILLLLZI);
            EnumC64612PXk enumC64612PXk = EnumC64612PXk.NOT_SET;
            EnumC46459ILf enumC46459ILf = EnumC46459ILf.UNKNOWN;
            switch (C64609PXh.LIZ[this.LJJJJI.ordinal()]) {
                case 1:
                    enumC64612PXk = EnumC64612PXk.SERVE_FROM_CACHE;
                    enumC46459ILf = EnumC46459ILf.SOURCE_HTTPDNS;
                    z3 = false;
                    break;
                case 2:
                    enumC64612PXk = EnumC64612PXk.SERVE_FROM_CACHE;
                    enumC46459ILf = EnumC46459ILf.SOURCE_PROC;
                    z3 = false;
                    break;
                case 3:
                    enumC64612PXk = EnumC64612PXk.SERVE_FROM_HTTP_DNS_JOB;
                    z3 = false;
                    break;
                case 4:
                    enumC64612PXk = EnumC64612PXk.SERVE_FROM_PROC_DNS_JOB;
                    z3 = false;
                    break;
                case 5:
                    enumC64612PXk = EnumC64612PXk.SERVE_FROM_CACHE;
                    enumC46459ILf = EnumC46459ILf.SOURCE_HTTPDNS;
                    z3 = true;
                    break;
                case 6:
                    enumC64612PXk = EnumC64612PXk.SERVE_FROM_HARDCODE_HOSTS;
                    z3 = false;
                    break;
                default:
                    z3 = false;
                    break;
            }
            jSONObject16.put("source", enumC64612PXk.LJLIL);
            jSONObject16.put("cache_source", enumC46459ILf.LJLIL);
            jSONObject16.put("from_stale_cache", z3);
            jSONObject.put("dns", jSONObject16);
            OkHttp3DnsParserInterceptor.LIZJ().LIZLLL(this.LJJJJJ, this);
            JSONObject jSONObject17 = new JSONObject();
            C64697PaH c64697PaH = this.LJJJJJL;
            if (c64697PaH != null) {
                long j4 = c64697PaH.LJIIIIZZ;
                if (j4 > 0) {
                    jSONObject17.put("protect", j4);
                }
                long j5 = this.LJJJJJL.LJFF;
                if (j5 > 0) {
                    jSONObject17.put("connect", j5);
                }
                long j6 = this.LJJJJJL.LIZLLL;
                if (j6 > 0) {
                    jSONObject17.put("read", j6);
                }
                long j7 = this.LJJJJJL.LJ;
                if (j7 > 0) {
                    jSONObject17.put("write", j7);
                }
            }
            jSONObject.put("socket_timeout_param", jSONObject17);
            JSONObject jSONObject18 = new JSONObject();
            jSONObject18.put("ipv4_reachable", LIZ());
            jSONObject18.put("ipv6_reachable", C64616PXo.LIZ().get());
            jSONObject.put("ifconfig", jSONObject18);
            if (C64667PZn.LJ() != null && (LIZJ = C64667PZn.LJ().LIZJ()) != null) {
                jSONObject.put("tnc", LIZJ);
            }
            if (C64704PaO.LJFF().LJ() != null) {
                jSONObject.put("store_idc", C64704PaO.LJFF().LJ());
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject.toString();
    }

    public static int LIZJ(IOException iOException, int i) {
        if (iOException == null) {
            return i;
        }
        try {
            int LIZLLL = LIZLLL(i, iOException.getMessage());
            if (LIZLLL != i) {
                return LIZLLL;
            }
            try {
                Throwable cause = iOException.getCause();
                if (cause == null) {
                    return LIZLLL;
                }
                String message = cause.getMessage();
                if (TextUtils.isEmpty(message)) {
                    return LIZLLL;
                }
                return LIZLLL(i, message);
            } catch (Throwable unused) {
                return LIZLLL;
            }
        } catch (Throwable unused2) {
            return i;
        }
    }

    public static int LIZLLL(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.contains("ECONNRESET") || str.contains("Connection reset") || str.contains("reset by peer")) {
            return -101;
        }
        if (str.contains("ECONNREFUSED")) {
            return -102;
        }
        if (str.contains("CONNECTION_ABORTED") || str.contains("connection abort")) {
            return -103;
        }
        if (str.contains("ENETDOWN") || str.contains("Network is unreachable")) {
            return -106;
        }
        if (str.contains("EHOSTUNREACH") || str.contains("ENETUNREACH")) {
            return -109;
        }
        if (str.contains("EADDRNOTAVAIL")) {
            return -108;
        }
        if (!str.contains("EADDRINUSE")) {
            return i;
        }
        return -147;
    }

    public static void LJFF(String str, long j, JSONObject jSONObject) {
        String[] split;
        HashMap hashMap = new HashMap();
        C64613PXl c64613PXl = new C64613PXl();
        if (!TextUtils.isEmpty(str) && (split = str.split(",")) != null) {
            for (String str2 : split) {
                String[] split2 = str2.split(";");
                if (split2 != null && split2.length == 2 && !TextUtils.isEmpty(split2[0]) && !TextUtils.isEmpty(split2[1])) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String trim = ((String) entry.getKey()).trim();
            String trim2 = ((String) entry.getValue()).trim();
            if (trim.equalsIgnoreCase("cdn-cache")) {
                c64613PXl.LIZ = true;
                String[] split3 = trim2.split("=");
                if (split3.length == 2 && split3[1].equalsIgnoreCase("hit")) {
                    c64613PXl.LIZIZ = true;
                } else {
                    c64613PXl.LIZIZ = false;
                }
            } else if (trim.equalsIgnoreCase("edge")) {
                c64613PXl.LIZJ = LJIIIIZZ(trim2);
            } else if (trim.equalsIgnoreCase("origin")) {
                c64613PXl.LIZLLL = LJIIIIZZ(trim2);
            } else if (trim.equalsIgnoreCase("inner")) {
                c64613PXl.LJ = LJIIIIZZ(trim2);
            } else if (!TextUtils.isEmpty(trim)) {
                jSONObject.put(trim, LJIIIIZZ(trim2));
            }
        }
        if (c64613PXl.LIZ) {
            if (c64613PXl.LIZIZ) {
                jSONObject.put("edge", c64613PXl.LIZJ);
                jSONObject.put("cdn-cache", "hit");
                if (j != -1) {
                    long j2 = c64613PXl.LIZJ;
                    if (j > j2) {
                        c64613PXl.LJFF = j - j2;
                    }
                }
                jSONObject.put("rtt", c64613PXl.LJFF);
                return;
            }
            jSONObject.put("edge", c64613PXl.LIZJ);
            jSONObject.put("cdn-cache", "miss");
            long j3 = c64613PXl.LIZLLL;
            long j4 = c64613PXl.LJ;
            if (j3 > j4) {
                jSONObject.put("origin", j3 - j4);
            } else {
                jSONObject.put("origin", -1);
            }
            jSONObject.put("inner", c64613PXl.LJ);
            if (j != -1) {
                long j5 = c64613PXl.LIZLLL;
                long j6 = c64613PXl.LIZJ;
                if (j > j5 + j6) {
                    c64613PXl.LJFF = (j - j5) - j6;
                }
            }
            jSONObject.put("rtt", c64613PXl.LJFF);
            return;
        }
        jSONObject.put("inner", c64613PXl.LJ);
        if (j != -1) {
            long j7 = c64613PXl.LJ;
            if (j > j7) {
                c64613PXl.LJFF = j - j7;
            }
        }
        jSONObject.put("rtt", c64613PXl.LJFF);
    }

    public final void LJI(String str, String str2, long j, boolean z, List<C64614PXm> list) {
        PXA pxa = new PXA();
        pxa.LIZ = 307;
        pxa.LIZLLL = true;
        pxa.LIZIZ = str;
        pxa.LIZJ = str2;
        ((ArrayList) this.LJJIJIIJIL).add(pxa);
        this.LJJIJIIJI++;
        this.LJIILLIIL = j;
        this.LJJJ = true;
        if (z) {
            this.LJJJI = true;
            this.LJJJJ = ((ConcurrentHashMap) l.LJ().LJIIIZ).size();
        } else {
            ((ArrayList) this.LJJJIL).addAll(list);
            this.LJJJI = false;
        }
    }
}
