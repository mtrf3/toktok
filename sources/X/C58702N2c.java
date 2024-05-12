package X;

import com.ss.android.ugc.aweme.social.experiment.FollowingListFreqParams;

/* renamed from: X.N2c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58702N2c extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58702N2c LJLIL = new C58702N2c();

    public C58702N2c() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        C58701N2b.LIZ.getClass();
        if (((FollowingListFreqParams) C58701N2b.LIZJ.getValue()).group == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
