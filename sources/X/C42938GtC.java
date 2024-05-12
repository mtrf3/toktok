package X;

import Y.ACListenerS27S0100000_7;
import Y.AUListenerS95S0100000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS31S0001000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GtC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42938GtC extends AbstractC42900Gsa {
    public final View LJLIL;
    public final AI8 LJLILLLLZI;
    public final LinearLayout LJLJI;
    public final LinearLayout LJLJJI;
    public final TuxIconView LJLJJL;
    public final View LJLJJLL;
    public final TuxTextView LJLJL;
    public final TextView LJLJLJ;
    public final View LJLJLLL;
    public final C62822Ol8 LJLL;
    public int LJLLI;

    private final IAVPublishService getPublishService() {
        return (IAVPublishService) this.LJLL.getValue();
    }

    @Override // X.AbstractC42900Gsa
    public final void LIZ() {
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.LJLLI = 0;
    }

    @Override // X.AbstractC42900Gsa
    public final void LIZIZ() {
        AI8 ai8 = this.LJLILLLLZI;
        if (ai8 == null) {
            return;
        }
        ai8.setShowAlertBadge(false);
    }

    @Override // X.AbstractC42900Gsa
    public final void LIZJ() {
        KL2.LJIILLIIL(8, this.LJLJL);
    }

    @Override // X.AbstractC42900Gsa
    public final void LIZLLL() {
        AI8 ai8 = this.LJLILLLLZI;
        if (ai8 != null) {
            ai8.setCellEnabled(false);
        }
        AI8 ai82 = this.LJLILLLLZI;
        if (ai82 == null) {
            return;
        }
        ai82.setAlpha(0.4f);
    }

    @Override // X.AbstractC42900Gsa
    public final void LJFF() {
        AI8 ai8 = this.LJLILLLLZI;
        if (ai8 == null) {
            return;
        }
        ai8.setShowAlertBadge(true);
    }

    @Override // X.AbstractC42900Gsa
    public final void LJII() {
        AI8 ai8 = this.LJLILLLLZI;
        if (ai8 != null) {
            ai8.setCellEnabled(true);
        }
        AI8 ai82 = this.LJLILLLLZI;
        if (ai82 != null) {
            ai82.setAlpha(1.0f);
        }
        AI8 ai83 = this.LJLILLLLZI;
        if (ai83 != null) {
            ai83.setVisibility(0);
        }
        View view = this.LJLJJLL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.AbstractC42900Gsa
    public ViewGroup getAnchorListContent() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC42900Gsa
    public TuxIconView getRightIcon() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42938GtC(Context context) {
        super(context);
        AI9 ai9;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        AIF aif;
        AIF aif2;
        new LinkedHashMap();
        this.LJLL = C221108m2.LIZIZ(C42933Gt7.LJLIL);
        this.LJLIL = C16880lQ.LLLZIIL(R.layout.bdm, C16880lQ.LLZIL(context), this);
        AI8 ai8 = (AI8) findViewById(R.id.i57);
        this.LJLILLLLZI = ai8;
        if (ai8 != null) {
            ai8.setIcon(new AqS171S0100000_5(this, 700));
        }
        if (getPublishService().isEnablePutSettingsIntoMoreOption() && ai8 != null) {
            T5R t5r = new T5R(context.getString(R.string.e1a));
            t5r.LIZ(42);
            ai8.setTitle(t5r);
        }
        if (ai8 != null) {
            ai9 = ai8.getAccessory();
        } else {
            ai9 = null;
        }
        if ((ai9 instanceof AIF) && (aif2 = (AIF) ai9) != null) {
            aif2.LJIILL(false);
        }
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bdo, C16880lQ.LLZIL(context), null);
        this.LJLJLLL = LLLZIIL;
        if (LLLZIIL != null) {
            tuxIconView = (TuxIconView) LLLZIIL.findViewById(R.id.ec1);
        } else {
            tuxIconView = null;
        }
        this.LJLJJL = tuxIconView;
        if (LLLZIIL != null) {
            tuxTextView = (TuxTextView) LLLZIIL.findViewById(R.id.lte);
        } else {
            tuxTextView = null;
        }
        this.LJLJL = tuxTextView;
        AI9 accessory = ai8 != null ? ai8.getAccessory() : null;
        if ((accessory instanceof AIF) && (aif = (AIF) accessory) != null) {
            aif.LJIIL(LLLZIIL);
        }
        this.LJLJI = (LinearLayout) findViewById(R.id.i4s);
        this.LJLJJI = (LinearLayout) findViewById(R.id.buo);
        this.LJLJJLL = findViewById(R.id.cvu);
        this.LJLJLJ = (TextView) findViewById(R.id.i4v);
    }

    @Override // X.AbstractC42900Gsa
    public final void LJI(boolean z) {
        String str;
        ViewGroup.LayoutParams layoutParams;
        CharSequence text;
        KL2.LJIILLIIL(0, this.LJLJL);
        TuxTextView tuxTextView = this.LJLJL;
        if (tuxTextView != null) {
            tuxTextView.setText(getContext().getText(R.string.f5p));
        }
        if (!z) {
            return;
        }
        try {
            Paint paint = new Paint();
            paint.setTextSize(KL2.LIZJ(getContext(), 15.0f));
            TextView textView = this.LJLJLJ;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TuxTextView tuxTextView2 = this.LJLJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(8);
            }
            TextView textView2 = this.LJLJLJ;
            if (textView2 != null) {
                textView2.setText(getContext().getText(R.string.f5p));
            }
            TuxTextView tuxTextView3 = this.LJLJL;
            if (tuxTextView3 == null || (text = tuxTextView3.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            float measureText = paint.measureText(str);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(measureText, 0.0f);
            ofFloat.setDuration(1000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            TextView textView3 = this.LJLJLJ;
            if (textView3 != null) {
                textView3.setTextColor(getResources().getColor(R.color.c7));
            }
            TextView textView4 = this.LJLJLJ;
            RelativeLayout.LayoutParams layoutParams2 = null;
            if (textView4 != null) {
                layoutParams = textView4.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams) != null) {
                layoutParams2.width = (int) measureText;
                layoutParams2.addRule(21, -1);
                layoutParams2.setMarginEnd((int) KL2.LIZJ(getContext(), 32.0f));
            }
            TextView textView5 = this.LJLJLJ;
            if (textView5 != null) {
                textView5.setLayoutParams(layoutParams2);
            }
            ofFloat.addUpdateListener(new AUListenerS95S0100000_7(this, 5));
            ofFloat.start();
        } catch (Exception unused) {
        }
    }

    @Override // X.AbstractC42900Gsa
    public final void LJIIIIZZ(int i) {
        TuxIconView tuxIconView;
        int i2;
        if (getPublishService().isEnableCombineCDS() || getPublishService().isEnablePutSettingsIntoMoreOption() || (tuxIconView = this.LJLJJL) == null) {
            return;
        }
        if (i >= 10) {
            i2 = R.attr.gp;
        } else {
            i2 = R.attr.eb;
        }
        tuxIconView.setTintColorRes(i2);
    }

    @Override // X.AbstractC42900Gsa
    public void setLeftIcon(int i) {
        AI8 ai8 = this.LJLILLLLZI;
        if (ai8 != null) {
            ai8.setIcon(new AqS31S0001000_7(i, 7));
        }
    }

    @Override // X.AbstractC42900Gsa
    public void setOnAddClickListener(InterfaceC88472Yns<? super View, C76800UCe> listener) {
        AIF aif;
        o.LJIIIZ(listener, "listener");
        AI8 ai8 = this.LJLILLLLZI;
        AI9 ai9 = null;
        if (ai8 != null) {
            ai9 = ai8.getAccessory();
        }
        if ((ai9 instanceof AIF) && (aif = (AIF) ai9) != null) {
            aif.LJIILJJIL(new ACListenerS27S0100000_7((InterfaceC88472Yns) listener, 115));
        }
    }

    @Override // X.AbstractC42900Gsa
    public void setRightIcon(C2068389v icon) {
        o.LJIIIZ(icon, "icon");
        TuxIconView tuxIconView = this.LJLJJL;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(icon);
        }
    }

    @Override // X.AbstractC42900Gsa
    public void setLeftIcon(C2068389v icon) {
        o.LJIIIZ(icon, "icon");
        AI8 ai8 = this.LJLILLLLZI;
        if (ai8 != null) {
            ai8.setIcon(icon);
        }
    }

    public static void LJIIIZ(View view, Number number, Number number2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!o.LJ(number, -1)) {
            layoutParams.width = number.intValue();
        }
        if (!o.LJ(number2, -1)) {
            layoutParams.height = number2.intValue();
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (r8 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ce, code lost:
    
        if (r2 == null) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b8  */
    @Override // X.AbstractC42900Gsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.base.model.UrlModel r18, java.lang.String r19, boolean r20, kotlin.jvm.internal.AqS111S0300000_7 r21, kotlin.jvm.internal.AqS154S0200000_7 r22) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42938GtC.LJ(com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, boolean, kotlin.jvm.internal.AqS111S0300000_7, kotlin.jvm.internal.AqS154S0200000_7):void");
    }
}
