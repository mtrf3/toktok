package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07470Rb {
    public final String LIZ;
    public int LIZIZ;

    public C07470Rb() {
        this(0);
    }

    public final int hashCode() {
        if (this.LIZIZ == 0) {
            this.LIZIZ = this.LIZ.hashCode();
        }
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectCacheKey(resource_id='");
        return JBR.LJFF(LIZ, this.LIZ, "')", LIZ);
    }

    public C07470Rb(String resource_id) {
        o.LJIIIZ(resource_id, "resource_id");
        this.LIZ = resource_id;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C07470Rb.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.live.effect.EffectCacheKey");
        if (o.LJ(this.LIZ, ((C07470Rb) obj).LIZ)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C07470Rb(int i) {
        this("");
    }
}
