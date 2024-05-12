package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NB9 extends NBA {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String musicId;
        Integer num;
        NBB nbb = (NBB) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String ccTemplateId = nbb.getCcTemplateId();
        if (ccTemplateId == null || (musicId = nbb.getMusicId()) == null) {
            return;
        }
        Number musicBeginTime = nbb.getMusicBeginTime();
        if (!(musicBeginTime instanceof Integer) || (num = (Integer) musicBeginTime) == null) {
            return;
        }
        int intValue = num.intValue();
        if (ccTemplateId.length() == 0 || musicId.length() == 0) {
            return;
        }
        C6WH.LIZ(intValue, ccTemplateId, musicId);
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(NBC.class, null), "");
    }
}
