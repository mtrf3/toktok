package X;

import android.util.Pair;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.lynx.jsbridge.network.HttpRequest;
import com.lynx.jsbridge.network.HttpResponse;
import com.lynx.net.NetApi;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class F9O implements Runnable {
    public final HttpRequest LJLIL;
    public final Callback LJLILLLLZI;

    public final void LIZ() {
        TypedByteArray typedByteArray;
        InterfaceC37276Ek4<TypedInput> doPost;
        HttpRequest httpRequest = this.LJLIL;
        String str = httpRequest.LIZ;
        String str2 = httpRequest.LIZIZ;
        if (str2 != null) {
            try {
                Pair<String, String> LIZJ = EZX.LIZJ(str2, httpRequest.LJFF);
                String str3 = (String) LIZJ.second;
                String str4 = (String) LIZJ.first;
                F9Q f9q = C78555UsJ.LJLILLLLZI;
                if (f9q == null) {
                    f9q = new C65085PgX();
                }
                F9P LIZ = f9q.LIZ(str4);
                java.util.Map<String, String> map = this.LJLIL.LIZLLL;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    if (entry.getValue() != null) {
                        arrayList.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                if (str.equalsIgnoreCase("GET")) {
                    NetApi netApi = (NetApi) LIZ.create(NetApi.class);
                    HttpRequest httpRequest2 = this.LJLIL;
                    doPost = netApi.doGet(httpRequest2.LJ, -1, str3, httpRequest2.LJFF, arrayList);
                } else if (str.equalsIgnoreCase("POST")) {
                    String str5 = (String) ((HashMap) this.LJLIL.LIZLLL).get("Content-Type");
                    byte[] bArr = this.LJLIL.LIZJ;
                    if (bArr != null) {
                        typedByteArray = new TypedByteArray(str5, bArr, new String[0]);
                    } else {
                        typedByteArray = new TypedByteArray(str5, new byte[0], new String[0]);
                    }
                    NetApi netApi2 = (NetApi) LIZ.create(NetApi.class);
                    HttpRequest httpRequest3 = this.LJLIL;
                    doPost = netApi2.doPost(httpRequest3.LJ, -1, str3, httpRequest3.LJFF, arrayList, typedByteArray);
                } else {
                    throw new IllegalArgumentException("Unsupported HTTP Method.");
                }
                HttpResponse httpResponse = new HttpResponse();
                httpResponse.LIZJ = this.LJLIL.LIZIZ;
                try {
                    C64797Pbt<TypedInput> execute = doPost.execute();
                    httpResponse.LIZ = execute.LIZ.LIZIZ;
                    httpResponse.LJ = new JavaOnlyMap();
                    for (EJ6 ej6 : execute.LIZ.LIZLLL) {
                        httpResponse.LJ.putString(ej6.LIZ, ej6.LIZIZ);
                    }
                    httpResponse.LIZLLL = execute.LIZIZ.mimeType();
                    httpResponse.LJFF = LIZIZ(execute.LIZIZ.in());
                } catch (C64698PaI e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(C16880lQ.LJLLJ(C64698PaI.class));
                    LIZ2.append(":");
                    LIZ2.append(e.getMessage());
                    httpResponse.LJI = X1D.LIZIZ(LIZ2);
                    httpResponse.LIZ = 0;
                    httpResponse.LIZIZ = e.getCronetInternalErrorCode();
                } catch (C64799Pbv e2) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(C16880lQ.LJLLJ(C64799Pbv.class));
                    LIZ3.append(":");
                    LIZ3.append(e2.getMessage());
                    LIZ3.append(",");
                    LIZ3.append(e2.getStatusCode());
                    httpResponse.LJI = X1D.LIZIZ(LIZ3);
                    httpResponse.LIZ = e2.getStatusCode();
                    httpResponse.LIZIZ = e2.getCronetInternalErrorCode();
                } catch (C64802Pby e3) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(C16880lQ.LJLLJ(C64802Pby.class));
                    LIZ4.append(":");
                    LIZ4.append(e3.getMessage());
                    LIZ4.append(",");
                    LIZ4.append(e3.getStatusCode());
                    httpResponse.LJI = X1D.LIZIZ(LIZ4);
                    httpResponse.LIZ = e3.getStatusCode();
                } catch (Exception e4) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(C16880lQ.LJLLJ(e4.getClass()));
                    LIZ5.append(":");
                    LIZ5.append(e4.getMessage());
                    httpResponse.LJI = X1D.LIZIZ(LIZ5);
                }
                this.LJLILLLLZI.invoke(httpResponse);
                return;
            } catch (IOException unused) {
                throw new IllegalArgumentException("Unsupported HTTP url. url is not valid.");
            }
        }
        throw new IllegalArgumentException("Unsupported HTTP url. url is empty.");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static byte[] LIZIZ(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read == -1) {
                bufferedInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public F9O(HttpRequest httpRequest, Callback callback) {
        this.LJLIL = httpRequest;
        this.LJLILLLLZI = callback;
    }
}
