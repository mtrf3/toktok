package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.0BB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0BB {
    public static final void LIZIZ(RecyclerView.ViewHolder viewHolder) {
        o.LJIIJ(viewHolder, "viewHolder");
        viewHolder.resetInternal();
    }

    public static final int LIZ(int i, RecyclerView recyclerView) {
        RecyclerView.RecycledViewPool.ScrapData scrapData = recyclerView.getRecycledViewPool().mScrap.get(i);
        if (scrapData != null) {
            return scrapData.mMaxScrap;
        }
        return -1;
    }
}
