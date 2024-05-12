package X;

import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.FeedCountStickerDialogFragment;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Xp9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86003Xp9 extends FrameLayout {
    public static final /* synthetic */ int LJLLJ = 0;
    public final TextView LJLIL;
    public CountDownStickerStruct LJLILLLLZI;
    public LinearLayout LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final C141805hQ LJLJL;
    public final C141805hQ LJLJLJ;
    public final C141805hQ LJLJLLL;
    public FeedCountStickerDialogFragment LJLL;
    public ScheduledExecutorService LJLLI;
    public ScheduledFuture<?> LJLLILLLL;

    public final void LIZIZ() {
        long j;
        FeedCountStickerDialogFragment feedCountStickerDialogFragment;
        CountDownStickerStruct countDownStickerStruct = this.LJLILLLLZI;
        if (countDownStickerStruct != null) {
            j = countDownStickerStruct.getMillSecond();
        } else {
            j = 0;
        }
        if (j > System.currentTimeMillis()) {
            LIZJ();
            return;
        }
        FeedCountStickerDialogFragment feedCountStickerDialogFragment2 = this.LJLL;
        if (feedCountStickerDialogFragment2 != null && feedCountStickerDialogFragment2.isVisible() && (feedCountStickerDialogFragment = this.LJLL) != null) {
            feedCountStickerDialogFragment.Dl(C86011XpH.LIZ, false);
        }
        ScheduledFuture<?> scheduledFuture = this.LJLLILLLL;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
    }

    public final void LIZJ() {
        long j;
        Long valueOf;
        CountDownStickerStruct countDownStickerStruct = this.LJLILLLLZI;
        if (countDownStickerStruct != null && (valueOf = Long.valueOf(countDownStickerStruct.getMillSecond())) != null) {
            j = valueOf.longValue() - System.currentTimeMillis();
        } else {
            j = 0;
        }
        int i = (int) (j / 86400000);
        long j2 = j % 86400000;
        int i2 = (int) (j2 / 3600000);
        long j3 = j2 % 3600000;
        int i3 = (int) (j3 / 60000);
        int i4 = (int) ((j3 % 60000) / 1000);
        if (i >= 1) {
            LIZ(C86012XpI.LIZ);
            C141805hQ c141805hQ = this.LJLJL;
            if (c141805hQ != null) {
                c141805hQ.LIZ(i / 10, i % 10);
            }
            C141805hQ c141805hQ2 = this.LJLJLJ;
            if (c141805hQ2 != null) {
                c141805hQ2.LIZ(i2 / 10, i2 % 10);
            }
            C141805hQ c141805hQ3 = this.LJLJLLL;
            if (c141805hQ3 != null) {
                c141805hQ3.LIZ(i3 / 10, i3 % 10);
                return;
            }
            return;
        }
        LIZ(C86013XpJ.LIZ);
        C141805hQ c141805hQ4 = this.LJLJL;
        if (c141805hQ4 != null) {
            c141805hQ4.LIZ(i2 / 10, i2 % 10);
        }
        C141805hQ c141805hQ5 = this.LJLJLJ;
        if (c141805hQ5 != null) {
            c141805hQ5.LIZ(i3 / 10, i3 % 10);
        }
        C141805hQ c141805hQ6 = this.LJLJLLL;
        if (c141805hQ6 == null) {
            return;
        }
        c141805hQ6.LIZ(i4 / 10, i4 % 10);
    }

    private final long getCurrentTimeStamp() {
        return System.currentTimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ScheduledFuture<?> scheduledFuture = this.LJLLILLLL;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final LinearLayout getStickerView() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86003Xp9(Context context) {
        super(context);
        a1.LJFF(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dso, this, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) LLLLIILL;
        this.LJLJI = linearLayout;
        linearLayout.findViewById(R.id.m3k);
        this.LJLIL = (TextView) this.LJLJI.findViewById(R.id.mak);
        this.LJLJJI = (TextView) this.LJLJI.findViewById(R.id.foy);
        this.LJLJJL = (TextView) this.LJLJI.findViewById(R.id.gjd);
        this.LJLJJLL = (TextView) this.LJLJI.findViewById(R.id.j2k);
        this.LJLJL = (C141805hQ) this.LJLJI.findViewById(R.id.bwa);
        this.LJLJLJ = (C141805hQ) this.LJLJI.findViewById(R.id.bwb);
        this.LJLJLLL = (C141805hQ) this.LJLJI.findViewById(R.id.bwc);
        TuxTextView tuxTextView = (TuxTextView) this.LJLJI.findViewById(R.id.mi6);
        if (tuxTextView != null) {
            tuxTextView.LJJJ(37.0f);
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.LJLJI.findViewById(R.id.m_q);
        if (tuxTextView2 != null) {
            tuxTextView2.LJJJ(37.0f);
        }
        addView(this.LJLJI);
    }

    public final void LIZ(AbstractC86005XpB abstractC86005XpB) {
        if (o.LJ(abstractC86005XpB, C86012XpI.LIZ)) {
            TextView textView = this.LJLJJI;
            if (textView != null) {
                textView.setText(getResources().getText(R.string.dwu));
            }
            TextView textView2 = this.LJLJJL;
            if (textView2 != null) {
                textView2.setText(getResources().getText(R.string.dx4));
            }
            TextView textView3 = this.LJLJJLL;
            if (textView3 == null) {
                return;
            }
            textView3.setText(getResources().getText(R.string.dx5));
            return;
        }
        if (!o.LJ(abstractC86005XpB, C86013XpJ.LIZ)) {
            return;
        }
        TextView textView4 = this.LJLJJI;
        if (textView4 != null) {
            textView4.setText(getResources().getText(R.string.dx4));
        }
        TextView textView5 = this.LJLJJL;
        if (textView5 != null) {
            textView5.setText(getResources().getText(R.string.dx5));
        }
        TextView textView6 = this.LJLJJLL;
        if (textView6 == null) {
            return;
        }
        textView6.setText(getResources().getText(R.string.dx_));
    }

    public final void setCountDownStickerStruct(CountDownStickerStruct countDownStickerStruct) {
        this.LJLILLLLZI = countDownStickerStruct;
        if (countDownStickerStruct == null) {
            this.LJLILLLLZI = new CountDownStickerStruct(null, 0L, 0L, null, null, null, null, 127, null);
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            o.LJIIIIZZ(calendar, "getInstance(TimeZone.getDefault())");
            calendar.set(2020, 11, 6, 19, 1, 1);
            CountDownStickerStruct countDownStickerStruct2 = this.LJLILLLLZI;
            if (countDownStickerStruct2 != null) {
                countDownStickerStruct2.setExpiredTime(Long.valueOf(calendar.getTimeInMillis() / 1000));
            }
            CountDownStickerStruct countDownStickerStruct3 = this.LJLILLLLZI;
            if (countDownStickerStruct3 != null) {
                countDownStickerStruct3.setSubscribe(Boolean.FALSE);
            }
            CountDownStickerStruct countDownStickerStruct4 = this.LJLILLLLZI;
            if (countDownStickerStruct4 != null) {
                countDownStickerStruct4.setSubscribeNum(500L);
            }
            CountDownStickerStruct countDownStickerStruct5 = this.LJLILLLLZI;
            if (countDownStickerStruct5 != null) {
                countDownStickerStruct5.setTitle("");
            }
            CountDownStickerStruct countDownStickerStruct6 = this.LJLILLLLZI;
            if (countDownStickerStruct6 == null) {
                return;
            }
            countDownStickerStruct6.setTextAlreadyExpired("");
        }
    }

    public final void setData(CountDownStickerStruct countDownStickerStruct) {
        long j;
        ScheduledFuture<?> scheduledFuture;
        if (countDownStickerStruct == null) {
            return;
        }
        this.LJLILLLLZI = countDownStickerStruct;
        TextView textView = this.LJLIL;
        if (textView != null) {
            textView.setText(countDownStickerStruct.getTitle());
        }
        long currentTimeMillis = System.currentTimeMillis();
        CountDownStickerStruct countDownStickerStruct2 = this.LJLILLLLZI;
        if (countDownStickerStruct2 != null) {
            j = countDownStickerStruct2.getMillSecond();
        } else {
            j = 0;
        }
        if (currentTimeMillis <= j) {
            LIZJ();
            if (this.LJLLI == null) {
                this.LJLLI = C38995FSd.LJ();
            }
            ScheduledExecutorService scheduledExecutorService = this.LJLLI;
            if (scheduledExecutorService != null) {
                scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(new ARunnableS51S0100000_15(this, 125), 0L, 1L, TimeUnit.SECONDS);
            } else {
                scheduledFuture = null;
            }
            this.LJLLILLLL = scheduledFuture;
        }
    }

    public final void setFeedCountdownStickerDialogFragment(FeedCountStickerDialogFragment feedCountStickerDialogFragment) {
        this.LJLL = feedCountStickerDialogFragment;
    }

    public final void setStickerView(LinearLayout linearLayout) {
        o.LJIIIZ(linearLayout, "<set-?>");
        this.LJLJI = linearLayout;
    }
}
