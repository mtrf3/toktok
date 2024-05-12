package X;

import java.lang.Enum;
import kotlin.jvm.internal.o;

/* renamed from: X.a96, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92336a96<D extends Enum<?>> extends C92139a5v<D> {
    public final Class<D> LJIIL;

    @Override // X.C92139a5v, X.AbstractC91689Zyf
    public final String LIZIZ() {
        return this.LJIIL.getName();
    }

    public C92336a96(Class<D> cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.LJIIL = cls;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(cls);
        LIZ.append(" is not an Enum type.");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    @Override // X.C92139a5v
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final D LIZJ(String str) {
        D d;
        D[] enumConstants = this.LJIIL.getEnumConstants();
        o.LJIIIIZZ(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i < length) {
                d = enumConstants[i];
                i++;
                if (ujb.o.LJJJJIZL(d.name(), str, true)) {
                    break;
                }
            } else {
                d = null;
                break;
            }
        }
        D d2 = d;
        if (d2 != null) {
            return d2;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Enum value ");
        LIZ.append(str);
        LIZ.append(" not found for type ");
        LIZ.append((Object) this.LJIIL.getName());
        LIZ.append('.');
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }
}
