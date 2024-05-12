package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBgOptTechSwitchSetting;

/* renamed from: X.Myi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58568Myi extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58568Myi LJLIL = new C58568Myi();

    public C58568Myi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(MultiGuestBgOptTechSwitchSetting.INSTANCE.getValue());
    }
}
