package X;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.4BP, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4BP extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public InterfaceC1032943p LJLJI;
    public final SparseArray<View> LJLJJI;

    public final void LIZ(View view) {
        if (this.LJLJJI.get(1) != null) {
            return;
        }
        this.LJLJJI.put(1, view);
        addView(view, new ViewGroup.LayoutParams(-1, -1));
        view.setVisibility(8);
    }

    public void setOnPanelChangeListener(InterfaceC1032943p interfaceC1032943p) {
        this.LJLJI = interfaceC1032943p;
    }

    public C4BP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4BP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLIL = -1;
        this.LJLILLLLZI = -1;
        this.LJLJJI = new SparseArray<>();
    }
}
