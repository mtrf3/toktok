package X;

import Y.AObserverS76S0100000_8;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS44S0100000_8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.touchpoint.core.model.InAppPush;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinNewUIStyleViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.KOf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51633KOf extends C51634KOg {
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public int LJZI;
    public int LJZL;

    public final void LJFF() {
        String str;
        InAppPush LJJII = C252019un.LIZ().LJJII();
        if (LJJII != null && (str = LJJII.icon) != null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJJIIJ = getCoinIconView();
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        LIZIZ();
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        int i = this.LJZI;
        int LIZIZ = C7MY.LIZIZ(60);
        this.LJLJLJ = LJJIIZ;
        this.LJLJLLL = i;
        this.LJLL = LIZIZ;
        post(new ARunnableS44S0100000_8(this, 166));
    }

    private final ValueAnimator getCircleAnimator() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-circleAnimator>(...)");
        return (ValueAnimator) value;
    }

    private final SmartImageView getCoinIconView() {
        Object value = this.LJLLLL.getValue();
        o.LJIIIIZZ(value, "<get-coinIconView>(...)");
        return (SmartImageView) value;
    }

    private final SearchCoinNewUIStyleViewModel getNewCoinViewModel() {
        return (SearchCoinNewUIStyleViewModel) this.LJZ.getValue();
    }

    private final FrameLayout getProgressLayout() {
        Object value = this.LJLZ.getValue();
        o.LJIIIIZZ(value, "<get-progressLayout>(...)");
        return (FrameLayout) value;
    }

    private final TuxTextView getTextView() {
        Object value = this.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-textView>(...)");
        return (TuxTextView) value;
    }

    public final View getLayout() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-layout>(...)");
        return (View) value;
    }

    public final C173726ro getProgressBarTimerView() {
        Object value = this.LJLLLLLL.getValue();
        o.LJIIIIZZ(value, "<get-progressBarTimerView>(...)");
        return (C173726ro) value;
    }

    public final void LIZLLL() {
        if (getCircleAnimator().isStarted()) {
            getCircleAnimator().cancel();
        }
        LIZ();
        setVisibility(4);
    }

    public final void LJI() {
        if (getCircleAnimator().isStarted()) {
            getCircleAnimator().cancel();
        }
        getCircleAnimator().start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51633KOf(ActivityC45651qj context) {
        super(context, null, 0);
        int i;
        LiveData liveData;
        LiveData liveData2;
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, LinkMicRtcMixBitrateSetting.DEFAULT));
        this.LJLLJ = C221108m2.LIZIZ(new AqS151S0200000_4(context, this, 47));
        this.LJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 639));
        this.LJLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 635));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 637));
        this.LJLZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 638));
        this.LJZ = C221108m2.LIZIZ(new AqS158S0100000_8(context, 636));
        setVisibility(4);
        Integer LJI = C79045V0n.LJI(R.attr.lu, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        FrameLayout progressLayout = getProgressLayout();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(2);
        gradientDrawable.setShape(1);
        gradientDrawable.setColors(new int[]{i, i});
        progressLayout.setBackground(gradientDrawable);
        C48956JJg.LIZ(getTextView(), 8.0f);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            SearchCoinNewUIStyleViewModel newCoinViewModel = getNewCoinViewModel();
            if (newCoinViewModel != null && (liveData2 = (LiveData) newCoinViewModel.LJLIL.getValue()) != null) {
                liveData2.observe(LJJIFFI, new AObserverS76S0100000_8(this, 122));
            }
            SearchCoinNewUIStyleViewModel newCoinViewModel2 = getNewCoinViewModel();
            if (newCoinViewModel2 != null && (liveData = (LiveData) newCoinViewModel2.LJLILLLLZI.getValue()) != null) {
                liveData.observe(LJJIFFI, new AObserverS76S0100000_8(this, 123));
            }
        }
    }

    public final void LJ(int i) {
        Context context = getContext();
        if (context != null) {
            getTextView().setText(C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i)}, 1, Locale.US, C29822Bn8.LIZ(context, R.string.qbi, "it.resources.getString(R…kBR_fyp_coinWidget_label)"), "format(locale, format, *args)"));
        }
    }

    public final void setLayoutPosition(View viewpager) {
        o.LJIIIZ(viewpager, "viewpager");
        viewpager.post(new ARunnableS27S0200000_8(this, viewpager, 85));
    }
}
