package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.question.translation.QuestionTranslationBody;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.8G9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8G9 {
    public static C8G9 LJ;
    public final java.util.Set<String> LIZLLL = new HashSet();
    public final java.util.Set<String> LIZ = new HashSet();
    public final HashMap<String, ForumStruct> LIZIZ = new HashMap<>();
    public final HashMap<String, ForumStruct> LIZJ = new HashMap<>();

    public final NextLiveData<C8G6> LIZ(String str) {
        ((HashSet) this.LIZLLL).add(str);
        NextLiveData<C8G6> LIZIZ = C57082Lw.LIZ.LIZIZ(str);
        o.LJIIIIZZ(LIZIZ, "get().with(id, QuestionT…slationEvent::class.java)");
        return LIZIZ;
    }

    public final void LIZIZ(ForumStruct forumStruct) {
        ForumStruct forumStruct2 = this.LIZJ.get(String.valueOf(forumStruct.getId()));
        if (forumStruct2 != null) {
            forumStruct.setTranslated(Boolean.FALSE);
            forumStruct.setContent(forumStruct2.getContent());
        }
        C8G9 LIZ = C8GC.LIZ();
        o.LJI(LIZ);
        LIZ.LIZ(String.valueOf(forumStruct.getId())).setValue(new C8G6(forumStruct, true));
    }

    public final void LIZJ(ForumStruct question, boolean z) {
        o.LJIIIZ(question, "question");
        if (z) {
            ((HashSet) this.LIZ).add(String.valueOf(question.getId()));
        } else {
            ((HashSet) this.LIZ).remove(String.valueOf(question.getId()));
        }
    }

    public final void LIZLLL(ForumStruct forumStruct, QuestionTranslationBody questionTranslationBody, C76S c76s) {
        ForumStruct forumStruct2 = this.LIZIZ.get(String.valueOf(forumStruct.getId()));
        if (forumStruct2 != null) {
            forumStruct.setTranslated(Boolean.TRUE);
            forumStruct.setContent(forumStruct2.getContent());
            C8G9 LIZ = C8GC.LIZ();
            o.LJI(LIZ);
            LIZ.LIZ(String.valueOf(forumStruct.getId())).setValue(new C8G6(forumStruct, true));
            return;
        }
        LIZJ(forumStruct, true);
        this.LIZJ.put(String.valueOf(forumStruct.getId()), forumStruct.clone());
        if (c76s != null) {
            c76s.setLoadingText(R.string.dm9);
            c76s.setLoading(true);
        }
        C38816FLg.LJ(new C8GA(forumStruct, questionTranslationBody));
    }
}
