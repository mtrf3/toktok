package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4IM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IM extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJI = 0;
    public final int LJLIL;
    public final TuxTextView LJLILLLLZI;

    public C4IM(View view, int i) {
        super(view);
        this.LJLIL = i;
        View findViewById = view.findViewById(R.id.kia);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.sticker_label)");
        this.LJLILLLLZI = (TuxTextView) findViewById;
    }
}
