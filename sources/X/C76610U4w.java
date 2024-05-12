package X;

import Y.ARunnableS32S0200000_13;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.U4w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76610U4w implements TW7 {
    public final InterfaceC88472Yns<C28272B7s, C76800UCe> LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(true);
    public C28272B7s LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C76610U4w(InterfaceC88472Yns<? super C28272B7s, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.TW7
    public final void onSei(C28272B7s c28272B7s) {
        this.LIZJ = c28272B7s;
        if (!this.LIZIZ.get()) {
            return;
        }
        C38995FSd.LIZLLL().execute(new ARunnableS32S0200000_13(this, c28272B7s, 55));
    }
}
