package X;

import Y.IDRunnableS0S0201000;
import Y.IDRunnableS0S1200000;
import Y.IDRunnableS29S0200000;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: X.1gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39601gy extends AbstractBinderC32421Pa {
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public final /* synthetic */ C17J LJLJI;

    public BinderC39601gy(C58675N1b c58675N1b) {
        this.LJLJI = c58675N1b;
    }

    @Override // X.InterfaceC10080aS
    public final void LLJLILLLLZIIL(Bundle bundle) {
        if (this.LJLJI == null) {
            return;
        }
        this.LJLILLLLZI.post(new IDRunnableS29S0200000(bundle, this, 0));
    }

    @Override // X.InterfaceC10080aS
    public final Bundle LLILZIL(Bundle bundle, String str) {
        C17J c17j = this.LJLJI;
        if (c17j == null) {
            return null;
        }
        return c17j.LJIJJ(bundle, str);
    }

    @Override // X.InterfaceC10080aS
    public final void LLLL(Bundle bundle, String str) {
        if (this.LJLJI == null) {
            return;
        }
        this.LJLILLLLZI.post(new IDRunnableS0S1200000(this, str, bundle, 0));
    }

    @Override // X.InterfaceC10080aS
    public final void LLLLILI(Bundle bundle, String str) {
        if (this.LJLJI == null) {
            return;
        }
        this.LJLILLLLZI.post(new IDRunnableS0S1200000(this, str, bundle, 1));
    }

    @Override // X.InterfaceC10080aS
    public final void g(int i, Bundle bundle) {
        if (this.LJLJI == null) {
            return;
        }
        this.LJLILLLLZI.post(new IDRunnableS0S0201000(i, bundle, this, 0));
    }

    @Override // X.InterfaceC10080aS
    public final void y0(final int i, final android.net.Uri uri, final boolean z, final Bundle bundle) {
        if (this.LJLJI == null) {
            return;
        }
        this.LJLILLLLZI.post(new Runnable() { // from class: X.002
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    BinderC39601gy.this.LJLJI.LJJJJI(i, uri, z, bundle);
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
