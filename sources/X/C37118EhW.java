package X;

import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.EhW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37118EhW implements InterfaceC37239EjT {
    @Override // X.InterfaceC37239EjT
    public final boolean LIZIZ(ClassLoader classLoader, String str, boolean z, boolean z2) {
        File[] fileArr;
        synchronized (C37118EhW.class) {
            try {
                Object obj = EZG.LIZ(BaseDexClassLoader.class, "pathList").get(classLoader);
                Field LIZ = EZG.LIZ(obj.getClass(), "nativeLibraryDirectories");
                Object obj2 = LIZ.get(obj);
                if (obj2 == null) {
                    fileArr = new File[0];
                } else {
                    fileArr = (File[]) obj2;
                }
                if (str == null) {
                    str = "";
                }
                String[] split = str.split(":");
                ArrayList arrayList = new ArrayList(split.length);
                List asList = Arrays.asList(fileArr);
                for (String str2 : split) {
                    File file = new File(str2);
                    if ((file.exists() || file.mkdirs()) && !asList.contains(file)) {
                        arrayList.add(file);
                    }
                }
                ArrayList arrayList2 = new ArrayList(fileArr.length + arrayList.size());
                if (z) {
                    arrayList2.addAll(arrayList);
                    Collections.addAll(arrayList2, fileArr);
                } else {
                    Collections.addAll(arrayList2, fileArr);
                    arrayList2.addAll(arrayList);
                }
                LIZ.set(obj, arrayList2.toArray(new File[0]));
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }
}
