package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MSZ extends C56906MVa {
    public final C73305Spp LJLIL;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    public MSZ(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.cvo);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.empty_status_view)");
        this.LJLIL = (C73305Spp) findViewById;
    }
}
