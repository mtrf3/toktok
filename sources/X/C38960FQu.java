package X;

import java.net.URLEncoder;

/* renamed from: X.FQu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38960FQu implements InterfaceC88471Ynr<String, String, C76800UCe> {
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, String str2) {
        String encode = URLEncoder.encode(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sslocal://webcast_webview?url=");
        LIZ.append(encode);
        LIZ.append(str2);
        C38959FQt.LIZIZ(null, X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }
}
