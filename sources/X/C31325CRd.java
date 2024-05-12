package X;

import android.graphics.drawable.Animatable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CRd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31325CRd implements InterfaceC75158Tec {
    public final /* synthetic */ CSD LJLIL;

    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
    }

    public C31325CRd(CSD csd) {
        this.LJLIL = csd;
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        C0K2.LIZ("CommentAvatarLoad", exc);
        if (C31324CRc.LIZ()) {
            C0NB.LJI("comment_avatar_load", exc);
        }
        this.LJLIL.LJLLJ.setActualImageResource(R.drawable.cuj);
    }
}
