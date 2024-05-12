package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6am, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163166am {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C163166am)) {
            return false;
        }
        C163166am c163166am = (C163166am) obj;
        return o.LJ(this.LIZ, c163166am.LIZ) && o.LJ(this.LIZIZ, c163166am.LIZIZ) && o.LJ(this.LIZJ, c163166am.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CanvasStyleConfig#");
        LIZ.append(hashCode());
        LIZ.append(",effectId:");
        LIZ.append(this.LIZ);
        LIZ.append(",path:");
        LIZ.append(this.LIZIZ);
        LIZ.append(",params:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public C163166am(String effectId, String animatePath, String str) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(animatePath, "animatePath");
        this.LIZ = effectId;
        this.LIZIZ = animatePath;
        this.LIZJ = str;
    }
}
