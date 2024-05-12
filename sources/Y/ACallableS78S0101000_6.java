package Y;

import X.AbstractC36908Ee8;
import X.AbstractC37134Ehm;
import X.C0F0;
import X.C10K;
import X.C16880lQ;
import X.C1DG;
import X.C2NU;
import X.C34613DiD;
import X.C34639Did;
import X.C35363DuJ;
import X.C36826Eco;
import X.C37420EmO;
import X.C37499Enf;
import X.C37504Enk;
import X.C37548EoS;
import X.C38298F1i;
import X.C38449F7d;
import X.C38891fp;
import X.C38995FSd;
import X.C39592FgK;
import X.C39596FgO;
import X.C39604FgW;
import X.C48202Ivu;
import X.C53432Ky4;
import X.C64797Pbt;
import X.C76800UCe;
import X.C78934UyQ;
import X.E3F;
import X.EF7;
import X.ENH;
import X.EYV;
import X.EnumC111394Yt;
import X.EnumC48190Ivi;
import X.F9J;
import X.F9T;
import X.FFI;
import X.FJW;
import X.FJX;
import X.FMX;
import X.LVM;
import X.PEH;
import X.QJY;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.google.gson.internal.i;
import com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.api.NotificationApi;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.PopupSettingManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ACallableS78S0101000_6 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS78S0101000_6 aCallableS78S0101000_6) {
        switch (aCallableS78S0101000_6.i1) {
            case 0:
                C37499Enf LIZ = ((C37504Enk) aCallableS78S0101000_6.l0).LIZ();
                if (LIZ != null) {
                    C37420EmO.LIZIZ.LIZ(LIZ);
                    LIZ.LJII();
                }
                return LIZ;
            default:
                return ((C37548EoS) aCallableS78S0101000_6.l0).LJLILLLLZI;
        }
    }

    public static final Object call$1(ACallableS78S0101000_6 aCallableS78S0101000_6) {
        Context context;
        SharedPreferences LIZIZ;
        String string;
        String str;
        Context context2;
        SharedPreferences LIZIZ2;
        String string2;
        if ((aCallableS78S0101000_6.i1 & 2) != 0 && (context2 = (Context) aCallableS78S0101000_6.l0) != null && (LIZIZ2 = F9J.LIZIZ(context2, 0, "LeakDetectorSp")) != null && (string2 = LIZIZ2.getString("ld_oom_dump_file", null)) != null) {
            if ((aCallableS78S0101000_6.i1 & 16) != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("OOM UploadHprof right now:");
                LIZ.append(string2);
                C39596FgO.LIZ(X1D.LIZIZ(LIZ));
                C39604FgW.LIZ((Context) aCallableS78S0101000_6.l0, string2);
                F9T.LIZIZ((Context) aCallableS78S0101000_6.l0, null);
            } else if (C39592FgK.LIZ() < 0.4f) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("OOM anlaysis right now:");
                LIZ2.append(string2);
                C39596FgO.LIZ(X1D.LIZIZ(LIZ2));
                LeakDetectorInstaller.INSTANCE.runAnalysis(string2);
                F9T.LIZIZ((Context) aCallableS78S0101000_6.l0, null);
            }
        }
        if ((aCallableS78S0101000_6.i1 & 4) != 0 && (str = MemoryConfig.getMemoryConfig().dumpFilePath) != null) {
            if ((aCallableS78S0101000_6.i1 & 16) != 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("direct UploadHprof right now:");
                LIZ3.append(str);
                C39596FgO.LIZ(X1D.LIZIZ(LIZ3));
                C39604FgW.LIZ((Context) aCallableS78S0101000_6.l0, str);
            } else if (C39592FgK.LIZ() > 0.4f) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("direct anlaysis right now:");
                LIZ4.append(str);
                C39596FgO.LIZ(X1D.LIZIZ(LIZ4));
                LeakDetectorInstaller.INSTANCE.runAnalysis(str);
            }
        }
        if ((aCallableS78S0101000_6.i1 & 8) != 0 && (context = (Context) aCallableS78S0101000_6.l0) != null && (LIZIZ = F9J.LIZIZ(context, 0, "LeakDetectorSp")) != null && (string = LIZIZ.getString("ld_memory_peak_dump_file", null)) != null) {
            if ((aCallableS78S0101000_6.i1 & 16) != 0) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("MemoryPeak UploadHprof right now:");
                LIZ5.append(string);
                C39596FgO.LIZ(X1D.LIZIZ(LIZ5));
                C39604FgW.LIZ((Context) aCallableS78S0101000_6.l0, string);
                F9T.LIZ((Context) aCallableS78S0101000_6.l0, null);
            } else if (C39592FgK.LIZ() > 0.4f) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("MemoryPeak anlaysis right now:");
                LIZ6.append(string);
                C39596FgO.LIZ(X1D.LIZIZ(LIZ6));
                LeakDetectorInstaller.INSTANCE.runAnalysis(string);
                F9T.LIZ((Context) aCallableS78S0101000_6.l0, null);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS78S0101000_6 aCallableS78S0101000_6) {
        try {
            return PopupSettingManager.popupSettingRequestApi.requestPopupConfig(((PopupSettingManager) aCallableS78S0101000_6.l0).resolvePublishPermission(aCallableS78S0101000_6.i1)).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static final Object call$3(ACallableS78S0101000_6 aCallableS78S0101000_6) {
        switch (aCallableS78S0101000_6.i1) {
            case 0:
                C38891fp.LJIILJJIL((String) aCallableS78S0101000_6.l0);
                return null;
            case 1:
                return aCallableS78S0101000_6.l0;
            default:
                ((C38449F7d) ((ARunnableS42S0100000_6) aCallableS78S0101000_6.l0).l0).getClass();
                C38449F7d.LJI();
                FFI.LJIIIIZZ = true;
                return null;
        }
    }

    public static final Object call$4(ACallableS78S0101000_6 aCallableS78S0101000_6) {
        boolean booleanValue;
        int i;
        ((LVM) aCallableS78S0101000_6.l0).getClass();
        boolean z = true;
        if (ENH.LIZ()) {
            booleanValue = true;
        } else {
            booleanValue = ((Boolean) C0F0.LIZIZ().LIZJ(Boolean.TRUE, "following_inbox_bubble_enable")).booleanValue();
        }
        boolean z2 = false;
        if (booleanValue && ((i = aCallableS78S0101000_6.i1) == 1 || i == 10 || i == 11)) {
            if (((LVM) aCallableS78S0101000_6.l0).LJIILIIL().expGroup != 2 && ((LVM) aCallableS78S0101000_6.l0).LJIILIIL().expGroup != 3) {
                z = false;
            }
            z2 = z;
        }
        NoticeList LIZ = NotificationApi.LIZ(aCallableS78S0101000_6.i1, C35363DuJ.LIZ(), z2, C53432Ky4.LJ());
        PreloadManager.LIZJ(LIZ, aCallableS78S0101000_6.i1);
        return LIZ;
    }

    public static final Object call$5(ACallableS78S0101000_6 aCallableS78S0101000_6) {
        AbstractC37134Ehm abstractC37134Ehm = (AbstractC37134Ehm) aCallableS78S0101000_6.l0;
        int i = aCallableS78S0101000_6.i1;
        boolean z = abstractC37134Ehm.LJI.LJIIIZ;
        FJW LIZJ = FJW.LIZJ();
        FJX fjx = abstractC37134Ehm.LJI.LJIIJ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    if (z) {
                        LIZJ.LIZIZ();
                    }
                    if (fjx == null) {
                        return null;
                    }
                    fjx.LIZLLL(abstractC37134Ehm.LJFF);
                    return null;
                }
                if (!abstractC37134Ehm.LJFF && z) {
                    LIZJ.LIZLLL(abstractC37134Ehm.LJIIJJI, abstractC37134Ehm.LJIIJ);
                    if (LIZJ.LIZ != null && LIZJ.LIZ.LJLJJL != null) {
                        LIZJ.LIZ.setMessage(LIZJ.LIZ.getContext().getString(R.string.rjz));
                    }
                }
                if (fjx == null) {
                    return null;
                }
                fjx.LIZIZ(abstractC37134Ehm.LJIIJJI, abstractC37134Ehm.LJIIJ, abstractC37134Ehm.LJFF);
                fjx.LIZ(abstractC37134Ehm.LJFF);
                return null;
            }
            if (!abstractC37134Ehm.LJFF && z) {
                LIZJ.LIZLLL(abstractC37134Ehm.LJIIJJI, abstractC37134Ehm.LJIIJ);
            }
            if (fjx == null) {
                return null;
            }
            fjx.LIZIZ(abstractC37134Ehm.LJIIJJI, abstractC37134Ehm.LJIIJ, abstractC37134Ehm.LJFF);
            return null;
        }
        if (!abstractC37134Ehm.LJFF && z) {
            LIZJ.getClass();
            String str = abstractC37134Ehm.LIZ;
            if (!LIZJ.LIZIZ) {
                Activity validTopActivity = ActivityStack.getValidTopActivity();
                if (validTopActivity != null) {
                    Intent intent = new Intent(validTopActivity, (Class<?>) DFInstallBlankActivity.class);
                    intent.putExtra("module_name", str);
                    intent.putExtra("is_hold_progress_dialog", true);
                    C16880lQ.LIZIZ(validTopActivity, intent);
                    validTopActivity.overridePendingTransition(0, 0);
                    LIZJ.LIZIZ = true;
                }
            } else if (LIZJ.LIZ != null && LIZJ.LIZ.LJLJJL != null && !LIZJ.LIZ.LJLJJL.isFinishing()) {
                FJW.LIZ(LIZJ.LIZ);
            }
        }
        if (fjx == null) {
            return null;
        }
        fjx.LJ(abstractC37134Ehm.LJFF);
        return null;
    }

    public static final Object call$6(ACallableS78S0101000_6 aCallableS78S0101000_6) {
        switch (aCallableS78S0101000_6.i1) {
            case 0:
                ((Runnable) aCallableS78S0101000_6.l0).run();
                return null;
            case 1:
                C36826Eco c36826Eco = (C36826Eco) aCallableS78S0101000_6.l0;
                c36826Eco.getClass();
                SettingsManagerProxy.inst().notifySettingsChange();
                ARunnableS45S0100000_9 aRunnableS45S0100000_9 = new ARunnableS45S0100000_9(c36826Eco, 221);
                if (((Boolean) C34639Did.LIZJ.getValue()).booleanValue() && c36826Eco.LJLJJLL) {
                    c36826Eco.LJLJJLL = false;
                    C10K.LJII(3000L).LJ(new AgS87S0101000_15(1, aRunnableS45S0100000_9, 3), C10K.LJI, null);
                } else {
                    C10K.LIZIZ(new ACallableS78S0101000_6(0, aRunnableS45S0100000_9, 8), C38995FSd.LIZLLL(), null);
                }
                return null;
            default:
                return C78934UyQ.LJLIL.getMusicService().LJJIIJZLJL((String) aCallableS78S0101000_6.l0);
        }
    }

    public static final Object call$7(ACallableS78S0101000_6 aCallableS78S0101000_6) {
        switch (aCallableS78S0101000_6.i1) {
            case 0:
                NetWorkStateReceiver netWorkStateReceiver = (NetWorkStateReceiver) aCallableS78S0101000_6.l0;
                netWorkStateReceiver.getClass();
                NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(EF7.LIZIZ(), "connectivity"));
                C48202Ivu c48202Ivu = C2NU.LIZ;
                c48202Ivu.getClass();
                synchronized (C48202Ivu.class) {
                    c48202Ivu.LIZ = LJJLI;
                    c48202Ivu.LJFF(LJJLI);
                }
                EnumC48190Ivi enumC48190Ivi = c48202Ivu.LIZIZ;
                if (enumC48190Ivi != netWorkStateReceiver.LIZ) {
                    boolean z = false;
                    C1DG.LIZ().getConfig().getPlayerGlobalConfig().setForceHttps(false);
                    EF7.LIZIZ();
                    try {
                        z = c48202Ivu.LIZIZ();
                    } catch (Exception unused) {
                    }
                    if (z) {
                        c48202Ivu.LJ(EnumC111394Yt.AVAILABLE);
                    } else {
                        c48202Ivu.LJ(EnumC111394Yt.NOT_AVAILABLE);
                    }
                }
                if (netWorkStateReceiver.LIZ != EnumC48190Ivi.UNKNOWN) {
                    NetWorkStateReceiver.LIZJ = true;
                }
                netWorkStateReceiver.LIZ = enumC48190Ivi;
                return null;
            default:
                VideoBitRateABManager videoBitRateABManager = (VideoBitRateABManager) aCallableS78S0101000_6.l0;
                videoBitRateABManager.getClass();
                videoBitRateABManager.LIZLLL(((RateSettingCombineModel) ColdLaunchRequestCombinerImpl.LIZJ().getResponse("/aweme/v1/rate/settings/")).getRateSetting());
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$8(ACallableS78S0101000_6 aCallableS78S0101000_6) {
        String str;
        JSONObject jSONObject;
        String str2;
        String str3;
        switch (aCallableS78S0101000_6.i1) {
            case 0:
                i.LIZJ((Runnable) aCallableS78S0101000_6.l0);
                return null;
            default:
                C38298F1i c38298F1i = (C38298F1i) aCallableS78S0101000_6.l0;
                c38298F1i.LJII = c38298F1i.LIZ(c38298F1i.LJII, c38298F1i.LJIIIZ);
                String str4 = "";
                try {
                    jSONObject = new JSONObject();
                    str2 = c38298F1i.LJIIL;
                } catch (Exception e) {
                    e = e;
                    str = "";
                }
                try {
                    if (str2 != null) {
                        C64797Pbt LIZJ = EYV.LIZJ(c38298F1i.LJII, c38298F1i.LJIIJ, str2, c38298F1i.LJIIJJI);
                        str3 = (String) LIZJ.LIZIZ;
                        str4 = c38298F1i.LIZJ(LIZJ.LIZ.LIZLLL);
                    } else {
                        HashMap hashMap = new HashMap();
                        JSONObject jSONObject2 = c38298F1i.LJIIJ;
                        if (jSONObject2 != null) {
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                hashMap.put(next, c38298F1i.LJIIJ.optString(next, ""));
                            }
                        }
                        QJY.LJI(hashMap, true);
                        C64797Pbt<String> execute = c38298F1i.LJIJ.doPost(c38298F1i.LJII, 0, hashMap).execute();
                        str3 = execute.LIZIZ;
                        str4 = c38298F1i.LIZJ(execute.LIZ.LIZLLL);
                        Api.LIZ(str3, c38298F1i.LJII);
                    }
                    jSONObject.put("code", 1);
                    jSONObject.put("response", new JSONObject(str3).put("_AME_Header_RequestID", str4));
                    jSONObject.put("_raw", str3);
                } catch (Exception e2) {
                    e = e2;
                    str = str4;
                    str4 = str3;
                    c38298F1i.LJIILIIL = e;
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("code", 0);
                        jSONObject.put("response", new JSONObject(str4).put("_AME_Header_RequestID", str));
                        jSONObject.put("_raw", str4);
                    } catch (JSONException e3) {
                        C16880lQ.LLLLIIL(e3);
                    }
                    return jSONObject;
                }
                return jSONObject;
        }
    }

    public static final Object call$9(ACallableS78S0101000_6 aCallableS78S0101000_6) {
        switch (aCallableS78S0101000_6.i1) {
            case 0:
                aCallableS78S0101000_6.l0.getClass();
                final int effectiveConnectionType = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getEffectiveConnectionType();
                FMX.LJIIL("no_data_refresh_page", new HashMap<String, String>(effectiveConnectionType) { // from class: X.2Mv
                    {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(effectiveConnectionType);
                        LIZ.append("");
                        put("network_status", X1D.LIZIZ(LIZ));
                        put("enter_from", "homepage_hot");
                    }
                });
                return null;
            default:
                VideoBitRateABManager videoBitRateABManager = (VideoBitRateABManager) aCallableS78S0101000_6.l0;
                videoBitRateABManager.getClass();
                try {
                    if (videoBitRateABManager.LJ == null) {
                        videoBitRateABManager.LJFF();
                    }
                    AObjectS53S0101000_8 aObjectS53S0101000_8 = new AObjectS53S0101000_8(4, videoBitRateABManager, 1);
                    E3F.LIZJ("updateconfig_bootfinish", aObjectS53S0101000_8, new AObjectS126S0200000_6(videoBitRateABManager, aObjectS53S0101000_8, 0), ((Boolean) C34613DiD.LIZLLL.getValue()).booleanValue());
                } catch (Throwable th) {
                    PEH.LIZLLL(th, null);
                }
                return null;
        }
    }

    public ACallableS78S0101000_6(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
