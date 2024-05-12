package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O9Q extends O9R {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        boolean z;
        O9S o9s = (O9S) xBaseParamModel;
        o.LJIIJ(type, "type");
        String cacheKey = o9s.getCacheKey();
        if (cacheKey == null || ujb.o.LJJJJJL(cacheKey)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
            String biz = o9s.getBiz();
            c60827Nu3.getClass();
            C60827Nu3.LJIIL(biz);
        } else {
            C60827Nu3 c60827Nu32 = C58310MuY.LIZIZ;
            String cacheKey2 = o9s.getCacheKey();
            if (cacheKey2 != null) {
                String biz2 = o9s.getBiz();
                c60827Nu32.getClass();
                C60827Nu3.LIZ(cacheKey2, biz2);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(O9T.class, null), "");
    }
}
