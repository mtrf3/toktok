package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreloadLinkMicSmallModelSetting;

/* renamed from: X.MxJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58481MxJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58481MxJ LJLIL = new C58481MxJ();

    public C58481MxJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LivePreloadLinkMicSmallModelSetting.INSTANCE.getValue());
    }
}
