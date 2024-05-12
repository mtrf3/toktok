package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Request;

/* renamed from: X.IrG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47914IrG implements InvocationHandler {
    public final /* synthetic */ C47780Ip6 LIZ;

    public C47914IrG(C47780Ip6 c47780Ip6) {
        this.LIZ = c47780Ip6;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String str;
        java.util.Map map;
        TTVideoEngineLog.d("IntertrustDrmHelper", "network listener invoke");
        String name = method.getName();
        if (name.equals("startTask")) {
            Object obj2 = objArr[0];
            if (obj2 != null) {
                str = obj2.toString();
            } else {
                str = "";
            }
            Object obj3 = objArr[1];
            if (obj3 != null) {
                map = (java.util.Map) obj3;
            } else {
                map = null;
            }
            Object obj4 = objArr[2];
            C47780Ip6 c47780Ip6 = this.LIZ;
            C47985IsP c47985IsP = c47780Ip6.LJ;
            C47788IpE c47788IpE = new C47788IpE(c47780Ip6);
            c47985IsP.getClass();
            synchronized (C47985IsP.class) {
                C47985IsP.LJI();
            }
            C64618PXq c64618PXq = new C64618PXq();
            c64618PXq.LJII(str);
            if (map != null && map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        c64618PXq.LIZ((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            C64600PWy c64600PWy = C47985IsP.LIZJ;
            Request LIZIZ = c64618PXq.LIZIZ();
            c64600PWy.getClass();
            C64587PWl LIZJ = C64587PWl.LIZJ(c64600PWy, LIZIZ, false);
            c47985IsP.LIZ = LIZJ;
            C47985IsP.LJFF(LIZJ, new C47982IsM(c47788IpE));
        } else if (name.equals("cancel")) {
            this.LIZ.LJ.LIZ();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invalid method name:");
            LIZ.append(name);
            TTVideoEngineLog.w("IntertrustDrmHelper", X1D.LIZIZ(LIZ));
        }
        return null;
    }
}
