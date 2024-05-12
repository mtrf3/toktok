package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.i0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public final class P9Z {
    public static URLConnection LIZIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "4797639662784845599"));
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

    public static void LIZJ(String str, byte[] bArr, EnumC63978P9a enumC63978P9a) {
        String str2;
        String str3;
        if (str == null) {
            return;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (EnumC63978P9a.GZIP == enumC63978P9a && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str2 = "gzip";
            } catch (Throwable unused) {
                gZIPOutputStream.close();
                return;
            }
        } else if (EnumC63978P9a.DEFLATER == enumC63978P9a && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[FileUtils.BUFFER_SIZE];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str2 = "deflate";
        } else {
            str2 = null;
        }
        byte[] LIZ = EncryptorUtil.LIZ(bArr.length, bArr);
        if (LIZ != null) {
            if (TextUtils.isEmpty(new java.net.URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = i0.LJFF(str, "?");
                }
            } else if (!str.endsWith("&")) {
                str = i0.LJFF(str, "&");
            }
            str = i0.LJFF(str, "tt_data=a");
            str3 = "application/octet-stream;tt-data=a";
            bArr = LIZ;
        } else {
            str3 = "application/json; charset=utf-8";
        }
        LIZLLL(str, bArr, str3, str2, true);
    }

    public static byte[] LIZLLL(String str, byte[] bArr, String str2, String str3, boolean z) {
        HttpURLConnection httpURLConnection;
        java.net.URL url;
        byte[] LJ;
        InputStream inputStream = null;
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
                    } finally {
                    }
                }
            }
            httpURLConnection.setDoOutput(true);
            if (str2 != null) {
                httpURLConnection.setRequestProperty("Content-Type", str2);
            }
            if (str3 != null) {
                httpURLConnection.setRequestProperty("Content-Encoding", str3);
            }
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            httpURLConnection.setRequestProperty("Version-Code", "1");
            httpURLConnection.setRequestMethod("POST");
            if (bArr != null && bArr.length > 0) {
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                inputStream = httpURLConnection.getInputStream();
                try {
                    String contentEncoding = httpURLConnection.getContentEncoding();
                    if (!TextUtils.isEmpty(contentEncoding) && contentEncoding.equalsIgnoreCase("gzip")) {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
                        LJ = LJ(gZIPInputStream);
                        gZIPInputStream.close();
                    } else {
                        LJ = LJ(inputStream);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused2) {
                    }
                    return LJ;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            throw new C63979P9b(responseCode, httpURLConnection.getResponseMessage());
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }
}
