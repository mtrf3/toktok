package X;

import com.google.android.play.core.assetpacks.r2;
import kotlin.jvm.internal.o;

/* renamed from: X.259, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass259 extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, InterfaceC07790Sh> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C0X9 LJLJI;
    public final /* synthetic */ InterfaceC21550sx LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ float LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass259(boolean z, boolean z2, C1OH c1oh, InterfaceC21550sx interfaceC21550sx, float f, float f2) {
        super(3);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = c1oh;
        this.LJLJJI = interfaceC21550sx;
        this.LJLJJL = f;
        this.LJLJJLL = f2;
    }

    @Override // X.InterfaceC88473Ynt
    public final InterfaceC07790Sh invoke(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        C111074Xn.LIZIZ(num, interfaceC07790Sh, "$this$composed", interfaceC24520xk2, 1398930845);
        InterfaceC35811ar LIZ = C79234V7u.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC24520xk2, 0);
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        C0SX indicatorBorder = (C0SX) LIZ.getValue();
        o.LJIIIZ(c1m1, "<this>");
        o.LJIIIZ(indicatorBorder, "indicatorBorder");
        InterfaceC07790Sh LJIIIIZZ = r2.LJIIIIZZ(c1m1, new C25Z(indicatorBorder.LIZ, indicatorBorder));
        interfaceC24520xk2.LJJIJIIJIL();
        return LJIIIIZZ;
    }
}
