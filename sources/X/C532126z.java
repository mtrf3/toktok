package X;

import android.view.View;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.26z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C532126z extends AbstractC65781Prl implements InterfaceC88472Yns<C24590xr, InterfaceC24580xq> {
    public final /* synthetic */ C0MG LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C03770Cv<C55572Gb<T>> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532126z(C0MG c0mg, String str, C03770Cv<C55572Gb<T>> c03770Cv) {
        super(1);
        this.LJLIL = c0mg;
        this.LJLILLLLZI = str;
        this.LJLJI = c03770Cv;
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC24580xq invoke(C24590xr DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        final C0MF LIZLLL = this.LJLIL.LIZLLL(this.LJLILLLLZI, new IDqS420S0100000(this.LJLJI, (C03770Cv<C55572Gb<View>>) 177));
        return new InterfaceC24580xq() { // from class: X.1bK
            @Override // X.InterfaceC24580xq
            public final void dispose() {
                C0MF.this.LIZIZ();
            }
        };
    }
}
