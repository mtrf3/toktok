package X;

import android.content.Context;
import com.bytedance.ies.bullet.kit.web.WebKitApi;

/* renamed from: X.NmM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60350NmM implements InterfaceC60463NoB {
    public final /* synthetic */ C60357NmT LIZ;

    public C60350NmM(C60357NmT c60357NmT) {
        this.LIZ = c60357NmT;
    }

    @Override // X.InterfaceC60463NoB
    public final C59614NaU create(Context context) {
        C60349NmL c60349NmL = this.LIZ.LIZ;
        if (c60349NmL != null) {
            c60349NmL.LIZ.getClass();
            return WebKitApi.LIZ(context);
        }
        return null;
    }
}
