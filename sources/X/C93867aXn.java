package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.aXn, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93867aXn {
    public float LIZ;
    public final /* synthetic */ C94855anj LIZIZ;

    public C93867aXn(C94855anj c94855anj) {
        this.LIZIZ = c94855anj;
    }

    public final int LIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        C94855anj c94855anj = this.LIZIZ;
        if (ORY.LJJIJIIJIL(((AbstractC94471ahX) ListProtector.get(c94855anj.LJLIL, viewHolder.getAdapterPosition())).LJFF().LJLJJI, c94855anj.LJLJLLL)) {
            return C0B4.LJIIIZ(0, 0);
        }
        C94007aa3 c94007aa3 = this.LIZIZ.LJLILLLLZI;
        if (c94007aa3 != null) {
            C94288aea c94288aea = (C94288aea) c94007aa3;
            return C0B4.LJIIIZ(c94288aea.LJ, c94288aea.LJFF);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ugc.effectcreator.layer.LayerDraggableModule<com.ugc.effectcreator.foundation.expandablerecycleviewadapter.IExpandableMultiItem>");
    }
}
