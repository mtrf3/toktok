package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9YD, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9YD extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final View LJLJJI;

    public C9YD(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.eue);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.item_live_event_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.fwr);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.live_event_title)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.fwq);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.live_event_start_time)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cdn);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.divider_line)");
        this.LJLJJI = findViewById4;
    }
}
