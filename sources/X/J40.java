package X;

import com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J40 implements InterfaceC48512J2e {
    @Override // X.InterfaceC48512J2e
    public final void LIZ(boolean z, int i, C48044ItM c48044ItM, IFF iff) {
        String str;
        SmartCommonPreloadService.Companion.getClass();
        if (z && c48044ItM != null) {
            String str2 = c48044ItM.LIZ;
            if (str2 != null) {
                str = str2.toLowerCase();
                o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase()");
            } else {
                str = null;
            }
            o.LJ(str, "true");
            Float LIZIZ = c48044ItM.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.floatValue();
            }
        }
    }
}
