package X;

import kotlin.jvm.internal.o;

/* renamed from: X.33c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C776833c extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public static final C776833c LJLIL = new C776833c();

    public C776833c() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "dm_search_page");
        c1hq.put("clear_cnt", String.valueOf(intValue));
        onEventV3.LIZIZ("dm_search_clear_all_history", c1hq);
        return C76800UCe.LIZ;
    }
}
