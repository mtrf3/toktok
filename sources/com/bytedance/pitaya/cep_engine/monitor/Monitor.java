package com.bytedance.pitaya.cep_engine.monitor;

import com.bytedance.pitaya.cep_engine.helper.DictProxyHelper;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Monitor implements CepKeeper {
    public static final Monitor INSTANCE = new Monitor();

    public final void appLogEvent(String eventName, DictProxyHelper eventParams) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(eventParams, "eventParams");
        AppLogNewUtils.onEventV3(eventName, eventParams.getData());
    }
}
