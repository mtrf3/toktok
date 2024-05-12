package X;

import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ASF implements ASH {
    public final /* synthetic */ TuxSheet LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // X.ASH
    public final void LIZ(AS4 action) {
        o.LJIIIZ(action, "action");
        ASB asb = action.LIZIZ;
        o.LJII(asb, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.action.DislikeReasonAction");
        AS8 as8 = action.LIZ;
        this.LJLIL.dismiss();
        ((C26264ASm) asb).LJ(this.LJLILLLLZI, as8);
    }

    public ASF(TuxSheet tuxSheet, View view) {
        this.LJLIL = tuxSheet;
        this.LJLILLLLZI = view;
    }
}
