package com.bytedance.apm.agent.instrumentation;

import X.C03880Dg;
import X.C39519Ff9;
import X.C64600PWy;
import X.C64601PWz;
import X.C65300Pk0;
import com.bytedance.apm.agent.instrumentation.interceptor.AddHeaderInterceptor;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpEventFactory;

/* loaded from: classes.dex */
public class OkHttp3Instrumentation {
    public static C64600PWy com_bytedance_apm_agent_instrumentation_OkHttp3Instrumentation_okhttp3_OkHttpClient$Builder_build(C64601PWz c64601PWz) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-1248311103458240275"));
        return LIZJ.LIZ ? (C64600PWy) LIZJ.LIZIZ : c64601PWz.build();
    }

    public static C64600PWy init() {
        C64601PWz c64601PWz = new C64601PWz();
        c64601PWz.addInterceptor(new AddHeaderInterceptor());
        c64601PWz.eventListenerFactory(new OkHttpEventFactory(null));
        return com_bytedance_apm_agent_instrumentation_OkHttp3Instrumentation_okhttp3_OkHttpClient$Builder_build(c64601PWz);
    }

    public static C64600PWy build(C64601PWz c64601PWz) {
        C64600PWy com_bytedance_apm_agent_instrumentation_OkHttp3Instrumentation_okhttp3_OkHttpClient$Builder_build = com_bytedance_apm_agent_instrumentation_OkHttp3Instrumentation_okhttp3_OkHttpClient$Builder_build(c64601PWz);
        c64601PWz.addInterceptor(new AddHeaderInterceptor());
        c64601PWz.eventListenerFactory(new OkHttpEventFactory(com_bytedance_apm_agent_instrumentation_OkHttp3Instrumentation_okhttp3_OkHttpClient$Builder_build.LJLJL));
        return com_bytedance_apm_agent_instrumentation_OkHttp3Instrumentation_okhttp3_OkHttpClient$Builder_build(c64601PWz);
    }
}
