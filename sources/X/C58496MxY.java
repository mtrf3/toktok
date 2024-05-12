package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAckMessageSetting;

/* renamed from: X.MxY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58496MxY extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58496MxY LJLIL = new C58496MxY();

    public C58496MxY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(MultiGuestAckMessageSetting.INSTANCE.getValue());
    }
}
