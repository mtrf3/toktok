package Y;

import X.C1HQ;
import X.C50859Jxf;
import X.C75792yF;
import X.C78857UxB;
import X.InterfaceC48038ItG;
import X.JRJ;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDhS69S0200000_8 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final Object apply$0(IDhS69S0200000_8 iDhS69S0200000_8, Object obj) {
        C1HQ it = (C1HQ) obj;
        o.LJIIIZ(it, "it");
        if (C78857UxB.LJJJIL(((DynamicPatch) iDhS69S0200000_8.l0).getRawData())) {
            TemplateData LJFF = TemplateData.LJFF(((DynamicPatch) iDhS69S0200000_8.l0).getRawData());
            C50859Jxf.LIZJ(LJFF, (C1HQ) iDhS69S0200000_8.l1);
            return LJFF;
        }
        return TemplateData.LJ(it);
    }

    public static final Object apply$1(IDhS69S0200000_8 iDhS69S0200000_8, Object obj) {
        JavaOnlyMap it = (JavaOnlyMap) obj;
        o.LJIIIZ(it, "it");
        JRJ jrj = (JRJ) iDhS69S0200000_8.l0;
        Class cls = (Class) iDhS69S0200000_8.l1;
        jrj.LJ(it);
        return C75792yF.LIZ(C75792yF.LIZJ(it), cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDhS69S0200000_8(Object obj, DynamicPatch dynamicPatch, C1HQ<String, Object> c1hq) {
        this.$t = c1hq;
        this.l0 = obj;
        this.l1 = dynamicPatch;
    }
}
