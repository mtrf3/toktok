package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.appsettings.IMUserPortraitDelaySettingsModel;

/* renamed from: X.3x4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100543x4 extends AbstractC65781Prl implements InterfaceC65784Pro<IMUserPortraitDelaySettingsModel> {
    public static final C100543x4 LJLIL = new C100543x4();

    public C100543x4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.im.service.appsettings.IMUserPortraitDelaySettingsModel] */
    @Override // X.InterfaceC65784Pro
    public final IMUserPortraitDelaySettingsModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        IMUserPortraitDelaySettingsModel iMUserPortraitDelaySettingsModel = C100533x3.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("im_user_portrait_delay_config", IMUserPortraitDelaySettingsModel.class, iMUserPortraitDelaySettingsModel);
        if (LJIIIIZZ == 0) {
            return iMUserPortraitDelaySettingsModel;
        }
        return LJIIIIZZ;
    }
}
