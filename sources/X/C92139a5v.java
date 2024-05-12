package X;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.a5v, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class C92139a5v<D extends Serializable> extends AbstractC91689Zyf<D> {
    public final Class<D> LJIIJJI;

    @Override // X.AbstractC91689Zyf
    public String LIZIZ() {
        return this.LJIIJJI.getName();
    }

    public final int hashCode() {
        return this.LJIIJJI.hashCode();
    }

    public C92139a5v(Class<D> cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            if (true ^ cls.isEnum()) {
                this.LJIIJJI = cls;
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(cls);
            LIZ.append(" is an Enum. You should use EnumType instead.");
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(cls);
        LIZ2.append(" does not implement Serializable.");
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LIZIZ2.toString();
        throw new IllegalArgumentException(LIZIZ2);
    }

    @Override // X.AbstractC91689Zyf
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public D LIZJ(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92139a5v)) {
            return false;
        }
        return o.LJ(this.LJIIJJI, ((C92139a5v) obj).LJIIJJI);
    }

    public C92139a5v(Class cls, int i) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.LJIIJJI = cls;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(cls);
        LIZ.append(" does not implement Serializable.");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    @Override // X.AbstractC91689Zyf
    public final Object LIZ(Bundle bundle, String str) {
        return C16880lQ.LLJJIII(bundle, str);
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        this.LJIIJJI.cast(value);
        bundle.putSerializable(key, value);
    }
}
