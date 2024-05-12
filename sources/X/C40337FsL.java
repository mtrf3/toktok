package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.commercialize.live.business.links.ui.LynxContainerWrapperFragment;

/* renamed from: X.FsL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40337FsL {
    public static void LIZ(FragmentManager fragmentManager, String str) {
        LynxContainerWrapperFragment lynxContainerWrapperFragment = new LynxContainerWrapperFragment();
        Bundle bundle = new Bundle();
        bundle.putString("SCHEMA", str);
        lynxContainerWrapperFragment.setArguments(bundle);
        if (fragmentManager != null) {
            lynxContainerWrapperFragment.show(fragmentManager, "LynxContainerWrapperFragment");
        }
    }
}
