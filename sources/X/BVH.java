package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class BVH extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final TextView LJLILLLLZI;
    public final View LJLJI;
    public final Context LJLJJI;
    public final /* synthetic */ BV9 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BVH(BV9 bv9, Context context, View view) {
        super(view);
        this.LJLJJL = bv9;
        this.LJLJI = view;
        this.LJLJJI = context;
        this.LJLIL = (TextView) view.findViewById(R.id.bst);
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.title);
    }
}
