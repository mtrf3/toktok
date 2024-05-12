package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XY2 extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final View LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XY2(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.aw4);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.btn_extract_music)");
        this.LJLIL = findViewById;
        View findViewById2 = itemView.findViewById(R.id.awp);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.btn_import_music)");
        this.LJLILLLLZI = findViewById2;
    }
}
