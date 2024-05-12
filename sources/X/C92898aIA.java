package X;

import com.google.android.play.core.assetpacks.r2;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aIA, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92898aIA extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ InterfaceC24760y8<C23390vv> LJLILLLLZI;
    public final /* synthetic */ List<InterfaceC91996a3c> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC91996a3c, C76800UCe> LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92898aIA(float f, C44001o4 c44001o4, List list, String str, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(2);
        this.LJLIL = f;
        this.LJLILLLLZI = c44001o4;
        this.LJLJI = list;
        this.LJLJJI = str;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            float f = 4;
            C43401n6 LIZ = C17480mO.LIZ(f);
            long j = C91671ZyN.LIZ(interfaceC24520xk2).LIZIZ;
            C1M1 coloredShadow = InterfaceC07790Sh.LJJJI;
            o.LJIIIZ(coloredShadow, "$this$coloredShadow");
            C21790tL.LIZ(C70657RoD.LJIJJ(C09290Yb.LJIILJJIL(C09290Yb.LJIIIZ(r2.LJI(coloredShadow, new C92918aIU(C91671ZyN.LIZ(interfaceC24520xk2).LJIL, 0.1f, 20, 0, f, 10)), 0.0f, this.LJLIL, 1), this.LJLILLLLZI.getValue().LJLIL), 16, 0.0f, 2), LIZ, j, 0L, null, 0.0f, C1DJ.LJ(interfaceC24520xk2, -819890304, new C92905aIH(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL)), interfaceC24520xk2, 1572864, 56);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
