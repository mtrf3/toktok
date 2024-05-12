package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.GaJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41767GaJ extends RuntimeException {
    public static final C41738GZq Companion = new C41738GZq();
    public static final Integer[] USER_NETWORK_BAD_CODES = {-5, -110, 120000};
    public final C43340Gzg LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C41767GaJ() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41767GaJ(C43340Gzg c43340Gzg) {
        this(c43340Gzg, null, 2, 0 == true ? 1 : 0);
    }

    public final long getErrorCode() {
        C43340Gzg c43340Gzg = this.LJLIL;
        if (c43340Gzg != null) {
            return c43340Gzg.LJFF;
        }
        return 0L;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadException(mInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public static final boolean isUserNetworkBad(int i) {
        Companion.getClass();
        return ORY.LJJIJIIJIL(Integer.valueOf(i), USER_NETWORK_BAD_CODES);
    }

    public C41767GaJ(C43340Gzg c43340Gzg, Throwable th) {
        super(th);
        this.LJLIL = c43340Gzg;
    }

    public /* synthetic */ C41767GaJ(C43340Gzg c43340Gzg, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c43340Gzg, (i & 2) != 0 ? null : th);
    }
}
