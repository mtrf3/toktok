package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenAnimConfigSetting;

/* renamed from: X.MyA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58534MyA extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58534MyA LJLIL = new C58534MyA();

    public C58534MyA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(LivePublicScreenAnimConfigSetting.INSTANCE.getValue());
    }
}
