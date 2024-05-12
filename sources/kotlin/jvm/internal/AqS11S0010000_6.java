package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C35638Dyk;
import X.C35644Dyq;
import X.C35667DzD;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedState;

/* loaded from: classes7.dex */
public class AqS11S0010000_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S0010000_6(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AqS11S0010000_6 aqS11S0010000_6, Object obj) {
        C35638Dyk setState = (C35638Dyk) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C35638Dyk.LIZ(setState, null, null, aqS11S0010000_6.z0, false, false, null, 123);
    }

    public static final Object invoke$1(AqS11S0010000_6 aqS11S0010000_6, Object obj) {
        C35638Dyk setState = (C35638Dyk) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C35638Dyk.LIZ(setState, null, null, false, false, aqS11S0010000_6.z0, null, 111);
    }

    public static final Object invoke$2(AqS11S0010000_6 aqS11S0010000_6, Object obj) {
        CutVideoSpeedState setState = (CutVideoSpeedState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoSpeedState.copy$default(setState, null, Boolean.valueOf(aqS11S0010000_6.z0), 1, null);
    }

    public static final Object invoke$3(AqS11S0010000_6 aqS11S0010000_6, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C35644Dyq(Boolean.valueOf(aqS11S0010000_6.z0));
    }

    public static final Object invoke$4(AqS11S0010000_6 aqS11S0010000_6, Object obj) {
        CutVideoSpeedState setState = (CutVideoSpeedState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoSpeedState.copy$default(setState, Boolean.valueOf(aqS11S0010000_6.z0), null, 2, null);
    }

    public static final Object invoke$5(AqS11S0010000_6 aqS11S0010000_6, Object obj) {
        C35667DzD setState = (C35667DzD) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C35667DzD.LIZ(setState, Boolean.valueOf(aqS11S0010000_6.z0), 0, 2);
    }
}
