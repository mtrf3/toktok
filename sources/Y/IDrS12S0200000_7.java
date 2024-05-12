package Y;

import X.C0A6;
import X.C44060HQy;
import X.C45719Hwx;
import X.C73125Smv;
import X.InterfaceC44059HQx;
import X.InterfaceC44061HQz;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDrS12S0200000_7 extends C0A6 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 1:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
                o.LJIIIZ(recyclerView, "recyclerView");
                return;
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
        }
    }

    public IDrS12S0200000_7(C44060HQy c44060HQy, int i) {
        this.$t = i;
        this.l1 = c44060HQy;
    }

    public static final void LJIILJJIL$0(IDrS12S0200000_7 iDrS12S0200000_7, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C45719Hwx) iDrS12S0200000_7.l0).LJJLL(iDrS12S0200000_7);
        C45719Hwx.LJLJJL((C45719Hwx) iDrS12S0200000_7.l0, (Context) iDrS12S0200000_7.l1);
    }

    public static final void LJIILJJIL$1(IDrS12S0200000_7 iDrS12S0200000_7, int i, RecyclerView recyclerView) {
        InterfaceC44061HQz interfaceC44061HQz;
        InterfaceC44059HQx interfaceC44059HQx;
        boolean z;
        InterfaceC44059HQx interfaceC44059HQx2;
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C44060HQy) iDrS12S0200000_7.l1).LIZLLL.invoke(Integer.valueOf(i));
        if (((C73125Smv) ((C44060HQy) iDrS12S0200000_7.l1).LIZ.findViewById(R.id.k4z)).getHasEvent() && ((Boolean) iDrS12S0200000_7.l0) == null) {
            if (i != 0) {
                InterfaceC44059HQx interfaceC44059HQx3 = (InterfaceC44059HQx) ((C44060HQy) iDrS12S0200000_7.l1).LIZIZ.LJ(InterfaceC44059HQx.class);
                if (interfaceC44059HQx3 != null && !interfaceC44059HQx3.isPaused()) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                iDrS12S0200000_7.l0 = valueOf;
                if (o.LJ(valueOf, Boolean.TRUE) && (interfaceC44059HQx2 = (InterfaceC44059HQx) ((C44060HQy) iDrS12S0200000_7.l1).LIZIZ.LJ(InterfaceC44059HQx.class)) != null) {
                    interfaceC44059HQx2.ka(false);
                    return;
                }
                return;
            }
        } else if (i != 0) {
            return;
        }
        if (o.LJ((Boolean) iDrS12S0200000_7.l0, Boolean.TRUE) && (interfaceC44061HQz = (InterfaceC44061HQz) ((C44060HQy) iDrS12S0200000_7.l1).LIZIZ.LJ(InterfaceC44061HQz.class)) != null && interfaceC44061HQz.LLLLJI() && (interfaceC44059HQx = (InterfaceC44059HQx) ((C44060HQy) iDrS12S0200000_7.l1).LIZIZ.LJ(InterfaceC44059HQx.class)) != null) {
            interfaceC44059HQx.play();
        }
        iDrS12S0200000_7.l0 = null;
    }

    public IDrS12S0200000_7(C45719Hwx c45719Hwx, Context context, AttributeSet attributeSet, int i) {
        this.$t = i;
        this.l0 = c45719Hwx;
        this.l1 = context;
    }

    public static final void LJIILL$0(IDrS12S0200000_7 iDrS12S0200000_7, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0 || i2 != 0) {
            ((C45719Hwx) iDrS12S0200000_7.l0).LJJLL(iDrS12S0200000_7);
            C45719Hwx.LJLJJL((C45719Hwx) iDrS12S0200000_7.l0, (Context) iDrS12S0200000_7.l1);
        }
    }
}
