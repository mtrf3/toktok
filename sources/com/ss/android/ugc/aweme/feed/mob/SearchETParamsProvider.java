package com.ss.android.ugc.aweme.feed.mob;

import X.C183017Gf;
import X.C50653JuL;
import X.C50654JuM;
import X.InterfaceC54035LIp;
import X.InterfaceC60152Xr;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchETParamsProvider implements ETParamsProvider<C183017Gf> {
    public static C183017Gf LIZ() {
        C50653JuL.LJLILLLLZI.getClass();
        Map LIZIZ = C50654JuM.LIZIZ();
        String str = (String) LIZIZ.get("search_keyword");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = (String) LIZIZ.get("search_id");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) LIZIZ.get("search_type");
        if (str4 != null) {
            str2 = str4;
        }
        return new C183017Gf(str, str3, str2);
    }

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        if (d2(C183017Gf.class)) {
            C50653JuL.LJLILLLLZI.getClass();
            if (!C50654JuM.LIZIZ().isEmpty()) {
                return LIZ();
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    public final /* bridge */ /* synthetic */ C183017Gf t() {
        return LIZ();
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    public final boolean d2(Class<? extends InterfaceC60152Xr> clazz) {
        o.LJIIIZ(clazz, "clazz");
        return o.LJ(clazz, C183017Gf.class);
    }
}
