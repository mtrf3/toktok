package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.IpM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47796IpM implements InvocationHandler {
    public final /* synthetic */ C47780Ip6 LIZ;

    public C47796IpM(C47780Ip6 c47780Ip6) {
        this.LIZ = c47780Ip6;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        int i;
        String str;
        TTVideoEngineLog.d("IntertrustDrmHelper", "intertrust listener invoke");
        String name = method.getName();
        if (name.equals("onTokenProcessed")) {
            C47780Ip6 c47780Ip6 = this.LIZ;
            c47780Ip6.LJI.sendMessage(c47780Ip6.LJI.obtainMessage(0));
            return null;
        }
        if (name.equals("onError")) {
            Object obj2 = objArr[0];
            int i2 = -1;
            if (obj2 != null) {
                i = ((Integer) obj2).intValue();
            } else {
                i = -1;
            }
            Object obj3 = objArr[1];
            if (obj3 != null) {
                i2 = ((Integer) obj3).intValue();
            }
            Object obj4 = objArr[2];
            if (obj4 != null) {
                str = obj4.toString();
            } else {
                str = "";
            }
            if (i == -600000) {
                i = -9935;
            } else if (i == -600001) {
                i = -9934;
            }
            C47780Ip6 c47780Ip62 = this.LIZ;
            c47780Ip62.LJI.sendMessage(c47780Ip62.LJI.obtainMessage(1, new C47789IpF("kTTVideoErrorDomainIntertrustDRM", i, i2, str)));
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invalid method name:");
        LIZ.append(name);
        TTVideoEngineLog.w("IntertrustDrmHelper", X1D.LIZIZ(LIZ));
        return null;
    }
}
