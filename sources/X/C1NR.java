package X;

import android.util.Pair;
import com.benchmark.netUtils.BytebenchAPI;
import com.benchmark.network.ByteBenchRequest;
import com.benchmark.network.ByteBenchResponse;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.1NR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NR implements InterfaceC08580Vi {
    public final HashMap<String, String> LIZ = new HashMap<>();

    public final ByteArrayOutputStream LIZ(ByteBenchRequest byteBenchRequest, ByteBenchResponse byteBenchResponse) {
        ByteArrayOutputStream byteArrayOutputStream;
        C64797Pbt<TypedInput> execute;
        int read;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = new HashMap();
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            Pair<String, String> LIZJ = EZX.LIZJ(byteBenchRequest.mUrl, linkedHashMap);
            String str = C09590Zf.LJIILLIIL.LJIILL;
            String str2 = (String) LIZJ.second;
            boolean z = byteBenchRequest.mUseCommonParams;
            BytebenchAPI bytebenchAPI = (BytebenchAPI) C65083PgV.LJIIL(str).LIZ(BytebenchAPI.class);
            if (z) {
                linkedHashMap.putAll(this.LIZ);
            }
            HashMap<String, String> hashMap2 = byteBenchRequest.mHeaders;
            if (hashMap2 != null) {
                hashMap.putAll(hashMap2);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request headers: ");
            LIZ.append(hashMap.size());
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILJJIL("ByteBenchNetWorkImp");
            if (1 == byteBenchRequest.mHttpMethod) {
                execute = bytebenchAPI.doPost(str2, linkedHashMap, hashMap, PVP.LIZJ(C39745Fin.LIZJ(byteBenchRequest.mContentType), byteBenchRequest.mRequestBody)).execute();
            } else {
                execute = bytebenchAPI.doGet(str2, linkedHashMap).execute();
            }
            if (execute.LIZIZ()) {
                InputStream in = execute.LIZIZ.in();
                byte[] bArr = new byte[4096];
                byteArrayOutputStream = new ByteArrayOutputStream();
                do {
                    try {
                        read = in.read(bArr, 0, 4096);
                        if (read > 0) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } catch (IOException e) {
                        e = e;
                        C16880lQ.LLLLIIL(e);
                        byteBenchResponse.mMessage = e.getMessage();
                        return byteArrayOutputStream;
                    } catch (Exception e2) {
                        e = e2;
                        C16880lQ.LLLLIIL(e);
                        byteBenchResponse.mMessage = e.getMessage();
                        return byteArrayOutputStream;
                    }
                } while (read > 0);
                byteBenchResponse.mResponseLength = execute.LIZIZ.length();
                byteArrayOutputStream2 = byteArrayOutputStream;
            }
            byteBenchResponse.mHttpCode = execute.LIZ.LIZIZ;
            return byteArrayOutputStream2;
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream = byteArrayOutputStream2;
        } catch (Exception e4) {
            e = e4;
            byteArrayOutputStream = byteArrayOutputStream2;
        }
    }
}
