package X;

import Y.ACListenerS27S0300000_1;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3mG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93843mG extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final ConstraintLayout LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxIconView LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93843mG(View view, C99033ud c99033ud, InterfaceC65784Pro<C76800UCe> onClickItem) {
        super(view);
        o.LJIIIZ(onClickItem, "onClickItem");
        this.LJLIL = view;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.bc5);
        this.LJLILLLLZI = constraintLayout;
        this.LJLJI = (TuxTextView) view.findViewById(R.id.lxe);
        this.LJLJJI = (TuxTextView) view.findViewById(R.id.lwm);
        this.LJLJJL = (TuxIconView) view.findViewById(R.id.ea9);
        C16880lQ.LJIL(constraintLayout, new ACListenerS27S0300000_1(c99033ud, this, onClickItem, 15));
    }
}
