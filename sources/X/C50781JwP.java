package X;

import java.util.function.Predicate;
import kotlin.jvm.internal.o;

/* renamed from: X.JwP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50781JwP implements Predicate {
    public final /* synthetic */ InterfaceC88472Yns LIZ;

    public C50781JwP(InterfaceC88472Yns function) {
        o.LJIIIZ(function, "function");
        this.LIZ = function;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return ((Boolean) this.LIZ.invoke(obj)).booleanValue();
    }
}
