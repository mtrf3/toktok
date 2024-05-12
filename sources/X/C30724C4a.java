package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsGuestSetting;

/* renamed from: X.C4a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30724C4a extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30724C4a LJLIL = new C30724C4a();

    public C30724C4a() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(MultiGuestV3ChangeFpsGuestSetting.INSTANCE.getValue());
    }
}
