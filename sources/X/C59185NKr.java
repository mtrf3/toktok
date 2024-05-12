package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.NKr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59185NKr extends NM6 {
    public final C59186NKs LJLIL;
    public final C59186NKs LJLILLLLZI;

    public C59185NKr(C59186NKs c59186NKs, Context context) {
        this.LJLIL = c59186NKs;
        this.LJLILLLLZI = c59186NKs;
    }

    @Override // X.NM6, X.InterfaceC60172NjU
    public final void LLL(android.net.Uri uri, Throwable e) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(e, "e");
        C59186NKs c59186NKs = this.LJLIL;
        c59186NKs.LIZLLL(2);
        c59186NKs.LJI = false;
        if (c59186NKs.LJIIIIZZ == 0) {
            c59186NKs.LJIIIIZZ = 1;
        }
    }

    @Override // X.NM6, X.InterfaceC60172NjU
    public final void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        C59186NKs c59186NKs = this.LJLIL;
        c59186NKs.LJFF = instance;
        c59186NKs.LJ = view;
        c59186NKs.LJI = true;
        c59186NKs.LJII = false;
        this.LJLILLLLZI.LIZLLL(3);
    }
}
