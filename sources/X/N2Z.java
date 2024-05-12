package X;

import com.ss.android.ugc.aweme.social.experiment.FollowingListFreqParams;

/* loaded from: classes11.dex */
public final class N2Z extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final N2Z LJLIL = new N2Z();

    public N2Z() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        C58701N2b.LIZ.getClass();
        boolean z = true;
        if (((FollowingListFreqParams) C58701N2b.LIZJ.getValue()).group <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
