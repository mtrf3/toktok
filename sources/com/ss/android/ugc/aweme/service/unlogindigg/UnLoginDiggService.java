package com.ss.android.ugc.aweme.service.unlogindigg;

import X.AbstractC73638SvC;
import X.C221108m2;
import X.C32I;
import X.C36875Edb;
import X.C36876Edc;
import X.C36878Ede;
import X.C58096Mr6;
import X.C62822Ol8;
import X.EnumC200487ts;
import X.ORZ;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.experiments.UnLoginDiggExperiment2022;
import com.ss.android.ugc.aweme.service.unlogindigg.network.UnLoginDiggNetworkService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UnLoginDiggService implements IUnLoginDiggService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C36878Ede.LJLIL);

    public static IUnLoginDiggService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(IUnLoginDiggService.class, false);
        if (LIZ != null) {
            return (IUnLoginDiggService) LIZ;
        }
        if (C58096Mr6.w5 == null) {
            synchronized (IUnLoginDiggService.class) {
                if (C58096Mr6.w5 == null) {
                    C58096Mr6.w5 = new UnLoginDiggService();
                }
            }
        }
        return C58096Mr6.w5;
    }

    public final C36875Edb LJIIJJI() {
        return (C36875Edb) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService
    public final EnumC200487ts LIZIZ() {
        C36875Edb LJIIJJI = LJIIJJI();
        LJIIJJI.getClass();
        if (UnLoginDiggExperiment2022.LIZIZ() && LJIIJJI.LIZLLL) {
            return EnumC200487ts.WHITE_TOAST;
        }
        return EnumC200487ts.NO_TOAST;
    }

    @Override // com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService
    public final void LIZJ() {
        LJIIJJI().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService
    public final boolean LIZLLL() {
        boolean z;
        LJIIJJI().getClass();
        if (!UnLoginDiggExperiment2022.LIZIZ()) {
            return true;
        }
        long j = UnLoginDiggExperiment2022.LIZ().initTimestamp;
        int i = UnLoginDiggExperiment2022.LIZ().activeDays;
        if (i <= 0 || (i * 86400000) + j < System.currentTimeMillis()) {
            z = false;
        } else {
            z = true;
        }
        return true ^ z;
    }

    @Override // com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService
    public final AbstractC73638SvC<UnLoggedDiggResponse> LJFF() {
        C36875Edb LJIIJJI = LJIIJJI();
        List<C36876Edc> LLIILII = ORZ.LLIILII(LJIIJJI.LIZ(LJIIJJI.LIZJ));
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLIILII, 10));
        for (C36876Edc c36876Edc : LLIILII) {
            arrayList.add(new UnLoginDiggNetworkService.DiggInfo(c36876Edc.LJLIL, String.valueOf(c36876Edc.LJLILLLLZI), 0, 4, null));
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        ArrayList arrayList2 = (ArrayList) LLJILJILJ;
        if (arrayList2.isEmpty()) {
            return AbstractC73638SvC.LJIJ(new UnLoggedDiggResponse(0, "sync skip"));
        }
        String diggInfos = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), LLJILJILJ);
        UnLoginDiggNetworkService.UnLoginDiggNetworkApi unLoginDiggNetworkApi = UnLoginDiggNetworkService.LIZ;
        o.LJIIIIZZ(diggInfos, "diggInfos");
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
        return unLoginDiggNetworkApi.diggSync(diggInfos, com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, arrayList2.size(), 2);
    }

    @Override // com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService
    public final void LJI() {
        C36875Edb LJIIJJI = LJIIJJI();
        LJIIJJI.LIZJ.evictAll();
        LJIIJJI.LIZLLL = true;
        LJIIJJI().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService
    public final Set<String> LJIIIIZZ() {
        return LJIIJJI().LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService
    public final void LIZ(String str) {
        C36875Edb LJIIJJI = LJIIJJI();
        LJIIJJI.getClass();
        if (str != null) {
            LJIIJJI.LIZJ.put(str, new C36876Edc(str, System.currentTimeMillis()));
            LJIIJJI.LIZLLL = false;
        }
        LJIIJJI().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService
    public final void LJ(String aid) {
        o.LJIIIZ(aid, "aid");
        C36875Edb LJIIJJI = LJIIJJI();
        LJIIJJI.getClass();
        LJIIJJI.LIZJ.remove(aid);
        LJIIJJI().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService
    public final boolean LJII(String str) {
        C36875Edb LJIIJJI = LJIIJJI();
        LJIIJJI.getClass();
        if (LJIIJJI.LIZJ.get(str) != null) {
            LJIIJJI.LIZJ.put(str, new C36876Edc(str, System.currentTimeMillis()));
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService
    public final AbstractC73638SvC<UnLoggedDiggResponse> LJIIIZ(Map<String, String> map) {
        LJIIJJI().getClass();
        String deviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        o.LJIIIIZZ(deviceId, "deviceId");
        ((HashMap) map).put("device_id", deviceId);
        return UnLoginDiggNetworkService.LIZ.unLoggedDigg(map);
    }
}
