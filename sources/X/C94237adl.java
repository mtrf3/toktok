package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.adl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94237adl extends AbstractC93422aQc<C94219adT, C94236adk> {
    @Override // X.AbstractC93422aQc
    public final C94236adk LIZIZ(RecyclerView parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "context");
        C93693aUz c93693aUz = new C93693aUz(context);
        c93693aUz.setLayoutParams(C93902aYM.LJ(parent, -2, C93742aVm.LIZIZ(4), C93742aVm.LIZIZ(24), null, null, 240));
        return new C94236adk(c93693aUz);
    }

    @Override // X.AbstractC93422aQc
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        C94219adT data = (C94219adT) obj;
        C94236adk viewHolder2 = (C94236adk) viewHolder;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(viewHolder2, "viewHolder");
        viewHolder2.LJLIL.setTriggerInfo(data);
    }
}
