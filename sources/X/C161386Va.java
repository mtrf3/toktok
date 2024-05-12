package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6Va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161386Va extends RecyclerView.ViewHolder {
    public final SmartImageView LJLIL;
    public final View LJLILLLLZI;

    public C161386Va(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.ei9);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.image_thumb)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.jm_);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.selected)");
        this.LJLILLLLZI = findViewById2;
    }
}
