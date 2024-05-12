package X;

import Y.ARunnableS43S0100000_7;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GVb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41619GVb implements InterfaceC41635GVr {
    public final /* synthetic */ ActivityC45651qj LIZ;

    @Override // X.InterfaceC41635GVr
    public final void onLongClick(View view) {
        o.LJIIIZ(view, "view");
    }

    public C41619GVb(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
    }

    @Override // X.InterfaceC41635GVr
    public final void LIZ(View view) {
        o.LJIIIZ(view, "view");
        H78.LIZ("PublishProgressDialogAddHelper -> publishProgressFloatingWindow -> onDoubleClick");
    }

    @Override // X.InterfaceC41635GVr
    public final void onClick(View view) {
        VideoPublishEditModel videoPublishEditModel;
        String str;
        Boolean bool;
        VideoPublishEditModel videoPublishEditModel2;
        String str2;
        o.LJIIIZ(view, "view");
        C42041Gej c42041Gej = C41620GVc.LIZLLL;
        if (c42041Gej != null) {
            ActivityC45651qj context = this.LIZ;
            o.LJIIIZ(context, "context");
            if (!c42041Gej.LJLLILLLL || !c42041Gej.LJZ) {
                return;
            }
            c42041Gej.LJZ = false;
            c42041Gej.postDelayed(new ARunnableS43S0100000_7(c42041Gej, 136), 500L);
            if (!c42041Gej.LJLLLLLL.isImageMode(c42041Gej.LJLJLLL) && GVX.LIZIZ()) {
                String str3 = c42041Gej.LJLJLLL;
                if (str3 == null || (bool = c42041Gej.LJLLL.get(str3)) == null) {
                    bool = Boolean.FALSE;
                }
                boolean booleanValue = bool.booleanValue();
                if ((GUO.LIZ() && !booleanValue) || !GUO.LIZ()) {
                    if (GUO.LIZ() && (str2 = c42041Gej.LJLJLLL) != null) {
                        c42041Gej.LJLLL.put(str2, Boolean.TRUE);
                    }
                    BaseShortVideoContext baseShortVideoContext = c42041Gej.LJLLI;
                    if (baseShortVideoContext != null && (baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel2 = (VideoPublishEditModel) baseShortVideoContext) != null) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("creation_id", videoPublishEditModel2.getCreationId());
                        c188727au.LJIIIZ("enter_from", videoPublishEditModel2.enterFrom);
                        c188727au.LJIIIZ("content_source", H7R.LJIIIIZZ(videoPublishEditModel2));
                        c188727au.LJFF(c42041Gej.getState().LIZ.getValue(), "publishing_percentage");
                        c188727au.LIZLLL(GUH.LJIILJJIL(), "publish_cnt");
                        FMX.LJIIL("click_publishing_toast", c188727au.LIZ);
                    }
                    IAVPublishService iAVPublishService = c42041Gej.LJLLLLLL;
                    BaseShortVideoContext baseShortVideoContext2 = c42041Gej.LJLLI;
                    if (baseShortVideoContext2 != null) {
                        iAVPublishService.reportQuitAutoUploadingShowEvent(baseShortVideoContext2);
                        C26227ARb c26227ARb = new C26227ARb(context);
                        c26227ARb.LJ(R.string.q68);
                        c26227ARb.LIZ(R.string.q67);
                        UC0.LIZJ(c26227ARb, new AqS138S0200000_7(c42041Gej, context, 85));
                        c26227ARb.LJII = false;
                        c26227ARb.LJI().LIZLLL();
                        return;
                    }
                    o.LJIJI("editModel");
                    throw null;
                }
            }
            if (!GUO.LIZ() || c42041Gej.LJLLLLLL.isStory(c42041Gej.LJLJLLL)) {
                return;
            }
            Integer value = c42041Gej.getState().LIZ.getValue();
            if (value == null) {
                value = 0;
            }
            if (value.intValue() >= 99) {
                ArrayList arrayList = (ArrayList) GUH.LJIIJ();
                if (arrayList.isEmpty()) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PublishModel publishModel = (PublishModel) it.next();
                    if (publishModel != null) {
                        str = publishModel.publishId;
                    } else {
                        str = null;
                    }
                    if (!o.LJ(str, c42041Gej.LJLJLLL)) {
                    }
                }
                return;
            }
            if (GUH.LJIILJJIL() == 0) {
                return;
            }
            BaseShortVideoContext baseShortVideoContext3 = c42041Gej.LJLLI;
            if (baseShortVideoContext3 != null && (baseShortVideoContext3 instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext3) != null) {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("creation_id", videoPublishEditModel.getCreationId());
                c188727au2.LJIIIZ("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
                c188727au2.LJFF(c42041Gej.getState().LIZ.getValue(), "publishing_percentage");
                c188727au2.LIZLLL(GUH.LJIILJJIL(), "publish_cnt");
                FMX.LJIIL("enter_publishing_preview_page", c188727au2.LIZ);
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//aweme/publish/detail");
            buildRoute.withParam("video_from", "from_publishing_video");
            buildRoute.withParam("activity_has_activity_options", true);
            buildRoute.open();
        }
    }
}
