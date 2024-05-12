package X;

import Y.IDdS381S0100000_31;
import com.bytedance.pipo.checkout.api.network.RetrofitAPIService;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;

/* renamed from: X.a5F, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92097a5F {
    public static byte[] LIZJ(InputStream inputStream) {
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

    public static final void LIZ(String str, java.util.Map<String, String> map, InterfaceC92098a5G interfaceC92098a5G) {
        java.net.URL url;
        try {
            url = new java.net.URL(str);
        } catch (MalformedURLException e) {
            C16880lQ.LLLLIIL(e);
            url = null;
        }
        ((RetrofitAPIService) C65083PgV.LJIIIIZZ(RetrofitAPIService.class, url.getProtocol() + "://" + url.getHost())).get(str, map).enqueue(new IDdS381S0100000_31(interfaceC92098a5G, 1));
    }

    public static final void LIZIZ(String str, java.util.Map<String, String> map, InterfaceC92098a5G interfaceC92098a5G) {
        java.net.URL url;
        try {
            url = new java.net.URL(str);
        } catch (MalformedURLException e) {
            C16880lQ.LLLLIIL(e);
            url = null;
        }
        ((RetrofitAPIService) C65083PgV.LJIIIIZZ(RetrofitAPIService.class, url.getProtocol() + "://" + url.getHost())).post(str, map).enqueue(new IDdS381S0100000_31(interfaceC92098a5G, 0));
    }
}
