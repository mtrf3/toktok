package X;

import android.graphics.drawable.Animatable;
import android.view.View;

/* renamed from: X.Sbo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72436Sbo extends AbstractC72439Sbr {
    public final /* synthetic */ W5E LJLIL;
    public final /* synthetic */ C72434Sbm LJLILLLLZI;

    public C72436Sbo(C72434Sbm c72434Sbm, W5E w5e) {
        this.LJLILLLLZI = c72434Sbm;
        this.LJLIL = w5e;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uri :");
        LIZ.append(uri);
        LIZ.append("  throwable: ");
        LIZ.append(th);
        C79083V1z.LIZIZ(this.LJLIL.hashCode(), "SmartCircleImageView", "onFailed", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        this.LJLILLLLZI.LJLLILLLL = true;
        C79083V1z.LIZ(this.LJLIL.hashCode(), "SmartCircleImageView", "onComplete", C43588H8u.LIZ("uri :", uri));
    }
}
