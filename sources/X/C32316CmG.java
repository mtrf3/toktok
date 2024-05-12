package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.LiveLimitedTimeDiscountGiftInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveDiscountGiftPriceHide;
import com.bytedance.android.livesdk.model.Gift;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.CmG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32316CmG extends FrameLayout implements InterfaceC76931UHf {
    public final C32334CmY LJLIL;
    public final C47121t6 LJLILLLLZI;

    @Override // X.InterfaceC76931UHf
    public final boolean LJIL(int i) {
        return true;
    }

    @Override // X.InterfaceC76931UHf
    public final boolean LJJLIL() {
        return false;
    }

    public final void LIZ() {
        int i;
        int i2;
        String text;
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
        Gift LJI = c32313CmD.LJI();
        if (LJI != null) {
            i = LJI.diamondCount;
        } else {
            i = 0;
        }
        GiftsInfo giftsInfo = c32313CmD.LJ;
        if (giftsInfo != null && (liveLimitedTimeDiscountGiftInfo = giftsInfo.firstRechargeGiftInfo) != null) {
            i2 = liveLimitedTimeDiscountGiftInfo.remainTimes;
        } else {
            i2 = 0;
        }
        if (LiveDiscountGiftPriceHide.INSTANCE.newUi()) {
            text = C15380j0.LJIIIIZZ(R.plurals.jy, i2, Integer.valueOf(i2));
        } else {
            text = C15380j0.LJIIIIZZ(R.plurals.l6, i2, Integer.valueOf(i), Integer.valueOf(i2));
        }
        String valueOf = String.valueOf(i2);
        o.LJIIIIZZ(text, "text");
        int LJJLIIJ = s.LJJLIIJ(text, valueOf, 6);
        spannableStringBuilder.append((CharSequence) text);
        if (LJJLIIJ >= 0 && valueOf.length() + LJJLIIJ <= text.length()) {
            C23010vJ.LJFF(spannableStringBuilder, LJJLIIJ, valueOf.length() + LJJLIIJ, 33, 600);
        }
        this.LJLILLLLZI.setText(spannableStringBuilder);
        this.LJLILLLLZI.setHorizontalFadingEdgeEnabled(true);
        this.LJLILLLLZI.setWillNotDraw(false);
        C32173Cjx.LIZ(this.LJLILLLLZI);
        this.LJLIL.LIZIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32316CmG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.dov, this);
        View findViewById = findViewById(R.id.text);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.text)");
        this.LJLILLLLZI = (C47121t6) findViewById;
        View findViewById2 = findViewById(R.id.l7t);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.time_count_down)");
        C32334CmY c32334CmY = (C32334CmY) findViewById2;
        this.LJLIL = c32334CmY;
        C47121t6 timer = c32334CmY.getTimer();
        if (timer != null) {
            C23010vJ.LIZLLL(timer, 6, 600);
            timer.setTextColor(C15380j0.LIZIZ(R.color.be));
            timer.getLayoutParams().width = (int) C87277YNd.LJIIJ(60);
            timer.getLayoutParams().height = (int) C87277YNd.LJIIJ(20);
            timer.requestLayout();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i == 0) {
            LIZ();
        }
    }
}
