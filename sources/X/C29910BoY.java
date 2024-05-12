package X;

import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentProtectSetting;

/* renamed from: X.BoY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29910BoY extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29910BoY LJLIL = new C29910BoY();

    public C29910BoY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        LiveStarCommentProtectSetting.INSTANCE.getSettingValue();
        return Boolean.TRUE;
    }
}
