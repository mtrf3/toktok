package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y8G extends F9E {
    public final Y88 LJLIL;
    public final SH7 LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public Y8G(Y88 uploadController, SH7 uploadListener) {
        o.LJIIIZ(uploadController, "uploadController");
        o.LJIIIZ(uploadListener, "uploadListener");
        this.LJLIL = uploadController;
        this.LJLILLLLZI = uploadListener;
    }
}
