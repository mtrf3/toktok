package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Fbo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39312Fbo implements InterfaceC39320Fbw {
    @Override // X.InterfaceC39320Fbw
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC39320Fbw
    public final C39316Fbs LIZ(C39316Fbs preInstallResult) {
        Object invoke;
        o.LJIIIZ(preInstallResult, "preInstallResult");
        try {
            invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "ro.product.tiktok.partnerid", "");
        } catch (Exception unused) {
        }
        if (invoke != null) {
            String str = (String) invoke;
            if (!TextUtils.isEmpty(str)) {
                C39310Fbm c39310Fbm = preInstallResult.LIZ;
                c39310Fbm.getClass();
                c39310Fbm.LJLIL = str;
                c39310Fbm.LJLLI = false;
                preInstallResult.LJ = true;
            }
            return preInstallResult;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
