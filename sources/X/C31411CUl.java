package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CUl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31411CUl implements InterfaceC31409CUj {
    public final List<Class<?>> LIZ = new ArrayList();
    public final List<AbstractC31414CUo<?, ?>> LIZIZ = new ArrayList();
    public final List<InterfaceC31400CUa<?>> LIZJ = new ArrayList();

    public final int LIZ(Class<?> cls) {
        int indexOf = ((ArrayList) this.LIZ).indexOf(cls);
        if (indexOf != -1) {
            return indexOf;
        }
        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
            if (((Class) ListProtector.get(this.LIZ, i)).isAssignableFrom(cls)) {
                return i;
            }
        }
        return -1;
    }

    public final AbstractC31414CUo<?, ?> LIZIZ(int i) {
        return (AbstractC31414CUo) ListProtector.get(this.LIZIZ, i);
    }

    public final boolean LIZJ(Class<?> cls) {
        boolean z = false;
        while (true) {
            int indexOf = ((ArrayList) this.LIZ).indexOf(cls);
            if (indexOf != -1) {
                ListProtector.remove(this.LIZ, indexOf);
                ListProtector.remove(this.LIZIZ, indexOf);
                ListProtector.remove(this.LIZJ, indexOf);
                z = true;
            } else {
                return z;
            }
        }
    }
}
