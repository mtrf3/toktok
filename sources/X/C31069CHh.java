package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveExtendedScreenFilterTypeSetting;

/* renamed from: X.CHh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31069CHh extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31069CHh LJLIL = new C31069CHh();

    public C31069CHh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (LiveExtendedScreenFilterTypeSetting.INSTANCE.getValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
