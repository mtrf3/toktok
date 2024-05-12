package com.ss.android.ugc.aweme.websocket.api.service;

import X.EnumC66933QOr;
import X.InterfaceC67145QWv;
import X.InterfaceC67148QWy;
import android.app.Application;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.Map;

/* loaded from: classes12.dex */
public interface IWsService {
    void LIZ(String str);

    void LIZIZ();

    void LIZJ(int i, int i2, InterfaceC67148QWy interfaceC67148QWy);

    void LIZLLL(WsChannelMsg wsChannelMsg);

    void LJ(byte[] bArr, Map map);

    void LJFF(Application application);

    String LJI();

    void LJII(String str);

    void LJIIIIZZ(InterfaceC67145QWv interfaceC67145QWv);

    void LJIIIZ(String str);

    void LJIIJ();

    void LJIIJJI(InterfaceC67148QWy interfaceC67148QWy);

    EnumC66933QOr getState();

    boolean isConnected();
}
