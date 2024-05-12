package X;

import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.8Ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212788Ws extends AbstractC65781Prl implements InterfaceC65784Pro<HandlerC212798Wt> {
    public static final C212788Ws INSTANCE = new C212788Ws();

    public C212788Ws() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final HandlerC212798Wt invoke() {
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "getMainLooper()");
        return new HandlerC212798Wt(LLJJJJ);
    }
}
