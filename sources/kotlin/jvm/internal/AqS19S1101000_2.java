package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C126114xD;
import X.C126124xE;
import X.C5NO;
import X.C76800UCe;
import X.InterfaceC126134xF;
import X.InterfaceC166046fQ;
import X.InterfaceC65784Pro;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.Map;

/* loaded from: classes3.dex */
public class AqS19S1101000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AqS19S1101000_2 aqS19S1101000_2) {
        ((InterfaceC166046fQ) aqS19S1101000_2.l1).LIZIZ(aqS19S1101000_2.i2, 0, aqS19S1101000_2.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS19S1101000_2 aqS19S1101000_2) {
        if (((Map) ((C5NO) aqS19S1101000_2.l1).LIZ.l0).get(Integer.valueOf(aqS19S1101000_2.i2)) == null) {
            ((Map) ((C5NO) aqS19S1101000_2.l1).LIZ.l0).put(Integer.valueOf(aqS19S1101000_2.i2), new MutableLiveData());
        }
        LiveData liveData = (LiveData) ((Map) ((C5NO) aqS19S1101000_2.l1).LIZ.l0).get(Integer.valueOf(aqS19S1101000_2.i2));
        if (liveData != null) {
            liveData.setValue(aqS19S1101000_2.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS19S1101000_2 aqS19S1101000_2) {
        InterfaceC126134xF interfaceC126134xF = ((C126114xD) aqS19S1101000_2.l1).LIZJ;
        if (interfaceC126134xF != null) {
            int i = aqS19S1101000_2.i2;
            String str = aqS19S1101000_2.s0;
            if (str == null) {
                str = "";
            }
            interfaceC126134xF.LIZ(new C126124xE(i, str));
        }
        ((C126114xD) aqS19S1101000_2.l1).LIZJ = null;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS19S1101000_2 aqS19S1101000_2) {
        InterfaceC126134xF interfaceC126134xF = ((C126114xD) aqS19S1101000_2.l1).LIZJ;
        if (interfaceC126134xF != null) {
            int i = aqS19S1101000_2.i2;
            String str = aqS19S1101000_2.s0;
            if (str == null) {
                str = "";
            }
            interfaceC126134xF.LIZ(new C126124xE(i, str));
        }
        ((C126114xD) aqS19S1101000_2.l1).LIZJ = null;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S1101000_2(C126114xD c126114xD, int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c126114xD;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S1101000_2(C5NO c5no, int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c5no;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S1101000_2(InterfaceC166046fQ interfaceC166046fQ, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = interfaceC166046fQ;
        this.s0 = str;
        this.i2 = i;
    }
}
