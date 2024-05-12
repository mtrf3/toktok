package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ABT extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final TuxIconView LJLILLLLZI;

    public ABT(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.m_t);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_left_content)");
        TextView textView = (TextView) findViewById;
        this.LJLIL = textView;
        View findViewById2 = view.findViewById(R.id.f_9);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_right_selected)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
        Integer LIZIZ = C19N.LIZIZ(view, "itemView.context", R.attr.do);
        if (LIZIZ != null) {
            textView.setTextColor(LIZIZ.intValue());
        }
    }
}
