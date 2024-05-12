package X;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.tasm.behavior.ui.view.UIComponent;

/* renamed from: X.VUt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79831VUt extends RecyclerView.ViewHolder {
    public final VRX LJLIL;
    public long LJLILLLLZI;

    public C79831VUt(VRX vrx) {
        super(vrx);
        this.LJLIL = vrx;
    }

    public final void L(UIComponent uIComponent) {
        this.LJLIL.LJLILLLLZI = uIComponent;
        this.LJLIL.addView(uIComponent.mView, new FrameLayout.LayoutParams(-1, -2));
        VRX vrx = this.LJLIL;
        getAdapterPosition();
        vrx.getClass();
    }
}
