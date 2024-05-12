package X;

import Y.ARunnableS25S0200000_6;
import android.os.Build;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.net.model.TypeEnum;
import com.ss.android.ugc.aweme.net.model.UnexpectedConfig;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class PYE implements PY9, PYA, InterfaceC58286MuA, PY8 {
    public static final C47981IsL<String> LIZJ;
    public static final SimpleDateFormat LIZLLL;
    public final List<UnexpectedConfig> LIZ;
    public final List<UnexpectedConfig> LIZIZ;

    @Override // X.PY9
    public final PPC<Request, C64797Pbt<?>> LIZ(PPC<Request, C64797Pbt<?>> ppc) {
        return ppc;
    }

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
    public final PPC<HttpURLConnection, Integer> LJIIIZ(PPC<HttpURLConnection, Integer> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIJJI(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIL(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILIIL(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILL(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PYA
    public final PPC<okhttp3.Request, C64598PWw> LJIILLIIL(PPC<okhttp3.Request, C64598PWw> ppc) {
        return ppc;
    }

    static {
        C16880lQ.LJLLJ(PYE.class);
        LIZJ = new C47981IsL<>(5);
        LIZLLL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
    }

    @Override // X.PYA
    public final PPC<okhttp3.Request, C64598PWw> LIZIZ(PPC<okhttp3.Request, C64598PWw> ppc) {
        String str;
        C64533PUj c64533PUj;
        String LLLLL;
        PW3 source;
        PW3 source2;
        C39745Fin contentType;
        C64598PWw c64598PWw = ppc.LIZIZ;
        o.LJI(c64598PWw);
        String uri = c64598PWw.LJLIL.url().LJIJJ().toString();
        o.LJIIIIZZ(uri, "interceptContext.respons…().url().uri().toString()");
        android.net.Uri uri2 = UriProtector.parse(uri);
        o.LJIIIIZZ(uri2, "uri");
        LJIIZILJ(uri2, "4", null, null);
        if (!this.LIZIZ.isEmpty()) {
            C64598PWw c64598PWw2 = ppc.LIZIZ;
            if (c64598PWw2 != null) {
                PVM pvm = c64598PWw2.LJLJL;
                if (pvm != null && (contentType = pvm.contentType()) != null) {
                    str = contentType.LIZ;
                } else {
                    str = null;
                }
                boolean LIZ = C39367Fch.LIZ(str);
                PVM pvm2 = c64598PWw2.LJLJL;
                if (pvm2 != null && (source2 = pvm2.source()) != null) {
                    c64533PUj = source2.LJJIJ();
                } else {
                    c64533PUj = null;
                }
                if (LIZ && c64533PUj != null) {
                    PVM pvm3 = c64598PWw2.LJLJL;
                    if (pvm3 != null && (source = pvm3.source()) != null) {
                        source.request(Long.MAX_VALUE);
                    }
                    if (ujb.o.LJJJJIZL("gzip", c64598PWw2.LIZ("Content-Encoding", ""), true) || ujb.o.LJJJJIZL("gzip", c64598PWw2.LIZ("content-encoding", ""), true)) {
                        try {
                            PUL pul = new PUL(c64533PUj.clone());
                            try {
                                c64533PUj = new C64533PUj();
                                c64533PUj.j(pul);
                                pul.close();
                            } catch (Throwable th) {
                                pul.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    C64533PUj clone = c64533PUj.clone();
                    Charset forName = Charset.forName("UTF-8");
                    o.LJIIIIZZ(forName, "forName(\"UTF-8\")");
                    LLLLL = clone.LLLLL(forName);
                    LIZJ(uri2, "4", LLLLL, null);
                }
            }
            LLLLL = null;
            LIZJ(uri2, "4", LLLLL, null);
        }
        return ppc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        if (ujb.o.LJJJJJL(r2) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    @Override // X.PY9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.PPC<com.bytedance.retrofit2.client.Request, X.C64797Pbt<?>> LIZLLL(X.PPC<com.bytedance.retrofit2.client.Request, X.C64797Pbt<?>> r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYE.LIZLLL(X.PPC):X.PPC");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJII(PPC<HttpURLConnection, InputStream> ppc) {
        String str;
        OSZ osz;
        R r;
        InputStream inputStream;
        String str2;
        Reader reader;
        HttpURLConnection httpURLConnection = ppc.LIZ;
        o.LJI(httpURLConnection);
        android.net.Uri uri = UriProtector.parse(httpURLConnection.getURL().toString());
        o.LJIIIIZZ(uri, "uri");
        LJIIZILJ(uri, "3", null, null);
        HttpURLConnection httpURLConnection2 = ppc.LIZ;
        if (httpURLConnection2 != null) {
            str = httpURLConnection2.getContentType();
        } else {
            str = null;
        }
        if ((!this.LIZIZ.isEmpty()) && C39367Fch.LIZ(str)) {
            InputStream inputStream2 = ppc.LIZIZ;
            if (inputStream2 == null) {
                osz = null;
                r = 0;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                for (int read = inputStream2.read(bArr); read > -1; read = inputStream2.read(bArr)) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                osz = new OSZ(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                r = osz.getFirst();
            }
            ppc.LIZIZ = r;
            if (osz != null) {
                inputStream = (InputStream) osz.getSecond();
            } else {
                inputStream = null;
            }
            if (C39367Fch.LIZ(str)) {
                if (inputStream != null) {
                    reader = new InputStreamReader(inputStream, PVC.LIZ);
                    if (!(reader instanceof BufferedReader)) {
                        reader = new BufferedReader(reader, FileUtils.BUFFER_SIZE);
                    }
                    try {
                        str2 = C77321UWf.LJIILJJIL(reader);
                    } finally {
                    }
                } else {
                    reader = null;
                    str2 = null;
                }
                AnonymousClass636.LJFF(reader, null);
            } else {
                str2 = null;
            }
            LIZJ(uri, "3", str2, null);
        }
        return ppc;
    }

    public PYE(List<UnexpectedConfig> urlConfigs, List<UnexpectedConfig> responseConfigs) {
        o.LJIIIZ(urlConfigs, "urlConfigs");
        o.LJIIIZ(responseConfigs, "responseConfigs");
        this.LIZ = urlConfigs;
        this.LIZIZ = responseConfigs;
        ArrayList arrayList = new ArrayList();
        for (UnexpectedConfig unexpectedConfig : urlConfigs) {
            PYF pyf = TypeEnum.Companion;
            int type = unexpectedConfig.getType();
            pyf.getClass();
            if (PYF.LIZ(type)) {
                arrayList.add(unexpectedConfig);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UnexpectedConfig unexpectedConfig2 = (UnexpectedConfig) it.next();
            unexpectedConfig2.setRegex(new OJD(unexpectedConfig2.getPattern()));
        }
        List<UnexpectedConfig> list = this.LIZIZ;
        ArrayList arrayList2 = new ArrayList();
        for (UnexpectedConfig unexpectedConfig3 : list) {
            PYF pyf2 = TypeEnum.Companion;
            int type2 = unexpectedConfig3.getType();
            pyf2.getClass();
            if (PYF.LIZ(type2)) {
                arrayList2.add(unexpectedConfig3);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            UnexpectedConfig unexpectedConfig4 = (UnexpectedConfig) it2.next();
            unexpectedConfig4.setRegex(new OJD(unexpectedConfig4.getPattern()));
        }
    }

    public final void LIZJ(android.net.Uri uri, String str, String str2, String str3) {
        boolean LJJJLIIL;
        OJD regex;
        List<String> targets;
        if (str2 == null || ujb.o.LJJJJJL(str2)) {
            return;
        }
        String path = uri.getPath();
        if (path != null && ujb.o.LJJJLIIL(path, "/tfe/api/request_combine/v", false)) {
            return;
        }
        String path2 = uri.getPath();
        if (path2 != null && ujb.o.LJJJLIIL(path2, "/aweme/v", false)) {
            String path3 = uri.getPath();
            if (path3 != null && ujb.o.LJJJJ(path3, "/settings/", false)) {
                return;
            }
            String path4 = uri.getPath();
            if (path4 != null && ujb.o.LJJJJ(path4, "/abtest/param/", false)) {
                return;
            }
        }
        List<UnexpectedConfig> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (UnexpectedConfig unexpectedConfig : list) {
            UnexpectedConfig unexpectedConfig2 = unexpectedConfig;
            if (unexpectedConfig2.getTargets() == null || ((targets = unexpectedConfig2.getTargets()) != null && targets.contains(str))) {
                arrayList.add(unexpectedConfig);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UnexpectedConfig unexpectedConfig3 = (UnexpectedConfig) it.next();
            int type = unexpectedConfig3.getType();
            if (type == TypeEnum.START_WITH.getType()) {
                LJJJLIIL = ujb.o.LJJJLIIL(str2, unexpectedConfig3.getPattern(), false);
            } else if (type == TypeEnum.CONTAINS.getType()) {
                LJJJLIIL = s.LJJJLZIJ(str2, unexpectedConfig3.getPattern(), false);
            } else if (type == TypeEnum.REGEX_MATCHES.getType()) {
                OJD regex2 = unexpectedConfig3.getRegex();
                if (regex2 != null) {
                    LJJJLIIL = regex2.matches(str2);
                }
            } else if (type == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType() && (regex = unexpectedConfig3.getRegex()) != null) {
                LJJJLIIL = regex.containsMatchIn(str2);
            }
            if (LJJJLIIL) {
                LJIJ(this, uri, unexpectedConfig3, str, str3, null, str2, 16);
            }
        }
    }

    public final void LJIIZILJ(android.net.Uri uri, String str, WebView webView, String str2) {
        boolean LJJJLIIL;
        List<String> targets;
        String uri2 = uri.toString();
        o.LJIIIIZZ(uri2, "uri.toString()");
        List<UnexpectedConfig> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (UnexpectedConfig unexpectedConfig : list) {
            UnexpectedConfig unexpectedConfig2 = unexpectedConfig;
            if (unexpectedConfig2.getTargets() == null || ((targets = unexpectedConfig2.getTargets()) != null && targets.contains(str))) {
                arrayList.add(unexpectedConfig);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UnexpectedConfig unexpectedConfig3 = (UnexpectedConfig) it.next();
            int type = unexpectedConfig3.getType();
            if (type == TypeEnum.START_WITH.getType()) {
                LJJJLIIL = ujb.o.LJJJLIIL(uri2, unexpectedConfig3.getPattern(), false);
            } else if (type == TypeEnum.CONTAINS.getType()) {
                LJJJLIIL = s.LJJJLZIJ(uri2, unexpectedConfig3.getPattern(), false);
            } else if (type == TypeEnum.REGEX_MATCHES.getType()) {
                OJD regex = unexpectedConfig3.getRegex();
                if (regex != null) {
                    LJJJLIIL = regex.matches(uri2);
                }
            } else if (type == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType()) {
                OJD regex2 = unexpectedConfig3.getRegex();
                if (regex2 != null) {
                    LJJJLIIL = regex2.containsMatchIn(uri2);
                }
            } else if (type == TypeEnum.EQUAL.getType()) {
                LJJJLIIL = o.LJ(unexpectedConfig3.getPattern(), uri2);
            }
            if (LJJJLIIL) {
                LJIJ(this, uri, unexpectedConfig3, str, str2, webView, null, 32);
            }
        }
    }

    public static void LJIJ(PYE pye, android.net.Uri uri, UnexpectedConfig unexpectedConfig, String str, String str2, WebView webView, String str3, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            webView = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        pye.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", uri.getHost());
        jSONObject.put("path", uri.getPath());
        jSONObject.put("url", uri.toString());
        jSONObject.put("configId", unexpectedConfig.getId());
        jSONObject.put("config", unexpectedConfig.toString());
        jSONObject.put("net_type", str);
        jSONObject.put("page", C119944nG.LIZ());
        if (str2 != null && !ujb.o.LJJJJJL(str2)) {
            jSONObject.put("logid", str2);
        }
        if (str3 != null && !ujb.o.LJJJJJL(str3)) {
            jSONObject.put("response", str3);
        }
        if (webView == null) {
            if (o.LJ(str, "2")) {
                jSONObject.put("content", ORZ.LLD(LIZJ, "\n", null, null, null, 62));
            }
            C09900aA.LJ(EnumC58731N3f.UNEXPECTED_NETWORK_LOG.getLogType(), jSONObject);
        } else if (Build.VERSION.SDK_INT != 23 || webView.isAttachedToWindow()) {
            webView.post(new ARunnableS25S0200000_6(jSONObject, webView, 44));
        } else {
            C09900aA.LJ(EnumC58731N3f.UNEXPECTED_NETWORK_LOG.getLogType(), jSONObject);
        }
    }
}
