package X;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import java.util.List;

/* loaded from: classes10.dex */
public final class M2C {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZIZ(FragmentManager fragmentManager) {
        if (fragmentManager == null) {
            return false;
        }
        List<Fragment> LJJJJLI = fragmentManager.LJJJJLI();
        if (C79004UzY.LJJIFFI(LJJJJLI)) {
            return false;
        }
        for (Fragment fragment : LJJJJLI) {
            if (fragment != 0 && !(fragment instanceof InterfaceC55317LnN)) {
                IDetailPageAbility LIZ = KQ1.LIZ(fragment);
                if (LIZ != null && LIZ.mq()) {
                    return true;
                }
                if (fragment instanceof DialogFragment) {
                    Dialog dialog = ((DialogFragment) fragment).getDialog();
                    if (dialog != null) {
                        return dialog.isShowing();
                    }
                } else if (fragment instanceof C75J) {
                    return ((C75J) fragment).isShowing();
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0030. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r4, com.ss.android.ugc.aweme.feed.model.Aweme r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M2C.LIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):java.lang.String");
    }
}
