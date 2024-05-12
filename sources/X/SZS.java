package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SZS {
    public final InterfaceC88472Yns<SZZ, C76800UCe> LIZ;
    public volatile SZZ LIZIZ = SZZ.LJLJI;

    public SZS(AqS178S0100000_12 aqS178S0100000_12) {
        this.LIZ = aqS178S0100000_12;
    }

    public final void LIZ(SZY action, SZP type, Object obj) {
        AbstractC72298SZa c72304SZg;
        Exception exc;
        o.LJIIIZ(action, "action");
        o.LJIIIZ(type, "type");
        int i = SZR.LIZ[action.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (!(obj instanceof Exception) || (exc = (Exception) obj) == null) {
                            exc = new Exception();
                        }
                        c72304SZg = new C72299SZb(type, exc, null);
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    c72304SZg = new C72302SZe(type, null);
                }
            } else {
                c72304SZg = new C72303SZf(type, null);
            }
        } else {
            c72304SZg = new C72304SZg(type, null);
        }
        SZT szt = this.LIZIZ.LJLILLLLZI;
        szt.getClass();
        InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) ((LinkedHashMap) SZT.LJLJI).get(action);
        if (interfaceC88473Ynt != null) {
            AbstractC72298SZa prev = (AbstractC72298SZa) interfaceC88473Ynt.invoke(szt.LJLIL, type, obj);
            AbstractC72298SZa next = (AbstractC72298SZa) interfaceC88473Ynt.invoke(szt.LJLILLLLZI, type, obj);
            o.LJIIIZ(prev, "prev");
            o.LJIIIZ(next, "next");
            szt = new SZT(prev, next);
        }
        SZZ szz = new SZZ(c72304SZg, szt);
        if (!o.LJ(szz, this.LIZIZ)) {
            this.LIZIZ = szz;
            this.LIZ.invoke(this.LIZIZ);
        }
    }
}
