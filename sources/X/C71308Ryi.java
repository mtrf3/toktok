package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ryi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71308Ryi extends RecyclerView.ViewHolder {
    public final ViewGroup LJLIL;
    public final W5G LJLILLLLZI;
    public final ImageView LJLJI;

    public C71308Ryi(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.gx8);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.navi_avatar_list_item)");
        this.LJLIL = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.gxk);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.navi_image_view)");
        this.LJLILLLLZI = (W5G) findViewById2;
        View findViewById3 = view.findViewById(R.id.gxy);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.navi_loading_view)");
        this.LJLJI = (ImageView) findViewById3;
    }
}
