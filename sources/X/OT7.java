package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OT7 extends OT8 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        OT9 ot9 = (OT9) xBaseParamModel;
        o.LJIIIZ(type, "type");
        Activity LJI = C79043V0l.LJI(this);
        String str = null;
        XBaseModel LIZJ = ED5.LIZJ(OTA.class, null);
        OTA ota = (OTA) LIZJ;
        if (LJI != null) {
            str = C39241Faf.LIZIZ(C39241Faf.LIZ(LJI, ot9.getPackageName()));
        }
        ota.setSignature(str);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
