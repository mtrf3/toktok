package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLowCapFpsSetting;

/* renamed from: X.MxA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58472MxA extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58472MxA LJLIL = new C58472MxA();

    public C58472MxA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LinkMicLowCapFpsSetting.INSTANCE.getValue());
    }
}
