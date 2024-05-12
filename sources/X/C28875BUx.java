package X;

import Y.ACListenerS40S0200000_5;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BUx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28875BUx extends RecyclerView.ViewHolder {
    public final Context LJLIL;
    public final /* synthetic */ BV8 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28875BUx(BV8 bv8, View view, Context context) {
        super(view);
        this.LJLILLLLZI = bv8;
        this.LJLIL = context;
        J9A.LIZJ(C28787BRn.LIZ("livesdk_anchor_qa_quick_mode_entrance_show"), bv8.LJZ, "qa_suggest_tab", "enter_from");
        if (BV1.LJ(bv8.LJZ)) {
            ((TextView) view.findViewById(R.id.ijp)).setText(R.string.msq);
        }
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(bv8, this, 52), view);
    }
}
