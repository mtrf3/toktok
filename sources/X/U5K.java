package X;

import Y.ARunnableS17S0101000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDAListenerS80S0100000_13;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.BattleTaskGuideTipShowChannel;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U5K extends FrameLayout implements InterfaceC76525U1p {
    public boolean LJLIL;
    public C47061t0 LJLILLLLZI;
    public C47061t0 LJLJI;
    public C2A8 LJLJJI;
    public C2A8 LJLJJL;
    public HorizontalScrollView LJLJJLL;
    public LinearLayout LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public ARunnableS17S0101000_13 LJLL;
    public ARunnableS49S0100000_13 LJLLI;
    public ValueAnimator LJLLILLLL;
    public BattleTaskGiftAmountGuide LJLLJ;
    public DataChannel LJLLL;
    public final boolean LJLLLL;
    public long LJLLLLLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Integer num;
        DataChannel dataChannel;
        this.LJLIL = false;
        super.onDetachedFromWindow();
        removeCallbacks(this.LJLL);
        removeCallbacks(this.LJLLI);
        ValueAnimator valueAnimator = this.LJLLILLLL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        this.LJLL = null;
        this.LJLLI = null;
        this.LJLLILLLL = null;
        this.LJLLJ = null;
        DataChannel dataChannel2 = this.LJLLL;
        if (dataChannel2 != null && (num = (Integer) dataChannel2.kv0(BattleTaskGuideTipShowChannel.class)) != null && num.intValue() > 0 && (dataChannel = this.LJLLL) != null) {
            dataChannel.rv0(BattleTaskGuideTipShowChannel.class, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLIL = true;
        setAlpha(0.0f);
        findViewById(R.id.l1f);
        this.LJLILLLLZI = (C47061t0) findViewById(R.id.fb4);
        this.LJLJI = (C47061t0) findViewById(R.id.fb3);
        this.LJLJJLL = (HorizontalScrollView) findViewById(R.id.jco);
        this.LJLJJI = (C2A8) findViewById(R.id.mn1);
        this.LJLJJL = (C2A8) findViewById(R.id.mn0);
        this.LJLJL = (LinearLayout) findViewById(R.id.g6i);
        this.LJLJLJ = findViewById(R.id.n__);
        this.LJLJLLL = findViewById(R.id.n_a);
        if (this.LJLLLL) {
            C2A8 c2a8 = this.LJLJJL;
            if (c2a8 == null) {
                return;
            }
            c2a8.setVisibility(0);
            return;
        }
        C2A8 c2a82 = this.LJLJJL;
        if (c2a82 == null) {
            return;
        }
        c2a82.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5K(Context context) {
        super(context, null, 0);
        int i;
        new LinkedHashMap();
        this.LJLLLL = true;
        this.LJLLLLLL = 5000L;
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.H0;
        Long showTimes = c48459J0d.LIZJ();
        o.LJIIIIZZ(showTimes, "showTimes");
        boolean z = showTimes.longValue() < 3;
        this.LJLLLL = z;
        LayoutInflater LLZIL = C16880lQ.LLZIL(context);
        if (z) {
            i = R.layout.d_w;
        } else {
            i = R.layout.d_x;
        }
        C16880lQ.LLLLIILL(LLZIL, i, this, true);
        if (showTimes.longValue() <= 3) {
            c48459J0d.LIZ(Long.valueOf(showTimes.longValue() + 1));
        }
    }

    @Override // X.InterfaceC76525U1p
    public final void LIZ(BattleTaskGiftAmountGuide battleTaskGiftAmountGuide, DataChannel dataChannel) {
        BattlePrompt battlePrompt;
        Boolean bool;
        BattlePrompt battlePrompt2;
        long j;
        ImageModel imageModel;
        Integer valueOf;
        int i;
        this.LJLLJ = battleTaskGiftAmountGuide;
        ImageModel imageModel2 = null;
        if (battleTaskGiftAmountGuide != null) {
            battlePrompt = battleTaskGiftAmountGuide.guidePrompt;
        } else {
            battlePrompt = null;
        }
        if (battlePrompt == null) {
            setVisibility(8);
            return;
        }
        if (dataChannel != null) {
            bool = Boolean.valueOf(C29306Beo.LJIIJ(dataChannel));
        } else {
            bool = null;
        }
        if (C29306Beo.LJIL(bool)) {
            return;
        }
        this.LJLLL = dataChannel;
        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide2 = this.LJLLJ;
        if (battleTaskGiftAmountGuide2 != null) {
            battlePrompt2 = battleTaskGiftAmountGuide2.guidePrompt;
        } else {
            battlePrompt2 = null;
        }
        SpannableStringBuilder LIZIZ = C76799UCd.LIZIZ(battlePrompt2);
        if (ujb.o.LJJJJJL(LIZIZ)) {
            setVisibility(8);
            return;
        }
        DataChannel dataChannel2 = this.LJLLL;
        if (dataChannel2 != null) {
            if (this.LJLLLL) {
                i = 1;
            } else {
                i = 2;
            }
            dataChannel2.rv0(BattleTaskGuideTipShowChannel.class, Integer.valueOf(i));
        }
        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide3 = this.LJLLJ;
        if (battleTaskGiftAmountGuide3 != null && Integer.valueOf(battleTaskGiftAmountGuide3.disappearDuration) != null) {
            BattleTaskGiftAmountGuide battleTaskGiftAmountGuide4 = this.LJLLJ;
            if (battleTaskGiftAmountGuide4 != null && (valueOf = Integer.valueOf(battleTaskGiftAmountGuide4.disappearDuration)) != null) {
                j = valueOf.longValue() * 1000;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (this.LJLLLL) {
            j = 8000;
        } else {
            j = 5000;
        }
        this.LJLLLLLL = j;
        C2A8 c2a8 = this.LJLJJI;
        if (c2a8 != null) {
            c2a8.setText(LIZIZ);
        }
        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide5 = this.LJLLJ;
        if (battleTaskGiftAmountGuide5 != null) {
            imageModel2 = battleTaskGiftAmountGuide5.iconImage;
        }
        if (imageModel2 == null) {
            C47061t0 c47061t0 = this.LJLILLLLZI;
            if (c47061t0 != null) {
                c47061t0.setVisibility(4);
            }
        } else {
            C47061t0 c47061t02 = this.LJLILLLLZI;
            if (c47061t02 != null) {
                c47061t02.setVisibility(0);
            }
            C15650jR.LIZ().LJIIIZ(imageModel2).LJIIJJI(this.LJLILLLLZI);
        }
        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide6 = this.LJLLJ;
        if (battleTaskGiftAmountGuide6 == null || (imageModel = battleTaskGiftAmountGuide6.giftImage) == null) {
            C47061t0 c47061t03 = this.LJLJI;
            if (c47061t03 != null) {
                c47061t03.setVisibility(8);
            }
        } else {
            C47061t0 c47061t04 = this.LJLJI;
            if (c47061t04 != null) {
                c47061t04.setVisibility(0);
            }
            C15650jR.LIZ().LJIIIZ(imageModel).LJIIJJI(this.LJLJI);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<U5K, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new IDAListenerS80S0100000_13(this, 8));
        ofFloat.start();
    }
}
