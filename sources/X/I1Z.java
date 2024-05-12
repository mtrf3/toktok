package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I1Z extends AbstractC38911fr {
    public final /* synthetic */ C73893SzJ LJLILLLLZI;
    public final /* synthetic */ C79155V4t LJLJI;

    public I1Z(C73893SzJ c73893SzJ, C79155V4t c79155V4t) {
        this.LJLILLLLZI = c73893SzJ;
        this.LJLJI = c79155V4t;
    }

    @Override // X.AbstractC38911fr
    public final void LJJII(long j, String downloadUrl) {
        o.LJIIIZ(downloadUrl, "downloadUrl");
        this.LJLILLLLZI.onNext(Long.valueOf(j));
        this.LJLILLLLZI.onComplete();
    }

    @Override // X.AbstractC38911fr
    public final void LJJIFFI(String downloadUrl, long j, Exception exc, Integer num) {
        o.LJIIIZ(downloadUrl, "downloadUrl");
        C73893SzJ c73893SzJ = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Filter downloading failed, id : ");
        LIZ.append(this.LJLJI.LIZ);
        LIZ.append(", name : ");
        c73893SzJ.onError(new C45938I1e(q.LIZIZ(LIZ, this.LJLJI.LIZJ, '.', LIZ), exc, num, Long.valueOf(j)));
    }
}
