package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C47651In1;
import X.C55252LmK;
import X.C76800UCe;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.JDC;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes9.dex */
public class AqS63S1200000_8 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
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
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS63S1200000_8 aqS63S1200000_8) {
        ((C47651In1) aqS63S1200000_8.l1).LIZ.remove(aqS63S1200000_8.s0);
        ((ArrayList) ((C47651In1) aqS63S1200000_8.l1).LIZLLL).remove((LocalVideoUrlModel) aqS63S1200000_8.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS63S1200000_8 aqS63S1200000_8) {
        C55252LmK tree = ((InterfaceC55235Lm3) aqS63S1200000_8.l1).getTree();
        String str = aqS63S1200000_8.s0;
        if (str == null) {
            str = "source_default_key";
        }
        return tree.LJII((Class) aqS63S1200000_8.l2, str);
    }

    public static final Object invoke$2(AqS63S1200000_8 aqS63S1200000_8) {
        JDC.LIZ((ActivityC45651qj) aqS63S1200000_8.l1, aqS63S1200000_8.s0, (Map) aqS63S1200000_8.l2, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS63S1200000_8 aqS63S1200000_8) {
        JDC.LIZ((ActivityC45651qj) aqS63S1200000_8.l1, aqS63S1200000_8.s0, (Map) aqS63S1200000_8.l2, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS63S1200000_8 aqS63S1200000_8) {
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS63S1200000_8.l1;
        h.LJIIJ(activityC45651qj, new AqS63S1200000_8(activityC45651qj, (ActivityC45651qj) aqS63S1200000_8.s0, (String) aqS63S1200000_8.l2, (Map<String, String>) 3));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS63S1200000_8(ActivityC45651qj activityC45651qj, ActivityC45651qj activityC45651qj2, String str, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l1 = activityC45651qj;
        this.s0 = activityC45651qj2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1200000_8(C47651In1 c47651In1, String str, LocalVideoUrlModel localVideoUrlModel, int i) {
        super(0);
        this.$t = i;
        this.l1 = c47651In1;
        this.s0 = str;
        this.l2 = localVideoUrlModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S1200000_8(InterfaceC55235Lm3 interfaceC55235Lm3, Class cls, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC55235Lm3;
        this.s0 = str;
        this.l2 = cls;
    }
}
