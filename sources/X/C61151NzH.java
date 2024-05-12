package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NzH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61151NzH {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String uniqueId) {
        String k7;
        o.LJIIIZ(uniqueId, "uniqueId");
        AD1 LJ = C61146NzC.LIZIZ.LJ(uniqueId);
        if (LJ != null) {
            if (LJ.LJLIL) {
                if (LJ.LJLJI) {
                    k7 = C58126Mra.LIZIZ.k7(LJ.LJLILLLLZI);
                } else {
                    k7 = LJ.LJLILLLLZI;
                }
            } else {
                k7 = C58126Mra.LIZIZ.k7("aweme://roma_redirect/?roma_group_key=roma_schema_group_tiktok_lingo&roma_page_key=roma_schema_page_dictionary_panel");
            }
            if (k7 != null) {
                return k7;
            }
        }
        return C58126Mra.LIZIZ.k7("aweme://roma_redirect/?roma_group_key=roma_schema_group_tiktok_lingo&roma_page_key=roma_schema_page_dictionary_panel");
    }
}
