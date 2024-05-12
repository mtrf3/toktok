package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3sR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97673sR extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJJI = 0;
    public final TuxTextView LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final SY4 LJLJI;

    public C97673sR(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.title)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.e98);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.ic_close_button)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ltv);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.turn_on_button)");
        this.LJLJI = (SY4) findViewById3;
    }
}
