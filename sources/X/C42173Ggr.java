package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ggr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42173Ggr extends AbstractC42166Ggk {
    public final /* synthetic */ TLH LJLJJI;

    @Override // X.AbstractC42166Ggk
    public final void LJZ(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
    }

    @Override // X.AbstractC42166Ggk
    public final RecyclerView.ViewHolder LJZI(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        TLH tlh = this.LJLJJI;
        tlh.getClass();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.cs2, parent, false);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.h2q);
        tlh.LJJIZ = textView;
        if (textView != null) {
            textView.setText(tlh.LJJJJJ);
        }
        C42174Ggs c42174Ggs = new C42174Ggs(LLLLIILL);
        tlh.getClass();
        return c42174Ggs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42173Ggr(TLH tlh, AbstractC029409q<RecyclerView.ViewHolder> delegate) {
        super(delegate);
        o.LJIIIZ(delegate, "delegate");
        this.LJLJJI = tlh;
    }
}
