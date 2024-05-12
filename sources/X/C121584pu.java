package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4pu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121584pu {
    public String LIZ;
    public float LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public float LJ;
    public float LJFF;
    public String LJI;
    public final EnumC121554pr LJII;

    public final int hashCode() {
        int i;
        int hashCode = this.LJII.hashCode() * 31;
        String str = this.LIZ;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (Boolean.valueOf(this.LIZJ).hashCode() + ((Float.valueOf(this.LIZIZ).hashCode() + ((hashCode + i) * 31)) * 31)) * 31;
        String str2 = this.LIZLLL;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Float.valueOf(this.LJFF).hashCode() + ((Float.valueOf(this.LJ).hashCode() + ((hashCode2 + i2) * 31)) * 31);
    }

    public C121584pu(EnumC121554pr type) {
        o.LJIIIZ(type, "type");
        this.LJII = type;
        this.LIZIZ = 1.0f;
        this.LJ = 1.0f;
        this.LJFF = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121584pu)) {
            return false;
        }
        C121584pu c121584pu = (C121584pu) obj;
        if (this.LJII == c121584pu.LJII && !(!o.LJ(this.LIZ, c121584pu.LIZ)) && this.LIZIZ == c121584pu.LIZIZ && this.LIZJ == c121584pu.LIZJ && !(!o.LJ(this.LIZLLL, c121584pu.LIZLLL)) && this.LJ == c121584pu.LJ && this.LJFF == c121584pu.LJFF) {
            return true;
        }
        return false;
    }
}
