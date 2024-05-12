package X;

import android.app.Activity;
import android.view.KeyEvent;
import com.zhiliaoapp.musically.R;

/* renamed from: X.NXt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59525NXt extends AbstractC59497NWr {
    public final /* synthetic */ C59518NXm LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59525NXt(Activity activity, C59518NXm c59518NXm) {
        super(activity);
        this.LJLILLLLZI = c59518NXm;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || (!this.LJLILLLLZI.LIZLLL() && !this.LJLILLLLZI.LJLJI)) {
            return false;
        }
        NYP keyDownCallBack = this.LJLILLLLZI.getKeyDownCallBack();
        if (keyDownCallBack != null) {
            keyDownCallBack.LJIIJ();
        }
        if (((NZQ) this.LJLILLLLZI.LIZIZ(R.id.hxh)).canGoBack()) {
            ((NZQ) this.LJLILLLLZI.LIZIZ(R.id.hxh)).goBack();
            return true;
        }
        this.LJLILLLLZI.LIZJ(false);
        return true;
    }
}
