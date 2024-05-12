package X;

import Y.IDDListenerS142S0100000_2;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.guide.PostedDraftGuideFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.5Z7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Z7 {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(VideoPublishEditModel videoPublishEditModel) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", videoPublishEditModel.getCreationId());
        c188727au.LJIIIZ("shoot_way", videoPublishEditModel.mShootWay);
        c188727au.LJIIIZ("content_type", H7R.LJIIIZ(videoPublishEditModel));
        c188727au.LJIIIZ("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        c188727au.LIZLLL(videoPublishEditModel.draftId, "draft_id");
        c188727au.LJIIIZ("new_draft_id", videoPublishEditModel.newDraftId);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …d)\n            .builder()");
        return map;
    }

    public static void LIZIZ(ActivityC45651qj activityC45651qj, VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        ASL asl = new ASL();
        PostedDraftGuideFragment postedDraftGuideFragment = new PostedDraftGuideFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("model", model);
        postedDraftGuideFragment.setArguments(bundle);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = postedDraftGuideFragment;
        tuxSheet.LJLILLLLZI = new IDDListenerS142S0100000_2(model, 1);
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        tuxSheet.show(supportFragmentManager, "PostedDraftGuideFragment");
        FMX.LJIIL("posted_draft_guide_sheet_show", LIZ(model));
        C60903NvH.LJIIJJI().LJJJI().LJIIJJI();
    }
}
