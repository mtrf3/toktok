package X;

import Y.ACListenerS32S0100000_12;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.TCx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74271TCx extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final /* synthetic */ C74270TCw LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74271TCx(C74270TCw c74270TCw, FrameLayout frameLayout) {
        super(frameLayout);
        this.LJLILLLLZI = c74270TCw;
        View childAt = frameLayout.getChildAt(0);
        if (childAt != null) {
            this.LJLIL = (TextView) childAt;
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS32S0100000_12(this, 61));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }
}
