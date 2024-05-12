package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.services.apm.api.IHttpService;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* renamed from: X.P9h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63985P9h {
    public static volatile Context LIZ;
    public static java.util.Map<String, String> LIZJ;
    public static final ConcurrentHashMap<Long, JSONObject> LIZIZ = new ConcurrentHashMap<>();
    public static volatile boolean LIZLLL = false;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> LIZIZ() {
        /*
            java.util.Map<java.lang.String, java.lang.String> r0 = X.C63985P9h.LIZJ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r4 = "device_id"
            java.lang.Object r0 = r0.get(r4)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L15
            java.util.Map<java.lang.String, java.lang.String> r0 = X.C63985P9h.LIZJ
            return r0
        L15:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject> r0 = X.C63985P9h.LIZIZ
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r3 = r0.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r1 = r3.next()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject> r0 = X.C63985P9h.LIZIZ
            java.lang.Object r2 = r0.get(r1)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            if (r2 != 0) goto L34
            goto L1f
        L34:
            java.lang.String r0 = r2.optString(r4)     // Catch: java.lang.Throwable -> L1f
            com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> L1f
            java.util.Map<java.lang.String, java.lang.String> r1 = X.C63985P9h.LIZJ     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r2.optString(r4)     // Catch: java.lang.Throwable -> L1f
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L1f
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L1f
        L46:
            java.util.Map<java.lang.String, java.lang.String> r0 = X.C63985P9h.LIZJ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63985P9h.LIZIZ():java.util.Map");
    }

    public static synchronized JSONObject LIZJ() {
        synchronized (C63985P9h.class) {
            ConcurrentHashMap<Long, JSONObject> concurrentHashMap = LIZIZ;
            Iterator<Long> it = concurrentHashMap.keySet().iterator();
            if (it.hasNext()) {
                return concurrentHashMap.get(it.next());
            }
            return null;
        }
    }

    public static synchronized boolean LIZLLL() {
        FileLock tryLock;
        synchronized (C63985P9h.class) {
            try {
                if (LIZLLL) {
                    return true;
                }
                File file = new File(C51029K0z.LJJII(), "file.lock");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
                if (channel != null && (tryLock = channel.tryLock()) != null) {
                    LIZLLL = tryLock.isValid();
                }
                return LIZLLL;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public static synchronized void LJ(String str, JSONObject jSONObject) {
        synchronized (C63985P9h.class) {
            try {
                LIZIZ.put(Long.valueOf(CastLongProtector.parseLong(str)), jSONObject);
            } catch (Exception e) {
                PAU.LIZIZ("setHeader", e);
            }
        }
    }

    public static C36633EZh LIZ(String str, java.util.Map<String, String> map, byte[] bArr) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        byte[] LJ;
        IHttpService iHttpService = (IHttpService) C171096nZ.LIZ(IHttpService.class);
        if (iHttpService != null) {
            return iHttpService.doPost(str, bArr, map);
        }
        try {
            httpURLConnection = (HttpURLConnection) P7X.LIZ(new java.net.URL(str));
            try {
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                HashMap hashMap = (HashMap) map;
                if (!hashMap.isEmpty()) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (entry != null) {
                            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                }
                httpURLConnection.setDoOutput(TextUtils.equals("POST", "POST"));
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
                            LJ = P9Y.LJ(gZIPInputStream);
                            gZIPInputStream.close();
                        } else {
                            LJ = P9Y.LJ(inputStream);
                        }
                        java.util.Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        HashMap hashMap2 = new HashMap();
                        for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (value != null && value.size() > 0) {
                                hashMap2.put(key, value.get(0));
                            }
                        }
                        C36633EZh c36633EZh = new C36633EZh(responseCode, hashMap2, LJ);
                        C78685UuP.LJIIIIZZ(inputStream);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused) {
                        }
                        return c36633EZh;
                    } catch (Throwable unused2) {
                        C78685UuP.LJIIIIZZ(inputStream);
                        if (httpURLConnection == null) {
                            return null;
                        }
                        try {
                            httpURLConnection.disconnect();
                            return null;
                        } catch (Exception unused3) {
                            return null;
                        }
                    }
                }
                C36633EZh c36633EZh2 = new C36633EZh(responseCode, null);
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused4) {
                }
                return c36633EZh2;
            } catch (Throwable unused5) {
                inputStream = null;
            }
        } catch (Throwable unused6) {
            httpURLConnection = null;
            inputStream = null;
        }
    }
}
