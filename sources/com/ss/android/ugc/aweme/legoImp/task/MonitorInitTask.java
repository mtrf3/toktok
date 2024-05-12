package com.ss.android.ugc.aweme.legoImp.task;

import X.C09820a2;
import X.C0RN;
import X.C36152EGu;
import X.C37090Eh4;
import X.C38995FSd;
import X.C39033FTp;
import X.C39037FTt;
import X.C39041FTx;
import X.C59895Nf1;
import X.C60903NvH;
import X.C62822Ol8;
import X.C85990Xow;
import X.C8HX;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F79;
import X.F9D;
import X.FQR;
import X.FU1;
import X.FU3;
import X.FUA;
import X.FUF;
import X.InterfaceC39043FTz;
import X.PFC;
import Y.ARunnableS11S0201000_8;
import Y.ARunnableS1S0001000_6;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.impl.DefaultTTNetImpl;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class MonitorInitTask implements EE1 {
    public static final AtomicBoolean LJLIL = new AtomicBoolean(false);
    public static final String[] LJLILLLLZI = {"https://mon-va.tiktokv.com/monitor/collect/c/exception"};
    public static final List<String> LJLJI;

    @Override // X.EEY
    public final String key() {
        return "MonitorInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    static {
        String str;
        String[] strArr = new String[3];
        String str2 = "https://mon.tiktokv.com/monitor/collect/";
        if (C85990Xow.LJIIIZ()) {
            str = "https://mon.tiktokv.com/monitor/collect/";
        } else {
            str = "https://mon-va.tiktokv.com/monitor/collect/";
        }
        strArr[0] = str;
        if (C85990Xow.LJIIIZ()) {
            str2 = "https://mon-va.tiktokv.com/monitor/collect/";
        }
        strArr[1] = str2;
        strArr[2] = "https://mon-sg.tiktokv.com/monitor/collect/";
        LJLJI = new ArrayList(Arrays.asList(strArr));
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(final Context context) {
        Iterator<String> keys;
        String str;
        long j;
        if (LJLIL.compareAndSet(false, true)) {
            C09820a2.LIZ(EF7.LIZIZ());
            C39033FTp c39033FTp = new C39033FTp();
            JSONObject headerCopy = AppLog.getHeaderCopy();
            if (headerCopy != null) {
                try {
                    headerCopy.put("is_new_user", String.valueOf(C36152EGu.LJ()));
                    try {
                        JSONObject jSONObject = c39033FTp.LJFF;
                        if (jSONObject != null && (keys = headerCopy.keys()) != null) {
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (!headerCopy.isNull(next)) {
                                    jSONObject.put(next, headerCopy.opt(next));
                                }
                            }
                        }
                    } catch (JSONException unused) {
                    }
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
            String[] strArr = new String[3];
            String str2 = "https://mon.tiktokv.com/monitor/appmonitor/v2/settings";
            if (C85990Xow.LJIIIZ()) {
                str = "https://mon.tiktokv.com/monitor/appmonitor/v2/settings";
            } else {
                str = "https://mon-va.tiktokv.com/monitor/appmonitor/v2/settings";
            }
            strArr[0] = str;
            if (C85990Xow.LJIIIZ()) {
                str2 = "https://mon-va.tiktokv.com/monitor/appmonitor/v2/settings";
            }
            strArr[1] = str2;
            strArr[2] = "https://mon-sg.tiktokv.com/monitor/appmonitor/v2/settings";
            c39033FTp.LIZJ = Arrays.asList(strArr);
            if (((Boolean) FU3.LJFF.getValue()).booleanValue()) {
                j = 0;
            } else {
                j = 60;
            }
            c39033FTp.LJIIIZ = Math.min(j, 30L);
            c39033FTp.LJ = Arrays.asList(LJLILLLLZI);
            c39033FTp.LIZLLL = LJLJI;
            try {
                c39033FTp.LJFF.put("aid", EF7.LJIIIZ);
            } catch (JSONException unused2) {
            }
            try {
                c39033FTp.LJFF.put("device_id", AppLog.getServerDeviceId());
            } catch (JSONException unused3) {
            }
            try {
                c39033FTp.LJFF.put("app_version", EF7.LIZLLL());
            } catch (JSONException unused4) {
            }
            try {
                c39033FTp.LJFF.put("update_version_code", String.valueOf(EF7.LJFF()));
            } catch (JSONException unused5) {
            }
            try {
                c39033FTp.LJFF.put("channel", EF7.LJIILIIL);
            } catch (JSONException unused6) {
            }
            c39033FTp.LJIILIIL = new C39041FTx();
            c39033FTp.LJIILL = new C60903NvH();
            c39033FTp.LJIIJ = new F79();
            String LIZIZ = F9D.LIZIZ(AppLog.getServerDeviceId());
            if (LIZIZ != null) {
                try {
                    c39033FTp.LJFF.put("scoped_device_id", LIZIZ);
                } catch (JSONException unused7) {
                }
            } else {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("Apm", "getScopedDeviceId: null");
            }
            if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
                c39033FTp.LIZ = C37090Eh4.LIZ.LIZ.forceUpdateSlardarSetting();
                c39033FTp.LJIIJJI = new FUF() { // from class: X.Ee2
                    @Override // X.FUF
                    public final void LIZ(String str3, JSONObject jSONObject2) {
                        Context context2 = context;
                        if (C79081V1x.LJLJJL == null) {
                            C79081V1x.LJLJJL = Boolean.valueOf(KevaImpl.getRepo("optimize_config", 0).getBoolean("log_open", false));
                        }
                        if (!C79081V1x.LJLJJL.booleanValue() || !TextUtils.equals("page_load", str3)) {
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        try {
                            String string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "extra_status"), WM7.SCENE_SERVICE);
                            String substring = string.substring(string.lastIndexOf(46));
                            sb.append("Activity: ");
                            sb.append(substring);
                            sb.append("\n");
                            JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "extra_values");
                            Iterator<String> keys2 = jSONObject3.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                sb.append(next2);
                                sb.append(": ");
                                sb.append(JSONObjectProtectorUtils.getInt(jSONObject3, next2));
                                sb.append("\n");
                            }
                            sb.deleteCharAt(sb.lastIndexOf("\n"));
                        } catch (Exception e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                        C73969T1h.LIZIZ().LIZIZ(new ARunnableS11S0201000_8(1, context2, sb, 12));
                    }
                };
            }
            c39033FTp.LIZIZ = true;
            C62822Ol8 c62822Ol8 = FU1.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() == 1) {
                C38995FSd.LIZLLL().submit(new ARunnableS1S0001000_6(2, 23), 5000);
            } else if (((Number) c62822Ol8.getValue()).intValue() == 2) {
                C38995FSd.LIZLLL().submit(new ARunnableS1S0001000_6(0, 6), 5000);
            }
            ((InterfaceC39043FTz) ServiceManager.get().getService(InterfaceC39043FTz.class)).LIZ();
            Context LIZIZ2 = EF7.LIZIZ();
            c39033FTp.LJII = new DefaultTTNetImpl();
            c39033FTp.LJI = new FQR();
            c39033FTp.LJIIL = new C59895Nf1();
            FUA.LIZ(c39033FTp);
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(new C39037FTt(LIZIZ2, c39033FTp));
            NetworkUtils.setMonitorProcessHook(C8HX.LIZLLL);
            PFC.LJLZ.put("is_new_user", String.valueOf(C36152EGu.LJI()));
        }
    }
}
