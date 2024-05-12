package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.a5h, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92125a5h extends AbstractC91689Zyf<boolean[]> {
    public C92125a5h() {
        super(true);
    }

    @Override // X.AbstractC91689Zyf
    public final String LIZIZ() {
        return "boolean[]";
    }

    @Override // X.AbstractC91689Zyf
    public final boolean[] LIZJ(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean[], java.lang.Object] */
    @Override // X.AbstractC91689Zyf
    public final boolean[] LIZ(Bundle bundle, String str) {
        return C16880lQ.LLJJIII(bundle, str);
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, boolean[] zArr) {
        o.LJIIIZ(key, "key");
        bundle.putBooleanArray(key, zArr);
    }
}
