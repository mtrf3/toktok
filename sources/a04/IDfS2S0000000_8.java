package a04;

import X.C2060386t;
import X.C50321Joz;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50989Jzl;
import X.C79146V4k;
import X.InterfaceC88472Yns;
import X.JJQ;
import X.JNE;
import X.JQA;
import X.QXX;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDfS2S0000000_8 extends QXX {
    public final int $t;

    public static final String LJL$3(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        return "1";
    }

    @Override // X.QXX
    public final String LJL(Aweme aweme, String str, JQA jqa) {
        switch (this.$t) {
            case 1:
                return LJL$0(this, aweme, str, jqa);
            case 2:
                return LJL$1(this, aweme, str, jqa);
            case 3:
                return LJL$2(this, aweme, str, jqa);
            case 4:
                return LJL$3(this, aweme, str, jqa);
            case 5:
                return LJL$4(this, aweme, str, jqa);
            case 6:
                return LJL$5(this, aweme, str, jqa);
            case 7:
                return LJL$6(this, aweme, str, jqa);
            case 8:
                return LJL$7(this, aweme, str, jqa);
            case 9:
                return LJL$8(this, aweme, str, jqa);
            case 10:
                return LJL$9(this, aweme, str, jqa);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return LJL$10(this, aweme, str, jqa);
            case 12:
                return LJL$11(this, aweme, str, jqa);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return LJL$12(this, aweme, str, jqa);
            case 14:
                return LJL$13(this, aweme, str, jqa);
            case 15:
                return LJL$14(this, aweme, str, jqa);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return LJL$15(this, aweme, str, jqa);
            case 17:
                return LJL$16(this, aweme, str, jqa);
            case 18:
                return LJL$17(this, aweme, str, jqa);
            default:
                return super.LJL(aweme, str, jqa);
        }
    }

    public IDfS2S0000000_8(int i) {
        this.$t = i;
    }

    public static final String LJL$0(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        if (o.LJ(str, "search_result")) {
            return "video_search";
        }
        return str;
    }

    public static final String LJL$1(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        String str2;
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(C50989Jzl.LJ(), 711);
        if (jqa != null && (str2 = jqa.LJJII) != null && str2.length() > 0) {
            return str2;
        }
        String str3 = (String) aqS158S0100000_8.invoke();
        if (str3 != null) {
            return str3;
        }
        return "";
    }

    public static final String LJL$10(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        InterfaceC88472Yns<? super Aweme, String> interfaceC88472Yns;
        String invoke;
        if (jqa == null || (interfaceC88472Yns = jqa.LJJIJL) == null || (invoke = interfaceC88472Yns.invoke(aweme)) == null) {
            return "";
        }
        return invoke;
    }

    public static final String LJL$11(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        User author;
        String uid;
        if (aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
            return "";
        }
        return uid;
    }

    public static final String LJL$12(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        String str2;
        if (jqa == null || (str2 = jqa.LJIJJLI) == null) {
            return "";
        }
        return str2;
    }

    public static final String LJL$13(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        return JNE.LIZ(aweme);
    }

    public static final String LJL$14(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        String str2;
        String searchId;
        if (jqa == null || (str2 = jqa.LJII) == null) {
            str2 = "";
        }
        if (!C2060386t.LIZ(str2)) {
            return str2;
        }
        C50652JuK.Companion.getClass();
        C50321Joz LIZIZ = C50651JuJ.LIZIZ();
        if (LIZIZ == null || (searchId = LIZIZ.getSearchId()) == null) {
            return "";
        }
        return searchId;
    }

    public static final String LJL$15(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        String str2;
        String searchKeyword;
        if (jqa == null || (str2 = jqa.LJ) == null) {
            str2 = "";
        }
        if (!C2060386t.LIZ(str2)) {
            return str2;
        }
        C50652JuK.Companion.getClass();
        C50321Joz LIZIZ = C50651JuJ.LIZIZ();
        if (LIZIZ == null || (searchKeyword = LIZIZ.getSearchKeyword()) == null) {
            return "";
        }
        return searchKeyword;
    }

    public static final String LJL$16(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        User user;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        return C79146V4k.LJJIJIL(user);
    }

    public static final String LJL$17(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        return JJQ.LIZ(aweme);
    }

    public static final String LJL$2(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        String str2;
        if (jqa == null || (str2 = jqa.LJIIIIZZ) == null) {
            return "";
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r2 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJL$4(a04.IDfS2S0000000_8 r1, com.ss.android.ugc.aweme.feed.model.Aweme r2, java.lang.String r3, X.JQA r4) {
        /*
            if (r2 == 0) goto L1a
            java.util.Map r1 = r2.getSearchExtraParams()
            if (r1 == 0) goto L14
            java.lang.String r0 = "search_item_poi_id"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L1c
            if (r2 == 0) goto L1a
        L14:
            java.lang.String r0 = r2.getAid()
            if (r0 != 0) goto L1c
        L1a:
            java.lang.String r0 = ""
        L1c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a04.IDfS2S0000000_8.LJL$4(a04.IDfS2S0000000_8, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.JQA):java.lang.String");
    }

    public static final String LJL$5(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        String str2;
        if (jqa == null || (str2 = jqa.LJJIIZI) == null) {
            return "";
        }
        return str2;
    }

    public static final String LJL$6(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        String str2;
        if (jqa == null || (str2 = jqa.LJIIJJI) == null) {
            return "";
        }
        return str2;
    }

    public static final String LJL$7(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        String str2;
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(C50989Jzl.LJ(), 712);
        if (jqa != null && (str2 = jqa.LJJIFFI) != null && str2.length() > 0) {
            return str2;
        }
        String str3 = (String) aqS158S0100000_8.invoke();
        if (str3 != null) {
            return str3;
        }
        return "";
    }

    public static final String LJL$8(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        InterfaceC88472Yns<? super Aweme, String> interfaceC88472Yns;
        String invoke;
        if (jqa == null || (interfaceC88472Yns = jqa.LJJIIZ) == null || (invoke = interfaceC88472Yns.invoke(aweme)) == null) {
            return "";
        }
        return invoke;
    }

    public static final String LJL$9(IDfS2S0000000_8 iDfS2S0000000_8, Aweme aweme, String str, JQA jqa) {
        String str2;
        if (jqa == null || (str2 = jqa.LIZJ) == null) {
            return "";
        }
        return str2;
    }
}
