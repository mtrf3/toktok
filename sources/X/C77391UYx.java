package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestPageFirstFrameLogSetting;

/* renamed from: X.UYx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77391UYx extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC74940Tb6> {
    public static final C77391UYx LJLIL = new C77391UYx();

    public C77391UYx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC74940Tb6 invoke() {
        if (LinkMicMultiGuestPageFirstFrameLogSetting.INSTANCE.canReport()) {
            return new C77390UYw();
        }
        return new C77392UYy();
    }
}
