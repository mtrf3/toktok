package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEffectDowngradingSetting;

/* renamed from: X.MxZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58497MxZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58497MxZ LJLIL = new C58497MxZ();

    public C58497MxZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(MultiGuestEffectDowngradingSetting.INSTANCE.getValue());
    }
}
