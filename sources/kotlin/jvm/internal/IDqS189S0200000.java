package kotlin.jvm.internal;

import X.AbstractC17640me;
import X.AbstractC24370xV;
import X.AbstractC65781Prl;
import X.AnonymousClass057;
import X.AnonymousClass161;
import X.C03720Cq;
import X.C04Q;
import X.C0UY;
import X.C10370av;
import X.C11P;
import X.C13050fF;
import X.C13060fG;
import X.C13O;
import X.C14390hP;
import X.C17490mP;
import X.C17N;
import X.C1DJ;
import X.C1EW;
import X.C23360vs;
import X.C24320xQ;
import X.C24440xc;
import X.C24610xt;
import X.C24620xu;
import X.C24830yF;
import X.C27Q;
import X.C2EA;
import X.C30868C9o;
import X.C34331Wj;
import X.C34351Wl;
import X.C36521c0;
import X.C36541c2;
import X.C40431iJ;
import X.C44541ow;
import X.C44551ox;
import X.C46041rM;
import X.C56509MFt;
import X.C56K;
import X.C72242sW;
import X.C76800UCe;
import X.C77413UZt;
import X.C78866UxK;
import X.C78880UxY;
import X.C78929UyL;
import X.EnumC23500w6;
import X.InterfaceC015404g;
import X.InterfaceC03730Cr;
import X.InterfaceC07790Sh;
import X.InterfaceC13090fJ;
import X.InterfaceC17620mc;
import X.InterfaceC23370vt;
import X.InterfaceC24420xa;
import X.InterfaceC24520xk;
import X.InterfaceC24760y8;
import X.InterfaceC273215k;
import X.InterfaceC273515n;
import X.InterfaceC35811ar;
import X.InterfaceC37431dT;
import X.InterfaceC516520z;
import X.InterfaceC536028m;
import X.InterfaceC88471Ynr;
import X.InterfaceC88474Ynu;
import X.X1D;
import android.os.Trace;
import androidx.compose.ui.platform.WrappedComposition;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.internal.b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* loaded from: classes.dex */
public class IDqS189S0200000 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS189S0200000(C13060fG c13060fG, C13050fF c13050fF, int i) {
        super(2);
        this.$t = i;
        this.l0 = c13060fG;
        this.l1 = c13050fF;
    }

    public static final Object invoke$0(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C04Q.LIZ(((WrappedComposition) iDqS189S0200000.l0).LJLIL, (InterfaceC88471Ynr) iDqS189S0200000.l1, interfaceC24520xk, 8);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        if (r5 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.IDqS189S0200000 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            X.0xk r8 = (X.InterfaceC24520xk) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r0 = r9.intValue()
            r1 = r0 & 11
            r0 = 2
            if (r1 != r0) goto L13
            boolean r0 = r8.LIZ()
            if (r0 != 0) goto Laf
        L13:
            java.lang.Object r0 = r7.l0
            androidx.compose.ui.platform.WrappedComposition r0 = (androidx.compose.ui.platform.WrappedComposition) r0
            X.1q1 r0 = r0.LJLIL
            r2 = 2131368862(0x7f0a1b9e, float:1.8357686E38)
            java.lang.Object r5 = r0.getTag(r2)
            boolean r0 = r5 instanceof java.util.Set
            r4 = 1
            r6 = 0
            if (r0 == 0) goto Lad
            boolean r0 = r5 instanceof X.InterfaceC90533gv
            if (r0 == 0) goto L2e
            boolean r0 = r5 instanceof X.InterfaceC65779Prj
            if (r0 == 0) goto Lad
        L2e:
            r0 = 1
        L2f:
            r3 = 0
            if (r0 == 0) goto L36
            java.util.Set r5 = (java.util.Set) r5
            if (r5 != 0) goto L5c
        L36:
            java.lang.Object r0 = r7.l0
            androidx.compose.ui.platform.WrappedComposition r0 = (androidx.compose.ui.platform.WrappedComposition) r0
            X.1q1 r0 = r0.LJLIL
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto Lab
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto Lab
            java.lang.Object r5 = r1.getTag(r2)
        L4c:
            boolean r0 = r5 instanceof java.util.Set
            if (r0 == 0) goto La9
            boolean r0 = r5 instanceof X.InterfaceC90533gv
            if (r0 == 0) goto L58
            boolean r0 = r5 instanceof X.InterfaceC65779Prj
            if (r0 == 0) goto La9
        L58:
            java.util.Set r5 = (java.util.Set) r5
            if (r5 == 0) goto L66
        L5c:
            X.1ax r0 = r8.LJJIIJZLJL()
            r5.add(r0)
            r8.LJIIL()
        L66:
            java.lang.Object r2 = r7.l0
            androidx.compose.ui.platform.WrappedComposition r2 = (androidx.compose.ui.platform.WrappedComposition) r2
            X.1q1 r1 = r2.LJLIL
            X.29b r0 = new X.29b
            r0.<init>(r2, r3)
            X.C24610xt.LJ(r1, r0, r8)
            java.lang.Object r2 = r7.l0
            androidx.compose.ui.platform.WrappedComposition r2 = (androidx.compose.ui.platform.WrappedComposition) r2
            X.1q1 r1 = r2.LJLIL
            X.29c r0 = new X.29c
            r0.<init>(r2, r3)
            X.C24610xt.LJ(r1, r0, r8)
            X.0xu[] r4 = new X.C24620xu[r4]
            X.1o7 r0 = X.C0QJ.LIZ
            X.0xu r0 = r0.LIZIZ(r5)
            r4[r6] = r0
            kotlin.jvm.internal.IDqS189S0200000 r3 = new kotlin.jvm.internal.IDqS189S0200000
            java.lang.Object r2 = r7.l0
            androidx.compose.ui.platform.WrappedComposition r2 = (androidx.compose.ui.platform.WrappedComposition) r2
            java.lang.Object r1 = r7.l1
            X.Ynr r1 = (X.InterfaceC88471Ynr) r1
            r0 = 0
            r3.<init>(r2, r1, r0)
            r0 = 1936147514(0x7367443a, float:1.8322821E31)
            X.1iJ r1 = X.C1DJ.LJ(r8, r0, r3)
            r0 = 56
            X.C24410xZ.LIZ(r4, r1, r8, r0)
        La6:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        La9:
            r5 = r3
            goto L66
        Lab:
            r5 = r3
            goto L4c
        Lad:
            r0 = 0
            goto L2f
        Laf:
            r8.LIZLLL()
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS189S0200000.invoke$1(kotlin.jvm.internal.IDqS189S0200000, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && interfaceC24520xk.LIZ()) {
            interfaceC24520xk.LIZLLL();
            return C76800UCe.LIZ;
        }
        ((C24320xQ) iDqS189S0200000.l0).getClass();
        throw null;
    }

    public static final Object invoke$11(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        float f;
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            InterfaceC07790Sh LJJI = C77413UZt.LJJI(b.LJJII(InterfaceC07790Sh.LJJJI, false, C27Q.LJLIL), new IDqS416S0100000((C36541c2) iDqS189S0200000.l0, 327));
            if (((C36541c2) iDqS189S0200000.l0).getCanCalculatePosition()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            InterfaceC07790Sh LJIIL = C78866UxK.LJIIL(LJJI, f);
            C40431iJ LJ = C1DJ.LJ(interfaceC24520xk, 606497925, new IDqS443S0100000((InterfaceC24760y8) iDqS189S0200000.l1, (InterfaceC24760y8<? extends InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>>) 43));
            interfaceC24520xk.LJJIIJ(1406149896);
            C36521c0 c36521c0 = new InterfaceC273215k() { // from class: X.1c0
                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZ(AbstractC538029g abstractC538029g, List list, int i) {
                    return C79061V1d.LIZIZ(this, abstractC538029g, list, i);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZIZ(AbstractC538029g abstractC538029g, List list, int i) {
                    return C79061V1d.LIZLLL(this, abstractC538029g, list, i);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZLLL(AbstractC538029g abstractC538029g, List list, int i) {
                    return C79061V1d.LIZ(this, abstractC538029g, list, i);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LJ(AbstractC538029g abstractC538029g, List list, int i) {
                    return C79061V1d.LIZJ(this, abstractC538029g, list, i);
                }

                @Override // X.InterfaceC273215k
                public final InterfaceC273515n LIZJ(InterfaceC44861pS Layout, List<? extends InterfaceC39071g7> measurables, long j) {
                    InterfaceC273515n LJJLIL;
                    InterfaceC273515n LJJLIL2;
                    int i;
                    InterfaceC273515n LJJLIL3;
                    o.LJIIIZ(Layout, "$this$Layout");
                    o.LJIIIZ(measurables, "measurables");
                    int size = measurables.size();
                    int i2 = 0;
                    if (size != 0) {
                        if (size != 1) {
                            ArrayList arrayList = new ArrayList(measurables.size());
                            int size2 = measurables.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                arrayList.add(((InterfaceC39071g7) ListProtector.get(measurables, i3)).LJJJIL(j));
                            }
                            int LJJI2 = C47261Igj.LJJI(arrayList);
                            if (LJJI2 >= 0) {
                                int i4 = 0;
                                i = 0;
                                while (true) {
                                    AbstractC39201gK abstractC39201gK = (AbstractC39201gK) ListProtector.get(arrayList, i2);
                                    i4 = Math.max(i4, abstractC39201gK.LJLIL);
                                    i = Math.max(i, abstractC39201gK.LJLILLLLZI);
                                    if (i2 == LJJI2) {
                                        break;
                                    }
                                    i2++;
                                }
                                i2 = i4;
                            } else {
                                i = 0;
                            }
                            LJJLIL3 = Layout.LJJLIL(i2, i, C113554cx.LJJJLIIL(), new IDqS416S0100000((List) arrayList, (List<? extends AbstractC39201gK>) 329));
                            return LJJLIL3;
                        }
                        AbstractC39201gK LJJJIL = ((InterfaceC39071g7) ListProtector.get(measurables, 0)).LJJJIL(j);
                        LJJLIL2 = Layout.LJJLIL(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI, C113554cx.LJJJLIIL(), new IDqS416S0100000(LJJJIL, 328));
                        return LJJLIL2;
                    }
                    LJJLIL = Layout.LJJLIL(0, 0, C113554cx.LJJJLIIL(), C27R.INSTANCE);
                    return LJJLIL;
                }
            };
            interfaceC24520xk.LJJIIJ(-1323940314);
            Trace.beginSection("Layout:layout");
            try {
                InterfaceC23370vt interfaceC23370vt = (InterfaceC23370vt) interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJ);
                EnumC23500w6 enumC23500w6 = (EnumC23500w6) interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIIJ);
                InterfaceC015404g interfaceC015404g = (InterfaceC015404g) interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIILJJIL);
                InterfaceC03730Cr.LJ.getClass();
                C46041rM c46041rM = C03720Cq.LIZIZ;
                C40431iJ LJIIL2 = C56509MFt.LJIIL(LJIIL);
                if (interfaceC24520xk.LJJ() instanceof InterfaceC24420xa) {
                    interfaceC24520xk.LJIJI();
                    if (interfaceC24520xk.LJIJJLI()) {
                        interfaceC24520xk.LJJI(c46041rM);
                    } else {
                        interfaceC24520xk.LIZIZ();
                    }
                    interfaceC24520xk.LJJIIZI();
                    C24830yF.LIZ(interfaceC24520xk, c36521c0, C03720Cq.LJ);
                    C24830yF.LIZ(interfaceC24520xk, interfaceC23370vt, C03720Cq.LIZLLL);
                    C24830yF.LIZ(interfaceC24520xk, enumC23500w6, C03720Cq.LJFF);
                    C24830yF.LIZ(interfaceC24520xk, interfaceC015404g, C03720Cq.LJI);
                    interfaceC24520xk.LJIIIIZZ();
                    LJIIL2.invoke(new C24440xc(interfaceC24520xk), interfaceC24520xk, 0);
                    interfaceC24520xk.LJJIIJ(2058660585);
                    LJ.invoke(interfaceC24520xk, 6);
                    interfaceC24520xk.LJJIJIIJIL();
                    interfaceC24520xk.LJIJ();
                    Trace.endSection();
                    interfaceC24520xk.LJJIJIIJIL();
                    interfaceC24520xk.LJJIJIIJIL();
                } else {
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            boolean booleanValue = ((Boolean) ((AnonymousClass161) iDqS189S0200000.l0).LJ.getValue()).booleanValue();
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) iDqS189S0200000.l1;
            interfaceC24520xk.LIZJ(Boolean.valueOf(booleanValue));
            boolean LJI = interfaceC24520xk.LJI(booleanValue);
            if (booleanValue) {
                interfaceC88471Ynr.invoke(interfaceC24520xk, 0);
            } else {
                interfaceC24520xk.LJIIZILJ(LJI);
            }
            interfaceC24520xk.LJIILJJIL();
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        C56K c56k = (C56K) iDqS189S0200000.l0;
        float f = c56k.element;
        c56k.element = ((C0UY) iDqS189S0200000.l1).LIZ(floatValue - f) + f;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        C11P event = (C11P) obj;
        long j = ((C10370av) obj2).LIZ;
        o.LJIIIZ(event, "event");
        C17N.LJI((C13O) iDqS189S0200000.l0, event);
        event.LIZ();
        ((C72242sW) iDqS189S0200000.l1).element = j;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        int intValue;
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            InterfaceC13090fJ invoke = ((C13060fG) iDqS189S0200000.l0).LIZIZ.invoke();
            Integer num = invoke.LJI().get(((C13050fF) iDqS189S0200000.l1).LIZ);
            if (num != null) {
                ((C13050fF) iDqS189S0200000.l1).LIZJ.setValue(Integer.valueOf(num.intValue()));
                intValue = num.intValue();
            } else {
                intValue = ((Number) ((C13050fF) iDqS189S0200000.l1).LIZJ.getValue()).intValue();
            }
            interfaceC24520xk.LJJIIJ(-715770513);
            if (intValue < invoke.getItemCount()) {
                Object LJII = invoke.LJII(intValue);
                if (o.LJ(LJII, ((C13050fF) iDqS189S0200000.l1).LIZ)) {
                    ((C13060fG) iDqS189S0200000.l0).LIZ.LIZIZ(LJII, C1DJ.LJ(interfaceC24520xk, -1238863364, new IDqS11S0101000(invoke, intValue, 5)), interfaceC24520xk, 568);
                }
            }
            interfaceC24520xk.LJJIJIIJIL();
            C13050fF c13050fF = (C13050fF) iDqS189S0200000.l1;
            C24610xt.LIZIZ(c13050fF.LIZ, new IDqS416S0100000(c13050fF, 208), interfaceC24520xk);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        InterfaceC536028m interfaceC536028m = (InterfaceC536028m) obj;
        long j = ((C23360vs) obj2).LIZ;
        o.LJIIIZ(interfaceC536028m, "$this$null");
        return ((InterfaceC88471Ynr) iDqS189S0200000.l1).invoke(new C2EA((C13060fG) iDqS189S0200000.l0, interfaceC536028m), new C23360vs(j));
    }

    public static final Object invoke$6(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        String str;
        BaseException baseException = (BaseException) obj2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FileDownload-onFailed, songId: ");
        LIZ.append(((MusicSong) iDqS189S0200000.l0).id);
        LIZ.append(", exception: ");
        if (baseException != null) {
            str = baseException.getErrorMessage();
        } else {
            str = null;
        }
        C1EW.LIZLLL(LIZ, str, LIZ, "BGMDownloadManager");
        if (baseException != null && baseException.getErrorCode() == 1006) {
            C30868C9o.LIZJ(R.string.mev);
        } else {
            C30868C9o.LIZJ(R.string.oug);
        }
        ((C14390hP) iDqS189S0200000.l1).LIZIZ.remove((MusicSong) iDqS189S0200000.l0);
        ((C14390hP) iDqS189S0200000.l1).LIZ.LIZ((MusicSong) iDqS189S0200000.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C17490mP.LIZ((C34331Wj) ((AbstractC17640me) iDqS189S0200000.l0), (Map) iDqS189S0200000.l1, interfaceC24520xk, 64, 0);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            ((InterfaceC88474Ynu) iDqS189S0200000.l0).invoke(Float.valueOf(((C34351Wl) iDqS189S0200000.l1).LJLJLJ.LJI), Float.valueOf(((C34351Wl) iDqS189S0200000.l1).LJLJLJ.LJII), interfaceC24520xk, 0);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS189S0200000 iDqS189S0200000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        ((Number) obj2).intValue();
        interfaceC24520xk.LJJIIJ(935231726);
        C24620xu[] c24620xuArr = (C24620xu[]) iDqS189S0200000.l0;
        InterfaceC37431dT interfaceC37431dT = (InterfaceC37431dT) iDqS189S0200000.l1;
        interfaceC24520xk.LJJIIJ(721128344);
        C44551ox c44551ox = new C44551ox(C78880UxY.LJJLJLI());
        for (C24620xu c24620xu : c24620xuArr) {
            interfaceC24520xk.LJJIIJ(680852990);
            if (!c24620xu.LIZJ) {
                Object key = c24620xu.LIZ;
                o.LJIIIZ(interfaceC37431dT, "<this>");
                o.LJIIIZ(key, "key");
                if (interfaceC37431dT.containsKey(key)) {
                    interfaceC24520xk.LJJIJIIJIL();
                }
            }
            Object obj3 = c24620xu.LIZ;
            o.LJII(obj3, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            c44551ox.put(obj3, c24620xu.LIZ.LIZ(c24620xu.LIZIZ, interfaceC24520xk));
            interfaceC24520xk.LJJIJIIJIL();
        }
        C44541ow LIZ = c44551ox.LIZ();
        interfaceC24520xk.LJJIJIIJIL();
        interfaceC24520xk.LJJIJIIJIL();
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS189S0200000(C13060fG c13060fG, C13060fG c13060fG2, InterfaceC88471Ynr<? super InterfaceC516520z, ? super C23360vs, ? extends InterfaceC273515n> interfaceC88471Ynr) {
        super(2);
        this.$t = interfaceC88471Ynr;
        this.l0 = c13060fG;
        this.l1 = c13060fG2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS189S0200000(AbstractC17640me abstractC17640me, AbstractC17640me abstractC17640me2, Map<String, ? extends InterfaceC17620mc> map) {
        super(2);
        this.$t = map;
        this.l0 = abstractC17640me;
        this.l1 = abstractC17640me2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS189S0200000(C24320xQ c24320xQ, C24320xQ<Object> c24320xQ2, Object obj) {
        super(2);
        this.$t = obj;
        this.l0 = c24320xQ;
        this.l1 = c24320xQ2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS189S0200000(C13O c13o, C72242sW c72242sW, int i) {
        super(2);
        this.$t = i;
        this.l0 = c13o;
        this.l1 = c72242sW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS189S0200000(AnonymousClass161 anonymousClass161, AnonymousClass161 anonymousClass1612, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        super(2);
        this.$t = interfaceC88471Ynr;
        this.l0 = anonymousClass161;
        this.l1 = anonymousClass1612;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS189S0200000(C36541c2 c36541c2, InterfaceC35811ar interfaceC35811ar, int i) {
        super(2);
        this.$t = i;
        this.l0 = c36541c2;
        this.l1 = interfaceC35811ar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS189S0200000(C56K c56k, C0UY c0uy, int i) {
        super(2);
        this.$t = i;
        this.l0 = c56k;
        this.l1 = c0uy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS189S0200000(InterfaceC88474Ynu interfaceC88474Ynu, InterfaceC88474Ynu<? super Float, ? super Float, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88474Ynu2, C34351Wl c34351Wl) {
        super(2);
        this.$t = c34351Wl;
        this.l0 = interfaceC88474Ynu;
        this.l1 = interfaceC88474Ynu2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS189S0200000(WrappedComposition wrappedComposition, WrappedComposition wrappedComposition2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        super(2);
        this.$t = interfaceC88471Ynr;
        this.l0 = wrappedComposition;
        this.l1 = wrappedComposition2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS189S0200000(MusicSong musicSong, C14390hP c14390hP, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicSong;
        this.l1 = c14390hP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS189S0200000(C24620xu[] c24620xuArr, C24620xu<?>[] c24620xuArr2, InterfaceC37431dT<AbstractC24370xV<Object>, ? extends InterfaceC24760y8<? extends Object>> interfaceC37431dT) {
        super(2);
        this.$t = interfaceC37431dT;
        this.l0 = c24620xuArr;
        this.l1 = c24620xuArr2;
    }
}
