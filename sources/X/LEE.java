package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LEE extends LinearLayout implements InterfaceC53911LDv, InterfaceC53908LDs {
    public final TuxTextView LJLIL;
    public View LJLILLLLZI;
    public LCP LJLJI;
    public final TuxIconView LJLJJI;

    @Override // X.InterfaceC53908LDs
    public View getView() {
        return this;
    }

    public LCP getIconData() {
        LCP lcp = this.LJLJI;
        if (lcp != null) {
            return lcp;
        }
        o.LJIJI("iconData");
        throw null;
    }

    public final View getMHotDot() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            return view;
        }
        o.LJIJI("mHotDot");
        throw null;
    }

    @Override // X.InterfaceC53908LDs
    public float getTextWidth() {
        TextPaint paint = this.LJLIL.getPaint();
        if (paint != null) {
            return paint.measureText(getIconData().LIZJ);
        }
        return 0.0f;
    }

    @Override // X.InterfaceC53911LDv
    public final void LIZ() {
        View mHotDot = getMHotDot();
        if (mHotDot == null) {
            return;
        }
        mHotDot.setVisibility(8);
    }

    public final TuxIconView getIconView() {
        return this.LJLJJI;
    }

    public final TuxTextView getTextView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LEE(LCP iconData) {
        super(iconData.LIZ, null, 0);
        o.LJIIIZ(iconData, "iconData");
        new LinkedHashMap();
        setIconData(iconData);
        setOrientation(0);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LJLJJI = tuxIconView;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
        this.LJLIL = tuxTextView;
        tuxTextView.setTuxFont(32);
        tuxTextView.setGravity(17);
        tuxTextView.setPadding(C17N.LJIILL(12.0d), 0, C17N.LJIILL(12.0d), 0);
        tuxTextView.setLines(1);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, context3));
        tuxTextView.setAlpha(0.6f);
        tuxTextView.setMinWidth(C17N.LJIILL(53.0d));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C17N.LJIILL(58.0d));
        layoutParams.gravity = 17;
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setId(android.R.id.text1);
        addView(tuxTextView);
        if (C52309Kfx.LIZ()) {
            tuxTextView.setPadding(0, 0, 0, 0);
            tuxTextView.setMinWidth(0);
            tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            tuxIconView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 0);
            tuxIconView.setIconRes(R.raw.icon_chevron_down_fill);
            tuxIconView.setAlpha(0.6f);
            tuxIconView.setTintColor(tuxIconView.getResources().getColor(R.color.ar));
            setGravity(16);
            tuxIconView.setId(R.id.e6d);
            tuxIconView.setVisibility(8);
            addView(tuxIconView);
            if (tuxIconView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(-C7MY.LIZIZ(16));
            }
        }
        setMHotDot(new View(getContext()));
        getMHotDot().setId(R.id.mmd);
        getMHotDot().setBackgroundResource(R.drawable.avc);
        getMHotDot().setVisibility(8);
        int LJIILL = C52309Kfx.LIZ() ? C17N.LJIILL(-8.0d) : C17N.LJIILL(-12.0d);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C17N.LJIILL(8.0d), C17N.LJIILL(8.0d));
        layoutParams3.setMargins(LJIILL, LJIILL, 0, 0);
        layoutParams3.setMarginStart(LJIILL);
        getMHotDot().setLayoutParams(layoutParams3);
        addView(getMHotDot());
        tuxTextView.setText(getIconData().LIZJ);
        View mHotDot = getMHotDot();
        if (e1.LIZ(31744, "following_red_dot_reverse", true, false)) {
            if (mHotDot != null) {
                mHotDot.setBackgroundResource(R.drawable.avf);
            }
        } else if (mHotDot != null) {
            mHotDot.setBackgroundResource(R.drawable.avc);
        }
        tuxTextView.setShadowLayer(KL2.LIZJ(EF7.LIZIZ(), 2.0f), 0.0f, KL2.LIZJ(EF7.LIZIZ(), 2.0f), ColorProtector.parseColor("#26000000"));
    }

    public void setIconData(LCP lcp) {
        o.LJIIIZ(lcp, "<set-?>");
        this.LJLJI = lcp;
    }

    public final void setMHotDot(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLILLLLZI = view;
    }

    @Override // X.InterfaceC53908LDs
    public void setText(String text) {
        o.LJIIIZ(text, "text");
        this.LJLIL.setText(text);
    }

    @Override // X.InterfaceC53908LDs
    public void setTextSize(float f) {
        this.LJLIL.setTextSize(1, f);
    }
}
