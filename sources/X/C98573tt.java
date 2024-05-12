package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* renamed from: X.3tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98573tt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        DialogFragment dialogFragment;
        Activity[] activityStack = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activityStack, "getActivityStack()");
        for (Activity it : activityStack) {
            o.LJIIIIZZ(it, "it");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(it);
            if (LJJIFFI != null) {
                Fragment LJJJIL = LJJIFFI.getSupportFragmentManager().LJJJIL("quick_chat_sheet");
                if ((LJJJIL instanceof TuxSheet) && (dialogFragment = (DialogFragment) LJJJIL) != null) {
                    dialogFragment.dismissAllowingStateLoss();
                }
            }
        }
    }
}
