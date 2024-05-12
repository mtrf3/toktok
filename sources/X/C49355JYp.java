package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.JYp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49355JYp extends C0AD {
    public final C49485JbV LIZ;
    public final /* synthetic */ C49485JbV LIZIZ;

    public C49355JYp(C49485JbV c49485JbV, C49485JbV c49485JbV2) {
        this.LIZIZ = c49485JbV;
        this.LIZ = c49485JbV2;
    }

    @Override // X.C0AD
    public final View LIZ(C0A7 recycler, int i, int i2) {
        RecyclerView.ViewHolder next;
        o.LJIIIZ(recycler, "recycler");
        CopyOnWriteArrayList<RecyclerView.ViewHolder> copyOnWriteArrayList = this.LIZ.LJLJI.get(Integer.valueOf(i2));
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            next = null;
        } else {
            next = copyOnWriteArrayList.iterator().next();
            copyOnWriteArrayList.remove(next);
        }
        if (next != null && next.getItemViewType() == i2) {
            View view = next.itemView;
            try {
                if (this.LIZIZ.LJLILLLLZI.LJJJJJL(view) != null) {
                    return view;
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return null;
    }
}
