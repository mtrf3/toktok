package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E6Y<T> implements InterfaceC86003Zc {
    public static final E6Y<T> LJLIL = new E6Y<>();

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Boolean> interfaceC73573Su9) {
        boolean z;
        Object obj;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
        if ((LIZIZ != null && LIZIZ.intValue() == 1) || !C38987FRv.LIZLLL().booleanValue()) {
            z = true;
            IPluginService.PluginData LIZ = C35865E5t.LIZ();
            if (LIZ == null || !o.LJ(LIZ.showConfig.shouldShow, Boolean.TRUE)) {
                interfaceC73573Su9.onNext(Boolean.FALSE);
                interfaceC73573Su9.onComplete();
                return;
            }
        } else {
            z = false;
        }
        if (C35865E5t.LIZ() != null) {
            Iterator LJFF = C79061V1d.LJFF(false);
            while (true) {
                if (LJFF.hasNext()) {
                    obj = LJFF.next();
                    if (((IPluginService.PluginData) obj).id == EnumC35839E4t.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
            if (pluginData == null || (pluginDataWrapper = pluginData.configData) == null || (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) == null || personalizedNUJV2Data.personalizedNUJLabel < 1) {
                interfaceC73573Su9.onNext(Boolean.FALSE);
                interfaceC73573Su9.onComplete();
                return;
            }
        }
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (z && C78857UxB.LJJJIL(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
            interfaceC73573Su9.onNext(Boolean.TRUE);
            interfaceC73573Su9.onComplete();
        } else {
            interfaceC73573Su9.onError(new IllegalStateException("did or Hybrid AB Response is not ready"));
        }
    }
}
