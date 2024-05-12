package X;

import android.view.View;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JIt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48943JIt implements InterfaceC48945JIv {
    public final JUK LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.InterfaceC48908JHk
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

    @Override // X.InterfaceC48945JIv
    public final C48881JGj v() {
        return null;
    }

    public final C48941JIr LIZ() {
        return (C48941JIr) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC48945JIv
    public final C48912JHo LLLIIII() {
        return (C48912JHo) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC48908JHk
    public final void LLLLLJLJLL() {
        LIZ().LLLLLJLJLL();
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48908JHk
    public final void contextPause() {
        LIZ().contextPause();
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return LIZ().isPlaying();
    }

    @Override // X.InterfaceC48908JHk
    public final void onDestroy() {
        LIZ().onDestroy();
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    public C48943JIt(JUK liveHolder) {
        o.LJIIIZ(liveHolder, "liveHolder");
        this.LJLIL = liveHolder;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 488));
        this.LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 487));
    }

    @Override // X.InterfaceC48908JHk
    public final void LLLLII(long j) {
        LIZ().LLLLII(j);
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
}
