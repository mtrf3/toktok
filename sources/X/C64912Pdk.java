package X;

import com.bytedance.retrofit2.client.Request;

/* renamed from: X.Pdk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64912Pdk {
    public final String LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;

    public /* synthetic */ C64912Pdk(String str, byte[] bArr, String str2) {
        this.LIZIZ = bArr;
        this.LIZ = str;
        this.LIZJ = str2;
    }

    public /* synthetic */ C64912Pdk(Request request) {
        String method = request.getMethod();
        if (method != null) {
            this.LIZ = method;
            this.LIZIZ = request.getBody();
            this.LIZJ = request.getRequestBody();
            return;
        }
        throw new NullPointerException("Method must not be null.");
    }
}
