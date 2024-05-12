package X;

import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagFeatureAnchorSetting;

/* loaded from: classes6.dex */
public final class BR5 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BR5 LJLIL = new BR5();

    public BR5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(GoodyBagFeatureAnchorSetting.INSTANCE.getValue());
    }
}
