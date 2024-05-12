package X;

import dalvik.system.DexFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: X.EzW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38234EzW {
    public static Constructor<?> LIZ;

    public static DexFile LIZ(byte[] bArr) {
        if (LIZ == null) {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            declaredMethod.setAccessible(true);
            Constructor<?> constructor = (Constructor) declaredMethod.invoke(DexFile.class, new Class[]{ByteBuffer.class});
            if (constructor != null && !constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            LIZ = constructor;
        }
        return (DexFile) LIZ.newInstance(ByteBuffer.wrap(bArr));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:67|68|69|(2:71|72)|(7:74|(1:76)|79|80|81|4|(7:6|7|8|(3:10|(4:16|(2:17|(1:19)(1:20))|21|(2:23|24)(1:26))|25)|31|32|33)(4:46|47|48|(2:49|(1:51)(3:52|53|54))))|84|80|81|4|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x003e, code lost:
    
        if (java.util.Arrays.equals(X.C38235EzX.LIZIZ, r1) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<dalvik.system.DexFile> LIZIZ(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38234EzW.LIZIZ(java.lang.String):java.util.List");
    }
}
