package X;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.VjS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80554VjS extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final C80539VjD LJLILLLLZI;

    public C80554VjS(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.gm1);
        this.LJLIL = textView;
        h0.LJIJJ(textView, true);
        this.LJLILLLLZI = (C80539VjD) linearLayout.findViewById(R.id.glv);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
