package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LfA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54808LfA extends AbstractC54806Lf8<UserStory, Aweme> {
    public static final C54808LfA LIZLLL = new C54808LfA();

    public static final List LIZJ(UserStory userStory, UserStory userStory2) {
        return userStory2.diffProperties(userStory);
    }

    @Override // X.AbstractC54806Lf8
    public final Object LIZ(UserStory updatedData, Aweme aweme) {
        Aweme outputData = aweme;
        o.LJIIIZ(updatedData, "updatedData");
        o.LJIIIZ(outputData, "outputData");
        String authorUid = outputData.getAuthorUid();
        o.LJIIIIZZ(authorUid, "outputData.authorUid");
        return authorUid;
    }
}
