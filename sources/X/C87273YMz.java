package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.YMz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87273YMz {
    public static final void LIZIZ(YN5 yn5) {
        C17N.LJJJJLL().kO().LIZ(yn5);
    }

    public static final java.util.Set<String> LIZ(java.util.Set<String> set, EnumC87257YMj enumC87257YMj) {
        switch (YN2.LIZ[enumC87257YMj.ordinal()]) {
            case 3:
                return F5P.LJIIJ(F5P.LJIIL(set, enumC87257YMj.getAct()), EnumC87257YMj.LIKE_CANCEL.getAct());
            case 4:
                return F5P.LJIIJ(F5P.LJIIL(set, enumC87257YMj.getAct()), EnumC87257YMj.LIKE.getAct());
            case 5:
                return F5P.LJIIJ(F5P.LJIIL(set, enumC87257YMj.getAct()), EnumC87257YMj.FAVORITE_CANCEL.getAct());
            case 6:
                return F5P.LJIIJ(F5P.LJIIL(set, enumC87257YMj.getAct()), EnumC87257YMj.FAVORITE.getAct());
            case 7:
                return F5P.LJIIJ(F5P.LJIIL(set, enumC87257YMj.getAct()), EnumC87257YMj.FOLLOW_CANCEL.getAct());
            case 8:
                return F5P.LJIIJ(F5P.LJIIL(set, enumC87257YMj.getAct()), EnumC87257YMj.FOLLOW.getAct());
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return F5P.LJIIL(set, enumC87257YMj.getAct());
            default:
                return set;
        }
    }
}
