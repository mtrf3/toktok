package X;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import ujb.s;

/* renamed from: X.Ed8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36846Ed8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public static List LIZ() {
        MainDispatcherFactory mainDispatcherFactory;
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            ?? classLoader = MainDispatcherFactory.class.getClassLoader();
            try {
                classLoader = LIZIZ(MainDispatcherFactory.class, classLoader);
                return classLoader;
            } catch (Throwable unused4) {
                return ORZ.LLJI(ServiceLoader.load(MainDispatcherFactory.class, classLoader));
            }
        }
    }

    public static List LIZJ(BufferedReader bufferedReader) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return ORZ.LLJI(linkedHashSet);
            }
            String charSequence = s.LJZI(s.LJLLL(readLine, "#", readLine)).toString();
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                    String LJIILLIIL = o.LJIILLIIL(charSequence, "Illegal service provider class name: ");
                    LJIILLIIL.toString();
                    throw new IllegalArgumentException(LJIILLIIL);
                }
            }
            if (charSequence.length() > 0) {
                linkedHashSet.add(charSequence);
            }
        }
    }

    public static List LIZIZ(Class cls, ClassLoader classLoader) {
        BufferedReader bufferedReader;
        List LIZJ;
        ArrayList list = Collections.list(classLoader.getResources(o.LJIILLIIL(cls.getName(), "META-INF/services/")));
        o.LJIIIIZZ(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            java.net.URL url = (java.net.URL) it.next();
            String url2 = url.toString();
            if (ujb.o.LJJJLIIL(url2, "jar", false)) {
                String LJLLLL = s.LJLLLL(s.LJLLI(url2, "jar:file:", url2), '!');
                String LJLLI = s.LJLLI(url2, "!/", url2);
                JarFile jarFile = new JarFile(LJLLLL, false);
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(LJLLI)), "UTF-8"));
                    try {
                        LIZJ = LIZJ(bufferedReader);
                        AnonymousClass636.LJFF(bufferedReader, null);
                        jarFile.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            jarFile.close();
                            throw th2;
                        } catch (Throwable th3) {
                            V0N.LJFF(th, th3);
                            throw th;
                        }
                    }
                }
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                try {
                    LIZJ = LIZJ(bufferedReader);
                    AnonymousClass636.LJFF(bufferedReader, null);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } finally {
                    }
                }
            }
            ORS.LJJLIIIJILLIZJL(LIZJ, arrayList);
        }
        java.util.Set LLJJ = ORZ.LLJJ(arrayList);
        if (!LLJJ.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LLJJ, 10));
            Iterator it2 = LLJJ.iterator();
            while (it2.hasNext()) {
                Class<?> cls2 = Class.forName((String) it2.next(), false, classLoader);
                if (cls.isAssignableFrom(cls2)) {
                    arrayList2.add(cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Expected service of class ");
                    LIZ.append(cls);
                    LIZ.append(", but found ");
                    LIZ.append(cls2);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    LIZIZ.toString();
                    throw new IllegalArgumentException(LIZIZ);
                }
            }
            return arrayList2;
        }
        "No providers were loaded with FastServiceLoader".toString();
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader");
    }
}
