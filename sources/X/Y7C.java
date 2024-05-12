package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y7C extends Y7D {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        Y7E y7e = (Y7E) xBaseParamModel;
        o.LJIIIZ(type, "type");
        Number defaultTime = y7e.getDefaultTime();
        String title = y7e.getTitle();
        Boolean isTwelveHourFormat = y7e.isTwelveHourFormat();
        Boolean isTimeIndicatorSuffix = y7e.isTimeIndicatorSuffix();
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        PoiServiceImpl.LIZIZ().LJJIII(context, defaultTime, title, isTwelveHourFormat, isTimeIndicatorSuffix, new AqS146S0200000_15((Y7F) ED5.LIZJ(Y7F.class, null), c37356ElM, 60), new AqS165S0100000_15(c37356ElM, 876));
    }
}
