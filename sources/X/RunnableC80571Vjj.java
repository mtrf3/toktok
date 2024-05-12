package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior;

/* renamed from: X.Vjj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC80571Vjj implements Runnable {
    public final View LJLIL;
    public final int LJLILLLLZI;
    public final /* synthetic */ ViewPagerBottomSheetBehavior LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C270714l c270714l = this.LJLJI.LJIIIZ;
            if (c270714l != null && c270714l.LJIIIIZZ()) {
                C16300kU.LJIIL(this.LJLIL, this);
            } else {
                this.LJLJI.setStateInternal(this.LJLILLLLZI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80571Vjj(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, View view, int i) {
        this.LJLJI = viewPagerBottomSheetBehavior;
        this.LJLIL = view;
        this.LJLILLLLZI = i;
    }
}
