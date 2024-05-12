package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BVC extends RecyclerView.ViewHolder {
    public final C47121t6 LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final /* synthetic */ BV8 LJLJI;

    public final void L() {
        this.LJLILLLLZI.setText(R.string.mse);
        this.LJLIL.setText(R.string.ms_);
        if (C1DH.LJJIIJZLJL(this.LJLJI.LJZ)) {
            C29306Beo.LJI(this.itemView.findViewById(R.id.e3i));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BVC(BV8 bv8, View view, Context context) {
        super(view);
        this.LJLJI = bv8;
        View findViewById = view.findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content)");
        this.LJLIL = (C47121t6) findViewById;
        View findViewById2 = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.title)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
    }
}
