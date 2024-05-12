package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterNewAcademySetting;

/* renamed from: X.Ba7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29015Ba7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29015Ba7 LJLIL = new C29015Ba7();

    public C29015Ba7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveCenterNewAcademySetting.INSTANCE.isNewAcademy());
    }
}
