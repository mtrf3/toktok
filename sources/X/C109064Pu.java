package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Pu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109064Pu {
    public static C109354Qx LIZ(ViewGroup parent, SharePanelViewModel viewModel, boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
        int i4;
        View LIZIZ;
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        if ((i3 & 16) != 0) {
            z3 = false;
        }
        if ((i3 & 32) != 0) {
            i = C7MY.LIZIZ(64);
        }
        if ((i3 & 64) != 0) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        if ((i3 & 128) != 0) {
            i2 = R.attr.gu;
        }
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewModel, "viewModel");
        if (z2) {
            LIZIZ = C1FL.LIZIZ(parent, R.layout.b6i, parent, false, "from(parent.context).inf…_vertical, parent, false)");
        } else {
            LIZIZ = C1FL.LIZIZ(parent, R.layout.b6h, parent, false, "from(parent.context).inf…em_upvote, parent, false)");
            if (z) {
                LIZIZ.getLayoutParams().width = C7MY.LIZIZ(62);
                View findViewById = LIZIZ.findViewById(R.id.mv6);
                if (findViewById != null) {
                    ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = C7MY.LIZIZ(8);
                    findViewById.setLayoutParams(layoutParams2);
                    ((TuxTextView) findViewById).setTextColorRes(i2);
                }
            } else {
                if (C115464g2.LIZ()) {
                    View findViewById2 = LIZIZ.findViewById(R.id.mv5);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                    TuxIconView tuxIconView = (TuxIconView) LIZIZ.findViewById(R.id.mt9);
                    if (tuxIconView != null) {
                        tuxIconView.setVisibility(0);
                        if (z3) {
                            int dimensionPixelOffset = parent.getResources().getDimensionPixelOffset(R.dimen.v0);
                            ViewGroup.LayoutParams layoutParams3 = tuxIconView.getLayoutParams();
                            layoutParams3.width = dimensionPixelOffset;
                            layoutParams3.height = dimensionPixelOffset;
                            tuxIconView.setLayoutParams(layoutParams3);
                            C110614Vt c110614Vt = new C110614Vt();
                            c110614Vt.LIZJ = C61328O5c.LIZJ(20);
                            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
                            Context context = LIZIZ.getContext();
                            o.LJIIIIZZ(context, "itemView.context");
                            tuxIconView.setBackground(c110614Vt.LIZ(context));
                            tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
                            tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
                        } else {
                            C110614Vt c110614Vt2 = new C110614Vt();
                            c110614Vt2.LIZJ = C61328O5c.LIZJ(24);
                            c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cf);
                            Context context2 = LIZIZ.getContext();
                            o.LJIIIIZZ(context2, "itemView.context");
                            tuxIconView.setBackground(c110614Vt2.LIZ(context2));
                        }
                    }
                } else if (z3) {
                    int dimensionPixelOffset2 = parent.getResources().getDimensionPixelOffset(R.dimen.v0);
                    LIZIZ.getLayoutParams().width = i;
                    View findViewById3 = LIZIZ.findViewById(R.id.mv5);
                    if (findViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = findViewById3.getLayoutParams();
                        if (layoutParams4 != null) {
                            layoutParams4.height = dimensionPixelOffset2;
                        }
                        ViewGroup.LayoutParams layoutParams5 = findViewById3.getLayoutParams();
                        if (layoutParams5 != null) {
                            layoutParams5.width = dimensionPixelOffset2;
                        }
                    }
                }
                TextView textView = (TextView) LIZIZ.findViewById(R.id.mv6);
                if (textView != null) {
                    textView.setMaxLines(i4);
                    ((TuxTextView) textView).setTextColorRes(i2);
                }
            }
        }
        return new C109354Qx(LIZIZ, viewModel, z2);
    }
}
