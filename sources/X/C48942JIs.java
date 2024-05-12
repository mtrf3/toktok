package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.JIs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48942JIs implements InterfaceC48908JHk {
    public JUK LJLIL;
    public C48941JIr LJLILLLLZI;

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

    @Override // X.InterfaceC48908JHk
    public final void LLLLLJLJLL() {
        C48941JIr c48941JIr = this.LJLILLLLZI;
        if (c48941JIr != null) {
            c48941JIr.LLLLLJLJLL();
        }
    }

    @Override // X.InterfaceC48908JHk
    public final void contextPause() {
        C48941JIr c48941JIr = this.LJLILLLLZI;
        if (c48941JIr != null) {
            c48941JIr.contextPause();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        C48941JIr c48941JIr = this.LJLILLLLZI;
        if (c48941JIr != null) {
            return c48941JIr.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC48908JHk
    public final void onDestroy() {
        C48941JIr c48941JIr = this.LJLILLLLZI;
        if (c48941JIr != null) {
            c48941JIr.onDestroy();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    public final void LIZ(InterfaceC65784Pro<JUK> interfaceC65784Pro) {
        JUK invoke = interfaceC65784Pro.invoke();
        this.LJLIL = invoke;
        this.LJLILLLLZI = new C48941JIr(this.LJLIL, invoke.getDataProvider());
    }

    @Override // X.InterfaceC48908JHk
    public final void LLLLII(long j) {
        C48941JIr c48941JIr = this.LJLILLLLZI;
        if (c48941JIr != null) {
            c48941JIr.LLLLII(j);
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
}
