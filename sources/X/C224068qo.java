package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import java.util.List;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224068qo {
    public static final java.util.Map<String, InterfaceC88472Yns<Intent, String>> LIZ;

    static {
        C224418rN c224418rN = C224418rN.INSTANCE;
        C224078qp c224078qp = C224078qp.INSTANCE;
        C224098qr c224098qr = C224098qr.LJLIL;
        C224088qq c224088qq = C224088qq.INSTANCE;
        LIZ = C113554cx.LJJL(new OSZ("STORY_ENTRANCE_DEFAULT", c224418rN), new OSZ("STORY_ENTRANCE_WIDGET", c224078qp), new OSZ("STORY_ENTRANCE_MINE", c224098qr), new OSZ("STORY_ENTRANCE_OTHER", c224098qr), new OSZ("STORY_ENTRANCE_AVATAR", c224098qr), new OSZ("STORY_ENTRANCE_ARCHIVE", new AqS28S1000000_3("STORY_ENTRANCE_ARCHIVE", 18)), new OSZ("STORY_ENTRANCE_INBOX_TOP_LIST", new AqS28S1000000_3("STORY_ENTRANCE_INBOX_TOP_LIST", 18)), new OSZ("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST", new AqS28S1000000_3("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST", 18)), new OSZ("STORY_ENTRANCE_FEED_TOP_LIST", new AqS28S1000000_3("STORY_ENTRANCE_FEED_TOP_LIST", 18)), new OSZ("from_profile_self", c224088qq), new OSZ("from_profile_other", c224088qq));
    }

    public static final void LIZ(Aweme aweme) {
        List<Aweme> stories;
        Aweme aweme2;
        if (C222978p3.LIZ().prefetchEnabled) {
            C46728IVo.LJIIL(0, aweme);
            UserStory userStory = aweme.getUserStory();
            if (userStory != null && (stories = userStory.getStories()) != null && (aweme2 = (Aweme) ORZ.LJLLLL(stories)) != null) {
                LIZ(aweme2);
            }
        }
    }

    public static void LIZIZ(final Bundle bundle, final Class cls) {
        if (C222978p3.LIZ().prefetchEnabled) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("preloader shot: ");
            LIZ2.append(cls);
            C221018lt.LJFF("STORY-Preloader", X1D.LIZIZ(LIZ2));
            C84340X8e c84340X8e = C84339X8d.LIZJ;
            final X8Q x8q = null;
            InterfaceC84349X8n interfaceC84349X8n = new InterfaceC84349X8n() { // from class: X.8qs
                @Override // X.InterfaceC84349X8n
                public final void LIZ(X8W trigger) {
                    o.LJIIIZ(trigger, "trigger");
                    trigger.LIZIZ(bundle, cls, x8q);
                }
            };
            c84340X8e.getClass();
            C84340X8e.LIZIZ(interfaceC84349X8n);
        }
    }
}
