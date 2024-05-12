package X;

import android.view.View;
import com.ss.android.ugc.aweme.vision.behavior.SearchBottomSheetBehavior;

/* renamed from: X.Vk4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC80592Vk4 implements Runnable {
    public final View LJLIL;
    public final int LJLILLLLZI;
    public final /* synthetic */ SearchBottomSheetBehavior LJLJI;

    public final void LIZ() {
        C270714l c270714l = this.LJLJI.LJIIJ;
        if (c270714l != null && c270714l.LJIIIIZZ()) {
            C16300kU.LJIIL(this.LJLIL, this);
            if (this.LJLILLLLZI == 4) {
                int top = this.LJLIL.getTop();
                SearchBottomSheetBehavior searchBottomSheetBehavior = this.LJLJI;
                if (top == searchBottomSheetBehavior.LJI && !searchBottomSheetBehavior.LJIIIIZZ) {
                    searchBottomSheetBehavior.LJIIIIZZ = true;
                    return;
                }
                return;
            }
            return;
        }
        this.LJLJI.setStateInternal(this.LJLILLLLZI);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80592Vk4(SearchBottomSheetBehavior searchBottomSheetBehavior, View view, int i) {
        this.LJLJI = searchBottomSheetBehavior;
        this.LJLIL = view;
        this.LJLILLLLZI = i;
    }
}
