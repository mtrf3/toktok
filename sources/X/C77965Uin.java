package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uin, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77965Uin extends CZA<C78009UjV, C77990UjC> {
    public C77965Uin() {
        super(R.layout.d9f, Boolean.FALSE);
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        C77990UjC holder = (C77990UjC) viewHolder;
        C78009UjV item = (C78009UjV) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        C78934UyQ.LJJIIJZLJL(holder.LJLIL, item.LIZ, C31512CYi.LIZIZ);
    }

    @Override // X.CZA
    public final C77990UjC LJI(View view, ViewGroup viewGroup) {
        return new C77990UjC(view);
    }
}
