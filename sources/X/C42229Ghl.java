package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ghl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42229Ghl extends AbstractC42166Ggk {
    public final /* synthetic */ TLI LJLJJI;

    @Override // X.AbstractC42166Ggk
    public final void LJZ(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        this.LJLJJI.LJJIIZI(holder);
    }

    @Override // X.AbstractC42166Ggk
    public final RecyclerView.ViewHolder LJZI(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        this.LJLJJI.getClass();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.cs1, parent, false);
        TextView text = (TextView) LLLLIILL.findViewById(R.id.khv);
        o.LJIIIIZZ(text, "text");
        return new C42230Ghm(LLLLIILL, text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42229Ghl(TLI tli, AbstractC029409q<RecyclerView.ViewHolder> delegate) {
        super(delegate);
        o.LJIIIZ(delegate, "delegate");
        this.LJLJJI = tli;
    }
}
