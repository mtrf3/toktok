package X;

import android.app.Activity;
import android.view.KeyEvent;

/* renamed from: X.NLy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59218NLy extends AbstractC59497NWr {
    public final /* synthetic */ GHC LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59218NLy(Activity activity, GHC ghc) {
        super(activity);
        this.LJLILLLLZI = ghc;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.LJLILLLLZI.onKeyDown(i, keyEvent);
    }
}
