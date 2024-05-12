package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.Animatable;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.lighten.loader.SmartImageView;

/* loaded from: classes5.dex */
public final class ARE extends AbstractC72439Sbr {
    public final /* synthetic */ JBQ LJLIL;

    public ARE(JBQ jbq) {
        this.LJLIL = jbq;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("playPhotoStoryInAvatar, Lighten display failed, Error: ");
        if (th != null) {
            str = th.getLocalizedMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        SmartImageView smartImageView = this.LJLIL.LJLJI;
        if (smartImageView != null) {
            float translationY = smartImageView.getTranslationY();
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.LJLIL.LJLJI, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, translationY, 30 + translationY), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 1.03f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 1.03f));
            JBQ jbq = this.LJLIL;
            ofPropertyValuesHolder.setDuration(3500L);
            ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
            ofPropertyValuesHolder.addListener(new ARF(jbq, translationY));
            C26180APg.LIZIZ = true;
            ofPropertyValuesHolder.start();
        }
    }
}
