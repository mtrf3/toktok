package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.container;

import X.AnonymousClass391;
import X.C1FJ;
import X.C212428Vi;
import X.C232459Aj;
import X.C26338AVi;
import X.C55096Ljo;
import X.C55230Lly;
import X.C77266UUc;
import X.C79045V0n;
import X.C7MY;
import Y.AObserverS72S0100000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.assemble.base.IHeaderInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.IHeaderRelationInfoAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileHeaderRelationBaseComponent extends HeaderBaseContainerComponent implements IHeaderRelationInfoAbility {
    public ProfileHeaderRelationBaseComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void K3() {
        IHeaderInfoAbility iHeaderInfoAbility;
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null && (iHeaderInfoAbility = (IHeaderInfoAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderInfoAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderInfoAbility.LJFF(this.LJLJJLL, viewGroup, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void M3() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.LJLJLLL = linearLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "context");
        C26338AVi.LJFF(layoutParams, context, C1FJ.LIZIZ(16), C1FJ.LIZIZ(16), C1FJ.LIZIZ(16), AnonymousClass391.LIZJ(0), true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setClipChildren(false);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void A3() {
        List<? extends ProfileComponents> list;
        ProfileComponents profileComponents;
        C232459Aj N3 = N3();
        if (N3 != null && (profileComponents = N3.LJLILLLLZI) != null) {
            list = profileComponents.components;
        } else {
            list = null;
        }
        L3(list);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IHeaderRelationInfoAbility.class, null);
        }
        C77266UUc.LIZIZ.getRelationService().LJFF().observe(this, new AObserverS72S0100000_4(this, 17));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.IHeaderRelationInfoAbility
    public final void LJFF(int i, View view, String str) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AnonymousClass391.LIZ(0.5d), C7MY.LIZIZ(16));
        layoutParams.gravity = 16;
        View view2 = new View(getContext());
        view2.setLayoutParams(layoutParams);
        Context context = view2.getContext();
        o.LJIIIIZZ(context, "context");
        view2.setBackground(C79045V0n.LJIIIIZZ(R.attr.dz, context));
        view2.setLayoutParams(layoutParams);
        HeaderBaseContainerComponent.I3(this, str, i, view, null, view2, 8);
    }
}
