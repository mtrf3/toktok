package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0N9;
import X.C0WT;
import X.C30355Bvj;
import X.C30426Bws;
import X.C31255COl;
import X.C31371CSx;
import X.C32021Nm;
import X.C65352Pkq;
import X.C76800UCe;
import X.CT7;
import X.InterfaceC65784Pro;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewFilterStyleWidget;

/* loaded from: classes6.dex */
public class AqS105S0101000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
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
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS105S0101000_5 aqS105S0101000_5) {
        ((C30426Bws) aqS105S0101000_5.l0).LJI(aqS105S0101000_5.i1);
        PreviewFilterStyleWidget previewFilterStyleWidget = (PreviewFilterStyleWidget) C0N9.LIZIZ(C65352Pkq.LIZ(PreviewFilterStyleWidget.class));
        if (previewFilterStyleWidget != null) {
            previewFilterStyleWidget.LLF(((C30426Bws) aqS105S0101000_5.l0).LJLJLJ.LIZJ(), ((C30426Bws) aqS105S0101000_5.l0).LJ().LJ());
        }
        C0WT LJIIIIZZ = C30355Bvj.LJIIIIZZ();
        C30426Bws c30426Bws = (C30426Bws) aqS105S0101000_5.l0;
        C32021Nm c32021Nm = (C32021Nm) LJIIIIZZ;
        c32021Nm.LIZJ("FilterGestureDetector#initGesture#onFling", false);
        c32021Nm.LJI(c30426Bws.LJLIL, "FilterGestureDetector#initGesture#onFling", false, false);
        C32021Nm.LIZ("FilterGestureDetector#initGesture#onFling");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS105S0101000_5 aqS105S0101000_5) {
        ((C30426Bws) aqS105S0101000_5.l0).LJI(aqS105S0101000_5.i1);
        PreviewFilterStyleWidget previewFilterStyleWidget = (PreviewFilterStyleWidget) C0N9.LIZIZ(C65352Pkq.LIZ(PreviewFilterStyleWidget.class));
        if (previewFilterStyleWidget != null) {
            previewFilterStyleWidget.LLF(((C30426Bws) aqS105S0101000_5.l0).LJLJLJ.LIZJ(), ((C30426Bws) aqS105S0101000_5.l0).LJ().LJ());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS105S0101000_5 aqS105S0101000_5) {
        CT7 ct7 = ((C31371CSx) aqS105S0101000_5.l0).LIZJ;
        if (ct7 != null) {
            ct7.notifyItemChanged(aqS105S0101000_5.i1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS105S0101000_5 aqS105S0101000_5) {
        C31255COl c31255COl = ((C31371CSx) aqS105S0101000_5.l0).LIZ;
        if (c31255COl != null) {
            c31255COl.LJLI(aqS105S0101000_5.i1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS105S0101000_5 aqS105S0101000_5) {
        C31255COl c31255COl = ((C31371CSx) aqS105S0101000_5.l0).LIZ;
        if (c31255COl != null) {
            c31255COl.LJLIL(aqS105S0101000_5.i1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0101000_5(C30426Bws c30426Bws, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c30426Bws;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS105S0101000_5(C31371CSx c31371CSx, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c31371CSx;
        this.i1 = i;
    }
}
