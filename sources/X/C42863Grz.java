package X;

import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;

/* renamed from: X.Grz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42863Grz extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C42863Grz LJLIL = new C42863Grz();

    public C42863Grz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String appLanguage = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage();
        if (appLanguage == null) {
            return "";
        }
        return appLanguage;
    }
}
