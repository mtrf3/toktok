package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.OTr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61967OTr extends AbstractC61968OTs {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        ActivityC45651qj activityC45651qj;
        InterfaceC61969OTt interfaceC61969OTt = (InterfaceC61969OTt) xBaseParamModel;
        o.LJIIIZ(type, "type");
        IProfileService LIZ = ProfileServiceImpl.LIZ();
        Bundle LIZ2 = C0JT.LIZ("need_restart", false, "should_restart_later", false);
        LIZ2.putString("sdk_name", interfaceC61969OTt.getSdkName());
        LIZ2.putString("sdk_version", interfaceC61969OTt.getSdkVersion());
        AV9 av9 = new AV9("authorize_screen", "auth_switch_account_button", interfaceC61969OTt.getClientKey(), interfaceC61969OTt.getSdkName(), interfaceC61969OTt.getSdkVersion());
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (context = interfaceC38263Ezz.getContext()) == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "Context not provided in host", 4);
            return;
        }
        Activity LIZ3 = C37925EuX.LIZ(context);
        if (LIZ3 == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "context can not convert to activity", 4);
        } else {
            if (!(LIZ3 instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) LIZ3) == null) {
                return;
            }
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
            LIZ.showInChooseAccountBottomSheet(supportFragmentManager, av9, "", LIZ2, null, null);
        }
    }
}
