package X;

import android.text.TextUtils;
import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;
import com.ttnet.org.chromium.net.impl.o0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;

/* renamed from: X.Pdt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64921Pdt {
    public static final java.util.Map<String, java.util.Map<String, Integer>> LIZ = new HashMap();

    public static int LIZ(Throwable th) {
        HashMap hashMap = (HashMap) LIZ;
        if (hashMap.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            C59895Nf1.LIZJ(101, hashMap2, " Bad Request", 102, " Connection timed out", 103, " Forbidden", 104, " Gateway Time-out");
            C59895Nf1.LIZJ(105, hashMap2, " Internal Server Error", 106, " Not Found", 107, " Request Time-out", 108, " Request-URI Too Large");
            hashMap.put(C16880lQ.LJLLJ(C64802Pby.class), hashMap2);
            HashMap hashMap3 = new HashMap();
            C59895Nf1.LIZJ(301, hashMap3, "ERR_ABORTED", 302, "ERR_ADDRESS_UNREACHABLE", 303, "ERR_CERT_AUTHORITY_INVALID", 304, "ERR_CERT_COMMON_NAME_INVALID");
            C59895Nf1.LIZJ(305, hashMap3, "ERR_CERT_DATE_INVALID", 306, "ERR_CONNECTION_ABORTED", 307, "ERR_CONNECTION_CLOSED", 308, "ERR_CONNECTION_REFUSED");
            C59895Nf1.LIZJ(309, hashMap3, "ERR_CONNECTION_RESET", 310, "ERR_CONNECTION_TIMED_OUT", 311, "ERR_EMPTY_RESPONSE", 312, "ERR_HTTP2_PING_FAILED");
            C59895Nf1.LIZJ(313, hashMap3, "ERR_INCOMPLETE_CHUNKED_ENCODING", 314, "ERR_INTERNET_DISCONNECTED", 315, "ERR_NAME_NOT_RESOLVED", 316, "ERR_NETWORK_ACCESS_DENIED");
            C59895Nf1.LIZJ(317, hashMap3, "ERR_PROXY_CONNECTION_FAILED", 318, "ERR_SOCKET_NOT_CONNECTED", 319, "ERR_SSL_BAD_RECORD_MAC_ALERT", 320, "ERR_SSL_PROTOCOL_ERROR");
            C59895Nf1.LIZJ(321, hashMap3, "ERR_TIMED_OUT", 322, "ERR_TTNET_APP_TIMED_OUT", 323, "ERR_TTNET_APP_UPLOAD_EXCEPTION", 324, "ERR_TUNNEL_CONNECTION_FAILED");
            hashMap.put(C16880lQ.LJLLJ(NetworkExceptionImpl.class), hashMap3);
            HashMap hashMap4 = new HashMap();
            hashMap4.put("ERR_NETWORK_CHANGED", 401);
            hashMap.put(C16880lQ.LJLLJ(o0.class), hashMap4);
            HashMap hashMap5 = new HashMap();
            hashMap5.put(" Unexpected end of ZLIB input stream", 501);
            hashMap.put(C16880lQ.LJLLJ(EOFException.class), hashMap5);
            HashMap hashMap6 = new HashMap();
            hashMap6.put(" unexpected end of stream on Connection", 601);
            hashMap6.put(" Unexpected request usage", 602);
            hashMap.put(C16880lQ.LJLLJ(IOException.class), hashMap6);
            HashMap hashMap7 = new HashMap();
            hashMap7.put("Cronet internal request fail", 701);
            hashMap.put(C16880lQ.LJLLJ(Exception.class), hashMap7);
            HashMap hashMap8 = new HashMap();
            hashMap8.put(" Content received is less than Content-Length", 801);
            hashMap8.put(" expected bytes but received", 802);
            hashMap8.put(" unexpected end of stream", 803);
            hashMap.put(C16880lQ.LJLLJ(ProtocolException.class), hashMap8);
            HashMap hashMap9 = new HashMap();
            hashMap9.put(" Connection closed by peer", 901);
            hashMap9.put(" Read error", 902);
            hashMap9.put(" SSL handshake aborted", 903);
            hashMap.put(C16880lQ.LJLLJ(SSLException.class), hashMap9);
            HashMap hashMap10 = new HashMap();
            hashMap10.put(" Connection closed by peer", 1001);
            hashMap10.put(" Handshake failed", 1002);
            hashMap10.put(" SSL handshake aborted", 1003);
            hashMap.put(C16880lQ.LJLLJ(SSLHandshakeException.class), hashMap10);
            HashMap hashMap11 = new HashMap();
            hashMap11.put(" Hostname not verified", 1101);
            hashMap.put(C16880lQ.LJLLJ(SSLPeerUnverifiedException.class), hashMap11);
            HashMap hashMap12 = new HashMap();
            hashMap12.put(" Read error", 1201);
            hashMap.put(C16880lQ.LJLLJ(SSLProtocolException.class), hashMap12);
        }
        String message = th.getMessage();
        int i = -1;
        if (TextUtils.isEmpty(message)) {
            return -1;
        }
        int indexOf = message.indexOf(44);
        if (indexOf > 0) {
            message = message.substring(0, indexOf);
        }
        java.util.Map map = (java.util.Map) hashMap.get(C16880lQ.LJLLJ(th.getClass()));
        if (map != null && !map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
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
}
