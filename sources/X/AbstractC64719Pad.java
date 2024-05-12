package X;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Pad, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64719Pad implements ICronetDepend, ICronetAppProvider {
    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void doLoadLibrary(String str) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getCityName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final java.util.Map<String[], Pair<byte[], byte[]>> getClientOpaqueData() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDevicePlatform() {
        return "android";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getHttpDnsRequestFlags() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getIId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getIsDropFirstTnc() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getLanguage() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final java.util.Map<String, Pair<Integer, Integer>> getQuicHint() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSdkAppId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSdkVersion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final String getSsCookieKey() {
        return "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSsmix() {
        return "a";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getTNCRequestFlags() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean isBOEProxyEnabled() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean isEnableBrotli() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean isEnableHttp2() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean isEnableQuic() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final void loggerD(String str, String str2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean needCustomLoadLibrary() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final void setAdapter(ICronetDepend iCronetDepend) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbi() {
        return Build.SUPPORTED_ABIS[0];
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final java.util.Map<String, String> getGetDomainDependHostMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] LJFF = TTNetInit.getTTNetDepend().LJFF();
        if (LJFF != null) {
            if (LJFF.length > 0) {
                linkedHashMap.put("first", LJFF[0]);
            }
            if (LJFF.length > 1) {
                linkedHashMap.put("second", LJFF[1]);
            }
            if (LJFF.length > 2) {
                linkedHashMap.put("third", LJFF[2]);
            }
        }
        java.util.Map<String, String> LJIIL = TTNetInit.getTTNetDepend().LJIIL();
        if (TextUtils.isEmpty(LJIIL.get("httpdns")) || (TextUtils.isEmpty(LJIIL.get("boe")) && TextUtils.isEmpty("boe_https"))) {
            throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
        }
        linkedHashMap.putAll(LJIIL);
        return linkedHashMap;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getOSApi() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getOSVersion() {
        try {
            String str = Build.VERSION.RELEASE;
            if (str != null && str.length() > 10) {
                return str.substring(0, 10);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final int getProcessFlag() {
        return C36841Ed3.LIZ.get();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getCronetSoPath() {
        return C64734Pas.LJIIIZ(TTNetInit.getTTNetDepend().getContext()).LJZI;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDPI() {
        int LJIIIIZZ = KL2.LJIIIIZZ(TTNetInit.getTTNetDepend().getContext());
        if (LJIIIIZZ > 0) {
            return String.valueOf(LJIIIIZZ);
        }
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getNetAccessType() {
        return C16880lQ.LLJILJILJ(TTNetInit.getTTNetDepend().getContext());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getNetworkOperator() {
        if (TTNetInit.getSystemApiSandbox() == null) {
            return "";
        }
        return TTNetInit.getSystemApiSandbox().getNetworkOperator();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getResolution() {
        String LJIIJ = KL2.LJIIJ(TTNetInit.getTTNetDepend().getContext());
        if (!C38354F3m.LJ(LJIIJ)) {
            return LJIIJ;
        }
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getRticket() {
        return String.valueOf(System.currentTimeMillis());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSimOperator() {
        if (TTNetInit.getSystemApiSandbox() == null) {
            return "";
        }
        return TTNetInit.getSystemApiSandbox().getSimOperator();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final java.util.Map<String, String> getTNCRequestQuery() {
        InterfaceC64741Paz tTNetDepend = TTNetInit.getTTNetDepend();
        if (tTNetDepend != null) {
            boolean z = tTNetDepend instanceof FXG;
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final int getWifiFrequency() {
        if (TTNetInit.getSystemApiSandbox() == null) {
            return 0;
        }
        return TTNetInit.getSystemApiSandbox().getWifiFrequency();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final int getWifiRssi() {
        if (TTNetInit.getSystemApiSandbox() == null) {
            return 0;
        }
        return TTNetInit.getSystemApiSandbox().getWifiRssi();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onColdStartFinish() {
        Logger.debug();
        new C64723Pah().LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onCronetBootSucceed() {
        Logger.debug();
        new C64739Pax().LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDeviceBrand() {
        return Build.BRAND;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDeviceModel() {
        return Build.MODEL;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDeviceType() {
        return Build.MODEL;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onClientIPChanged(String str) {
        Logger.debug();
        new C64724Pai(str).LIZ();
    }

    public void onEffectiveConnectionTypeChanged(int i) {
        Logger.debug();
        new FX6(this, i).LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onNetworkQualityLevelChanged(int i) {
        Logger.debug();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onServerConfigABTestChanged(String str) {
        try {
            new C64721Paf(str).LIZ();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onServerConfigEtagChanged(String str) {
        try {
            new C64720Pae(str).LIZ();
        } catch (Throwable unused) {
        }
    }

    public void onServerConfigUpdated(String str) {
        try {
            Logger.debug();
            new C64722Pag(str).LIZ();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTNetDetectInfoChanged(String str) {
        Logger.debug();
        new C64726Pak(this, str).LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onUserSpecifyingNetworkEnabled(boolean z) {
        Logger.debug();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final java.util.Map<String, String> onCallToAddSecurityFactor(String str, java.util.Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(entry.getValue());
            hashMap.put(entry.getKey(), arrayList);
        }
        InterfaceC39184FZk interfaceC39184FZk = C64735Pat.LJIILL;
        if (interfaceC39184FZk != null) {
            return interfaceC39184FZk.onCallToAddSecurityFactor(str, hashMap);
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onDropReasonChanged(boolean z, List<Integer> list) {
        Logger.debug();
        new PNL(z, list).LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onPublicIPsChanged(List<String> list, List<String> list2) {
        Logger.debug();
        new C64725Paj(list, list2).LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTNCUpdateFailed(ArrayList<String> arrayList, String str) {
        Logger.debug();
        new C64712PaW(arrayList, str).LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onNetworkQualityRttAndThroughputNotified(int i, int i2, int i3) {
        Logger.debug();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        Logger.debug();
        new POD(this, i, i2, i3).LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onPacketLossComputed(int i, double d, double d2, double d3, double d4) {
        Logger.debug();
        new PNR(this, i, d, d2, d3, d4).LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onStoreIdcChanged(String str, String str2, String str3, String str4, String str5) {
        Logger.debug();
        new C64705PaP(str, str2, str3, str4, str5).LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTDnsResolveResult(String str, String str2, int i, int i2, int i3, List<String> list, String str3) {
        Logger.debug();
        new C64744Pb2(str, str2, i, i2, i3, list, str3).LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, Exception exc) {
        Logger.debug();
        C64668PZo create = C64668PZo.LJJIJIL.create();
        create.LIZ = str3;
        create.LIZJ = j;
        create.LIZLLL = j;
        create.LJ = j2;
        create.LJFF = j3;
        create.LJI = j4;
        create.LJII = j5;
        create.LJIIIZ = j6;
        create.LJIIJ = j7;
        create.LJIIJJI = j8;
        create.LJIIL = j9;
        create.LJIILIIL = j10;
        create.LJIILJJIL = z2;
        create.LJIILL = j11;
        long j13 = j5 - j2;
        create.LJIILLIIL = j13;
        create.LJIJ = j12;
        create.LJIL = str4;
        create.LJJIFFI = str5;
        create.LJJII = str6;
        create.LJIJI = 0;
        if (z) {
            C64735Pat.LIZLLL(j13, j2, str, str2, create);
        } else {
            C64735Pat.LIZIZ(j13, j2, str, str2, create, exc);
        }
    }
}
