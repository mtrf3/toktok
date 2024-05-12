package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.a5i, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92126a5i extends AbstractC91689Zyf<Boolean> {
    public C92126a5i() {
        super(false);
    }

    @Override // X.AbstractC91689Zyf
    public final String LIZIZ() {
        return "boolean";
    }

    @Override // X.AbstractC91689Zyf
    public final Boolean LIZJ(String str) {
        boolean z;
        if (o.LJ(str, "true")) {
            z = true;
        } else if (o.LJ(str, "false")) {
            z = false;
        } else {
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Boolean, java.lang.Object] */
    @Override // X.AbstractC91689Zyf
    public final Boolean LIZ(Bundle bundle, String str) {
        return C16880lQ.LLJJIII(bundle, str);
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(key, "key");
        bundle.putBoolean(key, booleanValue);
    }
}
