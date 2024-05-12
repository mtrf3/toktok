package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.model.LiveBeautyParam;

/* renamed from: X.C4j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30733C4j extends AbstractC65781Prl implements InterfaceC65784Pro<LiveBeautyParam> {
    public static final C30733C4j LJLIL = new C30733C4j();

    public C30733C4j() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.model.LiveBeautyParam, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveBeautyParam invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveBeautyParamSetting.class);
        if (valueSafely == 0) {
            return LiveBeautyParamSetting.DEFAULT;
        }
        return valueSafely;
    }
}
