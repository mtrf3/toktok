package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.P8z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C63977P8z implements InvocationHandler {
    public final List<String> LIZ;
    public boolean LIZIZ;
    public String LIZJ;

    public C63977P8z(List<String> list) {
        this.LIZ = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = PVA.LIZIZ;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.LIZIZ = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.LIZ;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (this.LIZ.contains(ListProtector.get(list, i))) {
                        String str = (String) ListProtector.get(list, i);
                        this.LIZJ = str;
                        return str;
                    }
                }
                String str2 = (String) ListProtector.get(this.LIZ, 0);
                this.LIZJ = str2;
                return str2;
            }
        }
        if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
            this.LIZJ = (String) objArr[0];
            return null;
        }
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{this, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2804186661747901078"));
        if (LIZJ.LIZ) {
            return LIZJ.LIZIZ;
        }
        return method.invoke(this, objArr);
    }
}
