package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C77190URe;
import X.C77208URw;
import X.EnumC77147UPn;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.TRS;
import X.URX;
import X.US3;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* loaded from: classes14.dex */
public class AqS0S0410000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S0410000_13 aqS0S0410000_13, Object obj) {
        US3 buildAuthPipeline = (US3) obj;
        o.LJIIIZ(buildAuthPipeline, "$this$buildAuthPipeline");
        buildAuthPipeline.LIZLLL((InterfaceC70422pa) aqS0S0410000_13.l0);
        buildAuthPipeline.LIZJ(new AqS117S0300000_13((EnumC77147UPn) aqS0S0410000_13.l1, (C77190URe) aqS0S0410000_13.l2, (C77208URw) aqS0S0410000_13.l3, 10));
        buildAuthPipeline.LJ(new AqS179S0100000_13((C77208URw) aqS0S0410000_13.l3, 496));
        buildAuthPipeline.LIZIZ(new URX((C77208URw) aqS0S0410000_13.l3, aqS0S0410000_13.z4));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0410000_13 aqS0S0410000_13, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0((Fragment) aqS0S0410000_13.l0, new AqS32S0210000_13(aqS0S0410000_13.z4, (LiveWidget) aqS0S0410000_13.l1, (TRS) aqS0S0410000_13.l2, 2));
        assemble.xv0((Fragment) aqS0S0410000_13.l0, new AqS178S0100000_12((ViewGroup) aqS0S0410000_13.l3, 708));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0410000_13(InterfaceC70422pa interfaceC70422pa, EnumC77147UPn enumC77147UPn, C77190URe c77190URe, C77208URw c77208URw, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC70422pa;
        this.l1 = enumC77147UPn;
        this.l2 = c77190URe;
        this.l3 = c77208URw;
        this.z4 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0410000_13(Fragment fragment, boolean z, LiveWidget liveWidget, TRS trs, ViewGroup viewGroup, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.z4 = z;
        this.l1 = liveWidget;
        this.l2 = trs;
        this.l3 = viewGroup;
    }
}
