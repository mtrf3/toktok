package X;

import androidx.compose.ui.platform.g1;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.20c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C514220c extends AbstractC014804a implements InterfaceC44951pb {
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final float LJLJJLL;
    public final float LJLJL;
    public final float LJLJLJ;
    public final float LJLJLLL;
    public final float LJLL;
    public final float LJLLI;
    public final long LJLLILLLL;
    public final InterfaceC11790dD LJLLJ;
    public final boolean LJLLL;
    public final long LJLLLL;
    public final long LJLLLLLL;
    public final IDqS416S0100000 LJLZ;

    public C514220c() {
        throw null;
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC44951pb
    public final /* synthetic */ int LJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        return C79062V1e.LIZIZ(this, interfaceC39181gI, interfaceC274115t, i);
    }

    @Override // X.InterfaceC44951pb
    public final /* synthetic */ int LJIIJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        return C79062V1e.LIZLLL(this, interfaceC39181gI, interfaceC274115t, i);
    }

    @Override // X.InterfaceC44951pb
    public final /* synthetic */ int LJJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        return C79062V1e.LIZ(this, interfaceC39181gI, interfaceC274115t, i);
    }

    @Override // X.InterfaceC44951pb
    public final /* synthetic */ int LJJJIL(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        return C79062V1e.LIZJ(this, interfaceC39181gI, interfaceC274115t, i);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public final int hashCode() {
        return C61876OQe.LIZJ(this.LJLLLLLL) + C06540Nm.LIZ(this.LJLLLL, (C16880lQ.LLJILJIL(this.LJLLL) + ((this.LJLLJ.hashCode() + JBR.LIZJ(this.LJLLILLLL, C47959Irz.LIZIZ(this.LJLLI, C47959Irz.LIZIZ(this.LJLL, C47959Irz.LIZIZ(this.LJLJLLL, C47959Irz.LIZIZ(this.LJLJLJ, C47959Irz.LIZIZ(this.LJLJL, C47959Irz.LIZIZ(this.LJLJJLL, C47959Irz.LIZIZ(this.LJLJJL, C47959Irz.LIZIZ(this.LJLJJI, C47959Irz.LIZIZ(this.LJLJI, Float.floatToIntBits(this.LJLILLLLZI) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31 * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.LJLILLLLZI);
        sb.append(", scaleY=");
        sb.append(this.LJLJI);
        sb.append(", alpha = ");
        sb.append(this.LJLJJI);
        sb.append(", translationX=");
        sb.append(this.LJLJJL);
        sb.append(", translationY=");
        sb.append(this.LJLJJLL);
        sb.append(", shadowElevation=");
        sb.append(this.LJLJL);
        sb.append(", rotationX=");
        sb.append(this.LJLJLJ);
        sb.append(", rotationY=");
        sb.append(this.LJLJLLL);
        sb.append(", rotationZ=");
        sb.append(this.LJLL);
        sb.append(", cameraDistance=");
        sb.append(this.LJLLI);
        sb.append(", transformOrigin=");
        sb.append((Object) C12000dY.LIZJ(this.LJLLILLLL));
        sb.append(", shape=");
        sb.append(this.LJLLJ);
        sb.append(", clip=");
        sb.append(this.LJLLL);
        sb.append(", renderEffect=null, ambientShadowColor=");
        C78920UyC.LJ(this.LJLLLL, sb, ", spotShadowColor=");
        sb.append((Object) C11850dJ.LJIIIIZZ(this.LJLLLLLL));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        C514220c c514220c;
        if (obj instanceof C514220c) {
            c514220c = (C514220c) obj;
        } else {
            c514220c = null;
        }
        if (c514220c == null || this.LJLILLLLZI != c514220c.LJLILLLLZI || this.LJLJI != c514220c.LJLJI || this.LJLJJI != c514220c.LJLJJI || this.LJLJJL != c514220c.LJLJJL || this.LJLJJLL != c514220c.LJLJJLL || this.LJLJL != c514220c.LJLJL || this.LJLJLJ != c514220c.LJLJLJ || this.LJLJLLL != c514220c.LJLJLLL || this.LJLL != c514220c.LJLL || this.LJLLI != c514220c.LJLLI || this.LJLLILLLL != c514220c.LJLLILLLL || !o.LJ(this.LJLLJ, c514220c.LJLLJ) || this.LJLLL != c514220c.LJLLL || !o.LJ(null, null) || !C11850dJ.LIZJ(this.LJLLLL, c514220c.LJLLLL) || !C11850dJ.LIZJ(this.LJLLLLLL, c514220c.LJLLLLLL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // X.InterfaceC44951pb
    public final InterfaceC273515n LJIILL(InterfaceC44861pS measure, InterfaceC39071g7 interfaceC39071g7, long j) {
        InterfaceC273515n LJJLIL;
        o.LJIIIZ(measure, "$this$measure");
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(j);
        LJJLIL = measure.LJJLIL(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI, C113554cx.LJJJLIIL(), new IDqS172S0200000(LJJJIL, this, 45));
        return LJJLIL;
    }

    public C514220c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC11790dD interfaceC11790dD, boolean z, long j2, long j3) {
        super(g1.LIZ);
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = f3;
        this.LJLJJL = f4;
        this.LJLJJLL = f5;
        this.LJLJL = f6;
        this.LJLJLJ = f7;
        this.LJLJLLL = f8;
        this.LJLL = f9;
        this.LJLLI = f10;
        this.LJLLILLLL = j;
        this.LJLLJ = interfaceC11790dD;
        this.LJLLL = z;
        this.LJLLLL = j2;
        this.LJLLLLLL = j3;
        this.LJLZ = new IDqS416S0100000(this, 203);
    }
}
