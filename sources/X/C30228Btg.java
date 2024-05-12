package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Btg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30228Btg implements InterfaceC30264BuG {
    public final InterfaceViewOnClickListenerC30227Btf LJLIL;

    @Override // X.InterfaceC30264BuG
    public final long LLJZ() {
        return 500L;
    }

    public C30228Btg(InterfaceViewOnClickListenerC30227Btf legacy) {
        o.LJIIIZ(legacy, "legacy");
        this.LJLIL = legacy;
    }

    @Override // X.InterfaceC30264BuG
    public final boolean LLLILZJ(View view) {
        return this.LJLIL.LLLILZJ(view);
    }

    @Override // X.InterfaceC30264BuG
    public final void onClick(View view) {
        this.LJLIL.onClick(view);
    }

    @Override // X.InterfaceC30264BuG
    public final void LIZ(C30252Bu4 toolbarContext, C30158BsY c30158BsY) {
        o.LJIIIZ(toolbarContext, "toolbarContext");
        this.LJLIL.i(c30158BsY, toolbarContext.LIZJ);
    }

    @Override // X.InterfaceC30264BuG
    public final void LIZIZ(C30252Bu4 toolbarContext, InterfaceC30269BuL interfaceC30269BuL) {
        o.LJIIIZ(toolbarContext, "toolbarContext");
        this.LJLIL.Q4(interfaceC30269BuL, toolbarContext.LIZJ);
    }
}
