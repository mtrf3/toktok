package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uil, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77963Uil extends CZA<C78015Ujb, C77984Uj6> {
    public C77963Uil() {
        super(R.layout.da6, Boolean.FALSE);
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object data) {
        C77984Uj6 holder = (C77984Uj6) viewHolder;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(data, "data");
        TextView textView = holder.LJLIL;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l6b);
        boolean z = C31512CYi.LIZIZ;
        C78934UyQ.LJJIIJZLJL(textView, LJIILJJIL, z);
        C78934UyQ.LJJIIJZLJL(holder.LJLILLLLZI, C15380j0.LJIILJJIL(R.string.l6c), z);
    }

    @Override // X.CZA
    public final C77984Uj6 LJI(View view, ViewGroup viewGroup) {
        if (viewGroup != null) {
            view.getLayoutParams().height = viewGroup.getHeight();
        }
        return new C77984Uj6(view);
    }
}
