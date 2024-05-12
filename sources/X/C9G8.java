package X;

import Y.AfS53S0200000_4;
import Y.AfS56S0100000_4;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.api.FilterKeywordsApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9G8, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9G8 {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C9GA.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C9G9.LJLIL);

    public final FilterKeywordsApi.API LIZIZ() {
        return (FilterKeywordsApi.API) this.LIZ.getValue();
    }

    public final void LIZ(List<String> list, List<Integer> list2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        FilterKeywordsApi.API LIZIZ = LIZIZ();
        String json = GsonProtectorUtils.toJson((Gson) this.LIZIZ.getValue(), list);
        o.LJIIIIZZ(json, "gson.toJson(list)");
        String json2 = GsonProtectorUtils.toJson((Gson) this.LIZIZ.getValue(), list2);
        o.LJIIIIZZ(json2, "gson.toJson(scenes)");
        LIZIZ.createKeywords(json, json2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0200000_4(interfaceC65784Pro, interfaceC88472Yns, 18), new AfS56S0100000_4(interfaceC88472Yns, 82));
    }
}
