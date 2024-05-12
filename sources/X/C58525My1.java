package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PunishSetting;

/* renamed from: X.My1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58525My1 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58525My1 LJLIL = new C58525My1();

    public C58525My1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(MultiGuestV3PunishSetting.INSTANCE.getValue());
    }
}
