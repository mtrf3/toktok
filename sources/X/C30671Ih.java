package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30671Ih extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final View LJLILLLLZI;

    public C30671Ih(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.egd);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.image)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.jl2);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.select_border)");
        this.LJLILLLLZI = findViewById2;
        if (U4D.LIZ()) {
            findViewById2.setBackgroundResource(R.drawable.cr5);
        }
    }
}
