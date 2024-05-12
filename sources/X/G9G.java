package X;

import Y.ARunnableS43S0100000_7;
import Y.IDDListenerS146S0100000_7;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.privacy.EditPageDefaultPrivacySettingFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS29S0210000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9G implements InterfaceC41048G9c {
    @Override // X.InterfaceC41048G9c
    public final void LIZ(Fragment fragment) {
        PublishDefaultPermissionFragment publishDefaultPermissionFragment;
        o.LJIIIZ(fragment, "fragment");
        if ((fragment instanceof PublishDefaultPermissionFragment) && (publishDefaultPermissionFragment = (PublishDefaultPermissionFragment) fragment) != null) {
            publishDefaultPermissionFragment.Il(true);
        }
    }

    public final EditPageDefaultPrivacySettingFragment LIZJ(PermissionConfigure configure, AqS29S0210000_7 aqS29S0210000_7) {
        o.LJIIIZ(configure, "configure");
        EditPageDefaultPrivacySettingFragment editPageDefaultPrivacySettingFragment = new EditPageDefaultPrivacySettingFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_permission_configure", configure);
        editPageDefaultPrivacySettingFragment.setArguments(bundle);
        editPageDefaultPrivacySettingFragment.LJLILLLLZI = aqS29S0210000_7;
        return editPageDefaultPrivacySettingFragment;
    }

    public final PublishDefaultPermissionFragment LIZLLL(PermissionConfigure configure, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(configure, "configure");
        return G9F.LIZ(configure, interfaceC88472Yns, interfaceC65784Pro, true);
    }

    public final C41018G7y LIZIZ(ActivityC45651qj activityC45651qj, VideoPublishEditModel model, PermissionConfigure configure, IDDListenerS146S0100000_7 iDDListenerS146S0100000_7, AqS154S0200000_7 aqS154S0200000_7, AqS173S0100000_7 aqS173S0100000_7, boolean z) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(configure, "configure");
        return new C41018G7y(activityC45651qj, model, configure, iDDListenerS146S0100000_7, new ARunnableS43S0100000_7((Object) aqS154S0200000_7, 0), aqS173S0100000_7, false, z);
    }
}
