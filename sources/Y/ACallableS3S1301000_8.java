package Y;

import X.C47409Ij7;
import X.C47411Ij9;
import X.C64797Pbt;
import X.IGM;
import X.ILN;
import X.IT4;
import X.InterfaceC37276Ek4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ACallableS3S1301000_8 implements Callable {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object call$0(ACallableS3S1301000_8 aCallableS3S1301000_8) {
        HashMap<String, Object> LJIIL;
        int i;
        int urlProtocolType;
        ILN iln = (ILN) aCallableS3S1301000_8.l1;
        int i2 = aCallableS3S1301000_8.i4;
        IT4 it4 = (IT4) aCallableS3S1301000_8.l2;
        IGM igm = (IGM) aCallableS3S1301000_8.l3;
        String str = aCallableS3S1301000_8.s0;
        HashMap hashMap = new HashMap();
        if (ILN.T_FEED == iln) {
            if (i2 > 0) {
                i = 1;
            } else {
                i = 0;
            }
            hashMap.put("is_cache", Integer.valueOf(i));
            if (it4 == null) {
                urlProtocolType = -1;
            } else {
                urlProtocolType = it4.getUrlProtocolType();
            }
            hashMap.put("url_type", Integer.valueOf(urlProtocolType));
        }
        if (igm != null && (LJIIL = igm.LJIIL(str)) != null && !LJIIL.isEmpty()) {
            hashMap.putAll(LJIIL);
        }
        return hashMap;
    }

    public static final Object call$1(ACallableS3S1301000_8 aCallableS3S1301000_8) {
        InterfaceC37276Ek4<String> post;
        C47411Ij9 c47411Ij9 = new C47411Ij9();
        try {
            if (aCallableS3S1301000_8.i4 != 1) {
                post = ((C47409Ij7) aCallableS3S1301000_8.l3).LIZ.get(aCallableS3S1301000_8.s0, C47409Ij7.LJI((Map) aCallableS3S1301000_8.l1));
            } else {
                post = ((C47409Ij7) aCallableS3S1301000_8.l3).LIZ.post(aCallableS3S1301000_8.s0, C47409Ij7.LJI((Map) aCallableS3S1301000_8.l1), (JSONObject) aCallableS3S1301000_8.l2);
            }
            C64797Pbt<String> execute = post.execute();
            try {
                c47411Ij9.LIZ = new JSONObject(execute.LIZIZ);
            } catch (Exception e) {
                c47411Ij9.LIZIZ = e;
                c47411Ij9.LIZJ = -2;
            }
            if (c47411Ij9.LIZIZ == null && !execute.LIZIZ()) {
                c47411Ij9.LIZIZ = new Exception("http fail");
                c47411Ij9.LIZJ = execute.LIZ.LIZIZ;
            }
        } catch (Exception e2) {
            c47411Ij9.LIZIZ = e2;
        }
        return c47411Ij9;
    }

    public ACallableS3S1301000_8(Object obj, int i, String str, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.l3 = obj;
        this.i4 = i;
        this.s0 = str;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
