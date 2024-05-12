package X;

import Y.ARunnableS5S1200000_6;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.VDv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79391VDv implements VE0 {
    public static volatile C79391VDv LJ;
    public static volatile boolean LJFF;
    public InterfaceC79393VDx LIZ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public long LIZLLL;

    public static C79391VDv LIZIZ() {
        if (LJ == null) {
            synchronized (C79391VDv.class) {
                if (LJ == null) {
                    LJ = new C79391VDv();
                }
            }
        }
        return LJ;
    }

    public final void LIZJ() {
        InterfaceC79393VDx interfaceC79393VDx = this.LIZ;
        if (interfaceC79393VDx != null) {
            if (interfaceC79393VDx.getContext() != null) {
                if (!TextUtils.isEmpty(this.LIZ.getAid())) {
                    try {
                        this.LIZIZ = this.LIZ.getDeviceId();
                        this.LIZLLL = this.LIZ.getUpdateVersionCode();
                        this.LIZJ = this.LIZ.getAid();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("device_id", this.LIZ.getDeviceId());
                        jSONObject.put("host_aid", this.LIZ.getAid());
                        jSONObject.put("channel", this.LIZ.getChannel());
                        jSONObject.put("app_version", this.LIZ.getAppVersionName());
                        jSONObject.put("update_version_code", String.valueOf(this.LIZ.getUpdateVersionCode()));
                        jSONObject.put("package_name", this.LIZ.getPackageName());
                        jSONObject.put("oversea", "1");
                        String[] monitorHosts = this.LIZ.getMonitorHosts();
                        if (monitorHosts != null && monitorHosts.length > 0) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (String str : monitorHosts) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("https://");
                                LIZ.append(str);
                                LIZ.append("/monitor/appmonitor/v2/settings");
                                arrayList.add(X1D.LIZIZ(LIZ));
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("https://");
                                LIZ2.append(str);
                                LIZ2.append("/monitor/collect/");
                                arrayList2.add(X1D.LIZIZ(LIZ2));
                            }
                            SDKMonitorUtils.LIZLLL("2993", arrayList);
                            SDKMonitorUtils.LJ("2993", arrayList2);
                        } else {
                            SDKMonitorUtils.LIZLLL("2993", Arrays.asList(C68021Qmn.LIZ));
                            SDKMonitorUtils.LJ("2993", Arrays.asList(C68021Qmn.LIZIZ));
                        }
                        SDKMonitorUtils.LIZJ(this.LIZ.getContext(), "2993", jSONObject, new C79390VDu(this));
                        LJFF = true;
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("aid ");
                LIZ3.append(this.LIZ.getAid());
                LIZ3.append(" is invalid");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
            }
            throw new IllegalArgumentException("context is null");
        }
        throw new IllegalArgumentException("config is null");
    }

    public final void LIZLLL(JSONObject jSONObject) {
        String str;
        try {
            if (TextUtils.isEmpty(jSONObject.optString("app_id"))) {
                jSONObject.put("app_id", this.LIZJ);
            }
            if (TextUtils.isEmpty(jSONObject.optString("device_id"))) {
                jSONObject.put("device_id", this.LIZIZ);
                String str2 = this.LIZIZ;
                try {
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (!TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str2)) {
                    str = String.valueOf(CastLongProtector.valueOf(str2).longValue() % 100);
                    jSONObject.put("device_id_postfix", str);
                }
                str = "";
                jSONObject.put("device_id_postfix", str);
            }
            if (jSONObject.optInt("update_version") == 0) {
                jSONObject.put("update_version", this.LIZLLL);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.VE0
    public final void LIZ(String str, JSONObject jSONObject) {
        int optInt;
        try {
            if (!LJFF) {
                synchronized (C79391VDv.class) {
                    if (!LJFF) {
                        LIZJ();
                    }
                }
            }
            LIZLLL(jSONObject);
            if (!TextUtils.isEmpty(jSONObject.optString("event_page"))) {
                SDKMonitorUtils.LIZIZ("2993").LJIIJ(str, jSONObject, null, null);
            }
            C79392VDw LIZ = C79392VDw.LIZ();
            LIZ.getClass();
            if (("download_db".equals(str) || (optInt = jSONObject.optInt("download_status", 0)) == -3 || optInt == -4 || optInt == -1 || optInt == -2) && X4P.LJIILJJIL()) {
                if (X4Q.LJIJJLI()) {
                    C84212X3g.LJFF().submit(new ARunnableS5S1200000_6(LIZ, str, jSONObject, 8));
                } else {
                    LIZ.LIZJ(str, jSONObject);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
