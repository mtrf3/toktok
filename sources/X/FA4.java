package X;

import android.os.Build;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public class FA4 extends LinkedList {
    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        return true;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    public final Object poll() {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                FA3.LIZIZ = (LinkedList) FA3.LIZLLL.get(null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final boolean remove(Object obj) {
        return true;
    }
}
