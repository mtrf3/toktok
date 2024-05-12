package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: X.Sbq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72438Sbq implements InterfaceC70769Rq1 {
    public final /* synthetic */ InterfaceC70769Rq1 LJLIL;
    public final /* synthetic */ W5E LJLILLLLZI;
    public final /* synthetic */ C72434Sbm LJLJI;

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
        this.LJLIL.LJLLLLLL(uri);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uri :");
        LIZ.append(uri);
        C79083V1z.LJFF(this.LJLILLLLZI.hashCode(), "SmartCircleImageView", "onRelease", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
        this.LJLIL.D1(uri, c2047581v);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uri :");
        LIZ.append(uri);
        C79083V1z.LJFF(this.LJLILLLLZI.hashCode(), "SmartCircleImageView", "onIntermediateImageSet", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
        this.LJLIL.LLZZJLIL(uri, th);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uri :");
        LIZ.append(uri);
        LIZ.append("  throwable: ");
        LIZ.append(th);
        C79083V1z.LIZIZ(this.LJLILLLLZI.hashCode(), "SmartCircleImageView", "onIntermediateImageFailed", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        this.LJLIL.T1(uri, smartImageView);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uri :");
        LIZ.append(uri);
        C79083V1z.LJFF(this.LJLILLLLZI.hashCode(), "SmartCircleImageView", "onStart", X1D.LIZIZ(LIZ));
    }

    public C72438Sbq(C72434Sbm c72434Sbm, InterfaceC70769Rq1 interfaceC70769Rq1, W5E w5e) {
        this.LJLJI = c72434Sbm;
        this.LJLIL = interfaceC70769Rq1;
        this.LJLILLLLZI = w5e;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        this.LJLIL.s2(uri, view, th);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uri :");
        LIZ.append(uri);
        LIZ.append("  throwable: ");
        LIZ.append(th);
        C79083V1z.LIZIZ(this.LJLILLLLZI.hashCode(), "SmartCircleImageView", "onFailed", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        this.LJLJI.LJLLILLLL = true;
        this.LJLIL.U0(uri, view, c2047581v, animatable);
        C79083V1z.LIZ(this.LJLILLLLZI.hashCode(), "SmartCircleImageView", "onComplete", C43588H8u.LIZ("uri :", uri));
    }
}
