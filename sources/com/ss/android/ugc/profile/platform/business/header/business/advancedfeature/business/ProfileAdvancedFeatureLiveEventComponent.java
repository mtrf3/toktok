package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business;

import X.ActivityC45651qj;
import X.C0DC;
import X.C212428Vi;
import X.C243039gJ;
import X.C26335AVf;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C75792yF;
import X.C8YN;
import X.C9R8;
import X.TBT;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data.LiveEventData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureLiveEventComponent extends HeaderAdvancedFeatureBaseUIComponent {
    public List<LiveEventStruct> LJLJLJ;
    public LiveEventStruct LJLJLLL;
    public LiveEventData LJLL;
    public long LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        super.actionsAfterUpdateUI();
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9HV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2304292o) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 220), 6);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Map<String, Boolean> x3() {
        String lowerCase = "HAS_INTERACTION_LIVE".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJI));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        User hv0;
        Fragment LIZLLL;
        ActivityC45651qj mo49getActivity;
        FragmentManager supportFragmentManager;
        String str;
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM == null || (hv0 = profilePlatformVM.hv0()) == null) {
            return;
        }
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            iProfileBaseAbility.Cu("live", A3());
        }
        List<LiveEventStruct> list = this.LJLJLJ;
        int i = 0;
        boolean z = true;
        if (list != null && list.size() == 1) {
            LiveEventStruct liveEventStruct = this.LJLJLLL;
            if (liveEventStruct != null) {
                C243039gJ.LIZ(getContext(), liveEventStruct);
            }
        } else {
            if (this.LJLJLJ != null && (!r0.isEmpty()) && (LIZLLL = C212428Vi.LIZLLL(this)) != null && (mo49getActivity = LIZLLL.mo49getActivity()) != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
                C9R8.LIZ(supportFragmentManager, hv0, this.LJLJLJ);
            }
        }
        LiveEventStruct liveEventStruct2 = this.LJLJLLL;
        if (liveEventStruct2 == null || !liveEventStruct2.isPaidEvent()) {
            z = false;
        }
        LiveEventStruct liveEventStruct3 = this.LJLJLLL;
        if (liveEventStruct3 == null || (str = liveEventStruct3.getId()) == null) {
            str = "";
        }
        List<LiveEventStruct> list2 = this.LJLJLJ;
        if (list2 != null) {
            i = list2.size();
        }
        C26335AVf.LJ(i, str, z, "click", getEnterFrom());
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Integer componentIcon() {
        Integer componentIcon = super.componentIcon();
        if (componentIcon == null) {
            return Integer.valueOf(R.raw.icon_calendar_star);
        }
        return componentIcon;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final String componentText() {
        String componentText = super.componentText();
        if (componentText == null) {
            return C44384HbQ.LJJZ(R.string.g76);
        }
        return componentText;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r0 == null) goto L20;
     */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateComponentUIAndData() {
        /*
            r7 = this;
            java.lang.Integer r0 = r7.componentIcon()
            if (r0 == 0) goto Ld
            int r0 = r0.intValue()
            r7.H3(r0)
        Ld:
            Y.ACListenerS24S0100000_4 r1 = new Y.ACListenerS24S0100000_4
            r0 = 199(0xc7, float:2.79E-43)
            r1.<init>(r7, r0)
            r7.E3(r1)
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r0 = r7.getProfilePlatformVM()
            r6 = 0
            if (r0 == 0) goto L24
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.hv0()
            if (r1 != 0) goto L92
        L24:
            android.content.Context r0 = r7.getContext()
            r4 = 0
            java.lang.String r5 = ""
            if (r0 == 0) goto L5e
            android.content.res.Resources r3 = r0.getResources()
            if (r3 == 0) goto L5e
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.ss.android.ugc.aweme.profile.model.LiveEventStruct r0 = r7.LJLJLLL
            if (r0 == 0) goto L90
            long r0 = r0.getStartTime()
            java.lang.String r1 = X.C86036Xpg.LJFF(r0)
            android.content.Context r0 = r7.getContext()
            boolean r0 = X.C90193gN.LIZIZ(r0)
            if (r0 == 0) goto L53
            r0 = 8207(0x200f, float:1.15E-41)
            java.lang.String r1 = X.QZZ.LIZIZ(r0, r1)
        L53:
            r2[r4] = r1
            r0 = 2131830014(0x7f1124fe, float:1.9293013E38)
            java.lang.String r0 = r3.getString(r0, r2)
            if (r0 != 0) goto L5f
        L5e:
            r0 = r5
        L5f:
            r7.I3(r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r7.LJLLI
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8d
            X.Lm3 r1 = X.C55096Ljo.LJIIZILJ(r7)
            java.lang.Class<com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility> r0 = com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility.class
            X.2K0 r1 = X.C55096Ljo.LIZ(r1, r0, r6)
            com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility r1 = (com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility) r1
            if (r1 == 0) goto L8d
            java.lang.String r0 = r7.assemTagInternal
            if (r0 != 0) goto L8e
        L81:
            boolean r0 = r1.Wu(r5)
            if (r0 == 0) goto L8d
            long r0 = java.lang.System.currentTimeMillis()
            r7.LJLLI = r0
        L8d:
            return
        L8e:
            r5 = r0
            goto L81
        L90:
            r1 = r6
            goto L53
        L92:
            com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data.LiveEventData r0 = r7.LJLL
            if (r0 == 0) goto L9e
            java.util.List r0 = r0.getLiveEventStructList()
        L9a:
            r1.setLiveEventStructList(r0)
            goto L24
        L9e:
            r0 = r6
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.ProfileAdvancedFeatureLiveEventComponent.updateComponentUIAndData():void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        LiveEventStruct liveEventStruct;
        o.LJIIIZ(jsonObject, "jsonObject");
        LiveEventData liveEventData = (LiveEventData) C75792yF.LIZ(jsonObject.toString(), LiveEventData.class);
        this.LJLL = liveEventData;
        if (liveEventData != null) {
            List<LiveEventStruct> liveEventStructList = liveEventData.getLiveEventStructList();
            this.LJLJLJ = liveEventStructList;
            if (liveEventStructList == null || !Boolean.valueOf(!liveEventStructList.isEmpty()).booleanValue() || (liveEventStruct = (LiveEventStruct) ListProtector.get(liveEventStructList, 0)) == null) {
                return;
            }
            this.LJLJLLL = liveEventStruct;
        }
    }
}
