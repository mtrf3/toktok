package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NIj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59125NIj {
    public final int LIZ;
    public final EnumC59152NJk LIZIZ;
    public final List<String> LIZJ;
    public final Long LIZLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59125NIj(int i, EnumC59152NJk strategy, List<String> list) {
        this(i, strategy, list, null);
        o.LJIIJ(strategy, "strategy");
    }

    public C59125NIj(int i, EnumC59152NJk strategy, List accessKeys, Long l) {
        o.LJIIJ(strategy, "strategy");
        o.LJIIJ(accessKeys, "accessKeys");
        this.LIZ = i;
        this.LIZIZ = strategy;
        this.LIZJ = accessKeys;
        this.LIZLLL = l;
    }
}
