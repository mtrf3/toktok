package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H7O implements InterfaceC45242HpG {
    public final Activity LIZ;
    public final C82622Wbi LIZIZ;
    public C42278GiY LIZJ;

    @Override // X.InterfaceC45242HpG
    public final void LIZIZ(int i) {
    }

    @Override // X.InterfaceC45242HpG
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZ() {
        if (!this.LIZ.isFinishing()) {
            C42278GiY c42278GiY = this.LIZJ;
            if (c42278GiY != null && c42278GiY.isShowing()) {
                return;
            }
            C42279GiZ c42279GiZ = C42279GiZ.LIZ;
            Activity activity = this.LIZ;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(true);
            creativeLoadingDialogBuilder.backCanCancel(false);
            creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
            String string = this.LIZ.getString(R.string.rjz);
            o.LJIIIIZZ(string, "activity.getString(R.string.ss_loading)");
            creativeLoadingDialogBuilder.loadingMessage(string);
            creativeLoadingDialogBuilder.clickCancelListener(new AqS173S0100000_7(this, 240));
            C42278GiY c42278GiY2 = (C42278GiY) c42279GiZ.createLoadingDialog(activity, 1019, creativeLoadingDialogBuilder);
            this.LIZJ = c42278GiY2;
            c42278GiY2.show();
            C42278GiY c42278GiY3 = this.LIZJ;
            if (c42278GiY3 == null || !c42278GiY3.isShowing()) {
                return;
            }
            c42278GiY3.updateProgress(Math.min(0, 100));
        }
    }

    @Override // X.InterfaceC45242HpG
    public final void dismissDialog() {
        C42278GiY c42278GiY = this.LIZJ;
        if (c42278GiY != null) {
            c42278GiY.dismiss();
        }
    }

    public H7O(Activity activity, C82622Wbi c82622Wbi) {
        this.LIZ = activity;
        this.LIZIZ = c82622Wbi;
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent data) {
        HKJ hkj;
        o.LJIIIZ(data, "data");
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutAnchorMediaProcessImpl#onChosenResult");
        LIZ();
        ShortVideoContext shortVideoContext = (ShortVideoContext) data.getParcelableExtra("key_short_video_context");
        if (shortVideoContext == null) {
            return;
        }
        AutoCutAnchorModel autoCutAnchorModel = shortVideoContext.creativeModel.autoCutAnchorModel;
        ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
        FollowUpPublishTrackerModel followUpPublishTrackerModel = shortVideoContext.creativeModel.followUpPublishTrackerModel;
        followUpPublishTrackerModel.followUpFirstItemId = C78983UzD.LJLJLLL;
        followUpPublishTrackerModel.followUpItemIdGroups = C78983UzD.LJLL;
        followUpPublishTrackerModel.enterRecordFromFeed = true;
        int intExtra = data.getIntExtra("key_designated_material_count", 0);
        C82622Wbi c82622Wbi = this.LIZIZ;
        Activity activity = this.LIZ;
        String str = autoCutAnchorModel.templateId;
        String str2 = autoCutAnchorModel.musicId;
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutAnchorMediaProcessImpl#startUseTemplate");
        if (str == null || str.length() == 0 || parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty() || activity == null) {
            return;
        }
        C43610H9q c43610H9q = new C43610H9q(intExtra, shortVideoContext.LJI(), false, str, str2);
        if (c82622Wbi == null || (hkj = (HKJ) c82622Wbi.LJIIIIZZ(null, HKJ.class)) == null) {
            return;
        }
        hkj.ho0(str, str2, parcelableArrayListExtra, shortVideoContext.creativeInfo, intExtra, new C43609H9p(c43610H9q, this, shortVideoContext, activity, parcelableArrayListExtra));
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
        C41993Gdx.LIZ(list, creativeInfo);
        return 0;
    }
}
