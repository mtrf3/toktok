package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.NcY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59742NcY implements InterfaceC80650Vl0 {
    public final /* synthetic */ AdNewFakeUserProfileFragment LJLIL;

    @Override // X.InterfaceC80650Vl0
    public final boolean onScrollEnd() {
        return false;
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
    }

    public C59742NcY(AdNewFakeUserProfileFragment adNewFakeUserProfileFragment) {
        this.LJLIL = adNewFakeUserProfileFragment;
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        Object value = this.LJLIL.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mTitleBar>(...)");
        Rect LIZLLL = C27740Aue.LIZLLL((View) value);
        Object value2 = this.LJLIL.LJLJJL.getValue();
        o.LJIIIIZZ(value2, "<get-mHeaderNickname>(...)");
        Rect LIZLLL2 = C27740Aue.LIZLLL((View) value2);
        if (LIZLLL.bottom > LIZLLL2.bottom && this.LJLIL.wl().getAlpha() == 0.0f) {
            this.LJLIL.wl().animate().alpha(1.0f).setDuration(350L).start();
        } else {
            if (LIZLLL.bottom >= LIZLLL2.bottom || this.LJLIL.wl().getAlpha() != 1.0f) {
                return;
            }
            this.LJLIL.wl().animate().alpha(0.0f).setDuration(350L).start();
        }
    }
}
