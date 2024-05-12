package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.acX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94161acX implements InterfaceC93645aUD {
    public InterfaceC88472Yns<? super View, C76800UCe> LIZ;
    public C93429aQj LIZIZ;

    @Override // X.InterfaceC93645aUD
    public final void hide() {
        C94034aaU.LIZ("StatusView", "hide");
        C93429aQj c93429aQj = this.LIZIZ;
        if (c93429aQj != null) {
            c93429aQj.setVisibility(8);
        }
    }

    @Override // X.InterfaceC93645aUD
    public final void LIZIZ(InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.InterfaceC93645aUD
    public final void LIZJ(EnumC93644aUC status) {
        C93429aQj c93429aQj;
        o.LJIIIZ(status, "status");
        if (status == EnumC93644aUC.NoNetwork) {
            C94034aaU.LIZ("StatusView", "show");
            C93429aQj c93429aQj2 = this.LIZIZ;
            if (c93429aQj2 != null) {
                c93429aQj2.setVisibility(0);
            }
            InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns = this.LIZ;
            if (interfaceC88472Yns != null && (c93429aQj = this.LIZIZ) != null) {
                c93429aQj.setRetryAction(interfaceC88472Yns);
            }
        }
    }

    @Override // X.InterfaceC93645aUD
    public final View LIZ(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        C94034aaU.LIZ("StatusView", "inflate");
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "parent.context");
        C93429aQj c93429aQj = new C93429aQj(context);
        this.LIZIZ = c93429aQj;
        viewGroup.addView(c93429aQj);
        C93429aQj c93429aQj2 = this.LIZIZ;
        if (c93429aQj2 != null) {
            c93429aQj2.setVisibility(8);
        }
        C93429aQj c93429aQj3 = this.LIZIZ;
        o.LJI(c93429aQj3);
        return c93429aQj3;
    }
}
