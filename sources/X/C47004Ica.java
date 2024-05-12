package X;

import android.os.HandlerThread;
import kotlin.jvm.internal.o;

/* renamed from: X.Ica, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47004Ica extends C47007Icd {
    public volatile boolean LJIJJLI;
    public volatile boolean LJIL;

    @Override // X.IX7
    public final void LIZLLL() {
        super.LIZLLL();
        this.LJIL = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47004Ica(ITZ playerType, HandlerThread handlerThread, IZ7 iz7, ITX itx) {
        super(playerType, handlerThread, null, iz7, itx, false);
        o.LJIIIZ(playerType, "playerType");
    }
}
