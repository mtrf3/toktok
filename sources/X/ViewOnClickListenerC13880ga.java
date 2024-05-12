package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.0ga, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC13880ga implements View.OnClickListener {
    public final View.OnClickListener LJLIL;

    public ViewOnClickListenerC13880ga(View.OnClickListener onClickListener) {
        this.LJLIL = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        C18080nM.LIZ.getClass();
        C18090nN c18090nN = null;
        C18090nN LIZLLL = C18080nM.LIZLLL(v, null);
        if (LIZLLL != null && LIZLLL.LJJIIJ) {
            c18090nN = LIZLLL;
        }
        C18080nM.LIZLLL = c18090nN;
        View.OnClickListener onClickListener = this.LJLIL;
        if (onClickListener != null) {
            onClickListener.onClick(v);
        }
    }
}
