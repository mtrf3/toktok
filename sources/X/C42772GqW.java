package X;

import Y.ACListenerS42S0200000_7;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GqW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42772GqW extends AbstractC42769GqT<String, C42772GqW>.a {
    public final TextView LJLIL;

    public C42772GqW(C42773GqX c42773GqX, View view) {
        super(c42773GqX, view);
        this.LJLIL = (TextView) view.findViewById(R.id.e64);
        C16880lQ.LJIILLIIL((ImageView) view.findViewById(R.id.e63), new ACListenerS42S0200000_7(c42773GqX, this, 46));
    }
}
