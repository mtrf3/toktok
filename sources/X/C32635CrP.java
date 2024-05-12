package X;

import android.graphics.drawable.Animatable;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.CrP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32635CrP extends C31073CHl {
    public final /* synthetic */ C32609Cqz LJLJL;

    @Override // X.C31073CHl
    public final void LJFF() {
        ImageView imageView = this.LJLJL.LJLJI;
        if (imageView != null) {
            C29306Beo.LJJLIIIJJI(imageView, false);
        }
        C47061t0 c47061t0 = this.LJLJL.LJLJJI;
        if (c47061t0 != null) {
            C29306Beo.LJJLIIIJJI(c47061t0, true);
        }
    }

    public C32635CrP(C32609Cqz c32609Cqz) {
        this.LJLJL = c32609Cqz;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        ImageView imageView = this.LJLJL.LJLJI;
        if (imageView != null) {
            C29306Beo.LJJLIIIJJI(imageView, true);
        }
        C47061t0 c47061t0 = this.LJLJL.LJLJJI;
        if (c47061t0 != null) {
            C29306Beo.LJJLIIIJJI(c47061t0, false);
        }
    }
}
