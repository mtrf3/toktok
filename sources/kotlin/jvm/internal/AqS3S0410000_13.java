package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0NB;
import X.C29494Bhq;
import X.C30901Je;
import X.C32496CpA;
import X.C36636EZk;
import X.C76086Tta;
import X.C76265TwT;
import X.C76280Twi;
import X.C76469Tzl;
import X.C76800UCe;
import X.C76929UHd;
import X.C76930UHe;
import X.C77190URe;
import X.C77196URk;
import X.C77208URw;
import X.CCJ;
import X.DialogInterfaceOnDismissListenerC76393TyX;
import X.DialogInterfaceOnDismissListenerC76396Tya;
import X.EnumC75644TmS;
import X.EnumC76248TwC;
import X.EnumC76319TxL;
import X.EnumC76391TyV;
import X.EnumC77147UPn;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.InterfaceC76931UHf;
import X.X1D;
import X.XJL;
import X.XKS;
import X.XKX;
import Y.ARunnableS15S0300000_4;
import Y.ARunnableS23S0200000_4;
import Y.ARunnableS32S0200000_13;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes14.dex */
public class AqS3S0410000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS3S0410000_13 aqS3S0410000_13) {
        float width;
        if (((C76930UHe) aqS3S0410000_13.l0).isAttachedToWindow()) {
            C76929UHd boxView = ((C76930UHe) aqS3S0410000_13.l0).getBoxView();
            if (boxView != null) {
                boxView.LJJLJLI((C32496CpA) aqS3S0410000_13.l1, Boolean.valueOf(!aqS3S0410000_13.z4));
            }
            InterfaceC76931UHf interfaceC76931UHf = (InterfaceC76931UHf) aqS3S0410000_13.l2;
            if (interfaceC76931UHf != null) {
                ((C76930UHe) aqS3S0410000_13.l0).LIZ((InterfaceC76931UHf) aqS3S0410000_13.l3, interfaceC76931UHf);
            }
            if (!aqS3S0410000_13.z4) {
                Object obj = (InterfaceC76931UHf) aqS3S0410000_13.l2;
                o.LJII(obj, "null cannot be cast to non-null type android.view.View");
                ((View) obj).setVisibility(8);
                C76930UHe c76930UHe = (C76930UHe) aqS3S0410000_13.l0;
                AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(c76930UHe, 225);
                c76930UHe.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("animateShowBoxWithGuide# endAction : ");
                LIZ.append(aqS163S0100000_13);
                C0NB.LIZIZ("BannerParentLayout", X1D.LIZIZ(LIZ));
                C76929UHd boxView2 = c76930UHe.getBoxView();
                if (boxView2 != null) {
                    boxView2.setVisibility(0);
                    if (CCJ.LIZ(c76930UHe.getContext())) {
                        width = -boxView2.getWidth();
                    } else {
                        width = boxView2.getWidth();
                    }
                    boxView2.setTranslationX(width);
                    boxView2.setAlpha(0.0f);
                    ViewPropertyAnimator animate = boxView2.animate();
                    animate.translationX(0.0f).alpha(1.0f).setDuration(300L).withStartAction(new ARunnableS23S0200000_4(c76930UHe, animate, 45)).withEndAction(new ARunnableS15S0300000_4(c76930UHe, animate, aqS163S0100000_13, 19)).setInterpolator(new C30901Je()).start();
                }
                ((C76930UHe) aqS3S0410000_13.l0).getClass();
                InterfaceC30442Bx8.L0.LIZ(Boolean.TRUE);
            } else {
                ((C76930UHe) aqS3S0410000_13.l0).LIZJ();
                C76930UHe.LIZIZ((C76930UHe) aqS3S0410000_13.l0, true, 2);
                C76930UHe c76930UHe2 = (C76930UHe) aqS3S0410000_13.l0;
                InterfaceC76931UHf interfaceC76931UHf2 = (InterfaceC76931UHf) aqS3S0410000_13.l2;
                c76930UHe2.getClass();
                c76930UHe2.postDelayed(new ARunnableS32S0200000_13(c76930UHe2, interfaceC76931UHf2, 128), 30L);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS3S0410000_13 aqS3S0410000_13) {
        C77190URe c77190URe = (C77190URe) aqS3S0410000_13.l0;
        C77208URw c77208URw = (C77208URw) aqS3S0410000_13.l1;
        EnumC77147UPn enumC77147UPn = (EnumC77147UPn) aqS3S0410000_13.l2;
        boolean z = aqS3S0410000_13.z4;
        XJL xjl = (XJL) aqS3S0410000_13.l3;
        c77190URe.getClass();
        XKX.LIZLLL(c77208URw.LJLIL.LIZJ, C36636EZk.LIZ, null, new C77196URk(c77208URw, enumC77147UPn, c77190URe, z, xjl, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS3S0410000_13 aqS3S0410000_13) {
        C76280Twi c76280Twi;
        FragmentManager fragmentManager;
        C76469Tzl c76469Tzl = (C76469Tzl) aqS3S0410000_13.l0;
        boolean z = aqS3S0410000_13.z4;
        EnumC76319TxL enumC76319TxL = (EnumC76319TxL) aqS3S0410000_13.l1;
        EnumC75644TmS enumC75644TmS = (EnumC75644TmS) aqS3S0410000_13.l2;
        EnumC76248TwC enumC76248TwC = (EnumC76248TwC) aqS3S0410000_13.l3;
        LinkDialog linkDialog = c76469Tzl.LLIIII;
        if (linkDialog != null) {
            linkDialog.setOnDismissListener(DialogInterfaceOnDismissListenerC76396Tya.LJLIL);
        }
        LinkDialog linkDialog2 = c76469Tzl.LLIIII;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        WIDGET widget = c76469Tzl.LJLIL;
        if (widget != 0) {
            LinkDialog linkDialog3 = new LinkDialog(widget);
            linkDialog3.Al(EnumC76391TyV.TYPE_MATCH_GIFT_SELECT, new C76086Tta(z));
            linkDialog3.setOnDismissListener(new DialogInterfaceOnDismissListenerC76393TyX(c76469Tzl, c76280Twi, z, enumC76319TxL, enumC75644TmS, enumC76248TwC));
            DataChannel LJJIIZI = c76469Tzl.LJJIIZI();
            if (LJJIIZI != null) {
                fragmentManager = (FragmentManager) LJJIIZI.kv0(C29494Bhq.class);
            } else {
                fragmentManager = null;
            }
            linkDialog3.show(fragmentManager, "LinkDialog");
            c76469Tzl.LLIIIILZ = linkDialog3;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0410000_13(C76469Tzl c76469Tzl, boolean z, EnumC76319TxL enumC76319TxL, EnumC75644TmS enumC75644TmS, EnumC76248TwC enumC76248TwC, int i) {
        super(0);
        this.$t = i;
        this.l0 = c76469Tzl;
        this.z4 = z;
        this.l1 = enumC76319TxL;
        this.l2 = enumC75644TmS;
        this.l3 = enumC76248TwC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0410000_13(C76930UHe c76930UHe, C32496CpA c32496CpA, boolean z, InterfaceC76931UHf interfaceC76931UHf, InterfaceC76931UHf interfaceC76931UHf2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c76930UHe;
        this.l1 = c32496CpA;
        this.z4 = z;
        this.l2 = interfaceC76931UHf;
        this.l3 = interfaceC76931UHf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0410000_13(C77190URe c77190URe, C77208URw c77208URw, EnumC77147UPn enumC77147UPn, boolean z, XKS xks, int i) {
        super(0);
        this.$t = i;
        this.l0 = c77190URe;
        this.l1 = c77208URw;
        this.l2 = enumC77147UPn;
        this.z4 = z;
        this.l3 = xks;
    }
}
