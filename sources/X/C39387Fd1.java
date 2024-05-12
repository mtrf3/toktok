package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: X.Fd1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39387Fd1 implements InterfaceC37126Ehe {
    public final WeakReference<Context> LJLIL;
    public final /* synthetic */ Locale LJLILLLLZI;
    public final /* synthetic */ InterfaceC39390Fd4 LJLJI;

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String str, boolean z, int i) {
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String str, boolean z) {
        Context context = this.LJLIL.get();
        if (context != null && !z) {
            C39386Fd0.LIZLLL(context, this.LJLILLLLZI, true);
            InterfaceC39390Fd4 interfaceC39390Fd4 = this.LJLJI;
            if (interfaceC39390Fd4 != null) {
                ((C39575Fg3) interfaceC39390Fd4).LIZ();
            }
        }
    }

    public C39387Fd1(Context context, Locale locale, C39575Fg3 c39575Fg3) {
        this.LJLILLLLZI = locale;
        this.LJLJI = c39575Fg3;
        this.LJLIL = new WeakReference<>(context);
    }
}
