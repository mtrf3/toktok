package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ABR extends RecyclerView.ViewHolder {
    public final TuxTextView LJLIL;
    public final ImageView LJLILLLLZI;

    public ABR(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.m_t);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_left_content)");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.LJLIL = tuxTextView;
        View findViewById2 = view.findViewById(R.id.f_9);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_right_selected)");
        this.LJLILLLLZI = (ImageView) findViewById2;
        tuxTextView.setTextColor(C04330Ez.LIZIZ(view.getContext(), R.color.bi));
    }
}
