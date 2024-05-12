package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.4aY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112064aY extends RecyclerView {
    public int LLLF;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C112064aY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C112064aY(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            X.0gh r0 = new X.0gh
            r0.<init>()
            r1.addOnAttachStateChangeListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112064aY.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LinearLayoutManager linearLayoutManager;
        int LLILLJJLI;
        View LJJIJIL;
        super.onLayout(z, i, i2, i3, i4);
        C0A2 layoutManager = getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && !linearLayoutManager.LLF && (LLILLJJLI = linearLayoutManager.LLILLJJLI()) >= 0 && (LJJIJIL = linearLayoutManager.LJJIJIL(LLILLJJLI)) != null) {
            ViewGroup.LayoutParams layoutParams = LJJIJIL.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int top = LJJIJIL.getTop();
            if (top > i5 && this.LLLF == 0) {
                int i6 = i5 - top;
                this.LLLF = i6;
                linearLayoutManager.LJJLIIIJLLLLLLLZ(i6);
                linearLayoutManager.LLJJIJIIJIL(true);
            }
        }
    }
}
