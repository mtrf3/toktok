package com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base;

import X.AFB;
import X.AnonymousClass391;
import X.C110614Vt;
import X.C17J;
import X.C212428Vi;
import X.C255199zv;
import X.C26338AVi;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C55230Lly;
import X.C61328O5c;
import X.C66415Q4t;
import X.C99W;
import X.C9IL;
import X.HG3;
import X.RBX;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ProfileHeaderBaseSignatureComponent extends BioBaseUIComponent implements ISignatureAbility {
    public ProfileViewModel LJLJJI;
    public TuxTextView LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View _$_findCachedViewById(int i) {
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

    public final void A3() {
        TuxTextView tuxTextView;
        Drawable drawable;
        if (!C99W.LIZ || (tuxTextView = this.LJLJJL) == null) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(4);
            drawable = c110614Vt.LIZ(context);
        } else {
            drawable = null;
        }
        tuxTextView.setBackground(drawable);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Context context = getContext();
        if (context != null) {
            C26338AVi.LJII(layoutParams, context, AnonymousClass391.LIZJ(40), AnonymousClass391.LIZJ(8), AnonymousClass391.LIZJ(40), 0, 32);
        }
        Context context2 = getContext();
        TuxTextView tuxTextView = null;
        if (context2 != null) {
            tuxTextView = new TuxTextView(context2, null, 6, 0);
        }
        this.LJLJJL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setLayoutParams(layoutParams);
            tuxTextView.setGravity(17);
            tuxTextView.setMaxLines(5);
        }
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void actionsAfterUpdateUI() {
        super.actionsAfterUpdateUI();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, ISignatureAbility.class, null);
        }
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            this.LJLJJI = AFB.LIZ(LIZLLL2);
        }
        ProfilePlatformViewModel x3 = x3();
        if (x3 != null) {
            x3.ov0(new AqS170S0100000_4(this, 835));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        if (L7()) {
            HG3.LJIILL().getCurUser().setSignature(null);
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), ISignatureAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        Describe describe;
        super.updateComponentUIAndData();
        BizBaseData bizBaseData = this.LJLIL;
        if (bizBaseData != null && (describe = bizBaseData.getDescribe()) != null) {
            str = describe.getText();
        } else {
            str = null;
        }
        W8(0, str);
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

    public void W8(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView = this.LJLJJL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
        } else {
            TuxTextView tuxTextView2 = this.LJLJJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
        }
        ProfileViewModel profileViewModel = this.LJLJJI;
        if (profileViewModel != null) {
            profileViewModel.Hv0(C255199zv.LJIILL());
        }
        if (L7()) {
            ((RBX) HG3.LJIILL()).getCurUser().setSignature(str);
        }
        C66415Q4t.LIZIZ(this.LJLJJL, str);
        boolean L7 = L7();
        C9IL c9il = C9IL.BIO;
        String lowerCase = "HAS_BIO_SIGNATURE".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, L7, c9il, lowerCase, C44384HbQ.LLFF(this.LJLJJL));
    }
}
