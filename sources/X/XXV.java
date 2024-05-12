package X;

import Y.ACListenerS35S0100000_15;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class XXV extends XYS {
    public final RecyclerView LJLILLLLZI;
    public C84991XXf LJLJI;
    public C85025XYn LJLJJI;

    public XXV(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.moa);
        TextView textView2 = (TextView) view.findViewById(R.id.mo9);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.j9k);
        this.LJLILLLLZI = recyclerView;
        textView2.setText(view.getContext().getText(R.string.iir));
        recyclerView.LJII(new XYF((int) KL2.LIZJ(view.getContext(), 16.0f)), -1);
        C16880lQ.LJIJI(textView, new ACListenerS35S0100000_15(this, 291));
        view.getContext();
        recyclerView.setLayoutManager(new WrapGridLayoutManager(2));
        if (textView instanceof TuxTextView) {
            ((TuxTextView) textView).setTuxFont(62);
        }
    }
}
