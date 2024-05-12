package X;

import android.os.CountDownTimer;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;

/* renamed from: X.CZj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CountDownTimerC31539CZj extends CountDownTimer {
    public final /* synthetic */ StarCommentPaymentDialog LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        long j2 = j / 1000;
        for (C31540CZk c31540CZk : this.LIZ.LJLJJLL) {
            if (c31540CZk.LIZLLL) {
                c31540CZk.LIZJ = j2;
            }
        }
        StarCommentPaymentDialog starCommentPaymentDialog = this.LIZ;
        C31541CZl c31541CZl = starCommentPaymentDialog.LJLJLJ;
        if (c31541CZl != null) {
            c31541CZl.LJLLLLLL(starCommentPaymentDialog.LJLJJLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC31539CZj(StarCommentPaymentDialog starCommentPaymentDialog, long j) {
        super(j, 1000L);
        this.LIZ = starCommentPaymentDialog;
    }
}
