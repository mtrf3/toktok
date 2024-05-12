package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.a5j, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92127a5j extends AbstractC91689Zyf<float[]> {
    public C92127a5j() {
        super(true);
    }

    @Override // X.AbstractC91689Zyf
    public final String LIZIZ() {
        return "float[]";
    }

    @Override // X.AbstractC91689Zyf
    public final float[] LIZJ(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [float[], java.lang.Object] */
    @Override // X.AbstractC91689Zyf
    public final float[] LIZ(Bundle bundle, String str) {
        return C16880lQ.LLJJIII(bundle, str);
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, float[] fArr) {
        o.LJIIIZ(key, "key");
        bundle.putFloatArray(key, fArr);
    }
}
