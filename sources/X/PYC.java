package X;

import defpackage.i0;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import okhttp3.Request;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PYC implements PYA, InterfaceC58286MuA, PY8 {
    @Override // X.PY8
    public final PPC<HttpURLConnection, Integer> LJ(PPC<HttpURLConnection, Integer> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<java.net.URL, URLConnection> LJFF(PPC<java.net.URL, URLConnection> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJI(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJII(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, Integer> LJIIIZ(PPC<HttpURLConnection, Integer> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIL(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PYA
    public final PPC<Request, C64598PWw> LJIILLIIL(PPC<Request, C64598PWw> ppc) {
        return ppc;
    }

    @Override // X.PYA
    public final PPC<Request, C64598PWw> LIZIZ(PPC<Request, C64598PWw> ppc) {
        Request request;
        boolean z;
        C64598PWw c64598PWw = ppc.LIZIZ;
        if (c64598PWw != null && (request = c64598PWw.LJLIL) != null) {
            try {
                C64626PXy url = request.url();
                if (url != null) {
                    String str = url.LIZLLL;
                    String LJFF = url.LJFF();
                    boolean equals = url.LIZ.equals("https");
                    if (request.header("cookie") != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LJIIZILJ(str, LJFF, c64598PWw.LIZ("content-type", null), "4", z, equals);
                }
            } catch (Exception unused) {
            }
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIJJI(PPC<HttpURLConnection, InputStream> ppc) {
        HttpURLConnection httpURLConnection = ppc.LIZ;
        if (!PYR.LIZJ(httpURLConnection)) {
            LIZJ(httpURLConnection.getURL(), null, httpURLConnection.getContentType());
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILIIL(PPC<HttpURLConnection, InputStream> ppc) {
        String str;
        HttpURLConnection httpURLConnection = ppc.LIZ;
        JSONObject jSONObject = ppc.LIZLLL;
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.optString("key", "");
            jSONObject.optString("value", "");
        }
        if (!PYR.LIZJ(httpURLConnection)) {
            LIZJ(httpURLConnection.getURL(), str, "");
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILL(PPC<HttpURLConnection, InputStream> ppc) {
        String str;
        HttpURLConnection httpURLConnection = ppc.LIZ;
        JSONObject jSONObject = ppc.LIZLLL;
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.optString("key", "");
            jSONObject.optString("value", "");
        }
        if (!PYR.LIZJ(httpURLConnection)) {
            LIZJ(httpURLConnection.getURL(), str, "");
        }
        return ppc;
    }

    public static void LIZJ(java.net.URL url, String str, String str2) {
        if (url == null) {
            return;
        }
        try {
            String host = url.getHost();
            String path = url.getPath();
            String protocol = url.getProtocol();
            boolean equalsIgnoreCase = "cookie".equalsIgnoreCase(str);
            boolean equals = "https".equals(protocol);
            url.toString();
            LJIIZILJ(host, path, str2, "3", equalsIgnoreCase, equals);
        } catch (Exception unused) {
        }
    }

    public static void LJIIZILJ(final String str, final String str2, final String str3, final String str4, final boolean z, final boolean z2) {
        C10K.LIZIZ(new Callable() { // from class: X.PYD
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z3;
                String str5 = str3;
                String str6 = str;
                String str7 = str2;
                boolean z4 = z2;
                String str8 = str4;
                boolean z5 = z;
                if (str5.contains("video") || str5.contains("audio") || str5.contains("image")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String LJFF = i0.LJFF(str6, str7);
                if (!z4) {
                    if (!z3 || z5) {
                        PYC.LJIJ(str6, LJFF, z5, str5, z4, str8);
                        return null;
                    }
                    return null;
                }
                if ((z3 || str7 == null || str7.contains("v1/play")) && (!z5 || !z3)) {
                    return null;
                }
                PYC.LJIJ(str6, LJFF, z5, str5, z4, str8);
                return null;
            }
        }, C38995FSd.LIZIZ(), null);
    }

    public static void LJIJ(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", str);
            jSONObject.put("uri", str2);
            jSONObject.put("cookie", String.valueOf(z));
            jSONObject.put("item_type", str3);
            jSONObject.put("data_protocol", String.valueOf(z2));
            jSONObject.put("netClientType", str4);
            C09900aA.LJ(EnumC58731N3f.NATIVE_NETWORK_API_LOG.getLogType(), jSONObject);
        } catch (Exception unused) {
        }
    }
}
