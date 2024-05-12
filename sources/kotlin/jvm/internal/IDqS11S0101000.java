package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass057;
import X.C03720Cq;
import X.C07190Pz;
import X.C07730Sb;
import X.C09330Yf;
import X.C0MC;
import X.C0NP;
import X.C0YW;
import X.C0YZ;
import X.C13040fE;
import X.C18490o1;
import X.C18750oR;
import X.C1M1;
import X.C1P2;
import X.C20140qg;
import X.C21440sm;
import X.C24830yF;
import X.C30021Fu;
import X.C32371Ov;
import X.C35931b3;
import X.C35991b9;
import X.C36531c1;
import X.C36541c2;
import X.C40431iJ;
import X.C43991o3;
import X.C46041rM;
import X.C530626k;
import X.C530726l;
import X.C56509MFt;
import X.C76800UCe;
import X.C78929UyL;
import X.InterfaceC015404g;
import X.InterfaceC03730Cr;
import X.InterfaceC07760Se;
import X.InterfaceC07790Sh;
import X.InterfaceC13090fJ;
import X.InterfaceC24390xX;
import X.InterfaceC24420xa;
import X.InterfaceC24520xk;
import X.InterfaceC273215k;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;
import X.V1I;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import tikcast.api.perception.ViolationStatusResponse;

/* loaded from: classes.dex */
public class IDqS11S0101000 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i1;
    public Object l0;

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
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0101000(int i, InterfaceC88471Ynr interfaceC88471Ynr, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC88471Ynr;
        this.i1 = i;
    }

    public static final Object invoke$0(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((ComposeView) iDqS11S0101000.l0).LIZ((InterfaceC24520xk) obj, iDqS11S0101000.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C30021Fu) iDqS11S0101000.l0).LIZ((InterfaceC24520xk) obj, iDqS11S0101000.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C21440sm.LIZ((InterfaceC88471Ynr) iDqS11S0101000.l0, (InterfaceC24520xk) obj, iDqS11S0101000.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) iDqS11S0101000.l0;
            int i = (iDqS11S0101000.i1 << 9) & 7168;
            interfaceC24520xk.LJJIIJ(-483455358);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            C32371Ov c32371Ov = C0YW.LIZJ;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, interfaceC24520xk);
            interfaceC24520xk.LJJIIJ(-1323940314);
            Object LJIILLIIL = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIIJ);
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
            int i2 = ((((i << 3) & 112) << 9) & 7168) | 6;
            if (interfaceC24520xk.LJJ() instanceof InterfaceC24420xa) {
                interfaceC24520xk.LJIJI();
                if (interfaceC24520xk.LJIJJLI()) {
                    interfaceC24520xk.LJJI(c46041rM);
                } else {
                    interfaceC24520xk.LIZIZ();
                }
                interfaceC24520xk.LJJIIZI();
                C24830yF.LIZ(interfaceC24520xk, LIZ, C03720Cq.LJ);
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL2, C03720Cq.LJFF);
                LJIIL.invoke(V1I.LIZIZ(interfaceC24520xk, interfaceC015404g, C03720Cq.LJI, interfaceC24520xk), interfaceC24520xk, Integer.valueOf((i2 >> 3) & 112));
                interfaceC24520xk.LJJIIJ(2058660585);
                interfaceC24520xk.LJJIIJ(-1163856341);
                if (((i2 >> 9) & 14 & 11) != 2 || !interfaceC24520xk.LIZ()) {
                    interfaceC88473Ynt.invoke(C1P2.LIZ, interfaceC24520xk, Integer.valueOf(((i >> 6) & 112) | 6));
                } else {
                    interfaceC24520xk.LIZLLL();
                }
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJIJ();
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJJIJIIJIL();
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        if (obj2 instanceof InterfaceC24390xX) {
            ((C35931b3) iDqS11S0101000.l0).LJJIIZ.LJIILIIL(iDqS11S0101000.i1);
            ((C35931b3) iDqS11S0101000.l0).LJJLIIJ(false, new C530626k(iDqS11S0101000.i1, intValue, obj2));
        } else if (obj2 instanceof C35991b9) {
            C35991b9 c35991b9 = (C35991b9) obj2;
            C43991o3 c43991o3 = c35991b9.LIZIZ;
            if (c43991o3 != null) {
                c43991o3.LJLLL = true;
                c35991b9.LIZIZ = null;
                c35991b9.LJFF = null;
                c35991b9.LJI = null;
            }
            ((C35931b3) iDqS11S0101000.l0).LJJIIZ.LJIILIIL(iDqS11S0101000.i1);
            ((C35931b3) iDqS11S0101000.l0).LJJLIIJ(false, new C530726l(iDqS11S0101000.i1, intValue, obj2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C36531c1) iDqS11S0101000.l0).LIZ((InterfaceC24520xk) obj, iDqS11S0101000.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C36541c2) iDqS11S0101000.l0).LIZ((InterfaceC24520xk) obj, iDqS11S0101000.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        boolean z;
        String action = (String) obj;
        String clickType = (String) obj2;
        o.LJIIIZ(action, "action");
        o.LJIIIZ(clickType, "clickType");
        ViolationStatusResponse.ResponseData responseData = (ViolationStatusResponse.ResponseData) iDqS11S0101000.l0;
        PunishEventInfo punishEventInfo = responseData.punishEvent;
        if (punishEventInfo != null) {
            if (iDqS11S0101000.i1 == 2) {
                z = true;
            } else {
                z = false;
            }
            C0NP.LIZIZ(punishEventInfo, action, clickType, z, responseData.perceptionDialog);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C07190Pz) iDqS11S0101000.l0).LIZ((InterfaceC24520xk) obj, iDqS11S0101000.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C0YZ.LIZ((InterfaceC07790Sh) iDqS11S0101000.l0, (InterfaceC24520xk) obj, iDqS11S0101000.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            ((InterfaceC13090fJ) iDqS11S0101000.l0).LIZ(iDqS11S0101000.i1, interfaceC24520xk, 0);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C13040fE.LIZ((InterfaceC88473Ynt) iDqS11S0101000.l0, (InterfaceC24520xk) obj, iDqS11S0101000.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C18490o1.LIZIZ((InterfaceC07790Sh) iDqS11S0101000.l0, (InterfaceC24520xk) obj, iDqS11S0101000.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C18750oR.LIZJ((C20140qg) iDqS11S0101000.l0, (InterfaceC24520xk) obj, iDqS11S0101000.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS11S0101000 iDqS11S0101000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C21440sm.LIZ((InterfaceC88471Ynr) iDqS11S0101000.l0, interfaceC24520xk, (iDqS11S0101000.i1 >> 9) & 14);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0101000(C07190Pz c07190Pz, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c07190Pz;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0101000(InterfaceC07790Sh interfaceC07790Sh, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC07790Sh;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0101000(InterfaceC13090fJ interfaceC13090fJ, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC13090fJ;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0101000(C20140qg c20140qg, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c20140qg;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0101000(C30021Fu c30021Fu, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c30021Fu;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0101000(C35931b3 c35931b3, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c35931b3;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0101000(C36531c1 c36531c1, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c36531c1;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0101000(C36541c2 c36541c2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c36541c2;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS11S0101000(InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88473Ynt<? super C0MC, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt2, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC88473Ynt;
        this.i1 = interfaceC88473Ynt2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0101000(ComposeView composeView, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = composeView;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0101000(ViolationStatusResponse.ResponseData responseData, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = responseData;
        this.i1 = i;
    }
}
