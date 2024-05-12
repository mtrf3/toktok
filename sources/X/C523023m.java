package X;

import androidx.compose.ui.platform.g1;
import kotlin.jvm.internal.IDqS16S0101000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS425S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.23m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C523023m extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C18810oX LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C08370Un LJLJI;
    public final /* synthetic */ C18690oL LJLJJI;
    public final /* synthetic */ C15010iP LJLJJL;
    public final /* synthetic */ InterfaceC14810i5 LJLJJLL;
    public final /* synthetic */ InterfaceC07790Sh LJLJL;
    public final /* synthetic */ InterfaceC07790Sh LJLJLJ;
    public final /* synthetic */ InterfaceC07790Sh LJLJLLL;
    public final /* synthetic */ InterfaceC07790Sh LJLL;
    public final /* synthetic */ InterfaceC14660hq LJLLI;
    public final /* synthetic */ C20140qg LJLLILLLL;
    public final /* synthetic */ boolean LJLLJ;
    public final /* synthetic */ boolean LJLLL;
    public final /* synthetic */ InterfaceC88472Yns<C0VG, C76800UCe> LJLLLL;
    public final /* synthetic */ InterfaceC23370vt LJLLLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C523023m(C18810oX c18810oX, int i, C08370Un c08370Un, C18690oL c18690oL, C15010iP c15010iP, InterfaceC14810i5 interfaceC14810i5, InterfaceC07790Sh interfaceC07790Sh, InterfaceC07790Sh interfaceC07790Sh2, InterfaceC07790Sh interfaceC07790Sh3, InterfaceC07790Sh interfaceC07790Sh4, InterfaceC14660hq interfaceC14660hq, C20140qg c20140qg, boolean z, boolean z2, InterfaceC88472Yns<? super C0VG, C76800UCe> interfaceC88472Yns, InterfaceC23370vt interfaceC23370vt) {
        super(2);
        this.LJLIL = c18810oX;
        this.LJLILLLLZI = i;
        this.LJLJI = c08370Un;
        this.LJLJJI = c18690oL;
        this.LJLJJL = c15010iP;
        this.LJLJJLL = interfaceC14810i5;
        this.LJLJL = interfaceC07790Sh;
        this.LJLJLJ = interfaceC07790Sh2;
        this.LJLJLLL = interfaceC07790Sh3;
        this.LJLL = interfaceC07790Sh4;
        this.LJLLI = interfaceC14660hq;
        this.LJLLILLLL = c20140qg;
        this.LJLLJ = z;
        this.LJLLL = z2;
        this.LJLLLL = interfaceC88472Yns;
        this.LJLLLLLL = interfaceC23370vt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC07790Sh c523423q;
        InterfaceC07790Sh LIZ;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            InterfaceC07790Sh LJIIIZ = C09290Yb.LJIIIZ(InterfaceC07790Sh.LJJJI, ((C23390vv) this.LJLIL.LJFF.getValue()).LJLIL, 0.0f, 2);
            int i = this.LJLILLLLZI;
            C08370Un textStyle = this.LJLJI;
            o.LJIIIZ(LJIIIZ, "<this>");
            o.LJIIIZ(textStyle, "textStyle");
            C45301qA c45301qA = g1.LIZ;
            InterfaceC07790Sh LIZ2 = C07770Sf.LIZ(LJIIIZ, c45301qA, new IDqS16S0101000(i, textStyle, 1));
            C18690oL scrollerPosition = this.LJLJJI;
            C15010iP textFieldValue = this.LJLJJL;
            InterfaceC14810i5 visualTransformation = this.LJLJJLL;
            IDqS420S0100000 iDqS420S0100000 = new IDqS420S0100000(this.LJLIL, 147);
            o.LJIIIZ(LIZ2, "<this>");
            o.LJIIIZ(scrollerPosition, "scrollerPosition");
            o.LJIIIZ(textFieldValue, "textFieldValue");
            o.LJIIIZ(visualTransformation, "visualTransformation");
            C0UT c0ut = (C0UT) scrollerPosition.LJ.getValue();
            long j = textFieldValue.LIZIZ;
            int i2 = (int) (j >> 32);
            if (i2 == ((int) (scrollerPosition.LIZLLL >> 32))) {
                if (C08350Ul.LIZJ(j) != C08350Ul.LIZJ(scrollerPosition.LIZLLL)) {
                    i2 = C08350Ul.LIZJ(j);
                } else {
                    i2 = C08350Ul.LJ(j);
                }
            }
            scrollerPosition.LIZLLL = textFieldValue.LIZIZ;
            C14770i1 LIZ3 = C18920oi.LIZ(visualTransformation, textFieldValue.LIZ);
            int i3 = C18600oC.LIZ[c0ut.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    c523423q = new C23Q(scrollerPosition, i2, LIZ3, iDqS420S0100000);
                } else {
                    throw new C162476Zf();
                }
            } else {
                c523423q = new C523423q(scrollerPosition, i2, LIZ3, iDqS420S0100000);
            }
            InterfaceC07790Sh LLLIIIL = C78840Uwu.LJII(LIZ2).LLLIIIL(c523423q).LLLIIIL(this.LJLJL).LLLIIIL(this.LJLJLJ);
            C08370Un style = this.LJLJI;
            o.LJIIIZ(LLLIIIL, "<this>");
            o.LJIIIZ(style, "style");
            LIZ = C07770Sf.LIZ(LLLIIIL, g1.LIZ, new IDqS425S0100000(style, 10));
            InterfaceC07790Sh LLLIIIL2 = LIZ.LLLIIIL(this.LJLJLLL).LLLIIIL(this.LJLL);
            InterfaceC14660hq bringIntoViewRequester = this.LJLLI;
            o.LJIIIZ(LLLIIIL2, "<this>");
            o.LJIIIZ(bringIntoViewRequester, "bringIntoViewRequester");
            C20330qz.LIZ(C07770Sf.LIZ(LLLIIIL2, c45301qA, new IDqS425S0100000(bringIntoViewRequester, 7)), C1DJ.LJ(interfaceC24520xk2, 19580180, new C522723j(this.LJLLILLLL, this.LJLIL, this.LJLLJ, this.LJLLL, this.LJLLLL, this.LJLLLLLL, this.LJLILLLLZI)), interfaceC24520xk2, 48, 0);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
