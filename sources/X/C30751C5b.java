package X;

import com.bytedance.android.livesdk.livesetting.other.InboxSkylightLiveStyleSetting;

/* renamed from: X.C5b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30751C5b extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C30751C5b LJLIL = new C30751C5b();

    public C30751C5b() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(InboxSkylightLiveStyleSetting.INSTANCE.getValue());
    }
}
