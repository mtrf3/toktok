package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ghy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42242Ghy extends RecyclerView.ViewHolder {
    public final SmartImageView LJLIL;
    public final C71897SJp LJLILLLLZI;

    public C42242Ghy(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.ho4);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.photo_holder)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.ho2);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.photo_checkbox)");
        this.LJLILLLLZI = (C71897SJp) findViewById2;
    }
}
