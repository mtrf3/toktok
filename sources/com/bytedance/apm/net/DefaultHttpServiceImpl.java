package com.bytedance.apm.net;

import X.C03880Dg;
import X.C17N;
import X.C36631EZf;
import X.C36633EZh;
import X.C39016FSy;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C80036Vb6;
import X.InterfaceC36632EZg;
import X.P9X;
import X.PPC;
import X.PPD;
import X.PPY;
import X.PY7;
import X.PYT;
import X.PYU;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.services.apm.api.IHttpService;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public class DefaultHttpServiceImpl implements IHttpService {
    public static String METHOD_GET = "GET";
    public static String METHOD_POST = "POST";

    public static URLConnection com_bytedance_apm_net_DefaultHttpServiceImpl_java_net_URL_openConnection(URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "5268763444250897249"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static URLConnection INVOKEVIRTUAL_com_bytedance_apm_net_DefaultHttpServiceImpl_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return com_bytedance_apm_net_DefaultHttpServiceImpl_java_net_URL_openConnection(url);
        }
        PPC<URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
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
            URLConnection com_bytedance_apm_net_DefaultHttpServiceImpl_java_net_URL_openConnection = com_bytedance_apm_net_DefaultHttpServiceImpl_java_net_URL_openConnection(url);
            if (com_bytedance_apm_net_DefaultHttpServiceImpl_java_net_URL_openConnection instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) com_bytedance_apm_net_DefaultHttpServiceImpl_java_net_URL_openConnection);
            } else {
                if (!(com_bytedance_apm_net_DefaultHttpServiceImpl_java_net_URL_openConnection instanceof HttpURLConnection)) {
                    return com_bytedance_apm_net_DefaultHttpServiceImpl_java_net_URL_openConnection;
                }
                pyu = new PYU((HttpURLConnection) com_bytedance_apm_net_DefaultHttpServiceImpl_java_net_URL_openConnection);
            }
            return pyu;
        }
        throw runtimeException;
    }

    public static byte[] toByteArray(InputStream inputStream) {
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

    @Override // com.bytedance.services.apm.api.IHttpService
    public C36633EZh doGet(String str, Map<String, String> map) {
        return doRequest(str, null, METHOD_GET, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public InterfaceC36632EZg buildMultipartUpload(String str, String str2, boolean z) {
        return new P9X(str, str2, z, null);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C36633EZh doPost(String str, byte[] bArr, Map<String, String> map) {
        return doRequest(str, bArr, METHOD_POST, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C36633EZh uploadFiles(String str, List<File> list, Map<String, String> map) {
        return C36631EZf.LIZ(str, list, map);
    }

    private C36633EZh doRequest(String str, byte[] bArr, String str2, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        byte[] byteArray;
        if (str2 != null) {
            try {
                httpURLConnection = (HttpURLConnection) INVOKEVIRTUAL_com_bytedance_apm_net_DefaultHttpServiceImpl_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(str));
                try {
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    if (map != null && !map.isEmpty()) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            if (entry != null) {
                                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (TextUtils.equals(str2, METHOD_POST)) {
                        httpURLConnection.setDoOutput(true);
                    } else {
                        httpURLConnection.setDoOutput(false);
                    }
                    httpURLConnection.setRequestMethod(str2);
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
                                byteArray = toByteArray(gZIPInputStream);
                                gZIPInputStream.close();
                            } else {
                                byteArray = toByteArray(inputStream);
                            }
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            HashMap hashMap = new HashMap();
                            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                                List<String> value = entry2.getValue();
                                String key = entry2.getKey();
                                if (value != null && !C17N.LJJIIZI(value)) {
                                    hashMap.put(key, value.get(0));
                                }
                            }
                            C36633EZh c36633EZh = new C36633EZh(responseCode, hashMap, byteArray);
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
                            return c36633EZh;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("http request msg: ");
                                LIZ.append(th.getMessage());
                                LIZ.append(" ,stack: ");
                                LIZ.append(C39016FSy.LIZ(10, th));
                                C80036Vb6.LJIIIIZZ("apm_debug", X1D.LIZIZ(LIZ));
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception unused3) {
                                    }
                                }
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception unused4) {
                                    }
                                }
                                return null;
                            } finally {
                            }
                        }
                    } else {
                        C36633EZh c36633EZh2 = new C36633EZh(responseCode, null);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused5) {
                        }
                        return c36633EZh2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
                inputStream = null;
            }
        } else {
            throw new IllegalArgumentException("request method is not null");
        }
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public InterfaceC36632EZg buildMultipartUpload(String str, String str2, boolean z, Map<String, String> map) {
        return new P9X(str, str2, z, map);
    }
}
