package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.aeF, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94267aeF extends AbstractC93422aQc<C93815aWx, C94266aeE> {
    @Override // X.AbstractC93422aQc
    public final C94266aeE LIZIZ(RecyclerView parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        C94526aiQ c94526aiQ = new C94526aiQ(context, null, 6);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMargins(0, C93742aVm.LIZIZ(6), 0, C93742aVm.LIZIZ(6));
        c94526aiQ.setLayoutParams(layoutParams);
        return new C94266aeE(c94526aiQ);
    }

    @Override // X.AbstractC93422aQc
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object data) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(viewHolder, "viewHolder");
    }
}
