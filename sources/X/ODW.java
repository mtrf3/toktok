package X;

import java.util.HashMap;

/* loaded from: classes11.dex */
public final class ODW {
    public final java.util.Map<String, OEA> LIZ = new HashMap();
    public OE9 LIZIZ;

    public final OE0 LIZ(Class<? extends AbstractC61539ODf> cls) {
        OEE oee = new OEE();
        oee.LIZ = cls;
        oee.LIZJ = new Object[]{this.LIZ};
        oee.LIZIZ = this.LIZIZ;
        return new OE0(oee);
    }

    public final OEA LIZIZ(String str) {
        if (!((HashMap) this.LIZ).containsKey(str)) {
            OEA oea = new OEA();
            ((HashMap) this.LIZ).put(str, oea);
            return oea;
        }
        throw new IllegalArgumentException("duplicated branch name");
    }
}
