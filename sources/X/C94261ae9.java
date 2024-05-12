package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ae9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94261ae9 extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final TextView LJLILLLLZI;

    public C94261ae9(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.nnt);
        o.LJIIIIZZ(findViewById, "item.findViewById(R.id.iv_trigger_item)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.nq8);
        o.LJIIIIZZ(findViewById2, "item.findViewById(R.id.tv_trigger_item)");
        this.LJLILLLLZI = (TextView) findViewById2;
    }
}
