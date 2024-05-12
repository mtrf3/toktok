package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.8ID, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8ID extends FrameLayout implements InterfaceC51613KNl {
    public View LJLIL;
    public int LJLILLLLZI;

    public C8ID() {
        throw null;
    }

    @Override // X.InterfaceC51613KNl
    public final void LIZ(int i) {
        if (this.LJLILLLLZI != i) {
            this.LJLILLLLZI = i;
        }
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LJLIL.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.LJLIL.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        view.setVisibility(i);
    }

    public C8ID(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8ID(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLIL = C16950lX.LIZ(context, R.layout.bkq, this, true, -1).findViewById(R.id.cfh);
    }
}
