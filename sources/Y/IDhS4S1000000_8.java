package Y;

import X.InterfaceC48038ItG;
import com.lynx.tasm.TemplateData;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDhS4S1000000_8 implements InterfaceC48038ItG {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public IDhS4S1000000_8(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object apply$0(IDhS4S1000000_8 iDhS4S1000000_8, Object it) {
        o.LJIIIZ(it, "it");
        return TemplateData.LJFF(iDhS4S1000000_8.s0);
    }

    public static final Object apply$1(IDhS4S1000000_8 iDhS4S1000000_8, Object it) {
        o.LJIIIZ(it, "it");
        TemplateData LJFF = TemplateData.LJFF(iDhS4S1000000_8.s0);
        LJFF.LIZLLL = "allSearchDataProcess";
        return LJFF;
    }
}
