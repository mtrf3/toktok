package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveExtendedScreenFilterTypeSetting;

/* renamed from: X.CHi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31070CHi extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31070CHi LJLIL = new C31070CHi();

    public C31070CHi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (LiveExtendedScreenFilterTypeSetting.INSTANCE.getValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
