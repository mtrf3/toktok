package X;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;

/* renamed from: X.5yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC152505yg implements Runnable {
    public final RecyclerView LJLIL;
    public final EditCaptionScene.HighLightLayoutManager LJLILLLLZI;
    public final Activity LJLJI;
    public final C69W LJLJJI;
    public final SafeHandler LJLJJL;

    public final void LIZ() {
        int LLIL;
        int i;
        if (this.LJLIL.isShown() && this.LJLIL.getAdapter() != null && (LLIL = this.LJLILLLLZI.LLIL()) != -1) {
            if (LLIL != 0 && LLIL != 1) {
                LLIL = Math.min(LLIL + 2, this.LJLILLLLZI.LJJJJZ() - 1);
            } else {
                View LJJIJIL = this.LJLILLLLZI.LJJIJIL(LLIL);
                if (LJJIJIL != null) {
                    i = LJJIJIL.getBottom();
                } else {
                    i = 0;
                }
                if (i < ((int) KL2.LIZJ(this.LJLJI, 52.0f))) {
                    LLIL = Math.min(LLIL + 2, this.LJLILLLLZI.LJJJJZ() - 1);
                }
            }
            if (!TextUtils.isEmpty(((CaptionUtterance) ListProtector.get(this.LJLJJI.LJLIL, LLIL)).LIZLLL())) {
                this.LJLJJI.LJLLLLLL(LLIL);
            }
        }
        this.LJLJJL.post(this);
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

    public RunnableC152505yg(C161806Wq c161806Wq, EditCaptionScene.HighLightLayoutManager highLightLayoutManager, ActivityC45651qj activityC45651qj, C69W c69w, SafeHandler safeHandler) {
        this.LJLIL = c161806Wq;
        this.LJLILLLLZI = highLightLayoutManager;
        this.LJLJI = activityC45651qj;
        this.LJLJJI = c69w;
        this.LJLJJL = safeHandler;
    }
}
