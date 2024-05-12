package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3dH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88273dH extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final AI8 LJLILLLLZI;
    public final AI2 LJLJI;

    public C88273dH(View view) {
        super(view);
        this.LJLIL = view;
        View findViewById = view.findViewById(R.id.jby);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.scope)");
        AI8 ai8 = (AI8) findViewById;
        this.LJLILLLLZI = ai8;
        AI9 accessory = ai8.getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        this.LJLJI = (AI2) accessory;
        ai8.setOnClickListener(new AqS167S0100000_1(this, 0));
    }
}
