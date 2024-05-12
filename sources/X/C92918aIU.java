package X;

import android.graphics.Paint;
import kotlin.jvm.internal.o;

/* renamed from: X.aIU, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92918aIU extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC33691Tx, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ float LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92918aIU(long j, float f, float f2, float f3, float f4, float f5) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = f3;
        this.LJLJJL = f4;
        this.LJLJJLL = f5;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC33691Tx interfaceC33691Tx) {
        InterfaceC33691Tx drawBehind = interfaceC33691Tx;
        o.LJIIIZ(drawBehind, "$this$drawBehind");
        int LJJJZ = C78897Uxp.LJJJZ(C11850dJ.LIZIZ(this.LJLIL, this.LJLILLLLZI));
        int LJJJZ2 = C78897Uxp.LJJJZ(C11850dJ.LIZIZ(this.LJLIL, 0.0f));
        float f = this.LJLJI;
        float f2 = this.LJLJJI;
        float f3 = this.LJLJJL;
        float f4 = this.LJLJJLL;
        InterfaceC11750d9 LIZ = drawBehind.LJJIII().LIZ();
        C1QW c1qw = new C1QW();
        Paint paint = c1qw.LIZ;
        paint.setColor(LJJJZ2);
        paint.setShadowLayer(drawBehind.LJJJJIZL(f), drawBehind.LJJJJIZL(f2), drawBehind.LJJJJIZL(f3), LJJJZ);
        LIZ.LJII(0.0f, 0.0f, C10430b1.LIZLLL(drawBehind.LIZIZ()), C10430b1.LIZIZ(drawBehind.LIZIZ()), drawBehind.LJJJJIZL(f4), drawBehind.LJJJJIZL(f4), c1qw);
        return C76800UCe.LIZ;
    }
}
