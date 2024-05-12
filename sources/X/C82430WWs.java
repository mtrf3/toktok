package X;

import android.view.KeyEvent;

/* renamed from: X.WWs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82430WWs implements C5HC {
    public final /* synthetic */ AbstractC82428WWq<C0I6, AbstractC56012Ht<Object, Object>, Object, Object> LJLIL;

    public C82430WWs(AbstractC82428WWq<C0I6, AbstractC56012Ht<Object, Object>, Object, Object> abstractC82428WWq) {
        this.LJLIL = abstractC82428WWq;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return this.LJLIL.LLIILZL();
        }
        return false;
    }
}
