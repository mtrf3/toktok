package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.jvm.internal.o;

/* renamed from: X.Htl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45521Htl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ MvChoosePhotoScene LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    public C45521Htl(MvChoosePhotoScene mvChoosePhotoScene, float f) {
        this.LJLIL = mvChoosePhotoScene;
        this.LJLILLLLZI = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        o.LJIIIZ(it, "it");
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        View view = mvChoosePhotoScene.mView;
        if (view == null) {
            return;
        }
        view.setTranslationY((it.getAnimatedFraction() * (mvChoosePhotoScene.LLLLIIL() - this.LJLILLLLZI)) + this.LJLILLLLZI);
    }
}
