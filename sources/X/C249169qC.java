package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.paidcontent.fragments.PromoteDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.9qC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249169qC {
    public static void LIZ(FragmentManager fragmentManager, String str, InterfaceC65784Pro func, String enterFrom, String authorID) {
        o.LJIIIZ(func, "func");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(authorID, "authorID");
        PromoteDialogFragment promoteDialogFragment = new PromoteDialogFragment();
        promoteDialogFragment.LJLILLLLZI = str;
        promoteDialogFragment.LJLIL = func;
        promoteDialogFragment.LJLJI = enterFrom;
        promoteDialogFragment.LJLJJI = authorID;
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = promoteDialogFragment;
        asl.LJI(2);
        asl.LIZ.show(fragmentManager, "PromotionDialogFragment");
    }
}
