package X;

import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.registry.JavaScriptRegistry;
import com.bytedance.vmsdk.worker.JsWorker;
import com.bytedance.vmsdk.worker.VmSdkException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.Epg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37624Epg implements InvocationHandler {
    public final JsWorker LIZ;

    public C37624Epg(JsWorker jsWorker) {
        this.LIZ = jsWorker;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        JavaOnlyArray of = JavaOnlyArray.of(objArr);
        Class<?>[] exceptionTypes = method.getExceptionTypes();
        int length = exceptionTypes.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (VmSdkException.class == exceptionTypes[i]) {
                z = true;
                break;
            }
            i++;
        }
        return this.LIZ.invokeJavaScriptFunction(method.getName(), of, JavaScriptRegistry.returnTypeToChar(method.getReturnType()), z);
    }
}
