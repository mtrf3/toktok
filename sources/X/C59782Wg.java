package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.camera.exp.IMImageCacheSizeSetting;

/* renamed from: X.2Wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59782Wg extends AbstractC65781Prl implements InterfaceC65784Pro<IMImageCacheSizeSetting.IMImageCacheSizeConfig> {
    public static final C59782Wg LJLIL = new C59782Wg();

    public C59782Wg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.service.camera.exp.IMImageCacheSizeSetting$IMImageCacheSizeConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IMImageCacheSizeSetting.IMImageCacheSizeConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        IMImageCacheSizeSetting.IMImageCacheSizeConfig iMImageCacheSizeConfig = IMImageCacheSizeSetting.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("im_image_cache_size_setting", IMImageCacheSizeSetting.IMImageCacheSizeConfig.class, iMImageCacheSizeConfig);
        if (LJIIIIZZ == 0) {
            return iMImageCacheSizeConfig;
        }
        return LJIIIIZZ;
    }
}
