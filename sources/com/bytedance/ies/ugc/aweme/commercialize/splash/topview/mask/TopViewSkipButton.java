package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import X.AnonymousClass064;
import X.C221108m2;
import X.C5H3;
import X.C60051NhX;
import X.C61384O7g;
import X.C67981Qm9;
import X.C90193gN;
import X.EnumC221088m0;
import X.IW3;
import X.IW4;
import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TopViewSkipButton extends ConstraintLayout implements IW4 {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public final IW3 LJLJJLL;
    public PthreadTimer LJLJL;
    public AwemeSplashInfo.SkipInfo LJLJLJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopViewSkipButton(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopViewSkipButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    private final TextView getButtonUi() {
        return (TextView) this.LJLIL.getValue();
    }

    private final View getButtonUnClick() {
        return (View) this.LJLJI.getValue();
    }

    public final void LJJLJLI() {
        AwemeSplashInfo.SkipInfo skipInfo = this.LJLJLJ;
        if (skipInfo != null && skipInfo.isCountdown_enable() && this.LJLJJL != 0) {
            if (C90193gN.LIZIZ(getContext())) {
                TextView buttonUi = getButtonUi();
                Object[] objArr = new Object[3];
                String str = this.LJLJJI;
                if (str != null) {
                    objArr[0] = str;
                    objArr[1] = Integer.valueOf(this.LJLJJL);
                    objArr[2] = skipInfo.getCountdownUnit();
                    C67981Qm9.LIZIZ(objArr, 3, "%s %s%s", "format(format, *args)", buttonUi);
                    return;
                }
                o.LJIJI("buttonText");
                throw null;
            }
            TextView buttonUi2 = getButtonUi();
            Object[] objArr2 = new Object[3];
            objArr2[0] = Integer.valueOf(this.LJLJJL);
            objArr2[1] = skipInfo.getCountdownUnit();
            String str2 = this.LJLJJI;
            if (str2 != null) {
                objArr2[2] = str2;
                C67981Qm9.LIZIZ(objArr2, 3, "%s%s %s", "format(format, *args)", buttonUi2);
            } else {
                o.LJIJI("buttonText");
                throw null;
            }
        }
    }

    public final View getButtonHot() {
        return (View) this.LJLILLLLZI.getValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        String string = getContext().getString(R.string.rio);
        o.LJIIIIZZ(string, "context.getString(R.string.splash_skip)");
        this.LJLJJI = string;
    }

    private final void setCountDownTime(int i) {
        int i2 = this.LJLJJL;
        if (i2 != 0) {
            if (i < i2) {
                this.LJLJJL = i;
                return;
            }
            return;
        }
        this.LJLJJL = i;
    }

    public final void LJJLL(long j) {
        setCountDownTime((int) (j / 1000));
        if (this.LJLJL == null) {
            LJJLJLI();
            PthreadTimer pthreadTimer = new PthreadTimer("TopViewSkipButton");
            this.LJLJL = pthreadTimer;
            pthreadTimer.scheduleAtFixedRate(new C60051NhX(this), (j % 1000) + 1000, 1000L);
        }
    }

    @Override // X.IW4
    public final void handleMsg(Message message) {
        if (message != null && message.what == 1) {
            setCountDownTime(this.LJLJJL - 1);
            LJJLJLI();
            if (this.LJLJJL == 0) {
                PthreadTimer pthreadTimer = this.LJLJL;
                if (pthreadTimer != null) {
                    pthreadTimer.cancel();
                }
                this.LJLJL = null;
            }
        }
    }

    public final void LJJZ(Context context, AwemeSplashInfo.SkipInfo skipInfo) {
        o.LJIIIZ(context, "context");
        this.LJLJLJ = skipInfo;
        String text = skipInfo.getText();
        if (text != null && text.length() != 0) {
            String text2 = skipInfo.getText();
            o.LJIIIIZZ(text2, "info.text");
            this.LJLJJI = text2;
        }
        TextView buttonUi = getButtonUi();
        String str = this.LJLJJI;
        if (str != null) {
            buttonUi.setText(str);
            int buttonExtraStyle = skipInfo.getButtonExtraStyle();
            if (buttonExtraStyle == 1 || buttonExtraStyle == 3) {
                getButtonUnClick().setVisibility(0);
                final int LIZIZ = (int) C61384O7g.LIZIZ(getContext(), skipInfo.getHeightExtraSize());
                final int LIZIZ2 = (int) C61384O7g.LIZIZ(getContext(), skipInfo.getWidthExtraSize());
                getButtonHot().post(new Runnable() { // from class: X.94u
                    public final void LIZ() {
                        ViewGroup.LayoutParams layoutParams = TopViewSkipButton.this.getButtonHot().getLayoutParams();
                        layoutParams.width = (LIZIZ * 2) + TopViewSkipButton.this.getButtonHot().getWidth();
                        layoutParams.height = (LIZIZ2 * 2) + TopViewSkipButton.this.getButtonHot().getHeight();
                        TopViewSkipButton.this.getButtonHot().setLayoutParams(layoutParams);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
            if (C90193gN.LIZIZ(getContext()) && buttonExtraStyle != 2 && buttonExtraStyle != 3) {
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(this);
                anonymousClass064.LJI(getButtonUi().getId(), 2);
                anonymousClass064.LJIIIZ(getButtonUi().getId(), 1, 0, 1, 10);
                if (getButtonUnClick().getVisibility() == 0) {
                    anonymousClass064.LJI(getButtonUnClick().getId(), 2);
                    anonymousClass064.LJI(getButtonUnClick().getId(), 1);
                    anonymousClass064.LJIIIIZZ(getButtonUnClick().getId(), 2, getButtonUi().getId(), 2);
                    anonymousClass064.LJIIIIZZ(getButtonUnClick().getId(), 1, 0, 1);
                }
                anonymousClass064.LIZIZ(this);
                return;
            }
            return;
        }
        o.LJIJI("buttonText");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopViewSkipButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLIL = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10(this, 51));
        this.LJLILLLLZI = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10(this, 50));
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10(this, 52));
        this.LJLJJLL = new IW3(this);
    }

    public /* synthetic */ TopViewSkipButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
