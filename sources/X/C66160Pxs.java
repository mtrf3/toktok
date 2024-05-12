package X;

import com.bytedance.helios.sdk.HeliosEnvImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Pxs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66160Pxs implements FTR<String> {
    @Override // X.FTR
    public final String name() {
        return "user_region";
    }

    @Override // X.FTR
    public final String getValue() {
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        String LJIIJ = heliosEnvImpl.LJIIJ();
        if (LJIIJ != null) {
            return LJIIJ;
        }
        return "";
    }
}
