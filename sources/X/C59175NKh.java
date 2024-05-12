package X;

import X.AbstractC59184NKq;
import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.NKh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59175NKh<T extends AbstractC59184NKq> extends NM4 {
    public final T LJLIL;

    @Override // X.AbstractC60673NrZ
    public void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        T t = this.LJLIL;
        t.LJ = view.LIZJ();
        if (t.LJIIIZ == 1) {
            t.LJI = false;
            t.LJIIIZ = 0;
        } else {
            t.LJI = true;
            t.LJII = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C59175NKh(AbstractC59184NKq cacheModel, Context context) {
        o.LJIIIZ(cacheModel, "cacheModel");
        this.LJLIL = cacheModel;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        this.LJLIL.LJIIIZ = 0;
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        T t = this.LJLIL;
        t.LIZLLL(2);
        t.LJI = false;
        if (t.LJIIIIZZ == 0) {
            t.LJIIIIZZ = 1;
        }
        t.LJIIIZ = 1;
    }
}
