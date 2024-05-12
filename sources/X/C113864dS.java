package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4dS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113864dS extends RecyclerView.ViewHolder {
    public final C119604mi LJLIL;
    public final TuxTextView LJLILLLLZI;
    public InterfaceC62225ObV LJLJI;
    public final int LJLJJI;

    public C113864dS(View view, int i) {
        super(view);
        this.LJLJJI = i;
        this.LJLIL = (C119604mi) view.findViewById(R.id.jsx);
        View findViewById = view.findViewById(R.id.jsy);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.share_channel_label)");
        this.LJLILLLLZI = (TuxTextView) findViewById;
    }
}
