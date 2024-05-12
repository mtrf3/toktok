package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C31371CSx;
import X.C76800UCe;
import X.CT7;
import X.InterfaceC65784Pro;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;

/* loaded from: classes6.dex */
public class AqS16S0102000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS16S0102000_5 aqS16S0102000_5) {
        CT7 ct7 = ((C31371CSx) aqS16S0102000_5.l0).LIZJ;
        if (ct7 != null) {
            ct7.notifyItemRangeChanged(aqS16S0102000_5.i1, aqS16S0102000_5.i2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS16S0102000_5 aqS16S0102000_5) {
        CT7 ct7 = ((C31371CSx) aqS16S0102000_5.l0).LIZJ;
        if (ct7 != null) {
            ct7.notifyItemRangeInserted(aqS16S0102000_5.i1, aqS16S0102000_5.i2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS16S0102000_5 aqS16S0102000_5) {
        CT7 ct7 = ((C31371CSx) aqS16S0102000_5.l0).LIZJ;
        if (ct7 != null) {
            ct7.notifyItemRangeRemoved(aqS16S0102000_5.i1, aqS16S0102000_5.i2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS16S0102000_5 aqS16S0102000_5) {
        SmoothLinearLayoutManager smoothLinearLayoutManager = ((C31371CSx) aqS16S0102000_5.l0).LIZLLL;
        if (smoothLinearLayoutManager != null) {
            smoothLinearLayoutManager.LJFF(aqS16S0102000_5.i1, aqS16S0102000_5.i2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0102000_5(C31371CSx c31371CSx, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c31371CSx;
        this.i1 = i;
        this.i2 = i2;
    }
}
