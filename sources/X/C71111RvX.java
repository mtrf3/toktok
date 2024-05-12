package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RvX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71111RvX extends ConstraintLayout {
    public final C2WM LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxTextView LJLJJL;

    public final void setCouponBottomLeftClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.LJLJJI.setClickable(true);
            C16880lQ.LJIIJ(new Au2S20S0100000_12(onClickListener, 84, 42, 42), this.LJLJJI);
            return;
        }
        this.LJLJJI.setClickable(false);
    }

    public final void setCouponBottomLeftText(String str) {
        this.LJLJJI.setText(str);
    }

    public final void setCouponBottomRightClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.LJLJJL.setClickable(true);
            C16880lQ.LJIIJ(new Au2S20S0100000_12(onClickListener, 85, 42, 42), this.LJLJJL);
            return;
        }
        this.LJLJJL.setClickable(false);
    }

    public final void setCouponBottomRightText(String str) {
        this.LJLJJL.setText(str);
    }

    public final void setCouponBottomRightTextVisible(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LJLJJL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        tuxTextView.setVisibility(i);
    }

    public final void setCouponBtnClickListener(View.OnClickListener claimClick) {
        o.LJIIIZ(claimClick, "claimClick");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(claimClick, 86, 42, 42), this.LJLIL);
    }

    public final void setCouponInfoText(String text) {
        o.LJIIIZ(text, "text");
        this.LJLILLLLZI.setText(text);
    }

    public final void setCouponSubInfoText(String text) {
        o.LJIIIZ(text, "text");
        this.LJLJI.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71111RvX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        Resources resources = context.getResources();
        C2WM c2wm = new C2WM(context);
        c2wm.setId(R.id.cmf);
        c2wm.setTextColorRes(R.attr.dj);
        c2wm.setMaxLines(1);
        c2wm.LJJJIL(true);
        c2wm.setMinTextSize(10.0f);
        c2wm.setPadding(resources.getDimensionPixelOffset(R.dimen.po), 0, resources.getDimensionPixelOffset(R.dimen.po), 0);
        c2wm.setButtonSize(0);
        c2wm.setMinWidth(resources.getDimensionPixelOffset(R.dimen.pn));
        c2wm.setMaxWidth(resources.getDimensionPixelOffset(R.dimen.op));
        this.LJLIL = c2wm;
        C018905p c018905p = new C018905p(-2, -2);
        c018905p.topToTop = 0;
        c018905p.endToEnd = 0;
        ((ViewGroup.MarginLayoutParams) c018905p).topMargin = resources.getDimensionPixelOffset(R.dimen.ok);
        addView(c2wm, c018905p);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.cmh);
        tuxTextView.setTuxFont(33);
        tuxTextView.setLineHeight(resources.getDimensionPixelOffset(R.dimen.p4));
        tuxTextView.LJJJ(17.0f);
        tuxTextView.setSingleLine(true);
        tuxTextView.setHorizontallyScrolling(false);
        tuxTextView.setMinTextSize(12.0f);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.LJLILLLLZI = tuxTextView;
        C018905p c018905p2 = new C018905p(-2, -2);
        c018905p2.topToTop = 0;
        c018905p2.startToStart = 0;
        c018905p2.endToStart = R.id.cmf;
        c018905p2.constrainedWidth = true;
        c018905p2.horizontalBias = 0.0f;
        ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = resources.getDimensionPixelOffset(R.dimen.pd);
        c018905p2.setMarginEnd(resources.getDimensionPixelOffset(R.dimen.po));
        addView(tuxTextView, c018905p2);
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setId(R.id.cmi);
        tuxTextView2.setTuxFont(91);
        tuxTextView2.setLineHeight(resources.getDimensionPixelOffset(R.dimen.or));
        tuxTextView2.setSingleLine(true);
        tuxTextView2.setHorizontallyScrolling(false);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.LJLJI = tuxTextView2;
        C018905p c018905p3 = new C018905p(-2, -2);
        c018905p3.topToBottom = R.id.cmh;
        c018905p3.startToStart = R.id.cmh;
        c018905p3.endToStart = R.id.cmf;
        c018905p3.setMarginEnd(resources.getDimensionPixelOffset(R.dimen.po));
        c018905p3.constrainedWidth = true;
        c018905p3.horizontalBias = 0.0f;
        addView(tuxTextView2, c018905p3);
        TuxTextView tuxTextView3 = new TuxTextView(context, null, 6, 0);
        tuxTextView3.setId(R.id.cme);
        tuxTextView3.setTuxFont(91);
        tuxTextView3.setTextColorRes(R.attr.gp);
        tuxTextView3.setSingleLine(true);
        tuxTextView3.setHorizontallyScrolling(false);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setGravity(0);
        this.LJLJJL = tuxTextView3;
        C018905p c018905p4 = new C018905p(-2, resources.getDimensionPixelOffset(R.dimen.p3));
        c018905p4.startToStart = R.id.cmh;
        c018905p4.bottomToBottom = 0;
        c018905p4.endToEnd = R.id.cmf;
        c018905p4.setMarginEnd(resources.getDimensionPixelOffset(R.dimen.p2));
        c018905p4.horizontalBias = 1.0f;
        ((ViewGroup.MarginLayoutParams) c018905p4).bottomMargin = resources.getDimensionPixelOffset(R.dimen.p2);
        addView(tuxTextView3, c018905p4);
        TuxTextView tuxTextView4 = new TuxTextView(context, null, 6, 0);
        tuxTextView4.setId(R.id.cmc);
        tuxTextView4.setTuxFont(91);
        tuxTextView4.setTextColorRes(R.attr.gp);
        tuxTextView4.setSingleLine(true);
        tuxTextView4.setHorizontallyScrolling(false);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setGravity(0);
        this.LJLJJI = tuxTextView4;
        C018905p c018905p5 = new C018905p(-2, resources.getDimensionPixelOffset(R.dimen.p3));
        c018905p5.startToStart = R.id.cmh;
        c018905p5.bottomToBottom = 0;
        c018905p5.endToStart = R.id.cme;
        c018905p5.setMarginEnd(resources.getDimensionPixelOffset(R.dimen.po));
        c018905p5.goneEndMargin = resources.getDimensionPixelOffset(R.dimen.p2);
        ((ViewGroup.MarginLayoutParams) c018905p5).bottomMargin = resources.getDimensionPixelOffset(R.dimen.p2);
        c018905p5.constrainedWidth = true;
        c018905p5.horizontalBias = 0.0f;
        addView(tuxTextView4, c018905p5);
    }
}
