package X;

import com.ss.android.ugc.aweme.social.experiment.FollowingListFreqParams;

/* renamed from: X.N2a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58700N2a extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58700N2a LJLIL = new C58700N2a();

    public C58700N2a() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        C58701N2b.LIZ.getClass();
        boolean z = true;
        if (((FollowingListFreqParams) C58701N2b.LIZJ.getValue()).group != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
