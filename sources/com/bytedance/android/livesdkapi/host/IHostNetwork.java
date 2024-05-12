package com.bytedance.android.livesdkapi.host;

import X.C05130Ib;
import X.C65019PfT;
import X.C65126PhC;
import X.EnumC30220BtY;
import X.InterfaceC06390Mx;
import X.InterfaceC30221BtZ;
import X.InterfaceC31677Cbx;
import X.QOA;
import X.YM4;
import android.content.Context;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public interface IHostNetwork extends InterfaceC06390Mx {
    InterfaceC31677Cbx<C65126PhC> downloadFile(boolean z, int i, String str, List<C05130Ib> list, Object obj);

    String executeGet(String str);

    InterfaceC31677Cbx<C65126PhC> get(String str, List<C05130Ib> list, Object obj);

    Map<String, String> getCommonParams();

    C65019PfT getCustomHostRetrofit(String str);

    String getHostDomain();

    C65019PfT getHostRetrofit();

    String getHostWebSocketDomain();

    String getKYCHostDomain();

    C65019PfT getKYCRetrofit();

    C65019PfT getLiveRetrofit(boolean z);

    EnumC30220BtY getTTNetworkStatus();

    void minorModeInterceptMonitor(String str);

    void observerNetworkChange(InterfaceC30221BtZ interfaceC30221BtZ);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    InterfaceC31677Cbx<C65126PhC> post(String str, List<C05130Ib> list, String str2, byte[] bArr, Object obj);

    void registerHostWS();

    YM4 registerWsChannel(Context context, String str, Map<String, String> map, QOA qoa);

    void removeNetworkChangeObserver(InterfaceC30221BtZ interfaceC30221BtZ);

    InterfaceC31677Cbx<C65126PhC> uploadFile(int i, String str, List<C05130Ib> list, String str2, byte[] bArr, long j, String str3);
}
