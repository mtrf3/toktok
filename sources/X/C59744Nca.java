package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.profile.FakeUserProfileFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Nca, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59744Nca implements C07G {
    public final /* synthetic */ FakeUserProfileFragment LJLIL;

    public C59744Nca(FakeUserProfileFragment fakeUserProfileFragment) {
        this.LJLIL = fakeUserProfileFragment;
    }

    @Override // X.C07G
    public final void LIZ(C45631qh view, int i, int i2, int i3, int i4) {
        o.LJIIIZ(view, "view");
        Object value = this.LJLIL.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mTitleBar>(...)");
        Rect LIZLLL = C27740Aue.LIZLLL((View) value);
        Object value2 = this.LJLIL.LJLJLJ.getValue();
        o.LJIIIIZZ(value2, "<get-mUserName>(...)");
        Rect LIZLLL2 = C27740Aue.LIZLLL((View) value2);
        if (LIZLLL.bottom > LIZLLL2.bottom && this.LJLIL.xl().getAlpha() == 0.0f) {
            this.LJLIL.xl().animate().alpha(1.0f).setDuration(350L).start();
        } else {
            if (LIZLLL.bottom >= LIZLLL2.bottom || this.LJLIL.xl().getAlpha() != 1.0f) {
                return;
            }
            this.LJLIL.xl().animate().alpha(0.0f).setDuration(350L).start();
        }
    }
}
