package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;

/* renamed from: X.HrR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45377HrR implements InterfaceC87766YcU {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ AwemeSharePackage LIZIZ;
    public final /* synthetic */ InterfaceC62225ObV LIZJ;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZLLL;

    @Override // X.InterfaceC87766YcU
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC87766YcU
    public final void onStart() {
    }

    @Override // X.InterfaceC87766YcU
    public final void onCancel() {
        this.LIZLLL.invoke(Boolean.FALSE);
    }

    @Override // X.InterfaceC87766YcU
    public final void onFailed() {
        this.LIZLLL.invoke(Boolean.FALSE);
    }

    @Override // X.InterfaceC87766YcU
    public final void onSuccess(String str) {
        C62340OdM.LJIJ(this.LIZ, this.LIZIZ, this.LIZJ, str, this.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45377HrR(Context context, AwemeSharePackage awemeSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = context;
        this.LIZIZ = awemeSharePackage;
        this.LIZJ = interfaceC62225ObV;
        this.LIZLLL = interfaceC88472Yns;
    }
}
