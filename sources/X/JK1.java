package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class JK1 implements N6B {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC48975JJz LIZ;

    @Override // X.N6B
    public final void LIZ() {
        JGI core;
        C48887JGp c48887JGp = this.LIZ.LJLLL;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null) {
            JIC.LIZ(core);
        }
    }

    @Override // X.N6B
    public final void LIZIZ() {
        JGI core;
        C48887JGp c48887JGp = this.LIZ.LJLLL;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null) {
            core.LLLLLJLJLL();
        }
    }

    @Override // X.N6B
    public final void LIZJ() {
        this.LIZ.T();
    }

    @Override // X.N6B
    public final ViewGroup LIZLLL() {
        return this.LIZ.LLFF;
    }

    @Override // X.N6B
    public final TuxTextView LJ() {
        return this.LIZ.LJZ;
    }

    @Override // X.N6B
    public final ViewGroup LJFF() {
        ViewOnAttachStateChangeListenerC48975JJz viewOnAttachStateChangeListenerC48975JJz = this.LIZ;
        if (viewOnAttachStateChangeListenerC48975JJz.LJLLILLLL == 0) {
            return viewOnAttachStateChangeListenerC48975JJz.LLF;
        }
        return viewOnAttachStateChangeListenerC48975JJz.LL;
    }

    @Override // X.InterfaceC58801N5x
    public final Aweme getAweme() {
        return this.LIZ.LJLL;
    }

    @Override // X.InterfaceC58801N5x
    public final Context getContext() {
        return this.LIZ.itemView.getContext();
    }

    public JK1(ViewOnAttachStateChangeListenerC48975JJz viewOnAttachStateChangeListenerC48975JJz) {
        this.LIZ = viewOnAttachStateChangeListenerC48975JJz;
    }
}
