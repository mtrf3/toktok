package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C29494Bhq;
import X.C76086Tta;
import X.C76265TwT;
import X.C76279Twh;
import X.C76280Twi;
import X.C76470Tzm;
import X.C76800UCe;
import X.DialogInterfaceOnDismissListenerC76397Tyb;
import X.DialogInterfaceOnDismissListenerC76398Tyc;
import X.EnumC76319TxL;
import X.EnumC76391TyV;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.U7U;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;

/* loaded from: classes14.dex */
public class AqS24S0310000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AqS24S0310000_13 aqS24S0310000_13) {
        ((C76279Twh) aqS24S0310000_13.l0).LJJIIJZLJL((EnumC76319TxL) aqS24S0310000_13.l1, (InterfaceC88472Yns) aqS24S0310000_13.l2, aqS24S0310000_13.z3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS24S0310000_13 aqS24S0310000_13) {
        C76280Twi c76280Twi;
        FragmentManager fragmentManager;
        C76470Tzm c76470Tzm = (C76470Tzm) aqS24S0310000_13.l0;
        boolean z = aqS24S0310000_13.z3;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS24S0310000_13.l1;
        InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) aqS24S0310000_13.l2;
        LinkDialog linkDialog = c76470Tzm.LLIILZL;
        if (linkDialog != null) {
            linkDialog.setOnDismissListener(DialogInterfaceOnDismissListenerC76398Tyc.LJLIL);
        }
        LinkDialog linkDialog2 = c76470Tzm.LLIILZL;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        WIDGET widget = c76470Tzm.LJLIL;
        if (widget != 0) {
            LinkDialog linkDialog3 = new LinkDialog(widget);
            linkDialog3.Al(EnumC76391TyV.TYPE_MATCH_GIFT_SELECT, new C76086Tta(z));
            c76470Tzm.LLIIZ = linkDialog3;
            linkDialog3.setOnDismissListener(new DialogInterfaceOnDismissListenerC76397Tyb(c76470Tzm, c76280Twi, z, interfaceC65784Pro, interfaceC65784Pro2));
            LinkDialog linkDialog4 = c76470Tzm.LLIIZ;
            if (linkDialog4 != null) {
                DataChannel LJJIIZI = c76470Tzm.LJJIIZI();
                if (LJJIIZI != null) {
                    fragmentManager = (FragmentManager) LJJIIZI.kv0(C29494Bhq.class);
                } else {
                    fragmentManager = null;
                }
                linkDialog4.show(fragmentManager, "LinkDialog");
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLowCapFpsSetting.INSTANCE.isEnable() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013a, code lost:
    
        if (r11 > 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012f, code lost:
    
        if (r12 > 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AqS24S0310000_13 r15) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS24S0310000_13.invoke$2(kotlin.jvm.internal.AqS24S0310000_13):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS24S0310000_13(C76279Twh c76279Twh, EnumC76319TxL enumC76319TxL, InterfaceC88472Yns interfaceC88472Yns, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c76279Twh;
        this.l1 = enumC76319TxL;
        this.z3 = z;
        this.l2 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS24S0310000_13(C76470Tzm c76470Tzm, C76470Tzm c76470Tzm2, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(0);
        this.$t = interfaceC65784Pro2;
        this.l0 = c76470Tzm;
        this.z3 = c76470Tzm2;
        this.l1 = z;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS24S0310000_13(boolean z, U7U u7u, LiveCore liveCore, Resolution resolution, int i) {
        super(0);
        this.$t = i;
        this.z3 = z;
        this.l0 = u7u;
        this.l1 = liveCore;
        this.l2 = resolution;
    }
}
