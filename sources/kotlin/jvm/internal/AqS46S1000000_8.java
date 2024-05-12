package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C47300IhM;
import X.InterfaceC65784Pro;
import X.JEP;
import com.bytedance.keva.Keva;

/* loaded from: classes9.dex */
public class AqS46S1000000_8 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS46S1000000_8 aqS46S1000000_8) {
        C47300IhM.LIZ.getClass();
        Object value = C47300IhM.LJ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        String string = ((Keva) value).getString(aqS46S1000000_8.s0, null);
        if (o.LJ(string, "--KEVA_EMPTY_OBJECT--")) {
            return null;
        }
        return string;
    }

    public static final Object invoke$1(AqS46S1000000_8 aqS46S1000000_8) {
        String tag = aqS46S1000000_8.s0;
        o.LJIIIZ(tag, "tag");
        return new JEP(tag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S1000000_8(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
