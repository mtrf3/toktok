package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Q1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Q1 {
    /* JADX WARN: Type inference failed for: r0v9, types: [X.4QG] */
    public static C4QG LIZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        final View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.b2w, parent, false);
        o.LJIIIIZZ(itemView, "itemView");
        C26338AVi.LJIIIZ(itemView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, 16);
        o.LJIIIIZZ(itemView, "itemView");
        return new RecyclerView.ViewHolder(itemView) { // from class: X.4QG
            public static final /* synthetic */ int LJLIL = 0;
        };
    }
}
