package X;

import Y.ARunnableS25S0300000_14;
import Y.ARunnableS33S0200000_14;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: X.Vr8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81030Vr8 {
    public abstract void LIZLLL(Throwable th);

    public final void LIZ(android.net.Uri uri, Drawable drawable) {
        AbstractC81030Vr8 abstractC81030Vr8;
        if (C79411VEp.LIZ()) {
            C81031Vr9 c81031Vr9 = (C81031Vr9) this;
            if (c81031Vr9.LIZJ.mDestroyed || (abstractC81030Vr8 = c81031Vr9.LIZ) == null) {
                return;
            }
            abstractC81030Vr8.LIZ(uri, drawable);
            return;
        }
        C79411VEp.LIZJ(new ARunnableS25S0300000_14(this, uri, drawable, 30));
    }

    public final void LIZIZ(android.net.Uri uri, Throwable th) {
        if (C79411VEp.LIZ()) {
            LIZLLL(th);
        } else {
            C79411VEp.LIZJ(new ARunnableS33S0200000_14(this, uri, th, 90));
        }
    }

    public final void LIZJ(android.net.Uri uri, C67155QXf<Bitmap> c67155QXf) {
        AbstractC81030Vr8 abstractC81030Vr8;
        if (C79411VEp.LIZ()) {
            C81031Vr9 c81031Vr9 = (C81031Vr9) this;
            if (c81031Vr9.LIZJ.mDestroyed || (abstractC81030Vr8 = c81031Vr9.LIZ) == null) {
                return;
            }
            abstractC81030Vr8.LIZJ(c81031Vr9.LIZIZ, c67155QXf);
            return;
        }
        C79411VEp.LIZJ(new ARunnableS33S0200000_14(this, uri, c67155QXf, 89));
    }
}
