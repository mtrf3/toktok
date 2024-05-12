package kotlin.jvm.internal;

import X.AbstractC55082Lja;
import X.AbstractC65781Prl;
import X.C26338AVi;
import X.C32151Nz;
import X.C51102K3u;
import X.C76800UCe;
import X.C7MY;
import X.C8FR;
import X.C90193gN;
import X.InterfaceC88472Yns;
import X.KUB;
import X.O6R;
import X.SY9;
import X.T59;
import X.X1D;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import ujb.s;

/* loaded from: classes9.dex */
public class AqS57S0201000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS57S0201000_8 aqS57S0201000_8, Object obj) {
        int LIZIZ;
        CharSequence spannable = (CharSequence) obj;
        o.LJIIIZ(spannable, "spannable");
        int lineCount = ((TextView) aqS57S0201000_8.l0).getLineCount() - 1;
        if (lineCount > 0) {
            if (C51102K3u.LIZIZ(((TextView) aqS57S0201000_8.l0).getLayout().getLineStart(lineCount), ((TextView) aqS57S0201000_8.l0).getLayout().getLineEnd(lineCount), spannable).length() != 0 && !(!ujb.o.LJJJJJL(r1))) {
                int i = lineCount - 1;
                String LIZIZ2 = C51102K3u.LIZIZ(((TextView) aqS57S0201000_8.l0).getLayout().getLineStart(i), ((TextView) aqS57S0201000_8.l0).getLayout().getLineEnd(i), spannable);
                String charSequence = s.LJZI(C51102K3u.LIZIZ(s.LJJLIIJ(LIZIZ2, " ", 6) + 1, LIZIZ2.length(), LIZIZ2)).toString();
                int LJJLIIJ = s.LJJLIIJ(spannable, charSequence, 6);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                TextView textView = (TextView) aqS57S0201000_8.l0;
                Drawable drawable = (Drawable) aqS57S0201000_8.l1;
                int i2 = aqS57S0201000_8.i2;
                spannableStringBuilder.append((CharSequence) C51102K3u.LIZIZ(0, LJJLIIJ, spannable));
                spannableStringBuilder.append((CharSequence) "\n");
                spannableStringBuilder.append((CharSequence) charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                int length = spannableStringBuilder.length() - 2;
                int length2 = spannableStringBuilder.length() - 1;
                boolean LIZLLL = C26338AVi.LIZLLL(textView);
                T59 t59 = new T59(drawable);
                if (LIZLLL) {
                    LIZIZ = -O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i2)));
                } else {
                    LIZIZ = C7MY.LIZIZ(i2);
                }
                t59.LJLIL = LIZIZ;
                spannableStringBuilder.setSpan(t59, length, length2, 18);
                C51102K3u.LIZJ((TextView) aqS57S0201000_8.l0, spannableStringBuilder);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS57S0201000_8 aqS57S0201000_8, Object obj) {
        String str;
        AbstractC55082Lja abstractFeedAdapter;
        Aweme item;
        KUB it = (KUB) obj;
        o.LJIIIZ(it, "it");
        Aweme aweme = (Aweme) aqS57S0201000_8.l0;
        String str2 = null;
        if (aweme != null) {
            String[] strArr = (String[]) it.LJFF.getValue();
            if (strArr != null) {
                System.arraycopy(strArr, 1, strArr, 0, strArr.length - 1);
                Object[] objArr = (Object[]) it.LJFF.getValue();
                if (objArr != null) {
                    int length = strArr.length - 1;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("aid:");
                    LIZ.append(aweme.getAid());
                    objArr[length] = X1D.LIZIZ(LIZ);
                }
            }
            LogPbBean logPbBean = aweme.getLogPbBean();
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            it.LIZJ = str;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) ((RootPanelComponent) aqS57S0201000_8.l1).LJLJJL.getValue();
        if (iFeedPanelPlatformAbility != null && (abstractFeedAdapter = iFeedPanelPlatformAbility.getAbstractFeedAdapter()) != null && (item = abstractFeedAdapter.getItem(aqS57S0201000_8.i2 + 1)) != null) {
            str2 = item.getAid();
        }
        it.LJ = str2;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS57S0201000_8 aqS57S0201000_8, Object obj) {
        Layout layout;
        SpannableStringBuilder spannable = (SpannableStringBuilder) obj;
        o.LJIIIZ(spannable, "spannable");
        int lineCount = ((TextView) aqS57S0201000_8.l0).getLineCount() - 1;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(spannable);
        if (lineCount > 0 && (layout = ((TextView) aqS57S0201000_8.l0).getLayout()) != null) {
            TextView textView = (TextView) aqS57S0201000_8.l0;
            Drawable drawable = (Drawable) aqS57S0201000_8.l1;
            int i = aqS57S0201000_8.i2;
            String LIZIZ = C51102K3u.LIZIZ(layout.getLineStart(lineCount), layout.getLineEnd(lineCount), spannable);
            if (LIZIZ.length() != 0) {
                if (LIZIZ.length() <= 2) {
                    CharSequence subSequence = valueOf.subSequence(0, spannable.length() - 2);
                    o.LJII(subSequence, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                    textView.setText(subSequence);
                } else {
                    int length = valueOf.length() - 2;
                    int length2 = valueOf.length() - 1;
                    C8FR c8fr = new C8FR(drawable, 2);
                    C8FR.LIZJ(c8fr, C90193gN.LIZIZ(textView.getContext()), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i))), 0, 4);
                    valueOf.setSpan(c8fr, length, length2, 18);
                    textView.setText(valueOf);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS57S0201000_8 aqS57S0201000_8, Object obj) {
        Layout layout;
        SpannableStringBuilder spannable = (SpannableStringBuilder) obj;
        o.LJIIIZ(spannable, "spannable");
        int lineCount = ((TextView) aqS57S0201000_8.l0).getLineCount() - 1;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(spannable);
        if (lineCount > 0 && (layout = ((TextView) aqS57S0201000_8.l0).getLayout()) != null) {
            TextView textView = (TextView) aqS57S0201000_8.l0;
            Drawable drawable = (Drawable) aqS57S0201000_8.l1;
            int i = aqS57S0201000_8.i2;
            String LIZIZ = C51102K3u.LIZIZ(layout.getLineStart(lineCount), layout.getLineEnd(lineCount), spannable);
            if (LIZIZ.length() != 0) {
                if (LIZIZ.length() <= 2) {
                    CharSequence subSequence = valueOf.subSequence(0, spannable.length() - 2);
                    o.LJII(subSequence, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                    textView.setText(subSequence);
                } else {
                    int length = valueOf.length() - 2;
                    int length2 = valueOf.length() - 1;
                    T59 t59 = new T59(drawable);
                    t59.LJLIL = C7MY.LIZIZ(i);
                    valueOf.setSpan(t59, length, length2, 18);
                    textView.setText(valueOf);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0201000_8(TextView textView, Drawable drawable, int i) {
        super(1);
        this.$t = i;
        this.l0 = textView;
        this.l1 = drawable;
        this.i2 = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0201000_8(TextView textView, SY9 sy9, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = textView;
        this.l1 = sy9;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0201000_8(TextView textView, Drawable drawable, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = textView;
        this.l1 = drawable;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS57S0201000_8(Aweme aweme, RootPanelComponent rootPanelComponent, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.l1 = rootPanelComponent;
        this.i2 = i;
    }
}
