package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV3;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9IO, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9IO extends AbstractC65781Prl implements InterfaceC88472Yns<C4LX<InterfaceC87283bg>, C76800UCe> {
    public final /* synthetic */ ProfileUser LJLIL;
    public final /* synthetic */ I18nMyProfileFragmentV3 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9IO(ProfileUser profileUser, I18nMyProfileFragmentV3 i18nMyProfileFragmentV3) {
        super(1);
        this.LJLIL = profileUser;
        this.LJLILLLLZI = i18nMyProfileFragmentV3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C4LX<InterfaceC87283bg> c4lx) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        Serializable serializable;
        HashMap hashMap;
        C4LX<InterfaceC87283bg> hierarchyData = c4lx;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        ProfileUser profileUser = this.LJLIL;
        Bundle arguments = this.LJLILLLLZI.getArguments();
        if (arguments != null) {
            str = arguments.getString("from");
        } else {
            str = null;
        }
        Bundle arguments2 = this.LJLILLLLZI.getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("enter_from");
        } else {
            str2 = null;
        }
        Boolean bool2 = Boolean.TRUE;
        Bundle arguments3 = this.LJLILLLLZI.getArguments();
        if (arguments3 != null) {
            bool = Boolean.valueOf(arguments3.getBoolean("delay_profile_loading"));
        } else {
            bool = null;
        }
        Bundle arguments4 = this.LJLILLLLZI.getArguments();
        if (arguments4 != null) {
            str3 = arguments4.getString("notice_type");
        } else {
            str3 = null;
        }
        Bundle arguments5 = this.LJLILLLLZI.getArguments();
        if (arguments5 != null) {
            serializable = arguments5.getSerializable("inbox_log_extra");
        } else {
            serializable = null;
        }
        if (serializable instanceof HashMap) {
            hashMap = (HashMap) serializable;
        } else {
            hashMap = null;
        }
        hierarchyData.LIZ = new C9IB(profileUser, str, str2, bool2, bool, str3, hashMap, null, 128);
        hierarchyData.LIZIZ = "root_data";
        return C76800UCe.LIZ;
    }
}
