package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AB9 extends RecyclerView.ViewHolder {
    public final AI8 LJLIL;
    public final C25991AHz LJLILLLLZI;

    public AB9(View view) {
        super(view);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "context");
        C25991AHz c25991AHz = new C25991AHz(context);
        this.LJLILLLLZI = c25991AHz;
        ((AI8) view.findViewById(R.id.b85)).setAccessory(c25991AHz);
        View findViewById = view.findViewById(R.id.b85);
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.ci, context2);
        o.LJI(LJI);
        findViewById.setBackgroundColor(LJI.intValue());
        AI8 cell = (AI8) view.findViewById(R.id.b85);
        o.LJIIIIZZ(cell, "cell");
        this.LJLIL = cell;
    }
}
