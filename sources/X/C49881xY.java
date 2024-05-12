package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1xY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49881xY extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C22140tu> {
    public static final C49881xY LJLIL = new C49881xY();

    public C49881xY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C22140tu invoke(Object it) {
        o.LJIIIZ(it, "it");
        List list = (List) it;
        return new C22140tu(((Number) ListProtector.get(list, 0)).floatValue(), ((Number) ListProtector.get(list, 1)).floatValue());
    }
}
