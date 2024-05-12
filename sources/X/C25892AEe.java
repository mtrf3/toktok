package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AEe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25892AEe extends RecyclerView.ViewHolder {
    public final AI8 LJLIL;
    public final AI1 LJLILLLLZI;

    public C25892AEe(View view) {
        super(view);
        AI8 ai8 = (AI8) view;
        this.LJLIL = ai8;
        AI9 accessory = ai8.getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.CheckBox");
        AI1 ai1 = (AI1) accessory;
        this.LJLILLLLZI = ai1;
        CompoundButton compoundButton = ai1.LIZIZ.LIZ;
        if (compoundButton instanceof C71897SJp) {
            ((C71897SJp) compoundButton).setShape(1);
        }
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        Integer LJI = C79045V0n.LJI(R.attr.ci, context);
        o.LJI(LJI);
        ai8.setBackgroundColor(LJI.intValue());
    }
}
