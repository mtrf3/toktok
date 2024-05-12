package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHybridBottomSheetDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.FsP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40341FsP {
    public static void LIZ(android.net.Uri uri, int i, FragmentManager fm, String str, boolean z) {
        o.LJIIIZ(fm, "fm");
        CommerceHybridBottomSheetDialogFragment commerceHybridBottomSheetDialogFragment = new CommerceHybridBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("url", uri);
        bundle.putInt("height", i);
        bundle.putBoolean("use_react_id_close", z);
        commerceHybridBottomSheetDialogFragment.setArguments(bundle);
        commerceHybridBottomSheetDialogFragment.show(fm, str);
    }
}
