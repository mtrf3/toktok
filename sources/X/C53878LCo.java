package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.LCo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53878LCo extends LinearLayout {
    public final ViewGroup LJLIL;
    public final C164106cI LJLILLLLZI;
    public final C8HF LJLJI;
    public final C8HF LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53878LCo(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cav, this, true);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLLIILL;
        this.LJLIL = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.j06);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.reuse_sound_avatar)");
        this.LJLILLLLZI = (C164106cI) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.j05);
        ((TextView) findViewById2).setMaxWidth((int) (C60996Nwm.LJIIJ(context) - KL2.LIZJ(context, 134.0f)));
        o.LJIIIIZZ(findViewById2, "contentView.findViewById…ext, 134f)).toInt()\n    }");
        this.LJLJI = (C8HF) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.j07);
        o.LJIIIIZZ(findViewById3, "contentView.findViewById(R.id.reuse_type)");
        this.LJLJJI = (C8HF) findViewById3;
    }

    public final void setText(int i) {
        this.LJLJJI.setText(i);
    }
}
