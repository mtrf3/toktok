package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MQT extends C56906MVa {
    public final TextView LJLIL;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MQT(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.mjc);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_see_all)");
        this.LJLIL = (TextView) findViewById;
        o.LJIIIIZZ(itemView.findViewById(R.id.j4a), "itemView.findViewById(R.id.rl_collapse_view)");
    }
}
