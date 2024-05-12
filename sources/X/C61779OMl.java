package X;

import Y.ARunnableS16S0110000_10;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.OMl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61779OMl {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LJ(EnumC61784OMq type) {
        o.LJIIIZ(type, "type");
        if (type == EnumC61784OMq.BACKGROUND) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(EnumC61784OMq type) {
        o.LJIIIZ(type, "type");
        if (type == EnumC61784OMq.FORCE_VIDEO_NO_COVER || type == EnumC61784OMq.FORCE_VIDEO || type == EnumC61784OMq.BACKGROUND) {
            return true;
        }
        return false;
    }

    public static final void LJII(OML surveyType) {
        o.LJIIIZ(surveyType, "surveyType");
        if (surveyType != OML.LIVE_TYPE) {
            C61780OMm.LJIIIZ();
        }
    }

    public static final void LJIIIIZZ(OML surveyType) {
        o.LJIIIZ(surveyType, "surveyType");
        int i = OMM.LIZ[surveyType.ordinal()];
        if (i != 1 && i != 2) {
            C61780OMm.LIZLLL = true;
        } else {
            C61776OMi.LJ = true;
        }
    }

    public static final void LIZ(Aweme aweme, boolean z) {
        if (aweme != null) {
            int i = OMM.LIZ[C79081V1x.LJIILLIIL(aweme).ordinal()];
            if (i != 1 && i != 2) {
                C61780OMm.LJFF.post(new ARunnableS16S0110000_10(aweme, z, 4));
            } else {
                C61776OMi.LJFF.post(new ARunnableS16S0110000_10(aweme, z, 3));
            }
        }
    }

    public static final void LJI(Aweme aweme, OML surveyType, String str) {
        o.LJIIIZ(surveyType, "surveyType");
        int i = OMM.LIZ[surveyType.ordinal()];
        if (i != 1 && i != 2) {
            if (aweme != null) {
                aweme.getAid();
                aweme.getAuthorUid();
                aweme.getRequestId();
            }
            C61780OMm.LIZLLL = true;
            OMS.LJII(aweme);
            C61769OMb.LJI(str, aweme, "single_choice");
            return;
        }
        if (aweme != null) {
            aweme.getAid();
            aweme.getAuthorUid();
            aweme.getRequestId();
        }
        C61776OMi.LIZLLL(aweme, str, "single_choice");
    }

    public static final void LIZIZ(EnumC61773OMf operation, Option[] optionArr, Aweme aweme, boolean z) {
        o.LJIIIZ(operation, "operation");
        if (aweme == null) {
            return;
        }
        int i = OMM.LIZ[C79081V1x.LJIILLIIL(aweme).ordinal()];
        if (i != 1 && i != 2) {
            C61780OMm.LIZJ(operation, aweme, optionArr, z);
        } else {
            C61776OMi.LIZ(operation, aweme, optionArr, z);
        }
    }

    public static final void LIZJ(EnumC61773OMf operation, Aweme aweme, Option[] optionArr, OML surveyType) {
        o.LJIIIZ(operation, "operation");
        o.LJIIIZ(surveyType, "surveyType");
        int i = OMM.LIZ[surveyType.ordinal()];
        if (i != 1 && i != 2) {
            C61780OMm.LIZJ(operation, aweme, optionArr, true);
        } else {
            C61776OMi.LIZ(operation, aweme, optionArr, true);
        }
    }

    public static final void LIZLLL(int i, Aweme aweme, EnumC61773OMf operation, OML surveyType, Integer num, String str, String str2, boolean z, Option[] optionArr) {
        int type;
        String str3;
        String str4;
        String str5;
        int type2;
        String str6;
        String str7;
        String str8;
        String str9;
        o.LJIIIZ(operation, "operation");
        o.LJIIIZ(surveyType, "surveyType");
        int i2 = OMM.LIZ[surveyType.ordinal()];
        String str10 = "";
        if (i2 != 1 && i2 != 2) {
            C61780OMm.LIZIZ = ONM.LIZ(optionArr);
            int type3 = operation.getType();
            if (type3 == EnumC61773OMf.SWIPE.getType() || type3 == EnumC61773OMf.CLICK_BLANK.getType() || type3 == EnumC61773OMf.BACK.getType() || type3 == EnumC61773OMf.CLICK_VIDEO.getType()) {
                type2 = EnumC61773OMf.SECONDARY_CANCEL.getType();
            } else if (type3 == EnumC61773OMf.SUBMIT.getType()) {
                type2 = EnumC61773OMf.SECONDARY_SUBMIT.getType();
            } else {
                type2 = operation.getType();
            }
            if (!C79081V1x.LJIJJ(aweme) || type2 != EnumC61773OMf.SECONDARY_CANCEL.getType()) {
                C61780OMm.LJIIIIZZ(type2, aweme, optionArr);
            }
            if (z) {
                String name = operation.name();
                Locale locale = Locale.ENGLISH;
                String LIZIZ = C141415gn.LIZIZ(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)");
                String lowerCase = "SUBMIT".toLowerCase(locale);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!TextUtils.equals(LIZIZ, lowerCase)) {
                    str6 = "";
                } else {
                    str6 = C61780OMm.LIZIZ;
                }
                String lowerCase2 = "SUBMIT".toLowerCase(locale);
                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (TextUtils.equals(LIZIZ, lowerCase2)) {
                    str10 = str2;
                }
                C61769OMb c61769OMb = C61769OMb.LIZ;
                if (aweme != null) {
                    str7 = aweme.getAid();
                    str8 = aweme.getAuthorUid();
                } else {
                    str7 = null;
                    str8 = null;
                }
                String lowerCase3 = "MULTIPLE_CHOICE_INPUT".toLowerCase(locale);
                o.LJIIIIZZ(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                if (aweme != null) {
                    str9 = aweme.getRequestId();
                } else {
                    str9 = null;
                }
                c61769OMb.LJ(aweme, LIZIZ, num, str6, str10, str, str7, str8, lowerCase3, surveyType, str9);
            }
            C61780OMm.LIZLLL = false;
            C61780OMm.LIZ = null;
            return;
        }
        C61776OMi.LIZLLL = ONM.LIZ(optionArr);
        int type4 = operation.getType();
        if (type4 == EnumC61773OMf.SWIPE.getType() || type4 == EnumC61773OMf.CLICK_BLANK.getType() || type4 == EnumC61773OMf.BACK.getType() || type4 == EnumC61773OMf.CLICK_VIDEO.getType()) {
            type = EnumC61773OMf.SECONDARY_CANCEL.getType();
        } else if (type4 == EnumC61773OMf.SUBMIT.getType()) {
            type = EnumC61773OMf.SECONDARY_SUBMIT.getType();
        } else {
            type = operation.getType();
        }
        if (OMU.LIZIZ(aweme) != OBQ.BACKGROUND.getType() || type != EnumC61773OMf.SECONDARY_CANCEL.getType()) {
            C61776OMi.LJI(type, aweme, optionArr);
        }
        if (z) {
            String name2 = operation.name();
            Locale locale2 = Locale.ENGLISH;
            String LIZIZ2 = C141415gn.LIZIZ(locale2, "ENGLISH", name2, locale2, "this as java.lang.String).toLowerCase(locale)");
            String lowerCase4 = "SUBMIT".toLowerCase(locale2);
            o.LJIIIIZZ(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
            if (!TextUtils.equals(LIZIZ2, lowerCase4)) {
                str3 = "";
            } else {
                str3 = C61776OMi.LIZLLL;
            }
            String lowerCase5 = "SUBMIT".toLowerCase(locale2);
            o.LJIIIIZZ(lowerCase5, "this as java.lang.String).toLowerCase(locale)");
            if (TextUtils.equals(LIZIZ2, lowerCase5)) {
                str10 = str2;
            }
            C61769OMb c61769OMb2 = C61769OMb.LIZ;
            if (aweme != null) {
                str4 = aweme.getAid();
            } else {
                str4 = null;
            }
            String str11 = C61776OMi.LIZ;
            String lowerCase6 = "MULTIPLE_CHOICE_INPUT".toLowerCase(locale2);
            o.LJIIIIZZ(lowerCase6, "this as java.lang.String).toLowerCase(locale)");
            if (aweme != null) {
                str5 = aweme.getRequestId();
            } else {
                str5 = null;
            }
            c61769OMb2.LJ(aweme, LIZIZ2, num, str3, str10, str, str4, str11, lowerCase6, surveyType, str5);
        }
        C61776OMi.LJ = false;
        C61776OMi.LIZJ = null;
    }
}
