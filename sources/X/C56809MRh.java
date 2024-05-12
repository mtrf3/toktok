package X;

import Y.ACListenerS44S0200000_9;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MRh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56809MRh extends C56906MVa {
    public final TuxTextView LJLIL;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56809MRh(View view, InterfaceC56771MPv vm) {
        super(view);
        o.LJIIIZ(vm, "vm");
        View findViewById = view.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_name)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.m8z);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_info)");
        C16880lQ.LJJJ((TuxIconView) findViewById2, new ACListenerS44S0200000_9(vm, this, 15));
    }
}
