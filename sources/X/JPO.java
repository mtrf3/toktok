package X;

import android.view.View;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class JPO extends JNU implements JPT {
    public final boolean LJLJL;
    public final C62822Ol8 LJLJLJ;

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
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

    public final JPT P() {
        return (JPT) this.LJLJLJ.getValue();
    }

    @Override // X.JPT
    public final boolean L4() {
        return P().L4();
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return P().LJJIJIL();
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        P().LLLJIL();
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        P().LLLLLJLJLL();
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
        P().contextPause();
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
        P().g9();
    }

    @Override // X.JPT
    public final int le() {
        return P().le();
    }

    @Override // X.JPT
    public final void xe() {
        P().xe();
    }

    @Override // X.InterfaceC49148JQq
    public void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JPO(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLJL = true;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS155S0200000_8(itemView, this, 34));
    }

    @Override // X.JPT
    public final void Pi(int i) {
        P().Pi(i);
    }

    @Override // X.JPT
    public final void o1(AbstractC49114JPi abstractC49114JPi) {
        P().o1(abstractC49114JPi);
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        super.onViewAttachedToWindow(v);
        P().onViewAttachedToWindow(v);
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        super.onViewDetachedFromWindow(v);
        P().onViewDetachedFromWindow(v);
    }

    @Override // X.InterfaceC49148JQq
    public void y(long j) {
        C48905JHh.LIZJ(this, j);
    }
}
