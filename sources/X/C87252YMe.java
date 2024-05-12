package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YMe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87252YMe extends AbstractC65781Prl implements InterfaceC88472Yns<YNF, C76800UCe> {
    public static final C87252YMe LJLIL = new C87252YMe();

    public C87252YMe() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(YNF ynf) {
        YNF filterConfig = ynf;
        o.LJIIIZ(filterConfig, "$this$filterConfig");
        List<String> list = C87256YMi.LIZIZ;
        o.LJIIIZ(list, "<set-?>");
        filterConfig.LJLIL = list;
        return C76800UCe.LIZ;
    }
}
