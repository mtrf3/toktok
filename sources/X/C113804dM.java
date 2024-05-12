package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4dM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113804dM extends RecyclerView.ViewHolder {
    public final C119604mi LJLIL;
    public final TuxTextView LJLILLLLZI;
    public InterfaceC62225ObV LJLJI;

    public C113804dM(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.jsx);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.share_channel_icon)");
        this.LJLIL = (C119604mi) findViewById;
        View findViewById2 = view.findViewById(R.id.jsy);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.share_channel_label)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
    }
}
