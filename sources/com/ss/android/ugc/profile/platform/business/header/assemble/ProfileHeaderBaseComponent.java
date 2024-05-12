package com.ss.android.ugc.profile.platform.business.header.assemble;

import X.C212428Vi;
import X.C26175APb;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C9IB;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileHeaderBaseComponent extends HeaderBaseContainerComponent implements IHeaderBaseAbility {
    public LinearLayout LJLLILLLL;
    public final C55749LuL LJLLJ;

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void M3() {
    }

    public ProfileHeaderBaseComponent() {
        new LinkedHashMap();
        this.LJLLJ = new C55749LuL(C47704Ins.LJ(this, C9IB.class, "header"), checkSupervisorPrepared());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void A3() {
        List<? extends ProfileComponents> list;
        ProfileComponents profileComponents;
        C9IB c9ib = (C9IB) this.LJLLJ.getValue();
        if (c9ib != null && (profileComponents = (ProfileComponents) c9ib.LJLIL) != null) {
            list = profileComponents.components;
        } else {
            list = null;
        }
        L3(list);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility
    public final C26175APb Nu() {
        C9IB c9ib = (C9IB) this.LJLLJ.getValue();
        if (c9ib != null) {
            return c9ib.LJLJLJ;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IHeaderBaseAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(view instanceof LinearLayout)) {
            return;
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IHeaderBaseAbility.class, null);
        }
        this.LJLLILLLL = (LinearLayout) view;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility
    public final void LJFF(int i, View view, String str) {
        LinearLayout linearLayout = this.LJLLILLLL;
        if (linearLayout != null) {
            HeaderBaseContainerComponent.I3(this, str, i, view, linearLayout, null, 16);
        } else {
            o.LJIJI("headerView");
            throw null;
        }
    }
}
