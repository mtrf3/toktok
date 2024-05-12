package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.69Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69Y extends RecyclerView.ViewHolder {
    public final TextView LJLIL;

    public C69Y(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.ks2);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.subtitle_item_text)");
        this.LJLIL = (TextView) findViewById;
    }
}
