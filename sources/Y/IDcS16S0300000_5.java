package Y;

import X.B84;
import X.BIK;
import X.BZI;
import X.C0K7;
import X.C28523BHj;
import X.C28527BHn;
import X.C28787BRn;
import X.C29183Bcp;
import X.C30868C9o;
import X.C3C5;
import X.C51029K0z;
import X.C76800UCe;
import X.C78847Ux1;
import X.EnumC28526BHm;
import X.EnumC74991Tbv;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.OuterMultiGuestLayoutChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class IDcS16S0300000_5 implements C0K7 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LJIILLIIL$0(this, liveDialog);
                return;
            case 1:
                LJIILLIIL$1(this, liveDialog);
                return;
            case 2:
                LJIILLIIL$2(this, liveDialog);
                return;
            case 3:
                LJIILLIIL$3(this, liveDialog);
                return;
            case 4:
                LJIILLIIL$4(this, liveDialog);
                return;
            case 5:
                LJIILLIIL$5(this, liveDialog);
                return;
            default:
                return;
        }
    }

    public static final void LJIILLIIL$0(IDcS16S0300000_5 iDcS16S0300000_5, LiveDialog liveDialog) {
        EnumC74991Tbv enumC74991Tbv;
        if (((IInteractService) iDcS16S0300000_5.l0).Yu0() > 4) {
            ((InterfaceC88472Yns) iDcS16S0300000_5.l1).invoke(Boolean.FALSE);
            C30868C9o.LIZJ(R.string.kti);
        } else {
            DataChannel LJIILIIL = C51029K0z.LJIILIIL((Fragment) iDcS16S0300000_5.l2);
            if (LJIILIIL != null) {
                if (((IInteractService) iDcS16S0300000_5.l0).VY()) {
                    enumC74991Tbv = EnumC74991Tbv.FLOAT_FIX;
                } else {
                    enumC74991Tbv = EnumC74991Tbv.FLOAT;
                }
                LJIILIIL.qv0(OuterMultiGuestLayoutChangeEvent.class, new B84(enumC74991Tbv, new ARunnableS37S0100000_1((InterfaceC88472Yns) iDcS16S0300000_5.l1, 75)));
            }
        }
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL((Fragment) iDcS16S0300000_5.l2);
        BZI LIZ = C28787BRn.LIZ("livesdk_multi_pictionary_change_popup_click");
        LIZ.LJIILLIIL(LJIILIIL2);
        LIZ.LJIJJ("ok", "click_type");
        LIZ.LJJIIJZLJL();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$1(IDcS16S0300000_5 iDcS16S0300000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDcS16S0300000_5.l0;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
        ((C28527BHn) iDcS16S0300000_5.l1).LJFF.invoke(EnumC28526BHm.DIALOG_CLICK_POSITIVE);
        C78847Ux1.LJJJJJ(((BIK) iDcS16S0300000_5.l2).LIZIZ, "click_go_live");
    }

    public static final void LJIILLIIL$2(IDcS16S0300000_5 iDcS16S0300000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDcS16S0300000_5.l0;
        Boolean bool = Boolean.TRUE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
        ((C28527BHn) iDcS16S0300000_5.l1).LIZJ.invoke();
        ((C28527BHn) iDcS16S0300000_5.l1).LJFF.invoke(EnumC28526BHm.DIALOG_CLICK_NEGATIVE);
        C78847Ux1.LJJJJJ(((BIK) iDcS16S0300000_5.l2).LIZIZ, "click_remove");
    }

    public static final void LJIILLIIL$3(IDcS16S0300000_5 iDcS16S0300000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((C28523BHj) iDcS16S0300000_5.l0).getClass();
        C28523BHj.LIZJ("agree");
        C78847Ux1.LJJJJJ(((BIK) iDcS16S0300000_5.l1).LIZIZ, "click_go_live");
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDcS16S0300000_5.l2;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }

    public static final void LJIILLIIL$4(IDcS16S0300000_5 iDcS16S0300000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((C29183Bcp) iDcS16S0300000_5.l0).LIZJ(((BIK) iDcS16S0300000_5.l1).LIZIZ, "go_live");
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDcS16S0300000_5.l2;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }

    public static final void LJIILLIIL$5(IDcS16S0300000_5 iDcS16S0300000_5, LiveDialog liveDialog) {
        ((C29183Bcp) iDcS16S0300000_5.l0).LIZJ(((BIK) iDcS16S0300000_5.l1).LIZIZ, "go_to_settings");
        liveDialog.dismiss();
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDcS16S0300000_5.l2;
        Boolean bool = Boolean.TRUE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDcS16S0300000_5(Object obj, IInteractService iInteractService, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, Fragment fragment) {
        this.$t = fragment;
        this.l0 = obj;
        this.l1 = iInteractService;
        this.l2 = interfaceC88472Yns;
    }
}
