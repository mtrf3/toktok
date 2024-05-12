package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GqF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42755GqF extends AbstractC42769GqT<AnchorModule, C42755GqF>.a {
    public final TextView LJLIL;

    public C42755GqF(C42750GqA c42750GqA, View view) {
        super(c42750GqA, view);
        View findViewById = view.findViewById(R.id.mse);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.txt_title)");
        this.LJLIL = (TextView) findViewById;
    }
}
