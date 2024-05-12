package X;

import android.os.Trace;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.23j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C522723j extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C20140qg LJLIL;
    public final /* synthetic */ C18810oX LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<C0VG, C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC23370vt LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C522723j(C20140qg c20140qg, C18810oX c18810oX, boolean z, boolean z2, InterfaceC88472Yns<? super C0VG, C76800UCe> interfaceC88472Yns, InterfaceC23370vt interfaceC23370vt, int i) {
        super(2);
        this.LJLIL = c20140qg;
        this.LJLILLLLZI = c18810oX;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC23370vt;
        this.LJLJL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC274415w interfaceC274415w;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            final C18810oX c18810oX = this.LJLILLLLZI;
            final InterfaceC88472Yns<C0VG, C76800UCe> interfaceC88472Yns = this.LJLJJL;
            final InterfaceC23370vt interfaceC23370vt = this.LJLJJLL;
            final int i = this.LJLJL;
            InterfaceC273215k interfaceC273215k = new InterfaceC273215k() { // from class: X.1XX
                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZIZ(AbstractC538029g abstractC538029g, List list, int i2) {
                    return C79061V1d.LIZLLL(this, abstractC538029g, list, i2);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZLLL(AbstractC538029g abstractC538029g, List list, int i2) {
                    return C79061V1d.LIZ(this, abstractC538029g, list, i2);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LJ(AbstractC538029g abstractC538029g, List list, int i2) {
                    return C79061V1d.LIZJ(this, abstractC538029g, list, i2);
                }

                @Override // X.InterfaceC273215k
                public final int LIZ(AbstractC538029g abstractC538029g, List list, int i2) {
                    o.LJIIIZ(abstractC538029g, "<this>");
                    C18810oX.this.LIZ.LIZIZ(abstractC538029g.LJLJL.LJLZ);
                    C1NB c1nb = C18810oX.this.LIZ.LJIIIIZZ;
                    if (c1nb != null) {
                        return C77119UOl.LIZIZ(c1nb.LIZ());
                    }
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }

                @Override // X.InterfaceC273215k
                public final InterfaceC273515n LIZJ(InterfaceC44861pS measure, List<? extends InterfaceC39071g7> measurables, long j) {
                    C0VG c0vg;
                    int i2;
                    o.LJIIIZ(measure, "$this$measure");
                    o.LJIIIZ(measurables, "measurables");
                    C18810oX c18810oX2 = C18810oX.this;
                    C0OA LIZ = C0O8.LIZ();
                    try {
                        C0OA LJIIIIZZ = LIZ.LJIIIIZZ();
                        try {
                            C18830oZ LIZJ = c18810oX2.LIZJ();
                            if (LIZJ != null) {
                                c0vg = LIZJ.LIZ;
                            } else {
                                c0vg = null;
                            }
                            LIZ.LIZJ();
                            C18590oB textDelegate = C18810oX.this.LIZ;
                            EnumC23500w6 layoutDirection = measure.getLayoutDirection();
                            o.LJIIIZ(textDelegate, "textDelegate");
                            o.LJIIIZ(layoutDirection, "layoutDirection");
                            C0VG LIZ2 = textDelegate.LIZ(j, layoutDirection, c0vg);
                            OSJ osj = new OSJ(Integer.valueOf((int) (LIZ2.LIZJ >> 32)), Integer.valueOf(C23490w5.LIZIZ(LIZ2.LIZJ)), LIZ2);
                            int intValue = ((Number) osj.getFirst()).intValue();
                            int intValue2 = ((Number) osj.getSecond()).intValue();
                            C0VG c0vg2 = (C0VG) osj.getThird();
                            if (!o.LJ(c0vg, c0vg2)) {
                                C18810oX c18810oX3 = C18810oX.this;
                                c18810oX3.LJII.setValue(new C18830oZ(c0vg2));
                                c18810oX3.LJIILJJIL = false;
                                interfaceC88472Yns.invoke(c0vg2);
                            }
                            C18810oX c18810oX4 = C18810oX.this;
                            InterfaceC23370vt interfaceC23370vt2 = interfaceC23370vt;
                            if (i == 1) {
                                i2 = C77119UOl.LIZIZ(c0vg2.LJ(0));
                            } else {
                                i2 = 0;
                            }
                            c18810oX4.LJFF.setValue(new C23390vv(interfaceC23370vt2.LJJJLL(i2)));
                            return measure.LJJLIL(intValue, intValue2, C113554cx.LJJL(new OSZ(C272615e.LIZ, Integer.valueOf(O6R.LJJIIZ(c0vg2.LIZLLL))), new OSZ(C272615e.LIZIZ, Integer.valueOf(O6R.LJJIIZ(c0vg2.LJ)))), C522423g.LJLIL);
                        } finally {
                            C0OA.LJIILJJIL(LJIIIIZZ);
                        }
                    } catch (Throwable th) {
                        LIZ.LIZJ();
                        throw th;
                    }
                }
            };
            interfaceC24520xk2.LJJIIJ(-1323940314);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            Trace.beginSection("Layout:layout");
            try {
                InterfaceC23370vt interfaceC23370vt2 = (InterfaceC23370vt) interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJ);
                EnumC23500w6 enumC23500w6 = (EnumC23500w6) interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIIJ);
                InterfaceC015404g interfaceC015404g = (InterfaceC015404g) interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIILJJIL);
                InterfaceC03730Cr.LJ.getClass();
                C46041rM c46041rM = C03720Cq.LIZIZ;
                C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
                if (interfaceC24520xk2.LJJ() instanceof InterfaceC24420xa) {
                    interfaceC24520xk2.LJIJI();
                    if (interfaceC24520xk2.LJIJJLI()) {
                        interfaceC24520xk2.LJJI(c46041rM);
                    } else {
                        interfaceC24520xk2.LIZIZ();
                    }
                    interfaceC24520xk2.LJJIIZI();
                    C24830yF.LIZ(interfaceC24520xk2, interfaceC273215k, C03720Cq.LJ);
                    C24830yF.LIZ(interfaceC24520xk2, interfaceC23370vt2, C03720Cq.LIZLLL);
                    C24830yF.LIZ(interfaceC24520xk2, enumC23500w6, C03720Cq.LJFF);
                    C24830yF.LIZ(interfaceC24520xk2, interfaceC015404g, C03720Cq.LJI);
                    interfaceC24520xk2.LJIIIIZZ();
                    boolean z = false;
                    LJIIL.invoke(new C24440xc(interfaceC24520xk2), interfaceC24520xk2, 0);
                    interfaceC24520xk2.LJJIIJ(2058660585);
                    interfaceC24520xk2.LJJIIJ(1714611517);
                    interfaceC24520xk2.LJJIJIIJIL();
                    interfaceC24520xk2.LJJIJIIJIL();
                    interfaceC24520xk2.LJIJ();
                    Trace.endSection();
                    interfaceC24520xk2.LJJIJIIJIL();
                    C20140qg c20140qg = this.LJLIL;
                    if (this.LJLILLLLZI.LIZ() == EnumC18570o9.Selection && (interfaceC274415w = this.LJLILLLLZI.LJI) != null && interfaceC274415w.LIZLLL() && this.LJLJI) {
                        z = true;
                    }
                    C18750oR.LIZLLL(c20140qg, z, interfaceC24520xk2, 8);
                    if (this.LJLILLLLZI.LIZ() == EnumC18570o9.Cursor && !this.LJLJJI && this.LJLJI) {
                        C18750oR.LIZJ(this.LJLIL, interfaceC24520xk2, 8);
                    }
                } else {
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
