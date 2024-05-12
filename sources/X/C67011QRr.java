package X;

import Y.ARunnableS30S0200000_11;
import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.QRr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67011QRr implements InterfaceC36298EMk {
    public final /* synthetic */ Context LIZ;

    public C67011QRr(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC36298EMk
    public final void LIZIZ(JSONObject jSONObject) {
        C36582EXi.LIZJ(new ARunnableS30S0200000_11(this.LIZ, jSONObject, 79));
    }

    @Override // X.InterfaceC36298EMk
    public final void onFailed(Throwable th) {
    }
}
