package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Build;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fdu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39442Fdu extends C39445Fdx {
    @Override // X.C39445Fdx, X.InterfaceC39446Fdy
    public final java.util.Map<String, Object> LJFF(InterfaceC39443Fdv instance, F3T providerFactory) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        String uri;
        Activity activity;
        InterfaceC60250Nkk<?, ?, ?, ?> F5;
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(providerFactory, "providerFactory");
        Context context = (Context) providerFactory.LIZJ(Context.class);
        int i5 = 0;
        if (context != null) {
            i2 = C17N.LJJJJI(C60996Nwm.LJIIIIZZ(context));
            i3 = C17N.LJJJJI(C60996Nwm.LJ(context));
            if (!(context instanceof Activity)) {
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                o.LJIIIIZZ(context, "{\n            if (ctx is…x\n            }\n        }");
            }
            i = context.hashCode();
        } else {
            i = -1;
            i2 = 0;
            i3 = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("screenWidth", Integer.valueOf(i2));
        linkedHashMap.put("screenHeight", Integer.valueOf(i3));
        linkedHashMap.put("os", "android");
        String RELEASE = Build.VERSION.RELEASE;
        o.LJIIIIZZ(RELEASE, "RELEASE");
        linkedHashMap.put("osVersion", RELEASE);
        linkedHashMap.put("channel", EF7.LJIILIIL);
        linkedHashMap.put("region", C85990Xow.LIZ());
        linkedHashMap.put("appName", EF7.LIZ());
        linkedHashMap.put("appVersion", EF7.LIZLLL());
        linkedHashMap.put("updateVersionCode", String.valueOf(EF7.LJFF()));
        String locale = C39419FdX.LIZ().toString();
        o.LJIIIIZZ(locale, "getCurrentLocale().toString()");
        linkedHashMap.put("language", locale);
        linkedHashMap.put("appLanguage", SettingServiceImpl.LIZ().getAppLanguage());
        String LIZIZ = C85999Xp5.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getAppLocale()");
        linkedHashMap.put("appLocale", LIZIZ);
        InterfaceC60196Njs interfaceC60196Njs = (InterfaceC60196Njs) providerFactory.LIZJ(InterfaceC60196Njs.class);
        String str2 = "";
        if (interfaceC60196Njs == null || (F5 = interfaceC60196Njs.F5(F0S.LYNX)) == null || (str = F5.LLLJIL()) == null) {
            str = "";
        }
        linkedHashMap.put("lynxSdkVersion", str);
        linkedHashMap.put("aid", Integer.valueOf(EF7.LJIIIZ));
        String serverDeviceId = AppLog.getServerDeviceId();
        o.LJIIIIZZ(serverDeviceId, "getServerDeviceId()");
        linkedHashMap.put("deviceId", serverDeviceId);
        if (i != -1) {
            linkedHashMap.put("theme", SettingServiceImpl.LIZ().getTheme(i));
        }
        Context context2 = (Context) providerFactory.LIZJ(Context.class);
        if (context2 != null) {
            i4 = C63081OpJ.LJJJJLI(context2);
        } else {
            i4 = 0;
        }
        int LJJJJI = C17N.LJJJJI(i4);
        Rect rect = new Rect();
        InterfaceC60187Njj interfaceC60187Njj = (InterfaceC60187Njj) providerFactory.LIZJ(InterfaceC60187Njj.class);
        if (interfaceC60187Njj != null && (activity = interfaceC60187Njj.getActivity()) != null) {
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i5 = C17N.LJJJJI((double) rect.top) >= LJJJJI ? C17N.LJJJJI(rect.height()) : C17N.LJJJJI(rect.height()) - LJJJJI;
        }
        linkedHashMap.put("statusBarHeight", Integer.valueOf(LJJJJI));
        linkedHashMap.put("safeAreaHeight", Integer.valueOf(i5));
        IBulletHostProxy LIZ = BulletHostProxy.LIZ();
        android.net.Uri te = instance.te();
        if (te != null && (uri = te.toString()) != null) {
            str2 = uri;
        }
        JSONObject LJFF = LIZ.LJFF(str2);
        if (LJFF != null) {
            linkedHashMap.put("abParams", JsonExtKt.toMap(LJFF));
        }
        return linkedHashMap;
    }
}
