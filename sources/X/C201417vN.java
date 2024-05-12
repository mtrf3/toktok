package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEgressEtData;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS41S1000000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7vN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201417vN {
    public static OSZ LIZ(EnumC201127uu exitMethod, Context activityContext) {
        int i;
        int i2;
        int i3;
        o.LJIIIZ(exitMethod, "exitMethod");
        o.LJIIIZ(activityContext, "activityContext");
        if (C26338AVi.LIZJ(activityContext)) {
            i = R.anim.eo;
        } else {
            i = R.anim.ep;
        }
        switch (C201117ut.LIZ[exitMethod.ordinal()]) {
            case 1:
            case 2:
                return new OSZ(Integer.valueOf(R.anim.ej), Integer.valueOf(R.anim.el));
            case 3:
                return new OSZ(Integer.valueOf(R.anim.em), Integer.valueOf(R.anim.en));
            case 4:
            case 5:
                return new OSZ(Integer.valueOf(i), Integer.valueOf(R.anim.el));
            case 6:
                return new OSZ(0, 0);
            case 7:
                if (C26338AVi.LIZJ(activityContext)) {
                    i2 = R.anim.fv;
                } else {
                    i2 = R.anim.ft;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (C26338AVi.LIZJ(activityContext)) {
                    i3 = R.anim.g0;
                } else {
                    i3 = R.anim.g2;
                }
                return new OSZ(valueOf, Integer.valueOf(i3));
            case 8:
                return new OSZ(0, Integer.valueOf(R.anim.cb));
            default:
                throw new C162476Zf();
        }
    }

    public static void LIZIZ(String str, final C201427vO c201427vO, String str2) {
        boolean z;
        VideoItemParams videoItemParams;
        String str3;
        BaseFeedPageParams baseFeedPageParams;
        M89 m89;
        Context context;
        if (c201427vO.LIZIZ == null || (context = c201427vO.LIZ) == null || !(context instanceof ActivityC45651qj)) {
            z = true;
        } else {
            z = false;
        }
        String str4 = null;
        if (z) {
            C36922EeM.LJI(3, null, "startPostModeDetailActivity invalidParam == false");
            return;
        }
        Context context2 = c201427vO.LIZ;
        o.LJII(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) context2;
        final C214378bB c214378bB = new C214378bB(C65352Pkq.LIZ(PhotoSharedViewModel.class), new AqS41S1000000_3(str, 3), C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C201407vM.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj));
        PhotoSharedViewModel photoSharedViewModel = (PhotoSharedViewModel) c214378bB.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startPostModeDetailActivity photoSharedVM: ");
        LIZ.append(photoSharedViewModel);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        photoSharedViewModel.LJLILLLLZI = c201427vO.LIZIZ;
        photoSharedViewModel.LJLJI = c201427vO.LJIILLIIL;
        photoSharedViewModel.LJLJLJ = c201427vO.LIZJ;
        Object obj = c201427vO.LJIILJJIL;
        if (obj instanceof VideoItemParams) {
            videoItemParams = (VideoItemParams) obj;
        } else {
            videoItemParams = null;
        }
        photoSharedViewModel.LJLIL = videoItemParams;
        String str5 = c201427vO.LJIIJJI;
        VideoItemParams videoItemParams2 = ((PhotoSharedViewModel) c214378bB.getValue()).LJLIL;
        if (videoItemParams2 != null && (baseFeedPageParams = videoItemParams2.baseFeedPageParams) != null && (m89 = baseFeedPageParams.param) != null) {
            str3 = m89.getTabName();
        } else {
            str3 = null;
        }
        Aweme aweme = c201427vO.LIZIZ;
        if (aweme != null) {
            str4 = aweme.getAid();
        }
        PostModeDetailParams postModeDetailParams = new PostModeDetailParams(str5, str3, str4, c201427vO.LIZJ, null, c201427vO.LIZLLL, c201427vO.LJIIIZ, c201427vO.LJIIJ, c201427vO.LJIIL, c201427vO.LJIILIIL, c201427vO.LJ, c201427vO.LJFF, c201427vO.LJIJ, c201427vO.LJIJI, c201427vO.LJI, c201427vO.LJII, c201427vO.LJIIIIZZ, c201427vO.LJIJJ, c201427vO.LJIJJLI, c201427vO.LJIL, c201427vO.LJJ, c201427vO.LJIILL, c201427vO.LJJI, c201427vO.LJJIFFI);
        SmartRoute buildRoute = SmartRouter.buildRoute(c201427vO.LIZ, str2);
        buildRoute.withParam("POST_DETAIL_PARAMS", postModeDetailParams);
        buildRoute.withParam("photo_shared_vm_unique_key", str);
        buildRoute.open(12345, new OnActivityResultCallback() { // from class: X.7vL
            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i, int i2, Intent intent) {
                InterfaceC88472Yns<? super PostModeEgressEtData, C76800UCe> interfaceC88472Yns;
                Activity activity;
                if (i2 == 11010) {
                    Context context3 = C201427vO.this.LIZ;
                    if ((context3 instanceof ActivityC45651qj) && (activity = (Activity) context3) != null) {
                        activity.finish();
                    }
                    ((PhotoSharedViewModel) c214378bB.getValue()).reset();
                    return;
                }
                if (o.LJ(C201427vO.this.LJIIJJI, "homepage_explore") && C201427vO.this.LJIJJ == PostModeEntranceMechanism.EXPLORE_CARD) {
                    PostModeEgressEtData postModeEgressEtData = ((PhotoSharedViewModel) c214378bB.getValue()).LJLJL;
                    if (postModeEgressEtData != null && (interfaceC88472Yns = C201427vO.this.LJIIZILJ) != null) {
                        interfaceC88472Yns.invoke(postModeEgressEtData);
                    }
                    ((PhotoSharedViewModel) c214378bB.getValue()).reset();
                    return;
                }
                PhotoSharedViewModel photoSharedViewModel2 = (PhotoSharedViewModel) c214378bB.getValue();
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = photoSharedViewModel2.LJLLILLLL;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                photoSharedViewModel2.LJLIL = null;
                photoSharedViewModel2.LJLILLLLZI = null;
                photoSharedViewModel2.LJLJI = null;
            }
        });
    }
}
