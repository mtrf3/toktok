package X;

import Y.ACListenerS35S0300000_9;
import Y.IDCListenerS300S0100000_9;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Mj0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57594Mj0 extends RecyclerView.ViewHolder {
    public final C39661h4 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57594Mj0(View view, RecSwipeViewModel vm) {
        super(view);
        o.LJIIIZ(vm, "vm");
        C39661h4 c39661h4 = new C39661h4(this.itemView, C17T.LJIIL);
        C00Q c00q = new C00Q();
        c00q.LJIIIIZZ = 0.0f;
        c00q.LIZ(0.5f);
        c00q.LIZIZ(200.0f);
        c39661h4.LJIL = c00q;
        this.LJLIL = c39661h4;
        view.setOnLongClickListener(new IDCListenerS300S0100000_9(vm, 9));
        C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.akq), new ACListenerS35S0300000_9(view, vm, this, 6));
    }
}
