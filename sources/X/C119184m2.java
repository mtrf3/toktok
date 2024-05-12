package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.qna.api.QnaApiV2;
import kotlin.jvm.internal.o;

/* renamed from: X.4m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119184m2 implements InterfaceC88763e4 {
    public final /* synthetic */ C119194m3 LJLIL;

    public C119184m2(C119194m3 c119194m3) {
        this.LJLIL = c119194m3;
    }

    public final C73454SsE LJJJIL(String questionText, String questionLanguage) {
        o.LJIIIZ(questionText, "questionText");
        o.LJIIIZ(questionLanguage, "questionLanguage");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        return this.LJLIL.LIZ.getQuestionCreateCategory(C38350F3i.LJJIZ(curUserId), questionText, questionLanguage).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C73454SsE LJJJLL(String questionContent, String str, Long l, String str2, String str3) {
        int i;
        o.LJIIIZ(questionContent, "questionContent");
        String json = GsonProtectorUtils.toJson(new Gson(), C47261Igj.LJJIJ(str3));
        QnaApiV2 qnaApiV2 = this.LJLIL.LIZ;
        switch (str2.hashCode()) {
            case -1701222248:
                if (str2.equals("ask_textual_question")) {
                    i = 5;
                    break;
                }
                i = 0;
                break;
            case -1689534184:
                if (str2.equals("text_to_question")) {
                    i = 6;
                    break;
                }
                i = 0;
                break;
            case -1689372294:
                if (str2.equals("qa_trending_page")) {
                    i = 12;
                    break;
                }
                i = 0;
                break;
            case -1558893115:
                if (str2.equals("eoy_hub")) {
                    i = 2;
                    break;
                }
                i = 0;
                break;
            case -802922827:
                if (str2.equals("text_others")) {
                    i = 8;
                    break;
                }
                i = 0;
                break;
            case -157070087:
                if (str2.equals("qa_personal_profile")) {
                    i = 3;
                    break;
                }
                i = 0;
                break;
            case -110142553:
                if (str2.equals("video_others")) {
                    i = 4;
                    break;
                }
                i = 0;
                break;
            case 707526364:
                if (str2.equals("qa_others_profile")) {
                    i = 1;
                    break;
                }
                i = 0;
                break;
            case 998835423:
                if (str2.equals("general_search")) {
                    i = 10;
                    break;
                }
                i = 0;
                break;
            case 1459278978:
                if (str2.equals("sticker_panel")) {
                    i = 7;
                    break;
                }
                i = 0;
                break;
            case 1971601843:
                if (str2.equals("seed_in")) {
                    i = 9;
                    break;
                }
                i = 0;
                break;
            default:
                i = 0;
                break;
        }
        return qnaApiV2.postQuestion(l, questionContent, str, Integer.valueOf(i), json).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }
}
