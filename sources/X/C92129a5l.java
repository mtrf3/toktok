package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.a5l, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92129a5l extends AbstractC91689Zyf<int[]> {
    public C92129a5l() {
        super(true);
    }

    @Override // X.AbstractC91689Zyf
    public final String LIZIZ() {
        return "integer[]";
    }

    @Override // X.AbstractC91689Zyf
    public final int[] LIZJ(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int[], java.lang.Object] */
    @Override // X.AbstractC91689Zyf
    public final int[] LIZ(Bundle bundle, String str) {
        return C16880lQ.LLJJIII(bundle, str);
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, int[] iArr) {
        o.LJIIIZ(key, "key");
        bundle.putIntArray(key, iArr);
    }
}
