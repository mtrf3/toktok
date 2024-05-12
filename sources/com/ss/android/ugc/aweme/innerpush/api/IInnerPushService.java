package com.ss.android.ugc.aweme.innerpush.api;

import X.C51764KTg;
import X.EnumC86549Xxx;
import X.InterfaceC55341Lnl;
import X.InterfaceC86486Xww;
import X.InterfaceC86533Xxh;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public interface IInnerPushService {
    void LIZ(boolean z, boolean z2);

    void LIZIZ(String str);

    boolean LIZJ(C51764KTg c51764KTg);

    boolean LIZLLL(boolean z);

    InterfaceC55341Lnl LJ();

    boolean LJFF();

    void LJI(boolean z, boolean z2);

    void LJII(InterfaceC86533Xxh interfaceC86533Xxh);

    void LJIIIIZZ(InterfaceC86533Xxh interfaceC86533Xxh, int[] iArr);

    boolean LJIIIZ(JSONObject jSONObject);

    boolean LJIIJ(String str);

    void LJIIJJI(InterfaceC86486Xww interfaceC86486Xww);

    InterfaceC86486Xww LJIIL(int i);

    void LJIILIIL(EnumC86549Xxx enumC86549Xxx, InnerPushMessage innerPushMessage, String str);

    void init();
}
