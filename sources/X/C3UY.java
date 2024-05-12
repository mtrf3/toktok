package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3UY, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3UY {
    public final java.util.Map<String, Object> LIZ;
    public final java.util.Map<String, Object> LIZIZ;
    public final java.util.Map<String, Object> LIZJ;

    public C3UY(java.util.Map<String, ? extends Object> categories, java.util.Map<String, ? extends Object> metrics, java.util.Map<String, ? extends Object> extras) {
        o.LJIIIZ(categories, "categories");
        o.LJIIIZ(metrics, "metrics");
        o.LJIIIZ(extras, "extras");
        this.LIZ = categories;
        this.LIZIZ = metrics;
        this.LIZJ = extras;
    }

    public /* synthetic */ C3UY(java.util.Map map, java.util.Map map2, java.util.Map map3, int i) {
        this((i & 1) != 0 ? C113554cx.LJJJLIIL() : map, (i & 2) != 0 ? C113554cx.LJJJLIIL() : map2, (i & 4) != 0 ? C113554cx.LJJJLIIL() : map3);
    }
}
