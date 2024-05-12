package X;

import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.P9c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63980P9c {
    public final String LIZ;
    public final HttpURLConnection LIZIZ;
    public final boolean LIZJ;
    public final C63983P9f LIZLLL;
    public final C63981P9d LJ;
    public final C63982P9e LJFF;
    public final C63993P9p LJI;

    public static URLConnection LJFF(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-5754964280974791372"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public final void LIZ(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                if (this.LIZJ) {
                    this.LJ.write(bArr, 0, read);
                } else {
                    this.LIZLLL.write(bArr, 0, read);
                }
            } else {
                fileInputStream.close();
                return;
            }
        }
    }

    public final void LIZIZ(File file) {
        this.LJFF.count();
        LIZLLL("minidmp", null);
        LIZ(file);
        LJII("\r\n".getBytes());
        this.LJI.LIZIZ(i0.LJFF("minidmp", "_size"), Long.valueOf(this.LJFF.count()));
    }

    public final void LIZJ(PK7... pk7Arr) {
        this.LJFF.count();
        LIZLLL("file", null);
        if (this.LIZJ) {
            PK8.LJIJI(this.LJ, pk7Arr);
        } else {
            PK8.LJIJI(this.LIZLLL, pk7Arr);
        }
        LJII("\r\n".getBytes());
        this.LJI.LIZIZ(i0.LJFF("file", "_size"), Long.valueOf(this.LJFF.count()));
    }

    public final String LJI(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("\r\n--");
        LIZ.append(this.LIZ);
        LIZ.append("--");
        LIZ.append("\r\n");
        byte[] bytes = X1D.LIZIZ(LIZ).getBytes();
        if (this.LIZJ) {
            this.LJ.write(bytes);
            this.LJ.LIZIZ();
            this.LJ.LIZ();
        } else {
            this.LIZLLL.write(bytes);
            this.LIZLLL.flush();
            this.LIZLLL.LIZ();
        }
        this.LJI.LIZ("data_type", str);
        this.LJI.LIZIZ("total_size", Long.valueOf(this.LJFF.LJLIL));
        this.LJI.LIZJ();
        int responseCode = this.LIZIZ.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.LIZIZ.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.LIZIZ.disconnect();
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            return sb.toString();
        }
        throw new IOException(KMP.LJ("Server returned non-OK status: ", responseCode));
    }

    public final void LJII(byte[] bArr) {
        if (this.LIZJ) {
            this.LJ.write(bArr);
        } else {
            this.LIZLLL.write(bArr);
        }
    }

    public C63980P9c(String str, boolean z) {
        Object LJFF;
        Object LJFF2;
        RuntimeException runtimeException;
        Object obj;
        this.LIZJ = z;
        StringBuilder LIZ = X1D.LIZ();
        String LIZLLL = C72545SdZ.LIZLLL(LIZ, "AAA", "AAA", LIZ);
        this.LIZ = LIZLLL;
        java.net.URL url = new java.net.URL(str);
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            LJFF = LJFF(url);
        } else {
            PPC<java.net.URL, URLConnection> LJFF3 = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
            PPD ppd = LJFF3.LJFF;
            if (ppd == PPD.INTERCEPT && (obj = LJFF3.LIZIZ) != null) {
                LJFF = (URLConnection) obj;
                if (LJFF instanceof HttpsURLConnection) {
                    LJFF2 = new PYT((HttpsURLConnection) LJFF);
                } else if (LJFF instanceof HttpURLConnection) {
                    LJFF2 = new PYU((HttpURLConnection) LJFF);
                }
                LJFF = LJFF2;
            } else if (ppd != PPD.EXCEPTION || (runtimeException = LJFF3.LJ) == null) {
                LJFF2 = LJFF(url);
                if (LJFF2 instanceof HttpsURLConnection) {
                    LJFF = new PYT((HttpsURLConnection) LJFF2);
                } else {
                    if (LJFF2 instanceof HttpURLConnection) {
                        LJFF = new PYU((HttpURLConnection) LJFF2);
                    }
                    LJFF = LJFF2;
                }
            } else {
                throw runtimeException;
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) LJFF;
        this.LIZIZ = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod("POST");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("multipart/form-data; boundary=");
        LIZ2.append(LIZLLL);
        httpURLConnection.setRequestProperty("Content-Type", X1D.LIZIZ(LIZ2));
        this.LJI = new C63993P9p("crash_upload_size");
        if (z) {
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            C63982P9e c63982P9e = new C63982P9e(httpURLConnection.getOutputStream());
            this.LJFF = c63982P9e;
            this.LJ = new C63981P9d(c63982P9e);
            return;
        }
        C63982P9e c63982P9e2 = new C63982P9e(httpURLConnection.getOutputStream());
        this.LJFF = c63982P9e2;
        this.LIZLLL = new C63983P9f(c63982P9e2);
    }

    public final void LIZLLL(String str, java.util.Map<String, String> map) {
        StringBuilder sb = new StringBuilder("--");
        YE1.LIZLLL(sb, this.LIZ, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb.append(str);
        sb.append("\"");
        if (map != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                sb.append("; ");
                sb.append((String) C1FJ.LIZJ(sb, (String) entry.getKey(), "=\"", entry));
                sb.append("\"");
            }
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        LJII(sb.toString().getBytes());
    }

    public final void LJ(String str, String str2, boolean z) {
        this.LJFF.count();
        StringBuilder sb = new StringBuilder("--");
        YE1.LIZLLL(sb, this.LIZ, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\nContent-Type: text/plain; charset=UTF-8\r\n\r\n");
        try {
            LJII(sb.toString().getBytes());
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            PK0.LJIIIIZZ.getEncryptImpl().getClass();
            bytes = EncryptorUtil.LIZ(bytes.length, bytes);
        }
        try {
            LJII(bytes);
            LJII("\r\n".getBytes());
        } catch (IOException unused2) {
        }
        this.LJI.LIZIZ(str.concat("_size"), Long.valueOf(this.LJFF.count()));
    }
}
