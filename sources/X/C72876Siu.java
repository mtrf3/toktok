package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Siu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72876Siu extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final View LJLILLLLZI;

    public C72876Siu(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.l76);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.thumbnail_image_view)");
        this.LJLIL = (ImageView) findViewById;
        this.LJLILLLLZI = view;
    }
}
