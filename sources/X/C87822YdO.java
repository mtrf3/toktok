package X;

import Y.ARunnableS52S0100000_16;
import Y.AUListenerS103S0100000_16;
import android.animation.ValueAnimator;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.YdO, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87822YdO extends AbstractC87817YdJ {
    @Override // X.AbstractC87817YdJ
    public final void LJ(C31521CYr textInfo) {
        String LJIILIIL;
        float f;
        o.LJIIIZ(textInfo, "textInfo");
        int i = textInfo.LIZ.LIZLLL.rankSettlementCountdown;
        String str = "";
        if (i >= 86400) {
            String LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_Weekly_refresh");
            if (LIZ != null) {
                str = LIZ;
            }
            long j = ((r3.rankSettlementCountdown * 1000) + 499) / 1000;
            long j2 = 86400;
            long j3 = j / j2;
            long j4 = j % j2;
            long j5 = 3600;
            LJIILIIL = Q8U.LIZIZ(new Object[]{Long.valueOf(j3), Long.valueOf(j4 / j5), Long.valueOf((j4 % j5) / 60)}, 3, str, "format(format, *args)");
        } else if (i >= 3600) {
            long j6 = ((i * 1000) + 499) / 1000;
            long j7 = 3600;
            long j8 = j6 / j7;
            long j9 = j6 % j7;
            long j10 = 60;
            LJIILIIL = C15380j0.LJIILL(R.string.kqc, C15380j0.LJIILJJIL(R.string.mdv), C15380j0.LJIILL(R.string.koc, Long.valueOf(j8), Long.valueOf(j9 / j10), Long.valueOf(j9 % j10)));
            o.LJIIIIZZ(LJIILIIL, "getString(R.string.pm_da…hours, minutes, seconds))");
        } else {
            String LIZ2 = C86881Y7x.LIZIZ().LIZ("pm_mt_hourly_refresh");
            if (LIZ2 != null) {
                str = LIZ2;
            }
            LJIILIIL = LJIILIIL(r3.rankSettlementCountdown * 1000, str);
        }
        int i2 = this.LIZIZ.LJI;
        RankTypeV2 rankTypeV2 = textInfo.LIZ.LIZLLL;
        long j11 = rankTypeV2.rankSettlementCountdown * 1000;
        long j12 = rankTypeV2.rankSettlementCountdownDuration * 1000;
        this.LIZ.setRadius(0.0f);
        float height = this.LIZ.getHeight();
        float f2 = height * (-1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f2);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
        ofFloat.addUpdateListener(new AUListenerS103S0100000_16(this, 9));
        ofFloat.start();
        this.LJII.setVisibility(0);
        this.LJII.setTranslationY(height);
        this.LJII.setCardBackgroundColor(i2);
        this.LJIIIZ.setVisibility(8);
        this.LJIIJ.setText(LJIILIIL);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(height, 0.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, 1.0f));
        ofFloat2.addUpdateListener(new AUListenerS103S0100000_16(this, 10));
        ofFloat2.start();
        if (o.LJ(textInfo.LIZ.LIZIZ, RankTypeV2.LIZ)) {
            C87818YdK c87818YdK = this.LIZIZ;
            ARunnableS52S0100000_16 aRunnableS52S0100000_16 = new ARunnableS52S0100000_16(this, 4);
            Runnable runnable = c87818YdK.LJIILLIIL;
            if (runnable != null) {
                c87818YdK.LJIILL.removeCallbacks(runnable);
            }
            c87818YdK.LJIILL.postDelayed(aRunnableS52S0100000_16, j11);
            c87818YdK.LJIILLIIL = aRunnableS52S0100000_16;
            CountDownTimerC77998UjK countDownTimerC77998UjK = new CountDownTimerC77998UjK(j12);
            f = 1.0f;
            countDownTimerC77998UjK.LIZ = new C87831YdX(j11, j12, this);
            countDownTimerC77998UjK.start();
        } else {
            f = 1.0f;
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, height);
        ofFloat3.setDuration(300L);
        ofFloat3.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, f));
        ofFloat3.addUpdateListener(new AUListenerS103S0100000_16(this, 11));
        long j13 = j12 + 300;
        ofFloat3.setStartDelay(j13);
        ofFloat3.start();
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f2, 0.0f);
        ofFloat4.setDuration(300L);
        ofFloat4.setInterpolator(C18950ol.LIZIZ(0.01f, -0.0f, 0.18f, f));
        ofFloat4.addUpdateListener(new AUListenerS103S0100000_16(this, 12));
        ofFloat4.addListener(new C87821YdN(textInfo, this, i2));
        ofFloat4.setStartDelay(j13);
        ofFloat4.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87822YdO(CardView contentView, C87818YdK dataHolder) {
        super(contentView, dataHolder);
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(dataHolder, "dataHolder");
    }

    public static String LJIILIIL(long j, String str) {
        long j2 = ((j + 499) / 1000) % 3600;
        long j3 = 60;
        return Q8U.LIZIZ(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2, str, "format(format, *args)");
    }
}
