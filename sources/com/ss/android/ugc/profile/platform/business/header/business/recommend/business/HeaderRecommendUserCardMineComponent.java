package com.ss.android.ugc.profile.platform.business.header.business.recommend.business;

import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C2318798d;
import X.C2320698w;
import X.C234999Kd;
import X.C243089gO;
import X.C25770A9m;
import X.C55096Ljo;
import X.C55953Lxd;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C78939UyV;
import X.C7MY;
import X.C8VC;
import X.C8YN;
import X.C99F;
import X.C99H;
import X.InterfaceC235069Kk;
import X.InterfaceC57760Mlg;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.AUListenerS8S0102000_4;
import Y.IDAListenerS2S0110000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.profile.experiment.HomepageRecommendSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.recommend.user.HomepageRecommendVM;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.business.base.HeaderRecommendUserCardBaseComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;

/* loaded from: classes5.dex */
public final class HeaderRecommendUserCardMineComponent extends HeaderRecommendUserCardBaseComponent {
    public final C214298b3 LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.recommend.business.base.HeaderRecommendUserCardBaseComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.recommend.business.base.HeaderRecommendUserCardBaseComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public HeaderRecommendUserCardMineComponent() {
        C65776Prg LIZ = C65352Pkq.LIZ(HomepageRecommendVM.class);
        this.LJLJJI = new C214298b3(new AqS154S0100000_4(LIZ, 955), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C2318798d.INSTANCE, LIZ);
    }

    public final HomepageRecommendVM H3() {
        return (HomepageRecommendVM) this.LJLJJI.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        long j;
        int i;
        super.onCreate();
        if (!C78939UyV.LJJJJLI(H3().iv0())) {
            return;
        }
        Context context = getContext();
        User user = null;
        if (context != null) {
            C25770A9m c25770A9m = new C25770A9m(context, null, null, 14);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C7MY.LIZIZ(100));
            layoutParams.topMargin = C7MY.LIZIZ(16);
            c25770A9m.setLayoutParams(layoutParams);
            this.LJLILLLLZI = c25770A9m;
            A3().LJJJ(C212428Vi.LIZ(this), C212428Vi.LIZLLL(this), new AqS170S0100000_4(H3().iv0(), 1369));
            A3().W7(H3());
            A3().LIZ(R.string.pey, new ACListenerS24S0100000_4(this, BuildConfig.VERSION_CODE));
            InterfaceC57760Mlg hv0 = H3().hv0();
            if (hv0 != null) {
                A3().W7(hv0);
            }
            v3();
        }
        C8YN.LJII(this, H3(), new TBT() { // from class: X.98m
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2320198r) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 314), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.98e
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2320198r) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 316), 4);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.98i
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2320198r) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 317), 4);
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            profilePlatformVM.rv0(new AqS170S0100000_4(this, 1371));
        }
        HomepageRecommendSetting.HomepageRecommendConfigModel LIZ = HomepageRecommendSetting.LIZ();
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
        }
        if (user != null) {
            j = user.getFriendCount();
        } else {
            j = 0;
        }
        long max = Math.max(j, C99H.LIZ());
        if (user != null) {
            i = user.historyMaxFollowerCount;
        } else {
            i = -1;
        }
        C243089gO.LIZLLL(max, i, C2320698w.LIZIZ(), LIZ.xDays, LIZ.yHide, LIZ.lowMufBound, LIZ.lowFollowerBound, C99F.LIZ());
    }

    public final void I3(boolean z) {
        int i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(C55953Lxd.LJ());
        IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null);
        int i2 = 0;
        if (iHeaderBioAbility != null) {
            i = iHeaderBioAbility.A();
        } else {
            i = 0;
        }
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            i2 = iHeaderAdvancedFeatureAbility.A();
        }
        ofFloat.addUpdateListener(new AUListenerS8S0102000_4(this, i, i2, 1));
        ofFloat.addListener(new IDAListenerS2S0110000_4(this, z, 7));
        ofFloat.addListener(new IDAListenerS2S0110000_4(this, z, 6));
        if (z) {
            ofFloat.start();
        } else {
            ofFloat.reverse();
        }
    }
}
