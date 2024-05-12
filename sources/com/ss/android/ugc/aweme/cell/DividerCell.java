package com.ss.android.ugc.aweme.cell;

import X.AEB;
import X.C110614Vt;
import X.C16880lQ;
import X.C1DI;
import X.C32151Nz;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DividerCell extends BaseCell<AEB> {
    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View L(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.u_, viewGroup, false, "from(parent.context)\n   …ider_cell, parent, false)");
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(AEB t) {
        int i;
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        boolean z = t.LJLJLLL;
        Integer valueOf = Integer.valueOf(R.attr.ci);
        if (z) {
            View findViewById = this.itemView.findViewById(R.id.am8);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = valueOf;
                c110614Vt.LJIIJ = Float.valueOf(C32151Nz.LJIIZILJ(4));
                c110614Vt.LJIIJJI = Float.valueOf(C32151Nz.LJIIZILJ(4));
                Context context = findViewById.getContext();
                o.LJIIIIZZ(context, "it.context");
                findViewById.setBackground(c110614Vt.LIZ(context));
            }
        } else {
            View findViewById2 = this.itemView.findViewById(R.id.am8);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        Integer num = t.LJLLLLLL;
        if (num != null) {
            this.itemView.setBackgroundColor(num.intValue());
        }
        Integer num2 = t.LJLLLL;
        if (num2 != null) {
            this.itemView.findViewById(R.id.wq).getLayoutParams().height = num2.intValue();
            this.itemView.findViewById(R.id.wq).setVisibility(0);
        } else {
            this.itemView.findViewById(R.id.wq).setVisibility(8);
        }
        View findViewById3 = this.itemView.findViewById(R.id.ebs);
        if (findViewById3 != null) {
            View.OnClickListener onClickListener = t.LJLZ;
            if (onClickListener != null) {
                C16880lQ.LJIIJ(onClickListener, findViewById3);
                findViewById3.setVisibility(0);
            } else {
                findViewById3.setVisibility(8);
            }
        }
        View findViewById4 = this.itemView.findViewById(R.id.l3r);
        if (findViewById4 != null) {
            if (t.LJZ) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById4.setVisibility(i);
        }
        View findViewById5 = this.itemView.findViewById(R.id.frt);
        if (findViewById5 != null) {
            if (t.LJLJJLL) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById5.setVisibility(i2);
        }
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.text);
        if (tuxTextView != null) {
            if (t.LJLJJL.length() == 0) {
                tuxTextView.setVisibility(8);
            } else {
                tuxTextView.setVisibility(0);
                Integer num3 = t.LJLLJ;
                if (num3 != null) {
                    i4 = num3.intValue();
                } else {
                    i4 = 62;
                }
                tuxTextView.setTuxFont(i4);
                tuxTextView.setText(t.LJLJJL);
            }
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        if (textView != null) {
            CharSequence charSequence = t.LJLLI;
            if (charSequence == null || charSequence.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(t.LJLLI);
            }
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.kp8);
        if (tuxTextView2 != null) {
            tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            CharSequence charSequence2 = t.LJLLILLLL;
            if (charSequence2 == null || charSequence2.length() == 0) {
                tuxTextView2.setVisibility(8);
            } else {
                tuxTextView2.setVisibility(0);
                Integer num4 = t.LJLLL;
                if (num4 != null) {
                    i3 = num4.intValue();
                } else {
                    i3 = 52;
                }
                tuxTextView2.setTuxFont(i3);
                tuxTextView2.setText(t.LJLLILLLL);
            }
        }
        if (t.LJLL) {
            View findViewById6 = this.itemView.findViewById(R.id.am5);
            if (findViewById6 != null) {
                findViewById6.setVisibility(0);
                C110614Vt c110614Vt2 = new C110614Vt();
                c110614Vt2.LIZIZ = valueOf;
                c110614Vt2.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(4));
                c110614Vt2.LJIIIZ = Float.valueOf(C32151Nz.LJIIZILJ(4));
                Context context2 = findViewById6.getContext();
                o.LJIIIIZZ(context2, "it.context");
                findViewById6.setBackground(c110614Vt2.LIZ(context2));
                return;
            }
            return;
        }
        View findViewById7 = this.itemView.findViewById(R.id.am5);
        if (findViewById7 == null) {
            return;
        }
        findViewById7.setVisibility(8);
    }
}
