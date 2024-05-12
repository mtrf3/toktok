package X;

import Y.ACListenerS35S0100000_15;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XXk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84996XXk extends RecyclerView.ViewHolder {
    public C72H<XYM> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84996XXk(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        TuxTextView tuxTextView = (TuxTextView) itemView.findViewById(R.id.lvb);
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 0));
        }
    }
}
