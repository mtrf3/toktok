package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: X.Fd9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39395Fd9 implements InterfaceC37126Ehe {
    public final WeakReference<Context> LJLIL;
    public final /* synthetic */ Locale LJLILLLLZI;
    public final /* synthetic */ InterfaceC39397FdB LJLJI;

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String str, boolean z, int i) {
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String str, boolean z) {
        Context context = this.LJLIL.get();
        if (context != null && !z) {
            C39393Fd7.LIZ(context, this.LJLILLLLZI);
            InterfaceC39397FdB interfaceC39397FdB = this.LJLJI;
            if (interfaceC39397FdB != null) {
                interfaceC39397FdB.LLJJ();
            }
        }
    }

    public C39395Fd9(Context context, Locale locale, C39400FdE c39400FdE) {
        this.LJLILLLLZI = locale;
        this.LJLJI = c39400FdE;
        this.LJLIL = new WeakReference<>(context);
    }
}
