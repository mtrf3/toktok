package X;

import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadIntervalSettings;

/* loaded from: classes10.dex */
public final class LAG extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final LAG LJLIL = new LAG();

    public LAG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(FriendsTabPreloadIntervalSettings.INSTANCE.getValue());
    }
}
