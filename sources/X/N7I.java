package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.OpenBAPolicyWebViewEvent;
import java.net.URLDecoder;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N7I extends N7F {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        N7H n7h = (N7H) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String schema = n7h.getSchema();
        String title = n7h.getTitle();
        if (schema.length() > 0) {
            String url = URLDecoder.decode(schema, "UTF-8");
            o.LJIIIIZZ(url, "url");
            C2U8.LIZ(new OpenBAPolicyWebViewEvent(url, title));
            XBaseModel LIZJ = ED5.LIZJ(N7J.class, null);
            ((N7J) LIZJ).setCode(1);
            c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "Any parameter is empty!", 4);
    }
}
