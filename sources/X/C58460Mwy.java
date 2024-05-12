package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkMicAlogUploadSetting;

/* renamed from: X.Mwy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58460Mwy extends AbstractC65781Prl implements InterfaceC65784Pro<C31040CGe> {
    public static final C58460Mwy LJLIL = new C58460Mwy();

    public C58460Mwy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C31040CGe invoke() {
        return new C31040CGe(LiveLinkMicAlogUploadSetting.INSTANCE.getSettingValue().uploadThreshold, 1L);
    }
}
