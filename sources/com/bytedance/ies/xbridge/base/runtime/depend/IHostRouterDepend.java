package com.bytedance.ies.xbridge.base.runtime.depend;

import X.AbstractC39461FeD;
import X.C31926Cfy;
import X.EnumC37847EtH;
import android.content.Context;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IHostRouterDepend {
    boolean closeView(C31926Cfy c31926Cfy, EnumC37847EtH enumC37847EtH, String str, boolean z);

    boolean openSchema(C31926Cfy c31926Cfy, String str, Map<String, ? extends Object> map, EnumC37847EtH enumC37847EtH, Context context);

    AbstractC39461FeD provideRouteOpenExceptionHandler(C31926Cfy c31926Cfy);

    List<AbstractC39461FeD> provideRouteOpenHandlerList(C31926Cfy c31926Cfy);
}
