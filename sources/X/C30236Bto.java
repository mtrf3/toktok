package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastToolbarLimitCountSetting;

/* renamed from: X.Bto, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30236Bto extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C30236Bto LJLIL = new C30236Bto();

    public C30236Bto() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(LiveBroadcastToolbarLimitCountSetting.INSTANCE.getValue());
    }
}
