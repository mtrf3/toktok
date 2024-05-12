package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveExtendedScreenFilterTypeSetting;

/* renamed from: X.CHg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31068CHg extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31068CHg LJLIL = new C31068CHg();

    public C31068CHg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (LiveExtendedScreenFilterTypeSetting.INSTANCE.getValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
