package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.VideoPrivacySettingUnFoldFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final class SPH implements DialogInterface.OnDismissListener {
    public final /* synthetic */ PrivacySettingDialogRouter LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ VideoPrivacySettingUnFoldFragment LJLJI;

    public SPH(PrivacySettingDialogRouter privacySettingDialogRouter, Aweme aweme, VideoPrivacySettingUnFoldFragment videoPrivacySettingUnFoldFragment) {
        this.LJLIL = privacySettingDialogRouter;
        this.LJLILLLLZI = aweme;
        this.LJLJI = videoPrivacySettingUnFoldFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.LJLIL.sendLoopCurrentStoryEvent(this.LJLILLLLZI, false);
        VideoPrivacySettingUnFoldFragment videoPrivacySettingUnFoldFragment = this.LJLJI;
        if ((videoPrivacySettingUnFoldFragment instanceof VideoPrivacySettingUnFoldFragment) && videoPrivacySettingUnFoldFragment != null) {
            Iterator it = ((ArrayList) videoPrivacySettingUnFoldFragment.LJZI).iterator();
            while (it.hasNext()) {
                ORS.LJJZ(((BasePrivacySettingViewModel) it.next()).LJLIL);
            }
        }
    }
}
