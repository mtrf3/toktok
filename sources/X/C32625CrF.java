package X;

import android.widget.ImageView;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.CrF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32625CrF extends C78983UzD {
    public int LJZL;
    public final /* synthetic */ int LL;
    public final /* synthetic */ C32609Cqz LLD;
    public final /* synthetic */ EnumC32618Cr8 LLF;

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 drawable) {
        o.LJIIIZ(drawable, "drawable");
    }

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZ(AnimatedDrawable2 drawable) {
        o.LJIIIZ(drawable, "drawable");
        this.LJZL = -1;
        C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
        String value = this.LLF.getValue();
        c32785Ctp.getClass();
        C32785Ctp.LJIIJJI(value);
    }

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 drawable, int i) {
        o.LJIIIZ(drawable, "drawable");
        int i2 = this.LJZL;
        if ((i2 != 0 || this.LL > 1) && i2 <= i) {
            this.LJZL = i;
            return;
        }
        drawable.stop();
        ImageView imageView = this.LLD.LJLJI;
        if (imageView != null) {
            C29306Beo.LJJLIIIJJI(imageView, true);
        }
        C47061t0 c47061t0 = this.LLD.LJLJJI;
        if (c47061t0 == null) {
            return;
        }
        C29306Beo.LJJLIIIJJI(c47061t0, false);
    }

    public C32625CrF(int i, C32609Cqz c32609Cqz, EnumC32618Cr8 enumC32618Cr8) {
        this.LL = i;
        this.LLD = c32609Cqz;
        this.LLF = enumC32618Cr8;
    }
}
