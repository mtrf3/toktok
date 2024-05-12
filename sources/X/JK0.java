package X;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class JK0 implements NIS {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC48975JJz LIZ;

    @Override // X.NIS
    public final ViewGroup LJIIL() {
        return this.LIZ.LLFF;
    }

    @Override // X.NIS
    public final void LJIJ() {
        JGI core;
        C48887JGp c48887JGp = this.LIZ.LJLLL;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null) {
            core.LLLLLJLJLL();
        }
    }

    @Override // X.NIS
    public final ViewGroup LJIJI() {
        ViewOnAttachStateChangeListenerC48975JJz viewOnAttachStateChangeListenerC48975JJz = this.LIZ;
        if (viewOnAttachStateChangeListenerC48975JJz.LJLLILLLL == 0) {
            return viewOnAttachStateChangeListenerC48975JJz.LLF;
        }
        return viewOnAttachStateChangeListenerC48975JJz.LL;
    }

    @Override // X.NIS
    public final void LJJJI() {
        JGI core;
        C48887JGp c48887JGp = this.LIZ.LJLLL;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null) {
            JIC.LIZ(core);
        }
    }

    @Override // X.NIS
    public final Context getContext() {
        return this.LIZ.itemView.getContext();
    }

    @Override // X.NIS
    public final String getEnterFrom() {
        JQA jqa = this.LIZ.LLFFF;
        if (jqa != null) {
            return jqa.LJFF;
        }
        return null;
    }

    @Override // X.NIS
    public final void LJIIJJI() {
        JHI.LIZ().LJII = 53;
        this.LIZ.T();
    }

    @Override // X.NIS
    public final void LJIILJJIL() {
        JHI.LIZ().LJII = 54;
        this.LIZ.T();
    }

    public JK0(ViewOnAttachStateChangeListenerC48975JJz viewOnAttachStateChangeListenerC48975JJz) {
        this.LIZ = viewOnAttachStateChangeListenerC48975JJz;
    }
}
