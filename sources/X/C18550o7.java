package X;

import android.os.Trace;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS2S0201000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0o7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18550o7 {
    public static final OSZ<List<C08410Ur<C0V4>>, List<C08410Ur<InterfaceC88473Ynt<String, InterfaceC24520xk, Integer, C76800UCe>>>> LIZ;

    static {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        LIZ = new OSZ<>(c61878OQg, c61878OQg);
    }

    public static final void LIZ(C08440Uu text, List<C08410Ur<InterfaceC88473Ynt<String, InterfaceC24520xk, Integer, C76800UCe>>> inlineContents, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(inlineContents, "inlineContents");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-110905764);
        int size = inlineContents.size();
        for (int i2 = 0; i2 < size; i2++) {
            C08410Ur c08410Ur = (C08410Ur) ListProtector.get(inlineContents, i2);
            InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) c08410Ur.LIZ;
            int i3 = c08410Ur.LIZIZ;
            int i4 = c08410Ur.LIZJ;
            C1XQ c1xq = new InterfaceC273215k() { // from class: X.1XQ
                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZ(AbstractC538029g abstractC538029g, List list, int i5) {
                    return C79061V1d.LIZIZ(this, abstractC538029g, list, i5);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZIZ(AbstractC538029g abstractC538029g, List list, int i5) {
                    return C79061V1d.LIZLLL(this, abstractC538029g, list, i5);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZLLL(AbstractC538029g abstractC538029g, List list, int i5) {
                    return C79061V1d.LIZ(this, abstractC538029g, list, i5);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LJ(AbstractC538029g abstractC538029g, List list, int i5) {
                    return C79061V1d.LIZJ(this, abstractC538029g, list, i5);
                }

                @Override // X.InterfaceC273215k
                public final InterfaceC273515n LIZJ(InterfaceC44861pS Layout, List<? extends InterfaceC39071g7> children, long j) {
                    InterfaceC273515n LJJLIL;
                    o.LJIIIZ(Layout, "$this$Layout");
                    o.LJIIIZ(children, "children");
                    ArrayList arrayList = new ArrayList(children.size());
                    int size2 = children.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        arrayList.add(((InterfaceC39071g7) ListProtector.get(children, i5)).LJJJIL(j));
                    }
                    LJJLIL = Layout.LJJLIL(C23360vs.LJII(j), C23360vs.LJI(j), C113554cx.LJJJLIIL(), new IDqS416S0100000((List) arrayList, (List<? extends AbstractC39201gK>) 261));
                    return LJJLIL;
                }
            };
            LJIL.LJJIIJ(-1323940314);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            Trace.beginSection("Layout:layout");
            try {
                InterfaceC23370vt interfaceC23370vt = (InterfaceC23370vt) LJIL.LJIILLIIL(AnonymousClass057.LJ);
                EnumC23500w6 enumC23500w6 = (EnumC23500w6) LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
                InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
                InterfaceC03730Cr.LJ.getClass();
                C46041rM c46041rM = C03720Cq.LIZIZ;
                C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
                if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                    LJIL.LJIJI();
                    if (LJIL.LJJIL) {
                        LJIL.LJJI(c46041rM);
                    } else {
                        LJIL.LIZIZ();
                    }
                    LJIL.LJJI = false;
                    C24830yF.LIZ(LJIL, c1xq, C03720Cq.LJ);
                    C24830yF.LIZ(LJIL, interfaceC23370vt, C03720Cq.LIZLLL);
                    C24830yF.LIZ(LJIL, enumC23500w6, C03720Cq.LJFF);
                    C24830yF.LIZ(LJIL, interfaceC015404g, C03720Cq.LJI);
                    LJIL.LJIIIIZZ();
                    LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
                    LJIL.LJJIIJ(2058660585);
                    LJIL.LJJIIJ(-72427749);
                    interfaceC88473Ynt.invoke(text.subSequence(i3, i4).LJLIL, LJIL, 0);
                    LJIL.LJJJJJ(false);
                    LJIL.LJJJJJ(false);
                    LJIL.LJIJ();
                    Trace.endSection();
                    LJIL.LJJJJJ(false);
                } else {
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS2S0201000(text, (C08440Uu) inlineContents, (List<C08410Ur<InterfaceC88473Ynt<String, InterfaceC24520xk, Integer, C76800UCe>>>) i, 12);
    }

    public static final C18590oB LIZIZ(C18590oB current, C08440Uu text, C08370Un style, InterfaceC23370vt density, InterfaceC13480fw fontFamilyResolver, boolean z, int i, int i2, List<C08410Ur<C0V4>> placeholders) {
        o.LJIIIZ(current, "current");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(density, "density");
        o.LJIIIZ(fontFamilyResolver, "fontFamilyResolver");
        o.LJIIIZ(placeholders, "placeholders");
        if (o.LJ(current.LIZ, text) && o.LJ(current.LIZIZ, style) && current.LIZLLL == z && current.LJ == i && current.LIZJ == i2 && o.LJ(current.LJFF, density) && o.LJ(current.LJII, placeholders) && current.LJI == fontFamilyResolver) {
            return current;
        }
        return new C18590oB(text, style, i2, z, i, density, fontFamilyResolver, placeholders);
    }
}
