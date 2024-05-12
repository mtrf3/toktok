package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveAlphaGroupAnimOptSetting;

/* renamed from: X.1tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47671tz extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C47671tz LJLIL = new C47671tz();

    public C47671tz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveAlphaGroupAnimOptSetting.INSTANCE.getValue());
    }
}
