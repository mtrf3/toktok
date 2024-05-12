package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveInviteFriendFreqCtrl;

/* renamed from: X.CEb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30985CEb extends AbstractC65781Prl implements InterfaceC65784Pro<C31040CGe> {
    public static final C30985CEb LJLIL = new C30985CEb();

    public C30985CEb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C31040CGe invoke() {
        MultiLiveInviteFriendFreqCtrl multiLiveInviteFriendFreqCtrl = MultiLiveInviteFriendFreqCtrl.INSTANCE;
        return new C31040CGe(multiLiveInviteFriendFreqCtrl.getValue().roomWindow.allUsersTimeWindow, multiLiveInviteFriendFreqCtrl.getValue().roomWindow.totalMaxTimes);
    }
}
