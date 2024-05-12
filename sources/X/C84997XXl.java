package X;

import Y.ACListenerS35S0100000_15;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XXl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84997XXl extends RecyclerView.ViewHolder {
    public C72H<XYM> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84997XXl(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        TuxIconView tuxIconView = (TuxIconView) itemView.findViewById(R.id.luu);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS35S0100000_15(this, 1));
        }
    }
}
