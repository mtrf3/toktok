package X;

import android.graphics.drawable.Animatable;
import android.view.View;

/* renamed from: X.Sbn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72435Sbn extends AbstractC72439Sbr {
    public final /* synthetic */ W5E LJLIL;
    public final /* synthetic */ C72434Sbm LJLILLLLZI;

    public C72435Sbn(C72434Sbm c72434Sbm, W5E w5e) {
        this.LJLILLLLZI = c72434Sbm;
        this.LJLIL = w5e;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        C79083V1z.LIZIZ(this.LJLIL.hashCode(), "SmartCircleImageView", "wrapListenerIfNeed", C25620zW.LIZ("onFailed :", th));
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        C79083V1z.LIZ(this.LJLIL.hashCode(), "SmartCircleImageView", "wrapListenerIfNeed", "onComplete");
        if (animatable != null) {
            this.LJLILLLLZI.LJLLILLLL = true;
            this.LJLILLLLZI.LJLLL = true;
        } else {
            this.LJLILLLLZI.LJLLILLLL = false;
            this.LJLILLLLZI.LJLLL = false;
        }
    }
}
