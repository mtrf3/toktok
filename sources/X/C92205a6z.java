package X;

import java.net.HttpURLConnection;

/* renamed from: X.a6z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92205a6z implements InterfaceC64717Pab {
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

    public C92205a6z(HttpURLConnection httpURLConnection) {
        this.LIZ = httpURLConnection;
    }
}
