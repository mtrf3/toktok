package com.bytedance.android.livesdk.comp.impl.network;

import X.AbstractC65022PfW;
import X.AbstractC65069PgH;
import X.C05130Ib;
import X.C08710Vv;
import X.C0NB;
import X.C16880lQ;
import X.C47261Igj;
import X.C65019PfT;
import X.C65047Pfv;
import X.C65086PgY;
import X.C65099Pgl;
import X.C65120Ph6;
import X.C65121Ph7;
import X.C65126PhC;
import X.C65127PhD;
import X.C65128PhE;
import X.C65130PhG;
import X.C65132PhI;
import X.C65148PhY;
import X.C65196PiK;
import X.C65223Pil;
import X.C65238Pj0;
import X.CN1;
import X.InterfaceC31105CIr;
import X.InterfaceC31677Cbx;
import X.InterfaceC64604PXc;
import X.InterfaceC65014PfO;
import X.InterfaceC65049Pfx;
import X.P8O;
import X.QOA;
import X.R2L;
import X.X1D;
import X.YM4;
import android.content.Context;
import com.bytedance.android.live.network.ResponseInterceptorV2;
import com.bytedance.android.live.network.interceptors.NtpTimeInterceptor;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.performance.LiveLazyInitPBDecoderSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkRequestSync;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkRequestV2;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkSyncBlockList;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class NetworkService implements INetworkService {
    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final List<AbstractC65022PfW> Lh() {
        return C47261Igj.LJJIJIL(new R2L(new C65238Pj0(C65120Ph6.LIZ())), new C65099Pgl());
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final NtpTimeInterceptor mn0() {
        return new NtpTimeInterceptor();
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final C65019PfT gF() {
        return C65086PgY.LIZ().LJFF;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final Map<String, String> getCommonParams() {
        C65121Ph7 LIZ = C65121Ph7.LIZ();
        LIZ.getClass();
        Map<String, String> commonParams = ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).getCommonParams();
        LIZ.LIZJ.LIZLLL(commonParams);
        return commonParams;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final String getHostDomain() {
        C65121Ph7.LIZ().getClass();
        return ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).getHostDomain();
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final ResponseInterceptorV2 wV() {
        return ResponseInterceptorV2.LIZ();
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final <T> T Du0(Class<T> cls) {
        C65086PgY LIZ = C65086PgY.LIZ();
        T t = (T) LIZ.LIZIZ.get(cls);
        if (t == null) {
            ConcurrentHashMap<Class, Object> concurrentHashMap = LIZ.LIZIZ;
            t = (T) LIZ.LJI.LIZ(cls);
            concurrentHashMap.putIfAbsent(cls, t);
        }
        Iterator it = ((CopyOnWriteArrayList) LIZ.LJIIIZ).iterator();
        while (it.hasNext()) {
            InterfaceC65049Pfx interfaceC65049Pfx = (InterfaceC65049Pfx) it.next();
            if (interfaceC65049Pfx.LIZIZ(cls)) {
                return (T) interfaceC65049Pfx.LIZ(cls, t);
            }
        }
        return t;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void Gj(C65047Pfv c65047Pfv) {
        C65086PgY LIZ = C65086PgY.LIZ();
        if (c65047Pfv != null) {
            if (((CopyOnWriteArrayList) LIZ.LJIIIZ).contains(c65047Pfv)) {
                return;
            }
            ((CopyOnWriteArrayList) LIZ.LJIIIZ).add(c65047Pfv);
            return;
        }
        LIZ.getClass();
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final <T> InterfaceC31105CIr<T> Kq0(Class<T> clazz) {
        o.LJIIIZ(clazz, "clazz");
        C65121Ph7 LIZ = C65121Ph7.LIZ();
        InterfaceC31105CIr<T> interfaceC31105CIr = (InterfaceC31105CIr) ((ConcurrentHashMap) LIZ.LIZ).get(clazz);
        if (interfaceC31105CIr != null) {
            return interfaceC31105CIr;
        }
        if (LiveLazyInitPBDecoderSetting.INSTANCE.getValue()) {
            InterfaceC31105CIr<T> interfaceC31105CIr2 = (InterfaceC31105CIr<T>) C08710Vv.LIZ(clazz);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("enable lazy init pb decoder class. class:");
            LIZ2.append(clazz);
            C0NB.LIZIZ("NetworkServiceProvider", X1D.LIZIZ(LIZ2));
            if (interfaceC31105CIr2 != null) {
                ((ConcurrentHashMap) LIZ.LIZ).put(clazz, interfaceC31105CIr2);
                return interfaceC31105CIr2;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getProtoDecoder pb decoder class from map failed. class:");
        LIZ3.append(clazz);
        C0NB.LJIIIZ("NetworkServiceProvider", X1D.LIZIZ(LIZ3));
        Object LIZIZ = C65121Ph7.LIZIZ(clazz, "_ProtoDecoder");
        if (LIZIZ != null) {
            InterfaceC31105CIr<T> interfaceC31105CIr3 = (InterfaceC31105CIr) LIZIZ;
            if (interfaceC31105CIr3 == null) {
                return interfaceC31105CIr3;
            }
            ((ConcurrentHashMap) LIZ.LIZ).put(clazz, interfaceC31105CIr3);
            return interfaceC31105CIr3;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final <T> T Mk(Class<T> cls) {
        C65086PgY LIZ = C65086PgY.LIZ();
        T t = (T) LIZ.LIZLLL.get(cls);
        if (t == null) {
            ConcurrentHashMap<Class, Object> concurrentHashMap = LIZ.LIZLLL;
            t = (T) LIZ.LJIIIIZZ.LIZ(cls);
            concurrentHashMap.putIfAbsent(cls, t);
        }
        Iterator it = ((CopyOnWriteArrayList) LIZ.LJIIIZ).iterator();
        while (it.hasNext()) {
            InterfaceC65049Pfx interfaceC65049Pfx = (InterfaceC65049Pfx) it.next();
            if (interfaceC65049Pfx.LIZIZ(cls)) {
                return (T) interfaceC65049Pfx.LIZ(cls, t);
            }
        }
        return t;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void Op(Map<Class<?>, ? extends InterfaceC31105CIr<?>> map) {
        ((ConcurrentHashMap) C65121Ph7.LIZ().LIZ).putAll(map);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void Qi(P8O p8o) {
        C65128PhE.LIZ.add(p8o);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void SP(C65047Pfv c65047Pfv) {
        C65086PgY LIZ = C65086PgY.LIZ();
        if (c65047Pfv == null) {
            LIZ.getClass();
        } else {
            ((CopyOnWriteArrayList) LIZ.LJIIIZ).remove(c65047Pfv);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void Sa(Map<Class<?>, ? extends InterfaceC64604PXc<?>> map) {
        ((ConcurrentHashMap) C65121Ph7.LIZ().LIZIZ).putAll(map);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final Object Yk(Class cls) {
        C65086PgY LIZ = C65086PgY.LIZ();
        Object obj = LIZ.LJ.get(cls);
        if (obj == null) {
            C65019PfT customHostRetrofit = ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).getCustomHostRetrofit("api.tiktokv.com");
            ConcurrentHashMap<Class, Object> concurrentHashMap = LIZ.LJ;
            obj = customHostRetrofit.LIZ(cls);
            concurrentHashMap.putIfAbsent(cls, obj);
        }
        Iterator it = ((CopyOnWriteArrayList) LIZ.LJIIIZ).iterator();
        while (it.hasNext()) {
            InterfaceC65049Pfx interfaceC65049Pfx = (InterfaceC65049Pfx) it.next();
            if (interfaceC65049Pfx.LIZIZ(cls)) {
                return interfaceC65049Pfx.LIZ(cls, obj);
            }
        }
        return obj;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final boolean fI(InterfaceC65014PfO<?, ?> callAdapter) {
        o.LJIIIZ(callAdapter, "callAdapter");
        if (!(callAdapter instanceof C65132PhI) || !((JSONObject) C65132PhI.LJ.getValue()).optBoolean(((C65132PhI) callAdapter).LIZIZ.key, false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final void fl(Map<String, String> map) {
        C65121Ph7.LIZ().LIZJ.LIZLLL(map);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final <T> T getService(Class<T> cls) {
        T t;
        String LJLLJ;
        C65086PgY LIZ = C65086PgY.LIZ();
        LIZ.getClass();
        if (LiveNetworkRequestV2.INSTANCE.getValue()) {
            if (cls == null) {
                LJLLJ = "";
            } else {
                LJLLJ = C16880lQ.LJLLJ(cls);
            }
            if (LiveNetworkRequestSync.INSTANCE.enable() && LiveNetworkSyncBlockList.INSTANCE.enable(LJLLJ)) {
                t = (T) LIZ.LIZIZ.get(cls);
                if (t == null) {
                    ConcurrentHashMap<Class, Object> concurrentHashMap = LIZ.LIZIZ;
                    t = (T) LIZ.LJI.LIZ(cls);
                    concurrentHashMap.putIfAbsent(cls, t);
                }
            } else {
                t = (T) LIZ.LIZJ.get(cls);
                if (t == null) {
                    ConcurrentHashMap<Class, Object> concurrentHashMap2 = LIZ.LIZJ;
                    t = (T) LIZ.LJII.LIZ(cls);
                    concurrentHashMap2.putIfAbsent(cls, t);
                }
            }
        } else {
            t = (T) LIZ.LIZ.get(cls);
            if (t == null) {
                ConcurrentHashMap<Class, Object> concurrentHashMap3 = LIZ.LIZ;
                t = (T) LIZ.LJFF.LIZ(cls);
                concurrentHashMap3.putIfAbsent(cls, t);
            }
        }
        Iterator it = ((CopyOnWriteArrayList) LIZ.LJIIIZ).iterator();
        while (it.hasNext()) {
            InterfaceC65049Pfx interfaceC65049Pfx = (InterfaceC65049Pfx) it.next();
            if (interfaceC65049Pfx.LIZIZ(cls)) {
                return (T) interfaceC65049Pfx.LIZ(cls, t);
            }
        }
        return t;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final Map<String, String> hd0(String str) {
        C65121Ph7 LIZ = C65121Ph7.LIZ();
        LIZ.getClass();
        Map<String, String> commonParams = ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).getCommonParams();
        LIZ.LIZJ.LIZJ(str, commonParams);
        return commonParams;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final <T> InterfaceC64604PXc<T> oz(Class<T> cls) {
        C65121Ph7 LIZ = C65121Ph7.LIZ();
        InterfaceC64604PXc<T> interfaceC64604PXc = (InterfaceC64604PXc) ((ConcurrentHashMap) LIZ.LIZIZ).get(cls);
        if (interfaceC64604PXc != null) {
            return interfaceC64604PXc;
        }
        Object LIZIZ = C65121Ph7.LIZIZ(cls, "_ProtoEncoder");
        if (LIZIZ != null) {
            InterfaceC64604PXc<T> interfaceC64604PXc2 = (InterfaceC64604PXc) LIZIZ;
            if (interfaceC64604PXc2 == null) {
                return interfaceC64604PXc2;
            }
            ((ConcurrentHashMap) LIZ.LIZIZ).put(cls, interfaceC64604PXc2);
            return interfaceC64604PXc2;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final List<AbstractC65069PgH> ub0(boolean z) {
        if (z) {
            return C47261Igj.LJJIJIL(new C65130PhG(new C65148PhY(false)), new C65223Pil(0));
        }
        return C47261Igj.LJJIJIL(new C65130PhG(new C65148PhY(true)), new C65223Pil(0));
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final InterfaceC31677Cbx<C65126PhC> get(String str, List<? extends C05130Ib> list) {
        C65196PiK c65196PiK = C65121Ph7.LIZ().LIZJ;
        C65127PhD c65127PhD = new C65127PhD(str, list);
        c65196PiK.LIZIZ(c65127PhD);
        return ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).get(c65127PhD.LIZ, list, null);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final InterfaceC31677Cbx<C65126PhC> get(String str, List<? extends C05130Ib> list, Object obj) {
        C65196PiK c65196PiK = C65121Ph7.LIZ().LIZJ;
        C65127PhD c65127PhD = new C65127PhD(str, list);
        c65196PiK.LIZIZ(c65127PhD);
        return ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).get(c65127PhD.LIZ, list, obj);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final InterfaceC31677Cbx<C65126PhC> mL(String str, List<? extends C05130Ib> list, String str2, byte[] bArr) {
        return C65121Ph7.LIZ().LIZLLL(str, list, str2, bArr, null);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final YM4 registerWsChannel(Context context, String url, Map<String, String> map, QOA onLiveWsMessageReceiveListener) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(onLiveWsMessageReceiveListener, "onLiveWsMessageReceiveListener");
        C65121Ph7.LIZ().getClass();
        return ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).registerWsChannel(context, url, map, onLiveWsMessageReceiveListener);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final InterfaceC31677Cbx<C65126PhC> downloadFile(boolean z, int i, String str, List<? extends C05130Ib> list, Object obj) {
        C65196PiK c65196PiK = C65121Ph7.LIZ().LIZJ;
        C65127PhD c65127PhD = new C65127PhD(str, list);
        c65196PiK.LIZIZ(c65127PhD);
        return ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).downloadFile(false, Integer.MAX_VALUE, c65127PhD.LIZ, list, null);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final InterfaceC31677Cbx<C65126PhC> post(String str, List<? extends C05130Ib> list, String str2, byte[] bArr, Object obj) {
        return C65121Ph7.LIZ().LIZLLL(str, list, str2, bArr, obj);
    }

    @Override // com.bytedance.android.livesdk.comp.api.network.INetworkService
    public final InterfaceC31677Cbx<C65126PhC> uploadFile(int i, String str, List<? extends C05130Ib> list, String str2, byte[] bArr, long j, String str3) {
        C65196PiK c65196PiK = C65121Ph7.LIZ().LIZJ;
        C65127PhD c65127PhD = new C65127PhD(str, list);
        c65196PiK.LIZIZ(c65127PhD);
        return ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).uploadFile(i, c65127PhD.LIZ, list, str2, bArr, j, str3);
    }
}
