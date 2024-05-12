package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business;

import X.C214298b3;
import X.C214528bQ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9AC;
import X.C9AE;
import X.C9KH;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
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
public final class RelationLikeComponent extends RelationInfoBaseUIComponent<RelationData> {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    public RelationLikeComponent() {
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileRelationVM.class);
        new C214298b3(new AqS154S0100000_4(LIZ, 952), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C9KH.INSTANCE, LIZ);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        Resources resources;
        Describe describe;
        T t;
        String str2;
        Long totalFavorite;
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        TextView textView = (TextView) view.findViewById(R.id.i9p);
        if (textView != null) {
            T t2 = this.LJLILLLLZI;
            if (t2 == 0 || (describe = t2.getDescribe()) == null || (str = describe.getText()) == null) {
                Context context = getContext();
                if (context != null && (resources = context.getResources()) != null) {
                    str = resources.getString(R.string.icd);
                } else {
                    str = null;
                }
            }
            textView.setText(str);
        }
        View view2 = this.componentView;
        o.LJII(view2, "null cannot be cast to non-null type android.widget.LinearLayout");
        TextView textView2 = (TextView) view2.findViewById(R.id.i9q);
        if (textView2 != null) {
            T t3 = this.LJLILLLLZI;
            if ((t3 != 0 && (totalFavorite = t3.getTotalFavorite()) != null && totalFavorite.longValue() == -1) || (t = this.LJLILLLLZI) == 0 || t.getTotalFavorite() == null) {
                str2 = "-";
            } else {
                T t4 = this.LJLILLLLZI;
                if (t4 == 0 || (str2 = t4.getNumber()) == null) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
            }
            textView2.setText(str2);
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r0 == null) goto L24;
     */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void componentClick() {
        /*
            r8 = this;
            android.content.Context r0 = r8.getContext()
            if (r0 != 0) goto L7
            return
        L7:
            com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo r0 = r8.getCommonInfo()
            r7 = 0
            if (r0 == 0) goto La2
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r0.getUserProfileInfo()
            if (r0 == 0) goto La2
            java.lang.String r6 = r0.getUsername()
        L18:
            X.4i4 r4 = new X.4i4
            r4.<init>()
            android.content.Context r0 = r8.getContext()
            r5 = 0
            if (r0 == 0) goto L52
            android.content.res.Resources r3 = r0.getResources()
            if (r3 == 0) goto L52
            T extends com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = r8.LJLILLLLZI
            if (r0 == 0) goto La0
            java.lang.Long r0 = r0.getTotalFavorite()
            if (r0 == 0) goto La0
            long r0 = r0.longValue()
            int r2 = (int) r0
        L39:
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r6
            T extends com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData r0 = r8.LJLILLLLZI
            if (r0 == 0) goto L46
            java.lang.String r7 = r0.getNumber()
        L46:
            r0 = 1
            r1[r0] = r7
            r0 = 2131690124(0x7f0f028c, float:1.9009283E38)
            java.lang.String r0 = r3.getQuantityString(r0, r2, r1)
            if (r0 != 0) goto L54
        L52:
            java.lang.String r0 = ""
        L54:
            r4.LIZIZ(r0)
            X.4i3 r4 = r4.LIZ
            android.content.Context r3 = r8.getContext()
            if (r3 == 0) goto L8e
            X.ARb r2 = new X.ARb
            r2.<init>(r3)
            X.1Ss r1 = new X.1Ss
            r1.<init>()
            r0 = 2131233955(0x7f080ca3, float:1.8084062E38)
            r1.LJLIL = r0
            X.V8E r1 = r1.LIZ(r3)
            r2.LIZIZ(r4)
            r0 = 2131848951(0x7f116ef7, float:1.9331422E38)
            r2.LJ(r0)
            X.9LK r0 = X.C9LK.LJLIL
            X.UC0.LIZJ(r2, r0)
            X.Spu r0 = new X.Spu
            r0.<init>(r5, r3, r1)
            r2.LJIIIZ = r0
            X.ARf r0 = r2.LJI()
            r0.LIZLLL()
        L8e:
            com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r0 = "click_like_count"
            r1.setEventName(r0)
            java.lang.String r0 = "others_homepage"
            r1.setLabelName(r0)
            X.FMX.onEvent(r1)
            return
        La0:
            r2 = 0
            goto L39
        La2:
            r6 = r7
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business.RelationLikeComponent.componentClick():void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        C9AE.LIZ(this.componentView, C9AC.ALPHA, 0.0f);
        m mVar = profileComponents.bizData;
        if (mVar == null) {
            Se();
        } else {
            parseComponentBizData(mVar);
            updateComponentUIAndData();
        }
    }
}
