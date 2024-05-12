package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OMI implements C90F {
    public Aweme LJLIL;
    public FeedSurvey LJLILLLLZI;
    public OML LJLJI = OML.FEED_TYPE;

    @Override // X.C90F
    public final void LJIIJJI() {
        String str;
        String str2;
        FeedSurvey feedSurvey;
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme = this.LJLIL;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C61811ONr LIZ2 = LIZ.LIZ(str);
        if (LIZ2 == null) {
            LIZ2 = new C61811ONr();
        }
        if (!LIZ2.LIZ) {
            LIZ2.LIZ = true;
            C61798ONe LIZ3 = C55016LiW.LIZ();
            Aweme aweme2 = this.LJLIL;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            LIZ3.LIZLLL(str2, LIZ2);
            Aweme aweme3 = this.LJLIL;
            if (aweme3 != null && (feedSurvey = this.LJLILLLLZI) != null) {
                String id = feedSurvey.getId();
                Locale ENGLISH = Locale.ENGLISH;
                o.LJIIIIZZ(ENGLISH, "ENGLISH");
                String lowerCase = "SINGLE_CHOICE".toLowerCase(ENGLISH);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                C61769OMb.LJI(id, aweme3, lowerCase);
            }
        }
        C61798ONe LIZ4 = C55016LiW.LIZ();
        Aweme aweme4 = this.LJLIL;
        if (aweme4 != null) {
            str3 = aweme4.getAid();
        }
        LIZ4.LJFF(str3, new OMH(OBQ.BOTTOM.getType(), true));
    }

    @Override // X.C90F
    public final void LIZLLL(Aweme aweme, boolean z) {
        String str;
        String str2;
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme2 = this.LJLIL;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (LIZ.LIZJ(OBQ.BOTTOM.getType(), str)) {
            C61798ONe LIZ2 = C55016LiW.LIZ();
            Aweme aweme3 = this.LJLIL;
            if (aweme3 != null) {
                str2 = aweme3.getAid();
            } else {
                str2 = null;
            }
            C61811ONr LIZ3 = LIZ2.LIZ(str2);
            if (LIZ3 == null) {
                LIZ3 = new C61811ONr();
            }
            LIZ(LIZ3, EnumC61773OMf.BACKGROUND, null);
        }
    }

    @Override // X.C90F
    public final void LJI(EnumC61773OMf operation, Aweme aweme) {
        String str;
        String str2;
        o.LJIIIZ(operation, "operation");
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme2 = this.LJLIL;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (LIZ.LIZJ(OBQ.BOTTOM.getType(), str)) {
            C61798ONe LIZ2 = C55016LiW.LIZ();
            Aweme aweme3 = this.LJLIL;
            if (aweme3 != null) {
                str2 = aweme3.getAid();
            } else {
                str2 = null;
            }
            C61811ONr LIZ3 = LIZ2.LIZ(str2);
            if (LIZ3 == null) {
                LIZ3 = new C61811ONr();
            }
            LIZ(LIZ3, EnumC61773OMf.SWIPE, null);
        }
    }

    public final void LIZ(C61811ONr c61811ONr, EnumC61773OMf enumC61773OMf, Option option) {
        String str;
        String str2;
        int i = OMJ.LIZ[enumC61773OMf.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || c61811ONr.LJII) {
                    return;
                } else {
                    c61811ONr.LJII = true;
                }
            } else if (c61811ONr.LIZLLL) {
                return;
            } else {
                c61811ONr.LIZLLL = true;
            }
        } else {
            if (c61811ONr.LJI) {
                return;
            }
            c61811ONr.LJI = true;
            c61811ONr.LIZLLL = true;
            c61811ONr.LJII = true;
        }
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme = this.LJLIL;
        Integer num = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.LIZLLL(str, c61811ONr);
        Aweme aweme2 = this.LJLIL;
        if (aweme2 == null || this.LJLILLLLZI == null) {
            return;
        }
        C61769OMb c61769OMb = C61769OMb.LIZ;
        OML oml = this.LJLJI;
        String name = enumC61773OMf.name();
        Locale locale = Locale.ENGLISH;
        String LIZIZ = C141415gn.LIZIZ(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)");
        FeedSurvey feedSurvey = this.LJLILLLLZI;
        if (feedSurvey != null) {
            str2 = feedSurvey.getId();
        } else {
            str2 = null;
        }
        if (option != null) {
            num = Integer.valueOf(option.getId());
        }
        C61769OMb.LIZLLL(c61769OMb, aweme2, oml, LIZIZ, str2, String.valueOf(num), null, 0, null, 224);
    }
}
