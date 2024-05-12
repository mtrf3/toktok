package X;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.util.Pair;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.SettingsLocal;
import com.bytedance.geckox.settings.model.SettingsRequestBody;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import defpackage.i0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class OD4 {
    public final Context LIZ;
    public final GeckoGlobalConfig LIZIZ;
    public GlobalConfigSettings LIZJ;
    public final C61575OEp LIZLLL;
    public int LJ;
    public final C61576OEq LJFF;
    public final ODL LJII;
    public boolean LJI = true;
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final AtomicBoolean LJIIIZ = new AtomicBoolean(false);

    public final void LIZIZ() {
        GlobalConfigSettings.GlobalConfig globalConfig;
        GlobalConfigSettings.SettingsPollingConfig checkUpdate;
        GlobalConfigSettings globalConfigSettings = this.LIZJ;
        if (globalConfigSettings == null || (globalConfig = globalConfigSettings.getGlobalConfig()) == null || globalConfig.getPollEnable() != 1 || (checkUpdate = globalConfig.getCheckUpdate()) == null) {
            return;
        }
        long interval = checkUpdate.getInterval() * 1000;
        C61572OEm.LIZ.LIZ.LIZIZ(new OEW(this), interval, interval);
    }

    public OD4(GeckoGlobalConfig geckoGlobalConfig) {
        String str;
        String str2;
        String str3;
        this.LIZIZ = geckoGlobalConfig;
        Context context = geckoGlobalConfig.getContext();
        this.LIZ = context;
        this.LIZLLL = new C61575OEp();
        this.LJFF = new C61576OEq();
        SettingsLocal LJI = C61576OEq.LJI(context);
        String name = geckoGlobalConfig.getEnv().name();
        String appVersion = geckoGlobalConfig.getAppVersion();
        GlobalConfigSettings globalConfigSettings = null;
        if (LJI != null) {
            str2 = LJI.getEnv();
            str3 = LJI.getAppVersion();
            str = LJI.getAccessKeysMd5();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        C61576OEq.LJII(context, new SettingsLocal(name, appVersion, str));
        if (name.equals(str2) && appVersion.equals(str3)) {
            OAI oai = OAO.LIZ;
            if (oai.LIZ == null) {
                oai.LIZ = F9J.LIZIZ(context, 0, "sp_gecko");
            }
            String string = oai.LIZ.getString("gecko_settings", null);
            if (string != null) {
                try {
                    globalConfigSettings = (GlobalConfigSettings) OXZ.LIZIZ.LIZ.LJI(string, GlobalConfigSettings.class);
                } catch (Exception unused) {
                }
            }
            this.LIZJ = globalConfigSettings;
            if (globalConfigSettings != null) {
                this.LJ = globalConfigSettings.getVersion();
            }
        } else {
            C61576OEq.LIZLLL(context);
        }
        this.LJII = new ODL(new OEV(this));
    }

    public final void LIZJ(int i, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sync global settings start,req type:");
        LIZ.append(i);
        LIZ.append(",is reset:");
        LIZ.append(z);
        OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ));
        OAR.LIZ.LIZ().execute(new RunnableC61533OCz(this, i, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(int i, GeckoGlobalConfig geckoGlobalConfig, int i2) {
        OEI LIZ;
        Pair<String, String> requestTagHeader;
        OET oet = new OET();
        oet.LIZ = "settings_v1";
        oet.LJFF = i;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append(geckoGlobalConfig.getHost());
        LIZ2.append("/gecko/api/settings/v1");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        ArrayList arrayList = new ArrayList();
        try {
            String LIZ3 = LIZ(i, geckoGlobalConfig, i2, arrayList);
            OC6.LIZ("gecko-debug-tag", "settings request:", LIZ3);
            InterfaceC61566OEg netWork = geckoGlobalConfig.getNetWork();
            C61532OCy c61532OCy = EBC.LIZ;
            c61532OCy.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig2 = c61532OCy.LJ;
            if (geckoGlobalConfig2 != null && (netWork instanceof OEB)) {
                OEB oeb = (OEB) netWork;
                GeckoGlobalConfig.IRequestTagHeaderProvider requestTagHeaderProvider = geckoGlobalConfig2.getRequestTagHeaderProvider();
                HashMap hashMap = new HashMap();
                if (requestTagHeaderProvider != null && (requestTagHeader = requestTagHeaderProvider.getRequestTagHeader(true)) != null) {
                    hashMap.put(requestTagHeader.first, requestTagHeader.second);
                }
                LIZ = oeb.doPost(LIZIZ, LIZ3, hashMap);
            } else {
                LIZ = netWork.LIZ(LIZIZ, LIZ3);
            }
            oet.LIZJ = LIZ.LIZJ;
            String LIZ4 = C61543ODj.LIZ(LIZ.LIZ);
            oet.LIZIZ = LIZ4;
            OC6.LIZ("gecko-debug-tag", "settings response log id", LIZ4);
            OAH.LJI(geckoGlobalConfig.getContext(), LIZ);
            int i3 = LIZ.LIZJ;
            if (i3 == 200) {
                String str = LIZ.LIZIZ;
                try {
                    Type type = new OEK().getType();
                    OXZ oxz = OXZ.LIZIZ;
                    Response response = (Response) oxz.LIZ.LJII(str, type);
                    int i4 = response.status;
                    if (i4 != 2100) {
                        oet.LIZLLL = i4;
                        oet.LJ = response.msg;
                        OD6.LJIIJ(oet);
                    }
                    int i5 = response.status;
                    if (i5 == 0 || i5 == 1103) {
                        if (response.data != 0) {
                            String LIZLLL = C61327O5b.LIZLLL(arrayList);
                            SettingsLocal LJI = C61576OEq.LJI(geckoGlobalConfig.getContext());
                            if (LJI == null) {
                                LJI = new SettingsLocal(geckoGlobalConfig.getEnv().name(), geckoGlobalConfig.getAppVersion());
                            }
                            LJI.setAccessKeysMd5(LIZLLL);
                            C61576OEq.LJII(geckoGlobalConfig.getContext(), LJI);
                            this.LJII.LIZIZ();
                            this.LJI = false;
                            GlobalConfigSettings globalConfigSettings = (GlobalConfigSettings) response.data;
                            this.LIZJ = globalConfigSettings;
                            this.LJ = globalConfigSettings.getVersion();
                            C61576OEq c61576OEq = this.LJFF;
                            Context context = this.LIZ;
                            GlobalConfigSettings globalConfigSettings2 = this.LIZJ;
                            c61576OEq.getClass();
                            OC6.LIZ("gecko-debug-tag", "settings cache stored");
                            if (globalConfigSettings2 != null) {
                                OAO.LIZ.LIZ(context, "gecko_settings", GsonProtectorUtils.toJson(oxz.LIZ, globalConfigSettings2));
                            }
                            C61572OEm.LIZ.LIZ(0);
                            this.LIZLLL.LIZIZ((GlobalConfigSettings) response.data);
                            LIZIZ();
                            return;
                        }
                        throw new C61578OEs("get settings error,response data is null");
                    }
                    this.LJII.LIZIZ();
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("request failed, , code=");
                    LIZ5.append(response.status);
                    LIZ5.append(", ");
                    LIZ5.append(response.msg);
                    X1D.LIZIZ(LIZ5);
                    C61575OEp c61575OEp = this.LIZLLL;
                    int i6 = response.status;
                    List list = (List) c61575OEp.LJLIL;
                    if (list != null && !list.isEmpty()) {
                        OC6.LIZ("gecko-debug-tag", "global settings notify request error");
                        Iterator it = ((List) c61575OEp.LJLIL).iterator();
                        while (it.hasNext()) {
                            ((AbstractC61574OEo) it.next()).LIZJ(i6);
                        }
                    }
                    OC6.LIZ("gecko-debug-tag", "settings loop stop");
                    if (response.status == 2103) {
                        C61576OEq c61576OEq2 = this.LJFF;
                        Context context2 = this.LIZ;
                        c61576OEq2.getClass();
                        C61576OEq.LIZLLL(context2);
                        this.LIZJ = null;
                        this.LJ = 0;
                        this.LJI = false;
                        C61572OEm.LIZ.LIZ(0);
                        this.LIZLLL.LIZIZ(null);
                        return;
                    }
                    if (!this.LJI) {
                        return;
                    }
                    this.LJI = false;
                    LIZIZ();
                    return;
                } catch (Exception e) {
                    StringBuilder LIZIZ2 = C25620zW.LIZIZ("json parse failed：", str, " caused by:");
                    LIZIZ2.append(e.getMessage());
                    String LIZIZ3 = X1D.LIZIZ(LIZIZ2);
                    oet.LJ = LIZIZ3;
                    OD6.LJIIJ(oet);
                    throw new C61567OEh(LIZIZ3, e);
                }
            }
            oet.LIZLLL = i3;
            oet.LJ = LIZ.LIZLLL;
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("net work get failed, code: ");
            LIZ6.append(LIZ.LIZJ);
            LIZ6.append(", url:");
            LIZ6.append(LIZIZ);
            throw new NetworkErrorException(X1D.LIZIZ(LIZ6));
        } catch (IOException e2) {
            oet.LJ = e2.getMessage();
            OD6.LJIIJ(oet);
            throw new C61568OEi(i0.LJFF("request failed：url:", LIZIZ), e2);
        } catch (IllegalStateException e3) {
            oet.LJ = e3.getMessage();
            OD6.LJIIJ(oet);
            throw e3;
        } catch (Exception e4) {
            oet.LJ = e4.getMessage();
            OD6.LJIIJ(oet);
            throw new C61568OEi(i0.LJFF("request failed：url:", LIZIZ), e4);
        }
    }

    public static String LIZ(int i, GeckoGlobalConfig geckoGlobalConfig, int i2, List list) {
        OptionCheckUpdateParams.CustomValue customValue;
        SettingsRequestBody settingsRequestBody = new SettingsRequestBody();
        Common common = new Common(geckoGlobalConfig.getAppId(), geckoGlobalConfig.getAppVersion(), geckoGlobalConfig.getDeviceId(), geckoGlobalConfig.getRegion());
        common.appName = C61588OFc.LIZ(geckoGlobalConfig.getContext());
        settingsRequestBody.setCommon(common);
        settingsRequestBody.setSettings(new SettingsRequestBody.Settings(i2, geckoGlobalConfig.getEnv().getVal()));
        java.util.Map<String, java.util.Map<String, OptionCheckUpdateParams.CustomValue>> map = EBC.LIZ.LIZIZ;
        if (map != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            if (!concurrentHashMap.isEmpty()) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (entry.getValue() != null && (customValue = (OptionCheckUpdateParams.CustomValue) ((java.util.Map) entry.getValue()).get("business_version")) != null) {
                        Object key = entry.getKey();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("business_version", customValue.getValue());
                        hashMap.put(key, hashMap2);
                        ((ArrayList) list).add(key);
                    }
                }
                Collections.sort(list);
                if (i == 0) {
                    String LIZLLL = C61327O5b.LIZLLL(list);
                    SettingsLocal LJI = C61576OEq.LJI(geckoGlobalConfig.getContext());
                    if (LJI != null && LIZLLL.equals(LJI.getAccessKeysMd5())) {
                        throw new IllegalStateException("business version has not been updated");
                    }
                }
                settingsRequestBody.setCustom(hashMap);
            }
        }
        return GsonProtectorUtils.toJson(OXZ.LIZIZ.LIZ, settingsRequestBody);
    }
}
