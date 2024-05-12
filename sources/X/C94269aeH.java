package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.aeH, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94269aeH extends AbstractC93422aQc<C93816aWy, C94268aeG> {
    @Override // X.AbstractC93422aQc
    public final C94268aeG LIZIZ(RecyclerView parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        C93813aWv c93813aWv = new C93813aWv(context);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMargins(0, C93742aVm.LIZIZ(6), 0, C93742aVm.LIZIZ(6));
        c93813aWv.setLayoutParams(layoutParams);
        return new C94268aeG(c93813aWv);
    }

    @Override // X.AbstractC93422aQc
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object data) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(viewHolder, "viewHolder");
    }
}
