package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: X.Pds, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64920Pds {
    public static final java.util.Map<String, java.util.Map<String, Integer>> LIZ = new HashMap();

    public static int LIZJ(Throwable th) {
        int i = -1;
        if (th == null) {
            return -1;
        }
        java.util.Map<String, java.util.Map<String, Integer>> map = LIZ;
        HashMap hashMap = (HashMap) map;
        if (hashMap.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            C59895Nf1.LIZJ(101, hashMap2, " Bad Request", 102, " Connection timed out", 103, " Forbidden", 104, " Gateway Time-out");
            C59895Nf1.LIZJ(105, hashMap2, " Internal Server Error", 106, " Not Found", 107, " Request Time-out", 108, " Request-URI Too Large");
            hashMap.put(C16880lQ.LJLLJ(C64802Pby.class), hashMap2);
            HashMap hashMap3 = new HashMap();
            C59895Nf1.LIZJ(201, hashMap3, "Content-Type: text/html", 202, "http/1.0 do not support range request", 203, "response code: 403 Error extra", 204, "response code: 504 Error extra");
            hashMap.put("RequestException", hashMap3);
            HashMap hashMap4 = new HashMap();
            C59895Nf1.LIZJ(301, hashMap4, "ERR_ABORTED", 302, "ERR_ADDRESS_UNREACHABLE", 303, "ERR_CERT_AUTHORITY_INVALID", 304, "ERR_CERT_COMMON_NAME_INVALID");
            C59895Nf1.LIZJ(305, hashMap4, "ERR_CERT_DATE_INVALID", 306, "ERR_CONNECTION_ABORTED", 307, "ERR_CONNECTION_CLOSED", 308, "ERR_CONNECTION_REFUSED");
            C59895Nf1.LIZJ(309, hashMap4, "ERR_CONNECTION_RESET", 310, "ERR_CONNECTION_TIMED_OUT", 311, "ERR_EMPTY_RESPONSE", 312, "ERR_HTTP2_PING_FAILED");
            C59895Nf1.LIZJ(313, hashMap4, "ERR_INCOMPLETE_CHUNKED_ENCODING", 314, "ERR_INTERNET_DISCONNECTED", 315, "ERR_NAME_NOT_RESOLVED", 316, "ERR_NETWORK_ACCESS_DENIED");
            C59895Nf1.LIZJ(317, hashMap4, "ERR_PROXY_CONNECTION_FAILED", 318, "ERR_SOCKET_NOT_CONNECTED", 319, "ERR_SSL_BAD_RECORD_MAC_ALERT", 320, "ERR_SSL_PROTOCOL_ERROR");
            C59895Nf1.LIZJ(321, hashMap4, "ERR_TIMED_OUT", 322, "ERR_TTNET_APP_TIMED_OUT", 323, "ERR_TTNET_APP_UPLOAD_EXCEPTION", 324, "ERR_TUNNEL_CONNECTION_FAILED");
            hashMap.put("NetworkExceptionImpl", hashMap4);
            HashMap hashMap5 = new HashMap();
            hashMap5.put("ERR_NETWORK_CHANGED", 401);
            hashMap.put("QuicExceptionImpl", hashMap5);
            HashMap hashMap6 = new HashMap();
            hashMap6.put(" Unexpected end of ZLIB input stream", 501);
            hashMap.put(C16880lQ.LJLLJ(EOFException.class), hashMap6);
            HashMap hashMap7 = new HashMap();
            hashMap7.put(" unexpected end of stream on Connection", 601);
            hashMap7.put(" Unexpected request usage", 602);
            hashMap.put(C16880lQ.LJLLJ(IOException.class), hashMap7);
            HashMap hashMap8 = new HashMap();
            hashMap8.put("Cronet internal request fail", 701);
            hashMap.put(C16880lQ.LJLLJ(Exception.class), hashMap8);
            HashMap hashMap9 = new HashMap();
            hashMap9.put(" Content received is less than Content-Length", 801);
            hashMap9.put(" expected bytes but received", 802);
            hashMap9.put(" unexpected end of stream", 803);
            hashMap.put(C16880lQ.LJLLJ(ProtocolException.class), hashMap9);
            HashMap hashMap10 = new HashMap();
            hashMap10.put(" Connection closed by peer", 901);
            hashMap10.put(" Read error", 902);
            hashMap10.put(" SSL handshake aborted", 903);
            hashMap.put(C16880lQ.LJLLJ(SSLException.class), hashMap10);
            HashMap hashMap11 = new HashMap();
            hashMap11.put(" Connection closed by peer", 1001);
            hashMap11.put(" Handshake failed", 1002);
            hashMap11.put(" SSL handshake aborted", 1003);
            hashMap.put(C16880lQ.LJLLJ(SSLHandshakeException.class), hashMap11);
            HashMap hashMap12 = new HashMap();
            hashMap12.put(" Hostname not verified", 1101);
            hashMap.put(C16880lQ.LJLLJ(SSLPeerUnverifiedException.class), hashMap12);
            HashMap hashMap13 = new HashMap();
            hashMap13.put(" Read error", 1201);
            hashMap.put(C16880lQ.LJLLJ(SSLProtocolException.class), hashMap13);
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return -1;
        }
        int indexOf = message.indexOf(44);
        if (indexOf > 0) {
            message = message.substring(0, indexOf);
        }
        java.util.Map map2 = (java.util.Map) ((HashMap) map).get(C16880lQ.LJLLJ(th.getClass()));
        if (map2 != null && !map2.isEmpty()) {
            Iterator it = map2.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (message.contains((CharSequence) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (num != null && (i = num.intValue()) >= 0) {
                        return i;
                    }
                }
            }
        }
        if (th instanceof C64802Pby) {
            return 199;
        }
        if (th instanceof EOFException) {
            return 599;
        }
        if (!(th instanceof IOException)) {
            return i;
        }
        return 699;
    }

    public static boolean LIZLLL(Context context) {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI == null) {
                return false;
            }
            if (!LJJLI.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static int LIZ(Context context, Throwable th) {
        int i;
        if (th instanceof ConnectTimeoutException) {
            return 13;
        }
        if (th instanceof SocketTimeoutException) {
            i = 14;
        } else {
            if (!(th instanceof SocketException)) {
                if (th instanceof SSLPeerUnverifiedException) {
                    return 21;
                }
                if (th instanceof C64802Pby) {
                    if (((C64802Pby) th).getStatusCode() == 503) {
                        return 19;
                    }
                    return 16;
                }
                if (!(th instanceof IOException)) {
                    return 18;
                }
            }
            i = 15;
        }
        if (LIZLLL(context)) {
            return i;
        }
        return 12;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:13:0x001c, B:15:0x0033, B:17:0x0039, B:18:0x0044, B:20:0x004a, B:21:0x003f, B:24:0x0053, B:26:0x0059, B:28:0x005d, B:30:0x0074, B:32:0x007a, B:33:0x0080, B:35:0x0086, B:39:0x009f, B:42:0x00aa, B:45:0x00b5, B:48:0x00c0, B:51:0x00cb, B:54:0x008f, B:56:0x0095, B:57:0x00d5, B:63:0x0153, B:67:0x0162, B:72:0x0167, B:74:0x016f, B:77:0x0178, B:79:0x0180, B:82:0x0189, B:86:0x0195, B:90:0x01a1), top: B:8:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(java.lang.Throwable r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64920Pds.LIZIZ(java.lang.Throwable, java.lang.String[]):int");
    }
}
