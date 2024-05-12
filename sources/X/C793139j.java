package X;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.39j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C793139j {
    public final VideoPublishEditModel LIZ;
    public final C85213Wb LIZIZ;
    public C85563Xk LIZJ;
    public final EffectDraftSubmissionListViewModel LIZLLL;
    public boolean LJ;
    public final java.util.Map<String, String> LJFF;

    public C793139j(View rootLayout, WM7 rootScene, VideoPublishEditModel mModel) {
        List<UploadableDraftEffect> list;
        o.LJIIIZ(rootLayout, "rootLayout");
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(mModel, "mModel");
        this.LIZ = mModel;
        View findViewById = rootLayout.findViewById(R.id.crx);
        o.LJIIIIZZ(findViewById, "rootLayout.findViewById(…aft_submission_container)");
        C85213Wb c85213Wb = (C85213Wb) findViewById;
        this.LIZIZ = c85213Wb;
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("creation_id", mModel.getCreationId());
        String str = mModel.enterFrom;
        oszArr[1] = new OSZ("enter_from", str == null ? "" : str);
        oszArr[2] = new OSZ("shoot_way", mModel.mShootWay);
        java.util.Map<String, String> LJJL = C113554cx.LJJL(oszArr);
        this.LJFF = LJJL;
        if (rootScene.mActivity != null) {
            this.LJ = false;
            c85213Wb.setVisibility(0);
            c85213Wb.LIZ(false);
            EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel = (EffectDraftSubmissionListViewModel) C165706es.LJIIIIZZ(rootScene, null, null, 6).get(EffectDraftSubmissionListViewModel.class);
            this.LIZLLL = effectDraftSubmissionListViewModel;
            if (C69162nY.LIZ()) {
                list = C1DF.LJIJ(mModel.creativeModel.mobileEffectsModel2.exportedEffects);
            } else {
                list = mModel.creativeModel.mobileEffectsModel.usedDraftEffects;
            }
            if (effectDraftSubmissionListViewModel != null) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(effectDraftSubmissionListViewModel), null, null, new C69182na(this, list, null), 3);
                C78897Uxp.LJJJ("show_submit_mobile_effect_post_text", LJJL);
            } else {
                o.LJIJI("viewModel");
                throw null;
            }
        }
    }
}
