package X;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.e;
import com.twitter.sdk.android.core.AuthTokenAdapter;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;

/* renamed from: X.PjH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65255PjH implements InterfaceC65274Pja<C65256PjI> {
    public final Gson LIZ;

    public C65255PjH() {
        e eVar = new e();
        eVar.LIZIZ(new AuthTokenAdapter(), GuestAuthToken.class);
        this.LIZ = eVar.LIZ();
    }

    @Override // X.InterfaceC65274Pja
    public final String LIZ(C65256PjI c65256PjI) {
        C65256PjI c65256PjI2 = c65256PjI;
        if (c65256PjI2 != null && c65256PjI2.authToken != 0) {
            try {
                return this.LIZ.LJIILL(c65256PjI2);
            } catch (Exception e) {
                C44432HcC LIZIZ = C65265PjR.LIZIZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed to serialize session ");
                LIZ.append(e.getMessage());
                X1D.LIZIZ(LIZ);
                LIZIZ.getClass();
            }
        }
        return "";
    }

    @Override // X.InterfaceC65274Pja
    public final C65256PjI LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return (C65256PjI) this.LIZ.LJI(str, C65256PjI.class);
            } catch (Exception e) {
                C44432HcC LIZIZ = C65265PjR.LIZIZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed to deserialize session ");
                LIZ.append(e.getMessage());
                X1D.LIZIZ(LIZ);
                LIZIZ.getClass();
            }
        }
        return null;
    }
}
