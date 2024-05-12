package X;

import android.text.TextUtils;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.registry.JavaScriptRegistry;
import com.bytedance.vmsdk.worker.JsWorker;
import com.bytedance.vmsdk.worker.VmSdkException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.Epf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37623Epf implements InvocationHandler {
    public final JsWorker LIZ;
    public String LIZIZ;
    public final Class<? extends InterfaceC37634Epq> LIZJ;

    public C37623Epf(JsWorker jsWorker, Class<? extends InterfaceC37634Epq> cls) {
        this.LIZ = jsWorker;
        this.LIZJ = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        JavaOnlyArray of = JavaOnlyArray.of(objArr);
        Class<?>[] exceptionTypes = method.getExceptionTypes();
        int length = exceptionTypes.length;
        for (int i = 0; i < length && VmSdkException.class != exceptionTypes[i]; i++) {
        }
        JsWorker jsWorker = this.LIZ;
        if (TextUtils.isEmpty(this.LIZIZ)) {
            String name = ((InterfaceC37629Epl) this.LIZJ.getAnnotation(InterfaceC37629Epl.class)).name();
            if ("".equals(name)) {
                name = C16880lQ.LJLLJ(this.LIZJ);
            }
            this.LIZIZ = name;
        }
        return jsWorker.invokeJavaScriptModule(this.LIZIZ, method.getName(), of, JavaScriptRegistry.returnTypeToChar(method.getReturnType()));
    }
}
