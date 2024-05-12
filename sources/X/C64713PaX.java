package X;

import java.net.HttpURLConnection;

/* renamed from: X.PaX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64713PaX implements InterfaceC64717Pab {
    public final /* synthetic */ HttpURLConnection LIZ;

    @Override // X.InterfaceC64717Pab
    public final void LIZ() {
        try {
            HttpURLConnection httpURLConnection = this.LIZ;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable unused) {
        }
    }

    public C64713PaX(HttpURLConnection httpURLConnection) {
        this.LIZ = httpURLConnection;
    }
}
