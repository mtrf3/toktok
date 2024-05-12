package X;

import kotlin.jvm.internal.o;

/* renamed from: X.258, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass258 extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC274515x, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ AbstractC39201gK LJLJI;
    public final /* synthetic */ AbstractC39201gK LJLJJI;
    public final /* synthetic */ AbstractC39201gK LJLJJL;
    public final /* synthetic */ AbstractC39201gK LJLJJLL;
    public final /* synthetic */ AbstractC39201gK LJLJL;
    public final /* synthetic */ AbstractC39201gK LJLJLJ;
    public final /* synthetic */ C1ZI LJLJLLL;
    public final /* synthetic */ InterfaceC44861pS LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass258(int i, int i2, AbstractC39201gK abstractC39201gK, AbstractC39201gK abstractC39201gK2, AbstractC39201gK abstractC39201gK3, AbstractC39201gK abstractC39201gK4, AbstractC39201gK abstractC39201gK5, AbstractC39201gK abstractC39201gK6, C1ZI c1zi, InterfaceC44861pS interfaceC44861pS) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = abstractC39201gK;
        this.LJLJJI = abstractC39201gK2;
        this.LJLJJL = abstractC39201gK3;
        this.LJLJJLL = abstractC39201gK4;
        this.LJLJL = abstractC39201gK5;
        this.LJLJLJ = abstractC39201gK6;
        this.LJLJLLL = c1zi;
        this.LJLL = interfaceC44861pS;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC274515x abstractC274515x) {
        int i;
        int i2;
        float LJ;
        AbstractC274515x layout = abstractC274515x;
        o.LJIIIZ(layout, "$this$layout");
        int i3 = this.LJLIL;
        int i4 = this.LJLILLLLZI;
        AbstractC39201gK abstractC39201gK = this.LJLJI;
        AbstractC39201gK abstractC39201gK2 = this.LJLJJI;
        AbstractC39201gK abstractC39201gK3 = this.LJLJJL;
        AbstractC39201gK abstractC39201gK4 = this.LJLJJLL;
        AbstractC39201gK abstractC39201gK5 = this.LJLJL;
        AbstractC39201gK abstractC39201gK6 = this.LJLJLJ;
        C1ZI c1zi = this.LJLJLLL;
        float f = c1zi.LIZJ;
        boolean z = c1zi.LIZIZ;
        float density = this.LJLL.getDensity();
        EnumC23500w6 layoutDirection = this.LJLL.getLayoutDirection();
        InterfaceC09420Yo interfaceC09420Yo = this.LJLJLLL.LIZLLL;
        int LJJIIZ = O6R.LJJIIZ(interfaceC09420Yo.LIZLLL() * density);
        int LJJIIZ2 = O6R.LJJIIZ(C70657RoD.LIZJ(interfaceC09420Yo, layoutDirection) * density);
        float f2 = C21640t6.LIZJ * density;
        if (abstractC39201gK != null) {
            InterfaceC07760Se.LJJJ.getClass();
            AbstractC274515x.LJI(layout, abstractC39201gK, 0, C07730Sb.LJIIJJI.LIZ(abstractC39201gK.LJLILLLLZI, i3));
        }
        if (abstractC39201gK2 != null) {
            int i5 = i4 - abstractC39201gK2.LJLIL;
            InterfaceC07760Se.LJJJ.getClass();
            AbstractC274515x.LJI(layout, abstractC39201gK2, i5, C07730Sb.LJIIJJI.LIZ(abstractC39201gK2.LJLILLLLZI, i3));
        }
        if (abstractC39201gK4 != null) {
            if (z) {
                InterfaceC07760Se.LJJJ.getClass();
                i2 = C07730Sb.LJIIJJI.LIZ(abstractC39201gK4.LJLILLLLZI, i3);
            } else {
                i2 = LJJIIZ;
            }
            float f3 = 1 - f;
            float f4 = (i2 * f3) - ((abstractC39201gK4.LJLILLLLZI / 2) * f);
            if (abstractC39201gK == null) {
                LJ = 0.0f;
            } else {
                LJ = (C21640t6.LJ(abstractC39201gK) - f2) * f3;
            }
            AbstractC274515x.LJI(layout, abstractC39201gK4, O6R.LJJIIZ(LJ) + LJJIIZ2, O6R.LJJIIZ(f4));
        }
        if (z) {
            InterfaceC07760Se.LJJJ.getClass();
            i = C07730Sb.LJIIJJI.LIZ(abstractC39201gK3.LJLILLLLZI, i3);
        } else {
            i = LJJIIZ;
        }
        AbstractC274515x.LJI(layout, abstractC39201gK3, C21640t6.LJ(abstractC39201gK), Math.max(i, C21640t6.LIZLLL(abstractC39201gK4) / 2));
        if (abstractC39201gK5 != null) {
            if (z) {
                InterfaceC07760Se.LJJJ.getClass();
                LJJIIZ = C07730Sb.LJIIJJI.LIZ(abstractC39201gK5.LJLILLLLZI, i3);
            }
            AbstractC274515x.LJI(layout, abstractC39201gK5, C21640t6.LJ(abstractC39201gK), LJJIIZ);
        }
        AbstractC274515x.LJ(abstractC39201gK6, C23450w1.LIZIZ, 0.0f);
        return C76800UCe.LIZ;
    }
}
