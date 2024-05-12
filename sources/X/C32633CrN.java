package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CrN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32633CrN {
    public final EnumC32608Cqy LIZ;
    public final EnumC32627CrH LIZIZ;
    public long LIZJ;
    public final Integer LIZLLL;
    public long LJ;

    public /* synthetic */ C32633CrN(EnumC32608Cqy enumC32608Cqy, EnumC32627CrH enumC32627CrH, long j) {
        this(enumC32608Cqy, enumC32627CrH, j, null);
    }

    public C32633CrN(EnumC32608Cqy reason, EnumC32627CrH from, long j, Integer num) {
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(from, "from");
        this.LIZ = reason;
        this.LIZIZ = from;
        this.LIZJ = j;
        this.LIZLLL = num;
    }
}
