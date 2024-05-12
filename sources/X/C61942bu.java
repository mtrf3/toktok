package X;

import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.2bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61942bu extends AbstractC65781Prl implements InterfaceC88472Yns<String, EnumC62182cI> {
    public static final C61942bu LJLIL = new C61942bu();

    public C61942bu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final EnumC62182cI invoke(String it) {
        Object LIZ;
        o.LJIIIZ(it, "it");
        if (a.LJIIIZ().LIZJ()) {
            return EnumC62182cI.NONE;
        }
        int i = 0;
        try {
            FFL.LJIIIZ().getClass();
            LIZ = Integer.valueOf(FFL.LJIIJ(31744, 0, "multi_anchor_search_entrance_type", true));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Integer num = (Integer) LIZ;
        if (num != null) {
            i = num.intValue();
        }
        if (i == 1) {
            return EnumC62182cI.WORD;
        }
        if (i == 2) {
            return EnumC62182cI.BLANK;
        }
        return EnumC62182cI.NONE;
    }
}
