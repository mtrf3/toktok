package X;

import android.media.Rating;

/* renamed from: X.01Q, reason: invalid class name */
/* loaded from: classes.dex */
public class C01Q {
    public static float LIZ(Rating rating) {
        return rating.getPercentRating();
    }

    public static int LIZIZ(Rating rating) {
        return rating.getRatingStyle();
    }

    public static float LIZJ(Rating rating) {
        return rating.getStarRating();
    }

    public static boolean LIZLLL(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean LJ(Rating rating) {
        return rating.isRated();
    }

    public static boolean LJFF(Rating rating) {
        return rating.isThumbUp();
    }

    public static Rating LJI(boolean z) {
        return Rating.newHeartRating(z);
    }

    public static Rating LJII(float f) {
        return Rating.newPercentageRating(f);
    }

    public static Rating LJIIIZ(boolean z) {
        return Rating.newThumbRating(z);
    }

    public static Rating LJIIJ(int i) {
        return Rating.newUnratedRating(i);
    }

    public static Rating LJIIIIZZ(int i, float f) {
        return Rating.newStarRating(i, f);
    }
}
