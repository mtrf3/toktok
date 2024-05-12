package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GAo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41086GAo extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final ImageView LJLILLLLZI;

    public C41086GAo(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.dr9);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…cing_region_control_name)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.dr_);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…_region_control_selected)");
        this.LJLILLLLZI = (ImageView) findViewById2;
    }
}
