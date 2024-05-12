package X;

import com.bytedance.android.livesdk.livesetting.linkmic.CoHostEffectDowngradingSetting;

/* renamed from: X.MxX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58495MxX extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58495MxX LJLIL = new C58495MxX();

    public C58495MxX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(CoHostEffectDowngradingSetting.INSTANCE.getValue());
    }
}
