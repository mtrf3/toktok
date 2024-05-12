package X;

import android.view.Choreographer;
import com.lynx.tasm.behavior.ui.list.UIList;

/* renamed from: X.VUu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ChoreographerFrameCallbackC79832VUu implements Choreographer.FrameCallback {
    public final /* synthetic */ UIList LJLIL;

    public ChoreographerFrameCallbackC79832VUu(UIList uIList) {
        this.LJLIL = uIList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        ((androidx.recyclerview.widget.RecyclerView) r2.mView).scrollBy(r2.LLIIIILZ, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0025, code lost:
    
        if (r0 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        r2 = r5.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r2.LLF == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        ((androidx.recyclerview.widget.RecyclerView) r2.mView).scrollBy(0, r2.LLIIIILZ);
     */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void doFrame(long r6) {
        /*
            r5 = this;
            com.lynx.tasm.behavior.ui.list.UIList r1 = r5.LJLIL
            int r0 = r1.LLIIIILZ
            r3 = 1
            r4 = 0
            if (r0 <= 0) goto L14
            boolean r0 = r1.LLF
            if (r0 == 0) goto L69
            T extends android.view.View r0 = r1.mView
            boolean r0 = r0.canScrollVertically(r3)
        L12:
            if (r0 != 0) goto L27
        L14:
            com.lynx.tasm.behavior.ui.list.UIList r2 = r5.LJLIL
            int r0 = r2.LLIIIILZ
            if (r0 >= 0) goto L67
            boolean r0 = r2.LLF
            r1 = -1
            if (r0 == 0) goto L60
            T extends android.view.View r0 = r2.mView
            boolean r0 = r0.canScrollVertically(r1)
        L25:
            if (r0 == 0) goto L67
        L27:
            com.lynx.tasm.behavior.ui.list.UIList r2 = r5.LJLIL
            boolean r0 = r2.LLF
            if (r0 == 0) goto L56
            T extends android.view.View r1 = r2.mView
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            int r0 = r2.LLIIIILZ
            r1.scrollBy(r4, r0)
        L36:
            com.lynx.tasm.behavior.ui.list.UIList r1 = r5.LJLIL
            boolean r0 = r1.LLIIII
            if (r0 == 0) goto L52
            if (r3 != 0) goto L42
            boolean r0 = r1.LLIIIJ
            if (r0 != 0) goto L52
        L42:
            X.VUu r0 = r1.LLIIL
            if (r0 == 0) goto L51
            android.view.Choreographer r1 = X.C16880lQ.LLIIIJ()
            com.lynx.tasm.behavior.ui.list.UIList r0 = r5.LJLIL
            X.VUu r0 = r0.LLIIL
            r1.postFrameCallback(r0)
        L51:
            return
        L52:
            r1.LJJII()
            goto L51
        L56:
            T extends android.view.View r1 = r2.mView
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            int r0 = r2.LLIIIILZ
            r1.scrollBy(r0, r4)
            goto L36
        L60:
            T extends android.view.View r0 = r2.mView
            boolean r0 = r0.canScrollHorizontally(r1)
            goto L25
        L67:
            r3 = 0
            goto L36
        L69:
            T extends android.view.View r0 = r1.mView
            boolean r0 = r0.canScrollHorizontally(r3)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ChoreographerFrameCallbackC79832VUu.doFrame(long):void");
    }
}
