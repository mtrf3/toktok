package com.ss.android.ugc.aweme.ecommerce.search.sug.repo;

import X.C221108m2;
import X.C35361DuH;
import X.C35981EAf;
import X.C36033ECf;
import X.C51259K9v;
import X.C62822Ol8;
import X.C76L;
import X.E4T;
import X.EO0;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;

/* loaded from: classes9.dex */
public final class EcSearchSugApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(EO0.LJLIL);

    /* loaded from: classes9.dex */
    public interface Api {
        @InterfaceC195787mI
        @E4T("/aweme/v1/search/sug/")
        C76L<EcSearchSugResponse> fetchSug(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("source") String str2, @InterfaceC64987Pex("history_list") String str3, @InterfaceC64987Pex("from_group_id") String str4, @InterfaceC64987Pex("count") Integer num, @InterfaceC64987Pex("sug_signal") String str5, @InterfaceC64987Pex("rich_sug_count") Integer num2, @InterfaceC64987Pex("request_order") Long l, @InterfaceC64987Pex("enter_from") String str6, @InterfaceC64987Pex("sug_cost_degradation") int i, @InterfaceC64987Pex("new_sug_session_id") String str7, @InterfaceC64987Pex("src_material_id") String str8, @InterfaceC64987Pex("src_anchor_product_id") String str9, @InterfaceC64987Pex("search_position") String str10, @InterfaceC64987Pex("ecom_user_actions") String str11);
    }

    public static final C76L<EcSearchSugResponse> LIZ(C51259K9v c51259K9v) {
        return ((Api) LIZ.getValue()).fetchSug(c51259K9v.LIZ, c51259K9v.LIZIZ, c51259K9v.LIZLLL, c51259K9v.LIZJ, c51259K9v.LJ, c51259K9v.LJFF, c51259K9v.LJI, c51259K9v.LJII, c51259K9v.LJIIIIZZ, c51259K9v.LJIIIZ, c51259K9v.LJIIJ, c51259K9v.LJIIJJI, c51259K9v.LJIIL, c51259K9v.LJIILIIL, C36033ECf.LIZIZ(Integer.valueOf(C35361DuH.LIZ()), C35981EAf.LIZ(c51259K9v.LJIILJJIL)));
    }
}
