package X;

import Y.AObjectS145S0100000_7;
import Y.AfS59S0100000_7;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.GMj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41393GMj implements IAvatarPublishStoryService {
    public InterfaceC65784Pro<C76800UCe> LIZ = C41395GMl.LJLIL;

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void clearEditPageData() {
        AnonymousClass626.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final boolean canRecoverEditPage() {
        if (AnonymousClass626.LIZ != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void dismissDialog() {
        this.LIZ.invoke();
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void downloadTextFont(Context context) {
        o.LJIIIZ(context, "context");
        C6YM.LIZ();
        C69B.LIZ();
        C69B.LIZJ();
        C68M.LJIIJ().LJIJ(context);
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final boolean isChangAvatarPublish(Object obj) {
        if (obj != null && (obj instanceof VideoPublishEditModel)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (H7R.LJJIZ(videoPublishEditModel) && !C41349GKr.LIZ() && (videoPublishEditModel.creativeModel.changeAvatarModel.isSingletonRecover || !videoPublishEditModel.mIsFromDraft)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void registerDialogCallback(InterfaceC65784Pro<C76800UCe> dismissCallback) {
        o.LJIIIZ(dismissCallback, "dismissCallback");
        this.LIZ = dismissCallback;
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void requestUpdateAvatar(String path, InterfaceC88472Yns<? super AvatarUri, C76800UCe> callback) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(callback, "callback");
        AObjectS145S0100000_7 aObjectS145S0100000_7 = new AObjectS145S0100000_7(callback, 2);
        File file = new File(path);
        long j = 1024;
        int length = (int) (((file.length() / j) + 1) * j);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(com.ss.android.ugc.aweme.app.api.Api.LIZIZ);
        LIZ.append("?uid=");
        ((RBX) HG3.LJIILL()).uploadAvatar(new HandlerC41398GMo(aObjectS145S0100000_7), UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ), length, file.getPath(), null);
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void publishDirectly(ActivityC45651qj activity, Bundle bundle, boolean z, InterfaceC65784Pro<C76800UCe> publishFinish) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(publishFinish, "publishFinish");
        C41409GMz.LIZ(bundle);
        VideoPublishEditModel videoPublishEditModel = AnonymousClass626.LIZ;
        C41356GKy c41356GKy = new C41356GKy(activity, bundle, z, new C41394GMk(this, publishFinish, bundle));
        if (videoPublishEditModel != null) {
            videoPublishEditModel.creativeModel.changeAvatarModel.publishEnterMethod = "direct_post";
            c41356GKy.LIZIZ(videoPublishEditModel);
            C138625cI c138625cI = new C138625cI(videoPublishEditModel);
            C41357GKz c41357GKz = c41356GKy.LIZLLL;
            c138625cI.LIZ(c41357GKz.LJLJJI, c41357GKz.LJLJI, new AqS133S0200000_2(c41356GKy, videoPublishEditModel, LiveTryModeCountDownThresholdSetting.DEFAULT));
            return;
        }
        CreativeInfo creativeInfo = c41356GKy.LJ.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        C138895cj c138895cj = new C138895cj(creativeInfo, new GYB(0));
        C41357GKz c41357GKz2 = c41356GKy.LIZLLL;
        C138895cj.LIZ(c138895cj, c41357GKz2.LJLJJI, false, c41357GKz2.LJLJI, false, false, 52).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(c41356GKy, 60), new AfS59S0100000_7(c41356GKy, 61));
    }

    @Override // com.ss.android.ugc.aweme.services.IAvatarPublishStoryService
    public final void openEditPage(ActivityC45651qj activity, Bundle bundle, String avatarPath, String originPath, InterfaceC88472Yns<? super Boolean, C76800UCe> openEditResult) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(avatarPath, "avatarPath");
        o.LJIIIZ(originPath, "originPath");
        o.LJIIIZ(openEditResult, "openEditResult");
        C41409GMz.LIZ(bundle);
        if (canRecoverEditPage()) {
            VideoPublishEditModel videoPublishEditModel = AnonymousClass626.LIZ;
            if (videoPublishEditModel == null) {
                return;
            }
            new C138625cI(videoPublishEditModel).LIZ(avatarPath, originPath, new GL7(activity, videoPublishEditModel, bundle, openEditResult));
            return;
        }
        AVExternalServiceImpl.LIZ().openGotoNextService().gotoNextPage(activity, false, bundle, C47261Igj.LJJIJ(avatarPath), new GL8(openEditResult));
    }
}
