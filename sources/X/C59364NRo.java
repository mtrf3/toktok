package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NRo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59364NRo implements InterfaceC59366NRq<NSG> {
    public final NSG LJLIL;
    public final TuxIconView LJLILLLLZI;

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    public C59364NRo(NSH nsh) {
        this.LJLIL = nsh;
        View findViewById = nsh.LIZ.findViewById(R.id.r0);
        o.LJIIIIZZ(findViewById, "depend.container.findVie…ad_descriptive_fold_view)");
        this.LJLILLLLZI = (TuxIconView) findViewById;
    }

    @Override // X.InterfaceC59366NRq
    public final void LJJLIIIIJ(int i) {
        ((NSG) L9()).getContainer().setBackgroundColor(i);
    }

    @Override // X.InterfaceC59366NRq
    public final void LLZZZIL(int i) {
        C59363NRn.LIZ(this, i);
    }

    @Override // X.InterfaceC59366NRq
    public final void qM(int i) {
        C59363NRn.LIZIZ(this, i);
    }

    @Override // X.InterfaceC59366NRq
    public final void setVisibility(int i) {
        C59363NRn.LIZJ(this, i);
    }

    @Override // X.InterfaceC59366NRq
    public final void ur0(float f) {
        this.LJLILLLLZI.setRotation(f);
    }
}
