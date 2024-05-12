package com.bytedance.android.livesdk.comp.api.network;

import X.AbstractC65022PfW;
import X.AbstractC65069PgH;
import X.C05130Ib;
import X.C65019PfT;
import X.C65047Pfv;
import X.C65126PhC;
import X.InterfaceC06390Mx;
import X.InterfaceC31105CIr;
import X.InterfaceC31677Cbx;
import X.InterfaceC64604PXc;
import X.InterfaceC65014PfO;
import X.P8O;
import X.QOA;
import X.YM4;
import android.content.Context;
import com.bytedance.android.live.network.ResponseInterceptorV2;
import com.bytedance.android.live.network.interceptors.NtpTimeInterceptor;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public interface INetworkService extends InterfaceC06390Mx {
    <T> T Du0(Class<T> cls);

    void Gj(C65047Pfv c65047Pfv);

    <T> InterfaceC31105CIr<T> Kq0(Class<T> cls);

    List<AbstractC65022PfW> Lh();

    <T> T Mk(Class<T> cls);

    void Op(Map<Class<?>, ? extends InterfaceC31105CIr<?>> map);

    void Qi(P8O p8o);

    void SP(C65047Pfv c65047Pfv);

    void Sa(Map<Class<?>, ? extends InterfaceC64604PXc<?>> map);

    Object Yk(Class cls);

    InterfaceC31677Cbx<C65126PhC> downloadFile(boolean z, int i, String str, List<? extends C05130Ib> list, Object obj);

    boolean fI(InterfaceC65014PfO<?, ?> interfaceC65014PfO);

    void fl(Map<String, String> map);

    C65019PfT gF();

    InterfaceC31677Cbx<C65126PhC> get(String str, List<? extends C05130Ib> list);

    InterfaceC31677Cbx<C65126PhC> get(String str, List<? extends C05130Ib> list, Object obj);

    Map<String, String> getCommonParams();

    String getHostDomain();

    <T> T getService(Class<T> cls);

    Map<String, String> hd0(String str);

    InterfaceC31677Cbx<C65126PhC> mL(String str, List<? extends C05130Ib> list, String str2, byte[] bArr);

    NtpTimeInterceptor mn0();

    <T> InterfaceC64604PXc<T> oz(Class<T> cls);

    InterfaceC31677Cbx<C65126PhC> post(String str, List<? extends C05130Ib> list, String str2, byte[] bArr, Object obj);

    YM4 registerWsChannel(Context context, String str, Map<String, String> map, QOA qoa);

    List<AbstractC65069PgH> ub0(boolean z);

    InterfaceC31677Cbx<C65126PhC> uploadFile(int i, String str, List<? extends C05130Ib> list, String str2, byte[] bArr, long j, String str3);

    ResponseInterceptorV2 wV();
}
