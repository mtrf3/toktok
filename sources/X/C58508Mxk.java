package X;

import com.bytedance.android.livesdk.livesetting.linkmic.CoHostRtcAllowedSetting;

/* renamed from: X.Mxk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58508Mxk extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58508Mxk LJLIL = new C58508Mxk();

    public C58508Mxk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(CoHostRtcAllowedSetting.INSTANCE.getValue());
    }
}
