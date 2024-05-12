package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KT0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ JYG LJLJI;

    public KT0(Context context, View view, JYG jyg) {
        this.LJLIL = context;
        this.LJLILLLLZI = view;
        this.LJLJI = jyg;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface it) {
        Activity LIZ = C27740Aue.LIZ(this.LJLIL);
        if (LIZ != null) {
            KeyboardUtils.LJ(3, 15, LIZ);
        }
        o.LJIIIIZZ(it, "it");
        AST LJIIIIZZ = ASQ.LJIIIIZZ(it);
        if (!o.LJ(LJIIIIZZ, KT7.LIZ)) {
            C51757KSz.LJFF(this.LJLILLLLZI, false);
            if (!o.LJ(LJIIIIZZ, KT8.LIZ)) {
                C51757KSz.LJ(this.LJLJI, C17N.LJJJJLL(), "close");
            }
        }
    }
}
