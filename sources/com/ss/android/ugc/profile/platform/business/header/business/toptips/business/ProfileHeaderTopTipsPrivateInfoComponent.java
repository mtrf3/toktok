package com.ss.android.ugc.profile.platform.business.header.business.toptips.business;

import X.AnonymousClass391;
import X.C110614Vt;
import X.C119244m8;
import X.C16880lQ;
import X.C2068389v;
import X.C26338AVi;
import X.C32151Nz;
import X.C7MY;
import X.HG3;
import X.O6R;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.toptips.base.ProfileHeaderTopTipsBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ProfileHeaderTopTipsPrivateInfoComponent extends ProfileHeaderTopTipsBaseUIComponent {
    public View LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
    public final View generateComponentView() {
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cv);
            frameLayout.setBackground(c110614Vt.LIZ(context));
            C119244m8 c119244m8 = new C119244m8(context, null, 6);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            c119244m8.setLayoutParams(layoutParams);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_3pt_private_account;
            c2068389v.LJ = Integer.valueOf(R.attr.gv);
            c2068389v.LIZJ = C7MY.LIZIZ(16);
            c2068389v.LIZIZ = C7MY.LIZIZ(16);
            C26338AVi.LJIIIZ(c119244m8, AnonymousClass391.LIZJ(0), AnonymousClass391.LIZJ(0), AnonymousClass391.LIZJ(4), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), 16);
            c119244m8.setStartIcon(c2068389v);
            c119244m8.setGravity(17);
            C26338AVi.LJIIIZ(c119244m8, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(9))), AnonymousClass391.LIZJ(9), AnonymousClass391.LIZJ(9), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(9))), 16);
            c119244m8.setText(context.getText(R.string.h1a));
            c119244m8.setTextColorRes(R.attr.gu);
            c119244m8.setTuxFont(41);
            frameLayout.addView(c119244m8);
            frameLayout.setTag(this.assemTagInternal);
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS21S0100000_1(this, 125));
            this.LJLIL = frameLayout;
        }
        return this.LJLIL;
    }

    @Override // X.C8W0
    public final void onResume() {
        int i;
        super.onResume();
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        if (HG3.LJIILL().getCurUser().isAccuratePrivateAccount()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        int i;
        o.LJIIIZ(profileComponents, "profileComponents");
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        if (HG3.LJIILL().getCurUser().isAccuratePrivateAccount()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }
}
