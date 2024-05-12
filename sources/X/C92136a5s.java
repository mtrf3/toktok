package X;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* renamed from: X.a5s, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92136a5s<D extends Parcelable> extends AbstractC91689Zyf<D[]> {
    public final Class<D[]> LJIIJJI;

    @Override // X.AbstractC91689Zyf
    public final String LIZIZ() {
        return this.LJIIJJI.getName();
    }

    public final int hashCode() {
        return this.LJIIJJI.hashCode();
    }

    public C92136a5s(Class<D> cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[L");
                LIZ.append((Object) cls.getName());
                LIZ.append(';');
                this.LJIIJJI = (Class<D[]>) Class.forName(X1D.LIZIZ(LIZ));
                return;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(cls);
        LIZ2.append(" does not implement Parcelable.");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    @Override // X.AbstractC91689Zyf
    public final Object LIZJ(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C92136a5s.class, obj.getClass())) {
            return false;
        }
        return o.LJ(this.LJIIJJI, ((C92136a5s) obj).LJIIJJI);
    }

    @Override // X.AbstractC91689Zyf
    public final Object LIZ(Bundle bundle, String str) {
        return C16880lQ.LLJJIII(bundle, str);
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        o.LJIIIZ(key, "key");
        this.LJIIJJI.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }
}
