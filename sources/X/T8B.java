package X;

import android.view.View;

/* loaded from: classes13.dex */
public final class T8B implements View.OnLongClickListener {
    public final /* synthetic */ T88 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C74143T7z LJLJI;
    public final /* synthetic */ C74125T7h LJLJJI;

    public T8B(T88 t88, String str, C74143T7z c74143T7z, C74125T7h c74125T7h) {
        this.LJLIL = t88;
        this.LJLILLLLZI = str;
        this.LJLJI = c74143T7z;
        this.LJLJJI = c74125T7h;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        T84 t84 = this.LJLIL.LJLILLLLZI;
        String str = this.LJLILLLLZI;
        C74143T7z c74143T7z = this.LJLJI;
        t84.q00(new T7E(str, c74143T7z.LIZ, c74143T7z.LIZLLL, ((T8C) this.LJLJJI).LJIIIZ));
        return true;
    }
}
