package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.qna.api.TiktokV1ForumQuestionSuggestResponse;
import com.ss.android.ugc.aweme.question.ForumStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T7D {
    public final List<List<ForumStruct>> LIZ = C47261Igj.LJJIJIIJI(new ArrayList(), new ArrayList(), new ArrayList());
    public final java.util.Map<Long, ForumStruct> LIZIZ = new LinkedHashMap();
    public final java.util.Map<Long, T7P> LIZJ = new LinkedHashMap();

    public final KKR LIZIZ(TiktokV1ForumQuestionSuggestResponse tiktokV1ForumQuestionSuggestResponse) {
        Iterator<List<ForumStruct>> it = this.LIZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().size();
        }
        if (tiktokV1ForumQuestionSuggestResponse != null && tiktokV1ForumQuestionSuggestResponse.statusCode != 0) {
            return KKR.FAILURE;
        }
        if (i > 0) {
            return KKR.SUCCESS;
        }
        return KKR.SUCCESS_EMPTY;
    }

    public final List<ForumStruct> LIZJ(T7P t7p) {
        int i = T7N.LIZ[t7p.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    i2 = 2;
                } else {
                    throw new Exception("Incorrect Collection Category");
                }
            }
        } else {
            i2 = 0;
        }
        return (List) ListProtector.get(this.LIZ, i2);
    }

    public final void LIZLLL(String questionId) {
        o.LJIIIZ(questionId, "questionId");
        Object obj = ((LinkedHashMap) this.LIZIZ).get(Long.valueOf(CastLongProtector.parseLong(questionId)));
        if (obj != null) {
            LIZJ(T7P.INVITATION).remove(obj);
        }
        this.LIZIZ.remove(Long.valueOf(CastLongProtector.parseLong(questionId)));
        this.LIZJ.remove(Long.valueOf(CastLongProtector.parseLong(questionId)));
    }

    public final void LIZ(T7P collectionCategory, List<ForumStruct> forumStructs) {
        o.LJIIIZ(collectionCategory, "collectionCategory");
        o.LJIIIZ(forumStructs, "forumStructs");
        for (ForumStruct forumStruct : forumStructs) {
            Long id = forumStruct.getId();
            if (id != null) {
                long longValue = id.longValue();
                List<ForumStruct> LIZJ = LIZJ(collectionCategory);
                if (this.LIZJ.containsKey(Long.valueOf(longValue))) {
                    if (((LinkedHashMap) this.LIZJ).get(Long.valueOf(longValue)) != collectionCategory) {
                    }
                }
                LIZJ.add(forumStruct);
                this.LIZIZ.put(Long.valueOf(longValue), forumStruct);
                this.LIZJ.put(Long.valueOf(longValue), collectionCategory);
            }
        }
    }

    public final ForumStruct LJ(int i, String questionId) {
        o.LJIIIZ(questionId, "questionId");
        ForumStruct forumStruct = (ForumStruct) ((LinkedHashMap) this.LIZIZ).get(Long.valueOf(CastLongProtector.parseLong(questionId)));
        if (forumStruct != null) {
            forumStruct.setCollectStatus(Integer.valueOf(i));
            return forumStruct;
        }
        return null;
    }
}
