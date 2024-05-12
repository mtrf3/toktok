package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3XL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XL extends RecyclerView.ViewHolder {
    public final C62846OlW LJLIL;
    public final TuxTextView LJLILLLLZI;

    public C3XL(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.cu4);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.emoji_cell)");
        this.LJLIL = (C62846OlW) findViewById;
        View findViewById2 = view.findViewById(R.id.cus);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.emoji_text)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
    }
}
