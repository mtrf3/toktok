package com.ss.android.ugc.aweme.mention.service;

import X.C6CL;
import X.C70R;
import X.C8WM;
import X.C8WO;
import X.C8WT;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MentionViewServiceImpl implements IMentionViewService {
    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final C6CL LIZLLL() {
        return new C6CL() { // from class: X.8h9
            @Override // X.C6CL
            public final Animator LIZLLL() {
                return C218088hA.LIZ.LIZLLL();
            }

            @Override // X.C6CL
            public final void LIZ(String str) {
                C218088hA.LIZ.LIZ(str);
            }

            @Override // X.C6CL
            public final void LIZIZ(int i) {
                C218088hA.LIZ.LIZIZ(i);
            }

            @Override // X.C6CL
            public final void LIZJ(User user) {
                C218088hA.LIZ.LIZJ(user);
            }

            @Override // X.C6CL
            public final void LJ(int i) {
                C218088hA.LIZ.LJ(i);
            }

            @Override // X.C6CL
            public final void LJFF(ViewGroup viewGroup, Context context, boolean z, C6CK c6ck) {
                C218088hA.LIZ.LJFF(viewGroup, context, z, c6ck);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final void LIZJ(boolean z) {
        C8WM.LIZ.LIZJ(z);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final void LJ(int i) {
        C8WM.LIZ.LJI(i);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final void LJFF(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        SmartRoute buildRoute = SmartRouter.buildRoute(fragment.getContext(), "//social/mention/publish");
        buildRoute.withParam("extra_video_id", "");
        buildRoute.withParam("extra_from", "caption");
        buildRoute.open(3);
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final void LJII(Context context) {
        Context context2;
        C8WO c8wo = C8WM.LIZIZ;
        C8WT c8wt = c8wo.LIZIZ;
        if (c8wt != null) {
            context2 = c8wt.getContext();
        } else {
            context2 = null;
        }
        if (o.LJ(context2, context)) {
            c8wo.LIZIZ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final View LJI(Context context, ViewGroup container, C70R c70r) {
        o.LJIIIZ(container, "container");
        return C8WM.LIZ.LJ(context, container, c70r);
    }
}
