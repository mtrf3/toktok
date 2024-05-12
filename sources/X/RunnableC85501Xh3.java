package X;

import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Xh3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC85501Xh3 implements Runnable {
    public final /* synthetic */ CreatorCaptionEditActivity LJLIL;

    public final void LIZ() {
        if (!((Boolean) this.LJLIL.LLII().LJLJI.getValue()).booleanValue() && this.LJLIL.w6().isShown() && this.LJLIL.w6().getAdapter() != null) {
            CreatorCaptionEditActivity.HighLightLayoutManager highLightLayoutManager = this.LJLIL.LJLIL;
            if (highLightLayoutManager != null) {
                int LLIL = highLightLayoutManager.LLIL();
                if (LLIL != -1) {
                    if (LLIL != 0) {
                        if (LLIL != 1) {
                            int i = LLIL + 1;
                            CreatorCaptionEditActivity.HighLightLayoutManager highLightLayoutManager2 = this.LJLIL.LJLIL;
                            if (highLightLayoutManager2 != null) {
                                LLIL = Math.min(i, highLightLayoutManager2.LJJJJZ() - 1);
                            } else {
                                o.LJIJI("highLightLayoutManager");
                                throw null;
                            }
                        } else {
                            CreatorCaptionEditActivity.HighLightLayoutManager highLightLayoutManager3 = this.LJLIL.LJLIL;
                            if (highLightLayoutManager3 != null) {
                                View LJJIJIL = highLightLayoutManager3.LJJIJIL(LLIL);
                                if (LJJIJIL != null && LJJIJIL.getBottom() < ((int) KL2.LIZJ(this.LJLIL, 80.0f))) {
                                    CreatorCaptionEditActivity.HighLightLayoutManager highLightLayoutManager4 = this.LJLIL.LJLIL;
                                    if (highLightLayoutManager4 != null) {
                                        LLIL = Math.min(2, highLightLayoutManager4.LJJJJZ() - 1);
                                    } else {
                                        o.LJIJI("highLightLayoutManager");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("highLightLayoutManager");
                                throw null;
                            }
                        }
                    }
                    C85511XhD c85511XhD = this.LJLIL.LJLILLLLZI;
                    if (c85511XhD != null) {
                        c85511XhD.LJLLLLLL(LLIL);
                        this.LJLIL.LLIZLLLIL(LLIL);
                    } else {
                        o.LJIJI("creatorCaptionEditAdapter");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("highLightLayoutManager");
                throw null;
            }
        }
        ((Handler) this.LJLIL.LJZL.getValue()).post(this);
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

    public RunnableC85501Xh3(CreatorCaptionEditActivity creatorCaptionEditActivity) {
        this.LJLIL = creatorCaptionEditActivity;
    }
}
