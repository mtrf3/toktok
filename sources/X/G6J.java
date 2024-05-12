package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G6J extends AbstractC65781Prl implements InterfaceC88472Yns<AwemeDraft, C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<AwemeDraft, C76800UCe> LJLIL;
    public final /* synthetic */ C41388GMe LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6J(AqS173S0100000_7 aqS173S0100000_7, C41388GMe c41388GMe, ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel) {
        super(1);
        this.LJLIL = aqS173S0100000_7;
        this.LJLILLLLZI = c41388GMe;
        this.LJLJI = activityC45651qj;
        this.LJLJJI = videoPublishEditModel;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AwemeDraft it) {
        o.LJIIIZ(it, "it");
        this.LJLIL.invoke(it);
        C41388GMe c41388GMe = this.LJLILLLLZI;
        ActivityC45651qj activityC45651qj = this.LJLJI;
        VideoPublishEditModel videoPublishEditModel = this.LJLJJI;
        c41388GMe.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        bundle.putBoolean("enter_record_from_other_platform", false);
        bundle.putBoolean("extra_enter_from_live", false);
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", videoPublishEditModel.isPrivate());
        bundle.putBoolean("from_search", videoPublishEditModel.creativeModel.searchCreateModel.isFromSearch());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoPublishService.createBundleParams()  bundle=");
        LIZ.append(bundle);
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        Publish.PublishBundle = bundle;
        GI3.LJII(new G8R(activityC45651qj, bundle, null));
        return C76800UCe.LIZ;
    }
}
