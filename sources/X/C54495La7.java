package X;

import com.ss.android.ugc.aweme.experiment.FollowFeedCombineOptimizeExpObject;
import defpackage.e1;

/* renamed from: X.La7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54495La7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C54495La7 LJLIL = new C54495La7();

    public C54495La7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (e1.LIZ(31744, "follow_feed_combine_opt_exp", true, false) != FollowFeedCombineOptimizeExpObject.INSTANCE.getV1()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
