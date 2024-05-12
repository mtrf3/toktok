package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.question.translation.QuestionTranslationBody;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8GA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GA implements Runnable {
    public final ForumStruct LJLIL;
    public final QuestionTranslationBody LJLILLLLZI;

    public final void LIZ() {
        Gson gson = new Gson();
        try {
            ITranslationService LJJIJ = TranslationServiceImpl.LJJIJ();
            QuestionTranslationBody questionTranslationBody = this.LJLILLLLZI;
            C76L LJFF = LJJIJ.LJFF(4, questionTranslationBody.trgLang, gson.LJIILL(questionTranslationBody.translationInfo));
            InterfaceC65753PrJ<MultiTranslationResult> interfaceC65753PrJ = new InterfaceC65753PrJ<MultiTranslationResult>() { // from class: X.8GB
                @Override // X.InterfaceC65753PrJ
                public final void onFailure(Throwable t) {
                    o.LJIIIZ(t, "t");
                    C8GA.this.LIZIZ(t);
                }

                @Override // X.InterfaceC65753PrJ
                public final void onSuccess(MultiTranslationResult multiTranslationResult) {
                    TranslationResult translationResult;
                    NextLiveData<C8G6> LIZ;
                    ForumStruct forumStruct;
                    MultiTranslationResult multiTranslationResult2 = multiTranslationResult;
                    List<TranslationResult> list = null;
                    if (multiTranslationResult2 != null) {
                        list = multiTranslationResult2.results;
                    }
                    if (C79004UzY.LJJIFFI(list) || list == null || (translationResult = (TranslationResult) ListProtector.get(list, 0)) == null) {
                        return;
                    }
                    C8GA c8ga = C8GA.this;
                    c8ga.getClass();
                    CommentService LJJL = CommentServiceImpl.LJJL();
                    String str = translationResult.translatedContent;
                    o.LJIIIIZZ(str, "result.translatedContent");
                    c8ga.LJLIL.setContent(LJJL.LJIILJJIL(str));
                    c8ga.LJLIL.setTranslated(Boolean.TRUE);
                    C8G9 LIZ2 = C8GC.LIZ();
                    if (LIZ2 != null) {
                        LIZ2.LIZJ(c8ga.LJLIL, false);
                    }
                    C8G9 LIZ3 = C8GC.LIZ();
                    if (LIZ3 != null && (forumStruct = c8ga.LJLIL) != null) {
                        LIZ3.LIZIZ.put(String.valueOf(forumStruct.getId()), forumStruct.clone());
                    }
                    C8G9 LIZ4 = C8GC.LIZ();
                    if (LIZ4 == null || (LIZ = LIZ4.LIZ(String.valueOf(c8ga.LJLIL.getId()))) == null) {
                        return;
                    }
                    LIZ.setValue(new C8G6(c8ga.LJLIL, true));
                }
            };
            LJFF.LJFF(new RunnableC65751PrH(LJFF, interfaceC65753PrJ), ExecutorC142245i8.LJLILLLLZI);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            LIZIZ(new Exception());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final void LIZIZ(Throwable th) {
        NextLiveData<C8G6> LIZ;
        C8G9 LIZ2 = C8GC.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZJ(this.LJLIL, false);
        }
        C8G6 c8g6 = new C8G6(this.LJLIL, false);
        if (th instanceof Exception) {
            c8g6.LIZJ = (Exception) th;
        }
        C8G9 LIZ3 = C8GC.LIZ();
        if (LIZ3 == null || (LIZ = LIZ3.LIZ(String.valueOf(this.LJLIL.getId()))) == null) {
            return;
        }
        LIZ.setValue(c8g6);
    }

    public C8GA(ForumStruct forumStruct, QuestionTranslationBody questionTranslationBody) {
        this.LJLIL = forumStruct;
        this.LJLILLLLZI = questionTranslationBody;
    }
}
