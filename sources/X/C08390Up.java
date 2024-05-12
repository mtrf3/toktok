package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.0Up, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08390Up<T> {
    public final T LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08390Up)) {
            return false;
        }
        C08390Up c08390Up = (C08390Up) obj;
        return o.LJ(this.LIZ, c08390Up.LIZ) && this.LIZIZ == c08390Up.LIZIZ && this.LIZJ == c08390Up.LIZJ && o.LJ(this.LIZLLL, c08390Up.LIZLLL);
    }

    public final int hashCode() {
        T t = this.LIZ;
        return this.LIZLLL.hashCode() + ((((((t == null ? 0 : t.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MutableRange(item=");
        LIZ.append(this.LIZ);
        LIZ.append(", start=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", end=");
        LIZ.append(this.LIZJ);
        LIZ.append(", tag=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public final C08410Ur<T> LIZ(int i) {
        int i2 = this.LIZJ;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i != Integer.MIN_VALUE) {
            return new C08410Ur<>(this.LIZ, this.LIZIZ, i, this.LIZLLL);
        }
        "Item.end should be set first".toString();
        throw new IllegalStateException("Item.end should be set first");
    }

    public C08390Up(T t, int i, int i2, String tag) {
        o.LJIIIZ(tag, "tag");
        this.LIZ = t;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = tag;
    }

    public /* synthetic */ C08390Up(Object obj, int i, int i2, String str, int i3) {
        this(obj, i, (i3 & 4) != 0 ? LiveLayoutPreloadThreadPriority.DEFAULT : i2, (i3 & 8) != 0 ? "" : str);
    }
}
