package X;

import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.2sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72512sx extends RuntimeException {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final Throwable LJLJI;

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WatermarkBizException(errorCode=");
        LIZ.append(this.LJLIL);
        LIZ.append(", errorMessage=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.LJLJI;
    }

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final String getErrorMessage() {
        return this.LJLILLLLZI;
    }

    public C72512sx(int i, String str, Throwable th) {
        super(str);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = th;
    }

    public /* synthetic */ C72512sx(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : th);
    }
}
