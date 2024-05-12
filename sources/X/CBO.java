package X;

import com.bytedance.android.livesdk.livesetting.watchlive.FollowGuidVoidSetting;

/* loaded from: classes6.dex */
public final class CBO extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final CBO LJLIL = new CBO();

    public CBO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(FollowGuidVoidSetting.INSTANCE.getValue());
    }
}
