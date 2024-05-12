package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class I6H extends WM7 implements InterfaceC46100I7k, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;

    public final void hide() {
        if (this.LJLILLLLZI.isShowing(this)) {
            this.LJLILLLLZI.hide(this);
        }
    }

    public final void show() {
        if (!this.LJLILLLLZI.isAdded(this)) {
            this.LJLILLLLZI.add(this.LJLJI, this, getTag());
        }
        if (!this.LJLILLLLZI.isShowing(this)) {
            this.LJLILLLLZI.show(this);
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public I6H(C82622Wbi diContainer, I6N parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
    }
}
