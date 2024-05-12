package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationDetailFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xc0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85188Xc0 implements R47 {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ TwoStepVerificationDetailFragment LIZIZ;

    public C85188Xc0(boolean z, TwoStepVerificationDetailFragment twoStepVerificationDetailFragment) {
        this.LIZ = z;
        this.LIZIZ = twoStepVerificationDetailFragment;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        TwoStepVerificationDetailFragment twoStepVerificationDetailFragment;
        int i3;
        if (i2 == 1) {
            if (this.LIZ) {
                twoStepVerificationDetailFragment = this.LIZIZ;
                i3 = R.id.aff;
            } else {
                twoStepVerificationDetailFragment = this.LIZIZ;
                i3 = R.id.c5m;
            }
            ((AI8) twoStepVerificationDetailFragment._$_findCachedViewById(i3)).setTitle(R41.LIZJ().getEmail());
        }
    }
}
