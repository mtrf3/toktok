package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.20T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20T extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends Integer>, C1QP> {
    public static final C20T LJLIL = new C20T();

    public C20T() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C1QP invoke(List<? extends Integer> list) {
        List<? extends Integer> it = list;
        o.LJIIIZ(it, "it");
        return new C1QP(((Number) ListProtector.get(it, 0)).intValue(), ((Number) ListProtector.get(it, 1)).intValue());
    }
}
