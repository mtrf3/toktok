package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.a5n, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92131a5n extends AbstractC91689Zyf<long[]> {
    public C92131a5n() {
        super(true);
    }

    @Override // X.AbstractC91689Zyf
    public final String LIZIZ() {
        return "long[]";
    }

    @Override // X.AbstractC91689Zyf
    public final long[] LIZJ(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [long[], java.lang.Object] */
    @Override // X.AbstractC91689Zyf
    public final long[] LIZ(Bundle bundle, String str) {
        return C16880lQ.LLJJIII(bundle, str);
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, long[] jArr) {
        o.LJIIIZ(key, "key");
        bundle.putLongArray(key, jArr);
    }
}
