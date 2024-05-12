package X;

import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.LynxModuleWrapper;
import com.lynx.jsbridge.MethodDescriptor;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class F54 {
    public static Object LIZ(LynxModule lynxModule, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{lynxModule, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-625633097708768442"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(lynxModule, objArr);
    }

    public static Object LIZIZ(String str, Object obj, LynxModuleManager lynxModuleManager) {
        boolean z;
        if (!(obj instanceof ReadableMap)) {
            return null;
        }
        ReadableMap map = ((ReadableMap) obj).getMap("methodDetail", new JavaOnlyMap());
        String string = map.getString("module", null);
        String string2 = map.getString("method", null);
        if (string == null) {
            return null;
        }
        LynxModuleWrapper LIZ = lynxModuleManager.LIZ(string);
        if (LIZ == null) {
            LIZ = LynxEnv.LJIIIZ().LJFF().LIZ(string);
        }
        if (LIZ == null) {
            return null;
        }
        if (str.equals("call") || str.equals("callSync") || (string2 != null && string2.length() != 0)) {
            z = true;
        } else {
            z = false;
        }
        for (MethodDescriptor methodDescriptor : LIZ.getMethodDescriptors()) {
            String name = methodDescriptor.getName();
            if (name != null && !name.isEmpty() && name.equals(str)) {
                try {
                    if (z) {
                        return LIZ(LIZ.getModule(), methodDescriptor.getMethod(), new Object[]{string2, map});
                    }
                    return LIZ(LIZ.getModule(), methodDescriptor.getMethod(), new Object[]{map});
                } catch (Exception e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Lepus Module invokeSync: ");
                    LIZ2.append(e.toString());
                    LLog.LIZLLL(4, "LynxLepusModule", X1D.LIZIZ(LIZ2));
                }
            }
        }
        return null;
    }

    public static void LIZJ(String str, Object obj, F57 f57, LynxModuleManager lynxModuleManager) {
        boolean z;
        if (!(obj instanceof ReadableMap)) {
            return;
        }
        ReadableMap readableMap = (ReadableMap) obj;
        ReadableMap map = readableMap.getMap("methodDetail", new JavaOnlyMap());
        String string = map.getString("module", null);
        String string2 = map.getString("method", null);
        boolean z2 = readableMap.getBoolean("fromPiper", false);
        String string3 = readableMap.getString("tasmEntryName", null);
        int i = readableMap.getInt("callbackId", -1);
        if (string == null) {
            return;
        }
        LynxModuleWrapper LIZ = lynxModuleManager.LIZ(string);
        if (LIZ == null) {
            LIZ = LynxEnv.LJIIIZ().LJFF().LIZ(string);
        }
        if (LIZ == null) {
            return;
        }
        char c = 1;
        if (str.equals("call") || (string2 != null && string2.length() != 0)) {
            z = true;
        } else {
            z = false;
        }
        for (MethodDescriptor methodDescriptor : LIZ.getMethodDescriptors()) {
            String name = methodDescriptor.getName();
            if (name != null && !name.isEmpty() && name.equals(str)) {
                if (z) {
                    try {
                        Method method = methodDescriptor.getMethod();
                        LynxModule module = LIZ.getModule();
                        Object[] objArr = new Object[3];
                        objArr[0] = string2;
                        objArr[c] = map;
                        objArr[2] = new F55(z2, f57, i, string3);
                        LIZ(module, method, objArr);
                    } catch (Exception e) {
                        e = e;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Lepus Module invokeAsync: ");
                        LIZ2.append(e.toString());
                        LLog.LIZLLL(4, "LynxLepusModule", X1D.LIZIZ(LIZ2));
                        c = 1;
                    }
                } else if (z2) {
                    ReadableArray array = map.getArray("param", new JavaOnlyArray());
                    LIZ(LIZ.getModule(), methodDescriptor.getMethod(), array.asArrayList().toArray());
                } else {
                    Method method2 = methodDescriptor.getMethod();
                    LynxModule module2 = LIZ.getModule();
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = map;
                    try {
                        objArr2[1] = new F56(f57, i, string3);
                        LIZ(module2, method2, objArr2);
                    } catch (Exception e2) {
                        e = e2;
                        StringBuilder LIZ22 = X1D.LIZ();
                        LIZ22.append("Lepus Module invokeAsync: ");
                        LIZ22.append(e.toString());
                        LLog.LIZLLL(4, "LynxLepusModule", X1D.LIZIZ(LIZ22));
                        c = 1;
                    }
                }
            }
            c = 1;
        }
    }
}
