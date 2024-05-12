package X;

import Y.IDTListenerS68S0000000_1;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4Gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC106594Gh extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final View LJLIL;
    public final TextView LJLILLLLZI;
    public final InterfaceC106584Gg LJLJI;
    public C105454Bx LJLJJI;
    public final int LJLJJL;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CommentPersonalizedEmoji commentPersonalizedEmoji;
        C105454Bx c105454Bx = this.LJLJJI;
        if (c105454Bx == null) {
            return;
        }
        if (this.LJLJJL == 2 && (commentPersonalizedEmoji = c105454Bx.LJI) != null) {
            this.LJLJI.LIZIZ(commentPersonalizedEmoji, 2, getBindingAdapterPosition());
        } else {
            this.LJLJI.LIZJ(2, getBindingAdapterPosition(), c105454Bx.LIZIZ);
        }
    }

    public ViewOnClickListenerC106594Gh(View view, InterfaceC106584Gg interfaceC106584Gg, int i, int i2, boolean z, int i3) {
        super(view);
        View findViewById = view.findViewById(R.id.cua);
        this.LJLIL = findViewById;
        TextView textView = (TextView) view.findViewById(R.id.cuu);
        this.LJLILLLLZI = textView;
        this.LJLJI = interfaceC106584Gg;
        this.LJLJJL = i3;
        C16880lQ.LJIIJ(this, findViewById);
        if (z) {
            textView.setOnTouchListener(new IDTListenerS68S0000000_1(0));
        } else {
            C78897Uxp.LJJJJLI(findViewById, null);
        }
        if (i > 0) {
            textView.getLayoutParams().height = i;
            textView.getLayoutParams().width = i;
        }
        if (i2 > 0) {
            textView.setTextSize(0, i2);
        }
    }
}
