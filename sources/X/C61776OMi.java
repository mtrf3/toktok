package X;

import android.content.Context;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS56S0400000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OMi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61776OMi {
    public static Option[] LIZJ;
    public static boolean LJ;
    public static String LIZ = "";
    public static int LIZIZ = -1;
    public static String LIZLLL = "";
    public static final Handler LJFF = new Handler();
    public static OML LJI = OML.FEED_TYPE;
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C61768OMa.LJLIL);

    public static final boolean LIZIZ(Aweme aweme) {
        int LIZIZ2 = OMU.LIZIZ(aweme);
        if (LIZIZ2 == OBQ.FORCE_VIDEO.getType() || LIZIZ2 == OBQ.FORCE_VIDEO_NO_COVER.getType()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(Aweme aweme, boolean z) {
        if (aweme == null || !C224888s8.LJFF(false)) {
            return false;
        }
        String awemeId = aweme.getAid();
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        aweme.getRequestId();
        OML LJIILLIIL = C79081V1x.LJIILLIIL(aweme);
        LJI = LJIILLIIL;
        FeedSurvey LIZJ2 = OMU.LIZJ(aweme);
        if (LIZJ2 == null || ONM.LJFF(LIZJ2) || C57822Os.LIZ(aweme)) {
            return false;
        }
        if (!aweme.isWithSurvey()) {
            ((ISurveyDebuggerService) LJII.getValue()).isOpen();
            return false;
        }
        if (LJIILLIIL == OML.LIVE_TYPE && OMU.LIZIZ(aweme) == OBQ.GREY_CARD.getType()) {
            return false;
        }
        o.LJIIIIZZ(awemeId, "awemeId");
        if (OMS.LIZLLL(awemeId)) {
            return false;
        }
        LIZJ2.getId();
        LIZJ2.getTitle();
        Question[] questions = LIZJ2.getQuestions();
        if (questions != null) {
            LIZIZ = questions[0].getType();
            questions[0].getId();
            questions[0].getTitle();
        }
        LIZ = authorUid;
        if (!OMS.LJ(aweme)) {
            return true;
        }
        if (z) {
            LJFF(EnumC61773OMf.INTERVAL.getType(), aweme);
        }
        return false;
    }

    public static void LJFF(int i, Aweme aweme) {
        if (i != EnumC61773OMf.SUBMIT.getType() && i != EnumC61773OMf.SECONDARY_SUBMIT.getType()) {
            LIZJ = null;
            ON9.LIZ(i, aweme);
        } else {
            ON9.LIZJ(i, aweme, LIZJ);
        }
    }

    public static final boolean LJII(Context context, C2MA c2ma) {
        Question[] questions;
        Question question;
        o.LJIIIZ(context, "context");
        int i = 0;
        if (LIZIZ != EnumC61777OMj.SINGLE_CHOICE.getType()) {
            return false;
        }
        FeedSurvey LIZJ2 = OMU.LIZJ(c2ma.getAweme());
        int LIZIZ2 = OMU.LIZIZ(c2ma.getAweme());
        if (LIZIZ2 == OBQ.ONLINE.getType() || LIZIZ2 == OBQ.DEFAULT.getType()) {
            AttributeSet attributeSet = null;
            if (LIZJ2 != null && (questions = LIZJ2.getQuestions()) != null && (question = questions[0]) != null) {
                Aweme aweme = c2ma.getAweme();
                o.LJIIIIZZ(aweme, "viewHolder.aweme");
                C34K c34k = new C34K();
                ON2 on2 = new ON2(context);
                on2.LIZ(LIZJ2);
                TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 6, i);
                tuxTextView.setTuxFont(23);
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                tuxTextView.setText(question.getTitle());
                tuxTextView.setGravity(17);
                tuxTextView.setHighlightColor(0);
                C26227ARb c26227ARb = new C26227ARb(context);
                c26227ARb.LJII = false;
                c26227ARb.LJIIIIZZ = true;
                c26227ARb.LJIIJ = new ARU(tuxTextView);
                C77119UOl.LJFF(c26227ARb, on2);
                C77123UOp.LJIILL(c26227ARb, new AqS56S0400000_10(LIZJ2, c34k, on2, context, 11));
                c26227ARb.LIZJ(new AqS176S0100000_10(c34k, 134));
                C26231ARf LJI2 = c26227ARb.LJI();
                if (LIZIZ != EnumC61777OMj.BINARY.getType()) {
                    on2.setOptionListener(new ARX(LJI2));
                }
                if (LJI2.LJI() instanceof ARH) {
                    AbstractC243009gG LJI3 = LJI2.LJI();
                    o.LJII(LJI3, "null cannot be cast to non-null type com.bytedance.tux.dialog.action.ButtonGroup");
                    ((ARL) ListProtector.get(((ARH) LJI3).LJFF, 0)).LIZIZ(false);
                }
                LJI2.LIZLLL();
                String id = LIZJ2.getId();
                Locale ENGLISH = Locale.ENGLISH;
                o.LJIIIIZZ(ENGLISH, "ENGLISH");
                String lowerCase = "SINGLE_CHOICE".toLowerCase(ENGLISH);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                LIZLLL(aweme, id, lowerCase);
                return true;
            }
        } else if (LIZIZ2 == OBQ.FLOATING.getType()) {
            if (LIZJ2 != null) {
                ONM.LJII(c2ma.getAweme(), context, LIZJ2, LJI);
                return true;
            }
        } else {
            if (LIZIZ2 == OBQ.GREY_CARD.getType()) {
                if (LJI != OML.PHOTO_TYPE) {
                    return false;
                }
                if (!c2ma.S7()) {
                    c2ma.U8();
                }
                return true;
            }
            if (LIZIZ2 != OBQ.FORCE_VIDEO.getType()) {
                OBQ.FORCE_VIDEO_NO_COVER.getType();
            }
            return false;
        }
        return false;
    }

    public static final void LIZLLL(Aweme aweme, String str, String str2) {
        OMS.LJII(aweme);
        System.currentTimeMillis();
        C61769OMb.LJI(str, aweme, str2);
    }

    public static void LJ(String str, Aweme aweme, String str2) {
        String str3;
        OML LJIILLIIL = C79081V1x.LJIILLIIL(aweme);
        C61769OMb c61769OMb = C61769OMb.LIZ;
        FeedSurvey LIZJ2 = OMU.LIZJ(aweme);
        if (LIZJ2 != null) {
            str3 = LIZJ2.getId();
        } else {
            str3 = null;
        }
        C61769OMb.LIZLLL(c61769OMb, aweme, LJIILLIIL, str, str3, str2, null, 0, null, 224);
    }

    public static void LJI(int i, Aweme aweme, Option[] optionArr) {
        LIZJ = optionArr;
        if (i != EnumC61773OMf.SUBMIT.getType() && i != EnumC61773OMf.SECONDARY_SUBMIT.getType()) {
            ON9.LIZ(i, aweme);
        } else {
            ON9.LIZJ(i, aweme, optionArr);
        }
    }

    public static final void LIZ(EnumC61773OMf operation, Aweme aweme, Option[] optionArr, boolean z) {
        int type;
        o.LJIIIZ(operation, "operation");
        if (optionArr != null && optionArr.length != 0) {
            LIZLLL = String.valueOf(optionArr[0].getId());
        }
        if (operation.getType() == EnumC61773OMf.SWIPE.getType() || operation.getType() == EnumC61773OMf.CLICK_BLANK.getType() || operation.getType() == EnumC61773OMf.CLICK_VIDEO.getType()) {
            type = EnumC61773OMf.CANCEL.getType();
        } else {
            type = operation.getType();
        }
        if (OMU.LIZIZ(aweme) != OBQ.BACKGROUND.getType() || type != EnumC61773OMf.CANCEL.getType()) {
            LJI(type, aweme, optionArr);
        }
        if (z) {
            String name = operation.name();
            Locale locale = Locale.ENGLISH;
            LJ(C141415gn.LIZIZ(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)"), aweme, LIZLLL);
        }
        LJ = false;
        LIZJ = null;
    }
}
