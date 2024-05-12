package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3d5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88153d5 extends AbstractC65781Prl implements InterfaceC88472Yns<C87503c2, C76800UCe> {
    public static final C88153d5 LJLIL = new C88153d5();

    public C88153d5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C87503c2 c87503c2) {
        String str;
        String str2;
        C87503c2 it = c87503c2;
        o.LJIIIZ(it, "it");
        InterfaceC86893b3 interfaceC86893b3 = it.LJLILLLLZI;
        if (o.LJ(interfaceC86893b3, C86913b5.LIZ) || (interfaceC86893b3 instanceof C86863b0)) {
            str = "done";
        } else if (o.LJ(interfaceC86893b3, C86903b4.LIZ) || (interfaceC86893b3 instanceof C86873b1)) {
            str = "edit";
        } else {
            throw new C162476Zf();
        }
        List<C72412sn> list = it.getListState().LJLJJI;
        if (list != null) {
            str2 = Integer.valueOf(list.size()).toString();
        } else {
            str2 = null;
        }
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C111074Xn.LIZ(LIZ, "onEventV3", "enter_from", "store_sticker_set_page", "status", str);
        LIZ2.put("sticker_set_count", str2);
        LIZ.LIZIZ("edit_added_sticker_sets", LIZ2);
        return C76800UCe.LIZ;
    }
}
