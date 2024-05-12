package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Xu7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86311Xu7 implements InterfaceC53832LAu {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ Runnable LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.InterfaceC53832LAu
    public final void onSuccess() {
        C86305Xu1.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.InterfaceC53832LAu
    public final void onFailed(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C86305Xu1.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }

    public C86311Xu7(Context context, Runnable runnable, String str) {
        this.LJLIL = context;
        this.LJLILLLLZI = runnable;
        this.LJLJI = str;
    }
}
