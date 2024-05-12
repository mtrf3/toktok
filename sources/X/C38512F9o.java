package X;

import com.bytedance.lynx.hybrid.service.IResourceService;

/* renamed from: X.F9o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38512F9o implements InterfaceC37489EnV {
    public final /* synthetic */ O31 LIZ;
    public final /* synthetic */ C38511F9n LIZIZ;
    public final /* synthetic */ BQ6 LIZJ;
    public final /* synthetic */ BQ6 LIZLLL;

    public C38512F9o(O31 o31, C38511F9n c38511F9n, InterfaceC37454Emw interfaceC37454Emw, BQ6 bq6, BQ6 bq62) {
        this.LIZ = o31;
        this.LIZIZ = c38511F9n;
        this.LIZJ = bq6;
        this.LIZLLL = bq62;
    }

    @Override // X.InterfaceC37489EnV
    public final void release() {
        ((IResourceService) this.LIZIZ.LIZ).cancel(this.LIZ);
    }
}
