package X;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;

/* renamed from: X.ElI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37352ElI extends ObjectInputStream {
    public final java.util.Set<String> LJLIL;

    @Override // java.io.ObjectInputStream
    public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        if (objectStreamClass == null || objectStreamClass.getName() == null) {
            return super.resolveClass(objectStreamClass);
        }
        String name = objectStreamClass.getName();
        if (((HashSet) this.LJLIL).contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        return Class.forName(name, true, ClassLoader.getSystemClassLoader().getParent());
    }

    public C37352ElI(InputStream inputStream, Class<?>... clsArr) {
        super(inputStream);
        this.LJLIL = new HashSet();
        for (Class<?> cls : clsArr) {
            ((HashSet) this.LJLIL).add(cls.getName());
        }
    }
}
