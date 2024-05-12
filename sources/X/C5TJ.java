package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5TJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5TJ extends FrameLayout {
    public int LJLIL;
    public ProgressBar LJLILLLLZI;
    public ProgressBar LJLJI;
    public ProgressBar LJLJJI;
    public final ValueAnimator LJLJJL;

    public final ProgressBar getProcessBarView1() {
        ProgressBar progressBar = this.LJLILLLLZI;
        if (progressBar != null) {
            return progressBar;
        }
        o.LJIJI("processBarView1");
        throw null;
    }

    public final ProgressBar getProcessBarView2() {
        ProgressBar progressBar = this.LJLJI;
        if (progressBar != null) {
            return progressBar;
        }
        o.LJIJI("processBarView2");
        throw null;
    }

    public final ProgressBar getProcessBarView3() {
        ProgressBar progressBar = this.LJLJJI;
        if (progressBar != null) {
            return progressBar;
        }
        o.LJIJI("processBarView3");
        throw null;
    }

    public final int getTotalPage() {
        return this.LJLIL;
    }

    public final void setProcessBarView1(ProgressBar progressBar) {
        o.LJIIIZ(progressBar, "<set-?>");
        this.LJLILLLLZI = progressBar;
    }

    public final void setProcessBarView2(ProgressBar progressBar) {
        o.LJIIIZ(progressBar, "<set-?>");
        this.LJLJI = progressBar;
    }

    public final void setProcessBarView3(ProgressBar progressBar) {
        o.LJIIIZ(progressBar, "<set-?>");
        this.LJLJJI = progressBar;
    }

    public final void setTotalPage(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5TJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = 2;
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
        o.LJIIIIZZ(ofInt, "ofInt(1, 10)");
        this.LJLJJL = ofInt;
    }
}
