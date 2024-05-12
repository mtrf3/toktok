package Y;

import X.C03150Al;
import X.C119774mz;
import X.C16530kr;
import X.C1GE;
import X.C2068389v;
import X.C32151Nz;
import X.C47261Igj;
import X.C71791SFn;
import X.C71792SFo;
import X.C8FR;
import X.InterfaceC65784Pro;
import X.N3B;
import X.O6R;
import X.S09;
import X.SZJ;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ARunnableS11S0210000_12 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C119774mz c119774mz;
        ((C71791SFn) this.l0).LJLILLLLZI.removeAllViews();
        int width = (((C71791SFn) this.l0).LJLILLLLZI.getWidth() - ((C71791SFn) this.l0).LJLILLLLZI.getPaddingStart()) - ((C71791SFn) this.l0).LJLILLLLZI.getPaddingEnd();
        if (this.z2) {
            C71791SFn c71791SFn = (C71791SFn) this.l0;
            List list = (List) this.l1;
            c71791SFn.getClass();
            if (C1GE.LJIILIIL(list) && list != null) {
                boolean z = false;
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C71792SFo LJFF = c71791SFn.LJFF(i, (ActionLinkComponent) obj);
                        if (LJFF != null) {
                            width -= LJFF.LJLILLLLZI;
                            if (width < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C119774mz c119774mz2 = c71791SFn.LJLILLLLZI;
                            if (c119774mz2 != null) {
                                c119774mz2.addView(LJFF.LJLIL);
                            }
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                if (z) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    c2068389v.LIZ = R.raw.icon_chevron_up_small_fill;
                    c2068389v.LJ = Integer.valueOf(R.attr.gx);
                    Context context = c71791SFn.getContext();
                    o.LJIIIIZZ(context, "context");
                    C8FR LIZIZ = c2068389v.LIZIZ(2, context);
                    N3B n3b = N3B.LESS;
                    String string = c71791SFn.getContext().getString(R.string.s3h);
                    o.LJIIIIZZ(string, "context.getString(R.stri…dow_bingAnswerLinks_btn2)");
                    C71792SFo LIZLLL = c71791SFn.LIZLLL(n3b, C71791SFn.LIZJ(string, LIZIZ), new AqS143S0200000_12(c71791SFn, (C71791SFn) list, (List<ActionLinkComponent>) 122));
                    if (LIZLLL != null && (c119774mz = c71791SFn.LJLILLLLZI) != null) {
                        c119774mz.addView(LIZLLL.LJLIL);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ((C71791SFn) this.l0).LIZIZ(width, (List) this.l1);
    }

    public final void LIZ$1() {
        boolean z;
        int i;
        int i2;
        View anchor_pre_title = ((S09) this.l0).LIZ(R.id.a3f);
        o.LJIIIIZZ(anchor_pre_title, "anchor_pre_title");
        if (anchor_pre_title.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = (TextView) ((S09) this.l0).LIZ(R.id.a4n);
            int maxWidth = textView.getMaxWidth();
            int measuredWidth = ((S09) this.l0).LIZ(R.id.a3f).getMeasuredWidth();
            View anchor_pre_title2 = ((S09) this.l0).LIZ(R.id.a3f);
            o.LJIIIIZZ(anchor_pre_title2, "anchor_pre_title");
            ViewGroup.LayoutParams layoutParams = anchor_pre_title2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                i = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                i = 0;
            }
            int measuredWidth2 = ((S09) this.l0).LIZ(R.id.a4o).getMeasuredWidth() + measuredWidth + i;
            View anchor_title_div = ((S09) this.l0).LIZ(R.id.a4o);
            o.LJIIIIZZ(anchor_title_div, "anchor_title_div");
            ViewGroup.LayoutParams layoutParams2 = anchor_title_div.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                i2 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams2);
            } else {
                i2 = 0;
            }
            textView.setMaxWidth(maxWidth - (measuredWidth2 + i2));
        }
        View anchor_suffix = ((S09) this.l0).LIZ(R.id.a45);
        o.LJIIIIZZ(anchor_suffix, "anchor_suffix");
        if (anchor_suffix.getVisibility() == 0) {
            TextView textView2 = (TextView) ((S09) this.l0).LIZ(R.id.a4n);
            textView2.setMaxWidth(textView2.getMaxWidth() - (((S09) this.l0).LIZ(R.id.a28).getMeasuredWidth() + ((S09) this.l0).LIZ(R.id.a45).getMeasuredWidth()));
        }
        View anchor_buy_button = ((S09) this.l0).LIZ(R.id.a1y);
        o.LJIIIIZZ(anchor_buy_button, "anchor_buy_button");
        if (anchor_buy_button.getVisibility() == 0 || this.z2) {
            TextView textView3 = (TextView) ((S09) this.l0).LIZ(R.id.a4n);
            textView3.setMaxWidth(textView3.getMaxWidth() - ((S09) this.l0).LJLJI);
        }
        ((TextView) ((S09) this.l0).LIZ(R.id.a4n)).setEllipsize(TextUtils.TruncateAt.END);
        ((InterfaceC65784Pro) this.l1).invoke();
    }

    public static final void run$0(ARunnableS11S0210000_12 aRunnableS11S0210000_12) {
        boolean LIZ;
        try {
            ((SZJ) aRunnableS11S0210000_12.l0).LIZ((C03150Al) aRunnableS11S0210000_12.l1, aRunnableS11S0210000_12.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS11S0210000_12 aRunnableS11S0210000_12) {
        boolean LIZ;
        try {
            ((C03150Al) aRunnableS11S0210000_12.l0).LIZIZ(((SZJ) aRunnableS11S0210000_12.l1).LIZIZ);
            if (aRunnableS11S0210000_12.z2) {
                ((SZJ) aRunnableS11S0210000_12.l1).LJ.invoke();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS11S0210000_12 aRunnableS11S0210000_12) {
        boolean LIZ;
        try {
            aRunnableS11S0210000_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS11S0210000_12 aRunnableS11S0210000_12) {
        boolean LIZ;
        try {
            aRunnableS11S0210000_12.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS11S0210000_12(X.C03150Al r2, X.SZJ r3, boolean r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.z2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.z2 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S0210000_12.<init>(X.0Al, X.SZJ, boolean, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS11S0210000_12(Object obj, C71791SFn c71791SFn, boolean z, List<ActionLinkComponent> list) {
        this.$t = list;
        this.l0 = obj;
        this.z2 = c71791SFn;
        this.l1 = z;
    }
}
