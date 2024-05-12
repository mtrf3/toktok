package com.ss.android.ugc.profile.platform.base.assemble;

import X.C214298b3;
import X.C237559Tz;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.C9K9;
import X.C9PM;
import X.InterfaceC234089Gq;
import X.TBT;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MyProfileADAssem2 extends UIContentAssem implements InterfaceC234089Gq {
    public final C214298b3 LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9K8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PM) obj).LJLJJL);
            }
        }, null, new AqS186S0100000_4(this, 214), 6);
        x3();
        this.LJLJI = true;
    }

    @Override // X.InterfaceC234089Gq
    public final void updateIndexAtContainer(int i) {
    }

    public MyProfileADAssem2() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfilePlatformViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 922), C9K9.INSTANCE, null);
    }

    public final void v3() {
        String str;
        if (this.LJLJJLL && (str = this.LJLJJI) != null) {
            new C237559Tz().LJIIJJI(str, ((C9PM) ((AssemViewModel) this.LJLIL.getValue()).getState()).LJLJLLL, "other");
            this.LJLILLLLZI = false;
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        if (this.LJLJJL && !this.LJLJI) {
            v3();
        }
        if (this.LJLJI) {
            this.LJLJI = false;
        }
    }

    public final void x3() {
        ProfileCommonInfo on0;
        Integer accountType;
        String str = null;
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null && (on0 = iProfileBaseAbility.on0()) != null) {
            UserProfileInfo userProfileInfo = on0.getUserProfileInfo();
            if (userProfileInfo != null) {
                str = userProfileInfo.getUid();
            }
            this.LJLJJI = str;
            UserAccountInfo userAccountInfo = on0.getUserAccountInfo();
            boolean z = false;
            if (userAccountInfo != null && (accountType = userAccountInfo.getAccountType()) != null && accountType.intValue() == 3) {
                z = true;
            }
            this.LJLJJLL = z;
        }
        if (this.LJLJJL && this.LJLILLLLZI) {
            v3();
        }
    }

    @Override // X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        x3();
    }
}
