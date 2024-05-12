package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JvT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50723JvT {
    public static final boolean LIZ;

    static {
        FFL.LJIIIZ().getClass();
        boolean z = false;
        if (FFL.LJIIJ(31744, 0, "show_suggest_search_words", true) != 0) {
            z = true;
        }
        LIZ = z;
    }

    public static final int LIZ(InterfaceC65784Pro<Boolean> isFromEcommerce, InterfaceC65784Pro<Boolean> enableEcSuggestReqCountryBasedSwitch) {
        o.LJIIIZ(isFromEcommerce, "isFromEcommerce");
        o.LJIIIZ(enableEcSuggestReqCountryBasedSwitch, "enableEcSuggestReqCountryBasedSwitch");
        if (isFromEcommerce.invoke().booleanValue()) {
            return enableEcSuggestReqCountryBasedSwitch.invoke().booleanValue() ? 1 : 0;
        }
        if (LIZ) {
            return 1;
        }
        return 0;
    }
}
