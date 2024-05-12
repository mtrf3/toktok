package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.TextExtraStruct;

/* renamed from: X.7ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200987ug {
    public final Aweme LIZ;
    public final PostModeDetailParams LIZIZ;
    public final Context LIZJ;

    public final void LIZIZ() {
        Activity LJIJJ = C45804HyK.LJIJJ(this.LIZJ);
        if (LJIJJ == null) {
            return;
        }
        MixFeedService.LJJIJIIJIL().LJJIIZ(LJIJJ, this.LIZ, new InterfaceC229218z7() { // from class: X.2Rl
            @Override // X.InterfaceC229218z7
            public final void LIZ(boolean z) {
            }

            @Override // X.InterfaceC229218z7
            public final void LIZIZ(boolean z) {
                if (z) {
                    Aweme aweme = C200987ug.this.LIZ;
                    aweme.playlist_info = null;
                    C2U8.LIZ(new C2IX(aweme, null, false));
                }
            }
        }, "graphic_detail", "long_press");
    }

    public final void LIZ(TextExtraStruct textExtraStruct) {
        boolean z;
        if (textExtraStruct == null) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZJ, "//aweme/detail");
        buildRoute.withParam("id", textExtraStruct.getAwemeId());
        buildRoute.withParam("refer", this.LIZIZ.eventType);
        boolean z2 = true;
        buildRoute.withParam("isChain", true);
        if (this.LIZ.getAwemeType() == 51) {
            z = true;
        } else {
            z = false;
        }
        buildRoute.withParam("is_from_duet_chain", z);
        if (this.LIZ.getAwemeType() != 58) {
            z2 = false;
        }
        buildRoute.withParam("is_from_stitch_chain", z2);
        buildRoute.withParam("is_from_add_video_chain", "1");
        buildRoute.open();
    }

    public C200987ug(Aweme aweme, PostModeDetailParams postModeDetailParams, Context context) {
        this.LIZ = aweme;
        this.LIZIZ = postModeDetailParams;
        this.LIZJ = context;
    }
}
