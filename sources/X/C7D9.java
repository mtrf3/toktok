package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7D9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7D9 extends RecyclerView.ViewHolder {
    public final TuxTextView LJLIL;
    public final TuxTextView LJLILLLLZI;

    public C7D9(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.msx);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.unbind_tv_detail)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.msr);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.unbind_bullet)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
    }
}
