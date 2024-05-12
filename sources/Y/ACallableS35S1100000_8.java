package Y;

import X.IGM;
import X.ILN;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public class ACallableS35S1100000_8 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS35S1100000_8 aCallableS35S1100000_8) {
        HashMap<String, Object> LJIIL;
        IGM igm = (IGM) aCallableS35S1100000_8.l1;
        String str = aCallableS35S1100000_8.s0;
        HashMap hashMap = new HashMap();
        if (igm != null && (LJIIL = igm.LJIIL(str)) != null && !LJIIL.isEmpty()) {
            hashMap.putAll(LJIIL);
        }
        return hashMap;
    }

    public static final Object call$1(ACallableS35S1100000_8 aCallableS35S1100000_8) {
        HashMap<String, Object> LJIIL;
        IGM igm = (IGM) aCallableS35S1100000_8.l1;
        String str = aCallableS35S1100000_8.s0;
        HashMap hashMap = new HashMap();
        if (igm != null && (LJIIL = igm.LJIIL(str)) != null && !LJIIL.isEmpty()) {
            hashMap.putAll(LJIIL);
        }
        return hashMap;
    }

    public ACallableS35S1100000_8(ILN iln, IGM igm, String str, int i) {
        this.$t = i;
        this.l1 = igm;
        this.s0 = str;
    }
}
