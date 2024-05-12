package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215938dh {
    public final EnumC216188e6 LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final float LIZLLL;

    public C215938dh() {
        this(null, false, 0L, 0.0f, 31);
    }

    public C215938dh(EnumC216188e6 type, boolean z, long j, float f, int i) {
        type = (i & 1) != 0 ? EnumC216188e6.NONE : type;
        z = (i & 4) != 0 ? false : z;
        j = (i & 8) != 0 ? 0L : j;
        f = (i & 16) != 0 ? 1.0f : f;
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = f;
    }
}
