package android.support.v4.media;

import X.C01Q;
import X.X1D;
import Y.IDCreatorS45S0000000;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new IDCreatorS45S0000000(3);
    public Object mRatingObj;
    public final int mRatingStyle;
    public final float mRatingValue;

    public final String toString() {
        String valueOf;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Rating:style=");
        LIZ.append(this.mRatingStyle);
        LIZ.append(" rating=");
        float f = this.mRatingValue;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        LIZ.append(valueOf);
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.mRatingStyle;
    }

    public static RatingCompat LIZ(Object obj) {
        float f;
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int LIZIZ = C01Q.LIZIZ(rating);
            if (C01Q.LJ(rating)) {
                float f2 = 1.0f;
                switch (LIZIZ) {
                    case 1:
                        if (!C01Q.LIZLLL(rating)) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(1, f2);
                        break;
                    case 2:
                        if (!C01Q.LJFF(rating)) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(2, f2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float LIZJ = C01Q.LIZJ(rating);
                        if (LIZIZ != 3) {
                            if (LIZIZ != 4) {
                                f = 5.0f;
                            } else {
                                f = 4.0f;
                            }
                        } else {
                            f = 3.0f;
                        }
                        if (LIZJ >= 0.0f && LIZJ <= f) {
                            ratingCompat = new RatingCompat(LIZIZ, LIZJ);
                            break;
                        }
                        break;
                    case 6:
                        float LIZ = C01Q.LIZ(rating);
                        if (LIZ >= 0.0f && LIZ <= 100.0f) {
                            ratingCompat = new RatingCompat(6, LIZ);
                            break;
                        }
                        break;
                    default:
                        return null;
                }
            } else {
                switch (LIZIZ) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(LIZIZ, -1.0f);
                        break;
                }
            }
            ratingCompat.mRatingObj = obj;
        }
        return ratingCompat;
    }

    public RatingCompat(int i, float f) {
        this.mRatingStyle = i;
        this.mRatingValue = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }
}
