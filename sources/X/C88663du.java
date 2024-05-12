package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.fragment.GroupMemberSelectFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.3du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88663du {
    public static void LIZ(Context context, Bundle bundle) {
        FragmentManager supportFragmentManager;
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
            return;
        }
        GroupMemberSelectFragment groupMemberSelectFragment = new GroupMemberSelectFragment();
        groupMemberSelectFragment.setArguments(bundle);
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = groupMemberSelectFragment;
        tuxSheet.LJZI = false;
        asl.LJI(1);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = (int) (C63081OpJ.LJJJJJL(context) * 0.95d);
        tuxSheet2.LJZL = true;
        tuxSheet2.LJLJI = false;
        tuxSheet2.show(supportFragmentManager, "GroupCreateFragment");
    }
}
