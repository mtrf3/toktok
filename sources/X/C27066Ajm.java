package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ajm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27066Ajm {
    public static /* synthetic */ Object LIZIZ(C27066Ajm c27066Ajm, FragmentManager fragmentManager, UserRight userRight, String str, String str2, InterfaceC67352kd interfaceC67352kd) {
        HashMap hashMap = new HashMap();
        c27066Ajm.getClass();
        return LIZ(fragmentManager, userRight, str, null, str2, 2, hashMap, interfaceC67352kd);
    }

    public static Object LIZ(FragmentManager fragmentManager, UserRight userRight, String str, HashMap hashMap, String str2, int i, HashMap hashMap2, InterfaceC67352kd interfaceC67352kd) {
        if (fragmentManager == null) {
            return C76800UCe.LIZ;
        }
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        UserRightFragment.continuation = c84654XKg;
        LIZJ(UserRightFragment.Companion, fragmentManager, userRight, str, hashMap, str2, i, hashMap2, 0, 128);
        Object LIZ = c84654XKg.LIZ();
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }

    public static void LIZJ(C27066Ajm c27066Ajm, FragmentManager fragmentManager, UserRight data, String str, HashMap hashMap, String str2, int i, HashMap daInfo, int i2, int i3) {
        if ((i3 & 8) != 0) {
            hashMap = null;
        }
        if ((i3 & 16) != 0) {
            str2 = null;
        }
        if ((i3 & 32) != 0) {
            i = 2;
        }
        if ((i3 & 64) != 0) {
            daInfo = new HashMap();
        }
        if ((i3 & 128) != 0) {
            i2 = (int) C27162AlK.LIZJ;
        }
        c27066Ajm.getClass();
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(daInfo, "daInfo");
        ASL asl = new ASL();
        asl.LJI(1);
        asl.LIZ.LJLLLLLL = i2;
        UserRightFragment userRightFragment = new UserRightFragment();
        userRightFragment.entrance = i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("data", data);
        bundle.putString("title", str);
        if (hashMap != null) {
            bundle.putSerializable("track_params", hashMap);
        }
        if (str2 != null) {
            C79234V7u.LJJIJLIJ(bundle, str2);
        }
        userRightFragment.setArguments(bundle);
        C78929UyL.LJIJJLI(userRightFragment);
        userRightFragment.daInfo = daInfo;
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = userRightFragment;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        tuxSheet.show(fragmentManager, "CommerceUserRightFragment");
    }
}
