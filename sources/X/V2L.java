package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2L extends AbstractC65781Prl implements InterfaceC88472Yns<C24590xr, InterfaceC24580xq> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ InterfaceC23370vt LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ InterfaceC35811ar<C113524cu> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2L(Context context, int i, float f, InterfaceC23370vt interfaceC23370vt, float f2, long j, boolean z, InterfaceC35811ar<C113524cu> interfaceC35811ar) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = i;
        this.LJLJI = f;
        this.LJLJJI = interfaceC23370vt;
        this.LJLJJL = f2;
        this.LJLJJLL = j;
        this.LJLJL = z;
        this.LJLJLJ = interfaceC35811ar;
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC24580xq invoke(C24590xr DisposableEffect) {
        int LJJIJ;
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        this.LJLJLJ.setValue(new C113524cu(this.LJLIL, this.LJLILLLLZI));
        C113524cu LIZIZ = V2K.LIZIZ(this.LJLJLJ);
        int i = -1;
        if (C23390vv.LIZJ(this.LJLJI, Float.NaN)) {
            LJJIJ = -1;
        } else {
            LJJIJ = this.LJLJJI.LJJIJ(this.LJLJI);
        }
        LIZIZ.LJI(LJJIJ);
        C113524cu LIZIZ2 = V2K.LIZIZ(this.LJLJLJ);
        if (!C23390vv.LIZJ(this.LJLJJL, Float.NaN)) {
            i = this.LJLJJI.LJJIJ(this.LJLJJL);
        }
        LIZIZ2.LIZLLL(i);
        if (!C11850dJ.LIZJ(this.LJLJJLL, C11850dJ.LJI)) {
            V2K.LIZIZ(this.LJLJLJ).LJ(C78897Uxp.LJJJZ(this.LJLJJLL));
        }
        V2K.LIZIZ(this.LJLJLJ).LIZJ(this.LJLJL);
        V2K.LIZIZ(this.LJLJLJ).LJIIIIZZ();
        return new V2M(this.LJLJLJ);
    }
}
