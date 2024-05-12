package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class BVF extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final Context LJLILLLLZI;
    public final ViewGroup LJLJI;
    public final View LJLJJI;
    public final /* synthetic */ BV9 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BVF(BV9 bv9, Context context, View view) {
        super(view);
        this.LJLJJL = bv9;
        this.LJLILLLLZI = context;
        this.LJLIL = (TextView) view.findViewById(R.id.e3i);
        this.LJLJI = (ViewGroup) view.findViewById(R.id.e42);
        this.LJLJJI = view.findViewById(R.id.hbc);
    }
}
