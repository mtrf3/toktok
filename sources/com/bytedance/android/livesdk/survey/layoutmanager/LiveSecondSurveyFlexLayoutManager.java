package com.bytedance.android.livesdk.survey.layoutmanager;

import X.C0A2;
import X.C26338AVi;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes15.dex */
public final class LiveSecondSurveyFlexLayoutManager extends C0A2 {
    public final Context LJLZ;
    public final Paint LJZ = new Paint();

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
        return C26338AVi.LIZJ(this.LJLZ) ? 1 : 0;
    }

    public LiveSecondSurveyFlexLayoutManager(Context context) {
        this.LJLZ = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0096, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007f, code lost:
    
        if (r6 != null) goto L26;
     */
    @Override // X.C0A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJI(X.C0A7 r25, X.C0AC r26) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.survey.layoutmanager.LiveSecondSurveyFlexLayoutManager.LJLJJI(X.0A7, X.0AC):void");
    }

    public final void LLIIIL(View view, int i, int i2, int i3, int i4) {
        if (LJJJJZI() == 1) {
            int i5 = this.LJLLLL;
            LJJLIIIJJIZ(view, i5 - i3, i2, i5 - i, i4);
        } else {
            LJJLIIIJJIZ(view, i, i2, i3, i4);
        }
    }
}
