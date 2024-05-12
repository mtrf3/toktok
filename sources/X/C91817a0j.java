package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Notice;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.a0j, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91817a0j extends FrameLayout {
    public TuxIconView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public CardView LJLJJI;

    public final void LIZ(Notice notice) {
        int i;
        int i2;
        int i3;
        Integer LJI;
        String str = notice.type;
        EnumC91915a2J enumC91915a2J = EnumC91915a2J.CREDIT_ERROR;
        if (o.LJ(str, enumC91915a2J.getValue())) {
            i = R.attr.cx;
        } else {
            i = R.attr.cz;
        }
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(i, context)) != null) {
            int intValue = LJI.intValue();
            CardView cardView = this.LJLJJI;
            if (cardView != null) {
                cardView.setCardBackgroundColor(intValue);
            } else {
                o.LJIJI("cardView");
                throw null;
            }
        }
        if (o.LJ(notice.type, enumC91915a2J.getValue())) {
            i2 = R.raw.icon_exclamation_mark_triangle_fill;
        } else {
            i2 = R.raw.icon_bell_activation_fill;
        }
        if (o.LJ(notice.type, enumC91915a2J.getValue())) {
            i3 = R.attr.e7;
        } else {
            i3 = R.attr.c6;
        }
        TuxIconView tuxIconView = this.LJLIL;
        if (tuxIconView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = i2;
            c2068389v.LJ = Integer.valueOf(i3);
            tuxIconView.setTuxIcon(c2068389v);
            TuxIconView tuxIconView2 = this.LJLIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
                String str2 = notice.title;
                if (str2 != null && str2.length() > 0) {
                    TuxTextView tuxTextView = this.LJLILLLLZI;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(0);
                        TuxTextView tuxTextView2 = this.LJLILLLLZI;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(notice.title);
                        } else {
                            o.LJIJI("titleTv");
                            throw null;
                        }
                    } else {
                        o.LJIJI("titleTv");
                        throw null;
                    }
                } else {
                    TuxTextView tuxTextView3 = this.LJLILLLLZI;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(8);
                    } else {
                        o.LJIJI("titleTv");
                        throw null;
                    }
                }
                String str3 = notice.description;
                if (str3 != null && str3.length() > 0) {
                    TuxTextView tuxTextView4 = this.LJLJI;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setVisibility(0);
                        TuxTextView tuxTextView5 = this.LJLJI;
                        if (tuxTextView5 != null) {
                            tuxTextView5.setText(notice.description);
                            return;
                        } else {
                            o.LJIJI("descTv");
                            throw null;
                        }
                    }
                    o.LJIJI("descTv");
                    throw null;
                }
                TuxTextView tuxTextView6 = this.LJLJI;
                if (tuxTextView6 != null) {
                    tuxTextView6.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("descTv");
                    throw null;
                }
            }
            o.LJIJI("iconView");
            throw null;
        }
        o.LJIJI("iconView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91817a0j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        C16880lQ.LLLZIIL(R.layout.af, C16880lQ.LLZIL(getContext()), this);
        View findViewById = findViewById(R.id.cn);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.bnpl_bill_home_notice_icon)");
        this.LJLIL = (TuxIconView) findViewById;
        View findViewById2 = findViewById(R.id.cm);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.bnpl_bill_home_notice_header)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.cl);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.bnpl_bill_home_notice_desc)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = findViewById(R.id.f2);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.bnpl_notice_view_card)");
        this.LJLJJI = (CardView) findViewById4;
    }
}
