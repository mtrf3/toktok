package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.Crj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32655Crj extends V1B {
    public final /* synthetic */ C29701Eo LJLJJL;
    public final /* synthetic */ View LJLJJLL;
    public final /* synthetic */ View LJLJL;
    public final /* synthetic */ C32334CmY LJLJLJ;
    public final /* synthetic */ C47061t0 LJLJLLL;
    public final /* synthetic */ C47121t6 LJLL;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
        animatedDrawable2.LJI(new C32657Crl(animatedDrawable2.LIZJ(), this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL));
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        C0NB.LIZIZ("LiveFirstRechargeViewHelper", "playOnlineOpenPackAnimation load fail");
        C29306Beo.LJI(this.LJLJJL);
        this.LJLJJLL.setClickable(true);
        C29306Beo.LJJLJLI(this.LJLJL);
        C29306Beo.LJI(this.LJLJLJ);
        C29306Beo.LJJLJLI(this.LJLJLLL);
        C29306Beo.LJI(this.LJLL);
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        C0NB.LIZIZ("LiveFirstRechargeViewHelper", "playOnlineOpenPackAnimation load success");
    }

    public C32655Crj(C29701Eo c29701Eo, View view, View view2, C32334CmY c32334CmY, C47061t0 c47061t0, C47121t6 c47121t6) {
        this.LJLJJL = c29701Eo;
        this.LJLJJLL = view;
        this.LJLJL = view2;
        this.LJLJLJ = c32334CmY;
        this.LJLJLLL = c47061t0;
        this.LJLL = c47121t6;
    }
}
