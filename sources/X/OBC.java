package X;

import Y.ARunnableS14S0400000_10;
import Y.ARunnableS7S1300000_10;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.miniapp.impl.MiniAppDependServiceImpl;
import com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OBC implements IMiniAppService {
    public static final /* synthetic */ int LIZJ = 0;
    public IMiniAppService LIZ;
    public boolean LIZIZ = true;

    public final synchronized IMiniAppService LIZ() {
        IMiniAppService iMiniAppService = this.LIZ;
        if (iMiniAppService != null) {
            return iMiniAppService;
        }
        try {
            try {
                this.LIZ = (IMiniAppService) Class.forName("com.ss.android.ugc.aweme.miniapp.MiniAppService").getMethod("inst", new Class[0]).invoke(null, new Object[0]);
            } catch (IllegalAccessException e) {
                C78983UzD.LJIIZILJ(e);
                C36922EeM.LIZ(e);
            } catch (NoSuchMethodException e2) {
                C36922EeM.LIZ(e2);
            } catch (InvocationTargetException e3) {
                C78983UzD.LJIIZILJ(e3);
                C36922EeM.LIZ(e3);
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final String addScene(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final boolean checkMiniAppEnable(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final String getJsSdkVersion(Application application) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void getShareInfo(String str, OBF obf) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void handleActivityImageResult(int i, int i2, Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void initMiniApp(OBE obe) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void initWebViewSuffix(ContextWrapper contextWrapper, String str) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final boolean isMinAppAvailable(Context context, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void logExcitingVideoAd(Context context, String str, long j, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void notifyFollowAwemeState(int i) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void notifyLocaleChange(Locale locale) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final boolean openShortcut(Context context, Intent intent) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void preloadMiniApp(String str) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void preloadMiniApp(String str, int i) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void remoteMobV3(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final String setLaunchModeHostTask(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void tryMoveMiniAppActivityToFront(String str) {
    }

    static {
        C16880lQ.LJLLJ(OBC.class);
    }

    public final IMiniAppService LIZIZ() {
        try {
            if (this.LIZIZ) {
                NKH LJJLIIIJLJLI = MiniAppDependServiceImpl.LIZ().LJJLIIIJLJLI();
                HashMap hashMap = new HashMap();
                hashMap.put("plugin_version", "");
                LJJLIIIJLJLI.LIZ(new JSONObject(hashMap));
                this.LIZIZ = false;
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        IMiniAppService LIZ = LIZ();
        if (LIZ == null) {
            return this;
        }
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final InterfaceC31074CHm getMobClickCombinerIpcService() {
        return new C31073CHl();
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final OBG getTTDownloaderIpcService() {
        return new C62819Ol5();
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final boolean openMiniApp(Context context, MicroAppInfo microAppInfo, C227898wz c227898wz) {
        String schema;
        if (microAppInfo == null) {
            schema = "";
        } else {
            schema = microAppInfo.getSchema();
        }
        boolean z = false;
        if (schema != null && schema.length() != 0) {
            z = TextUtils.equals(UriProtector.parse(schema).getHost(), "microgame");
        }
        return C37253Ejh.LIZIZ(z, new ARunnableS14S0400000_10(context, c227898wz, this, microAppInfo, 5));
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final boolean openMiniApp(Context context, String str, C227898wz c227898wz) {
        boolean z = false;
        if (str != null && str.length() != 0) {
            z = TextUtils.equals(UriProtector.parse(str).getHost(), "microgame");
        }
        return C37253Ejh.LIZIZ(z, new ARunnableS7S1300000_10(c227898wz, this, context, str, 1));
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public final void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4) {
        C37253Ejh.LIZIZ(z, new OBD(this, context, str, str2, z, str3, str4));
    }
}
