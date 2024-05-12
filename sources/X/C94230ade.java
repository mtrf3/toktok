package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ade, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94230ade extends AbstractC93422aQc<C93720aVQ, C94229add> {
    @Override // X.AbstractC93422aQc
    public final C94229add LIZIZ(RecyclerView parent) {
        o.LJIIIZ(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setLayoutParams(C93902aYM.LJ(parent, -2, 0, C93742aVm.LIZIZ(24), null, null, 244));
        C94633ak9 attrBlock = C94633ak9.LJLIL;
        o.LJIIIZ(attrBlock, "attrBlock");
        attrBlock.invoke(frameLayout);
        return new C94229add(frameLayout);
    }

    @Override // X.AbstractC93422aQc
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object data) {
        C94229add viewHolder2 = (C94229add) viewHolder;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(viewHolder2, "viewHolder");
        TextView textView = viewHolder2.LJLIL;
        View view = viewHolder2.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        textView.setText(view.getContext().getString(R.string.hf));
    }
}
