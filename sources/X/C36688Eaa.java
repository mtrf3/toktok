package X;

import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Eaa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36688Eaa extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C36688Eaa LJLIL = new C36688Eaa();

    public C36688Eaa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        IAVSettingService createIAVSettingServicebyMonsterPlugin = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIAVSettingServicebyMonsterPlugin, "get().getService(IAVSettingService::class.java)");
        return createIAVSettingServicebyMonsterPlugin.getAppLanguage();
    }
}
