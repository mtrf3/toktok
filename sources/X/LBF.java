package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class LBF extends RelativeLayout {
    public final LBG LJLIL;
    public final List<View> LJLILLLLZI;

    public final List<View> getAnimatingViews() {
        return this.LJLILLLLZI;
    }

    public final LBG getAnimationDelegate() {
        return this.LJLIL;
    }

    public final void setAnimationEnabled(boolean z) {
        this.LJLIL.LIZJ = z;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        LBG lbg = this.LJLIL;
        lbg.LIZ.cancel();
        lbg.LIZIZ.cancel();
        if (!lbg.LIZJ) {
            return;
        }
        if (z) {
            lbg.LIZ.start();
        } else {
            lbg.LIZIZ.start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LBF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = new LBG();
        this.LJLILLLLZI = new ArrayList();
    }
}
