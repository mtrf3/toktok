package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KD8 extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJI = 0;
    public final View LJLIL;
    public final TextView LJLILLLLZI;

    public KD8(View view) {
        super(view);
        this.LJLIL = view;
        View findViewById = view.findViewById(R.id.jdo);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.search_acc_sug_title)");
        this.LJLILLLLZI = (TextView) findViewById;
    }
}
