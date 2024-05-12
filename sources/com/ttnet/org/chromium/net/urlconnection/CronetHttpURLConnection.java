package com.ttnet.org.chromium.net.urlconnection;

import X.AbstractC58324Mum;
import X.C16880lQ;
import X.C1DD;
import X.C61460OAe;
import X.C64495PSx;
import X.C64504PTg;
import X.PU3;
import X.QE2;
import X.QE9;
import X.QEA;
import X.QEB;
import X.QEG;
import X.QEI;
import X.QEK;
import X.V2B;
import X.X1D;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.a1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes12.dex */
public class CronetHttpURLConnection extends HttpURLConnection {
    public final QEK LIZ;
    public final PU3 LIZIZ;
    public QEI LIZJ;
    public final List<Pair<String, String>> LIZLLL;
    public boolean LJ;
    public int LJFF;
    public boolean LJI;
    public int LJII;
    public final QEB LJIIIIZZ;
    public QEG LJIIIZ;
    public AbstractC58324Mum LJIIJ;
    public IOException LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public List<Map.Entry<String, String>> LJIILJJIL;
    public Map<String, List<String>> LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public volatile String LJIL;
    public QE2 LJJ;
    public CookieHandler LJJI;
    public int LJJIFFI;
    public long LJJII;
    public int LJJIII;
    public final CountDownLatch LJJIIJ;
    public volatile boolean LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            LJIIIZ();
            if (((C61460OAe) this.LJIIJ).LIZIZ >= 400) {
                return this.LJIIIIZZ;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return false;
    }

    static {
        C16880lQ.LJLLJ(CronetHttpURLConnection.class);
    }

    public final Map<String, List<String>> LJII() {
        Map<String, List<String>> map = this.LJIILL;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : LJIIIIZZ()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.LJIILL = unmodifiableMap;
        return unmodifiableMap;
    }

    public final List<Map.Entry<String, String>> LJIIIIZZ() {
        List<Map.Entry<String, String>> list = this.LJIILJJIL;
        if (list != null) {
            return list;
        }
        this.LJIILJJIL = new ArrayList();
        Iterator<Map.Entry<String, String>> it = ((C61460OAe) this.LJIIJ).LJII.LIZ.iterator();
        while (it.hasNext()) {
            this.LJIILJJIL.add(new AbstractMap.SimpleImmutableEntry(it.next()));
        }
        List<Map.Entry<String, String>> unmodifiableList = Collections.unmodifiableList(this.LJIILJJIL);
        this.LJIILJJIL = unmodifiableList;
        return unmodifiableList;
    }

