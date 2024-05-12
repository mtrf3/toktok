package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import defpackage.b1;

/* loaded from: classes15.dex */
public class WFH extends RelativeLayout.LayoutParams {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public WFH() {
        super(-2, -2);
    }

    @Override // android.widget.RelativeLayout.LayoutParams
    public final int[] getRules() {
        resolveLayoutDirection(getLayoutDirection());
        return super.getRules();
    }

    public WFH(WFH wfh) {
        super((RelativeLayout.LayoutParams) wfh);
    }

    @Override // android.widget.RelativeLayout.LayoutParams
    public final String debug(String str) {
        StringBuilder LIZJ = b1.LIZJ(str, "ViewGroup.LayoutParams={ width=");
        LIZJ.append(((RelativeLayout.LayoutParams) this).width);
        LIZJ.append(", height=");
        return C08380Uo.LIZ(LIZJ, ((RelativeLayout.LayoutParams) this).height, " }", LIZJ);
    }

    public WFH(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public WFH(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public WFH(RelativeLayout.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public WFH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
