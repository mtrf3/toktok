package X;

import android.graphics.drawable.Animatable;
import android.widget.ImageView;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* renamed from: X.CrE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32624CrE extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ C32609Cqz LIZIZ;
    public final /* synthetic */ EnumC32618Cr8 LIZJ;

    public C32624CrE(C32609Cqz c32609Cqz, EnumC32618Cr8 enumC32618Cr8) {
        this.LIZIZ = c32609Cqz;
        this.LIZJ = enumC32618Cr8;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String id, Object obj, Animatable animatable) {
        o.LJIIIZ(id, "id");
        ImageView imageView = this.LIZIZ.LJLJI;
        if (imageView != null) {
            C29306Beo.LJJLIIIJJI(imageView, false);
        }
        o.LJII(animatable, "null cannot be cast to non-null type com.facebook.fresco.animation.drawable.AnimatedDrawable2");
        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
        animatedDrawable2.LJI(new C32625CrF(animatedDrawable2.LIZJ(), this.LIZIZ, this.LIZJ));
    }
}
