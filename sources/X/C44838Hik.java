package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerBitrateToResolution;
import java.util.List;

/* renamed from: X.Hik, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44838Hik extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends StickerBitrateToResolution>> {
    public static final C44838Hik LJLIL = new C44838Hik();

    public C44838Hik() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends StickerBitrateToResolution> invoke() {
        Object[] objArr = (Object[]) SettingsManager.LIZLLL().LJIIIIZZ("studio_downgrade_sticker_video_bitrate_category", StickerBitrateToResolution[].class, null);
        if (objArr == null) {
            return null;
        }
        return ORY.LJJZZIII(objArr);
    }
}
