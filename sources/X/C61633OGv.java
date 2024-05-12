package X;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OGv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61633OGv extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final TextView LJLILLLLZI;
    public final ImageView LJLJI;

    public C61633OGv(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.bda);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.cl_music_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.mbn);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_music_group)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.e9s);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.ic_music_selector)");
        this.LJLJI = (ImageView) findViewById3;
        if (Build.VERSION.SDK_INT >= 23) {
            findViewById.setForeground(C04270Et.LIZIZ(findViewById.getContext(), R.drawable.c7k));
        } else {
            C7FA.LIZIZ(findViewById);
        }
    }
}
