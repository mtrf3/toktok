package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BGA extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final C47121t6 LJLILLLLZI;

    public BGA(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.l02);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tag_image)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.kzx);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tag_content)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
    }
}
