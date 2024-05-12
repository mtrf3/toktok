package X;

import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.LiveLimitedTimeDiscountGiftInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.CmY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32334CmY extends FrameLayout {
    public final C47121t6 LJLIL;
    public final Handler LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final ARunnableS41S0100000_5 LJLJJL;

    public final void LIZIZ() {
        long j;
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo;
        GiftsInfo giftsInfo = AbstractC32320CmK.LIZ.LJ;
        if (giftsInfo != null && (liveLimitedTimeDiscountGiftInfo = giftsInfo.firstRechargeGiftInfo) != null) {
            j = liveLimitedTimeDiscountGiftInfo.expireTime;
        } else {
            j = 0;
        }
        setTimeText(j - (C30725C4b.LIZ() / 1000));
        this.LJLILLLLZI.removeCallbacks(this.LJLJJL);
        this.LJLILLLLZI.postDelayed(this.LJLJJL, 1000L);
    }

    public final C47121t6 getTimer() {
        return this.LJLIL;
    }

    public final String LIZ(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / this.LJLJJI;
        String valueOf = String.valueOf(j2);
        if (valueOf.length() <= 1) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(valueOf);
        sb.append(":");
        long j3 = (j - (this.LJLJJI * j2)) / this.LJLJI;
        String valueOf2 = String.valueOf(j3);
        if (valueOf2.length() <= 1) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(valueOf2);
        sb.append(":");
        String valueOf3 = String.valueOf((j - (j2 * this.LJLJJI)) - (j3 * this.LJLJI));
        if (valueOf3.length() <= 1) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        return C0EH.LIZJ(sb, valueOf3, "stringBuilder.toString()");
    }

    public final void setTimeText(long j) {
        if (j <= 0) {
            C47121t6 c47121t6 = this.LJLIL;
            if (c47121t6 == null) {
                return;
            }
            c47121t6.setText(LIZ(0L));
            return;
        }
        C47121t6 c47121t62 = this.LJLIL;
        if (c47121t62 == null) {
            return;
        }
        c47121t62.setText(LIZ(j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32334CmY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
        this.LJLJI = 60;
        this.LJLJJI = 3600;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dju, this, true);
        C47121t6 c47121t6 = (C47121t6) findViewById(R.id.l89);
        this.LJLIL = c47121t6;
        if (c47121t6 != null) {
            c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        }
        this.LJLJJL = new ARunnableS41S0100000_5(this, 151);
    }
}
