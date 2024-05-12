package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AV1;
import X.AbstractC65022PfW;
import X.AbstractC65069PgH;
import X.C03660Ck;
import X.C05040Hs;
import X.C05130Ib;
import X.C09900aA;
import X.C16880lQ;
import X.C35154Dqw;
import X.C40084FoG;
import X.C65019PfT;
import X.C65087PgZ;
import X.C65123Ph9;
import X.C65124PhA;
import X.C65126PhC;
import X.C66934QOs;
import X.C66951QPj;
import X.C67128QWe;
import X.C67143QWt;
import X.CN1;
import X.EF7;
import X.EnumC30220BtY;
import X.EnumC41264GHk;
import X.InterfaceC30221BtZ;
import X.InterfaceC31677Cbx;
import X.InterfaceC35868E5w;
import X.InterfaceC37276Ek4;
import X.M50;
import X.QJY;
import X.QO5;
import X.QO8;
import X.QO9;
import X.QOA;
import X.QOD;
import X.QOF;
import X.QOG;
import X.QOH;
import X.QOI;
import X.QOV;
import X.QWY;
import X.X1D;
import X.YM4;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostNetwork;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.ttlive.ILiveApi;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LiveHostNetwork implements IHostNetwork {
    public volatile ILiveApi LJLIL;
    public final HashMap<Integer, InterfaceC35868E5w> LJLILLLLZI = new HashMap<>();

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final EnumC30220BtY getTTNetworkStatus() {
        return LJ(NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getNetworkStatus());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        QOH.LIZ(this);
    }

    public final ILiveApi LIZLLL() {
        if (this.LJLIL == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("https://");
            LIZ.append("api-va.tiktokv.com");
            this.LJLIL = (ILiveApi) C40084FoG.LIZIZ(X1D.LIZIZ(LIZ)).LIZ.LIZ(ILiveApi.class);
        }
        return this.LJLIL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        QJY.LJI(hashMap, false);
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getHostDomain() {
        return Live.getLiveDomain();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C65019PfT getHostRetrofit() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append("api-va.tiktokv.com");
        return C40084FoG.LIZIZ(X1D.LIZIZ(LIZ)).LIZ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getHostWebSocketDomain() {
        return Live.getLiveWebSocketDomain();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getKYCHostDomain() {
        return Live.getKYCDomain();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C65019PfT getKYCRetrofit() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(getKYCHostDomain());
        String LIZIZ = X1D.LIZIZ(LIZ);
        C65124PhA.LIZLLL().getClass();
        List<AbstractC65069PgH> ub0 = ((INetworkService) CN1.LIZ(INetworkService.class)).ub0(true);
        C65124PhA.LIZLLL().getClass();
        List<AbstractC65022PfW> Lh = ((INetworkService) CN1.LIZ(INetworkService.class)).Lh();
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ(LIZIZ);
        Iterator<AbstractC65069PgH> it = ub0.iterator();
        while (it.hasNext()) {
            LIZ2.LJ(it.next());
        }
        Iterator<AbstractC65022PfW> it2 = Lh.iterator();
        while (it2.hasNext()) {
            LIZ2.LIZ(it2.next());
        }
        C65124PhA.LIZLLL().getClass();
        LIZ2.LIZIZ(((INetworkService) CN1.LIZ(INetworkService.class)).wV());
        C65124PhA.LIZLLL().getClass();
        LIZ2.LIZIZ(((INetworkService) CN1.LIZ(INetworkService.class)).mn0());
        return LIZ2.LJFF().LIZ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void registerHostWS() {
        if (C35154Dqw.LIZ()) {
            QO9 qo9 = QO9.LJLIL;
            C67128QWe c67128QWe = C67128QWe.LIZIZ;
            c67128QWe.LJIIIIZZ(qo9);
            int i = QO9.LJLILLLLZI;
            int i2 = QO9.LJLJI;
            c67128QWe.LIZJ(new M50(i, i2).LJLIL, new M50(i, i2).LJLILLLLZI, qo9);
            QOI qoi = QOI.LJLIL;
            c67128QWe.LJIIIIZZ(qoi);
            c67128QWe.LIZJ(new M50(50331702, 1).LJLIL, new M50(50331702, 1).LJLILLLLZI, qoi);
            c67128QWe.LIZJ(new M50(50331702, 2).LJLIL, new M50(50331702, 2).LJLILLLLZI, qoi);
            c67128QWe.LIZJ(134217737, -10000, qoi);
            c67128QWe.LIZJ(134217736, -10000, qoi);
            QOG.LJLIL.LIZIZ();
            return;
        }
        C67143QWt c67143QWt = QWY.LJIIIZ;
        QWY LIZ = c67143QWt.LIZ();
        QO9 qo92 = QO9.LJLIL;
        LIZ.LIZLLL(new M50(QO9.LJLILLLLZI, QO9.LJLJI), qo92);
        c67143QWt.LIZ().LIZJ(qo92);
        QWY LIZ2 = c67143QWt.LIZ();
        QOI qoi2 = QOI.LJLIL;
        LIZ2.LIZLLL(new M50(50331702, 2), qoi2);
        c67143QWt.LIZ().LIZLLL(new M50(50331702, 1), qoi2);
        c67143QWt.LIZ().LIZJ(qoi2);
        c67143QWt.LIZ().LJI.add(qoi2);
        QWY LIZ3 = c67143QWt.LIZ();
        QOG qog = QOG.LJLIL;
        LIZ3.LIZLLL(new M50(16778115, 1), qog);
        c67143QWt.LIZ().LIZLLL(new M50(16778115, 2), qog);
        c67143QWt.LIZ().LIZJ(qog);
    }

    public static Map<String, String> LIZ(List<C05130Ib> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (C05130Ib c05130Ib : list) {
                hashMap.put(c05130Ib.getName(), c05130Ib.getValue());
            }
        }
        return hashMap;
    }

    public static EnumC30220BtY LJ(EnumC41264GHk enumC41264GHk) {
        EnumC30220BtY enumC30220BtY = EnumC30220BtY.STRONG;
        int i = C66934QOs.LIZIZ[enumC41264GHk.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    return enumC30220BtY;
                }
                return EnumC30220BtY.NOT_AVAILABLE;
            }
            return EnumC30220BtY.WEAK;
        }
        return enumC30220BtY;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String executeGet(String str) {
        try {
            return NetworkUtils.executeGet(0, str, false, false, null, null, false);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C65019PfT getCustomHostRetrofit(String str) {
        String LJFF = i0.LJFF("https://", str);
        C65124PhA.LIZLLL().getClass();
        List<AbstractC65069PgH> ub0 = ((INetworkService) CN1.LIZ(INetworkService.class)).ub0(true);
        C65124PhA.LIZLLL().getClass();
        List<AbstractC65022PfW> Lh = ((INetworkService) CN1.LIZ(INetworkService.class)).Lh();
        C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ(LJFF);
        Iterator<AbstractC65069PgH> it = ub0.iterator();
        while (it.hasNext()) {
            LIZ.LJ(it.next());
        }
        Iterator<AbstractC65022PfW> it2 = Lh.iterator();
        while (it2.hasNext()) {
            LIZ.LIZ(it2.next());
        }
        C65124PhA.LIZLLL().getClass();
        LIZ.LIZIZ(((INetworkService) CN1.LIZ(INetworkService.class)).wV());
        C65124PhA.LIZLLL().getClass();
        LIZ.LIZIZ(((INetworkService) CN1.LIZ(INetworkService.class)).mn0());
        return LIZ.LJFF().LIZ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final C65019PfT getLiveRetrofit(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(getHostDomain());
        String LIZIZ = X1D.LIZIZ(LIZ);
        C65124PhA.LIZLLL().getClass();
        List<AbstractC65069PgH> ub0 = ((INetworkService) CN1.LIZ(INetworkService.class)).ub0(z);
        C65124PhA.LIZLLL().getClass();
        List<AbstractC65022PfW> Lh = ((INetworkService) CN1.LIZ(INetworkService.class)).Lh();
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ(LIZIZ);
        Iterator<AbstractC65069PgH> it = ub0.iterator();
        while (it.hasNext()) {
            LIZ2.LJ(it.next());
        }
        Iterator<AbstractC65022PfW> it2 = Lh.iterator();
        while (it2.hasNext()) {
            LIZ2.LIZ(it2.next());
        }
        C65124PhA.LIZLLL().getClass();
        LIZ2.LIZIZ(((INetworkService) CN1.LIZ(INetworkService.class)).wV());
        C65124PhA.LIZLLL().getClass();
        LIZ2.LIZIZ(((INetworkService) CN1.LIZ(INetworkService.class)).mn0());
        return LIZ2.LJFF().LIZ;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void minorModeInterceptMonitor(String str) {
        if (AV1.LJIIJJI()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("url", str);
                jSONObject.putOpt("source", "livesdk");
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C09900aA.LJIIJJI("ttlive_minor_mode_live", 1, jSONObject);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void observerNetworkChange(final InterfaceC30221BtZ interfaceC30221BtZ) {
        if (interfaceC30221BtZ != null) {
            interfaceC30221BtZ.LIZ(LJ(NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getNetworkStatus()));
            InterfaceC35868E5w interfaceC35868E5w = new InterfaceC35868E5w() { // from class: X.QOE
                @Override // X.InterfaceC35868E5w
                public final void LIZ(EnumC41264GHk enumC41264GHk) {
                    LiveHostNetwork liveHostNetwork = LiveHostNetwork.this;
                    InterfaceC30221BtZ interfaceC30221BtZ2 = interfaceC30221BtZ;
                    liveHostNetwork.getClass();
                    interfaceC30221BtZ2.LIZ(LiveHostNetwork.LJ(enumC41264GHk));
                }
            };
            NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).observerNetworkChange(interfaceC35868E5w);
            this.LJLILLLLZI.put(Integer.valueOf(interfaceC30221BtZ.hashCode()), interfaceC35868E5w);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final void removeNetworkChangeObserver(InterfaceC30221BtZ interfaceC30221BtZ) {
        if (interfaceC30221BtZ != null) {
            InterfaceC35868E5w interfaceC35868E5w = this.LJLILLLLZI.get(Integer.valueOf(interfaceC30221BtZ.hashCode()));
            if (interfaceC35868E5w != null) {
                NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).removeNetworkChangeObserver(interfaceC35868E5w);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final InterfaceC31677Cbx<C65126PhC> get(String str, List<C05130Ib> list, Object obj) {
        InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4 = LIZLLL().get(str, LIZ(list), obj);
        minorModeInterceptMonitor(str);
        return new C65123Ph9(interfaceC37276Ek4);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final YM4 registerWsChannel(Context context, String str, Map<String, String> map, QOA qoa) {
        map.put("sid", AppLog.getSessionKey());
        try {
            Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            str = buildUpon.build().toString();
        } catch (Throwable unused) {
        }
        ArrayList LIZIZ = C05040Hs.LIZIZ(str);
        HashMap LIZJ = C03660Ck.LIZJ("ttnet_ignore_offline", "1");
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.isEmpty()) {
            com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = CardStruct.IStatusCode.DEFAULT;
        }
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId();
        if (com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId != null && !com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId.isEmpty()) {
            str2 = com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        QOD qod = new QOD(10001);
        qod.LJII = "e1bd35ec9db7b8d846de66ed140b1ad9";
        qod.LJFF = 9;
        qod.LJ = EF7.LJIIIZ;
        qod.LJI = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getShortVersionCode();
        qod.LJIIIIZZ = com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
        qod.LJIIIZ = str2;
        ((ArrayList) qod.LIZLLL).addAll(LIZIZ);
        ((HashMap) qod.LIZIZ).putAll(LIZJ);
        ((HashMap) qod.LIZJ).putAll(new C66951QPj(iHostAppContext));
        return new QO5(QOV.LIZJ(context, qod.LIZ(), new QO8(qoa)));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final InterfaceC31677Cbx<C65126PhC> downloadFile(boolean z, int i, String str, List<C05130Ib> list, Object obj) {
        InterfaceC37276Ek4<TypedInput> downloadFile = LIZLLL().downloadFile(z, i, str, LIZ(list), obj);
        minorModeInterceptMonitor(str);
        return new C65123Ph9(downloadFile);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final InterfaceC31677Cbx<C65126PhC> post(String str, List<C05130Ib> list, String str2, byte[] bArr, Object obj) {
        InterfaceC37276Ek4<TypedInput> post = LIZLLL().post(str, new TypedByteArray(str2, bArr, new String[0]), LIZ(list), obj);
        minorModeInterceptMonitor(str);
        return new C65123Ph9(post);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final InterfaceC31677Cbx<C65126PhC> uploadFile(int i, String str, List<C05130Ib> list, String str2, byte[] bArr, long j, String str3) {
        InterfaceC37276Ek4<TypedInput> postMultiPart = LIZLLL().postMultiPart(i, str, LIZ(list), new QOF(str2, j, bArr, str3));
        minorModeInterceptMonitor(str);
        return new C65123Ph9(postMultiPart);
    }
}
