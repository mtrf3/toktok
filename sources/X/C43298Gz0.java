package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeDialog;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Gz0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43298Gz0 extends AbstractC43295Gyx {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        Activity activity = null;
        if (interfaceC38263Ezz != null) {
            activity = interfaceC38263Ezz.LIZLLL();
        }
        if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null) {
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            o.LJIIIIZZ(curUser, "userService().curUser");
            new EditProfileBadgeDialog(curUser, 2).show(activityC45651qj.getSupportFragmentManager(), "EditProfileBadgeDialog");
        }
    }
}
