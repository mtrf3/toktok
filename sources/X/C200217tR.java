package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import kotlin.jvm.internal.o;

/* renamed from: X.7tR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200217tR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Aweme aweme, ActivityC45651qj activity, final C200847uS postModeModel) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(postModeModel, "postModeModel");
        MixFeedService.LJJIJIIJIL().LJJIIZ(activity, aweme, new InterfaceC229218z7() { // from class: X.7tT
            @Override // X.InterfaceC229218z7
            public final void LIZ(boolean z) {
            }

            @Override // X.InterfaceC229218z7
            public final void LIZIZ(boolean z) {
                if (z) {
                    Aweme aweme2 = C200847uS.this.LIZJ;
                    if (aweme2 != null) {
                        aweme2.playlist_info = null;
                    }
                    C2U8.LIZ(new C2IX(aweme2, null, false));
                }
            }
        }, "graphic_detail", "long_press");
    }
}
