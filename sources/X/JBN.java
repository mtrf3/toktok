package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;

/* loaded from: classes9.dex */
public final class JBN implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ MidAdCellComponent LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.LJLIL.u4().getViewTreeObserver();
        float measureText = this.LJLIL.u4().getPaint().measureText(this.LJLILLLLZI);
        viewTreeObserver.removeOnGlobalLayoutListener(this);
        TuxTextView u4 = this.LJLIL.u4();
        ViewGroup.LayoutParams layoutParams = this.LJLIL.u4().getLayoutParams();
        layoutParams.width = ((int) measureText) + 5;
        u4.setLayoutParams(layoutParams);
        this.LJLIL.u4().setGravity(8388611);
    }

    public JBN(MidAdCellComponent midAdCellComponent, String str) {
        this.LJLIL = midAdCellComponent;
        this.LJLILLLLZI = str;
    }
}
