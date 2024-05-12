package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;

/* renamed from: X.Ayh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27991Ayh<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ C27966AyI LIZ;
    public final /* synthetic */ InterfaceC73573Su9<BillInfoResponse> LIZIZ;
    public final /* synthetic */ long LIZJ;

    public C27991Ayh(C27966AyI c27966AyI, C73433Srt c73433Srt, long j) {
        this.LIZ = c27966AyI;
        this.LIZIZ = c73433Srt;
        this.LIZJ = j;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        ((QDX) c10k.LJIIJJI()).LIZIZ(new C27990Ayg(this.LIZ, this.LIZIZ, this.LIZJ));
        return c10k;
    }
}
