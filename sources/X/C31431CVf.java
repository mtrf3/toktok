package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGameFloatMsgPanelConfigSetting;

/* renamed from: X.CVf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31431CVf extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C31431CVf LJLIL = new C31431CVf();

    public C31431CVf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(LiveGameFloatMsgPanelConfigSetting.INSTANCE.getValue().showMaxSize);
    }
}
