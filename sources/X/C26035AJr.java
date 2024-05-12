package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AJr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26035AJr extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final C71897SJp LJLJI;

    public C26035AJr(View view) {
        super(view);
        this.LJLIL = view;
        View findViewById = view.findViewById(R.id.iph);
        o.LJIIIIZZ(findViewById, "viewGroup.findViewById(R.id.reason_text)");
        this.LJLILLLLZI = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.ipc);
        o.LJIIIIZZ(findViewById2, "viewGroup.findViewById(R.id.reason_check_box)");
        this.LJLJI = (C71897SJp) findViewById2;
    }
}
