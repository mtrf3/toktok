package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9IP, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9IP extends AbstractC65781Prl implements InterfaceC88472Yns<C4LX<InterfaceC87283bg>, C76800UCe> {
    public final /* synthetic */ I18nMyProfileFragmentV2 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9IP(I18nMyProfileFragmentV2 i18nMyProfileFragmentV2) {
        super(1);
        this.LJLIL = i18nMyProfileFragmentV2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C4LX<InterfaceC87283bg> c4lx) {
        String str;
        Boolean bool;
        String str2;
        Serializable serializable;
        HashMap hashMap;
        C4LX<InterfaceC87283bg> hierarchyData = c4lx;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        I18nMyProfileFragmentV2 i18nMyProfileFragmentV2 = this.LJLIL;
        String str3 = i18nMyProfileFragmentV2.LJLJJLL;
        Bundle arguments = i18nMyProfileFragmentV2.getArguments();
        if (arguments != null) {
            str = arguments.getString("enter_from");
        } else {
            str = null;
        }
        I18nMyProfileFragmentV2 i18nMyProfileFragmentV22 = this.LJLIL;
        String str4 = i18nMyProfileFragmentV22.LJLIL;
        String str5 = i18nMyProfileFragmentV22.LJLILLLLZI;
        Bundle arguments2 = i18nMyProfileFragmentV22.getArguments();
        if (arguments2 != null) {
            bool = Boolean.valueOf(arguments2.getBoolean("delay_profile_loading"));
        } else {
            bool = null;
        }
        Bundle arguments3 = this.LJLIL.getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("notice_type");
        } else {
            str2 = null;
        }
        Bundle arguments4 = this.LJLIL.getArguments();
        if (arguments4 != null) {
            serializable = arguments4.getSerializable("inbox_log_extra");
        } else {
            serializable = null;
        }
        if (serializable instanceof HashMap) {
            hashMap = (HashMap) serializable;
        } else {
            hashMap = null;
        }
        hierarchyData.LIZ = new C9ID(str3, str, true, str4, str5, bool, str2, hashMap);
        return C76800UCe.LIZ;
    }
}
