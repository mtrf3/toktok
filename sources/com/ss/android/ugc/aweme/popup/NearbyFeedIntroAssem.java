package com.ss.android.ugc.aweme.popup;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C2K0;
import X.C47704Ins;
import X.C54081LKj;
import X.C54082LKk;
import X.C54917Lgv;
import X.C55096Ljo;
import X.C55749LuL;
import X.FMX;
import X.InterfaceC55102Lju;
import X.InterfaceC56322M8o;
import X.L8O;
import X.LJ6;
import X.LJE;
import X.LTU;
import X.LZV;
import X.X1D;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.panel.NearbyFeedFragmentPanel;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyFeedIntroAssem extends UIContentAssem implements InterfaceC56322M8o, INearbyPopupAssemAbility, InterfaceC55102Lju {
    public final C55749LuL LJLIL;
    public NearbyFeedFragmentPanel LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -2087593781) {
            return null;
        }
        return this;
    }

    public NearbyFeedIntroAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, LZV.class, "NearbyFeedContentHierarchyData"), checkSupervisorPrepared());
        this.LJLJI = "nearby";
    }

    @Override // com.ss.android.ugc.aweme.popup.INearbyPopupAssemAbility
    public final void LLLLJ() {
        boolean z;
        long j;
        FragmentManager supportFragmentManager;
        if (LTU.LIZ) {
            return;
        }
        Boolean bool = NearbyTabConfig.LIZIZ().showIntroOnce;
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (z && LJE.LIZLLL()) {
            LJ6.LIZ.storeLong(LJ6.LIZJ("just_once_nearby_intro_show_time"), System.currentTimeMillis());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("canShowNearbyIntro()->true, showIntroOnce: ");
            Boolean bool2 = NearbyTabConfig.LIZIZ().showIntroOnce;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            }
            LIZ.append(z2);
            LIZ.append("; justShowOnceHasNotConsume(): ");
            LIZ.append(LJE.LIZLLL());
            L8O.LIZ(X1D.LIZIZ(LIZ));
        } else {
            Integer num = NearbyTabConfig.LIZIZ().introPopupFreq;
            int i = 365;
            if (num != null && num.intValue() < 0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - LJ6.LIZ.getLong(LJ6.LIZJ("nearby_intro_show_time"), 0L);
            Integer num2 = NearbyTabConfig.LIZIZ().introPopupFreq;
            if (num2 != null && num2.intValue() == 0) {
                j = 31536000000L;
            } else {
                Integer num3 = NearbyTabConfig.LIZIZ().introPopupFreq;
                if (num3 != null) {
                    i = num3.intValue();
                }
                j = i * 24 * 60 * 60 * 1000;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("canShowNearbyIntro: timeGap: ");
            LIZ2.append(currentTimeMillis / 86400000);
            LIZ2.append(", timeLimit: ");
            LIZ2.append(j / 86400000);
            L8O.LIZ(X1D.LIZIZ(LIZ2));
            if (currentTimeMillis <= j) {
                return;
            }
        }
        LJ6.LIZ.storeLong(LJ6.LIZJ("nearby_intro_show_time"), System.currentTimeMillis());
        FMX.onEventV3("watch_content_nearby_popup_show");
        ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
        if (LIZ3 != null && (supportFragmentManager = LIZ3.getSupportFragmentManager()) != null) {
            PopupManager.LJIIL(new C54917Lgv(this, supportFragmentManager, this.LJLILLLLZI));
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context context = getContext();
        if (context != null) {
            return C54081LKj.LIZ(context, this);
        }
        return null;
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null || (lifecycle = LIZLLL.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return false;
        }
        return true;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LJLJI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI = ((LZV) this.LJLIL.getValue()).LJLIL;
    }
}
