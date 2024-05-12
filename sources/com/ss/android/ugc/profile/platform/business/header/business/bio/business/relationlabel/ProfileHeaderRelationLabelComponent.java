package com.ss.android.ugc.profile.platform.business.header.business.bio.business.relationlabel;

import X.AnonymousClass391;
import X.C110614Vt;
import X.C1FJ;
import X.C212428Vi;
import X.C221108m2;
import X.C237429Tm;
import X.C246039l9;
import X.C26338AVi;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C58049MqL;
import X.C61328O5c;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C99W;
import X.O6R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioRelationLabelData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileHeaderRelationLabelComponent extends BioBaseUIComponent implements IUserProfilePlatformRelationLabelAbility {
    public TuxIconView LJLJJLL;
    public C58049MqL LJLJL;
    public LinearLayout LJLJLJ;
    public int LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public BioRelationLabelData LJLLJ;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 939));
    public final C73318Sq2 LJLJJL = new C73318Sq2();
    public final List<Object> LJLJLLL = new ArrayList();
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(C246039l9.LJLIL);
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 940));

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.MqL] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.View, X.MqL] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.bytedance.tux.input.TuxTextView, android.widget.TextView, android.view.View, X.MqL] */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        AttributeSet attributeSet;
        int i;
        int i2;
        ?? r4;
        ?? r42;
        Context context = getContext();
        TuxIconView tuxIconView = null;
        if (context != null) {
            TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            tuxIconView2.setLayoutParams(layoutParams);
            i2 = -2;
            i = 8;
            attributeSet = null;
            C26338AVi.LJI(tuxIconView2, 0, 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 0, false, 16);
            tuxIconView2.setVisibility(8);
            tuxIconView2.setId(R.id.iuk);
            tuxIconView = tuxIconView2;
        } else {
            attributeSet = null;
            i = 8;
            i2 = -2;
        }
        this.LJLJJLL = tuxIconView;
        Context context2 = getContext();
        if (context2 != null) {
            r4 = new C58049MqL(context2, attributeSet, 6);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
            layoutParams2.gravity = 16;
            r4.setLayoutParams(layoutParams2);
            r4.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(217)));
            r4.setMaxLines(2);
            r4.setTuxFont(61);
            r4.setVisibility(i);
            r4.setId(R.id.iul);
        } else {
            r4 = attributeSet;
        }
        this.LJLJL = r4;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, i2));
        linearLayout.setOrientation(0);
        C26338AVi.LJI(linearLayout, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40))), C1FJ.LIZIZ(16), AnonymousClass391.LIZJ(40), C1FJ.LIZIZ(16), false, 16);
        linearLayout.setVisibility(i);
        linearLayout.setGravity(1);
        linearLayout.setId(R.id.iuj);
        this.LJLJLJ = linearLayout;
        linearLayout.addView(this.LJLJJLL);
        LinearLayout linearLayout2 = this.LJLJLJ;
        if (linearLayout2 != null) {
            linearLayout2.addView(this.LJLJL);
        }
        if (C99W.LIZ && (r42 = this.LJLJL) != 0) {
            Context context3 = getContext();
            ?? r1 = attributeSet;
            if (context3 != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(4);
                r1 = c110614Vt.LIZ(context3);
            }
            r42.setBackground(r1);
        }
        return this.LJLJLJ;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsBeforeUpdateUI() {
        super.actionsBeforeUpdateUI();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IUserProfilePlatformRelationLabelAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ((ArrayList) this.LJLJLLL).clear();
        this.LJLL = 0;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IUserProfilePlatformRelationLabelAbility.class, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateComponentUIAndData() {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.bio.business.relationlabel.ProfileHeaderRelationLabelComponent.updateComponentUIAndData():void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        super.parseComponentBizData(jsonObject);
        this.LJLLJ = (BioRelationLabelData) C237429Tm.LIZ(jsonObject.toString(), BioRelationLabelData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        String str;
        LinearLayout linearLayout;
        o.LJIIIZ(profileComponents, "profileComponents");
        super.updateDataWhenUserUpdate(profileComponents);
        m mVar = profileComponents.bizData;
        if (mVar != null) {
            parseComponentBizData(mVar);
        }
        updateComponentUIAndData();
        User user = (User) this.LJLLLL.getValue();
        String str2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        this.LJLLILLLL = str;
        String str3 = this.LJLLI;
        User user2 = (User) this.LJLLLL.getValue();
        if (user2 != null) {
            str2 = user2.getUid();
        }
        if (o.LJ(str3, str2) || (linearLayout = this.LJLJLJ) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public final void v3(View view) {
        IHeaderBioAbility iHeaderBioAbility;
        if (view != null && (iHeaderBioAbility = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderBioAbility.LJFF(this.index, view, str);
        }
    }
}
