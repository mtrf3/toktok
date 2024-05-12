package X;

import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aix, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94559aix extends AbstractC65781Prl implements InterfaceC65784Pro<C93842aXO> {
    public static final C94559aix LJLIL = new C94559aix();

    public C94559aix() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C93842aXO invoke() {
        IEffectPlatformFactory LIZ = EffectPlatformFactory.LIZ();
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(C44172HVg.LIZ);
        EffectConfiguration build = LIZ.createEffectConfigurationBuilder(effectPlatformBuilder).build();
        String LJJJJZI = EffectPlatform.LJJJJZI();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String appVersion = EF7.LIZLLL();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String deviceId = AppLog.getServerDeviceId();
        C60903NvH.LJIIJJI().getRegionService();
        String LIZ2 = C44296Ha0.LIZ();
        if (LIZ2 == null) {
            LIZ2 = "";
        }
        String appLanguage = C60903NvH.LJIIJJI().getAppLanguage();
        String channel = build.getChannel();
        String LJJL = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJL("");
        String LJJIJ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIJ("");
        String sdkVersion = build.getSdkVersion();
        List<Host> hosts = build.getHosts();
        o.LJIIIIZZ(hosts, "effectConfiguration.hosts");
        ArrayList arrayList = new ArrayList(C32I.LJJL(hosts, 10));
        Iterator<Host> it = hosts.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getItemName());
        }
        String accessKey = build.getAccessKey();
        o.LJIIIIZZ(LJJJJZI, "getAppId()");
        o.LJIIIIZZ(appVersion, "appVersion");
        o.LJIIIIZZ(deviceId, "deviceId");
        o.LJIIIIZZ(channel, "channel");
        o.LJIIIIZZ(accessKey, "accessKey");
        return new C93842aXO(LJJJJZI, appVersion, deviceId, LIZ2, appLanguage, channel, sdkVersion, LJJIJ, LJJL, arrayList, accessKey);
    }
}
