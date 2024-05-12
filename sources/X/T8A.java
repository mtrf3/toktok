package X;

import android.view.View;

/* loaded from: classes13.dex */
public final class T8A implements View.OnLongClickListener {
    public final /* synthetic */ T87 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ T86 LJLJI;

    public T8A(T87 t87, String str, T86 t86) {
        this.LJLIL = t87;
        this.LJLILLLLZI = str;
        this.LJLJI = t86;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        T84 t84 = this.LJLIL.LJLILLLLZI;
        String str = this.LJLILLLLZI;
        C74143T7z c74143T7z = this.LJLJI.LJIIIIZZ;
        t84.q00(new T7E(str, c74143T7z.LIZ, c74143T7z.LIZLLL, null));
        return true;
    }
}
