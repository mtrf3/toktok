package X;

import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public final class P9Y {
    public static URLConnection LIZIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-1829569243847631208"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static URLConnection LIZ(java.net.URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return LIZIZ(url);
        }
        PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
        PPD ppd = LJFF.LJFF;
        if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
            URLConnection uRLConnection2 = uRLConnection;
            if (uRLConnection2 instanceof HttpsURLConnection) {
                pyu2 = new PYT((HttpsURLConnection) uRLConnection2);
            } else {
                if (!(uRLConnection2 instanceof HttpURLConnection)) {
                    return uRLConnection2;
                }
                pyu2 = new PYU((HttpURLConnection) uRLConnection2);
            }
            return pyu2;
        }
        if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
            URLConnection LIZIZ = LIZIZ(url);
            if (LIZIZ instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) LIZIZ);
            } else {
                if (!(LIZIZ instanceof HttpURLConnection)) {
                    return LIZIZ;
                }
                pyu = new PYU((HttpURLConnection) LIZIZ);
            }
            return pyu;
        }
        throw runtimeException;
    }

    public static byte[] LJ(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static byte[] LIZJ(byte[] bArr, java.util.Map<String, String> map) {
        if (bArr.length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ((HashMap) map).put("Content-Encoding", "gzip");
                    return byteArray;
                } catch (IOException e) {
                    throw e;
                }
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        }
        return bArr;
    }

    public static byte[] LIZLLL(String str, boolean z) {
        HttpURLConnection httpURLConnection;
        java.net.URL url;
        byte[] LJ;
        InputStream inputStream = null;
        if (TextUtils.isDigitsOnly(str)) {
            return null;
        }
        try {
            LinkedList linkedList = new LinkedList();
            if (z) {
                url = new java.net.URL(EZU.LJFF(str, linkedList));
            } else {
                url = new java.net.URL(str);
            }
            httpURLConnection = (HttpURLConnection) LIZ(url);
            if (z) {
                try {
                    if (!linkedList.isEmpty()) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            if (pair != null) {
                                httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C78685UuP.LJIIIIZZ(inputStream);
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused) {
                            }
                        }
                        throw th2;
                    }
                }
            }
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream2 = httpURLConnection.getInputStream();
                try {
                    String contentEncoding = httpURLConnection.getContentEncoding();
                    if (!TextUtils.isEmpty(contentEncoding) && contentEncoding.equalsIgnoreCase("gzip")) {
                        try {
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream2);
                            try {
                                LJ = LJ(gZIPInputStream);
                                C78685UuP.LJIIIIZZ(gZIPInputStream);
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = gZIPInputStream;
                                C78685UuP.LJIIIIZZ(inputStream);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        LJ = LJ(inputStream2);
                    }
                    java.util.Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                        String key = entry.getKey();
                        List<String> value = entry.getValue();
                        if (value != null && !C1E2.LIZ(value)) {
                            hashMap.put(key, value.get(0));
                        }
                    }
                    C36633EZh c36633EZh = new C36633EZh(responseCode, hashMap, LJ);
                    C78685UuP.LJIIIIZZ(inputStream2);
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused2) {
                    }
                    return c36633EZh.LIZJ;
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = inputStream2;
                    throw th;
                }
            }
            throw new C35897E6z(responseCode, httpURLConnection.getResponseMessage());
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
        }
    }
}
