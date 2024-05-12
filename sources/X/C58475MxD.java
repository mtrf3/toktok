package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3RtcAllowedSetting;

/* renamed from: X.MxD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58475MxD extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58475MxD LJLIL = new C58475MxD();

    public C58475MxD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(MultiGuestV3RtcAllowedSetting.INSTANCE.getValue());
    }
}
