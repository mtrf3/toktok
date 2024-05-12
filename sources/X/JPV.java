package X;

import android.view.View;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JPV implements JPT {
    public final View LJLIL;
    public final boolean LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 554));
    public InterfaceC49117JPl LJLJJLL;

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    @Override // X.JPT
    public final void xe() {
        this.LJLJJI = true;
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        InterfaceC49117JPl interfaceC49117JPl = this.LJLJJLL;
        if (interfaceC49117JPl != null) {
            return interfaceC49117JPl.LJJIJIL();
        }
        return null;
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        InterfaceC49117JPl interfaceC49117JPl = this.LJLJJLL;
        if (interfaceC49117JPl != null) {
            interfaceC49117JPl.LLLLLJLJLL();
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
        InterfaceC49117JPl interfaceC49117JPl = this.LJLJJLL;
        if (interfaceC49117JPl != null) {
            interfaceC49117JPl.contextPause();
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
        InterfaceC49117JPl interfaceC49117JPl = this.LJLJJLL;
        if (interfaceC49117JPl != null) {
            interfaceC49117JPl.g9();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        InterfaceC49117JPl interfaceC49117JPl = this.LJLJJLL;
        if (interfaceC49117JPl != null) {
            return interfaceC49117JPl.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        JLU.LIZJ(this);
        InterfaceC49117JPl interfaceC49117JPl = this.LJLJJLL;
        if (interfaceC49117JPl != null) {
            interfaceC49117JPl.LLLJIL();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.JPT
    public final boolean L4() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.JPT
    public final int le() {
        return this.LJLJI;
    }

    @Override // X.JPT
    public final void Pi(int i) {
        AbstractC49155JQx abstractC49155JQx = (AbstractC49155JQx) this.LJLJJL.getValue();
        o.LJII(abstractC49155JQx, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.common.communicate.SearchMultiVideoScrollObserver");
        ((JPW) abstractC49155JQx).LJ = i;
        this.LJLJI = i;
    }

    @Override // X.JPT
    public final void o1(AbstractC49114JPi abstractC49114JPi) {
        this.LJLJJLL = abstractC49114JPi;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        if (!C46447IKt.LJLJLJ) {
            JLU.LJII(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        if (!C46447IKt.LJLJLJ) {
            JLU.LJIIIIZZ(this);
        }
        if (this.LJLILLLLZI) {
            g9();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    public JPV(View view, boolean z) {
        this.LJLIL = view;
        this.LJLILLLLZI = z;
    }
}
