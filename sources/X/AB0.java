package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;

/* loaded from: classes5.dex */
public final class AB0<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public AB0(boolean z, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (!this.LJLIL) {
            SharePrefCache.inst().getSelectedTranslationLanguage().LIZLLL(this.LJLILLLLZI);
            Y01.LIZIZ.LJJ(this.LJLILLLLZI);
        }
    }
}
