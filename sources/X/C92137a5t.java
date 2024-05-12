package X;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.a5t, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92137a5t<D> extends AbstractC91689Zyf<D> {
    public final Class<D> LJIIJJI;

    @Override // X.AbstractC91689Zyf
    public final String LIZIZ() {
        return this.LJIIJJI.getName();
    }

    public final int hashCode() {
        return this.LJIIJJI.hashCode();
    }

    public C92137a5t(Class<D> cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.LJIIJJI = cls;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(cls);
        LIZ.append(" does not implement Parcelable or Serializable.");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    @Override // X.AbstractC91689Zyf
    public final D LIZJ(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C92137a5t.class, obj.getClass())) {
            return false;
        }
        return o.LJ(this.LJIIJJI, ((C92137a5t) obj).LJIIJJI);
    }

    @Override // X.AbstractC91689Zyf
    public final D LIZ(Bundle bundle, String str) {
        return (D) C16880lQ.LLJJIII(bundle, str);
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, D d) {
        o.LJIIIZ(key, "key");
        this.LJIIJJI.cast(d);
        if (d == null || (d instanceof Parcelable)) {
            bundle.putParcelable(key, (Parcelable) d);
        } else {
            if (!(d instanceof Serializable)) {
                return;
            }
            bundle.putSerializable(key, (Serializable) d);
        }
    }
}
