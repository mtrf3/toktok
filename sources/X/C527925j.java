package X;

import kotlin.jvm.internal.o;

/* renamed from: X.25j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C527925j extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC274515x, C76800UCe> {
    public final /* synthetic */ AbstractC39201gK LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ AbstractC39201gK LJLJJLL;
    public final /* synthetic */ AbstractC39201gK LJLJL;
    public final /* synthetic */ AbstractC39201gK LJLJLJ;
    public final /* synthetic */ AbstractC39201gK LJLJLLL;
    public final /* synthetic */ C1ZO LJLL;
    public final /* synthetic */ int LJLLI;
    public final /* synthetic */ int LJLLILLLL;
    public final /* synthetic */ InterfaceC44861pS LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527925j(AbstractC39201gK abstractC39201gK, int i, int i2, int i3, int i4, AbstractC39201gK abstractC39201gK2, AbstractC39201gK abstractC39201gK3, AbstractC39201gK abstractC39201gK4, AbstractC39201gK abstractC39201gK5, C1ZO c1zo, int i5, int i6, InterfaceC44861pS interfaceC44861pS) {
        super(1);
        this.LJLIL = abstractC39201gK;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = i4;
        this.LJLJJLL = abstractC39201gK2;
        this.LJLJL = abstractC39201gK3;
        this.LJLJLJ = abstractC39201gK4;
        this.LJLJLLL = abstractC39201gK5;
        this.LJLL = c1zo;
        this.LJLLI = i5;
        this.LJLLILLLL = i6;
        this.LJLLJ = interfaceC44861pS;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC274515x abstractC274515x) {
        int i;
        int LJJIIZ;
        AbstractC274515x layout = abstractC274515x;
        o.LJIIIZ(layout, "$this$layout");
        AbstractC39201gK abstractC39201gK = this.LJLIL;
        if (abstractC39201gK != null) {
            int i2 = this.LJLILLLLZI - this.LJLJI;
            if (i2 < 0) {
                i2 = 0;
            }
            int i3 = this.LJLJJI;
            int i4 = this.LJLJJL;
            AbstractC39201gK abstractC39201gK2 = this.LJLJJLL;
            AbstractC39201gK abstractC39201gK3 = this.LJLJL;
            AbstractC39201gK abstractC39201gK4 = this.LJLJLJ;
            AbstractC39201gK abstractC39201gK5 = this.LJLJLLL;
            C1ZO c1zo = this.LJLL;
            boolean z = c1zo.LIZ;
            int i5 = this.LJLLI + this.LJLLILLLL;
            float f = c1zo.LIZIZ;
            float density = this.LJLLJ.getDensity();
            if (abstractC39201gK4 != null) {
                InterfaceC07760Se.LJJJ.getClass();
                AbstractC274515x.LJI(layout, abstractC39201gK4, 0, C07730Sb.LJIIJJI.LIZ(abstractC39201gK4.LJLILLLLZI, i4));
            }
            if (abstractC39201gK5 != null) {
                int i6 = i3 - abstractC39201gK5.LJLIL;
                InterfaceC07760Se.LJJJ.getClass();
                AbstractC274515x.LJI(layout, abstractC39201gK5, i6, C07730Sb.LJIIJJI.LIZ(abstractC39201gK5.LJLILLLLZI, i4));
            }
            if (z) {
                InterfaceC07760Se.LJJJ.getClass();
                LJJIIZ = C07730Sb.LJIIJJI.LIZ(abstractC39201gK.LJLILLLLZI, i4);
            } else {
                LJJIIZ = O6R.LJJIIZ(C21640t6.LIZIZ * density);
            }
            AbstractC274515x.LJI(layout, abstractC39201gK, C21640t6.LJ(abstractC39201gK4), LJJIIZ - O6R.LJJIIZ((LJJIIZ - i2) * f));
            AbstractC274515x.LJI(layout, abstractC39201gK2, C21640t6.LJ(abstractC39201gK4), i5);
            if (abstractC39201gK3 != null) {
                AbstractC274515x.LJI(layout, abstractC39201gK3, C21640t6.LJ(abstractC39201gK4), i5);
            }
        } else {
            int i7 = this.LJLJJI;
            int i8 = this.LJLJJL;
            AbstractC39201gK abstractC39201gK6 = this.LJLJJLL;
            AbstractC39201gK abstractC39201gK7 = this.LJLJL;
            AbstractC39201gK abstractC39201gK8 = this.LJLJLJ;
            AbstractC39201gK abstractC39201gK9 = this.LJLJLLL;
            boolean z2 = this.LJLL.LIZ;
            int LJJIIZ2 = O6R.LJJIIZ(this.LJLL.LIZJ.LIZLLL() * this.LJLLJ.getDensity());
            if (abstractC39201gK8 != null) {
                InterfaceC07760Se.LJJJ.getClass();
                AbstractC274515x.LJI(layout, abstractC39201gK8, 0, C07730Sb.LJIIJJI.LIZ(abstractC39201gK8.LJLILLLLZI, i8));
            }
            if (abstractC39201gK9 != null) {
                int i9 = i7 - abstractC39201gK9.LJLIL;
                InterfaceC07760Se.LJJJ.getClass();
                AbstractC274515x.LJI(layout, abstractC39201gK9, i9, C07730Sb.LJIIJJI.LIZ(abstractC39201gK9.LJLILLLLZI, i8));
            }
            if (z2) {
                InterfaceC07760Se.LJJJ.getClass();
                i = C07730Sb.LJIIJJI.LIZ(abstractC39201gK6.LJLILLLLZI, i8);
            } else {
                i = LJJIIZ2;
            }
            AbstractC274515x.LJI(layout, abstractC39201gK6, C21640t6.LJ(abstractC39201gK8), i);
            if (abstractC39201gK7 != null) {
                if (z2) {
                    InterfaceC07760Se.LJJJ.getClass();
                    LJJIIZ2 = C07730Sb.LJIIJJI.LIZ(abstractC39201gK7.LJLILLLLZI, i8);
                }
                AbstractC274515x.LJI(layout, abstractC39201gK7, C21640t6.LJ(abstractC39201gK8), LJJIIZ2);
            }
        }
        return C76800UCe.LIZ;
    }
}
