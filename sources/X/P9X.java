package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.DataOutputStream;
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
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public final class P9X implements InterfaceC36632EZg {
    public final String LIZ;
    public final HttpURLConnection LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final java.util.Map<String, String> LJ;
    public final DataOutputStream LJFF;
    public final GZIPOutputStream LJI;

    public static URLConnection LIZLLL(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-4659551399085584907"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    @Override // X.InterfaceC36632EZg
    public final C36633EZh finish() {
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("\r\n--");
        LIZ.append(this.LIZ);
        LIZ.append("--");
        LIZ.append("\r\n");
        byte[] bytes = X1D.LIZIZ(LIZ).getBytes();
        if (this.LIZLLL) {
            this.LJI.write(bytes);
            this.LJI.finish();
            this.LJI.close();
        } else {
            this.LJFF.write(bytes);
            this.LJFF.flush();
            this.LJFF.close();
        }
        int responseCode = this.LIZIZ.getResponseCode();
        if (200 == responseCode) {
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
            return new C36633EZh(responseCode, sb.toString().getBytes());
        }
        throw new IOException(C0NY.LIZIZ("A non-OK status ", responseCode, " is returned by server"));
    }

    @Override // X.InterfaceC36632EZg
    public final void LIZ(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        YE1.LIZLLL(sb, this.LIZ, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\nContent-Type: text/plain; charset=");
        YE1.LIZLLL(sb, this.LIZJ, "\r\n\r\n", str2, "\r\n");
        try {
            if (this.LIZLLL) {
                this.LJI.write(sb.toString().getBytes());
            } else {
                this.LJFF.write(sb.toString().getBytes());
            }
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC36632EZg
    public final void LIZIZ(String str, java.util.Map map) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        sb.append(this.LIZ);
        sb.append("\r\nContent-Disposition: form-data; name=\"params.txt\"; filename=\"params.txt\"");
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            sb.append("; ");
            sb.append((String) C1FJ.LIZJ(sb, (String) entry.getKey(), "=\"", entry));
            sb.append("\"");
        }
        if (!TextUtils.isEmpty("text/plain")) {
            sb.append("\r\nContent-Type: text/plain\r\n");
        }
        sb.append("\r\n");
        if (this.LIZLLL) {
            this.LJI.write(sb.toString().getBytes());
        } else {
            this.LJFF.write(sb.toString().getBytes());
        }
        if (str == null) {
            str = "";
        }
        if (this.LIZLLL) {
            this.LJI.write(str.getBytes());
        } else {
            this.LJFF.write(str.getBytes());
        }
        if (this.LIZLLL) {
            this.LJI.write("\r\n".getBytes());
        } else {
            this.LJFF.write("\r\n".getBytes());
            this.LJFF.flush();
        }
    }

    @Override // X.InterfaceC36632EZg
    public final void LIZJ(String str, File file, java.util.Map map) {
        FileInputStream fileInputStream;
        String name = file.getName();
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        YE1.LIZLLL(sb, this.LIZ, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            sb.append("; ");
            sb.append((String) C1FJ.LIZJ(sb, (String) entry.getKey(), "=\"", entry));
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append("\r\nContent-Type: null\r\n");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.LIZLLL) {
            this.LJI.write(sb.toString().getBytes());
        } else {
            this.LJFF.write(sb.toString().getBytes());
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else if (this.LIZLLL) {
                            this.LJI.write(bArr, 0, read);
                        } else {
                            this.LJFF.write(bArr, 0, read);
                        }
                    }
                    fileInputStream.close();
                    if (this.LIZLLL) {
                        this.LJI.write("\r\n".getBytes());
                    } else {
                        this.LJFF.write("\r\n".getBytes());
                        this.LJFF.flush();
                    }
                } catch (IOException e) {
                }
            } catch (Throwable th) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
        } catch (IOException e2) {
            fileInputStream = null;
            throw e2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public P9X(String str, String str2, boolean z, java.util.Map<String, String> map) {
        Object LIZLLL;
        Object LIZLLL2;
        RuntimeException runtimeException;
        Object obj;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = map;
        StringBuilder LIZ = X1D.LIZ();
        this.LIZ = C72545SdZ.LIZLLL(LIZ, "AAA", "AAA", LIZ);
        java.net.URL url = new java.net.URL(str);
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
            LIZLLL = LIZLLL(url);
        } else {
            PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
            PPD ppd = LJFF.LJFF;
            if (ppd == PPD.INTERCEPT && (obj = LJFF.LIZIZ) != null) {
                LIZLLL = (URLConnection) obj;
                if (LIZLLL instanceof HttpsURLConnection) {
                    LIZLLL2 = new PYT((HttpsURLConnection) LIZLLL);
                } else if (LIZLLL instanceof HttpURLConnection) {
                    LIZLLL2 = new PYU((HttpURLConnection) LIZLLL);
                }
                LIZLLL = LIZLLL2;
            } else if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
                LIZLLL2 = LIZLLL(url);
                if (LIZLLL2 instanceof HttpsURLConnection) {
                    LIZLLL = new PYT((HttpsURLConnection) LIZLLL2);
                } else {
                    if (LIZLLL2 instanceof HttpURLConnection) {
                        LIZLLL = new PYU((HttpURLConnection) LIZLLL2);
                    }
                    LIZLLL = LIZLLL2;
                }
            } else {
                throw runtimeException;
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) LIZLLL;
        this.LIZIZ = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod("POST");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.LIZIZ.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        HttpURLConnection httpURLConnection2 = this.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("multipart/form-data; boundary=");
        LIZ2.append(this.LIZ);
        httpURLConnection2.setRequestProperty("Content-Type", X1D.LIZIZ(LIZ2));
        if (z) {
            this.LIZIZ.setRequestProperty("Content-Encoding", "gzip");
            this.LJI = new GZIPOutputStream(this.LIZIZ.getOutputStream());
        } else {
            this.LJFF = new DataOutputStream(this.LIZIZ.getOutputStream());
        }
    }
}
