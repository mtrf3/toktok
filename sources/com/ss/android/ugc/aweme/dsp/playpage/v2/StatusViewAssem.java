package com.ss.android.ugc.aweme.dsp.playpage.v2;

import X.C2K0;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C91444Zui;
import X.InterfaceC55102Lju;
import X.X1D;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class StatusViewAssem extends UIContentAssem implements IStatusViewAbility, InterfaceC55102Lju {
    public final C55749LuL LJLIL;

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1935783682) {
            return null;
        }
        return this;
    }

    public StatusViewAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C91444Zui.class, "AudioPlayerHierarchyData"), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IStatusViewAbility
    public final boolean isVisible() {
        if (getContainerView().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IStatusViewAbility
    public final void h3(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hideStatusView flag is ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        ((C91444Zui) this.LJLIL.getValue()).LJLIL.h3(i);
    }
}
