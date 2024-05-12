package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.a5q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92134a5q extends AbstractC91689Zyf<String[]> {
    public C92134a5q() {
        super(true);
    }

    @Override // X.AbstractC91689Zyf
    public final String LIZIZ() {
        return "string[]";
    }

    @Override // X.AbstractC91689Zyf
    public final String[] LIZJ(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.String[]] */
    @Override // X.AbstractC91689Zyf
    public final String[] LIZ(Bundle bundle, String str) {
        return C16880lQ.LLJJIII(bundle, str);
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, String[] strArr) {
        o.LJIIIZ(key, "key");
        bundle.putStringArray(key, strArr);
    }
}
