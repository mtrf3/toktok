package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ZqR, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91179ZqR extends LinearLayout {
    public LCP LJLIL;
    public TuxTextView LJLILLLLZI;

    public final TuxTextView getMTextView() {
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("mTextView");
        throw null;
    }

    public final LCP getIconData() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91179ZqR(LCP iconData) {
        super(iconData.LIZ, null, 0);
        o.LJIIIZ(iconData, "iconData");
        new LinkedHashMap();
        this.LJLIL = iconData;
        setOrientation(0);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setMTextView(new TuxTextView(context, null, 6, 0));
        getMTextView().setTuxFont(32);
        getMTextView().setGravity(17);
        getMTextView().setPadding(C17N.LJIILL(12.0d), 0, C17N.LJIILL(12.0d), 0);
        getMTextView().setLines(1);
        TuxTextView mTextView = getMTextView();
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.cl, context2);
        mTextView.setTextColor(LJI != null ? LJI.intValue() : 0);
        getMTextView().setAlpha(0.6f);
        getMTextView().setMinWidth(C17N.LJIILL(53.0d));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C17N.LJIILL(58.0d));
        layoutParams.gravity = 17;
        getMTextView().setLayoutParams(layoutParams);
        getMTextView().setId(android.R.id.text1);
        addView(getMTextView());
        getMTextView().setText(this.LJLIL.LIZJ);
    }

    public final void setIconData(LCP lcp) {
        o.LJIIIZ(lcp, "<set-?>");
        this.LJLIL = lcp;
    }

    public final void setMTextView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLILLLLZI = tuxTextView;
    }

    public final void setTextSize(float f) {
        getMTextView().setTextSize(1, f);
    }
}
