package com.ss.android.ugc.aweme.ecommerce.base.common.view;

import X.C40341FsP;
import X.C58096Mr6;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior;

/* loaded from: classes7.dex */
public final class CommerceHybridBottomSheetDialogFragmentBehaviorImpl implements ICommerceHybridBottomSheetDialogFragmentBehavior {
    public static ICommerceHybridBottomSheetDialogFragmentBehavior LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceHybridBottomSheetDialogFragmentBehavior.class, false);
        if (LIZ != null) {
            return (ICommerceHybridBottomSheetDialogFragmentBehavior) LIZ;
        }
        if (C58096Mr6.K == null) {
            synchronized (ICommerceHybridBottomSheetDialogFragmentBehavior.class) {
                if (C58096Mr6.K == null) {
                    C58096Mr6.K = new CommerceHybridBottomSheetDialogFragmentBehaviorImpl();
                }
            }
        }
        return C58096Mr6.K;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior
    public final void LIZ(Uri uri, int i, FragmentManager fragmentManager, String str) {
        C40341FsP.LIZ(uri, i, fragmentManager, str, true);
    }
}
