package com.ss.android.ugc.aweme.feed.survey.layoutmanager;

import X.C0A2;
import X.C90193gN;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes15.dex */
public final class SurveyFlexLayoutManager extends C0A2 {
    public final Paint LJLZ = new Paint();

    @Override // X.C0A2
    public final boolean LJJLIIIJ() {
        return true;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // X.C0A2
    public final int LJJJJZI() {
        return C90193gN.LIZ() ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x007f, code lost:
    
        if (r6 != null) goto L26;
     */
    @Override // X.C0A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJI(X.C0A7 r25, X.C0AC r26) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.survey.layoutmanager.SurveyFlexLayoutManager.LJLJJI(X.0A7, X.0AC):void");
    }

    public final void LLIIIL(View view, int i, int i2, int i3, int i4) {
        if (C90193gN.LIZ()) {
            int i5 = this.LJLLLL;
            LJJLIIIJJIZ(view, i5 - i3, i2, i5 - i, i4);
        } else {
            LJJLIIIJJIZ(view, i, i2, i3, i4);
        }
    }
}
