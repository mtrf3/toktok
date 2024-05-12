package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.donation.detail.DonationFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Olu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62870Olu extends ClickableSpan {
    public final /* synthetic */ DonationFragment LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View p0) {
        o.LJIIIZ(p0, "p0");
        DonationFragment donationFragment = this.LJLIL;
        donationFragment.Hl(this.LJLILLLLZI, donationFragment.getEnterFrom());
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(this.LJLJI);
    }

    public C62870Olu(DonationFragment donationFragment, String str, int i) {
        this.LJLIL = donationFragment;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }
}
