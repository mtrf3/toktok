package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.IDlS18S0200000_7;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GT9 extends RecyclerView.ViewHolder {
    public final GT8 LJLIL;
    public final TuxTextView LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GT9(View view, GT8 onItemClickListener) {
        super(view);
        o.LJIIIZ(onItemClickListener, "onItemClickListener");
        this.LJLIL = onItemClickListener;
        this.LJLILLLLZI = (TuxTextView) view.findViewById(R.id.m9r);
        C16880lQ.LJIIJ(new IDlS18S0200000_7(this, view, 1), view);
    }
}
