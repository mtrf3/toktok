package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.zstd.ZstdDictSetting;

/* renamed from: X.2Yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60352Yl extends AbstractC65781Prl implements InterfaceC65784Pro<ZstdDictSetting.ZstdDictConfig> {
    public static final C60352Yl LJLIL = new C60352Yl();

    public C60352Yl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ZstdDictSetting.ZstdDictConfig invoke() {
        ZstdDictSetting.ZstdDictConfigWrapper zstdDictConfigWrapper = (ZstdDictSetting.ZstdDictConfigWrapper) SettingsManager.LIZLLL().LJIIIIZZ("tiktok_zstd_dict_cfg", ZstdDictSetting.ZstdDictConfigWrapper.class, null);
        if (zstdDictConfigWrapper == null) {
            return null;
        }
        return zstdDictConfigWrapper.config;
    }
}
