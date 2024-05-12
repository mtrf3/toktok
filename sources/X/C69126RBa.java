package X;

import java.util.function.Predicate;
import kotlin.jvm.internal.AqS177S0100000_11;

/* renamed from: X.RBa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69126RBa implements Predicate {
    public final /* synthetic */ InterfaceC88472Yns LIZ;

    public C69126RBa(AqS177S0100000_11 aqS177S0100000_11) {
        this.LIZ = aqS177S0100000_11;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return ((Boolean) this.LIZ.invoke(obj)).booleanValue();
    }
}
