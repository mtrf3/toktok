package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.QlA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67920QlA extends UnsupportedOperationException {
    public final Feature LJLIL;

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.LJLIL));
    }

    public C67920QlA(Feature feature) {
        this.LJLIL = feature;
    }
}
