package X;

import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagFeatureAudienceSetting;

/* loaded from: classes6.dex */
public final class BR6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BR6 LJLIL = new BR6();

    public BR6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(GoodyBagFeatureAudienceSetting.INSTANCE.getValue());
    }
}
