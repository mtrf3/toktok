package X;

import android.view.View;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.Crl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32657Crl extends C78983UzD {
    public int LJZL;
    public final /* synthetic */ int LL;
    public final /* synthetic */ C29701Eo LLD;
    public final /* synthetic */ View LLF;
    public final /* synthetic */ View LLFF;
    public final /* synthetic */ C32334CmY LLFFF;
    public final /* synthetic */ C47061t0 LLFII;
    public final /* synthetic */ C47121t6 LLFZ;

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 drawable) {
        o.LJIIIZ(drawable, "drawable");
        C0NB.LIZIZ("LiveFirstRechargeViewHelper", "playOnlineOpenPackAnimation animation stop");
        C29306Beo.LJI(this.LLD);
        this.LLF.setClickable(true);
        C29306Beo.LJJLJLI(this.LLFF);
        C29306Beo.LJI(this.LLFFF);
        C29306Beo.LJJLJLI(this.LLFII);
        C29306Beo.LJI(this.LLFZ);
    }

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 drawable, int i) {
        o.LJIIIZ(drawable, "drawable");
        int i2 = this.LJZL;
        if ((i2 != 0 || this.LL > 1) && i2 <= i) {
            this.LJZL = i;
        } else {
            drawable.stop();
        }
    }

    public C32657Crl(int i, C29701Eo c29701Eo, View view, View view2, C32334CmY c32334CmY, C47061t0 c47061t0, C47121t6 c47121t6) {
        this.LL = i;
        this.LLD = c29701Eo;
        this.LLF = view;
        this.LLFF = view2;
        this.LLFFF = c32334CmY;
        this.LLFII = c47061t0;
        this.LLFZ = c47121t6;
    }
}
