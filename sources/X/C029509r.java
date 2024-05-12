package X;

import android.database.Observable;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.09r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C029509r extends Observable<AbstractC029609s> {
    public final boolean LIZ() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void LIZIZ() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC029609s) ListProtector.get(((Observable) this).mObservers, size)).LIZJ();
        }
    }

    public final void LJI() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC029609s) ListProtector.get(((Observable) this).mObservers, size)).LJIIIIZZ();
        }
    }

    public final void LIZJ(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC029609s) ListProtector.get(((Observable) this).mObservers, size)).LJI(i, i2);
        }
    }

    public final void LJ(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC029609s) ListProtector.get(((Observable) this).mObservers, size)).LJFF(i, i2);
        }
    }

    public final void LJFF(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC029609s) ListProtector.get(((Observable) this).mObservers, size)).LJII(i, i2);
        }
    }

    public final void LIZLLL(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC029609s) ListProtector.get(((Observable) this).mObservers, size)).LJ(i, i2, obj);
        }
    }
}
