package X;

import com.ss.android.ugc.aweme.paidcontent.fragments.RatingFragment;

/* renamed from: X.A4a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25628A4a implements InterfaceC25634A4g {
    public final /* synthetic */ RatingFragment LIZ;

    public C25628A4a(RatingFragment ratingFragment) {
        this.LIZ = ratingFragment;
    }

    @Override // X.InterfaceC25634A4g
    public final void LIZ(float f) {
        RatingFragment ratingFragment = this.LIZ;
        ratingFragment.LJLJLJ = (int) f;
        SY4 sy4 = ratingFragment.LJLJI;
        if (sy4 == null) {
            return;
        }
        sy4.setEnabled(true);
    }
}
