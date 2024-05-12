package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9F {
    public static PublishDefaultPermissionFragment LIZ(PermissionConfigure configure, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        o.LJIIIZ(configure, "configure");
        PublishDefaultPermissionFragment publishDefaultPermissionFragment = new PublishDefaultPermissionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_permission_configure", configure);
        bundle.putBoolean("is_auto_pop", z);
        publishDefaultPermissionFragment.setArguments(bundle);
        publishDefaultPermissionFragment.LJLILLLLZI = interfaceC88472Yns;
        publishDefaultPermissionFragment.LJLJI = interfaceC65784Pro;
        return publishDefaultPermissionFragment;
    }
}
