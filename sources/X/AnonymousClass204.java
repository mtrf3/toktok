package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.204, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass204 extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends Integer>, C32541Pm> {
    public static final AnonymousClass204 LJLIL = new AnonymousClass204();

    public AnonymousClass204() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C32541Pm invoke(List<? extends Integer> list) {
        List<? extends Integer> it = list;
        o.LJIIIZ(it, "it");
        return new C32541Pm(((Number) ListProtector.get(it, 0)).intValue(), ((Number) ListProtector.get(it, 1)).intValue());
    }
}
