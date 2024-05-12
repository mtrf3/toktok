package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeCapResSetting;

/* renamed from: X.MxC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58474MxC extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58474MxC LJLIL = new C58474MxC();

    public C58474MxC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(MultiGuestV3ChangeCapResSetting.INSTANCE.getValue());
    }
}
