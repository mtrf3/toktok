package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.experiment.IMStickerConsumptionImprSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.2rj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71752rj extends AbstractC65781Prl implements InterfaceC65784Pro<IMStickerConsumptionImprSetting.StickerConsumptionImprSettingModel> {
    public static final C71752rj LJLIL = new C71752rj();

    public C71752rj() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final IMStickerConsumptionImprSetting.StickerConsumptionImprSettingModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        IMStickerConsumptionImprSetting.StickerConsumptionImprSettingModel stickerConsumptionImprSettingModel = IMStickerConsumptionImprSetting.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("tt_im_sticker_consumption_impr_config", IMStickerConsumptionImprSetting.StickerConsumptionImprSettingModel.class, stickerConsumptionImprSettingModel);
        if (LJIIIIZZ == 0) {
            IMStickerConsumptionImprSetting.LIZ.getClass();
        } else {
            stickerConsumptionImprSettingModel = LJIIIIZZ;
        }
        o.LJIIIIZZ(stickerConsumptionImprSettingModel, "SettingsManager.getInsta…         ?: DEFAULT_GROUP");
        return stickerConsumptionImprSettingModel;
    }
}
