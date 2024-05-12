package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dialogfragmentcontainer.OSPHalfDialogContainerFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Aqk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27498Aqk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(FragmentManager fragmentManager, Fragment fragment, String str) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        OSPHalfDialogContainerFragment oSPHalfDialogContainerFragment = new OSPHalfDialogContainerFragment();
        oSPHalfDialogContainerFragment.LJLIL = fragment;
        oSPHalfDialogContainerFragment.show(fragmentManager, str);
    }
}
