package com.ss.android.ugc.profile.platform.business.header.business.avatar.business;

import X.C16880lQ;
import X.C212428Vi;
import X.C55096Ljo;
import X.C8VV;
import X.C8W0;
import X.C9A9;
import X.InterfaceC55235Lm3;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.avatar.base.IHeaderAvatarAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HeaderAvatarMyComponent extends BaseUIComponent {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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
    public final void componentClick() {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void addComponentToParent() {
        IHeaderAvatarAbility iHeaderAvatarAbility;
        View view = this.componentView;
        if (view != null && (iHeaderAvatarAbility = (IHeaderAvatarAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAvatarAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderAvatarAbility.LJFF(this.index, view, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        return C16880lQ.LLLZIIL(R.layout.c3k, C16880lQ.LLZIL(getContext()), null);
    }

    public final void v3() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC55235Lm3 interfaceC55235Lm3 = (C8W0) it.next();
                if (interfaceC55235Lm3 instanceof C9A9) {
                    ((C9A9) interfaceC55235Lm3).LJIILLIIL();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        v3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VV.LIZJ(this, new AqS135S0200000_4(this, view, 111));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        v3();
    }
}
