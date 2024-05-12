package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MUe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56884MUe extends C56906MVa {
    public final TextView LJLIL;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    public C56884MUe(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.mnl);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_time_head)");
        this.LJLIL = (TextView) findViewById;
    }
}
