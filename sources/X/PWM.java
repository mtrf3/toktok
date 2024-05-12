package X;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class PWM {
    public static final PWL[] LIZ;
    public static final java.util.Map<C64537PUn, Integer> LIZIZ;

    static {
        int i = 0;
        C64537PUn c64537PUn = PWL.LJFF;
        C64537PUn c64537PUn2 = PWL.LJI;
        C64537PUn c64537PUn3 = PWL.LJII;
        C64537PUn c64537PUn4 = PWL.LJ;
        PWL[] pwlArr = {new PWL("", PWL.LJIIIIZZ), new PWL("GET", c64537PUn), new PWL("POST", c64537PUn), new PWL("/", c64537PUn2), new PWL("/index.html", c64537PUn2), new PWL("http", c64537PUn3), new PWL("https", c64537PUn3), new PWL("200", c64537PUn4), new PWL("204", c64537PUn4), new PWL("206", c64537PUn4), new PWL("304", c64537PUn4), new PWL("400", c64537PUn4), new PWL("404", c64537PUn4), new PWL("500", c64537PUn4), new PWL("accept-charset", ""), new PWL("accept-encoding", "gzip, deflate"), new PWL("accept-language", ""), new PWL("accept-ranges", ""), new PWL("accept", ""), new PWL("access-control-allow-origin", ""), new PWL("age", ""), new PWL("allow", ""), new PWL("authorization", ""), new PWL("cache-control", ""), new PWL("content-disposition", ""), new PWL("content-encoding", ""), new PWL("content-language", ""), new PWL("content-length", ""), new PWL("content-location", ""), new PWL("content-range", ""), new PWL("content-type", ""), new PWL("cookie", ""), new PWL("date", ""), new PWL("etag", ""), new PWL("expect", ""), new PWL("expires", ""), new PWL("from", ""), new PWL("host", ""), new PWL("if-match", ""), new PWL("if-modified-since", ""), new PWL("if-none-match", ""), new PWL("if-range", ""), new PWL("if-unmodified-since", ""), new PWL("last-modified", ""), new PWL("link", ""), new PWL("location", ""), new PWL("max-forwards", ""), new PWL("proxy-authenticate", ""), new PWL("proxy-authorization", ""), new PWL("range", ""), new PWL("referer", ""), new PWL("refresh", ""), new PWL("retry-after", ""), new PWL("server", ""), new PWL("set-cookie", ""), new PWL("strict-transport-security", ""), new PWL("transfer-encoding", ""), new PWL("user-agent", ""), new PWL("vary", ""), new PWL("via", ""), new PWL("www-authenticate", "")};
        LIZ = pwlArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(pwlArr.length);
        while (true) {
            PWL[] pwlArr2 = LIZ;
            if (i < pwlArr2.length) {
                if (!linkedHashMap.containsKey(pwlArr2[i].LIZ)) {
                    linkedHashMap.put(pwlArr2[i].LIZ, Integer.valueOf(i));
                }
                i++;
            } else {
                LIZIZ = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static void LIZ(C64537PUn c64537PUn) {
        int size = c64537PUn.size();
        for (int i = 0; i < size; i++) {
            byte b = c64537PUn.getByte(i);
            if (b >= 65 && b <= 90) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                LIZ2.append(c64537PUn.utf8());
                throw new IOException(X1D.LIZIZ(LIZ2));
            }
        }
    }
}
