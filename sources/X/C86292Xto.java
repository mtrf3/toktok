package X;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback;
import kotlin.jvm.internal.o;

/* renamed from: X.Xto, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86292Xto implements IHostPermissionDepend {
    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend
    public final boolean hasPermission(Activity activity, String str) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(str, OHQ.LIZ);
        if (C04330Ez.LIZ(activity, str) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend
    public final void requestPermission(Activity activity, OnPermissionGrantCallback callback, String str, Cert cert) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(str, OHQ.LIZ);
        o.LJIIIZ(cert, "cert");
        C61099NyR.LIZIZ.LIZIZ(activity, cert).LIZ(str).LIZJ(new C86293Xtp(callback, str));
    }
}
