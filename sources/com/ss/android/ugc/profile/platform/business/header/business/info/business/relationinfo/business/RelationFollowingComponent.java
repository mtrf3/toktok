package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business;

import X.C214298b3;
import X.C214528bQ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9AC;
import X.C9AE;
import X.C9JP;
import X.C9LN;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.profile.widgets.relations.ProfileRelationVM;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RelationFollowingComponent extends RelationInfoBaseUIComponent<RelationData> {
    public final C214298b3 LJLJJI;
    public boolean LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsBeforeUpdateUI() {
        v3(null);
        Se();
    }

    public RelationFollowingComponent() {
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileRelationVM.class);
        this.LJLJJI = new C214298b3(new AqS154S0100000_4(LIZ, 951), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C9JP.INSTANCE, LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r1 == true) goto L9;
     */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void componentClick() {
        /*
            r5 = this;
            android.view.View r0 = r5.componentView
            boolean r0 = X.C6ZT.LIZ(r0)
            if (r0 == 0) goto L9
            return
        L9:
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r0 = r5.getProfilePlatformVM()
            if (r0 == 0) goto L33
            boolean r1 = r0.LJLJJL
            r0 = 1
            if (r1 != r0) goto L33
        L14:
            java.lang.String r2 = "personal_homepage"
            if (r0 == 0) goto L30
            r4 = r2
        L19:
            X.1qj r3 = X.C212428Vi.LIZ(r5)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L35
            r1 = 0
            java.lang.String r0 = "following_list"
            X.J9P.LIZIZ(r3, r2, r0, r1, r1)
            return
        L30:
            java.lang.String r4 = "others_homepage"
            goto L19
        L33:
            r0 = 0
            goto L14
        L35:
            X.8b3 r0 = r5.LJLJJI
            java.lang.Object r2 = r0.getValue()
            com.bytedance.assem.arch.viewModel.AssemViewModel r2 = (com.bytedance.assem.arch.viewModel.AssemViewModel) r2
            kotlin.jvm.internal.AqS47S1200000_4 r1 = new kotlin.jvm.internal.AqS47S1200000_4
            r0 = 12
            r1.<init>(r5, r3, r4, r0)
            r5.withState(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business.RelationFollowingComponent.componentClick():void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        int i;
        String str;
        String str2;
        Resources resources;
        Describe describe;
        T t;
        Integer followingCount;
        Integer followingCount2;
        C9AE.LIZ(this.componentView, C9AC.ALPHA, 0.0f);
        AssemViewModel assemViewModel = (AssemViewModel) this.LJLJJI.getValue();
        T t2 = this.LJLILLLLZI;
        if (t2 != 0 && (followingCount2 = t2.getFollowingCount()) != null) {
            i = followingCount2.intValue();
        } else {
            i = 0;
        }
        assemViewModel.setState(new C9LN(0, i, 0L));
        T t3 = this.LJLILLLLZI;
        if (t3 != 0) {
            str = t3.getNumber();
        } else {
            str = null;
        }
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        TextView textView = (TextView) view.findViewById(R.id.i9p);
        if (textView != null) {
            T t4 = this.LJLILLLLZI;
            if (t4 == 0 || (describe = t4.getDescribe()) == null || (str2 = describe.getText()) == null) {
                Context context = getContext();
                if (context != null && (resources = context.getResources()) != null) {
                    str2 = resources.getString(R.string.ibq);
                } else {
                    str2 = null;
                }
            }
            textView.setText(str2);
        }
        View view2 = this.componentView;
        o.LJII(view2, "null cannot be cast to non-null type android.widget.LinearLayout");
        TextView textView2 = (TextView) view2.findViewById(R.id.i9q);
        if (textView2 != null) {
            T t5 = this.LJLILLLLZI;
            if ((t5 != 0 && (followingCount = t5.getFollowingCount()) != null && followingCount.intValue() == -1) || (t = this.LJLILLLLZI) == 0 || t.getFollowingCount() == null) {
                str = "-";
            } else if (str == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            textView2.setText(str);
        }
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null && profilePlatformVM.LJLJJL) {
            return;
        }
        View view3 = this.componentView;
        o.LJII(view3, "null cannot be cast to non-null type android.widget.LinearLayout");
        TuxTextView countView = (TuxTextView) view3.findViewById(R.id.i9q);
        View view4 = this.componentView;
        o.LJIIIIZZ(countView, "countView");
        A3(view4, countView);
    }

    public final void Se() {
        if (!UserProfilePreloadHelper.LJIIIIZZ().LIZIZ()) {
            return;
        }
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        TextView textView = (TextView) view.findViewById(R.id.i9q);
        if (textView == null) {
            return;
        }
        textView.setText("-");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        m mVar = profileComponents.bizData;
        if (mVar == null) {
            Se();
        } else {
            parseComponentBizData(mVar);
            updateComponentUIAndData();
        }
    }
}
