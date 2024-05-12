package X;

import Y.ARunnableS17S0101000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDAListenerS80S0100000_13;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS1S0303000_13;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes14.dex */
public final class U5M extends FrameLayout implements InterfaceC76525U1p {
    public boolean LJLIL;
    public C2A8 LJLILLLLZI;
    public C2A8 LJLJI;
    public HorizontalScrollView LJLJJI;
    public LinearLayout LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public ARunnableS17S0101000_13 LJLJLJ;
    public ARunnableS49S0100000_13 LJLJLLL;
    public ValueAnimator LJLL;
    public BattleTaskGiftAmountGuide LJLLI;
    public final boolean LJLLILLLL;
    public long LJLLJ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LJLIL = false;
        super.onDetachedFromWindow();
        removeCallbacks(this.LJLJLJ);
        removeCallbacks(this.LJLJLLL);
        ValueAnimator valueAnimator = this.LJLL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        this.LJLJLJ = null;
        this.LJLJLLL = null;
        this.LJLL = null;
        this.LJLLI = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLIL = true;
        setAlpha(0.0f);
        findViewById(R.id.l1f);
        this.LJLJJI = (HorizontalScrollView) findViewById(R.id.jco);
        this.LJLILLLLZI = (C2A8) findViewById(R.id.mn1);
        this.LJLJI = (C2A8) findViewById(R.id.mn0);
        this.LJLJJL = (LinearLayout) findViewById(R.id.g6i);
        this.LJLJJLL = findViewById(R.id.n__);
        this.LJLJL = findViewById(R.id.n_a);
        if (this.LJLLILLLL) {
            C2A8 c2a8 = this.LJLJI;
            if (c2a8 == null) {
                return;
            }
            c2a8.setVisibility(0);
            return;
        }
        C2A8 c2a82 = this.LJLJI;
        if (c2a82 == null) {
            return;
        }
        c2a82.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5M(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLLILLLL = true;
        this.LJLLJ = 5000L;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dco, this, true);
    }

    @Override // X.InterfaceC76525U1p
    public final void LIZ(BattleTaskGiftAmountGuide battleTaskGiftAmountGuide, DataChannel dataChannel) {
        BattlePrompt battlePrompt;
        Boolean bool;
        String str;
        Text text;
        String str2;
        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide2;
        Text text2;
        long j;
        Integer valueOf;
        ImageModel imageModel;
        String str3;
        String str4;
        Text text3;
        Text text4;
        Text text5;
        this.LJLLI = battleTaskGiftAmountGuide;
        Text text6 = null;
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
        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide3 = this.LJLLI;
        if (battleTaskGiftAmountGuide3 == null || battleTaskGiftAmountGuide3.guideContent == null) {
            setVisibility(8);
            return;
        }
        if (battleTaskGiftAmountGuide3 != null && (text5 = battleTaskGiftAmountGuide3.guideContent) != null) {
            str = text5.key;
        } else {
            str = null;
        }
        if (str != null) {
            C86881Y7x LIZIZ = C86881Y7x.LIZIZ();
            BattleTaskGiftAmountGuide battleTaskGiftAmountGuide4 = this.LJLLI;
            if (battleTaskGiftAmountGuide4 != null && (text4 = battleTaskGiftAmountGuide4.guideContent) != null) {
                str3 = text4.key;
            } else {
                str3 = null;
            }
            if (!TextUtils.isEmpty(LIZIZ.LIZ(str3))) {
                C86881Y7x LIZIZ2 = C86881Y7x.LIZIZ();
                BattleTaskGiftAmountGuide battleTaskGiftAmountGuide5 = this.LJLLI;
                if (battleTaskGiftAmountGuide5 != null && (text3 = battleTaskGiftAmountGuide5.guideContent) != null) {
                    str4 = text3.key;
                } else {
                    str4 = null;
                }
                str2 = LIZIZ2.LIZ(str4);
                o.LJIIIIZZ(str2, "{\n                I18nCe…ntent?.key]\n            }");
                String LJJJJZ = ujb.o.LJJJJZ(str2, "{1:image}", "<1:image>", false);
                battleTaskGiftAmountGuide2 = this.LJLLI;
                if (battleTaskGiftAmountGuide2 == null && (text2 = battleTaskGiftAmountGuide2.guideContent) != null) {
                    Spannable spanString = CXJ.LJI(LJJJJZ, text2, null);
                    o.LJIIIIZZ(spanString, "spanString");
                    int LJJLIIIJL = s.LJJLIIIJL(spanString, "<1:image>", 0, false, 6);
                    if (LJJLIIIJL > 0) {
                        int LIZ = C15380j0.LIZ(16.0f);
                        int i = LJJLIIIJL + 9;
                        ColorDrawable colorDrawable = new ColorDrawable(0);
                        colorDrawable.setBounds(0, 0, LIZ, LIZ);
                        C32207CkV c32207CkV = new C32207CkV(colorDrawable);
                        ((SpannableString) spanString).setSpan(c32207CkV, LJJLIIIJL, i, 33);
                        C2A8 c2a8 = this.LJLILLLLZI;
                        if (c2a8 != null) {
                            c2a8.setText(spanString);
                        }
                        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide6 = this.LJLLI;
                        if (battleTaskGiftAmountGuide6 != null && battleTaskGiftAmountGuide6.giftImage != null) {
                            if (battleTaskGiftAmountGuide6 != null && (imageModel = battleTaskGiftAmountGuide6.giftImage) != null) {
                                ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(imageModel, new U5N(new AqS1S0303000_13(spanString, c32207CkV, LJJLIIIJL, i, this, LIZ, 0)));
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    } else {
                        C2A8 c2a82 = this.LJLILLLLZI;
                        if (c2a82 != null) {
                            BattleTaskGiftAmountGuide battleTaskGiftAmountGuide7 = this.LJLLI;
                            if (battleTaskGiftAmountGuide7 != null) {
                                text6 = battleTaskGiftAmountGuide7.guideContent;
                            }
                            c2a82.setText(CXJ.LJFF(text6, ""));
                        }
                    }
                    BattleTaskGiftAmountGuide battleTaskGiftAmountGuide8 = this.LJLLI;
                    if (battleTaskGiftAmountGuide8 != null && Integer.valueOf(battleTaskGiftAmountGuide8.disappearDuration) != null) {
                        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide9 = this.LJLLI;
                        if (battleTaskGiftAmountGuide9 != null && (valueOf = Integer.valueOf(battleTaskGiftAmountGuide9.disappearDuration)) != null) {
                            j = valueOf.longValue() * 1000;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else if (this.LJLLILLLL) {
                        j = 8000;
                    } else {
                        j = 5000;
                    }
                    this.LJLLJ = j;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<U5M, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setDuration(300L);
                    ofFloat.addListener(new IDAListenerS80S0100000_13(this, 16));
                    ofFloat.start();
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide10 = this.LJLLI;
        if (battleTaskGiftAmountGuide10 != null && (text = battleTaskGiftAmountGuide10.guideContent) != null) {
            str2 = text.defaultPattern;
            o.LJIIIIZZ(str2, "{\n                requir…aultPattern\n            }");
            String LJJJJZ2 = ujb.o.LJJJJZ(str2, "{1:image}", "<1:image>", false);
            battleTaskGiftAmountGuide2 = this.LJLLI;
            if (battleTaskGiftAmountGuide2 == null) {
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
