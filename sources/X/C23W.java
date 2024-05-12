package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.23W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C23W extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends Object>, C18690oL> {
    public static final C23W LJLIL = new C23W();

    public C23W() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C18690oL invoke(List<? extends Object> list) {
        C0UT c0ut;
        List<? extends Object> restored = list;
        o.LJIIIZ(restored, "restored");
        Object obj = ListProtector.get(restored, 1);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) obj).booleanValue()) {
            c0ut = C0UT.Vertical;
        } else {
            c0ut = C0UT.Horizontal;
        }
        Object obj2 = ListProtector.get(restored, 0);
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new C18690oL(c0ut, ((Float) obj2).floatValue());
    }
}
