package X;

import a04.IDfS1S0100000_14;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.lynx.fresco.FrescoImageLoader;

/* renamed from: X.Vr6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81028Vr6 extends W4V {
    public final /* synthetic */ AbstractC81030Vr8 LIZIZ;
    public final /* synthetic */ android.net.Uri LIZJ;
    public final /* synthetic */ FrescoImageLoader LIZLLL;

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        AbstractC81030Vr8 abstractC81030Vr8;
        if (this.LIZLLL.mDestroyed || (abstractC81030Vr8 = this.LIZIZ) == null) {
            return;
        }
        abstractC81030Vr8.LIZIZ(this.LIZJ, th);
    }

    public C81028Vr6(FrescoImageLoader frescoImageLoader, AbstractC81030Vr8 abstractC81030Vr8, android.net.Uri uri) {
        this.LIZLLL = frescoImageLoader;
        this.LIZIZ = abstractC81030Vr8;
        this.LIZJ = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        if (this.LIZLLL.mDestroyed || this.LIZIZ == null) {
            return;
        }
        if (obj instanceof W5C) {
            C81392Vwy<Bitmap> cloneUnderlyingBitmapReference = ((W5C) obj).cloneUnderlyingBitmapReference();
            if (cloneUnderlyingBitmapReference == null) {
                return;
            }
            this.LIZIZ.LIZJ(this.LIZJ, new C67155QXf<>(cloneUnderlyingBitmapReference.LJI(), new IDfS1S0100000_14(cloneUnderlyingBitmapReference, 2)));
            return;
        }
        if (!(animatable instanceof AnimatedDrawable2)) {
            return;
        }
        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
        V9E.LIZJ(animatedDrawable2);
        if (animatedDrawable2.LIZJ() <= 1) {
            animatedDrawable2.invalidateSelf();
        } else {
            animatable.start();
        }
        this.LIZIZ.LIZ(this.LIZJ, (Drawable) animatable);
    }
}
