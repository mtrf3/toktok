package X;

import Y.ACListenerS34S0300000_8;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchResponse;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import o3.IDaS89S0000000_3;
import o3.h0;

/* loaded from: classes9.dex */
public final class JTZ implements Runnable {
    public final /* synthetic */ JQO LJLIL;
    public final /* synthetic */ JP4 LJLILLLLZI;
    public final /* synthetic */ JQA LJLJI;
    public final /* synthetic */ List<ClickSearchWord> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    public JTZ(JQO jqo, JP4 jp4, JQA jqa, List<ClickSearchWord> list, int i, boolean z) {
        this.LJLIL = jqo;
        this.LJLILLLLZI = jp4;
        this.LJLJI = jqa;
        this.LJLJJI = list;
        this.LJLJJL = i;
        this.LJLJJLL = z;
    }

    public final void LIZ() {
        String str;
        int childCount;
        int i;
        boolean z;
        int i2;
        int i3;
        String str2;
        String str3;
        LinearLayout.LayoutParams layoutParams;
        C50764Jw8<ClickSearchResponse> c50764Jw8;
        ClickSearchResponse clickSearchResponse;
        JQO jqo = this.LJLIL;
        jqo.LJLJLLL = this.LJLILLLLZI;
        jqo.LJLJLJ = this.LJLJI;
        List<ClickSearchWord> list = this.LJLJJI;
        int i4 = this.LJLJJL;
        int width = jqo.getWidth();
        boolean z2 = this.LJLJJLL;
        LinearLayout linearLayout = jqo.LJLJJI;
        if (linearLayout == null) {
            childCount = 0;
        } else {
            String LJFF = C50293JoX.LJFF();
            String LJI = C50293JoX.LJI();
            JP4 jp4 = jqo.LJLJLLL;
            AttributeSet attributeSet = null;
            if (jp4 != null && (c50764Jw8 = jp4.LIZLLL) != null && (clickSearchResponse = c50764Jw8.LIZIZ) != null) {
                str = clickSearchResponse.qrecVirtualEnable;
            } else {
                str = null;
            }
            boolean LJ = o.LJ("1", str);
            if (linearLayout.getChildCount() > 0) {
                linearLayout.removeAllViews();
            }
            int paddingLeft = (width - linearLayout.getPaddingLeft()) - linearLayout.getPaddingRight();
            int i5 = 0;
            for (ClickSearchWord clickSearchWord : ORZ.LLILLL(list, 3)) {
                Context context = jqo.getContext();
                o.LJIIIIZZ(context, "context");
                TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 6, 0);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C49210JTa.LIZIZ);
                layoutParams2.bottomMargin = (int) C78847Ux1.LJJIFFI(8);
                tuxTextView.setLayoutParams(layoutParams2);
                tuxTextView.setMaxLines(2);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setGravity(17);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.da);
                C49098JOs.LIZ.getClass();
                C34474Dfy.LIZ.getClass();
                if (C34474Dfy.LIZ() == 2) {
                    i = 6;
                } else {
                    i = 0;
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf.intValue() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (Boolean.valueOf(z).booleanValue()) {
                    i2 = valueOf.intValue();
                } else {
                    i2 = 8;
                }
                c110614Vt.LIZJ = Float.valueOf(C78847Ux1.LJJIFFI(i2));
                Context context2 = tuxTextView.getContext();
                o.LJIIIIZZ(context2, "context");
                tuxTextView.setBackground(c110614Vt.LIZ(context2));
                int i6 = C49210JTa.LIZ;
                tuxTextView.setPadding(i6, 0, i6, 0);
                Context context3 = tuxTextView.getContext();
                o.LJIIIIZZ(context3, "context");
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context3));
                tuxTextView.setTuxFont(62);
                C7FC.LIZIZ(tuxTextView);
                C16880lQ.LJJJJI(tuxTextView, new ACListenerS34S0300000_8(tuxTextView, clickSearchWord, jqo, 13));
                if (e1.LIZ(31744, "search_related_recom_add_report", true, false)) {
                    tuxTextView.setOnLongClickListener(new ViewOnLongClickListenerC49212JTc(tuxTextView, clickSearchWord, jqo));
                }
                tuxTextView.setText(clickSearchWord.word);
                h0.LJIJI(tuxTextView, new IDaS89S0000000_3(7));
                tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(0, 0));
                if (tuxTextView.getLineCount() > 1) {
                    ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
                    layoutParams3.height = C49210JTa.LIZJ;
                    tuxTextView.setLayoutParams(layoutParams3);
                }
                ViewGroup.LayoutParams layoutParams4 = tuxTextView.getLayoutParams();
                if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams4) != null) {
                    i3 = layoutParams.topMargin + layoutParams.height + layoutParams.bottomMargin;
                } else {
                    i3 = 0;
                }
                int i7 = i3 + i5;
                if (i7 <= i4) {
                    if (LJ) {
                        C50294JoY c50294JoY = (C50294JoY) ((LinkedHashMap) C50293JoX.LIZ).get(LJI + LJFF);
                        if (c50294JoY != null) {
                            String str4 = clickSearchWord.word;
                            if (str4 != null) {
                                c50294JoY.LJIIJJI.add(str4);
                            }
                            c50294JoY.LJIJJ = System.currentTimeMillis();
                        }
                    } else {
                        linearLayout.addView(tuxTextView);
                        JP4 jp42 = jqo.LJLJLLL;
                        if (jp42 != null) {
                            str2 = jp42.LIZJ;
                            str3 = jp42.LIZIZ;
                        } else {
                            str2 = null;
                            str3 = null;
                        }
                        C49604JdQ.LJ(clickSearchWord, str2, str3, jqo.LJLJLJ);
                    }
                    i5 = i7;
                }
                attributeSet = null;
            }
            jqo.LIZIZ();
            if (LJ) {
                jqo.setVisibility(8);
            } else if (jqo.getVisibility() != 0) {
                jqo.setVisibility(0);
                if (z2) {
                    AlphaAnimation LIZIZ = C62850Ola.LIZIZ(0.0f, 1.0f, 300L);
                    View view = jqo.LJLIL;
                    o.LJI(view);
                    view.startAnimation(LIZIZ);
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                    translateAnimation.setDuration(300L);
                    View view2 = jqo.LJLILLLLZI;
                    o.LJI(view2);
                    view2.startAnimation(translateAnimation);
                }
            }
            childCount = linearLayout.getChildCount();
        }
        jqo.LJLJL = childCount;
        int i8 = this.LJLIL.LJLJL;
        JP4 jp43 = this.LJLILLLLZI;
        C49604JdQ.LIZLLL(i8, jp43.LIZJ, jp43.LIZIZ, this.LJLJI);
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
}
