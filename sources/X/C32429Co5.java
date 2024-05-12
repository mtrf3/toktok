package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Co5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32429Co5 extends C32425Co1 {
    public final int LJLILLLLZI;
    public final C63932P7g LJLJI;

    @Override // X.C32425Co1, java.lang.Throwable
    public String getMessage() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJI.toString());
        LIZ.append('\n');
        LIZ.append(super.getMessage());
        return X1D.LIZIZ(LIZ);
    }

    public final int getErrorCode() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32429Co5(String str, Throwable th, C32420Cnw c32420Cnw, int i, C63932P7g downloadRequest) {
        super(str, th, c32420Cnw);
        o.LJIIIZ(downloadRequest, "downloadRequest");
        this.LJLILLLLZI = i;
        this.LJLJI = downloadRequest;
    }
}
