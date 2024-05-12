package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeCapResGuestSetting;

/* renamed from: X.MxB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58473MxB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58473MxB LJLIL = new C58473MxB();

    public C58473MxB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(MultiGuestV3ChangeCapResGuestSetting.INSTANCE.getValue());
    }
}
