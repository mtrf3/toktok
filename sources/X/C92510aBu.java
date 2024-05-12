package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aBu, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92510aBu extends AbstractC92346a9G {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        if (TextUtils.isEmpty(C91826a0s.LIZLLL)) {
            C31626Cb8.LIZ(c37356ElM, 0, "session id is empty", 4);
            return;
        }
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC92345a9F.class, null);
        ((InterfaceC92345a9F) LIZJ).setSessionId(C91826a0s.LIZLLL);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
