package X;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtX, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91371ZtX implements InterfaceC91162ZqA {
    public final /* synthetic */ C91372ZtY LIZ;
    public final /* synthetic */ C91171ZqJ LIZIZ;

    @Override // X.InterfaceC91162ZqA
    public final void LIZ() {
    }

    @Override // X.InterfaceC91162ZqA
    public final void LIZIZ(C91169ZqH c91169ZqH) {
        TextView mCustomTextView$music_dsp_release;
        if (!this.LIZIZ.getSwipeMode()) {
            this.LIZ.LIZJ(c91169ZqH, true);
        }
        C91170ZqI c91170ZqI = c91169ZqH.LIZLLL;
        if (c91170ZqI != null && (mCustomTextView$music_dsp_release = c91170ZqI.getMCustomTextView$music_dsp_release()) != null) {
            C8HI.LIZJ().LIZIZ(mCustomTextView$music_dsp_release, "medium");
        }
    }

    @Override // X.InterfaceC91162ZqA
    public final void LIZJ(C91169ZqH tab) {
        C91170ZqI c91170ZqI;
        TextView mCustomTextView$music_dsp_release;
        TextView mCustomTextView$music_dsp_release2;
        o.LJIIIZ(tab, "tab");
        C91170ZqI c91170ZqI2 = tab.LIZLLL;
        int childCount = this.LIZ.getChildCount();
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                View childAt = this.LIZ.getChildAt(i);
                if ((childAt instanceof C91170ZqI) && (mCustomTextView$music_dsp_release = (c91170ZqI = (C91170ZqI) childAt).getMCustomTextView$music_dsp_release()) != null && mCustomTextView$music_dsp_release.getVisibility() == 0 && (mCustomTextView$music_dsp_release2 = c91170ZqI.getMCustomTextView$music_dsp_release()) != null) {
                    mCustomTextView$music_dsp_release2.setAlpha(this.LIZ.LLD);
                }
                if (i == childCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (c91170ZqI2 != null) {
            TextView mCustomTextView$music_dsp_release3 = c91170ZqI2.getMCustomTextView$music_dsp_release();
            if (mCustomTextView$music_dsp_release3 != null) {
                mCustomTextView$music_dsp_release3.setAlpha(1.0f);
            }
            C8HI.LIZJ().LIZIZ(mCustomTextView$music_dsp_release3, "bold");
        }
        if (!this.LIZIZ.getSwipeMode()) {
            this.LIZ.LIZJ(tab, false);
        }
    }

    public C91371ZtX(C91372ZtY c91372ZtY, C91171ZqJ c91171ZqJ) {
        this.LIZ = c91372ZtY;
        this.LIZIZ = c91171ZqJ;
    }
}
