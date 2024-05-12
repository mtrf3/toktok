package X;

import Y.ARunnableS52S0100000_16;
import android.graphics.Color;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.YdT, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87827YdT extends AbstractC87817YdJ {
    @Override // X.AbstractC87817YdJ
    public final void LJ(C31521CYr textInfo) {
        long j;
        o.LJIIIZ(textInfo, "textInfo");
        C87818YdK c87818YdK = this.LIZIZ;
        int i = c87818YdK.LJI;
        c87818YdK.LJFF = Color.argb((int) (255 * 0.5f), (i >> 16) & 255, (i >> 8) & 255, i & 255);
        this.LIZJ.setCardBackgroundColor(this.LIZIZ.LJFF);
        C87818YdK c87818YdK2 = this.LIZIZ;
        ARunnableS52S0100000_16 aRunnableS52S0100000_16 = new ARunnableS52S0100000_16(this, 5);
        RankAnimationInfo rankAnimationInfo = textInfo.LJFF;
        if (rankAnimationInfo != null) {
            j = rankAnimationInfo.duration;
        } else {
            j = 5;
        }
        long j2 = j * 1000;
        Runnable runnable = c87818YdK2.LJIILLIIL;
        if (runnable != null) {
            c87818YdK2.LJIILL.removeCallbacks(runnable);
        }
        c87818YdK2.LJIILL.postDelayed(aRunnableS52S0100000_16, j2);
        c87818YdK2.LJIILLIIL = aRunnableS52S0100000_16;
        LJII(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87827YdT(CardView contentView, C87818YdK dataHolder) {
        super(contentView, dataHolder);
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(dataHolder, "dataHolder");
    }
}
