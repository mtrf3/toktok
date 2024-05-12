package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerPreviewResolutionConfig;

/* renamed from: X.Hkj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44961Hkj {
    public static final StickerPreviewResolutionConfig LIZ = new StickerPreviewResolutionConfig(false, false, false, null, null, null, 63, null);

    public static StickerPreviewResolutionConfig LIZ() {
        if (((Boolean) C44967Hkp.LIZ.getValue()).booleanValue()) {
            return InterfaceC44963Hkl.LJIIL.getResolutionConfig();
        }
        return (StickerPreviewResolutionConfig) SettingsManager.LIZLLL().LJIIIIZZ("studio_downgrade_sticker_preview_resolution", StickerPreviewResolutionConfig.class, LIZ);
    }
}
