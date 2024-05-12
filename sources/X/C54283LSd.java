package X;

import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.LSd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54283LSd extends RelativeLayout implements InterfaceC54804Lf6 {
    public final View LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;

    public final View getView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54283LSd(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        View LIZ = C7F6.LIZ(C55723Ltv.LIZIZ.LJIIIIZZ(), "story_layout_arch_guide", context, R.layout.coh, null, this, true, 8);
        this.LJLIL = LIZ;
        C16880lQ.LJJJ((TuxIconView) LIZ.findViewById(R.id.f0h), new ACListenerS29S0100000_9(this, 144));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 145), LIZ);
        View findViewById = LIZ.findViewById(R.id.f0h);
        o.LJIIIIZZ(findViewById, "view.iv_close");
        h0.LJIJI(findViewById, new C54282LSc(this));
    }

    @Override // X.InterfaceC54804Lf6
    public final void LIZ(boolean z) {
        int i = 0;
        this.LJLIL.findViewById(R.id.lfk).setVisibility(0);
        View findViewById = this.LJLIL.findViewById(R.id.aqd);
        if (z) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    @Override // X.InterfaceC54804Lf6
    public final void LIZIZ(AqS159S0100000_9 aqS159S0100000_9, AqS159S0100000_9 aqS159S0100000_92) {
        this.LJLILLLLZI = aqS159S0100000_9;
        this.LJLJI = aqS159S0100000_92;
    }
}
