package com.ss.android.ugc.profile.platform.base.assemble;

import X.C212428Vi;
import X.C237259Sv;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C78842Uww;
import X.C8VV;
import X.C9IA;
import X.C9IB;
import X.C9IJ;
import X.C9IL;
import X.V0Q;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ProfileRootBaseComponent extends BaseContainerComponent implements IProfileBaseAbility {
    public ProfileUser LJLJLJ;
    public final C55749LuL LJLJLLL;
    public boolean LJLL;

    public ProfileRootBaseComponent() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C9IB.class, "root_data"), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void A3() {
        C8VV.LIZJ(this, new C9IA(this));
    }

    public final C9IB<ProfileUser> I3() {
        return (C9IB) this.LJLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final ProfileCommonInfo on0() {
        ProfileUser profileUser = this.LJLJLJ;
        if (profileUser != null) {
            return profileUser.common;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        String str;
        ProfileUser profileUser;
        ProfileCommonInfo profileCommonInfo;
        ProfilePlatformViewModel E3 = E3();
        if (E3 != null) {
            C9IB<ProfileUser> I3 = I3();
            if (I3 == null || (profileUser = I3.LJLIL) == null || (profileCommonInfo = profileUser.common) == null || (str = profileCommonInfo.getMode()) == null) {
                str = "normal_mode";
            }
            E3.LJLIL = str;
        }
        super.onCreate();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IProfileBaseAbility.class, null);
        }
    }

    public final void K3(ProfileUser profileUser) {
        this.LJLJLJ = profileUser;
        if (C78842Uww.LJIJ(V0Q.Default, C78842Uww.LJJ(0, 10)) <= 0) {
            ((LinkedHashMap) C237259Sv.LIZLLL).clear();
        }
        A3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        ProfileUser profileUser = null;
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IProfileBaseAbility.class, null);
        }
        C9IB<ProfileUser> I3 = I3();
        if (I3 != null) {
            profileUser = I3.LJLIL;
        }
        this.LJLJLJ = profileUser;
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final void updateCommonInfo(ProfileCommonInfo profileCommonInfo) {
        ProfileUser profileUser;
        if (profileCommonInfo == null || (profileUser = this.LJLJLJ) == null) {
            return;
        }
        profileUser.common = profileCommonInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "sticker_set_details_page") != false) goto L15;
     */
    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cu(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L82
            java.lang.String r5 = "personal_homepage"
        L4:
            java.lang.String r4 = "sticker_set_details_page"
            r3 = 0
            if (r8 == 0) goto L60
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r0 = r6.E3()
            if (r0 == 0) goto L5e
            X.33Q r0 = r0.getState()
            X.9PM r0 = (X.C9PM) r0
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.LJLLL
        L19:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L20
            r5 = r4
        L20:
            r4 = r5
        L21:
            if (r8 == 0) goto L4d
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r3 = r0.getCurUserId()
        L2d:
            java.lang.String r1 = ""
            if (r3 != 0) goto L32
            r3 = r1
        L32:
            if (r8 == 0) goto L38
        L34:
            X.C26335AVf.LJIIL(r4, r3, r1, r7)
            return
        L38:
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r0 = r6.E3()
            if (r0 == 0) goto L34
            X.33Q r0 = r0.getState()
            X.9PM r0 = (X.C9PM) r0
            if (r0 == 0) goto L34
            java.lang.String r0 = r0.LLF
            if (r0 != 0) goto L4b
            goto L34
        L4b:
            r1 = r0
            goto L34
        L4d:
            com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo r0 = r6.on0()
            if (r0 == 0) goto L2d
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r0.getUserProfileInfo()
            if (r0 == 0) goto L2d
            java.lang.String r3 = r0.getUid()
            goto L2d
        L5e:
            r0 = r3
            goto L19
        L60:
            X.LuL r2 = new X.LuL
            boolean r1 = r6.checkSupervisorPrepared()
            java.lang.Class<X.APb> r0 = X.C26175APb.class
            kotlin.jvm.internal.AqS58S1200000_3 r0 = X.C47704Ins.LJ(r6, r0, r3)
            r2.<init>(r0, r1)
            java.lang.Object r0 = r2.getValue()
            X.APb r0 = (X.C26175APb) r0
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.LJLJI
        L79:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L20
            goto L21
        L80:
            r0 = r3
            goto L79
        L82:
            java.lang.String r5 = "others_homepage"
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.assemble.ProfileRootBaseComponent.Cu(java.lang.String, boolean):void");
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final void y6(boolean z, C9IL contentType, String infoCollectValue, boolean z2) {
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(infoCollectValue, "infoCollectValue");
        C9IJ.LIZJ(z, contentType, infoCollectValue, z2);
    }
}
