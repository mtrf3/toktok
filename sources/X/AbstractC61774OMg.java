package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;

/* renamed from: X.OMg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61774OMg implements C90T {
    public Aweme LJLIL;
    public FeedSurvey LJLILLLLZI;
    public Question LJLJJL;
    public OML LJLJI = OML.FEED_TYPE;
    public int LJLJJI = OBQ.BACKGROUND.getType();
    public final ONJ LJLJJLL = new ONJ(C16880lQ.LJLLJ(getClass()));

    public final void LJIIIIZZ(Aweme aweme) {
        Question[] questions;
        this.LJLIL = aweme;
        this.LJLILLLLZI = OMU.LIZJ(aweme);
        this.LJLJI = C79081V1x.LJIILLIIL(aweme);
        this.LJLJJI = OMU.LIZIZ(aweme);
        FeedSurvey feedSurvey = this.LJLILLLLZI;
        if (feedSurvey == null || (questions = feedSurvey.getQuestions()) == null || questions.length == 0) {
            return;
        }
        this.LJLJJL = questions[0];
    }

    @Override // X.C90F
    public final void LIZLLL(Aweme aweme, boolean z) {
        String str;
        String str2;
        if (z) {
            return;
        }
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme2 = this.LJLIL;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (LIZ.LIZJ(this.LJLJJI, str)) {
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
            LJIIIZ(LIZ3, EnumC61773OMf.BACKGROUND, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(X.EnumC61773OMf r20, com.ss.android.ugc.aweme.feed.model.survey.Option[] r21) {
        /*
            r19 = this;
            r2 = r19
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r2.LJLIL
            if (r6 == 0) goto La
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r0 = r2.LJLILLLLZI
            if (r0 != 0) goto Lb
        La:
            return
        Lb:
            X.OMb r5 = X.C61769OMb.LIZ
            X.OML r7 = r2.LJLJI
            java.lang.String r4 = r20.name()
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = "ENGLISH"
            java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r8 = X.C141415gn.LIZIZ(r3, r1, r4, r3, r0)
            com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey r0 = r2.LJLILLLLZI
            r15 = 0
            if (r0 == 0) goto L60
            java.lang.String r9 = r0.getId()
        L26:
            r13 = r21
            if (r13 == 0) goto L2d
            int r0 = r13.length
            if (r0 != 0) goto L4b
        L2d:
            java.lang.String r10 = ""
        L2f:
            X.OMk r1 = X.EnumC61777OMj.Companion
            com.ss.android.ugc.aweme.feed.model.survey.Question r0 = r2.LJLJJL
            if (r0 == 0) goto L3d
            int r0 = r0.getType()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
        L3d:
            r1.getClass()
            java.lang.String r11 = X.C61778OMk.LIZ(r15)
            r12 = 0
            r14 = 64
            X.C61769OMb.LIZLLL(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto La
        L4b:
            java.lang.String r14 = ","
            X.OMh r17 = X.C61775OMh.LJLIL     // Catch: java.lang.Exception -> L58
            r18 = 30
            r16 = r15
            java.lang.String r10 = X.ORY.LJJJJLL(r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L58
            goto L2f
        L58:
            X.ONJ r1 = r2.LJLJJLL
            java.lang.String r0 = "build multi options error"
            r1.LIZLLL(r0)
            goto L2d
        L60:
            r9 = r15
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61774OMg.LJIILJJIL(X.OMf, com.ss.android.ugc.aweme.feed.model.survey.Option[]):void");
    }

    public final void LJIIIZ(C61811ONr c61811ONr, EnumC61773OMf enumC61773OMf, Option[] optionArr) {
        int i = C61772OMe.LIZ[enumC61773OMf.ordinal()];
        String str = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || c61811ONr.LJIIIZ) {
                        return;
                    }
                    c61811ONr.LJIIIZ = true;
                    LJIILJJIL(enumC61773OMf, null);
                } else {
                    if (c61811ONr.LJII) {
                        return;
                    }
                    c61811ONr.LJII = true;
                    LJIILJJIL(enumC61773OMf, null);
                }
            } else {
                if (c61811ONr.LIZLLL) {
                    return;
                }
                c61811ONr.LIZLLL = true;
                LJIILJJIL(enumC61773OMf, null);
            }
        } else {
            if (c61811ONr.LJI) {
                return;
            }
            c61811ONr.LJI = true;
            c61811ONr.LIZLLL = true;
            c61811ONr.LJII = true;
            LJIILJJIL(enumC61773OMf, optionArr);
        }
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            str = aweme.getAid();
        }
        LIZ.LIZLLL(str, c61811ONr);
    }
}
