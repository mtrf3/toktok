package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserProgressBarManager;
import com.ss.android.ugc.aweme.plugin.PluginService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E5T implements Runnable {
    public final /* synthetic */ PluginService LJLIL;
    public final /* synthetic */ Boolean LJLILLLLZI;
    public final /* synthetic */ E5V LJLJI;
    public final /* synthetic */ Boolean LJLJJI;
    public final /* synthetic */ Boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ int LJLJL;

    public E5T(PluginService pluginService, Boolean bool, E5V e5v, Boolean bool2, Boolean bool3, boolean z, int i) {
        this.LJLIL = pluginService;
        this.LJLILLLLZI = bool;
        this.LJLJI = e5v;
        this.LJLJJI = bool2;
        this.LJLJJL = bool3;
        this.LJLJJLL = z;
        this.LJLJL = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.3kP] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, java.lang.Long] */
    public final void LIZ() {
        ArrayList arrayList;
        Integer num;
        String curSecUserId;
        long j;
        String str;
        String str2;
        Integer num2;
        Integer num3;
        long j2;
        this.LJLIL.tryInit();
        Collection<C35833E4n> values = this.LJLIL.pluginMap.values();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(values, 10));
        for (C35833E4n c35833E4n : values) {
            arrayList2.add(new PluginService.PluginApi.CachedPlugin(c35833E4n.LIZ.getValue(), Integer.valueOf(c35833E4n.LIZ()), c35833E4n.LIZIZ.timestamp));
        }
        List LLJI = ORZ.LLJI(arrayList2);
        PluginService pluginService = this.LJLIL;
        if (pluginService.clientTriggerConfig.enable != null) {
            java.util.Set<Integer> keySet = pluginService.stateMachineMap.keySet();
            arrayList = new ArrayList(C32I.LJJL(keySet, 10));
            Iterator<Integer> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(new PluginService.PluginApi.CachedStateMachine(it.next().intValue()));
            }
        } else {
            arrayList = null;
        }
        C68322mC c68322mC = new C68322mC();
        Boolean bool = this.LJLJJL;
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            num = 0;
            HybridABInfoService.LIZJ().LIZ(false);
            long j3 = C56662Kg.LIZ().LJIIJJI;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() - j3;
            } else {
                j2 = -1;
            }
            c68322mC.element = Long.valueOf(SystemClock.elapsedRealtime());
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(0, "android_id_status");
            c188727au.LJ(j2, "app_start_req_send_duration");
            C36222EJm.LIZ(c188727au);
            java.util.Map<String, String> run$lambda$3 = c188727au.LIZ;
            o.LJIIIIZZ(run$lambda$3, "run$lambda$3");
            V2B.LJIJ(run$lambda$3);
            FMX.LJIIL("hybrid_ab_req_send", run$lambda$3);
        } else {
            num = null;
        }
        E5V e5v = this.LJLJI;
        if (e5v == null || (curSecUserId = e5v.LIZ) == null) {
            curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
        }
        if (curSecUserId == null) {
            curSecUserId = "";
        }
        boolean z = !o.LJ(curSecUserId, this.LJLIL.keva.getString("prev_user", ""));
        Boolean cacheUserAndCheckIfNewSignup = this.LJLIL.cacheUserAndCheckIfNewSignup(this.LJLJI);
        int i = this.LJLIL.keva.getInt("reinstall_check_result", -1);
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = SystemClock.elapsedRealtime();
        int i2 = this.LJLJL;
        long j4 = C56662Kg.LIZ().LJIIJJI;
        if (j4 > 0) {
            j = SystemClock.elapsedRealtime() - j4;
        } else {
            j = -1;
        }
        C188727au LJ = C169696lJ.LJ(j, "app_start_req_send_duration");
        Boolean LIZLLL = C38987FRv.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
        LJ.LIZLLL(LIZLLL.booleanValue() ? 1 : 0, "is_cold_start_first_launch");
        LJ.LIZLLL(C84763XOl.LJIIJJI ? 1 : 0, "is_app_background");
        LJ.LIZLLL(C35856E5k.LIZ.getNetworkStatus().ordinal(), "network_status");
        LJ.LIZLLL(i2, WM7.SCENE_SERVICE);
        FMX.LJIIL("plugin_api_req_send", LJ.LIZ);
        C68322mC c68322mC2 = new C68322mC();
        PluginService pluginService2 = this.LJLIL;
        PluginService.PluginApi pluginApi = pluginService2.api;
        Boolean bool3 = this.LJLILLLLZI;
        Boolean bool4 = this.LJLJJI;
        String firstInstallVersion = pluginService2.getFirstInstallVersion();
        String json = GsonProtectorUtils.toJson(new Gson(), LLJI);
        if (arrayList != null) {
            str = GsonProtectorUtils.toJson(new Gson(), arrayList);
        } else {
            str = null;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (this.LJLJJLL) {
            str2 = this.LJLIL.getSsaid();
        } else {
            str2 = null;
        }
        Boolean LIZLLL2 = C38987FRv.LIZLLL();
        Integer valueOf2 = Integer.valueOf(this.LJLJJLL ? 1 : 0);
        if (i != -1) {
            num2 = Integer.valueOf(i);
        } else {
            num2 = null;
        }
        if (o.LJ(cacheUserAndCheckIfNewSignup, bool2)) {
            num3 = Integer.valueOf(NewUserProgressBarManager.LIZJ().LIZ());
        } else {
            num3 = null;
        }
        C73454SsE LJJJ = pluginApi.getPluginConfig(bool3, cacheUserAndCheckIfNewSignup, bool4, firstInstallVersion, json, str, valueOf, str2, LIZLLL2, null, num, valueOf2, num2, num3, this.LJLIL.getMockHybridAbIdForDebug(), this.LJLIL.getMemorySize(), this.LJLIL.getScreenDp()).LJJL(T16.LIZ()).LJJJ(T16.LIZ());
        PluginService pluginService3 = this.LJLIL;
        Boolean bool5 = this.LJLJJL;
        int i3 = this.LJLJL;
        c68322mC2.element = LJJJ.LJJJLIIL(new C35853E5h(pluginService3, bool5, c68322mC, i3, c72242sW, c68322mC2, this.LJLJJLL), new C35896E6y(bool5, pluginService3, c68322mC, i3, c72242sW, c68322mC2));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
