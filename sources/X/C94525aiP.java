package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.aiP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94525aiP extends C40171ht {
    @Override // X.AbstractC28931Bp, X.AbstractC030109x
    public final boolean LIZIZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, C030009w preInfo, C030009w postInfo) {
        o.LJIIIZ(preInfo, "preInfo");
        o.LJIIIZ(postInfo, "postInfo");
        boolean LIZIZ = super.LIZIZ(viewHolder, viewHolder2, preInfo, postInfo);
        View view = viewHolder.itemView;
        o.LJIIIIZZ(view, "oldHolder.itemView");
        view.setAlpha(0.0f);
        View view2 = viewHolder2.itemView;
        o.LJIIIIZZ(view2, "newHolder.itemView");
        view2.setAlpha(1.0f);
        return LIZIZ;
    }
}
