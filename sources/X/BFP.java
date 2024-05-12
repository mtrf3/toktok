package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BFP extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final View LJLILLLLZI;

    public BFP(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.n4v);
        o.LJIIIIZZ(findViewById, "itemView.findViewById<ImageView>(R.id.video_cover)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.i21);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById<Im…R.id.preview_border_view)");
        this.LJLILLLLZI = findViewById2;
    }
}
