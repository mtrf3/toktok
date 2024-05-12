package X;

import android.os.Build;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* renamed from: X.28M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C28M extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public final /* synthetic */ C37931eH LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28M(C37931eH c37931eH) {
        super(0);
        this.LJLIL = c37931eH;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        if (Build.VERSION.SDK_INT < 28) {
            return new Handler(C16880lQ.LLJJJJ(), this.LJLIL.LJLJJI);
        }
        Handler createAsync = Handler.createAsync(C16880lQ.LLJJJJ(), this.LJLIL.LJLJJI);
        o.LJIIIIZZ(createAsync, "createAsync(Looper.getMainLooper(), retryCallback)");
        return createAsync;
    }
}
