package X;

import android.text.TextUtils;

/* renamed from: X.6Ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161156Ud {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, I38.RECORD_COMBINE.getTag()) || TextUtils.equals(charSequence, I38.RECORD_COMBINE_15.getTag()) || TextUtils.equals(charSequence, I38.RECORD_COMBINE_60.getTag()) || TextUtils.equals(charSequence, I38.RECORD_COMBINE_LIGHTENING.getTag())) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(CharSequence charSequence) {
        return TextUtils.equals(charSequence, I38.RECORD_LIGHTENING_TEXT.getTag());
    }

    public static boolean LIZJ(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, I38.RECORD_LIGHTENING_VIDEO.getTag()) || TextUtils.equals(charSequence, I38.RECORD_LIGHTENING_PHOTO_AND_VIDEO.getTag())) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(CharSequence charSequence) {
        return TextUtils.equals(charSequence, I38.LIVE.getTag());
    }

    public static boolean LJ(CharSequence charSequence) {
        return TextUtils.equals(charSequence, "record_mode_mv");
    }

    public static boolean LJFF(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, I38.RECORD_SPLIT_3MIN.getTag()) || TextUtils.equals(charSequence, I38.RECORD_SPLIT_LIGHTENING.getTag())) {
            return true;
        }
        return false;
    }
}
