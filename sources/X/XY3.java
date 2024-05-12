package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XY3 extends RecyclerView.ViewHolder {
    public final View LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XY3(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.aw4);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.btn_extract_music)");
        this.LJLIL = findViewById;
    }
}
