package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftByteVC1OptResourceSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCropTranscodeResourceSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDegradation264ResourceSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftLowFpsResourceSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceDowngradeStrategy;
import java.util.List;

/* renamed from: X.CnB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32373CnB implements InterfaceC32370Cn8 {
    @Override // X.InterfaceC32370Cn8
    public final AbstractC32375CnD LIZ() {
        boolean value = LiveGiftByteVC1OptResourceSetting.INSTANCE.getValue();
        boolean enableDegradation264 = LiveGiftDegradation264ResourceSetting.INSTANCE.enableDegradation264();
        boolean enableDownloadDegradeResource = LiveGiftResourceDowngradeStrategy.INSTANCE.enableDownloadDegradeResource();
        boolean enabled = LiveGiftLowFpsResourceSetting.INSTANCE.enabled();
        LiveGiftCropTranscodeResourceSetting liveGiftCropTranscodeResourceSetting = LiveGiftCropTranscodeResourceSetting.INSTANCE;
        boolean shouldCrop = liveGiftCropTranscodeResourceSetting.shouldCrop();
        boolean shouldTranscode = liveGiftCropTranscodeResourceSetting.shouldTranscode();
        boolean shouldCropTranscode = liveGiftCropTranscodeResourceSetting.shouldCropTranscode();
        if (shouldCrop) {
            return new C32379CnH();
        }
        if (shouldTranscode) {
            return new C32380CnI();
        }
        if (shouldCropTranscode) {
            return new C32381CnJ();
        }
        if (enableDegradation264) {
            return new C32382CnK();
        }
        if (enabled) {
            return new C32374CnC();
        }
        if (enableDownloadDegradeResource) {
            return new C32376CnE();
        }
        if (value) {
            return new C32377CnF();
        }
        return new C32378CnG();
    }

    @Override // X.InterfaceC32370Cn8
    public final boolean LIZIZ() {
        return LiveGiftByteVC1OptResourceSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC32370Cn8
    public final List<String> LIZJ() {
        if (LiveGiftDegradation264ResourceSetting.INSTANCE.enableDegradation264()) {
            return C47261Igj.LJJIJIIJI("h264", "480p");
        }
        return C47261Igj.LJJIJIIJI("h264", "bytevc1opt", "480p", "480p_bvc1", "lowfps", "lowfps_bvc1", "crop_bvc1", "trantor_bvc1", "trantor_crop_bvc1");
    }
}
