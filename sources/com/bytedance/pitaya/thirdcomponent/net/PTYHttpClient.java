package com.bytedance.pitaya.thirdcomponent.net;

import X.C93297aOb;
import X.EnumC93298aOc;
import X.InterfaceC93314aOs;
import com.bytedance.pitaya.api.PTYSettingsCallback;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes30.dex */
public interface PTYHttpClient extends ReflectionCall {
    public static final C93297aOb Companion = C93297aOb.LIZ;

    void get(String str, InterfaceC93314aOs interfaceC93314aOs, EnumC93298aOc enumC93298aOc);

    void inject(String str, PTYSettingsCallback pTYSettingsCallback);

    void post(String str, byte[] bArr, InterfaceC93314aOs interfaceC93314aOs, EnumC93298aOc enumC93298aOc);
}
