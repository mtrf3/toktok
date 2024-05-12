package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7FS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7FS extends RecyclerView.ViewHolder {
    public final TuxIconView LJLIL;
    public final TextView LJLILLLLZI;

    public C7FS(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.gmi);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.more_item_icon)");
        this.LJLIL = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.gmj);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.more_item_text)");
        this.LJLILLLLZI = (TextView) findViewById2;
    }
}
