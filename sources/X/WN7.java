package X;

import android.view.View;

/* loaded from: classes15.dex */
public final class WN7 {
    public static WNA LIZ(View view) {
        return new WNA(view.getTranslationX(), view.getTranslationY(), view.getScaleX(), view.getScaleY(), view.getRotation(), view.getRotationX(), view.getRotationY(), view.getAlpha());
    }

    public static void LIZIZ(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setAlpha(1.0f);
        view.clearAnimation();
    }

    public static void LIZJ(View view, WNA wna) {
        view.setTranslationX(wna.LIZ);
        view.setTranslationY(wna.LIZIZ);
        view.setScaleX(wna.LIZJ);
        view.setScaleY(wna.LIZLLL);
        view.setRotation(wna.LJ);
        view.setRotationX(wna.LJFF);
        view.setRotationY(wna.LJI);
        view.setAlpha(wna.LJII);
    }
}
