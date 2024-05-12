package X;

import X.AbstractC24300xO;
import com.bytedance.apm.core.ActivityLifeObserver;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1aB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35391aB<T extends AbstractC24300xO> implements InterfaceC23150vX {
    public final String LIZ;
    public long LIZIZ;
    public final ConcurrentHashMap<Integer, T> LIZLLL = new ConcurrentHashMap<>();
    public boolean LIZJ = ActivityLifeObserver.getInstance().isForeground();

    public abstract void LJFF(T t, long j, long j2);

    @Override // X.InterfaceC23150vX
    public final void LIZLLL() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LIZLLL.size() != 0) {
            long j = this.LIZIZ;
            if (currentTimeMillis - j >= 600000) {
                LJII(j, currentTimeMillis);
            }
        }
        this.LIZIZ = currentTimeMillis;
    }

    public AbstractC35391aB(String str) {
        this.LIZ = str;
    }

    public void LJII(long j, long j2) {
        Iterator<Map.Entry<Integer, T>> it = this.LIZLLL.entrySet().iterator();
        while (it.hasNext()) {
            T value = it.next().getValue();
            long j3 = value.LIZIZ;
            if (0 < j3 && j3 < value.LIZ) {
                it.remove();
            } else if (0 < j3 && j3 < j) {
                it.remove();
            } else if (j2 >= value.LIZ) {
                LJFF(value, j, j2);
            }
        }
    }
}
