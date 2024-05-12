package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Vhr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80455Vhr implements Runnable {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ BottomSheetBehavior LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI.settleToState(this.LJLIL, this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80455Vhr(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.LJLJI = bottomSheetBehavior;
        this.LJLIL = view;
        this.LJLILLLLZI = i;
    }
}
