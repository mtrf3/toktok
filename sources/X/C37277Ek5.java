package X;

import com.bytedance.retrofit2.SsHttpCall;

/* renamed from: X.Ek5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37277Ek5 implements InterfaceC65753PrJ {
    public final /* synthetic */ InterfaceC37276Ek4 LIZ;

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(Object obj) {
    }

    public C37277Ek5(SsHttpCall ssHttpCall) {
        this.LIZ = ssHttpCall;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable th) {
        C17N.LJ(this.LIZ.request().getUrl(), th);
        if (th instanceof C38333F2r) {
            this.LIZ.request().getUrl();
        }
    }
}
