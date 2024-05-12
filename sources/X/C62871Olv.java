package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.donation.detail.DonationFragment;

/* renamed from: X.Olv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62871Olv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ DonationFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62871Olv(DonationFragment donationFragment) {
        super(0);
        this.LJLIL = donationFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("should_dim_bg", false);
        }
        return Boolean.valueOf(z);
    }
}
