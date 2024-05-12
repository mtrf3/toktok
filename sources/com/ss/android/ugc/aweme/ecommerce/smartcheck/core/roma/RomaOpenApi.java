package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.C36071EDr;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC36228EJs;
import X.InterfaceC36348EOi;
import X.InterfaceC67352kd;
import java.util.Map;

/* loaded from: classes7.dex */
public interface RomaOpenApi {
    public static final C36071EDr LIZ = C36071EDr.LIZ;

    @E8M("api/open_api/get_page_list")
    Object getPageList(@InterfaceC195727mC Map<String, Object> map, @InterfaceC36348EOi("X-Roma-Token") String str, InterfaceC67352kd<? super RomaPageListResponse> interfaceC67352kd);

    @E8L("/api/open_api/get_pattern_list")
    Object getPatternList(@InterfaceC36228EJs Map<String, Object> map, @InterfaceC36348EOi("X-Roma-Token") String str, InterfaceC67352kd<? super RomaPatternListResponse> interfaceC67352kd);
}
