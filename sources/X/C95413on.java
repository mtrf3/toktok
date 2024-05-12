package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3on, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95413on {
    public final List<C95493ov> LIZ = new ArrayList();

    public static void LIZ(C95413on c95413on, EnumC95523oy type, InterfaceC88472Yns onCheckedChangeListener, InterfaceC65784Pro onClickListener, int i) {
        if ((i & 2) != 0) {
            onCheckedChangeListener = C95453or.LJLIL;
        }
        if ((i & 4) != 0) {
            onClickListener = C95473ot.LJLIL;
        }
        c95413on.getClass();
        o.LJIIIZ(type, "type");
        o.LJIIIZ(onCheckedChangeListener, "onCheckedChangeListener");
        o.LJIIIZ(onClickListener, "onClickListener");
        ((ArrayList) c95413on.LIZ).add(new C95493ov(type, onCheckedChangeListener, onClickListener));
    }
}
