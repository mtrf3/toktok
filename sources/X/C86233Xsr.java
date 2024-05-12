package X;

import Y.ARunnableS34S0200000_15;
import Y.ARunnableS6S1101000_15;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback;
import java.lang.ref.WeakReference;

/* renamed from: X.Xsr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86233Xsr extends AbstractC86235Xst {
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ IChooseMediaResultCallback LJLJI;

    @Override // X.InterfaceC86245Xt3
    public final void LIZIZ(C86242Xt0 c86242Xt0) {
        this.LJLILLLLZI.runOnUiThread(new ARunnableS34S0200000_15(this.LJLJI, c86242Xt0, 38));
    }

    @Override // X.InterfaceC86245Xt3
    public final void LIZ(int i, String str) {
        this.LJLILLLLZI.runOnUiThread(new ARunnableS6S1101000_15(this.LJLJI, i, str, 2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86233Xsr(Activity activity, IChooseMediaResultCallback iChooseMediaResultCallback, WeakReference<Context> weakReference) {
        super(weakReference);
        this.LJLILLLLZI = activity;
        this.LJLJI = iChooseMediaResultCallback;
    }
}
