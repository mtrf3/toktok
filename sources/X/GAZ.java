package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GAZ extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final ImageView LJLILLLLZI;

    public GAZ(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.drb);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…ncing_region_status_name)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.dr8);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…ing_region_action_delete)");
        this.LJLILLLLZI = (ImageView) findViewById2;
    }
}
