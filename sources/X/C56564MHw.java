package X;

import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.question.model.QuestionVideosResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.MHw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56564MHw {
    public static final C0M6<String, MI0> LIZ = new C0M6<>(32);
    public static final C0M6<String, C56566MHy> LIZIZ = new C0M6<>(32);

    public static void LIZ(MI1 params, QuestionVideosResponse questionVideos) {
        int i;
        Integer videosCount;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(questionVideos, "questionVideos");
        long j = params.LIZJ;
        int i2 = params.LIZIZ;
        int i3 = params.LIZ;
        ForumStruct forumStruct = params.LIZLLL;
        if (i2 == 0) {
            C0M6<String, C56566MHy> c0m6 = LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(j);
            LIZ2.append('&');
            LIZ2.append(i2);
            LIZ2.append('&');
            LIZ2.append(i3);
            LIZ2.append('&');
            if (forumStruct != null && (videosCount = forumStruct.getVideosCount()) != null) {
                i = videosCount.intValue();
            } else {
                i = -1;
            }
            LIZ2.append(i);
            c0m6.LIZJ(X1D.LIZIZ(LIZ2), new C56566MHy(questionVideos, System.currentTimeMillis()));
        }
    }
}
