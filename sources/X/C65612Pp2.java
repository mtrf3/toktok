package X;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Pp2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65612Pp2 {
    public static <T> C65623PpD<T> LIZ(Class<T> cls, String str) {
        try {
            return new C65623PpD<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static <K, V> void LIZIZ(InterfaceC65633PpN<K, V> interfaceC65633PpN, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(interfaceC65633PpN.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : interfaceC65633PpN.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
