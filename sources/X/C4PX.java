package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4PX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PX extends C109004Po {
    public static final float LJZI = C74275TDb.LIZIZ(EF7.LIZIZ(), 60.0f);
    public final int LJLLLLLL;
    public final float LJLZ;
    public final Context LJZ;

    @Override // X.C109004Po, X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        o.LJIIIZ(viewHolder, "viewHolder");
        super.onBindViewHolder(viewHolder, i);
        if (i == 0) {
            i2 = this.LJLLLLLL;
        } else {
            i2 = (int) this.LJLZ;
        }
        if (viewHolder instanceof C4Q0) {
            i3 = this.LJZ.getResources().getDimensionPixelOffset(R.dimen.a78);
        } else {
            i3 = 0;
        }
        View view = viewHolder.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        C26338AVi.LJI(view, Integer.valueOf(i2), 0, Integer.valueOf(i3), 0, false, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4PX(int r5, float r6, android.content.Context r7, com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r8) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.4Pb r3 = new X.4Pb
            boolean r2 = X.C4PQ.LIZIZ()
            int r1 = X.C4PQ.LIZ()
            r0 = 2
            if (r1 == r0) goto L27
            int r1 = X.C4PQ.LIZ()
            r0 = 4
            if (r1 == r0) goto L27
            int r1 = X.C4PQ.LIZ()
            r0 = 5
            if (r1 == r0) goto L27
            int r1 = X.C4PQ.LIZ()
            r0 = 6
            if (r1 != r0) goto L38
        L27:
            r1 = 1
        L28:
            float r0 = X.C4PX.LJZI
            int r0 = (int) r0
            r3.<init>(r2, r1, r0)
            r4.<init>(r8, r3)
            r4.LJLLLLLL = r5
            r4.LJLZ = r6
            r4.LJZ = r7
            return
        L38:
            r1 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4PX.<init>(int, float, android.content.Context, com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel):void");
    }
}
