package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aVv, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93751aVv implements View.OnClickListener {
    public final /* synthetic */ C93748aVs LJLIL;
    public final /* synthetic */ long LJLILLLLZI = 1200;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;

    public ViewOnClickListenerC93751aVv(C93748aVs c93748aVs, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = c93748aVs;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        if (this.LJLIL.LIZ(this.LJLILLLLZI) && !C93748aVs.LJ) {
            InterfaceC88472Yns interfaceC88472Yns = this.LJLJI;
            o.LJIIIIZZ(it, "it");
            interfaceC88472Yns.invoke(it);
        }
    }
}