    public final void LJIIIZ() {
        QEG qeg = this.LJIIIZ;
        if (qeg != null) {
            qeg.LIZIZ();
            if (((HttpURLConnection) this).chunkLength > 0) {
                this.LJIIIZ.close();
            }
        }
        if (!this.LJIILIIL) {
            LJIIL();
            if (V2B.LJFF()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getResponse loop url = ");
                LIZ.append(getURL().toString());
                X1D.LIZIZ(LIZ);
            }
            LJFF(getReadTimeout() + getConnectTimeout());
            this.LJIILIIL = true;
        }
        if (this.LJIILIIL) {
            IOException iOException = this.LJIIJJI;
            if (iOException == null) {
                if (this.LJIIJ != null) {
                    return;
                } else {
                    throw new NullPointerException("Response info is null when there is no exception.");
                }
            }
            throw iOException;
        }
        throw new IllegalStateException("No response.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0172, code lost:
    
        if (r6.LJI != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0181, code lost:
    
        if (r6.LJ != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL() {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.LJIIL():void");
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        QEI qei;
        if (((HttpURLConnection) this).connected && (qei = this.LIZJ) != null) {
            qei.LIZLLL();
            this.LJJIIJZLJL = true;
        }
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        if (this.LJIIIZ == null && ((HttpURLConnection) this).doOutput) {
            if (!((HttpURLConnection) this).connected) {
                if (((HttpURLConnection) this).chunkLength > 0) {
                    this.LJIIIZ = new QEA(this, ((HttpURLConnection) this).chunkLength, this.LIZIZ);
                    LJIIL();
                } else {
                    long j = ((HttpURLConnection) this).fixedContentLength;
                    long j2 = ((HttpURLConnection) this).fixedContentLengthLong;
                    if (j2 != -1) {
                        j = j2;
                    }
                    if (j != -1) {
                        QE9 qe9 = new QE9(this, j, this.LIZIZ);
                        this.LJIIIZ = qe9;
                        if (j == 0) {
                            setFixedLengthStreamingMode((int) qe9.LJLJLJ.LJLIL.LJLJJLL);
                            if (getRequestProperty("Content-Length") == null) {
                                addRequestProperty("Content-Length", Long.toString(this.LJIIIZ.LIZJ().LIZ()));
                            } else {
                                setRequestProperty("Content-Length", Long.toString(this.LJIIIZ.LIZJ().LIZ()));
                            }
                        }
                        LJIIL();
                    } else {
                        String requestProperty = getRequestProperty("Content-Length");
                        if (requestProperty == null) {
                            this.LJIIIZ = new C64495PSx(this);
                        } else {
                            this.LJIIIZ = new C64495PSx(this, CastLongProtector.parseLong(requestProperty));
                        }
                    }
                }
            } else {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
        }
        return this.LJIIIZ;
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        if (!((HttpURLConnection) this).connected) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = ((ArrayList) this.LIZLLL).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (!treeMap.containsKey(pair.first)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pair.second);
                    treeMap.put(pair.first, Collections.unmodifiableList(arrayList));
                } else {
                    throw new IllegalStateException("Should not have multiple values.");
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }
        throw new IllegalStateException("Cannot access request headers after connection is set.");
    }

    @Override // java.net.URLConnection
    public final void connect() {
        getOutputStream();
        LJIIL();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        try {
            LJIIIZ();
            return LJII();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        LJIIIZ();
        if (((HttpURLConnection) this).instanceFollowRedirects || !this.LJIIL) {
            if (((C61460OAe) this.LJIIJ).LIZIZ < 400) {
                return this.LJIIIIZZ;
            }
            throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
        }
        throw new IOException("Cannot read response body of a redirect.");
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        LJIIIZ();
        return ((C61460OAe) this.LJIIJ).LIZIZ;
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        LJIIIZ();
        return ((C61460OAe) this.LJIIJ).LIZJ;
    }

    public static /* synthetic */ URL LIZIZ(CronetHttpURLConnection cronetHttpURLConnection) {
        return ((HttpURLConnection) cronetHttpURLConnection).url;
    }

    public static /* synthetic */ boolean LIZJ(CronetHttpURLConnection cronetHttpURLConnection) {
        return ((HttpURLConnection) cronetHttpURLConnection).instanceFollowRedirects;
    }

    public static /* synthetic */ boolean LJ(CronetHttpURLConnection cronetHttpURLConnection) {
        return ((HttpURLConnection) cronetHttpURLConnection).instanceFollowRedirects;
    }

    public static URI LJIILIIL(URL url) {
        if (url == null) {
            return null;
        }
        String url2 = url.toString();
        try {
            return new URI(url2);
        } catch (URISyntaxException e) {
            try {
                try {
                    return URI.create(url2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
                } catch (Exception unused) {
                    throw new RuntimeException(e);
                }
            } catch (Exception unused2) {
                return URI.create(url2.substring(0, url2.indexOf("?")));
            }
        }
    }

    public final Map<String, String> LIZ(URI uri) {
        HashMap hashMap = new HashMap();
        if ((this.LJJIII & 2) > 0) {
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        List<Pair<String, String>> list = this.LIZLLL;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.first;
                Object obj2 = pair.second;
                List list2 = (List) hashMap2.get(obj);
                if (list2 == null) {
                    list2 = new LinkedList();
                }
                list2.add(obj2);
                hashMap2.put(obj, list2);
            }
        }
        Map<String, List<String>> map = null;
        try {
            if (this.LJJI == null) {
                this.LJJI = CookieHandler.getDefault();
            }
            CookieHandler cookieHandler = this.LJJI;
            if (cookieHandler != null) {
                map = cookieHandler.get(uri, hashMap2);
            }
        } catch (Exception e) {
            if (V2B.LJFF()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Loading cookies failed for ");
                LIZ.append(getURL().toString());
                LIZ.append(" e = ");
                LIZ.append(e.getMessage());
                X1D.LIZIZ(LIZ);
            }
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                StringBuilder sb = new StringBuilder();
                if ("X-SS-Cookie".equalsIgnoreCase(key) || "Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    if (!entry.getValue().isEmpty()) {
                        int i = 0;
                        for (String str : entry.getValue()) {
                            if (i > 0) {
                                sb.append("; ");
                            }
                            sb.append(str);
                            i++;
                        }
                        hashMap.put(key, sb.toString());
                    }
                }
            }
        }
        return hashMap;
    }

    public final void LJFF(int i) {
        try {
            this.LIZIZ.LIZ(i);
        } catch (SocketTimeoutException unused) {
            QEI qei = this.LIZJ;
            if (qei != null) {
                qei.LIZJ();
                PU3 pu3 = this.LIZIZ;
                pu3.LJLJI = false;
                pu3.LIZ(i / 2);
            }
        } catch (Exception e) {
            setException(new IOException(C1DD.LJ("Unexpected request usage, caught in CronetHttpURLConnection, caused by ", e)));
            if (this.LIZJ != null) {
                PU3 pu32 = this.LIZIZ;
                pu32.LJLJI = false;
                pu32.LIZ(i / 2);
            }
        }
    }

    public final int LJI(String str) {
        for (int i = 0; i < ((ArrayList) this.LIZLLL).size(); i++) {
            if (((String) ((Pair) ListProtector.get(this.LIZLLL, i)).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[RETURN] */
    @Override // java.net.HttpURLConnection, java.net.URLConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getHeaderField(int r4) {
        /*
            r3 = this;
            r2 = 0
            r3.LJIIIZ()     // Catch: java.io.IOException -> Le
            java.util.List r1 = r3.LJIIIIZZ()
            int r0 = r1.size()
            if (r4 < r0) goto L12
        Le:
            r0 = r2
        Lf:
            if (r0 != 0) goto L19
            return r2
        L12:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r4)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto Lf
        L19:
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.getHeaderField(int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[RETURN] */
    @Override // java.net.HttpURLConnection, java.net.URLConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getHeaderFieldKey(int r4) {
        /*
            r3 = this;
            r2 = 0
            r3.LJIIIZ()     // Catch: java.io.IOException -> Le
            java.util.List r1 = r3.LJIIIIZZ()
            int r0 = r1.size()
            if (r4 < r0) goto L12
        Le:
            r0 = r2
        Lf:
            if (r0 != 0) goto L19
            return r2
        L12:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r4)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto Lf
        L19:
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.getHeaderFieldKey(int):java.lang.String");
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        int LJI = LJI(str);
        if (LJI >= 0) {
            return (String) ((Pair) ListProtector.get(this.LIZLLL, LJI)).second;
        }
        return null;
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        super.setConnectTimeout(i);
    }

    public void setException(IOException iOException) {
        QEB qeb = this.LJIIIIZZ;
        if (qeb != null) {
            qeb.LJLJJI = iOException;
            qeb.LJLILLLLZI = true;
            qeb.LJLJI = null;
        }
        QEG qeg = this.LJIIIZ;
        if (qeg != null) {
            qeg.LJLIL = iOException;
            qeg.LJLJI = true;
        }
        this.LJIILIIL = true;
        this.LJIIJJI = iOException;
        QEI qei = this.LIZJ;
        if (qei != null) {
            qei.LIZLLL();
        }
    }

    public void setInputStreamBufferSize(int i) {
        this.LJIJJLI = i;
    }

    public void setRequestFlag(int i) {
        this.LJJIFFI = i;
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        if ("PATCH".equals(str)) {
            if (!((HttpURLConnection) this).connected) {
                ((HttpURLConnection) this).method = str;
                return;
            }
            throw new ProtocolException("Can't reset method: already connected");
        }
        super.setRequestMethod(str);
    }

    public void setRequestPriority(int i) {
        this.LJIILLIIL = i;
    }

    public void setRequestTimeout(int i) {
        this.LJIJJ = i;
    }

    public void setRequestTypeFlags(int i) {
        this.LJJIII = i | this.LJJIII;
    }

    public void setSocketConnectTimeout(int i) {
        this.LJIIZILJ = i;
    }

    public void setSocketReadTimeout(int i) {
        this.LJIJ = i;
    }

    public void setSocketWriteTimeout(int i) {
        this.LJIJI = i;
    }

    public void setThrottleNetSpeed(long j) {
        this.LJJII = j;
        QEI qei = this.LIZJ;
        if (qei != null) {
            qei.LJIIJ(j);
        }
    }

    public void setTrafficStatsTag(int i) {
        if (!((HttpURLConnection) this).connected) {
            this.LJ = true;
            this.LJFF = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
    }

    public void setTrafficStatsUid(int i) {
        if (!((HttpURLConnection) this).connected) {
            this.LJI = true;
            this.LJII = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats UID after connection is made.");
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            LJIIIZ();
            Map<String, List<String>> LJII = LJII();
            if (!LJII.containsKey(str)) {
                return null;
            }
            List<String> list = LJII.get(str);
            return (String) C64504PTg.LIZIZ(list, -1, list);
        } catch (IOException unused) {
            return null;
        }
    }

    public CronetHttpURLConnection(URL url, QEK qek) {
        super(url);
        this.LIZ = qek;
        this.LIZIZ = new PU3();
        this.LJIIIIZZ = new QEB(this);
        this.LIZLLL = new ArrayList();
        this.LJJI = CookieHandler.getDefault();
        this.LJJIIJ = new CountDownLatch(1);
        this.LJJIIJZLJL = false;
    }

    public static /* synthetic */ void LIZLLL(CronetHttpURLConnection cronetHttpURLConnection, URL url) {
        ((HttpURLConnection) cronetHttpURLConnection).url = url;
    }

    public final void LJIIJ(String str, Map<String, List<String>> map) {
        String str2;
        if (V2B.LJFF()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Saving cookies for url: ");
            if (TextUtils.isEmpty(str)) {
                str2 = getURL().toString();
            } else {
                str2 = str;
            }
            LIZ.append(str2);
            X1D.LIZIZ(LIZ);
        }
        try {
            if (this.LJJI == null) {
                this.LJJI = CookieHandler.getDefault();
            }
            if (this.LJJI != null) {
                if (TextUtils.isEmpty(str)) {
                    this.LJJI.put(LJIILIIL(getURL()), map);
                    return;
                }
                URI LJIILIIL = LJIILIIL(new URL(str));
                if ((this.LJJIII & 1) == 1) {
                    TreeMap treeMap = new TreeMap(map);
                    treeMap.put("webview-origin-url", Collections.singletonList(getURL().getHost()));
                    this.LJJI.put(LJIILIIL, treeMap);
                    return;
                }
                this.LJJI.put(LJIILIIL, map);
            }
        } catch (Exception e) {
            if (V2B.LJFF()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Saving cookies failed for ");
                if (TextUtils.isEmpty(str)) {
                    str = getURL().toString();
                }
                LIZ2.append(str);
                LIZ2.append(" e = ");
                LIZ2.append(e.getMessage());
                X1D.LIZIZ(LIZ2);
            }
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        LJIIJJI(str, str2, false);
    }

    public void setAuthCredentials(String str, String str2) {
        this.LJJIIZ = str;
        this.LJJIIZI = str2;
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        LJIIJJI(str, str2, true);
    }

    public final void LJIIJJI(String str, String str2, boolean z) {
        if (!((HttpURLConnection) this).connected) {
            int LJI = LJI(str);
            if (LJI >= 0) {
                if (z) {
                    ListProtector.remove(this.LIZLLL, LJI);
                } else {
                    throw new UnsupportedOperationException(a1.LJ("Cannot add multiple headers of the same key, ", str, ". crbug.com/432719."));
                }
            }
            ((ArrayList) this.LIZLLL).add(Pair.create(str, str2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }
}
