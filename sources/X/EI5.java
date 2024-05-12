package X;

import Y.ACallableS109S0100000_6;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS5S1200000_6;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner;
import defpackage.e1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EI5 implements IColdLaunchRequestCombiner {
    public static SettingCombineModel LIZIZ;
    public static final EI5 LIZ = new EI5();
    public static final List<InterfaceC36167EHj> LIZJ = new CopyOnWriteArrayList();
    public static final HashMap<String, EI4> LIZLLL = new HashMap<>();

    static {
        if (!C35232DsC.LIZ()) {
            FH5.LIZIZ().getClass();
            LIZJ(new EI2());
        }
        if (!AV1.LJIILLIIL() && !((Boolean) DXW.LIZIZ.getValue()).booleanValue()) {
            InboxNoticeCountStrategyExperiment.LIZ.getClass();
            if ((((InboxNoticeCountStrategyExperiment.MetaData) InboxNoticeCountStrategyExperiment.LIZJ.getValue()).strategy & 2) != 2) {
                LIZJ(new END());
            }
        }
        LIZJ(new EKR());
        LIZJ(new EIP());
        LIZJ(new EIA());
        LIZJ(new EKT());
        LIZJ(new EKQ());
        if (EI6.LIZ) {
            LIZJ(new EKI());
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final boolean LIZIZ() {
        if (e1.LIZ(31744, "combine_settings_req", true, true)) {
            return true;
        }
        return false;
    }

    public static void LIZJ(EI3 ei3) {
        String LIZ2 = ei3.LIZ();
        if (LIZ2 != null) {
            LIZLLL.put(LIZ2, ei3);
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final void LIZ(InterfaceC36167EHj interfaceC36167EHj) {
        if (interfaceC36167EHj != null) {
            ((CopyOnWriteArrayList) LIZJ).add(interfaceC36167EHj);
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final BaseCombineMode getResponse(String str) {
        EI4 ei4 = LIZLLL.get(str);
        if (ei4 != null) {
            return ei4.LIZJ();
        }
        return null;
    }

    public static void LIZLLL(Integer num, String str) {
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("errorCode", num);
                c198517qh.LIZ.put("url", str);
                C09900aA.LJIIJJI("combine_settings_monitor_service", 2, c198517qh.LJ());
            }
        } catch (Throwable unused) {
        }
    }

    public static void LJ(Context context, SettingCombineModel settingCombineModel) {
        BaseCombineMode LIZJ2;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis();
        if (C34624DiO.LIZIZ) {
            System.currentTimeMillis();
            C10K.LIZIZ(new ACallableS109S0100000_6(context, 16), FMX.LIZIZ(), null);
            LIZIZ = settingCombineModel;
            EHL ehl = new EHL();
            for (Map.Entry<String, EI4> entry : LIZLLL.entrySet()) {
                o.LJIIIIZZ(entry, "mColdLaunchRequests.entries");
                C57022Lq.LIZ.LJLIL.post(new ARunnableS5S1200000_6(entry.getValue(), ehl, context, entry.getKey(), 9));
            }
            C57022Lq.LIZ.LJLIL.post(new ARunnableS42S0100000_6(ehl, 126));
            Iterator it = ((CopyOnWriteArrayList) LIZJ).iterator();
            while (it.hasNext()) {
                C57022Lq.LIZ.LJLIL.post(new ARunnableS42S0100000_6((InterfaceC36167EHj) it.next(), 127));
            }
        } else {
            System.currentTimeMillis();
            Keva repoFromSp = KevaImpl.getRepoFromSp(context, "setting_repo_sp", 0);
            if (repoFromSp != null) {
                repoFromSp.storeInt("key_has_local_cache", 1);
            }
            LIZIZ = settingCombineModel;
            EHL ehl2 = new EHL();
            for (Map.Entry<String, EI4> entry2 : LIZLLL.entrySet()) {
                o.LJIIIIZZ(entry2, "mColdLaunchRequests.entries");
                String key = entry2.getKey();
                EI4 value = entry2.getValue();
                if (!value.LJ(LIZIZ) && ((LIZJ2 = value.LIZJ()) == null || LIZJ2.httpCode != 509)) {
                    value.LIZLLL(ehl2);
                    o.LJIIIIZZ(key, "key");
                    BaseCombineMode LIZJ3 = value.LIZJ();
                    if (LIZJ3 != null) {
                        num = Integer.valueOf(LIZJ3.httpCode);
                    } else {
                        num = null;
                    }
                    LIZLLL(num, key);
                }
            }
            ehl2.LIZJ();
            Iterator it2 = ((CopyOnWriteArrayList) LIZJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC36167EHj) it2.next()).LIZJ();
            }
        }
        EIT.LIZ("system_launch").LIZIZ(System.currentTimeMillis() - currentTimeMillis, "ColdLaunchRequestCombiner:onCombineSuccess");
    }
}
