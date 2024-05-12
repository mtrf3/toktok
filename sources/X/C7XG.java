package X;

import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;

/* renamed from: X.7XG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7XG extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C7XG LJLIL = new C7XG();

    public C7XG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(FriendsTabPreloadTTLSetting.INSTANCE.getValue());
    }
}
