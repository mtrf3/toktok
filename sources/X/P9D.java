package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes12.dex */
public abstract class P9D {
    public static final Logger LIZ = Logger.getLogger(AbstractC87153YIj.class.getName());
    public static final String LIZIZ = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public abstract C68313QrV LIZ();

    public static C68313QrV LIZIZ(Class cls) {
        String LLLZ;
        ClassLoader classLoader = P9D.class.getClassLoader();
        if (cls.equals(C68313QrV.class)) {
            LLLZ = LIZIZ;
        } else if (cls.getPackage().equals(P9D.class.getPackage())) {
            LLLZ = C16880lQ.LLLZ("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), C16880lQ.LJLLJ(cls)});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return (C68313QrV) cls.cast(((P9D) Class.forName(LLLZ, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).LIZ());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(P9D.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((P9D) it.next()).LIZ()));
                } catch (ServiceConfigurationError e5) {
                    LIZ.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C16880lQ.LJLLJ(cls)), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (C68313QrV) ListProtector.get(arrayList, 0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C68313QrV) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
