package X;

import android.text.TextUtils;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.i0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.P9i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63986P9i {
    public static boolean LIZ;

    public static URLConnection LIZJ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-5778153407390263903"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static String LJI() {
        return PK0.LJIIIIZZ.getJavaCrashUploadUrl();
    }

    public static URLConnection LIZ(java.net.URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return LIZJ(url);
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
            URLConnection LIZJ = LIZJ(url);
            if (LIZJ instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) LIZJ);
            } else {
                if (!(LIZJ instanceof HttpURLConnection)) {
                    return LIZJ;
                }
                pyu = new PYU((HttpURLConnection) LIZJ);
            }
            return pyu;
        }
        throw runtimeException;
    }

    public static byte[] LJII(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    FPX.LIZIZ(byteArrayOutputStream);
                }
            }
        }
    }

    public static String LIZIZ(String str, java.util.Map map) {
        if (!TextUtils.isDigitsOnly(str)) {
            HashMap hashMap = (HashMap) map;
            if (hashMap.isEmpty()) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            if (!str.contains("?")) {
                sb.append("?");
            }
            try {
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (entry.getValue() != null) {
                        if (!sb.toString().endsWith("?")) {
                            sb.append("&");
                        }
                        try {
                            sb.append(URLEncoder.encode(entry.getKey().toString(), "UTF-8"));
                            sb.append("=");
                            try {
                                sb.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
                            } catch (UnsupportedEncodingException e) {
                                throw new IllegalArgumentException(e);
                            }
                        } catch (UnsupportedEncodingException e2) {
                            throw new IllegalArgumentException(e2);
                        }
                    }
                }
                return sb.toString();
            } catch (Exception unused) {
                return str;
            }
        }
        return str;
    }

    public static String LJFF(String str, JSONObject jSONObject) {
        return LIZIZ(str, C64257PJt.LIZIZ(jSONObject, "aid", "4444", "device_id", PK0.LIZLLL().LIZ()));
    }

    public static C63987P9j LJIIIIZZ(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                return new C63987P9j(201);
            }
            return LIZLLL(str, str2.getBytes(), FCX.GZIP);
        } catch (Throwable th) {
            C78685UuP.LJLIL();
            return new C63987P9j(207, th);
        }
    }

    public static String LJIIJJI(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new java.net.URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append("?");
                    str = X1D.LIZIZ(LIZ2);
                }
            } else if (!str.endsWith("&")) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str);
                LIZ3.append("&");
                str = X1D.LIZIZ(LIZ3);
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str);
            LIZ4.append(str2);
            str = X1D.LIZIZ(LIZ4);
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static C63987P9j LIZLLL(String str, byte[] bArr, FCX fcx) {
        String str2;
        String str3 = str;
        if (PKZ.LJI) {
            return new C63987P9j(201);
        }
        if (str3 == null) {
            return new C63987P9j(201);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        String str4 = null;
        if (FCX.GZIP == fcx && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.close();
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (Throwable unused) {
                    C78685UuP.LJLIL();
                    gZIPOutputStream.close();
                    bArr = null;
                }
                str4 = "gzip";
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else if (FCX.DEFLATER == fcx && length > 128) {
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
            str4 = "deflate";
        }
        if (bArr == null) {
            return new C63987P9j(202);
        }
        PK0.LJIIIIZZ.getEncryptImpl().getClass();
        byte[] LIZ2 = EncryptorUtil.LIZ(bArr.length, bArr);
        if (LIZ2 != null) {
            if (TextUtils.isEmpty(new java.net.URL(str3).getQuery())) {
                if (!str3.endsWith("?")) {
                    str3 = i0.LJFF(str3, "?");
                }
            } else if (!str3.endsWith("&")) {
                str3 = i0.LJFF(str3, "&");
            }
            str3 = i0.LJFF(str3, "tt_data=a");
            str2 = "application/octet-stream;tt-data=a";
        } else {
            str2 = "application/json; charset=utf-8";
            LIZ2 = bArr;
        }
        return LJ(str3, LIZ2, str2, str4, "POST", true);
    }

    public static C63987P9j LJIIIZ(String str, String str2, File... fileArr) {
        return LJIIJ("unknown_old", str, str2, null, new PK7(fileArr, true));
    }

    public static C63987P9j LJIIJ(String str, String str2, String str3, File file, PK7... pk7Arr) {
        if (PKZ.LJI) {
            return new C63987P9j(201);
        }
        try {
            C63980P9c c63980P9c = new C63980P9c(LJIIJJI(str2, "have_dump=true&encrypt=true"), true);
            c63980P9c.LJ("json", str3, true);
            if (pk7Arr != null) {
                c63980P9c.LIZJ(pk7Arr);
            }
            if (file != null) {
                c63980P9c.LIZIZ(file);
            }
            try {
                new JSONObject(c63980P9c.LJI(str));
                C78685UuP.LJJJLL();
                return new C63987P9j((Object) null);
            } catch (JSONException e) {
                C78685UuP.LJJJLL();
                return new C63987P9j(0, e);
            }
        } catch (IOException e2) {
            C16880lQ.LLLLIIL(e2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("err upload crash log ");
            LIZ2.append(e2);
            X1D.LIZIZ(LIZ2);
            C78685UuP.LJLILLLLZI();
            return new C63987P9j(207);
        }
    }

    public static C63987P9j LJ(String str, byte[] bArr, String str2, String str3, String str4, boolean z) {
        InputStream inputStream;
        byte[] LJII;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) LIZ(new java.net.URL(str));
            try {
                if (z) {
                    httpURLConnection2.setDoOutput(true);
                } else {
                    httpURLConnection2.setDoOutput(false);
                }
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty("Content-Encoding", str3);
                }
                httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection2.setRequestMethod(str4);
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            FPX.LIZIZ(dataOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            FPX.LIZIZ(dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode == 200) {
                    inputStream = httpURLConnection2.getInputStream();
                    try {
                        if ("gzip".equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                            try {
                                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                                try {
                                    LJII = LJII(gZIPInputStream2);
                                    FPX.LIZIZ(gZIPInputStream2);
                                } catch (Throwable th3) {
                                    th = th3;
                                    gZIPInputStream = gZIPInputStream2;
                                    FPX.LIZIZ(gZIPInputStream);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            LJII = LJII(inputStream);
                        }
                        C63987P9j c63987P9j = new C63987P9j(LJII);
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused) {
                        }
                        FPX.LIZIZ(inputStream);
                        return c63987P9j;
                    } catch (Throwable th5) {
                        th = th5;
                        httpURLConnection = httpURLConnection2;
                        try {
                            C78685UuP.LJJ();
                            return new C63987P9j(207, th);
                        } finally {
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception unused2) {
                                }
                            }
                            FPX.LIZIZ(inputStream);
                        }
                    }
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("http response code ");
                LIZ2.append(responseCode);
                X1D.LIZIZ(LIZ2);
                C63987P9j c63987P9j2 = new C63987P9j();
                try {
                    httpURLConnection2.disconnect();
                } catch (Exception unused3) {
                }
                return c63987P9j2;
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }
}
